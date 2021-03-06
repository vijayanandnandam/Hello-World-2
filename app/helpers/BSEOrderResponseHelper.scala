package helpers

import com.fincash.integration.ws.client.bsestar._
import constants.IntegrationConstants
import models.ErrorModel
import models.integration._
import org.slf4j.LoggerFactory
import validator._

import scala.collection.mutable.ListBuffer


class BSEOrderResponseHelper {
  
}

object BSEOrderResponseHelper extends IntegrationConstants{
  val logger , log = LoggerFactory.getLogger(getClass)

  def convertBSEResponse(getPasswordResponse:GetPasswordResponse):BSEPasswordValidateWrapper = {

    val responseString = getPasswordResponse.getGetPasswordResult.getValue
    var responseValues:Array[String] = responseString.split('|')
    
    if(responseString.endsWith(PIPE_SEPARATOR)){
      responseValues = responseValues :+ ""
    }
    
    val bseGetPasswordResponse = BSEGetPasswordResponse(responseValues(0),responseValues(1).trim)
    
    val errors:ListBuffer[ErrorModel] = BSEPasswordResponseValidator.validate(bseGetPasswordResponse)

    val bsePasswordValidateWrapper = BSEPasswordValidateWrapper(bseGetPasswordResponse,Some(errors))
    bsePasswordValidateWrapper
  }
  
  def convertBSEResponse(orderEntryParamResponse:OrderEntryParamResponse):BSEOrderValidateWrapper = {

    logger.debug("Parsing BSE Order Response")
    val responseString = orderEntryParamResponse.getOrderEntryParamResult.getValue
    var responseValues:Array[String] = responseString.split('|')
    
    if(responseString.endsWith(PIPE_SEPARATOR)){
      responseValues = responseValues :+ ""
    }
    val bseOrderEntryParamResponse = BSEOrderEntryParamResponse(responseValues(0),
                                                                responseValues(1),
                                                                if(responseValues(2) == "") None else Some(responseValues(2).toLong),
                                                                responseValues(3),
                                                                responseValues(4),
                                                                responseValues(5),
                                                                Some(responseValues(6).trim),
                                                                responseValues(7))
    val errors:ListBuffer[ErrorModel] = BSEOrderResponseValidator.validate(bseOrderEntryParamResponse)
    
    val bseOrderValidateWrapper = BSEOrderValidateWrapper(bseOrderEntryParamResponse,Some(errors))
    bseOrderValidateWrapper
  }
  
  def convertBSEResponse(sipOrderEntryParamResponse:SipOrderEntryParamResponse):BSESipOrderValidateWrapper = {

    logger.debug("Parsing BSE Sip Response")
    val responseString = sipOrderEntryParamResponse.getSipOrderEntryParamResult.getValue
    var responseValues:Array[String] = responseString.split('|')
    
    if(responseString.endsWith(PIPE_SEPARATOR)){
      responseValues = responseValues :+ ""
    }
    
    val bseSipOrderEntryParamResponse = BSESipOrderEntryParamResponse(responseValues(0) , 
                                                                      responseValues(1), 
                                                                      responseValues(2), 
                                                                      responseValues(3), 
                                                                      responseValues(4), 
                                                                      responseValues(5), 
                                                                      Some(responseValues(6)), 
                                                                      responseValues(7))
                                                                        
    val errors:ListBuffer[ErrorModel] = BSESipOrderResponseValidator.validate(bseSipOrderEntryParamResponse)
    
    val bseSipOrderValidateWrapper = BSESipOrderValidateWrapper(bseSipOrderEntryParamResponse,Some(errors))
    bseSipOrderValidateWrapper
  }
  
  def convertBSEResponse(xsipOrderEntryParamResponse:XsipOrderEntryParamResponse):BSEXsipOrderValidateWrapper = {

    logger.debug("Parsing BSE Xsip Response")
    val responseString = xsipOrderEntryParamResponse.getXsipOrderEntryParamResult.getValue
    var responseValues:Array[String] = responseString.split('|')
    
    if(responseString.endsWith(PIPE_SEPARATOR)){
      responseValues = responseValues :+ ""
    }
    val bseXsipOrderEntryParamResponse = BSEXsipOrderEntryParamResponse(responseValues(0), 
                                                                        responseValues(1), 
                                                                        responseValues(2), 
                                                                        responseValues(3), 
                                                                        responseValues(4), 
                                                                        responseValues(5), 
                                                                        if(responseValues(6) == "") None else Some(responseValues(6)), 
                                                                        responseValues(7))
                                                                          
    val errors:ListBuffer[ErrorModel] = BSEXsipOrderResponseValidator.validate(bseXsipOrderEntryParamResponse)
    
    val bseXsipOrderValidateWrapper = BSEXsipOrderValidateWrapper(bseXsipOrderEntryParamResponse,Some(errors))
    bseXsipOrderValidateWrapper 
  }
  
  def convertBSEResponse(spreadOrderEntryParamResponse:SpreadOrderEntryParamResponse):BSESpreadOrderValidateWrapper = {

    logger.debug("Parsing BSE Spread Response")
    val responseString = spreadOrderEntryParamResponse.getSpreadOrderEntryParamResult.getValue
    var responseValues:Array[String] = responseString.split('|')
    
    if(responseString.endsWith(PIPE_SEPARATOR)){
      responseValues = responseValues :+ ""
    }
    val bseSpreadOrderEntryParamResponse = BSESpreadOrderEntryParamResponse(responseValues(0), 
                                                                            responseValues(1),
                                                                            responseValues(2),
                                                                            responseValues(3),
                                                                            responseValues(4), 
                                                                            responseValues(5), 
                                                                            if(responseValues(6) == "") None else Some(responseValues(6)), 
                                                                            responseValues(7))
                                                                          
    val errors:ListBuffer[ErrorModel] = BSESpreadOrderResponseValidator.validate(bseSpreadOrderEntryParamResponse)
    
    val bseSpreadOrderValidateWrapper = BSESpreadOrderValidateWrapper(bseSpreadOrderEntryParamResponse,Some(errors))
    bseSpreadOrderValidateWrapper 
  }
  
  def convertBSEResponse(switchOrderEntryParamResponse:SwitchOrderEntryParamResponse):BSESwitchOrderValidateWrapper = {

    logger.debug("Parsing BSE Switch Response")
    val responseString = switchOrderEntryParamResponse.getSwitchOrderEntryParamResult.getValue
    var responseValues:Array[String] = responseString.split('|')
    
    if(responseString.endsWith(PIPE_SEPARATOR)){
      responseValues = responseValues :+ ""
    }
    
    val bseSwitchOrderEntryParamResponse = BSESwitchOrderEntryParamResponse(responseValues(0), 
                                                                            responseValues(1),
                                                                            responseValues(2),
                                                                            responseValues(3),
                                                                            responseValues(4), 
                                                                            responseValues(5), 
                                                                            if(responseValues(6) == "") None else Some(responseValues(6)), 
                                                                            responseValues(7))
    
    val errors:ListBuffer[ErrorModel] = BSESwitchOrderResponseValidator.validate(bseSwitchOrderEntryParamResponse)
    
    val bseSwitchOrderValidateWrapper = BSESwitchOrderValidateWrapper(bseSwitchOrderEntryParamResponse,Some(errors))
    bseSwitchOrderValidateWrapper 
  }
  
}