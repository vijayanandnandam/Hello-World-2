package constants

/**
  * Created by Fincash on 09-02-2017.
  */
trait KycConstants {

  val CND_COUNTRY_INDIA = "115"

  val CND_MARITALSTATUS_MARRIED = "907"

  val CND_ACCTYPE_SAVINGS = "2"

  val CND_RELATIONSHIP_FATHER = "1000"

  val CND_OCCUPATION_SERVICE = "912"

  val CND_INCOME_LESSTHANFIVE = "990"

  val CND_WEALTHSOURCE_SALARY = "1026"

  val CND_CONTACTADDRESS_PERMANENT = "1024"
  val CND_CONTACTADDRESS_CORRESPONDENCE = "1025"

  val CND_ADDRESSTYPE_BUSINESSRESIDENTIAL = "5"

  val CND_DOCTYPE_PHOTOGRAPH = "1058"
  val CND_DOCTYPE_SIGNATURE = "1059"
  val CND_DOCTYPE_PANCARD = "896"


  val KYC_DONE = "D"
  val KYC_NOTDONE = "ND"
  val KYC_EXTERNALLY_DONE = "ED"
  val KYC_UNDERPROCESS = "UP"

  val DOC_APPROVED = "A"
  val DOC_REJECTED = "R"
  val DOC_UNDERPROCESS = "UP"

  val KYCTYPE_CKYC = "CKYC"
  val KYCTYPE_PAN = "PAN BASED"
  val KYCTYPE_AADHAR = "AADHAR KYC"

}