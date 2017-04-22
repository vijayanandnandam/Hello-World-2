
// @GENERATOR:play-routes-compiler
// @SOURCE:D:/workspace/fincash-backend/conf/mail.routes
// @DATE:Thu Apr 20 15:53:38 IST 2017

package mail

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:2
  CheckoutController_1: controllers.CheckoutController,
  // @LINE:3
  UserController_0: controllers.UserController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:2
    CheckoutController_1: controllers.CheckoutController,
    // @LINE:3
    UserController_0: controllers.UserController
  ) = this(errorHandler, CheckoutController_1, UserController_0, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    mail.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, CheckoutController_1, UserController_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """orderMail""", """controllers.CheckoutController.sendOrderMail"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """registrationMail""", """controllers.UserController.sendRegistrationMail"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:2
  private[this] lazy val controllers_CheckoutController_sendOrderMail0_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("orderMail")))
  )
  private[this] lazy val controllers_CheckoutController_sendOrderMail0_invoker = createInvoker(
    CheckoutController_1.sendOrderMail,
    HandlerDef(this.getClass.getClassLoader,
      "mail",
      "controllers.CheckoutController",
      "sendOrderMail",
      Nil,
      "POST",
      """""",
      this.prefix + """orderMail"""
    )
  )

  // @LINE:3
  private[this] lazy val controllers_UserController_sendRegistrationMail1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("registrationMail")))
  )
  private[this] lazy val controllers_UserController_sendRegistrationMail1_invoker = createInvoker(
    UserController_0.sendRegistrationMail,
    HandlerDef(this.getClass.getClassLoader,
      "mail",
      "controllers.UserController",
      "sendRegistrationMail",
      Nil,
      "GET",
      """""",
      this.prefix + """registrationMail"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:2
    case controllers_CheckoutController_sendOrderMail0_route(params) =>
      call { 
        controllers_CheckoutController_sendOrderMail0_invoker.call(CheckoutController_1.sendOrderMail)
      }
  
    // @LINE:3
    case controllers_UserController_sendRegistrationMail1_route(params) =>
      call { 
        controllers_UserController_sendRegistrationMail1_invoker.call(UserController_0.sendRegistrationMail)
      }
  }
}
