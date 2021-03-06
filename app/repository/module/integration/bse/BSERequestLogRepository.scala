package repository.module.integration.bse

import com.fincash.integration.ws.client.bsestar._
import com.fincash.integration.ws.client.bsestar.upload.MFAPI
import com.google.inject.Inject
import helpers.integration.bse.{AdditionalRequestLogHelper, OrderRequestLogHelper}
import repository.module.IntegrationRepository

import scala.collection.mutable.ListBuffer

/**
  * Created by fincash on 23-01-2017.
  */
class BSERequestLogRepository @Inject()(integrationRepository: IntegrationRepository) {


  def saveGetPasswordRequest(getPassword: GetPassword, integrationId: String, userName: String) = {

    val paramListTuple = OrderRequestLogHelper.getPasswordParameters(getPassword)

    saveRequestLog(paramListTuple, integrationId, userName)
  }

  def saveOrderEntryRequest(orderEntryParam: OrderEntryParam, integrationId: String, userName: String) = {

    val paramListTuple = OrderRequestLogHelper.getOrderParameters(orderEntryParam)

    saveRequestLog(paramListTuple, integrationId, userName)
  }

  def saveSipOrderEntryRequest(sipOrderEntryParam: SipOrderEntryParam, integrationId: String, userName: String) = {

    val paramListTuple = OrderRequestLogHelper.getSipOrderParameters(sipOrderEntryParam)

    saveRequestLog(paramListTuple, integrationId, userName)
  }

  private def saveRequestLog(paramListTuple: (ListBuffer[String], ListBuffer[String]), integrationId: String, userName: String) = {

    val paramNameList: ListBuffer[String] = paramListTuple._1
    val paramValueList: ListBuffer[String] = paramListTuple._2

    integrationRepository.saveBSERequestParameters(Some(integrationId), paramNameList, paramValueList, userName)
  }

  def saveXSipOrderEntryRequest(xsipOrderEntryParam: XsipOrderEntryParam, integrationId: String, userName: String) = {

    val paramListTuple = OrderRequestLogHelper.getXSipOrderParameters(xsipOrderEntryParam)

    saveRequestLog(paramListTuple, integrationId, userName)
  }

  def saveSpreadOrderEntryRequest(spreadOrderEntryParam: SpreadOrderEntryParam, integrationId: String, userName: String) = {

    val paramListTuple = OrderRequestLogHelper.getSpreadOrderParameters(spreadOrderEntryParam)

    saveRequestLog(paramListTuple, integrationId, userName)
  }

  def saveSwitchOrderEntryRequest(switchOrderEntryParam: SwitchOrderEntryParam, integrationId: String, userName: String) = {

    val paramListTuple = OrderRequestLogHelper.getSwitchOrderParameters(switchOrderEntryParam)

    saveRequestLog(paramListTuple, integrationId, userName)
  }

  def saveMfApiGetPasswordRequest(getPassword: com.fincash.integration.ws.client.bsestar.upload.GetPassword, integrationId: String, userName: String) = {

    val paramListTuple = AdditionalRequestLogHelper.getPasswordParameters(getPassword)

    saveRequestLog(paramListTuple, integrationId, userName)
  }

  def saveMfApiRequest(mFAPI: MFAPI, integrationId: String, userName: String) = {

    val paramListTuple = AdditionalRequestLogHelper.getMfApiParameters(mFAPI)

    saveRequestLog(paramListTuple, integrationId, userName)
  }
}
