
// @GENERATOR:play-routes-compiler
// @SOURCE:D:/workspace/fincash-backend/conf/secure.routes
// @DATE:Thu Apr 20 15:53:38 IST 2017

package secure

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:5
  fund_Routes_0: fund.Routes,
  // @LINE:6
  sip_Routes_1: sip.Routes,
  // @LINE:7
  checkout_Routes_7: checkout.Routes,
  // @LINE:8
  report_Routes_4: report.Routes,
  // @LINE:9
  user_Routes_2: user.Routes,
  // @LINE:10
  lookup_Routes_8: lookup.Routes,
  // @LINE:11
  redeem_Routes_5: redeem.Routes,
  // @LINE:12
  order_Routes_9: order.Routes,
  // @LINE:13
  mail_Routes_6: mail.Routes,
  // @LINE:14
  otp_Routes_3: otp.Routes,
  // @LINE:18
  JWTController_0: controllers.JWTController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:5
    fund_Routes_0: fund.Routes,
    // @LINE:6
    sip_Routes_1: sip.Routes,
    // @LINE:7
    checkout_Routes_7: checkout.Routes,
    // @LINE:8
    report_Routes_4: report.Routes,
    // @LINE:9
    user_Routes_2: user.Routes,
    // @LINE:10
    lookup_Routes_8: lookup.Routes,
    // @LINE:11
    redeem_Routes_5: redeem.Routes,
    // @LINE:12
    order_Routes_9: order.Routes,
    // @LINE:13
    mail_Routes_6: mail.Routes,
    // @LINE:14
    otp_Routes_3: otp.Routes,
    // @LINE:18
    JWTController_0: controllers.JWTController
  ) = this(errorHandler, fund_Routes_0, sip_Routes_1, checkout_Routes_7, report_Routes_4, user_Routes_2, lookup_Routes_8, redeem_Routes_5, order_Routes_9, mail_Routes_6, otp_Routes_3, JWTController_0, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    secure.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, fund_Routes_0, sip_Routes_1, checkout_Routes_7, report_Routes_4, user_Routes_2, lookup_Routes_8, redeem_Routes_5, order_Routes_9, mail_Routes_6, otp_Routes_3, JWTController_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    prefixed_fund_Routes_0_0.router.documentation,
    prefixed_sip_Routes_1_1.router.documentation,
    prefixed_checkout_Routes_7_2.router.documentation,
    prefixed_report_Routes_4_3.router.documentation,
    prefixed_user_Routes_2_4.router.documentation,
    prefixed_lookup_Routes_8_5.router.documentation,
    prefixed_redeem_Routes_5_6.router.documentation,
    prefixed_order_Routes_9_7.router.documentation,
    prefixed_mail_Routes_6_8.router.documentation,
    prefixed_otp_Routes_3_9.router.documentation,
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """jwt/getDetails""", """controllers.JWTController.getUserDataFromToken"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:5
  private[this] val prefixed_fund_Routes_0_0 = Include(fund_Routes_0.withPrefix(this.prefix + (if (this.prefix.endsWith("/")) "" else "/") + "fund"))

  // @LINE:6
  private[this] val prefixed_sip_Routes_1_1 = Include(sip_Routes_1.withPrefix(this.prefix + (if (this.prefix.endsWith("/")) "" else "/") + "sip"))

  // @LINE:7
  private[this] val prefixed_checkout_Routes_7_2 = Include(checkout_Routes_7.withPrefix(this.prefix + (if (this.prefix.endsWith("/")) "" else "/") + "checkout"))

  // @LINE:8
  private[this] val prefixed_report_Routes_4_3 = Include(report_Routes_4.withPrefix(this.prefix + (if (this.prefix.endsWith("/")) "" else "/") + "report"))

  // @LINE:9
  private[this] val prefixed_user_Routes_2_4 = Include(user_Routes_2.withPrefix(this.prefix + (if (this.prefix.endsWith("/")) "" else "/") + "user"))

  // @LINE:10
  private[this] val prefixed_lookup_Routes_8_5 = Include(lookup_Routes_8.withPrefix(this.prefix + (if (this.prefix.endsWith("/")) "" else "/") + "lookup"))

  // @LINE:11
  private[this] val prefixed_redeem_Routes_5_6 = Include(redeem_Routes_5.withPrefix(this.prefix + (if (this.prefix.endsWith("/")) "" else "/") + "redeem"))

  // @LINE:12
  private[this] val prefixed_order_Routes_9_7 = Include(order_Routes_9.withPrefix(this.prefix + (if (this.prefix.endsWith("/")) "" else "/") + "bse"))

  // @LINE:13
  private[this] val prefixed_mail_Routes_6_8 = Include(mail_Routes_6.withPrefix(this.prefix + (if (this.prefix.endsWith("/")) "" else "/") + "sendMail"))

  // @LINE:14
  private[this] val prefixed_otp_Routes_3_9 = Include(otp_Routes_3.withPrefix(this.prefix + (if (this.prefix.endsWith("/")) "" else "/") + ""))

  // @LINE:18
  private[this] lazy val controllers_JWTController_getUserDataFromToken10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("jwt/getDetails")))
  )
  private[this] lazy val controllers_JWTController_getUserDataFromToken10_invoker = createInvoker(
    JWTController_0.getUserDataFromToken,
    HandlerDef(this.getClass.getClassLoader,
      "secure",
      "controllers.JWTController",
      "getUserDataFromToken",
      Nil,
      "GET",
      """""",
      this.prefix + """jwt/getDetails"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:5
    case prefixed_fund_Routes_0_0(handler) => handler
  
    // @LINE:6
    case prefixed_sip_Routes_1_1(handler) => handler
  
    // @LINE:7
    case prefixed_checkout_Routes_7_2(handler) => handler
  
    // @LINE:8
    case prefixed_report_Routes_4_3(handler) => handler
  
    // @LINE:9
    case prefixed_user_Routes_2_4(handler) => handler
  
    // @LINE:10
    case prefixed_lookup_Routes_8_5(handler) => handler
  
    // @LINE:11
    case prefixed_redeem_Routes_5_6(handler) => handler
  
    // @LINE:12
    case prefixed_order_Routes_9_7(handler) => handler
  
    // @LINE:13
    case prefixed_mail_Routes_6_8(handler) => handler
  
    // @LINE:14
    case prefixed_otp_Routes_3_9(handler) => handler
  
    // @LINE:18
    case controllers_JWTController_getUserDataFromToken10_route(params) =>
      call { 
        controllers_JWTController_getUserDataFromToken10_invoker.call(JWTController_0.getUserDataFromToken)
      }
  }
}
