
// @GENERATOR:play-routes-compiler
// @SOURCE:D:/workspace/fincash-backend/conf/otp.routes
// @DATE:Thu Apr 20 15:53:38 IST 2017

package otp

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:1
  MessageSenderController_0: controllers.MessageSenderController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:1
    MessageSenderController_0: controllers.MessageSenderController
  ) = this(errorHandler, MessageSenderController_0, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    otp.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, MessageSenderController_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """sendMessage/""" + "$" + """from<[^/]+>/""" + "$" + """to<[^/]+>/""" + "$" + """message<[^/]+>""", """controllers.MessageSenderController.send(from:String, to:String, message:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """generateOTP/""" + "$" + """purpose<[^/]+>/""" + "$" + """from<[^/]+>/""" + "$" + """to<[^/]+>/""" + "$" + """message<[^/]+>""", """controllers.MessageSenderController.generateOTP(purpose:String, from:String, to:String, message:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """validateOTP/""" + "$" + """purpose<[^/]+>/""" + "$" + """otp<[^/]+>""", """controllers.MessageSenderController.validateOTP(purpose:String, otp:String)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:1
  private[this] lazy val controllers_MessageSenderController_send0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("sendMessage/"), DynamicPart("from", """[^/]+""",true), StaticPart("/"), DynamicPart("to", """[^/]+""",true), StaticPart("/"), DynamicPart("message", """[^/]+""",true)))
  )
  private[this] lazy val controllers_MessageSenderController_send0_invoker = createInvoker(
    MessageSenderController_0.send(fakeValue[String], fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "otp",
      "controllers.MessageSenderController",
      "send",
      Seq(classOf[String], classOf[String], classOf[String]),
      "GET",
      """""",
      this.prefix + """sendMessage/""" + "$" + """from<[^/]+>/""" + "$" + """to<[^/]+>/""" + "$" + """message<[^/]+>"""
    )
  )

  // @LINE:2
  private[this] lazy val controllers_MessageSenderController_generateOTP1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("generateOTP/"), DynamicPart("purpose", """[^/]+""",true), StaticPart("/"), DynamicPart("from", """[^/]+""",true), StaticPart("/"), DynamicPart("to", """[^/]+""",true), StaticPart("/"), DynamicPart("message", """[^/]+""",true)))
  )
  private[this] lazy val controllers_MessageSenderController_generateOTP1_invoker = createInvoker(
    MessageSenderController_0.generateOTP(fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "otp",
      "controllers.MessageSenderController",
      "generateOTP",
      Seq(classOf[String], classOf[String], classOf[String], classOf[String]),
      "GET",
      """""",
      this.prefix + """generateOTP/""" + "$" + """purpose<[^/]+>/""" + "$" + """from<[^/]+>/""" + "$" + """to<[^/]+>/""" + "$" + """message<[^/]+>"""
    )
  )

  // @LINE:3
  private[this] lazy val controllers_MessageSenderController_validateOTP2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("validateOTP/"), DynamicPart("purpose", """[^/]+""",true), StaticPart("/"), DynamicPart("otp", """[^/]+""",true)))
  )
  private[this] lazy val controllers_MessageSenderController_validateOTP2_invoker = createInvoker(
    MessageSenderController_0.validateOTP(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "otp",
      "controllers.MessageSenderController",
      "validateOTP",
      Seq(classOf[String], classOf[String]),
      "GET",
      """""",
      this.prefix + """validateOTP/""" + "$" + """purpose<[^/]+>/""" + "$" + """otp<[^/]+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:1
    case controllers_MessageSenderController_send0_route(params) =>
      call(params.fromPath[String]("from", None), params.fromPath[String]("to", None), params.fromPath[String]("message", None)) { (from, to, message) =>
        controllers_MessageSenderController_send0_invoker.call(MessageSenderController_0.send(from, to, message))
      }
  
    // @LINE:2
    case controllers_MessageSenderController_generateOTP1_route(params) =>
      call(params.fromPath[String]("purpose", None), params.fromPath[String]("from", None), params.fromPath[String]("to", None), params.fromPath[String]("message", None)) { (purpose, from, to, message) =>
        controllers_MessageSenderController_generateOTP1_invoker.call(MessageSenderController_0.generateOTP(purpose, from, to, message))
      }
  
    // @LINE:3
    case controllers_MessageSenderController_validateOTP2_route(params) =>
      call(params.fromPath[String]("purpose", None), params.fromPath[String]("otp", None)) { (purpose, otp) =>
        controllers_MessageSenderController_validateOTP2_invoker.call(MessageSenderController_0.validateOTP(purpose, otp))
      }
  }
}
