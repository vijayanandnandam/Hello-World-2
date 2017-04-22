
// @GENERATOR:play-routes-compiler
// @SOURCE:D:/workspace/fincash-backend/conf/user.routes
// @DATE:Thu Apr 20 15:53:39 IST 2017

import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset

// @LINE:4
package controllers {

  // @LINE:4
  class ReverseLoginController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:4
    def getLoginToken(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "login")
    }
  
    // @LINE:6
    def checkUsernameInDB(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "checkUsernameInDB")
    }
  
    // @LINE:5
    def signup(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "login/signup")
    }
  
  }

  // @LINE:13
  class ReverseKYCController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:14
    def updateFilePath(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "updateFilePath")
    }
  
    // @LINE:18
    def checkKycStatus(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "checkKycStatus")
    }
  
    // @LINE:13
    def getDmtIds(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "getDmtIds")
    }
  
    // @LINE:23
    def checkIfAddressUpdated(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "checkIfAddressUpdated")
    }
  
    // @LINE:22
    def checkIfBasicDetailsUpdated(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "checkIfBasicDetailsUpdated")
    }
  
    // @LINE:17
    def checkKYCFromPAN(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "checkKYC")
    }
  
    // @LINE:19
    def updateKycStatus(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "updateKycStatus")
    }
  
    // @LINE:21
    def checkIfFatcaUpdated(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "checkIfFatcaUpdated")
    }
  
    // @LINE:20
    def checkIfBankUpdated(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "checkIfBankUpdated")
    }
  
  }

  // @LINE:7
  class ReverseUserController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:27
    def postUserBasicData(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "postUserBasicData")
    }
  
    // @LINE:11
    def panUpdate(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "panUpdate")
    }
  
    // @LINE:8
    def isUserVarified(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "isUserVarified")
    }
  
    // @LINE:35
    def getUserBasicData(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "getUserBasicData")
    }
  
    // @LINE:36
    def getUserFatcaData(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "getUserFatcaData")
    }
  
    // @LINE:29
    def postUserFatcaData(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "postUserFatcaData")
    }
  
    // @LINE:12
    def mobUpdate(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "mobUpdate")
    }
  
    // @LINE:34
    def getUserDetails(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "getUserDetails")
    }
  
    // @LINE:38
    def getUserAddressData(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "getUserAddressData")
    }
  
    // @LINE:28
    def postUserAddressData(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "postUserAddressData")
    }
  
    // @LINE:7
    def getFirstName(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "getFirstName")
    }
  
    // @LINE:25
    def getUserData(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "getUserData")
    }
  
    // @LINE:37
    def getUserBankData(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "getUserBankData")
    }
  
    // @LINE:26
    def postUserData(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "postUserData")
    }
  
    // @LINE:39
    def getUserNomineeData(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "getUserNomineeData")
    }
  
    // @LINE:31
    def postUserNomineeData(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "postUserNomineeData")
    }
  
    // @LINE:10
    def panCheck(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "panCheck")
    }
  
    // @LINE:30
    def postUserBankData(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "postUserBankData")
    }
  
  }


}
