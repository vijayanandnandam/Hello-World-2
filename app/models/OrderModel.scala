package models

import java.sql.Date

import play.api.libs.json._

/**
  * Created by fincash on 16-02-2017.
  */
case class OrderModel(orderType: String, totalAmount: Double, ipAddress: Option[String], subOrders: List[SubOrder],
                      orderDevice: Option[String], buaRfnum: Option[Long], snapshotPath: Option[String],
                      cdslNdslPhysicalTxnMode: Option[String] = None,
                      fromState: Option[String] = None, toState: Option[String] = None)

case class SubOrder(orderSeq: Long, amount: Double, investmentMode: String, buySchemeOptionRfnum: Long, sellSchemeOptionRfnum: Option[Long], paymentMode: String,
                    sipNoOfInstallments: Option[Int] = None, sipFrequency: Option[String] = None, existingMmtRfnum: Option[Long] = None, bseSchemeCode: Option[String] = None,
                    sipDayOfMonth: Option[Int] = None, quantity: Option[Double] = None, dematPhysicalMode: Option[String] = None, transactionMode: Option[String] = None,
                    orderType: Option[String] = None, fromState: Option[String] = None, toState: Option[String] = None,
                    paymentStatus: Option[String] = None, folioNo: Option[String] = None, addPrevFolioNo: Option[Boolean] = None)

case class CancelSubOrder(subOrderId: Long, ipaddress: Option[String] = None)

case class SchemeDetails(schemeId: Long, schemelegalName: String, schemeDisplayName: String, schemeAMCLegalName: String, schemeAMCDisplayName: String, schemePlan: String,
                         schemeOption: String)

case class SubOrderPaymentStatus(subOrderId: Long, subOrderStatus: String)

case class ProcessedSubOrderModel(subOrderId: Long, orderProcessed: Long, soptrfnum: Long, investmentMode: String, schemeDisplayName: Option[String] = None,
                                  schemePlan: Option[String] = None, schemeOption: Option[String] = None, amount: Option[Double] = None, sipNoOfInstallments: Option[Int] = None,
                                  sipFrequency: Option[String] = None, sipDayOfMonth: Option[Int] = None,
                                  quantity: Option[Double] = None)

case class ProcessedOrderModel(orderId: Long, subOrderList: List[ProcessedSubOrderModel], orderTime: Option[String] = None)

case class PaymentStatus(statusCode: Long, status: String)

case class SubOrderPaymentStatusList(orderStatusList: List[SubOrderPaymentStatus])

case class SubOrderMandateDetails(mmtrfnum: Long, mandateId: String, mandateType: String)

case class OrderHistoryDetails(historyrfnum: Long, stateName: String, stateDate: String)

case class SubOrderDetails(subOrderId: Long, orderProcessed: Long, investmentMode: String, createDate: String, schemeName: Option[String] = None,
                           schemePlan: Option[String] = None, schemeOption: Option[String] = None, amount: Option[Double] = None, sipNoOfInstallments: Option[Int] = None,
                           sipFrequency: Option[String] = None, sipDayOfMonth: Option[Int] = None, subOrderHistoryList: Option[List[OrderHistoryDetails]] = None,
                           quantity: Option[Double] = None, stateName: Option[String] = None, mandateDetails: Option[SubOrderMandateDetails] = None)

case class OrderDetails(orderId: Long, orderType: String, subOrderDetails: List[SubOrderDetails], createDate: String, totalAmount: Double, snapshotPath: Option[String] = None,
                        stateName: Option[String] = None, orderHistoryList: Option[List[OrderHistoryDetails]] = None)

object OrderJsonFormats {

  implicit val paymentStatusJsonFormat = Json.format[PaymentStatus]
  implicit val schemeDetailsJsonFormat = Json.format[SchemeDetails]
  implicit val subOrderModelJsonFormat = Json.format[SubOrder]
  implicit val orderModelJsonFormat = Json.format[OrderModel]
  implicit val orderStatusJsonFormat = Json.format[SubOrderPaymentStatus]
  implicit val processedSubOrderJsonFormat = Json.format[ProcessedSubOrderModel]
  implicit val prcessedOrderModelJsonFormat = Json.format[ProcessedOrderModel]
  implicit val orderStatusListJsonFormat = Json.format[SubOrderPaymentStatusList]
  implicit val subOrderMandateDetailsFormat = Json.format[SubOrderMandateDetails]
  implicit val subOrderHistoryDetailsJsonFormat = Json.format[OrderHistoryDetails]
  implicit val subOrderDetailsJsonFormat = Json.format[SubOrderDetails]
  implicit val orderDetailsJsonFormat = Json.format[OrderDetails]
}
