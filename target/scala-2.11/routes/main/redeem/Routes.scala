
// @GENERATOR:play-routes-compiler
// @SOURCE:D:/workspace/fincash-backend/conf/redeem.routes
// @DATE:Thu Apr 20 15:53:38 IST 2017

package redeem

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:3
  OrderController_0: controllers.OrderController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:3
    OrderController_0: controllers.OrderController
  ) = this(errorHandler, OrderController_0, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    redeem.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, OrderController_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getRedeemSuggestion""", """controllers.OrderController.getRedeemSuggestion"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:3
  private[this] lazy val controllers_OrderController_getRedeemSuggestion0_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getRedeemSuggestion")))
  )
  private[this] lazy val controllers_OrderController_getRedeemSuggestion0_invoker = createInvoker(
    OrderController_0.getRedeemSuggestion,
    HandlerDef(this.getClass.getClassLoader,
      "redeem",
      "controllers.OrderController",
      "getRedeemSuggestion",
      Nil,
      "POST",
      """""",
      this.prefix + """getRedeemSuggestion"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:3
    case controllers_OrderController_getRedeemSuggestion0_route(params) =>
      call { 
        controllers_OrderController_getRedeemSuggestion0_invoker.call(OrderController_0.getRedeemSuggestion)
      }
  }
}
