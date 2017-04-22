
// @GENERATOR:play-routes-compiler
// @SOURCE:D:/workspace/fincash-backend/conf/user.routes
// @DATE:Thu Apr 20 15:53:39 IST 2017

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset

// @LINE:4
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:4
  class ReverseLoginController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:4
    def getLoginToken: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LoginController.getLoginToken",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
        }
      """
    )
  
    // @LINE:6
    def checkUsernameInDB: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LoginController.checkUsernameInDB",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "checkUsernameInDB"})
        }
      """
    )
  
    // @LINE:5
    def signup: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LoginController.signup",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "login/signup"})
        }
      """
    )
  
  }

  // @LINE:13
  class ReverseKYCController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:14
    def updateFilePath: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.KYCController.updateFilePath",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "updateFilePath"})
        }
      """
    )
  
    // @LINE:18
    def checkKycStatus: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.KYCController.checkKycStatus",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "checkKycStatus"})
        }
      """
    )
  
    // @LINE:13
    def getDmtIds: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.KYCController.getDmtIds",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "getDmtIds"})
        }
      """
    )
  
    // @LINE:23
    def checkIfAddressUpdated: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.KYCController.checkIfAddressUpdated",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "checkIfAddressUpdated"})
        }
      """
    )
  
    // @LINE:22
    def checkIfBasicDetailsUpdated: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.KYCController.checkIfBasicDetailsUpdated",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "checkIfBasicDetailsUpdated"})
        }
      """
    )
  
    // @LINE:17
    def checkKYCFromPAN: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.KYCController.checkKYCFromPAN",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "checkKYC"})
        }
      """
    )
  
    // @LINE:19
    def updateKycStatus: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.KYCController.updateKycStatus",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "updateKycStatus"})
        }
      """
    )
  
    // @LINE:21
    def checkIfFatcaUpdated: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.KYCController.checkIfFatcaUpdated",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "checkIfFatcaUpdated"})
        }
      """
    )
  
    // @LINE:20
    def checkIfBankUpdated: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.KYCController.checkIfBankUpdated",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "checkIfBankUpdated"})
        }
      """
    )
  
  }

  // @LINE:7
  class ReverseUserController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:27
    def postUserBasicData: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.postUserBasicData",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "postUserBasicData"})
        }
      """
    )
  
    // @LINE:11
    def panUpdate: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.panUpdate",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "panUpdate"})
        }
      """
    )
  
    // @LINE:8
    def isUserVarified: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.isUserVarified",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "isUserVarified"})
        }
      """
    )
  
    // @LINE:35
    def getUserBasicData: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.getUserBasicData",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "getUserBasicData"})
        }
      """
    )
  
    // @LINE:36
    def getUserFatcaData: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.getUserFatcaData",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "getUserFatcaData"})
        }
      """
    )
  
    // @LINE:29
    def postUserFatcaData: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.postUserFatcaData",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "postUserFatcaData"})
        }
      """
    )
  
    // @LINE:12
    def mobUpdate: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.mobUpdate",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "mobUpdate"})
        }
      """
    )
  
    // @LINE:34
    def getUserDetails: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.getUserDetails",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "getUserDetails"})
        }
      """
    )
  
    // @LINE:38
    def getUserAddressData: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.getUserAddressData",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "getUserAddressData"})
        }
      """
    )
  
    // @LINE:28
    def postUserAddressData: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.postUserAddressData",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "postUserAddressData"})
        }
      """
    )
  
    // @LINE:7
    def getFirstName: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.getFirstName",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "getFirstName"})
        }
      """
    )
  
    // @LINE:25
    def getUserData: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.getUserData",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "getUserData"})
        }
      """
    )
  
    // @LINE:37
    def getUserBankData: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.getUserBankData",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "getUserBankData"})
        }
      """
    )
  
    // @LINE:26
    def postUserData: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.postUserData",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "postUserData"})
        }
      """
    )
  
    // @LINE:39
    def getUserNomineeData: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.getUserNomineeData",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "getUserNomineeData"})
        }
      """
    )
  
    // @LINE:31
    def postUserNomineeData: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.postUserNomineeData",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "postUserNomineeData"})
        }
      """
    )
  
    // @LINE:10
    def panCheck: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.panCheck",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "panCheck"})
        }
      """
    )
  
    // @LINE:30
    def postUserBankData: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.postUserBankData",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "postUserBankData"})
        }
      """
    )
  
  }


}
