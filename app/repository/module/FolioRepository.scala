package repository.module


import java.sql.Date
import java.util

import com.google.inject.Inject
import constants.{CategoryConstants, MapperConstants, ModeOfHoldingConstants, SchemePlan}
import models.enumerations.{AssetClassEnum, OrderStateEnum}
import models.integration.enumerations.BuySellEnum
import models._
import play.api.db.slick.{DatabaseConfigProvider, HasDatabaseConfigProvider}
import repository.tables.{FcdsdRepo, FcomtRepo, FcsotRepo}
import slick.jdbc.JdbcProfile
import slick.jdbc.{GetResult, PositionedParameters, SQLActionBuilder, SetParameter}
import utils.DateTimeUtils
import data.model.Tables.{Fcdam, Fcdsa, Fcdsd, Fcfhs, Fcfomt, Fcuft, FcdsdRow}
import models.integration.enumerations.BuySellEnum.BuySellEnum
import org.slf4j.LoggerFactory

import scala.collection.mutable.{HashMap, ListBuffer}
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future

/**
  * Created by fincash on 25-01-2017.
  */
class FolioRepository @Inject()(protected val dbConfigProvider: DatabaseConfigProvider, fcdsdRepo: FcdsdRepo,
                                fcomtRepo: FcomtRepo, fcsotRepo: FcsotRepo)
  extends HasDatabaseConfigProvider[JdbcProfile] with CategoryConstants with MapperConstants {

  val logger, log = LoggerFactory.getLogger(classOf[FolioRepository])

  import profile.api._
  import SlickKit._

  def getAMCFolioNo(userPk: Long, amctrfnum: Long): Future[Option[String]] = {

    val query = sql"""SELECT
    FOMTFOLIONO
FROM
    FCFOMT
WHERE
    FOMTAMCTRFNUM = ${amctrfnum}
        AND FOMTRFNUM IN (SELECT
            UFTFOMTRFNUM
        FROM
            FCUFT
        WHERE
            UFTUBDRFNUM = ${userPk})""".as[String]

    db.run(query).map(values => {
      if (values.isEmpty) {
        None
      } else {
        Some(values.head)
      }
    })
  }

  def getFundDetails(userPk: Long): Future[ListBuffer[FundDetails]] = {

    val liquidId = LIQUID_ID
    val elssId = ELSS_ID
    val query =
      sql"""SELECT
                                    fundFolioCategoryDetail.FHSSOPTRFNUM,
                                   fundFolioCategoryDetail.FOMTFOLIONO,
                                    fundFolioCategoryDetail.SOPTLEGALNAME,
                                   fundFolioCategoryDetail.SOPTSCHEMEPLAN,
                                    fundFolioCategoryDetail.FOMTAMCNAME,
                                    ctmtPr.catName,
                                    ctmtPr.parentId,
                                    fundFolioCategoryDetail.FHSDESCRIPTION,
                                    fundFolioCategoryDetail.FHSDATE,
                                    fundFolioCategoryDetail.FHSTYPE,
                                    fundFolioCategoryDetail.FHSUNITS,
                                    fundFolioCategoryDetail.FHSNAV,
                                    fundFolioCategoryDetail.FHSAMOUNT,
                                    fundFolioCategoryDetail.FOMTRFNUM,
                                    fundFolioCategoryDetail.FOMTMODEOFHOLDING
                                FROM
                                    (SELECT
                                        smt.SMTCTMTRFNUM,
                                            folioFundDetails.SOPTLEGALNAME,
                                            folioFundDetails.SOPTSCHEMEPLAN,
                                            folioFundDetails.FHSTYPE,
                                            folioFundDetails.FHSDESCRIPTION,
                                            folioFundDetails.FHSDATE,
                                            folioFundDetails.FHSSOPTRFNUM,
                                            folioFundDetails.FHSUNITS,
                                            folioFundDetails.FHSAMOUNT,
                                            folioFundDetails.FHSNAV,
                                            folioFundDetails.FOMTAMCNAME,
                                            folioFundDetails.FOMTFOLIONO,
                                            folioFundDetails.FOMTRFNUM,
                                            folioFundDetails.FOMTMODEOFHOLDING
                                    FROM
                                        FCSMT smt, (SELECT
                                        sopt.SOPTLEGALNAME,
                                        sopt.SOPTSCHEMEPLAN,
                                            sopt.SOPTSMTRFNUM,
                                            folioDetails.FHSTYPE,
                                            folioDetails.FHSDESCRIPTION,
                                            folioDetails.FHSDATE,
                                            folioDetails.FHSSOPTRFNUM,
                                            folioDetails.FHSUNITS,
                                            folioDetails.FHSAMOUNT,
                                            folioDetails.FHSNAV,
                                            folioDetails.FOMTAMCNAME,
                                            folioDetails.FOMTFOLIONO,
                                            folioDetails.FOMTRFNUM,
                                            folioDetails.FOMTMODEOFHOLDING
                                    FROM
                                        FCSOPT sopt, (SELECT
                                        fhs.FHSTYPE,
                                            fhs.FHSDESCRIPTION,
                                            fhs.FHSDATE,
                                            fhs.FHSSOPTRFNUM,
                                            fhs.FHSUNITS,
                                            fhs.FHSAMOUNT,
                                            fhs.FHSNAV,
                                            fomtResult.FOMTAMCNAME,
                                            fomtResult.FOMTFOLIONO,
                                           fomtResult.FOMTRFNUM,
                                           fomtResult.FOMTMODEOFHOLDING
                                    FROM
                                        FCFHS fhs, (SELECT
                                        fomt.FOMTFOLIONO, fomt.FOMTRFNUM, fomt.FOMTAMCNAME,
                                        fomt.FOMTMODEOFHOLDING
                            FROM
                                FCFOMT fomt
                            WHERE
                                fomt.FOMTRFNUM IN (SELECT
                                        UFTFOMTRFNUM
                                    FROM
                                        FCUFT
                                    WHERE
                                        UFTUBDRFNUM = ${userPk})) fomtResult
                            WHERE
                                fhs.FHSFOMTRFNUM = fomtResult.FOMTRFNUM
                            ORDER BY fhs.FHSSOPTRFNUM , fhs.FHSDATE) folioDetails
                            WHERE
                                sopt.SOPTRFNUM = folioDetails.FHSSOPTRFNUM) folioFundDetails
                            WHERE
                                smt.SMTRFNUM = folioFundDetails.SOPTSMTRFNUM) fundFolioCategoryDetail,
                            (SELECT
                                ch.CTMTRFNUM AS childId,
                                    pr.CTMTRFNUM AS parentId,
                                    CASE
                                        WHEN ch.CTMTRFNUM = ${liquidId}|| ch.CTMTRFNUM = ${elssId} THEN ch.CTMTNAME
                                        ELSE pr.CTMTNAME
                                    END AS catName
                            FROM
                                FCCTMT pr, FCCTMT ch
                            WHERE
                                pr.CTMTRFNUM = ch.CTMTCTMTRFNUM) ctmtPr
                        WHERE
                            ctmtPr.childId = fundFolioCategoryDetail.SMTCTMTRFNUM"""

    getFundDetailsResult(query)
  }

  def getPortfolioDetails(userPk: Long): Future[ListBuffer[FundDetails]] = {

    val equityId = EQUITY_ID
    val debtId = DEBT_HYBRID
    val liquidId = LIQUID_ID
    val elssId = ELSS_ID
    val debtHybridId = DEBT_HYBRID
    val equityHybridId = EQUITY_HYBRID
    val query =
      sql"""SELECT
                            fundFolioCategoryDetail.FHSSOPTRFNUM,
                             fundFolioCategoryDetail.FOMTFOLIONO,
                            fundFolioCategoryDetail.SOPTLEGALNAME,
                             fundFolioCategoryDetail.SOPTSCHEMEPLAN,
                            fundFolioCategoryDetail.FOMTAMCNAME,
                            ctmtPr.catName,
                            ctmtPr.parentId,
                            fundFolioCategoryDetail.FHSDESCRIPTION,
                            fundFolioCategoryDetail.FHSDATE,
                            fundFolioCategoryDetail.FHSTYPE,
                            fundFolioCategoryDetail.FHSUNITS,
                            fundFolioCategoryDetail.FHSNAV,
                            fundFolioCategoryDetail.FHSAMOUNT,
                            fundFolioCategoryDetail.FOMTRFNUM,
                            fundFolioCategoryDetail.FOMTMODEOFHOLDING
                            FROM
                              (SELECT
                                smt.SMTCTMTRFNUM,
                                  folioFundDetails.SOPTLEGALNAME,
                                  folioFundDetails.SOPTSCHEMEPLAN,
                                  folioFundDetails.FHSTYPE,
                                  folioFundDetails.FHSDESCRIPTION,
                                  folioFundDetails.FHSDATE,
                                  folioFundDetails.FHSSOPTRFNUM,
                                  folioFundDetails.FHSUNITS,
                                  folioFundDetails.FHSAMOUNT,
                                  folioFundDetails.FHSNAV,
                                  folioFundDetails.FOMTAMCNAME,
                                  folioFundDetails.FOMTFOLIONO,
                                  folioFundDetails.FOMTRFNUM,
                                  folioFundDetails.FOMTMODEOFHOLDING
                              FROM
                                FCSMT smt, (SELECT
                                sopt.SOPTLEGALNAME,
                                sopt.SOPTSCHEMEPLAN,
                                  sopt.SOPTSMTRFNUM,
                                  folioDetails.FHSTYPE,
                                  folioDetails.FHSDESCRIPTION,
                                  folioDetails.FHSDATE,
                                  folioDetails.FHSSOPTRFNUM,
                                  folioDetails.FHSUNITS,
                                  folioDetails.FHSAMOUNT,
                                  folioDetails.FHSNAV,
                                  folioDetails.FOMTAMCNAME,
                                  folioDetails.FOMTFOLIONO,
                                  folioDetails.FOMTRFNUM,
                                  folioDetails.FOMTMODEOFHOLDING
                              FROM
                                FCSOPT sopt, (SELECT
                                fhs.FHSTYPE,
                                  fhs.FHSDESCRIPTION,
                                  fhs.FHSDATE,
                                  fhs.FHSSOPTRFNUM,
                                  fhs.FHSUNITS,
                                  fhs.FHSAMOUNT,
                                  fhs.FHSNAV,
                                  fomtResult.FOMTAMCNAME,
                                  fomtResult.FOMTFOLIONO,
                                   fomtResult.FOMTRFNUM,
                                   fomtResult.FOMTMODEOFHOLDING
                              FROM
                                FCFHS fhs, (SELECT
                                fomt.FOMTFOLIONO, fomt.FOMTRFNUM, fomt.FOMTAMCNAME,
                                fomt.FOMTMODEOFHOLDING
                          FROM
                            FCFOMT fomt
                          WHERE
                            fomt.FOMTRFNUM IN (SELECT
                                UFTFOMTRFNUM
                              FROM
                                FCUFT
                              WHERE
                                UFTUBDRFNUM = ${userPk})) fomtResult
                          WHERE
                            fhs.FHSFOMTRFNUM = fomtResult.FOMTRFNUM
                          ORDER BY fhs.FHSSOPTRFNUM , fhs.FHSDATE) folioDetails
                          WHERE
                            sopt.SOPTRFNUM = folioDetails.FHSSOPTRFNUM) folioFundDetails
                          WHERE
                            smt.SMTRFNUM = folioFundDetails.SOPTSMTRFNUM) fundFolioCategoryDetail,
                          (SELECT
                            ch.CTMTRFNUM AS childId,
                              CASE
                          WHEN ch.CTMTRFNUM = ${debtHybridId} THEN ${debtId}
                          WHEN ch.CTMTRFNUM = ${equityHybridId} THEN ${equityId}
                          ELSE pr.CTMTRFNUM
                          END AS parentId,
                              CASE
                              WHEN ch.CTMTRFNUM = ${debtHybridId} THEN 'Debt'
                              WHEN ch.CTMTRFNUM = ${equityHybridId} THEN 'Equity'
                                WHEN ch.CTMTRFNUM = ${liquidId}|| ch.CTMTRFNUM = ${elssId} THEN ch.CTMTNAME
                                ELSE pr.CTMTNAME
                              END AS catName
                          FROM
                            FCCTMT pr, FCCTMT ch
                          WHERE
                            pr.CTMTRFNUM = ch.CTMTCTMTRFNUM) ctmtPr
                          WHERE
                          ctmtPr.childId = fundFolioCategoryDetail.SMTCTMTRFNUM"""

    getFundDetailsResult(query)
  }

  def getNetUnitsBeforeDate(fundId: Long, folioId: Long, date: java.util.Date): Future[BigDecimal] = {

    val transactionList: ListBuffer[(BuySellEnum, BigDecimal)] = ListBuffer[(BuySellEnum, BigDecimal)]()
    val transactionDate = DateTimeUtils.convertDateToYYYYMMDD(date)
    val query = sql"""SELECT
                        fhs.FHSTYPE, fhs.FHSUNITS
                    FROM
                        FCFHS fhs
                    WHERE
                        fhs.FHSSOPTRFNUM = ${fundId}
                            AND FHSFOMTRFNUM = ${folioId}
                            AND DATE(fhs.FHSDATE) < DATE(${transactionDate})""".as[(String, BigDecimal)]

    db.run(query).map { values =>
      var netUnits = BigDecimal(0.0)
      values.foreach { value =>
        transactionList.+=((BuySellEnum.withName(value._1), value._2))

        if (BuySellEnum.P == BuySellEnum.withName(value._1)) {
          netUnits += value._2
        } else {
          netUnits += value._2
        }
      }
      netUnits
    }
  }

  def getFundCurrNAV(fundDetailList: ListBuffer[FundDetails]): Future[ListBuffer[FundDetails]] = {

    var fundIdList: List[Long] = List[Long]()
    for (fund <- fundDetailList) {
      fundIdList = fund.fundId :: fundIdList
    }
    val query = for {
      damObj <- Fcdam.filter(_.damname === MSTAR_DATASOURCE).result
      dsarfnumList <- Fcdsa.filter(x => x.dsadamrfnum === damObj.head.id && (x.dsasoptrfnum inSetBind (fundIdList))).sortBy(_.dsasoptrfnum).map(_.id).result
      dsdObj <- Fcdsd.filter(x => (x.dsddsarfnum inSetBind (dsarfnumList))).sortBy(_.dsddsarfnum).map(x => (x.dsdnav, x.dsdnavasofdate)).result
    } yield (dsdObj)

    db.run(query).map { values =>
      values.zipWithIndex.foreach { value =>
        val index = value._2
        val fund: FundDetails = fundDetailList(index)
        fundDetailList(index) = fund.copy(currNav = BigDecimal(value._1._1.toDouble), navDate = value._1._2)
      }

      fundDetailList
    }
  }

  def getCurrNavByFundId(fundId: Long): Future[Double] = {
    val query = for {
    //dsarow <- Fcdsa.filter(x => x.dsasoptrfnum === fundId && x.dsadamrfnum === MSTAR_DATASOURCE_ID).result
      dsdrow <- Fcdsd.filter(x => x.dsddsarfnum in Fcdsa.filter(x => x.dsasoptrfnum === fundId && x.dsadamrfnum === MSTAR_DATASOURCE_ID).map(_.id)).result
    } yield (dsdrow)
    db.run(query.transactionally).map(value => {
      if (value.nonEmpty) {
        value.head.dsdnav.toDouble
      }
      else {
        0.0
      }
    }).recover {
      case ex: Exception =>
        logger.error(ex.getMessage + "Can't get current NAV")
        throw ex
    }
  }

  def getTransactionFundDetails(userPk: Long, transactionFilter: TransactionFilter): Future[ListBuffer[FundDetails]] = {
    val fundId = transactionFilter.fundId
    val transactionType = transactionFilter.transType
    val liquidId = LIQUID_ID
    val elssId = ELSS_ID

    var sqlQuery =
      sql"""SELECT
                           fundFolioCategoryDetail.FHSSOPTRFNUM,
                          fundFolioCategoryDetail.FOMTFOLIONO,
                           fundFolioCategoryDetail.SOPTLEGALNAME,
                          fundFolioCategoryDetail.SOPTSCHEMEPLAN,
                           fundFolioCategoryDetail.FOMTAMCNAME,
                           ctmtPr.catName,
                           ctmtPr.parentId,
                           fundFolioCategoryDetail.FHSDESCRIPTION,
                           fundFolioCategoryDetail.FHSDATE,
                           fundFolioCategoryDetail.FHSTYPE,
                           fundFolioCategoryDetail.FHSUNITS,
                           fundFolioCategoryDetail.FHSNAV,
                           fundFolioCategoryDetail.FHSAMOUNT,
                           fundFolioCategoryDetail.FOMTRFNUM,
                           fundFolioCategoryDetail.FOMTMODEOFHOLDING
                       FROM
                           (SELECT
                               smt.SMTCTMTRFNUM,
                                   folioFundDetails.SOPTLEGALNAME,
                                   folioFundDetails.SOPTSCHEMEPLAN,
                                   folioFundDetails.FHSTYPE,
                                   folioFundDetails.FHSDESCRIPTION,
                                   folioFundDetails.FHSDATE,
                                   folioFundDetails.FHSSOPTRFNUM,
                                   folioFundDetails.FHSUNITS,
                                   folioFundDetails.FHSAMOUNT,
                                   folioFundDetails.FHSNAV,
                                   folioFundDetails.FOMTAMCNAME,
                                   folioFundDetails.FOMTFOLIONO,
                                   folioFundDetails.FOMTRFNUM,
                                   folioFundDetails.FOMTMODEOFHOLDING
                           FROM
                               FCSMT smt, (SELECT
                               sopt.SOPTLEGALNAME,
                               sopt.SOPTSCHEMEPLAN,
                                   sopt.SOPTSMTRFNUM,
                                   folioDetails.FHSTYPE,
                                   folioDetails.FHSDESCRIPTION,
                                   folioDetails.FHSDATE,
                                   folioDetails.FHSSOPTRFNUM,
                                   folioDetails.FHSUNITS,
                                   folioDetails.FHSAMOUNT,
                                   folioDetails.FHSNAV,
                                   folioDetails.FOMTAMCNAME,
                                   folioDetails.FOMTFOLIONO,
                                   folioDetails.FOMTRFNUM,
                                   folioDetails.FOMTMODEOFHOLDING
                           FROM
                               FCSOPT sopt, (SELECT
                               fhs.FHSTYPE,
                                   fhs.FHSDESCRIPTION,
                                   fhs.FHSDATE,
                                   fhs.FHSSOPTRFNUM,
                                   fhs.FHSUNITS,
                                   fhs.FHSAMOUNT,
                                   fhs.FHSNAV,
                                   fomtResult.FOMTAMCNAME,
                                   fomtResult.FOMTFOLIONO,
                                  fomtResult.FOMTRFNUM,
                                  fomtResult.FOMTMODEOFHOLDING
                           FROM
                               FCFHS fhs, (SELECT
                               fomt.FOMTFOLIONO, fomt.FOMTRFNUM, fomt.FOMTAMCNAME,
                               fomt.FOMTMODEOFHOLDING
                  FROM
                      FCFOMT fomt
                  WHERE
                      fomt.FOMTRFNUM IN (SELECT
                              UFTFOMTRFNUM
                          FROM
                              FCUFT
                          WHERE
                              UFTUBDRFNUM = ${userPk})) fomtResult
                  WHERE
                      fhs.FHSFOMTRFNUM = fomtResult.FOMTRFNUM """

    if (!transactionFilter.startDate.isEmpty && !transactionFilter.endDate.isEmpty) {
      val startDate = DateTimeUtils.convertDateToYYYYMMDD(transactionFilter.startDate.get)
      val endDate = DateTimeUtils.convertDateToYYYYMMDD(transactionFilter.endDate.get)

      val dateFilter = sql"""AND date(fhs.FHSDATE) >= ${startDate} AND date(fhs.FHSDATE) <= ${endDate} """
      sqlQuery = sqlQuery concat dateFilter
    }

    if (!fundId.isEmpty && fundId.get != 0L) {
      val id = fundId.get
      val filterQuery = sql""" AND fhs.FHSSOPTRFNUM = ${id} """
      sqlQuery = sqlQuery concat filterQuery
    }
    if (!transactionType.isEmpty && transactionType.get != "") {
      val transType = transactionType.get
      val filterQuery = sql""" AND fhs.FHSTYPE = ${transType} """
      sqlQuery = sqlQuery concat filterQuery
    }
    val query1 =
      sql""" ORDER BY fhs.FHSSOPTRFNUM , fhs.FHSDATE) folioDetails
                            WHERE
                                sopt.SOPTRFNUM = folioDetails.FHSSOPTRFNUM) folioFundDetails
                            WHERE
                                smt.SMTRFNUM = folioFundDetails.SOPTSMTRFNUM) fundFolioCategoryDetail,
                            (SELECT
                                ch.CTMTRFNUM AS childId,
                                    pr.CTMTRFNUM AS parentId,
                                    CASE
                                        WHEN ch.CTMTRFNUM = ${liquidId}|| ch.CTMTRFNUM = ${elssId} THEN ch.CTMTNAME
                                        ELSE pr.CTMTNAME
                                    END AS catName
                            FROM
                                FCCTMT pr, FCCTMT ch
                            WHERE
                                pr.CTMTRFNUM = ch.CTMTCTMTRFNUM) ctmtPr
                        WHERE
                            ctmtPr.childId = fundFolioCategoryDetail.SMTCTMTRFNUM"""
    sqlQuery = sqlQuery concat query1

    getFundDetailsResult(sqlQuery)

  }

  def getCapitalGainFundDetails(userPk: Long, startDate: util.Date, endDate: util.Date): Future[ListBuffer[FundDetails]] = {

    val startDateString = DateTimeUtils.convertDateToYYYYMMDD(startDate)
    val endDateString = DateTimeUtils.convertDateToYYYYMMDD(endDate)
    val debtHybridId = DEBT_HYBRID
    val equityHybridId = EQUITY_HYBRID
    val query =
      sql"""SELECT
                  fundFolioCategoryDetail.FHSSOPTRFNUM,
                  fundFolioCategoryDetail.FOMTFOLIONO,
                  fundFolioCategoryDetail.SOPTLEGALNAME,
                  fundFolioCategoryDetail.SOPTSCHEMEPLAN,
                  fundFolioCategoryDetail.FOMTAMCNAME,
                  ctmtPr.catName,
                  ctmtPr.parentId,
                  fundFolioCategoryDetail.FHSDESCRIPTION,
                  fundFolioCategoryDetail.FHSDATE,
                  fundFolioCategoryDetail.FHSTYPE,
                  fundFolioCategoryDetail.FHSUNITS,
                  fundFolioCategoryDetail.FHSNAV,
                  fundFolioCategoryDetail.FHSAMOUNT,
                  fundFolioCategoryDetail.FOMTRFNUM,
                  fundFolioCategoryDetail.FOMTMODEOFHOLDING
              FROM
                  (SELECT
                      smt.SMTCTMTRFNUM,
                          folioFundDetails.SOPTLEGALNAME,
                          folioFundDetails.SOPTSCHEMEPLAN,
                          folioFundDetails.FHSTYPE,
                          folioFundDetails.FHSDESCRIPTION,
                          folioFundDetails.FHSDATE,
                          folioFundDetails.FHSSOPTRFNUM,
                          folioFundDetails.FHSUNITS,
                          folioFundDetails.FHSAMOUNT,
                          folioFundDetails.FHSNAV,
                          folioFundDetails.FOMTAMCNAME,
                          folioFundDetails.FOMTFOLIONO,
                          folioFundDetails.FOMTRFNUM,
                          folioFundDetails.FOMTMODEOFHOLDING
                  FROM
                      FCSMT smt, (SELECT
                      sopt.SOPTLEGALNAME,
                      sopt.SOPTSCHEMEPLAN,
                          sopt.SOPTSMTRFNUM,
                          folioDetails.FHSTYPE,
                          folioDetails.FHSDESCRIPTION,
                          folioDetails.FHSDATE,
                          folioDetails.FHSSOPTRFNUM,
                          folioDetails.FHSUNITS,
                          folioDetails.FHSAMOUNT,
                          folioDetails.FHSNAV,
                          folioDetails.FOMTAMCNAME,
                          folioDetails.FOMTFOLIONO,
                          folioDetails.FOMTRFNUM,
                          folioDetails.FOMTMODEOFHOLDING
                  FROM
                      FCSOPT sopt, (SELECT
                      fhs.FHSTYPE,
                          fhs.FHSDESCRIPTION,
                          fhs.FHSDATE,
                          fhs.FHSSOPTRFNUM,
                          fhs.FHSUNITS,
                          fhs.FHSAMOUNT,
                          fhs.FHSNAV,
                          fomtResult.FOMTAMCNAME,
                          fomtResult.FOMTFOLIONO,
                          fomtResult.FOMTRFNUM,
                          fomtResult.FOMTMODEOFHOLDING
                  FROM
                      FCFHS fhs, (SELECT
                      fomt.FOMTFOLIONO, fomt.FOMTRFNUM, fomt.FOMTAMCNAME,
                      fomt.FOMTMODEOFHOLDING
                  FROM
                      FCFOMT fomt
                  WHERE
                      fomt.FOMTRFNUM IN (SELECT
                              UFTFOMTRFNUM
                          FROM
                              FCUFT
                          WHERE
                              UFTUBDRFNUM = ${userPk})) fomtResult
                  WHERE
                      fhs.FHSFOMTRFNUM = fomtResult.FOMTRFNUM
                  AND date(fhs.FHSDATE) >= ${startDateString} AND date(fhs.FHSDATE) <= ${endDateString}
                  ORDER BY fhs.FHSSOPTRFNUM , fhs.FHSDATE) folioDetails
                  WHERE
                      sopt.SOPTRFNUM = folioDetails.FHSSOPTRFNUM) folioFundDetails
                  WHERE
                      smt.SMTRFNUM = folioFundDetails.SOPTSMTRFNUM) fundFolioCategoryDetail,
                  (SELECT
                      ch.CTMTRFNUM AS childId,
                          pr.CTMTRFNUM AS parentId,
                          CASE
                              WHEN ch.CTMTRFNUM = ${debtHybridId}|| ch.CTMTRFNUM = ${equityHybridId} THEN ch.CTMTNAME
                              ELSE pr.CTMTNAME
                          END AS catName
                  FROM
                      FCCTMT pr, FCCTMT ch
                  WHERE
                      pr.CTMTRFNUM = ch.CTMTCTMTRFNUM) ctmtPr
              WHERE
                  ctmtPr.childId = fundFolioCategoryDetail.SMTCTMTRFNUM"""


    getFundDetailsResult(query)

  }

  def getAssetAllocationFundDetails(userPk: Long): Future[ListBuffer[FundDetails]] = {
    val debtHybridId = DEBT_HYBRID
    val equityHybridId = EQUITY_HYBRID
    val equityId = EQUITY_ID
    val hybridId = HYBRID_ID
    val query =
      sql"""SELECT
                  fundFolioCategoryDetail.FHSSOPTRFNUM,
                  fundFolioCategoryDetail.FOMTFOLIONO,
                  fundFolioCategoryDetail.SOPTLEGALNAME,
                  fundFolioCategoryDetail.SOPTSCHEMEPLAN,
                  fundFolioCategoryDetail.FOMTAMCNAME,
                  ctmtPr.catName,
                  ctmtPr.parentId,
                  fundFolioCategoryDetail.FHSDESCRIPTION,
                  fundFolioCategoryDetail.FHSDATE,
                  fundFolioCategoryDetail.FHSTYPE,
                  fundFolioCategoryDetail.FHSUNITS,
                  fundFolioCategoryDetail.FHSNAV,
                  fundFolioCategoryDetail.FHSAMOUNT,
                  fundFolioCategoryDetail.FOMTRFNUM,
                  fundFolioCategoryDetail.FOMTMODEOFHOLDING
              FROM
                  (SELECT
                      smt.SMTCTMTRFNUM,
                          folioFundDetails.SOPTLEGALNAME,
                          folioFundDetails.SOPTSCHEMEPLAN,
                          folioFundDetails.FHSTYPE,
                          folioFundDetails.FHSDESCRIPTION,
                          folioFundDetails.FHSDATE,
                          folioFundDetails.FHSSOPTRFNUM,
                          folioFundDetails.FHSUNITS,
                          folioFundDetails.FHSAMOUNT,
                          folioFundDetails.FHSNAV,
                          folioFundDetails.FOMTAMCNAME,
                          folioFundDetails.FOMTFOLIONO,
                          folioFundDetails.FOMTRFNUM,
                          folioFundDetails.FOMTMODEOFHOLDING
                  FROM
                      FCSMT smt, (SELECT
                      sopt.SOPTLEGALNAME,
                      sopt.SOPTSCHEMEPLAN,
                          sopt.SOPTSMTRFNUM,
                          folioDetails.FHSTYPE,
                          folioDetails.FHSDESCRIPTION,
                          folioDetails.FHSDATE,
                          folioDetails.FHSSOPTRFNUM,
                          folioDetails.FHSUNITS,
                          folioDetails.FHSAMOUNT,
                          folioDetails.FHSNAV,
                          folioDetails.FOMTAMCNAME,
                          folioDetails.FOMTFOLIONO,
                          folioDetails.FOMTRFNUM,
                          folioDetails.FOMTMODEOFHOLDING
                  FROM
                      FCSOPT sopt, (SELECT
                      fhs.FHSTYPE,
                          fhs.FHSDESCRIPTION,
                          fhs.FHSDATE,
                          fhs.FHSSOPTRFNUM,
                          fhs.FHSUNITS,
                          fhs.FHSAMOUNT,
                          fhs.FHSNAV,
                          fomtResult.FOMTAMCNAME,
                          fomtResult.FOMTFOLIONO,
                          fomtResult.FOMTRFNUM,
                          fomtResult.FOMTMODEOFHOLDING
                  FROM
                      FCFHS fhs, (SELECT
                      fomt.FOMTFOLIONO, fomt.FOMTRFNUM, fomt.FOMTAMCNAME,
                      fomt.FOMTMODEOFHOLDING
                  FROM
                      FCFOMT fomt
                  WHERE
                      fomt.FOMTRFNUM IN (SELECT
                              UFTFOMTRFNUM
                          FROM
                              FCUFT
                          WHERE
                              UFTUBDRFNUM = ${userPk})) fomtResult
                  WHERE
                      fhs.FHSFOMTRFNUM = fomtResult.FOMTRFNUM
                  ORDER BY fhs.FHSSOPTRFNUM , fhs.FHSDATE) folioDetails
                  WHERE
                      sopt.SOPTRFNUM = folioDetails.FHSSOPTRFNUM) folioFundDetails
                  WHERE
                      smt.SMTRFNUM = folioFundDetails.SOPTSMTRFNUM) fundFolioCategoryDetail,
                  (SELECT
                        ch.CTMTRFNUM AS childId,
                        CASE
                        WHEN ch.CTMTRFNUM = ${debtHybridId} THEN ${hybridId}
                        WHEN ch.CTMTRFNUM = ${equityHybridId} THEN ${equityId}
                        ELSE pr.CTMTRFNUM
                        END AS parentId,
                        CASE
                        WHEN ch.CTMTRFNUM = ${debtHybridId} THEN 'Debt'
                        WHEN ch.CTMTRFNUM = ${equityHybridId} THEN 'Equity'
                        ELSE pr.CTMTNAME
                        END AS catName
                        FROM
                        FCCTMT pr,
                        FCCTMT ch
                        WHERE
                        pr.CTMTRFNUM = ch.CTMTCTMTRFNUM) ctmtPr
              WHERE
                  ctmtPr.childId = fundFolioCategoryDetail.SMTCTMTRFNUM"""


    getFundDetailsResult(query)
  }

  def getIRRFundDetails(userPk: Long): Future[ListBuffer[Transaction]] = {

    val fundMap = HashMap.empty[Long, Boolean]
    val transactionsList: ListBuffer[Transaction] = ListBuffer[Transaction]()

    val query = sql"""SELECT
    fundFolioCategoryDetail.FHSSOPTRFNUM,
    fundFolioCategoryDetail.FOMTFOLIONO,
    fundFolioCategoryDetail.SOPTLEGALNAME,
    fundFolioCategoryDetail.FHSDESCRIPTION,
    fundFolioCategoryDetail.FHSDATE,
    fundFolioCategoryDetail.FHSTYPE,
    fundFolioCategoryDetail.FHSUNITS,
    fundFolioCategoryDetail.FHSNAV,
    fundFolioCategoryDetail.FHSAMOUNT,
    fundFolioCategoryDetail.FOMTRFNUM
FROM
    (SELECT
        smt.SMTCTMTRFNUM,
            folioFundDetails.SOPTLEGALNAME,
            folioFundDetails.FHSTYPE,
            folioFundDetails.FHSDESCRIPTION,
            folioFundDetails.FHSDATE,
            folioFundDetails.FHSSOPTRFNUM,
            folioFundDetails.FHSUNITS,
            folioFundDetails.FHSAMOUNT,
            folioFundDetails.FHSNAV,
            folioFundDetails.FOMTFOLIONO,
            folioFundDetails.FOMTRFNUM
    FROM
        FCSMT smt, (SELECT
        sopt.SOPTLEGALNAME,
            sopt.SOPTSMTRFNUM,
            folioDetails.FHSTYPE,
            folioDetails.FHSDESCRIPTION,
            folioDetails.FHSDATE,
            folioDetails.FHSSOPTRFNUM,
            folioDetails.FHSUNITS,
            folioDetails.FHSAMOUNT,
            folioDetails.FHSNAV,
            folioDetails.FOMTFOLIONO,
            folioDetails.FOMTRFNUM
    FROM
        FCSOPT sopt, (SELECT
        fhs.FHSTYPE,
            fhs.FHSDESCRIPTION,
            fhs.FHSDATE,
            fhs.FHSSOPTRFNUM,
            fhs.FHSUNITS,
            fhs.FHSAMOUNT,
            fhs.FHSNAV,
            fomtResult.FOMTFOLIONO,
            fomtResult.FOMTRFNUM
    FROM
        FCFHS fhs, (SELECT
        fomt.FOMTFOLIONO, fomt.FOMTRFNUM
    FROM
        FCFOMT fomt
    WHERE
        fomt.FOMTRFNUM IN (SELECT
                UFTFOMTRFNUM
            FROM
                FCUFT
            WHERE
                UFTUBDRFNUM = ${userPk})) fomtResult
    WHERE
        fhs.FHSFOMTRFNUM = fomtResult.FOMTRFNUM
    ORDER BY fhs.FHSSOPTRFNUM , fhs.FHSDATE) folioDetails
    WHERE
        sopt.SOPTRFNUM = folioDetails.FHSSOPTRFNUM) folioFundDetails
    WHERE
        smt.SMTRFNUM = folioFundDetails.SOPTSMTRFNUM) fundFolioCategoryDetail""".as[(Long, String, String, String, Date, String, BigDecimal, BigDecimal, BigDecimal, Long)]

    db.run(query).map(values => {
      values.foreach(value => {
        val fundId = value._1
        if (fundMap.contains(fundId)) {
          val transactionDetailsList = transactionsList(transactionsList.size - 1).transactionList
          val transDate = new util.Date(value._5.getTime)
          transactionDetailsList.+=(TransactionDetails(transDate, value._4, value._9.toDouble, value._8.toDouble, value._7.toDouble, BuySellEnum.withName(value._6)))
          transactionsList(transactionsList.size - 1) = transactionsList(transactionsList.size - 1).copy(transactionList = transactionDetailsList)
        } else {
          fundMap.+=(fundId -> true)
          val transactionDetailsList: ListBuffer[TransactionDetails] = ListBuffer[TransactionDetails]()
          val transDate = new util.Date(value._5.getTime)
          transactionDetailsList.+=(TransactionDetails(transDate, value._4, value._9.toDouble, value._8.toDouble, value._7.toDouble, BuySellEnum.withName(value._6)))
          val transaction = Transaction(value._2, fundId, value._3, transactionDetailsList)
          transactionsList.+=(transaction)
        }
      })
      transactionsList
    })
  }

  private def getFundDetailsResult(sQLActionBuilder: SQLActionBuilder): Future[ListBuffer[FundDetails]] = {

    val query = sQLActionBuilder.as[(Long, String, String, String, String, String, Long, String, Date, String, BigDecimal, BigDecimal, BigDecimal, Long, String)]
    val fundMap = HashMap.empty[Long, Boolean]
    val fundDetailList: ListBuffer[FundDetails] = ListBuffer[FundDetails]()

    db.run(query).map { values => {
      values.foreach { value =>
        val fundId = value._1
        if (fundMap.contains(fundId)) {

          val transactionList = fundDetailList(fundDetailList.size - 1).transactionList
          transactionList.+=(FundTransaction(value._8, value._9, BuySellEnum.withName(value._10), value._11, value._12, Some(value._13)))
          fundDetailList(fundDetailList.size - 1) = fundDetailList(fundDetailList.size - 1).copy(transactionList = transactionList)
        } else {
          fundMap.+=(fundId -> true)
          val fundTransactionList: ListBuffer[FundTransaction] = ListBuffer[FundTransaction]()
          fundTransactionList.+=(FundTransaction(value._8, value._9, BuySellEnum.withName(value._10), value._11, value._12, Some(value._13)))
          val fundBasicDetails = FundBasicDetails(value._2, value._3, ModeOfHoldingConstants.MODE_OF_HOLDING_MAP.getOrElse(value._15, ""), SchemePlan.SCHEME_PLAN_MAP.get(value._4))
          val fundDetail = FundDetails(fundId, fundBasicDetails, value._5, AssetClassEnum.withName(value._6), value._7, 0, None, fundTransactionList)
          fundDetailList.+=(fundDetail.copy(folioId = Some(value._14)))
        }
      }
      fundDetailList
    }
    }
  }


  def getUserTransactions(userPk: Long): Future[List[TransactionSummary]] = {

    implicit val getTransactionSummary = GetResult(r => TransactionSummary(r.nextLong, r.nextLong, r.nextString, r.nextString, r.nextString, r.nextString, r.nextString, r.nextString, r.nextLong, r.nextDouble, r.nextString, false));

    val query = sql"""SELECT
  od.OMTRFNUM AS orderId,
  od.SOTRFNUM AS subOrderId,
  fnd.SMTDISPLAYNAME AS fundName,
  fnd.SOPTSCHEMEPLAN AS schemePlan,
  fnd.SOPTDIVIDENDFRQN AS dividendFreq,
  fnd.SOPTDIVIOPTIONTYPE AS dividendOption,
  od.CREATEDATE AS subOrderDate,
  ostm.OSTMDISPLAYNAME AS subOrderStatus,
  ostm.OSTMRFNUM AS subOrderState,
  CASE
  WHEN
    ISNULL(od.SOTORDERQUANTITY)
    THEN
      od.SOTORDERAMOUNT
  ELSE od.SOTORDERQUANTITY
  END AS subOrderAmount,
  CASE
  WHEN od.SOTINVESTMENTMODE = 'S' THEN 'SIP'
  ELSE 'LUMPSUM'
  END AS subOrderInvestmentMode
FROM
  FCOSTM ostm,
  (SELECT
     omt.OMTRFNUM,
     sot.SOTRFNUM,
     sot.SOTSOPTRFNUM,
     sot.SOTOSTMSTATERFNUM,
     sot.CREATEDATE,
     sot.SOTORDERAMOUNT,
     sot.SOTORDERQUANTITY,
     sot.SOTINVESTMENTMODE,
     sot.SOTSIPINSTALLMENTS
   FROM
     FCOMT omt, FCSOT sot
   WHERE
     omt.OMTUBDRFNUM = ${userPk}
     AND sot.SOTOMTRFNUM = omt.OMTRFNUM) AS od,
  (SELECT
     sopt.SOPTRFNUM, smt.SMTDISPLAYNAME, sopt.SOPTSCHEMEPLAN, sopt.SOPTDIVIOPTIONTYPE, sopt.SOPTDIVIDENDFRQN
   FROM
     FCSOPT sopt, FCSMT smt
   WHERE
     smt.SMTRFNUM = sopt.SOPTSMTRFNUM) AS fnd
WHERE
  od.SOTSOPTRFNUM = fnd.SOPTRFNUM
  AND od.SOTOSTMSTATERFNUM = ostm.OSTMRFNUM
ORDER BY od.CREATEDATE DESC, od.SOTRFNUM DESC;""".as[TransactionSummary];
    db.run(query).map(data => data.toList);
  }


}


object SlickKit {

  implicit class SQLActionBuilderConcat(a: SQLActionBuilder) {
    def concat(b: SQLActionBuilder): SQLActionBuilder = {
      SQLActionBuilder(a.queryParts ++ b.queryParts, new SetParameter[Unit] {
        def apply(p: Unit, pp: PositionedParameters): Unit = {
          a.unitPConv.apply(p, pp)
          b.unitPConv.apply(p, pp)
        }
      })
    }
  }

}