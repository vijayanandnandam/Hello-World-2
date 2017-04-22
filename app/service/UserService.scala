package service

import javax.inject.Inject

import constants.{DBConstants, KycConstants, MongoConstants}
import data.model.Tables.{FceubdRow, FcubdRow}
import helpers.{MailHelper, UserHelper}
import models.JsonFormats._
import models._
import models.enumerations.InvestmentModeEnum
import org.slf4j.LoggerFactory
import play.api.mvc.Request
import reactivemongo.bson.BSONDocument
import repository.module.{BankRepository, UserRepository}
import repository.tables._
import service.integration.BSEClientService
import slick.jdbc.MySQLProfile.api._

import scala.collection.mutable.ListBuffer
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration.Duration
import scala.concurrent.{Await, Future}

/**
  * @author fincash
  *
  */
class UserService @Inject()(fcultRepo: FcultRepo, fceubdRepo: FceubdRepo, fcubdRepo: FcubdRepo, userRepository: UserRepository, bankRepository:BankRepository, userHelper: UserHelper,
                            mongoDbService: MongoDbService, bSEClientService: BSEClientService, fcbuaRepo: FcbuaRepo, orderService: OrderService,
                            mailHelper: MailHelper, mailService: MailService, fckycRepo: FckycRepo, fcuaaRepo: FcuaaRepo,  configuration: play.api.Configuration)
  extends MongoConstants with DBConstants with KycConstants {

  val logger, log = LoggerFactory.getLogger(classOf[UserService])

  def collection(name: String) = mongoDbService.collection(name)

  def postUserDataToDb() = {}


  def activateUser(userid: Long, ipAddress: String): Future[Boolean] = {
    fceubdRepo.getById(userid).flatMap(userRow => {
      if (userRow.nonEmpty) {
        if (userRow.get.eubdisvarified.equalsIgnoreCase(Y_FLAG)) {
          // already verified case returning false.
          logger.debug("Provided user [" + userid + "]  already verified. Sending to restrict sms & email trigger again")
          return Future.apply(false)
        }
        val newRow = userRow.get.copy(eubdisvarified = Y_FLAG)
        try {
          val bseObject = bSEClientService.getBSERegistrationStatus(userid).flatMap(bseStatus => {
            if (!bseStatus) {
              fcultRepo.filter(_.ultubdrfnum === userid).flatMap(ultRow => {
                if (ultRow.nonEmpty) {
                  val username = ultRow.head.ultusername
                  bSEClientService.bseRegistration(userid, ipAddress, Some(username)).map(bseObj => {
                    log.debug("Bse user response ", bseObj)
                    bseObj
                  })
                } else {
                  Future.apply((false, false))
                }
              })
            } else {
              Future.apply((true, true))
            }
          })
          bseObject.flatMap(bseValue => {
            if (bseValue._1 && bseValue._2) {
              fceubdRepo.updateById(newRow.id, newRow).map(value => {
                true
              })
            } else {
              Future.apply(false)
            }
          })
        } catch {
          case e: Exception => Future.apply(false)
        }
      } else {
        Future.apply(false)
      }
    })
  }

  def approveDocuments(userid: Long): Future[Boolean] = {
    fckycRepo.filter(_.kycubdrfnum === userid).flatMap(kycRow => {
      if (kycRow.nonEmpty) {
        var kycrow = kycRow.head
        kycrow = kycrow.copy(kycphotoverification = DOC_APPROVED, kycidverification = DOC_APPROVED, kycsignverification = DOC_APPROVED)
        fckycRepo.updateById(userid, kycrow).flatMap(retval => {
          fcbuaRepo.filter(_.buaubdrfnum === userid).flatMap(buaRow => {
            if (buaRow.nonEmpty) {
              fcbuaRepo.updateById(buaRow.head.id, buaRow.head.copy(buadocstatus = DOC_APPROVED)).flatMap(retval2 => {
                fcuaaRepo.filter(_.uaaubdrfnum === userid).flatMap(uaaRows => {
                  if (uaaRows.nonEmpty) {
                    fcuaaRepo.updateById(uaaRows.head.id, uaaRows.head.copy(uaadocstatus = DOC_APPROVED)).map(retval3 => {
                      fcuaaRepo.updateById(uaaRows.last.id, uaaRows.last.copy(uaadocstatus = DOC_APPROVED))
                      true
                    })
                  }
                  else {
                    Future.apply(false)
                  }
                })
              })
            }
            else {
              Future.apply(false)
            }
          })
        })
      }
      else {
        Future.apply(false)
      }
    })
  }

  def approvePhoto(userid: Long): Future[Boolean] = {
    fckycRepo.filter(_.kycubdrfnum === userid).flatMap(kycRow => {
      if (kycRow.nonEmpty) {
        var kycrow = kycRow.head
        kycrow = kycrow.copy(kycphotoverification = DOC_APPROVED)
        fckycRepo.updateById(userid, kycrow).map(retval => {
          true
        })
      }
      else {
        Future.apply(false)
      }
    })
  }

  def bseRegistration(userid: Long, ipAddress: String): Future[(Boolean, Boolean)] = {
    fceubdRepo.getById(userid).flatMap(userRow => {
      if (userRow.nonEmpty) {
        if (userRow.get.eubdisvarified.equalsIgnoreCase(Y_FLAG)) {
          // already verified case returning false.
          logger.debug("Provided user [" + userid + "]  already verified. Sending to restrict sms & email trigger again")
          Future.apply(true, true)
        } else {
          val newRow = userRow.get.copy(eubdisvarified = Y_FLAG)
          try {
            bSEClientService.getBSERegistrationStatus(userid).flatMap(bseStatus => {
              if (!bseStatus) {
                fcultRepo.filter(_.ultubdrfnum === userid).flatMap(ultRow => {
                  if (ultRow.nonEmpty) {
                    val username = ultRow.head.ultusername
                    bSEClientService.bseRegistration(userid, ipAddress, Some(username)).map(bseObj => {
                      log.debug("Bse user response ", bseObj)
                      bseObj
                    })
                  } else {
                    Future.apply((false, false))
                  }
                })
              } else {
                Future.apply((true, true))
              }
            })

          } catch {
            case e: Exception => Future.apply(false, false)
          }
        }
      } else {
        Future.apply(false, false)
      }
    })
  }

  def getEUBDbyPk(userid: Long): Future[Option[FceubdRow]] = {
    fceubdRepo.getById(userid).map(row => {
      row
    })
  }

  def getUsernameFromRequest(request: Request[Any]): Future[Option[String]] = {
    getUserObjectFromReq(request).map(value => {
      if (value.nonEmpty) {
        value.get.username
      } else {
        None
      }
    })
  }

  def getUseridFromRequest(request: Request[Any]): Future[Option[Long]] = {
    getUserObjectFromReq(request).map(value => {
      if (value.nonEmpty) {
        value.get.userid
      } else {
        None
      }
    })
  }

  def getUserObjectFromReq(request: Request[Any]): Future[Option[UserLoginObject]] = {
    val token = getTokenFromRequest(request)
    if (token.isEmpty) {
      return Future.apply(None)
    }
    val findquery = BSONDocument("token" -> token)
    //var username = "";
    collection(TOKEN_COLLECTION_NAME).flatMap { coll =>
      coll.find(findquery)
        .one[BSONDocument].map { doc =>
        if (doc.nonEmpty) {
          val document = doc.get
          Some(new UserLoginObject(document.getAs[String]("username"), document.getAs[Long]("userid"), document.getAs[Long]("foliocount"),
            document.getAs[String]("firstname"), document.getAs[String]("pan"), document.getAs[String]("mobile")))
          //username
        } else {
          None
        }
      }
    }
  }

  def getTokenFromRequest(request: Request[Any]): Option[String] = {
    request.headers.get("Authorization").map { authHeader =>
      if (authHeader.nonEmpty) {
        return Some(authHeader.replaceFirst("Bearer ", ""))
      }
      return None
    }
  }

  /**
    * This method is used to create a new user
    *
    * @param data
    * @return
    */

  def getUserByUserName(userName: String): Future[Option[FcubdRow]] = {
    userRepository.getUserByUsername(userName)
  }

  def getUserNomineeDetails(userName: String): Future[Option[String]] = {
    userRepository.getUserNomineeDetails(userName).map(nomineeList => {
      val nomineeFutureList = for (nominee <- nomineeList) yield {
        userHelper.getNomineeLabel(nominee._1, nominee._2)
      }
      nomineeFutureList.headOption
    })
  }

  def getUserBankDetails(userName: String): Future[List[String]] = {
    userRepository.getUserBankDetails(userName).map(banksList => {
      for (bank <- banksList) yield {
        bank.bmtbankname
      }
    })
  }

  def saveOTPDetails(userId: Long, otp: String, gatewayId: String, purpose: String): Future[Long] = {
    userRepository.saveOTPDetails(userId, otp, gatewayId, purpose)
  }

  def updateOTPMessageId(messageId: String, otprfnum: Long, userName: String): Future[Int] = {
    userRepository.updateOTPMessageId(messageId, otprfnum, userName)
  }

  def validateOTP(otp: String, purpose: String, userId: Long): Future[Int] = {
    userRepository.validateOTP(otp, purpose, userId).map(valuesList => {
      if (valuesList.isEmpty) {
        0
      } else {
        1
      }
    })
  }

  def updateOTPStatus(messageId: String, status: String): Future[Int] = {
    userRepository.updateOTPStatus(messageId, status)
  }

  def getMessageStatus(messageId: String): Future[String] = {
    userRepository.getMessageStatus(messageId)
  }

  def sendRegistrationStatusMail(userId: Long): Future[Boolean] = {
    val heading = PropertiesLoaderService.getConfig().getString("mail.registrationStatus.heading")
    val subj = PropertiesLoaderService.getConfig().getString("mail.registrationStatus.subject")
    val from = this.mailHelper.fromRegStatMail
    val replyto = this.mailHelper.replytoReStatgMail
    val bcc = this.mailHelper.bccRegStat

    fcubdRepo.getById(userId).map(ubdRowOpion => {
      if (ubdRowOpion.nonEmpty) {
        val ubdRow = ubdRowOpion.get
        val userName = ubdRowOpion.get.ubdemailid

        val mailHeaderTemplate = views.html.mailHeader(heading, mailHelper.getMth)
        val mailBodyTemplate = views.html.registrationStatus(ubdRow, mailHelper.getMth)
        val mailTemplate = views.html.mail(mailHeaderTemplate, mailBodyTemplate, mailHelper.getMth)
        val bodyText = views.html.registrationStatusTxt(ubdRow, mailHelper.getMth).toString()
        val bodyHTML = mailTemplate.toString()

        var bccList: Option[ListBuffer[String]] = None
        if (bcc != null && bcc.trim.length > 0) {
          val bccl = ListBuffer[String]()
          bccl.+=(bcc)
          bccList = Some(bccl)
        }

        mailService.sendMail(userName, subj, Some(bodyText), Some(bodyHTML), Some(replyto), Some(from), None, None,
          None, bccList).map(mailId => {
          logger.info("Reg Status Message ID >>> " + mailId)

        })
        true

      } else {
        false
      }
    })
  }

  /*ekyc Status mail*/

  def sendeKYCMail(userId: Long, eKYCstatus: Boolean): Future[Boolean] = {

    val bcceKYC = this.mailHelper.bcceKYC
    fcubdRepo.getById(userId).map(ubdRowOpion => {
      if (ubdRowOpion.nonEmpty) {
        val ubdRow = ubdRowOpion.get
        val email = ubdRow.ubdemailid

        val heading = PropertiesLoaderService.getConfig().getString("mail.eKYC-status.heading")
        val subj = PropertiesLoaderService.getConfig().getString("mail.eKYC-status.subject")

        val mailHeaderTemplate = views.html.mailHeader(heading, mailHelper.getMth)
        val mailBodyTemplate = views.html.kycStatus(ubdRow, eKYCstatus, mailHelper.getMth)
        val mailTemplate = views.html.mail(mailHeaderTemplate, mailBodyTemplate, mailHelper.getMth)

        val bodyText = views.html.kycStatusTxt(ubdRow, eKYCstatus, mailHelper.getMth).toString()
        val bodyHTML = mailTemplate.toString()

        var bccList: Option[ListBuffer[String]] = None
        if (bcceKYC != null && bcceKYC.trim.length > 0) {
          val bcc = ListBuffer[String]()
          bcc.+=(bcceKYC)
          bccList = Some(bcc)
        }
        mailService.sendMail(email, subj, Some(bodyText), Some(bodyHTML), None, None, None, None,
          None, bccList).map(mailId => {
          logger.info("kyc -- Message ID >>> " + mailId)
        })
        true
      }
      else {
        false
      }
    })

  }


  def sendSIPmail(userId:Long, orderId:Long):Future[String] = {
    fcubdRepo.getById(userId).flatMap(ubdRowOption => {
      if (ubdRowOption.nonEmpty) {
        val ubdRow = ubdRowOption.get
        val email = ubdRowOption.get.ubdemailid
        var userObj:UserLoginObject = UserLoginObject(Some(email), Some(userId), None, None, None, None)
        orderService.populateOrderDetails(orderId.toLong, userObj).flatMap(orderDetails => {
          var subOrderSIP = new ListBuffer[SubOrderDetails]()
          var urn = ""
          var urnMap:Map[Long,String] = Map()
          var anyAMCinactive = false
          for (so <- orderDetails.subOrderDetails) {
            if (so.investmentMode.toLowerCase == InvestmentModeEnum.SIP.toString.toLowerCase) {
              var orderSt = so.stateName.getOrElse("").toLowerCase
              if(orderSt.length>0){
                if(orderSt.indexOf("cancel")==(-1)){
                  subOrderSIP += so
                }
              }
              val results = bankRepository.getSubOrderMandateDetails(so.subOrderId)
              val mmtRows = Await.result(results, Duration.Inf)
              if(mmtRows.nonEmpty){
                val mmtRow = mmtRows.head
                urn = mmtRow.mmtexternalid.getOrElse("")
                urnMap += (so.subOrderId->urn)
              }
              var smtResult = orderService.getSchemeDetails(so.subOrderId, userId)
              val smtRow = Await.result(smtResult, Duration.Inf)
              if(smtRow.smtschemeactive==N_FLAG){
                  anyAMCinactive = true
                }
            }
          }
          var subOrderList = subOrderSIP.toList
          if (subOrderList.length > 0) {
          bankRepository.getbuarfnum(userId).flatMap(buarfnum => {
            bankRepository.getSipBankDetails(buarfnum).map(sipbankTuple => {
              var isipAllowed = sipbankTuple._4
              var isipAll = false
              if ((isipAllowed == N_FLAG)&& anyAMCinactive) {
                isipAll = false
              } else {
                isipAll = true
              }
              val heading = PropertiesLoaderService.getConfig().getString("mail.sip-order.heading")
              val subj = PropertiesLoaderService.getConfig().getString("mail.sip-order.subject")
              val from = configuration.underlying.getString("mail.order-placed.from")
              val replyto = configuration.underlying.getString("mail.order-placed.from")
              val bccOrder = configuration.underlying.getString("mail.order-placed.bcc")
              var bccList: Option[ListBuffer[String]] = None
              if (bccOrder != null && bccOrder.trim.length > 0) {
                val bcc = ListBuffer[String]()
                bcc.+=(bccOrder)
                bccList = Some(bcc)
              }
              val mailHeaderTemplate = views.html.mailHeader(heading, mailHelper.getMth)
              val mailBodyTemplate = views.html.orderSIP(ubdRow, isipAll, subOrderList, urnMap, mailHelper.getMth)
              val mailTemplate = views.html.mail(mailHeaderTemplate, mailBodyTemplate, mailHelper.getMth)
              val bodyText = views.html.orderSIPTxt(ubdRow, isipAll, subOrderList, urnMap, mailHelper.getMth).toString()
              val bodyHTML = mailTemplate.toString()
              mailService.sendMail(email, subj, Some(bodyText), Some(bodyHTML), Some(replyto), Some(from), None, None,
                None, None).map(mailId => {
                logger.info("SIP order -- Message ID >>> " + mailId)
              })
              "SIP mail sent succesfully!"
            })
          })
        } else{
            Future.apply("no successful SIP in order!")
          }
      })
      } else{
        Future.apply("user not found in db!")
      }
  })
  }


}