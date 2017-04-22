
// @GENERATOR:play-routes-compiler
// @SOURCE:D:/workspace/fincash-backend/conf/order.routes
// @DATE:Thu Apr 20 15:53:38 IST 2017

package order

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:2
  OrderController_1: controllers.OrderController,
  // @LINE:7
  BSEStarController_0: controllers.BSEStarController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:2
    OrderController_1: controllers.OrderController,
    // @LINE:7
    BSEStarController_0: controllers.BSEStarController
  ) = this(errorHandler, OrderController_1, BSEStarController_0, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    order.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, OrderController_1, BSEStarController_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """checkOrderDetails/""" + "$" + """orderId<[^/]+>""", """controllers.OrderController.orderAcknowledgementDetails(orderId:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """checkPaymentStatus/""" + "$" + """orderId<[^/]+>""", """controllers.OrderController.checkOrderPaymentStatus(orderId:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """orderDetails/""" + "$" + """orderId<[^/]+>""", """controllers.OrderController.getOrderDetails(orderId:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """checkBseAndFatcaStatus""", """controllers.BSEStarController.checkBseAndFatcaStatus"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """checkBseStatus""", """controllers.BSEStarController.checkBseStatus"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """cancelOrder/""" + "$" + """subOrderId<[^/]+>""", """controllers.OrderController.cancelOrder(subOrderId:String)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:2
  private[this] lazy val controllers_OrderController_orderAcknowledgementDetails0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("checkOrderDetails/"), DynamicPart("orderId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_OrderController_orderAcknowledgementDetails0_invoker = createInvoker(
    OrderController_1.orderAcknowledgementDetails(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "order",
      "controllers.OrderController",
      "orderAcknowledgementDetails",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """checkOrderDetails/""" + "$" + """orderId<[^/]+>"""
    )
  )

  // @LINE:3
  private[this] lazy val controllers_OrderController_checkOrderPaymentStatus1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("checkPaymentStatus/"), DynamicPart("orderId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_OrderController_checkOrderPaymentStatus1_invoker = createInvoker(
    OrderController_1.checkOrderPaymentStatus(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "order",
      "controllers.OrderController",
      "checkOrderPaymentStatus",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """checkPaymentStatus/""" + "$" + """orderId<[^/]+>"""
    )
  )

  // @LINE:4
  private[this] lazy val controllers_OrderController_getOrderDetails2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("orderDetails/"), DynamicPart("orderId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_OrderController_getOrderDetails2_invoker = createInvoker(
    OrderController_1.getOrderDetails(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "order",
      "controllers.OrderController",
      "getOrderDetails",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """orderDetails/""" + "$" + """orderId<[^/]+>"""
    )
  )

  // @LINE:7
  private[this] lazy val controllers_BSEStarController_checkBseAndFatcaStatus3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("checkBseAndFatcaStatus")))
  )
  private[this] lazy val controllers_BSEStarController_checkBseAndFatcaStatus3_invoker = createInvoker(
    BSEStarController_0.checkBseAndFatcaStatus,
    HandlerDef(this.getClass.getClassLoader,
      "order",
      "controllers.BSEStarController",
      "checkBseAndFatcaStatus",
      Nil,
      "GET",
      """GET     /bseRegistration                        controllers.BSEStarController.BSERegistration
GET     /bseRegisterFatca                       controllers.BSEStarController.BSERegisterFatca""",
      this.prefix + """checkBseAndFatcaStatus"""
    )
  )

  // @LINE:8
  private[this] lazy val controllers_BSEStarController_checkBseStatus4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("checkBseStatus")))
  )
  private[this] lazy val controllers_BSEStarController_checkBseStatus4_invoker = createInvoker(
    BSEStarController_0.checkBseStatus,
    HandlerDef(this.getClass.getClassLoader,
      "order",
      "controllers.BSEStarController",
      "checkBseStatus",
      Nil,
      "GET",
      """""",
      this.prefix + """checkBseStatus"""
    )
  )

  // @LINE:9
  private[this] lazy val controllers_OrderController_cancelOrder5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("cancelOrder/"), DynamicPart("subOrderId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_OrderController_cancelOrder5_invoker = createInvoker(
    OrderController_1.cancelOrder(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "order",
      "controllers.OrderController",
      "cancelOrder",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """cancelOrder/""" + "$" + """subOrderId<[^/]+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:2
    case controllers_OrderController_orderAcknowledgementDetails0_route(params) =>
      call(params.fromPath[String]("orderId", None)) { (orderId) =>
        controllers_OrderController_orderAcknowledgementDetails0_invoker.call(OrderController_1.orderAcknowledgementDetails(orderId))
      }
  
    // @LINE:3
    case controllers_OrderController_checkOrderPaymentStatus1_route(params) =>
      call(params.fromPath[String]("orderId", None)) { (orderId) =>
        controllers_OrderController_checkOrderPaymentStatus1_invoker.call(OrderController_1.checkOrderPaymentStatus(orderId))
      }
  
    // @LINE:4
    case controllers_OrderController_getOrderDetails2_route(params) =>
      call(params.fromPath[String]("orderId", None)) { (orderId) =>
        controllers_OrderController_getOrderDetails2_invoker.call(OrderController_1.getOrderDetails(orderId))
      }
  
    // @LINE:7
    case controllers_BSEStarController_checkBseAndFatcaStatus3_route(params) =>
      call { 
        controllers_BSEStarController_checkBseAndFatcaStatus3_invoker.call(BSEStarController_0.checkBseAndFatcaStatus)
      }
  
    // @LINE:8
    case controllers_BSEStarController_checkBseStatus4_route(params) =>
      call { 
        controllers_BSEStarController_checkBseStatus4_invoker.call(BSEStarController_0.checkBseStatus)
      }
  
    // @LINE:9
    case controllers_OrderController_cancelOrder5_route(params) =>
      call(params.fromPath[String]("subOrderId", None)) { (subOrderId) =>
        controllers_OrderController_cancelOrder5_invoker.call(OrderController_1.cancelOrder(subOrderId))
      }
  }
}
