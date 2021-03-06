package validator

import constants.IntegrationConstants
import models.ErrorModel
import models.integration.{BSEErrorModel, BSEUploadMfApiResponse}
import org.slf4j.LoggerFactory

import scala.collection.mutable.ListBuffer

object BSEMfApiResponseValidatorImpl extends BaseValidator[BSEUploadMfApiResponse] with IntegrationConstants{

  val log, logger = LoggerFactory.getLogger(getClass)


  override def validate(bseUploadMfApiResponse:BSEUploadMfApiResponse):ListBuffer[ErrorModel] = {
    
    val errorsList:ListBuffer[ErrorModel] = ListBuffer.empty[ErrorModel]
    val status = bseUploadMfApiResponse.status
    val response = bseUploadMfApiResponse.response
    if(status != BSE_RESPONSE_CODE_100){

      logger.debug("Error Occured in Mf Api Response")
      val errorTuple = BSEErrorModel.getErrorCode(response)
      val errorCode = errorTuple._1
      val errorMessage = errorTuple._2
      logger.debug("Response Error = " + response)
      val errorModel = ErrorModel(errorCode,errorMessage)
      
      errorsList.+=:(errorModel)
    }
    errorsList
  }
}