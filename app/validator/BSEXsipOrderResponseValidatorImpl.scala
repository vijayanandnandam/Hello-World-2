package validator

import constants.IntegrationConstants
import models.ErrorModel
import models.integration.{BSEErrorModel, BSEXsipOrderEntryParamResponse}
import org.slf4j.LoggerFactory
import service.PropertiesLoaderService

import scala.collection.mutable.ListBuffer


class BSEXsipOrderResponseValidator {
  
}

object BSEXsipOrderResponseValidator extends BaseValidator[BSEXsipOrderEntryParamResponse] with IntegrationConstants{

  val log, logger = LoggerFactory.getLogger(getClass)


  override def validate(bseXsipOrderEntryParamResponse:BSEXsipOrderEntryParamResponse):ListBuffer[ErrorModel] = {
    
    val errorsList:ListBuffer[ErrorModel] = ListBuffer.empty[ErrorModel]
    val successFlag = bseXsipOrderEntryParamResponse.successFlag
    val remarks = bseXsipOrderEntryParamResponse.bseRemarks.getOrElse("")
    
    if(successFlag != BSE_SUCCESS_FLAG_0){
      

      val errorTuple = BSEErrorModel.getErrorCode(remarks)
      val errorCode = errorTuple._1
      val errorMessage = errorTuple._2
      
      var errorModel = ErrorModel(errorCode,errorMessage)
      logger.debug("BSE Xsip order Error Occured " + remarks)
      if(errorCode == GENERAL_ERROR_CODE){
        errorModel = ErrorModel(XSIP_ERROR_CODE_106,PropertiesLoaderService.getConfig().getString("bse.xsipOrderEntry.response.errorMessage"))
      }
    	errorsList.+=:(errorModel)
    	
    }
    errorsList
  }
}