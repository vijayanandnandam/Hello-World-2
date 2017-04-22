
// @GENERATOR:play-routes-compiler
// @SOURCE:D:/workspace/fincash-backend/conf/user.routes
// @DATE:Thu Apr 20 15:53:39 IST 2017

package user

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:4
  LoginController_1: controllers.LoginController,
  // @LINE:7
  UserController_0: controllers.UserController,
  // @LINE:13
  KYCController_2: controllers.KYCController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:4
    LoginController_1: controllers.LoginController,
    // @LINE:7
    UserController_0: controllers.UserController,
    // @LINE:13
    KYCController_2: controllers.KYCController
  ) = this(errorHandler, LoginController_1, UserController_0, KYCController_2, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    user.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, LoginController_1, UserController_0, KYCController_2, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.LoginController.getLoginToken"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login/signup""", """controllers.LoginController.signup"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """checkUsernameInDB""", """controllers.LoginController.checkUsernameInDB"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getFirstName""", """controllers.UserController.getFirstName"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """isUserVarified""", """controllers.UserController.isUserVarified"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """panCheck""", """controllers.UserController.panCheck"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """panUpdate""", """controllers.UserController.panUpdate"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """mobUpdate""", """controllers.UserController.mobUpdate"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getDmtIds""", """controllers.KYCController.getDmtIds"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateFilePath""", """controllers.KYCController.updateFilePath"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """checkKYC""", """controllers.KYCController.checkKYCFromPAN"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """checkKycStatus""", """controllers.KYCController.checkKycStatus"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateKycStatus""", """controllers.KYCController.updateKycStatus"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """checkIfBankUpdated""", """controllers.KYCController.checkIfBankUpdated"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """checkIfFatcaUpdated""", """controllers.KYCController.checkIfFatcaUpdated"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """checkIfBasicDetailsUpdated""", """controllers.KYCController.checkIfBasicDetailsUpdated"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """checkIfAddressUpdated""", """controllers.KYCController.checkIfAddressUpdated"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getUserData""", """controllers.UserController.getUserData"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """postUserData""", """controllers.UserController.postUserData"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """postUserBasicData""", """controllers.UserController.postUserBasicData"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """postUserAddressData""", """controllers.UserController.postUserAddressData"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """postUserFatcaData""", """controllers.UserController.postUserFatcaData"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """postUserBankData""", """controllers.UserController.postUserBankData"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """postUserNomineeData""", """controllers.UserController.postUserNomineeData"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getUserDetails""", """controllers.UserController.getUserDetails"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getUserBasicData""", """controllers.UserController.getUserBasicData"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getUserFatcaData""", """controllers.UserController.getUserFatcaData"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getUserBankData""", """controllers.UserController.getUserBankData"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getUserAddressData""", """controllers.UserController.getUserAddressData"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getUserNomineeData""", """controllers.UserController.getUserNomineeData"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:4
  private[this] lazy val controllers_LoginController_getLoginToken0_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_LoginController_getLoginToken0_invoker = createInvoker(
    LoginController_1.getLoginToken,
    HandlerDef(this.getClass.getClassLoader,
      "user",
      "controllers.LoginController",
      "getLoginToken",
      Nil,
      "POST",
      """Login""",
      this.prefix + """login"""
    )
  )

  // @LINE:5
  private[this] lazy val controllers_LoginController_signup1_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login/signup")))
  )
  private[this] lazy val controllers_LoginController_signup1_invoker = createInvoker(
    LoginController_1.signup,
    HandlerDef(this.getClass.getClassLoader,
      "user",
      "controllers.LoginController",
      "signup",
      Nil,
      "POST",
      """""",
      this.prefix + """login/signup"""
    )
  )

  // @LINE:6
  private[this] lazy val controllers_LoginController_checkUsernameInDB2_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("checkUsernameInDB")))
  )
  private[this] lazy val controllers_LoginController_checkUsernameInDB2_invoker = createInvoker(
    LoginController_1.checkUsernameInDB,
    HandlerDef(this.getClass.getClassLoader,
      "user",
      "controllers.LoginController",
      "checkUsernameInDB",
      Nil,
      "POST",
      """""",
      this.prefix + """checkUsernameInDB"""
    )
  )

  // @LINE:7
  private[this] lazy val controllers_UserController_getFirstName3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getFirstName")))
  )
  private[this] lazy val controllers_UserController_getFirstName3_invoker = createInvoker(
    UserController_0.getFirstName,
    HandlerDef(this.getClass.getClassLoader,
      "user",
      "controllers.UserController",
      "getFirstName",
      Nil,
      "GET",
      """""",
      this.prefix + """getFirstName"""
    )
  )

  // @LINE:8
  private[this] lazy val controllers_UserController_isUserVarified4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("isUserVarified")))
  )
  private[this] lazy val controllers_UserController_isUserVarified4_invoker = createInvoker(
    UserController_0.isUserVarified,
    HandlerDef(this.getClass.getClassLoader,
      "user",
      "controllers.UserController",
      "isUserVarified",
      Nil,
      "GET",
      """""",
      this.prefix + """isUserVarified"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_UserController_panCheck5_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("panCheck")))
  )
  private[this] lazy val controllers_UserController_panCheck5_invoker = createInvoker(
    UserController_0.panCheck,
    HandlerDef(this.getClass.getClassLoader,
      "user",
      "controllers.UserController",
      "panCheck",
      Nil,
      "POST",
      """""",
      this.prefix + """panCheck"""
    )
  )

  // @LINE:11
  private[this] lazy val controllers_UserController_panUpdate6_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("panUpdate")))
  )
  private[this] lazy val controllers_UserController_panUpdate6_invoker = createInvoker(
    UserController_0.panUpdate,
    HandlerDef(this.getClass.getClassLoader,
      "user",
      "controllers.UserController",
      "panUpdate",
      Nil,
      "POST",
      """""",
      this.prefix + """panUpdate"""
    )
  )

  // @LINE:12
  private[this] lazy val controllers_UserController_mobUpdate7_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("mobUpdate")))
  )
  private[this] lazy val controllers_UserController_mobUpdate7_invoker = createInvoker(
    UserController_0.mobUpdate,
    HandlerDef(this.getClass.getClassLoader,
      "user",
      "controllers.UserController",
      "mobUpdate",
      Nil,
      "POST",
      """""",
      this.prefix + """mobUpdate"""
    )
  )

  // @LINE:13
  private[this] lazy val controllers_KYCController_getDmtIds8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getDmtIds")))
  )
  private[this] lazy val controllers_KYCController_getDmtIds8_invoker = createInvoker(
    KYCController_2.getDmtIds,
    HandlerDef(this.getClass.getClassLoader,
      "user",
      "controllers.KYCController",
      "getDmtIds",
      Nil,
      "GET",
      """""",
      this.prefix + """getDmtIds"""
    )
  )

  // @LINE:14
  private[this] lazy val controllers_KYCController_updateFilePath9_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateFilePath")))
  )
  private[this] lazy val controllers_KYCController_updateFilePath9_invoker = createInvoker(
    KYCController_2.updateFilePath,
    HandlerDef(this.getClass.getClassLoader,
      "user",
      "controllers.KYCController",
      "updateFilePath",
      Nil,
      "POST",
      """""",
      this.prefix + """updateFilePath"""
    )
  )

  // @LINE:17
  private[this] lazy val controllers_KYCController_checkKYCFromPAN10_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("checkKYC")))
  )
  private[this] lazy val controllers_KYCController_checkKYCFromPAN10_invoker = createInvoker(
    KYCController_2.checkKYCFromPAN,
    HandlerDef(this.getClass.getClassLoader,
      "user",
      "controllers.KYCController",
      "checkKYCFromPAN",
      Nil,
      "POST",
      """KYC""",
      this.prefix + """checkKYC"""
    )
  )

  // @LINE:18
  private[this] lazy val controllers_KYCController_checkKycStatus11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("checkKycStatus")))
  )
  private[this] lazy val controllers_KYCController_checkKycStatus11_invoker = createInvoker(
    KYCController_2.checkKycStatus,
    HandlerDef(this.getClass.getClassLoader,
      "user",
      "controllers.KYCController",
      "checkKycStatus",
      Nil,
      "GET",
      """""",
      this.prefix + """checkKycStatus"""
    )
  )

  // @LINE:19
  private[this] lazy val controllers_KYCController_updateKycStatus12_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateKycStatus")))
  )
  private[this] lazy val controllers_KYCController_updateKycStatus12_invoker = createInvoker(
    KYCController_2.updateKycStatus,
    HandlerDef(this.getClass.getClassLoader,
      "user",
      "controllers.KYCController",
      "updateKycStatus",
      Nil,
      "POST",
      """""",
      this.prefix + """updateKycStatus"""
    )
  )

  // @LINE:20
  private[this] lazy val controllers_KYCController_checkIfBankUpdated13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("checkIfBankUpdated")))
  )
  private[this] lazy val controllers_KYCController_checkIfBankUpdated13_invoker = createInvoker(
    KYCController_2.checkIfBankUpdated,
    HandlerDef(this.getClass.getClassLoader,
      "user",
      "controllers.KYCController",
      "checkIfBankUpdated",
      Nil,
      "GET",
      """""",
      this.prefix + """checkIfBankUpdated"""
    )
  )

  // @LINE:21
  private[this] lazy val controllers_KYCController_checkIfFatcaUpdated14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("checkIfFatcaUpdated")))
  )
  private[this] lazy val controllers_KYCController_checkIfFatcaUpdated14_invoker = createInvoker(
    KYCController_2.checkIfFatcaUpdated,
    HandlerDef(this.getClass.getClassLoader,
      "user",
      "controllers.KYCController",
      "checkIfFatcaUpdated",
      Nil,
      "GET",
      """""",
      this.prefix + """checkIfFatcaUpdated"""
    )
  )

  // @LINE:22
  private[this] lazy val controllers_KYCController_checkIfBasicDetailsUpdated15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("checkIfBasicDetailsUpdated")))
  )
  private[this] lazy val controllers_KYCController_checkIfBasicDetailsUpdated15_invoker = createInvoker(
    KYCController_2.checkIfBasicDetailsUpdated,
    HandlerDef(this.getClass.getClassLoader,
      "user",
      "controllers.KYCController",
      "checkIfBasicDetailsUpdated",
      Nil,
      "GET",
      """""",
      this.prefix + """checkIfBasicDetailsUpdated"""
    )
  )

  // @LINE:23
  private[this] lazy val controllers_KYCController_checkIfAddressUpdated16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("checkIfAddressUpdated")))
  )
  private[this] lazy val controllers_KYCController_checkIfAddressUpdated16_invoker = createInvoker(
    KYCController_2.checkIfAddressUpdated,
    HandlerDef(this.getClass.getClassLoader,
      "user",
      "controllers.KYCController",
      "checkIfAddressUpdated",
      Nil,
      "GET",
      """""",
      this.prefix + """checkIfAddressUpdated"""
    )
  )

  // @LINE:25
  private[this] lazy val controllers_UserController_getUserData17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getUserData")))
  )
  private[this] lazy val controllers_UserController_getUserData17_invoker = createInvoker(
    UserController_0.getUserData,
    HandlerDef(this.getClass.getClassLoader,
      "user",
      "controllers.UserController",
      "getUserData",
      Nil,
      "GET",
      """""",
      this.prefix + """getUserData"""
    )
  )

  // @LINE:26
  private[this] lazy val controllers_UserController_postUserData18_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("postUserData")))
  )
  private[this] lazy val controllers_UserController_postUserData18_invoker = createInvoker(
    UserController_0.postUserData,
    HandlerDef(this.getClass.getClassLoader,
      "user",
      "controllers.UserController",
      "postUserData",
      Nil,
      "POST",
      """""",
      this.prefix + """postUserData"""
    )
  )

  // @LINE:27
  private[this] lazy val controllers_UserController_postUserBasicData19_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("postUserBasicData")))
  )
  private[this] lazy val controllers_UserController_postUserBasicData19_invoker = createInvoker(
    UserController_0.postUserBasicData,
    HandlerDef(this.getClass.getClassLoader,
      "user",
      "controllers.UserController",
      "postUserBasicData",
      Nil,
      "POST",
      """""",
      this.prefix + """postUserBasicData"""
    )
  )

  // @LINE:28
  private[this] lazy val controllers_UserController_postUserAddressData20_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("postUserAddressData")))
  )
  private[this] lazy val controllers_UserController_postUserAddressData20_invoker = createInvoker(
    UserController_0.postUserAddressData,
    HandlerDef(this.getClass.getClassLoader,
      "user",
      "controllers.UserController",
      "postUserAddressData",
      Nil,
      "POST",
      """""",
      this.prefix + """postUserAddressData"""
    )
  )

  // @LINE:29
  private[this] lazy val controllers_UserController_postUserFatcaData21_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("postUserFatcaData")))
  )
  private[this] lazy val controllers_UserController_postUserFatcaData21_invoker = createInvoker(
    UserController_0.postUserFatcaData,
    HandlerDef(this.getClass.getClassLoader,
      "user",
      "controllers.UserController",
      "postUserFatcaData",
      Nil,
      "POST",
      """""",
      this.prefix + """postUserFatcaData"""
    )
  )

  // @LINE:30
  private[this] lazy val controllers_UserController_postUserBankData22_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("postUserBankData")))
  )
  private[this] lazy val controllers_UserController_postUserBankData22_invoker = createInvoker(
    UserController_0.postUserBankData,
    HandlerDef(this.getClass.getClassLoader,
      "user",
      "controllers.UserController",
      "postUserBankData",
      Nil,
      "POST",
      """""",
      this.prefix + """postUserBankData"""
    )
  )

  // @LINE:31
  private[this] lazy val controllers_UserController_postUserNomineeData23_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("postUserNomineeData")))
  )
  private[this] lazy val controllers_UserController_postUserNomineeData23_invoker = createInvoker(
    UserController_0.postUserNomineeData,
    HandlerDef(this.getClass.getClassLoader,
      "user",
      "controllers.UserController",
      "postUserNomineeData",
      Nil,
      "POST",
      """""",
      this.prefix + """postUserNomineeData"""
    )
  )

  // @LINE:34
  private[this] lazy val controllers_UserController_getUserDetails24_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getUserDetails")))
  )
  private[this] lazy val controllers_UserController_getUserDetails24_invoker = createInvoker(
    UserController_0.getUserDetails,
    HandlerDef(this.getClass.getClassLoader,
      "user",
      "controllers.UserController",
      "getUserDetails",
      Nil,
      "GET",
      """""",
      this.prefix + """getUserDetails"""
    )
  )

  // @LINE:35
  private[this] lazy val controllers_UserController_getUserBasicData25_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getUserBasicData")))
  )
  private[this] lazy val controllers_UserController_getUserBasicData25_invoker = createInvoker(
    UserController_0.getUserBasicData,
    HandlerDef(this.getClass.getClassLoader,
      "user",
      "controllers.UserController",
      "getUserBasicData",
      Nil,
      "GET",
      """""",
      this.prefix + """getUserBasicData"""
    )
  )

  // @LINE:36
  private[this] lazy val controllers_UserController_getUserFatcaData26_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getUserFatcaData")))
  )
  private[this] lazy val controllers_UserController_getUserFatcaData26_invoker = createInvoker(
    UserController_0.getUserFatcaData,
    HandlerDef(this.getClass.getClassLoader,
      "user",
      "controllers.UserController",
      "getUserFatcaData",
      Nil,
      "GET",
      """""",
      this.prefix + """getUserFatcaData"""
    )
  )

  // @LINE:37
  private[this] lazy val controllers_UserController_getUserBankData27_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getUserBankData")))
  )
  private[this] lazy val controllers_UserController_getUserBankData27_invoker = createInvoker(
    UserController_0.getUserBankData,
    HandlerDef(this.getClass.getClassLoader,
      "user",
      "controllers.UserController",
      "getUserBankData",
      Nil,
      "GET",
      """""",
      this.prefix + """getUserBankData"""
    )
  )

  // @LINE:38
  private[this] lazy val controllers_UserController_getUserAddressData28_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getUserAddressData")))
  )
  private[this] lazy val controllers_UserController_getUserAddressData28_invoker = createInvoker(
    UserController_0.getUserAddressData,
    HandlerDef(this.getClass.getClassLoader,
      "user",
      "controllers.UserController",
      "getUserAddressData",
      Nil,
      "GET",
      """""",
      this.prefix + """getUserAddressData"""
    )
  )

  // @LINE:39
  private[this] lazy val controllers_UserController_getUserNomineeData29_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getUserNomineeData")))
  )
  private[this] lazy val controllers_UserController_getUserNomineeData29_invoker = createInvoker(
    UserController_0.getUserNomineeData,
    HandlerDef(this.getClass.getClassLoader,
      "user",
      "controllers.UserController",
      "getUserNomineeData",
      Nil,
      "GET",
      """""",
      this.prefix + """getUserNomineeData"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:4
    case controllers_LoginController_getLoginToken0_route(params) =>
      call { 
        controllers_LoginController_getLoginToken0_invoker.call(LoginController_1.getLoginToken)
      }
  
    // @LINE:5
    case controllers_LoginController_signup1_route(params) =>
      call { 
        controllers_LoginController_signup1_invoker.call(LoginController_1.signup)
      }
  
    // @LINE:6
    case controllers_LoginController_checkUsernameInDB2_route(params) =>
      call { 
        controllers_LoginController_checkUsernameInDB2_invoker.call(LoginController_1.checkUsernameInDB)
      }
  
    // @LINE:7
    case controllers_UserController_getFirstName3_route(params) =>
      call { 
        controllers_UserController_getFirstName3_invoker.call(UserController_0.getFirstName)
      }
  
    // @LINE:8
    case controllers_UserController_isUserVarified4_route(params) =>
      call { 
        controllers_UserController_isUserVarified4_invoker.call(UserController_0.isUserVarified)
      }
  
    // @LINE:10
    case controllers_UserController_panCheck5_route(params) =>
      call { 
        controllers_UserController_panCheck5_invoker.call(UserController_0.panCheck)
      }
  
    // @LINE:11
    case controllers_UserController_panUpdate6_route(params) =>
      call { 
        controllers_UserController_panUpdate6_invoker.call(UserController_0.panUpdate)
      }
  
    // @LINE:12
    case controllers_UserController_mobUpdate7_route(params) =>
      call { 
        controllers_UserController_mobUpdate7_invoker.call(UserController_0.mobUpdate)
      }
  
    // @LINE:13
    case controllers_KYCController_getDmtIds8_route(params) =>
      call { 
        controllers_KYCController_getDmtIds8_invoker.call(KYCController_2.getDmtIds)
      }
  
    // @LINE:14
    case controllers_KYCController_updateFilePath9_route(params) =>
      call { 
        controllers_KYCController_updateFilePath9_invoker.call(KYCController_2.updateFilePath)
      }
  
    // @LINE:17
    case controllers_KYCController_checkKYCFromPAN10_route(params) =>
      call { 
        controllers_KYCController_checkKYCFromPAN10_invoker.call(KYCController_2.checkKYCFromPAN)
      }
  
    // @LINE:18
    case controllers_KYCController_checkKycStatus11_route(params) =>
      call { 
        controllers_KYCController_checkKycStatus11_invoker.call(KYCController_2.checkKycStatus)
      }
  
    // @LINE:19
    case controllers_KYCController_updateKycStatus12_route(params) =>
      call { 
        controllers_KYCController_updateKycStatus12_invoker.call(KYCController_2.updateKycStatus)
      }
  
    // @LINE:20
    case controllers_KYCController_checkIfBankUpdated13_route(params) =>
      call { 
        controllers_KYCController_checkIfBankUpdated13_invoker.call(KYCController_2.checkIfBankUpdated)
      }
  
    // @LINE:21
    case controllers_KYCController_checkIfFatcaUpdated14_route(params) =>
      call { 
        controllers_KYCController_checkIfFatcaUpdated14_invoker.call(KYCController_2.checkIfFatcaUpdated)
      }
  
    // @LINE:22
    case controllers_KYCController_checkIfBasicDetailsUpdated15_route(params) =>
      call { 
        controllers_KYCController_checkIfBasicDetailsUpdated15_invoker.call(KYCController_2.checkIfBasicDetailsUpdated)
      }
  
    // @LINE:23
    case controllers_KYCController_checkIfAddressUpdated16_route(params) =>
      call { 
        controllers_KYCController_checkIfAddressUpdated16_invoker.call(KYCController_2.checkIfAddressUpdated)
      }
  
    // @LINE:25
    case controllers_UserController_getUserData17_route(params) =>
      call { 
        controllers_UserController_getUserData17_invoker.call(UserController_0.getUserData)
      }
  
    // @LINE:26
    case controllers_UserController_postUserData18_route(params) =>
      call { 
        controllers_UserController_postUserData18_invoker.call(UserController_0.postUserData)
      }
  
    // @LINE:27
    case controllers_UserController_postUserBasicData19_route(params) =>
      call { 
        controllers_UserController_postUserBasicData19_invoker.call(UserController_0.postUserBasicData)
      }
  
    // @LINE:28
    case controllers_UserController_postUserAddressData20_route(params) =>
      call { 
        controllers_UserController_postUserAddressData20_invoker.call(UserController_0.postUserAddressData)
      }
  
    // @LINE:29
    case controllers_UserController_postUserFatcaData21_route(params) =>
      call { 
        controllers_UserController_postUserFatcaData21_invoker.call(UserController_0.postUserFatcaData)
      }
  
    // @LINE:30
    case controllers_UserController_postUserBankData22_route(params) =>
      call { 
        controllers_UserController_postUserBankData22_invoker.call(UserController_0.postUserBankData)
      }
  
    // @LINE:31
    case controllers_UserController_postUserNomineeData23_route(params) =>
      call { 
        controllers_UserController_postUserNomineeData23_invoker.call(UserController_0.postUserNomineeData)
      }
  
    // @LINE:34
    case controllers_UserController_getUserDetails24_route(params) =>
      call { 
        controllers_UserController_getUserDetails24_invoker.call(UserController_0.getUserDetails)
      }
  
    // @LINE:35
    case controllers_UserController_getUserBasicData25_route(params) =>
      call { 
        controllers_UserController_getUserBasicData25_invoker.call(UserController_0.getUserBasicData)
      }
  
    // @LINE:36
    case controllers_UserController_getUserFatcaData26_route(params) =>
      call { 
        controllers_UserController_getUserFatcaData26_invoker.call(UserController_0.getUserFatcaData)
      }
  
    // @LINE:37
    case controllers_UserController_getUserBankData27_route(params) =>
      call { 
        controllers_UserController_getUserBankData27_invoker.call(UserController_0.getUserBankData)
      }
  
    // @LINE:38
    case controllers_UserController_getUserAddressData28_route(params) =>
      call { 
        controllers_UserController_getUserAddressData28_invoker.call(UserController_0.getUserAddressData)
      }
  
    // @LINE:39
    case controllers_UserController_getUserNomineeData29_route(params) =>
      call { 
        controllers_UserController_getUserNomineeData29_invoker.call(UserController_0.getUserNomineeData)
      }
  }
}
