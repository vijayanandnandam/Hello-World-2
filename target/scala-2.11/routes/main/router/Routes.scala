
// @GENERATOR:play-routes-compiler
// @SOURCE:D:/workspace/fincash-backend/conf/routes
// @DATE:Thu Apr 20 15:53:36 IST 2017

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:5
  secure_Routes_0: secure.Routes,
  // @LINE:6
  server_Routes_1: server.Routes,
  // @LINE:7
  nonsecure_Routes_2: nonsecure.Routes,
  // @LINE:10
  JWTController_3: controllers.JWTController,
  // @LINE:13
  BankController_0: controllers.BankController,
  // @LINE:18
  MessageSenderController_2: controllers.MessageSenderController,
  // @LINE:23
  Assets_4: controllers.Assets,
  // @LINE:26
  PasswordController_5: controllers.PasswordController,
  // @LINE:30
  TestController_1: controllers.TestController,
  // @LINE:31
  SocketTestController_6: controllers.SocketTestController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:5
    secure_Routes_0: secure.Routes,
    // @LINE:6
    server_Routes_1: server.Routes,
    // @LINE:7
    nonsecure_Routes_2: nonsecure.Routes,
    // @LINE:10
    JWTController_3: controllers.JWTController,
    // @LINE:13
    BankController_0: controllers.BankController,
    // @LINE:18
    MessageSenderController_2: controllers.MessageSenderController,
    // @LINE:23
    Assets_4: controllers.Assets,
    // @LINE:26
    PasswordController_5: controllers.PasswordController,
    // @LINE:30
    TestController_1: controllers.TestController,
    // @LINE:31
    SocketTestController_6: controllers.SocketTestController
  ) = this(errorHandler, secure_Routes_0, server_Routes_1, nonsecure_Routes_2, JWTController_3, BankController_0, MessageSenderController_2, Assets_4, PasswordController_5, TestController_1, SocketTestController_6, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, secure_Routes_0, server_Routes_1, nonsecure_Routes_2, JWTController_3, BankController_0, MessageSenderController_2, Assets_4, PasswordController_5, TestController_1, SocketTestController_6, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    prefixed_secure_Routes_0_0.router.documentation,
    prefixed_server_Routes_1_1.router.documentation,
    prefixed_nonsecure_Routes_2_2.router.documentation,
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """refreshToken""", """controllers.JWTController.refreshToken"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getbanks""", """controllers.BankController.searchBanks"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """indexBanks""", """controllers.BankController.addBanks"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """messageStatus""", """controllers.MessageSenderController.messageStatus"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getOTPStatus/""" + "$" + """messageId<[^/]+>""", """controllers.MessageSenderController.getMessageStatus(messageId:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.at(path:String = "/public", file:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """forgotPasswordMail""", """controllers.PasswordController.sendPassResetMail"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getMailKeyValidity""", """controllers.PasswordController.getMailKeyValidity"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """resetPassword""", """controllers.PasswordController.resetPassword"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """hc""", """controllers.TestController.healthCheck()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """socket""", """controllers.SocketTestController.socket"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:5
  private[this] val prefixed_secure_Routes_0_0 = Include(secure_Routes_0.withPrefix(this.prefix + (if (this.prefix.endsWith("/")) "" else "/") + "secure"))

  // @LINE:6
  private[this] val prefixed_server_Routes_1_1 = Include(server_Routes_1.withPrefix(this.prefix + (if (this.prefix.endsWith("/")) "" else "/") + "server"))

  // @LINE:7
  private[this] val prefixed_nonsecure_Routes_2_2 = Include(nonsecure_Routes_2.withPrefix(this.prefix + (if (this.prefix.endsWith("/")) "" else "/") + ""))

  // @LINE:10
  private[this] lazy val controllers_JWTController_refreshToken3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("refreshToken")))
  )
  private[this] lazy val controllers_JWTController_refreshToken3_invoker = createInvoker(
    JWTController_3.refreshToken,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.JWTController",
      "refreshToken",
      Nil,
      "POST",
      """""",
      this.prefix + """refreshToken"""
    )
  )

  // @LINE:13
  private[this] lazy val controllers_BankController_searchBanks4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getbanks")))
  )
  private[this] lazy val controllers_BankController_searchBanks4_invoker = createInvoker(
    BankController_0.searchBanks,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BankController",
      "searchBanks",
      Nil,
      "POST",
      """IFSC""",
      this.prefix + """getbanks"""
    )
  )

  // @LINE:14
  private[this] lazy val controllers_BankController_addBanks5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("indexBanks")))
  )
  private[this] lazy val controllers_BankController_addBanks5_invoker = createInvoker(
    BankController_0.addBanks,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BankController",
      "addBanks",
      Nil,
      "GET",
      """""",
      this.prefix + """indexBanks"""
    )
  )

  // @LINE:18
  private[this] lazy val controllers_MessageSenderController_messageStatus6_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("messageStatus")))
  )
  private[this] lazy val controllers_MessageSenderController_messageStatus6_invoker = createInvoker(
    MessageSenderController_2.messageStatus,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MessageSenderController",
      "messageStatus",
      Nil,
      "POST",
      """KYC
POST    /getKycData                             controllers.KYCController.getKycData""",
      this.prefix + """messageStatus"""
    )
  )

  // @LINE:19
  private[this] lazy val controllers_MessageSenderController_getMessageStatus7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getOTPStatus/"), DynamicPart("messageId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_MessageSenderController_getMessageStatus7_invoker = createInvoker(
    MessageSenderController_2.getMessageStatus(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MessageSenderController",
      "getMessageStatus",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """getOTPStatus/""" + "$" + """messageId<[^/]+>"""
    )
  )

  // @LINE:23
  private[this] lazy val controllers_Assets_at8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_at8_invoker = createInvoker(
    Assets_4.at(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/""" + "$" + """file<.+>"""
    )
  )

  // @LINE:26
  private[this] lazy val controllers_PasswordController_sendPassResetMail9_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("forgotPasswordMail")))
  )
  private[this] lazy val controllers_PasswordController_sendPassResetMail9_invoker = createInvoker(
    PasswordController_5.sendPassResetMail,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PasswordController",
      "sendPassResetMail",
      Nil,
      "POST",
      """ForgotPassword""",
      this.prefix + """forgotPasswordMail"""
    )
  )

  // @LINE:27
  private[this] lazy val controllers_PasswordController_getMailKeyValidity10_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getMailKeyValidity")))
  )
  private[this] lazy val controllers_PasswordController_getMailKeyValidity10_invoker = createInvoker(
    PasswordController_5.getMailKeyValidity,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PasswordController",
      "getMailKeyValidity",
      Nil,
      "POST",
      """""",
      this.prefix + """getMailKeyValidity"""
    )
  )

  // @LINE:28
  private[this] lazy val controllers_PasswordController_resetPassword11_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("resetPassword")))
  )
  private[this] lazy val controllers_PasswordController_resetPassword11_invoker = createInvoker(
    PasswordController_5.resetPassword,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PasswordController",
      "resetPassword",
      Nil,
      "POST",
      """""",
      this.prefix + """resetPassword"""
    )
  )

  // @LINE:30
  private[this] lazy val controllers_TestController_healthCheck12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("hc")))
  )
  private[this] lazy val controllers_TestController_healthCheck12_invoker = createInvoker(
    TestController_1.healthCheck(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TestController",
      "healthCheck",
      Nil,
      "GET",
      """""",
      this.prefix + """hc"""
    )
  )

  // @LINE:31
  private[this] lazy val controllers_SocketTestController_socket13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("socket")))
  )
  private[this] lazy val controllers_SocketTestController_socket13_invoker = createInvoker(
    SocketTestController_6.socket,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SocketTestController",
      "socket",
      Nil,
      "GET",
      """""",
      this.prefix + """socket"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:5
    case prefixed_secure_Routes_0_0(handler) => handler
  
    // @LINE:6
    case prefixed_server_Routes_1_1(handler) => handler
  
    // @LINE:7
    case prefixed_nonsecure_Routes_2_2(handler) => handler
  
    // @LINE:10
    case controllers_JWTController_refreshToken3_route(params) =>
      call { 
        controllers_JWTController_refreshToken3_invoker.call(JWTController_3.refreshToken)
      }
  
    // @LINE:13
    case controllers_BankController_searchBanks4_route(params) =>
      call { 
        controllers_BankController_searchBanks4_invoker.call(BankController_0.searchBanks)
      }
  
    // @LINE:14
    case controllers_BankController_addBanks5_route(params) =>
      call { 
        controllers_BankController_addBanks5_invoker.call(BankController_0.addBanks)
      }
  
    // @LINE:18
    case controllers_MessageSenderController_messageStatus6_route(params) =>
      call { 
        controllers_MessageSenderController_messageStatus6_invoker.call(MessageSenderController_2.messageStatus)
      }
  
    // @LINE:19
    case controllers_MessageSenderController_getMessageStatus7_route(params) =>
      call(params.fromPath[String]("messageId", None)) { (messageId) =>
        controllers_MessageSenderController_getMessageStatus7_invoker.call(MessageSenderController_2.getMessageStatus(messageId))
      }
  
    // @LINE:23
    case controllers_Assets_at8_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at8_invoker.call(Assets_4.at(path, file))
      }
  
    // @LINE:26
    case controllers_PasswordController_sendPassResetMail9_route(params) =>
      call { 
        controllers_PasswordController_sendPassResetMail9_invoker.call(PasswordController_5.sendPassResetMail)
      }
  
    // @LINE:27
    case controllers_PasswordController_getMailKeyValidity10_route(params) =>
      call { 
        controllers_PasswordController_getMailKeyValidity10_invoker.call(PasswordController_5.getMailKeyValidity)
      }
  
    // @LINE:28
    case controllers_PasswordController_resetPassword11_route(params) =>
      call { 
        controllers_PasswordController_resetPassword11_invoker.call(PasswordController_5.resetPassword)
      }
  
    // @LINE:30
    case controllers_TestController_healthCheck12_route(params) =>
      call { 
        controllers_TestController_healthCheck12_invoker.call(TestController_1.healthCheck())
      }
  
    // @LINE:31
    case controllers_SocketTestController_socket13_route(params) =>
      call { 
        controllers_SocketTestController_socket13_invoker.call(SocketTestController_6.socket)
      }
  }
}
