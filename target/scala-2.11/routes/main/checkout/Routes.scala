
// @GENERATOR:play-routes-compiler
// @SOURCE:D:/workspace/fincash-backend/conf/checkout.routes
// @DATE:Thu Apr 20 15:53:37 IST 2017

package checkout

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:8
  CartController_2: controllers.CartController,
  // @LINE:12
  CheckoutController_0: controllers.CheckoutController,
  // @LINE:30
  SavingsPlusController_1: controllers.SavingsPlusController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:8
    CartController_2: controllers.CartController,
    // @LINE:12
    CheckoutController_0: controllers.CheckoutController,
    // @LINE:30
    SavingsPlusController_1: controllers.SavingsPlusController
  ) = this(errorHandler, CartController_2, CheckoutController_0, SavingsPlusController_1, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    checkout.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, CartController_2, CheckoutController_0, SavingsPlusController_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """saveCart""", """controllers.CartController.saveCart"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """mergeCart""", """controllers.CartController.mergeCart"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getCheckoutData""", """controllers.CheckoutController.getCheckoutData"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getCheckoutDataSummary""", """controllers.CheckoutController.getCheckoutDataSummary"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getSummaryInfo""", """controllers.CheckoutController.getSummaryInfo"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """saveCheckoutData""", """controllers.CheckoutController.saveCheckoutData"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """invest""", """controllers.CheckoutController.invest"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """generatePaymentUrl""", """controllers.CheckoutController.generatePaymentUrl"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """orderStatus/""" + "$" + """orderId<[^/]+>""", """controllers.CheckoutController.getOrderStatus(orderId:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """subOrderStatus/""" + "$" + """subOrderId<[^/]+>""", """controllers.CheckoutController.getSubOrderStatus(subOrderId:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """cancelOrder/""" + "$" + """orderId<[^/]+>""", """controllers.CheckoutController.cancelOrders(orderId:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """removeFundById""", """controllers.CartController.removeFundById"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """makeRedemption""", """controllers.SavingsPlusController.makeRedemption"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:8
  private[this] lazy val controllers_CartController_saveCart0_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("saveCart")))
  )
  private[this] lazy val controllers_CartController_saveCart0_invoker = createInvoker(
    CartController_2.saveCart,
    HandlerDef(this.getClass.getClassLoader,
      "checkout",
      "controllers.CartController",
      "saveCart",
      Nil,
      "POST",
      """cart
POST        /addFundToCart               controllers.CartController.addFundToCart
POST        /updateCart                  controllers.CartController.updateCartData
POST        /removeFund                  controllers.CartController.removeFund""",
      this.prefix + """saveCart"""
    )
  )

  // @LINE:9
  private[this] lazy val controllers_CartController_mergeCart1_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("mergeCart")))
  )
  private[this] lazy val controllers_CartController_mergeCart1_invoker = createInvoker(
    CartController_2.mergeCart,
    HandlerDef(this.getClass.getClassLoader,
      "checkout",
      "controllers.CartController",
      "mergeCart",
      Nil,
      "POST",
      """""",
      this.prefix + """mergeCart"""
    )
  )

  // @LINE:12
  private[this] lazy val controllers_CheckoutController_getCheckoutData2_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getCheckoutData")))
  )
  private[this] lazy val controllers_CheckoutController_getCheckoutData2_invoker = createInvoker(
    CheckoutController_0.getCheckoutData,
    HandlerDef(this.getClass.getClassLoader,
      "checkout",
      "controllers.CheckoutController",
      "getCheckoutData",
      Nil,
      "POST",
      """checkout""",
      this.prefix + """getCheckoutData"""
    )
  )

  // @LINE:13
  private[this] lazy val controllers_CheckoutController_getCheckoutDataSummary3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getCheckoutDataSummary")))
  )
  private[this] lazy val controllers_CheckoutController_getCheckoutDataSummary3_invoker = createInvoker(
    CheckoutController_0.getCheckoutDataSummary,
    HandlerDef(this.getClass.getClassLoader,
      "checkout",
      "controllers.CheckoutController",
      "getCheckoutDataSummary",
      Nil,
      "POST",
      """""",
      this.prefix + """getCheckoutDataSummary"""
    )
  )

  // @LINE:14
  private[this] lazy val controllers_CheckoutController_getSummaryInfo4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getSummaryInfo")))
  )
  private[this] lazy val controllers_CheckoutController_getSummaryInfo4_invoker = createInvoker(
    CheckoutController_0.getSummaryInfo,
    HandlerDef(this.getClass.getClassLoader,
      "checkout",
      "controllers.CheckoutController",
      "getSummaryInfo",
      Nil,
      "GET",
      """""",
      this.prefix + """getSummaryInfo"""
    )
  )

  // @LINE:15
  private[this] lazy val controllers_CheckoutController_saveCheckoutData5_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("saveCheckoutData")))
  )
  private[this] lazy val controllers_CheckoutController_saveCheckoutData5_invoker = createInvoker(
    CheckoutController_0.saveCheckoutData,
    HandlerDef(this.getClass.getClassLoader,
      "checkout",
      "controllers.CheckoutController",
      "saveCheckoutData",
      Nil,
      "POST",
      """""",
      this.prefix + """saveCheckoutData"""
    )
  )

  // @LINE:22
  private[this] lazy val controllers_CheckoutController_invest6_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("invest")))
  )
  private[this] lazy val controllers_CheckoutController_invest6_invoker = createInvoker(
    CheckoutController_0.invest,
    HandlerDef(this.getClass.getClassLoader,
      "checkout",
      "controllers.CheckoutController",
      "invest",
      Nil,
      "POST",
      """invest""",
      this.prefix + """invest"""
    )
  )

  // @LINE:23
  private[this] lazy val controllers_CheckoutController_generatePaymentUrl7_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("generatePaymentUrl")))
  )
  private[this] lazy val controllers_CheckoutController_generatePaymentUrl7_invoker = createInvoker(
    CheckoutController_0.generatePaymentUrl,
    HandlerDef(this.getClass.getClassLoader,
      "checkout",
      "controllers.CheckoutController",
      "generatePaymentUrl",
      Nil,
      "POST",
      """""",
      this.prefix + """generatePaymentUrl"""
    )
  )

  // @LINE:24
  private[this] lazy val controllers_CheckoutController_getOrderStatus8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("orderStatus/"), DynamicPart("orderId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CheckoutController_getOrderStatus8_invoker = createInvoker(
    CheckoutController_0.getOrderStatus(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "checkout",
      "controllers.CheckoutController",
      "getOrderStatus",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """orderStatus/""" + "$" + """orderId<[^/]+>"""
    )
  )

  // @LINE:25
  private[this] lazy val controllers_CheckoutController_getSubOrderStatus9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("subOrderStatus/"), DynamicPart("subOrderId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CheckoutController_getSubOrderStatus9_invoker = createInvoker(
    CheckoutController_0.getSubOrderStatus(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "checkout",
      "controllers.CheckoutController",
      "getSubOrderStatus",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """subOrderStatus/""" + "$" + """subOrderId<[^/]+>"""
    )
  )

  // @LINE:26
  private[this] lazy val controllers_CheckoutController_cancelOrders10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("cancelOrder/"), DynamicPart("orderId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CheckoutController_cancelOrders10_invoker = createInvoker(
    CheckoutController_0.cancelOrders(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "checkout",
      "controllers.CheckoutController",
      "cancelOrders",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """cancelOrder/""" + "$" + """orderId<[^/]+>"""
    )
  )

  // @LINE:27
  private[this] lazy val controllers_CartController_removeFundById11_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("removeFundById")))
  )
  private[this] lazy val controllers_CartController_removeFundById11_invoker = createInvoker(
    CartController_2.removeFundById,
    HandlerDef(this.getClass.getClassLoader,
      "checkout",
      "controllers.CartController",
      "removeFundById",
      Nil,
      "POST",
      """""",
      this.prefix + """removeFundById"""
    )
  )

  // @LINE:30
  private[this] lazy val controllers_SavingsPlusController_makeRedemption12_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("makeRedemption")))
  )
  private[this] lazy val controllers_SavingsPlusController_makeRedemption12_invoker = createInvoker(
    SavingsPlusController_1.makeRedemption,
    HandlerDef(this.getClass.getClassLoader,
      "checkout",
      "controllers.SavingsPlusController",
      "makeRedemption",
      Nil,
      "POST",
      """SavingsPlus""",
      this.prefix + """makeRedemption"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:8
    case controllers_CartController_saveCart0_route(params) =>
      call { 
        controllers_CartController_saveCart0_invoker.call(CartController_2.saveCart)
      }
  
    // @LINE:9
    case controllers_CartController_mergeCart1_route(params) =>
      call { 
        controllers_CartController_mergeCart1_invoker.call(CartController_2.mergeCart)
      }
  
    // @LINE:12
    case controllers_CheckoutController_getCheckoutData2_route(params) =>
      call { 
        controllers_CheckoutController_getCheckoutData2_invoker.call(CheckoutController_0.getCheckoutData)
      }
  
    // @LINE:13
    case controllers_CheckoutController_getCheckoutDataSummary3_route(params) =>
      call { 
        controllers_CheckoutController_getCheckoutDataSummary3_invoker.call(CheckoutController_0.getCheckoutDataSummary)
      }
  
    // @LINE:14
    case controllers_CheckoutController_getSummaryInfo4_route(params) =>
      call { 
        controllers_CheckoutController_getSummaryInfo4_invoker.call(CheckoutController_0.getSummaryInfo)
      }
  
    // @LINE:15
    case controllers_CheckoutController_saveCheckoutData5_route(params) =>
      call { 
        controllers_CheckoutController_saveCheckoutData5_invoker.call(CheckoutController_0.saveCheckoutData)
      }
  
    // @LINE:22
    case controllers_CheckoutController_invest6_route(params) =>
      call { 
        controllers_CheckoutController_invest6_invoker.call(CheckoutController_0.invest)
      }
  
    // @LINE:23
    case controllers_CheckoutController_generatePaymentUrl7_route(params) =>
      call { 
        controllers_CheckoutController_generatePaymentUrl7_invoker.call(CheckoutController_0.generatePaymentUrl)
      }
  
    // @LINE:24
    case controllers_CheckoutController_getOrderStatus8_route(params) =>
      call(params.fromPath[String]("orderId", None)) { (orderId) =>
        controllers_CheckoutController_getOrderStatus8_invoker.call(CheckoutController_0.getOrderStatus(orderId))
      }
  
    // @LINE:25
    case controllers_CheckoutController_getSubOrderStatus9_route(params) =>
      call(params.fromPath[String]("subOrderId", None)) { (subOrderId) =>
        controllers_CheckoutController_getSubOrderStatus9_invoker.call(CheckoutController_0.getSubOrderStatus(subOrderId))
      }
  
    // @LINE:26
    case controllers_CheckoutController_cancelOrders10_route(params) =>
      call(params.fromPath[String]("orderId", None)) { (orderId) =>
        controllers_CheckoutController_cancelOrders10_invoker.call(CheckoutController_0.cancelOrders(orderId))
      }
  
    // @LINE:27
    case controllers_CartController_removeFundById11_route(params) =>
      call { 
        controllers_CartController_removeFundById11_invoker.call(CartController_2.removeFundById)
      }
  
    // @LINE:30
    case controllers_SavingsPlusController_makeRedemption12_route(params) =>
      call { 
        controllers_SavingsPlusController_makeRedemption12_invoker.call(SavingsPlusController_1.makeRedemption)
      }
  }
}
