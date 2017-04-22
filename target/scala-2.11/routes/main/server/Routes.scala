
// @GENERATOR:play-routes-compiler
// @SOURCE:D:/workspace/fincash-backend/conf/server.routes
// @DATE:Thu Apr 20 15:53:39 IST 2017

package server

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:2
  UserController_0: controllers.UserController,
  // @LINE:3
  LoginController_2: controllers.LoginController,
  // @LINE:7
  Application_1: controllers.Application,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:2
    UserController_0: controllers.UserController,
    // @LINE:3
    LoginController_2: controllers.LoginController,
    // @LINE:7
    Application_1: controllers.Application
  ) = this(errorHandler, UserController_0, LoginController_2, Application_1, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    server.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, UserController_0, LoginController_2, Application_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """postUserEkycData""", """controllers.UserController.postUserEkycData"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """socialLogin""", """controllers.LoginController.socialLogin"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """activateUser""", """controllers.UserController.activateUser"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """bseRegistration""", """controllers.UserController.registerInBSE"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getJVMUsage""", """controllers.Application.getJVMUsage"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:2
  private[this] lazy val controllers_UserController_postUserEkycData0_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("postUserEkycData")))
  )
  private[this] lazy val controllers_UserController_postUserEkycData0_invoker = createInvoker(
    UserController_0.postUserEkycData,
    HandlerDef(this.getClass.getClassLoader,
      "server",
      "controllers.UserController",
      "postUserEkycData",
      Nil,
      "POST",
      """""",
      this.prefix + """postUserEkycData"""
    )
  )

  // @LINE:3
  private[this] lazy val controllers_LoginController_socialLogin1_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("socialLogin")))
  )
  private[this] lazy val controllers_LoginController_socialLogin1_invoker = createInvoker(
    LoginController_2.socialLogin,
    HandlerDef(this.getClass.getClassLoader,
      "server",
      "controllers.LoginController",
      "socialLogin",
      Nil,
      "POST",
      """""",
      this.prefix + """socialLogin"""
    )
  )

  // @LINE:4
  private[this] lazy val controllers_UserController_activateUser2_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("activateUser")))
  )
  private[this] lazy val controllers_UserController_activateUser2_invoker = createInvoker(
    UserController_0.activateUser,
    HandlerDef(this.getClass.getClassLoader,
      "server",
      "controllers.UserController",
      "activateUser",
      Nil,
      "POST",
      """""",
      this.prefix + """activateUser"""
    )
  )

  // @LINE:5
  private[this] lazy val controllers_UserController_registerInBSE3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("bseRegistration")))
  )
  private[this] lazy val controllers_UserController_registerInBSE3_invoker = createInvoker(
    UserController_0.registerInBSE,
    HandlerDef(this.getClass.getClassLoader,
      "server",
      "controllers.UserController",
      "registerInBSE",
      Nil,
      "POST",
      """""",
      this.prefix + """bseRegistration"""
    )
  )

  // @LINE:7
  private[this] lazy val controllers_Application_getJVMUsage4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getJVMUsage")))
  )
  private[this] lazy val controllers_Application_getJVMUsage4_invoker = createInvoker(
    Application_1.getJVMUsage,
    HandlerDef(this.getClass.getClassLoader,
      "server",
      "controllers.Application",
      "getJVMUsage",
      Nil,
      "GET",
      """""",
      this.prefix + """getJVMUsage"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:2
    case controllers_UserController_postUserEkycData0_route(params) =>
      call { 
        controllers_UserController_postUserEkycData0_invoker.call(UserController_0.postUserEkycData)
      }
  
    // @LINE:3
    case controllers_LoginController_socialLogin1_route(params) =>
      call { 
        controllers_LoginController_socialLogin1_invoker.call(LoginController_2.socialLogin)
      }
  
    // @LINE:4
    case controllers_UserController_activateUser2_route(params) =>
      call { 
        controllers_UserController_activateUser2_invoker.call(UserController_0.activateUser)
      }
  
    // @LINE:5
    case controllers_UserController_registerInBSE3_route(params) =>
      call { 
        controllers_UserController_registerInBSE3_invoker.call(UserController_0.registerInBSE)
      }
  
    // @LINE:7
    case controllers_Application_getJVMUsage4_route(params) =>
      call { 
        controllers_Application_getJVMUsage4_invoker.call(Application_1.getJVMUsage)
      }
  }
}
