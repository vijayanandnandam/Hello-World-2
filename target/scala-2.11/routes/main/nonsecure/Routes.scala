
// @GENERATOR:play-routes-compiler
// @SOURCE:D:/workspace/fincash-backend/conf/nonsecure.routes
// @DATE:Thu Apr 20 15:53:38 IST 2017

package nonsecure

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:1
  lookup_Routes_0: lookup.Routes,
  // @LINE:2
  fund_Routes_2: fund.Routes,
  // @LINE:3
  sip_Routes_1: sip.Routes,
  // @LINE:7
  CartController_2: controllers.CartController,
  // @LINE:9
  CashController_1: controllers.CashController,
  // @LINE:10
  MailGunController_0: controllers.MailGunController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:1
    lookup_Routes_0: lookup.Routes,
    // @LINE:2
    fund_Routes_2: fund.Routes,
    // @LINE:3
    sip_Routes_1: sip.Routes,
    // @LINE:7
    CartController_2: controllers.CartController,
    // @LINE:9
    CashController_1: controllers.CashController,
    // @LINE:10
    MailGunController_0: controllers.MailGunController
  ) = this(errorHandler, lookup_Routes_0, fund_Routes_2, sip_Routes_1, CartController_2, CashController_1, MailGunController_0, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    nonsecure.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, lookup_Routes_0, fund_Routes_2, sip_Routes_1, CartController_2, CashController_1, MailGunController_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    prefixed_lookup_Routes_0_0.router.documentation,
    prefixed_fund_Routes_2_1.router.documentation,
    prefixed_sip_Routes_1_2.router.documentation,
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """checkout/getCartData""", """controllers.CartController.getCartData"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """checkout/saveCart""", """controllers.CartController.saveCart"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getSavingsPlusFunds""", """controllers.CashController.getSavingsPlusFunds"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """checkmail""", """controllers.MailGunController.checkmail"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:1
  private[this] val prefixed_lookup_Routes_0_0 = Include(lookup_Routes_0.withPrefix(this.prefix + (if (this.prefix.endsWith("/")) "" else "/") + "lookup"))

  // @LINE:2
  private[this] val prefixed_fund_Routes_2_1 = Include(fund_Routes_2.withPrefix(this.prefix + (if (this.prefix.endsWith("/")) "" else "/") + "fund"))

  // @LINE:3
  private[this] val prefixed_sip_Routes_1_2 = Include(sip_Routes_1.withPrefix(this.prefix + (if (this.prefix.endsWith("/")) "" else "/") + "sip"))

  // @LINE:7
  private[this] lazy val controllers_CartController_getCartData3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("checkout/getCartData")))
  )
  private[this] lazy val controllers_CartController_getCartData3_invoker = createInvoker(
    CartController_2.getCartData,
    HandlerDef(this.getClass.getClassLoader,
      "nonsecure",
      "controllers.CartController",
      "getCartData",
      Nil,
      "POST",
      """ other unsecure routes""",
      this.prefix + """checkout/getCartData"""
    )
  )

  // @LINE:8
  private[this] lazy val controllers_CartController_saveCart4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("checkout/saveCart")))
  )
  private[this] lazy val controllers_CartController_saveCart4_invoker = createInvoker(
    CartController_2.saveCart,
    HandlerDef(this.getClass.getClassLoader,
      "nonsecure",
      "controllers.CartController",
      "saveCart",
      Nil,
      "POST",
      """""",
      this.prefix + """checkout/saveCart"""
    )
  )

  // @LINE:9
  private[this] lazy val controllers_CashController_getSavingsPlusFunds5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getSavingsPlusFunds")))
  )
  private[this] lazy val controllers_CashController_getSavingsPlusFunds5_invoker = createInvoker(
    CashController_1.getSavingsPlusFunds,
    HandlerDef(this.getClass.getClassLoader,
      "nonsecure",
      "controllers.CashController",
      "getSavingsPlusFunds",
      Nil,
      "GET",
      """""",
      this.prefix + """getSavingsPlusFunds"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_MailGunController_checkmail6_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("checkmail")))
  )
  private[this] lazy val controllers_MailGunController_checkmail6_invoker = createInvoker(
    MailGunController_0.checkmail,
    HandlerDef(this.getClass.getClassLoader,
      "nonsecure",
      "controllers.MailGunController",
      "checkmail",
      Nil,
      "POST",
      """""",
      this.prefix + """checkmail"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:1
    case prefixed_lookup_Routes_0_0(handler) => handler
  
    // @LINE:2
    case prefixed_fund_Routes_2_1(handler) => handler
  
    // @LINE:3
    case prefixed_sip_Routes_1_2(handler) => handler
  
    // @LINE:7
    case controllers_CartController_getCartData3_route(params) =>
      call { 
        controllers_CartController_getCartData3_invoker.call(CartController_2.getCartData)
      }
  
    // @LINE:8
    case controllers_CartController_saveCart4_route(params) =>
      call { 
        controllers_CartController_saveCart4_invoker.call(CartController_2.saveCart)
      }
  
    // @LINE:9
    case controllers_CashController_getSavingsPlusFunds5_route(params) =>
      call { 
        controllers_CashController_getSavingsPlusFunds5_invoker.call(CashController_1.getSavingsPlusFunds)
      }
  
    // @LINE:10
    case controllers_MailGunController_checkmail6_route(params) =>
      call { 
        controllers_MailGunController_checkmail6_invoker.call(MailGunController_0.checkmail)
      }
  }
}
