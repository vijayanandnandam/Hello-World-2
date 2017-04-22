
// @GENERATOR:play-routes-compiler
// @SOURCE:D:/workspace/fincash-backend/conf/sip.routes
// @DATE:Thu Apr 20 15:53:39 IST 2017

package sip

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:5
  SIPController_0: controllers.SIPController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:5
    SIPController_0: controllers.SIPController
  ) = this(errorHandler, SIPController_0, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    sip.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, SIPController_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getQuickSipFunds""", """controllers.SIPController.getQuickSipFunds"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:5
  private[this] lazy val controllers_SIPController_getQuickSipFunds0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getQuickSipFunds")))
  )
  private[this] lazy val controllers_SIPController_getQuickSipFunds0_invoker = createInvoker(
    SIPController_0.getQuickSipFunds,
    HandlerDef(this.getClass.getClassLoader,
      "sip",
      "controllers.SIPController",
      "getQuickSipFunds",
      Nil,
      "GET",
      """""",
      this.prefix + """getQuickSipFunds"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:5
    case controllers_SIPController_getQuickSipFunds0_route(params) =>
      call { 
        controllers_SIPController_getQuickSipFunds0_invoker.call(SIPController_0.getQuickSipFunds)
      }
  }
}
