
// @GENERATOR:play-routes-compiler
// @SOURCE:D:/workspace/fincash-backend/conf/lookup.routes
// @DATE:Thu Apr 20 15:53:38 IST 2017

package lookup

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:4
  LookupController_0: controllers.LookupController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:4
    LookupController_0: controllers.LookupController
  ) = this(errorHandler, LookupController_0, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    lookup.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, LookupController_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """byGroup""", """controllers.LookupController.postCNDgroup"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """byGroup/""" + "$" + """group<[^/]+>""", """controllers.LookupController.getCNDgroup(group:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """bankNames""", """controllers.LookupController.getBankNames"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getBankSuggestions""", """controllers.LookupController.getBankSuggestion"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:4
  private[this] lazy val controllers_LookupController_postCNDgroup0_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("byGroup")))
  )
  private[this] lazy val controllers_LookupController_postCNDgroup0_invoker = createInvoker(
    LookupController_0.postCNDgroup,
    HandlerDef(this.getClass.getClassLoader,
      "lookup",
      "controllers.LookupController",
      "postCNDgroup",
      Nil,
      "POST",
      """""",
      this.prefix + """byGroup"""
    )
  )

  // @LINE:5
  private[this] lazy val controllers_LookupController_getCNDgroup1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("byGroup/"), DynamicPart("group", """[^/]+""",true)))
  )
  private[this] lazy val controllers_LookupController_getCNDgroup1_invoker = createInvoker(
    LookupController_0.getCNDgroup(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "lookup",
      "controllers.LookupController",
      "getCNDgroup",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """byGroup/""" + "$" + """group<[^/]+>"""
    )
  )

  // @LINE:7
  private[this] lazy val controllers_LookupController_getBankNames2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("bankNames")))
  )
  private[this] lazy val controllers_LookupController_getBankNames2_invoker = createInvoker(
    LookupController_0.getBankNames,
    HandlerDef(this.getClass.getClassLoader,
      "lookup",
      "controllers.LookupController",
      "getBankNames",
      Nil,
      "GET",
      """""",
      this.prefix + """bankNames"""
    )
  )

  // @LINE:8
  private[this] lazy val controllers_LookupController_getBankSuggestion3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getBankSuggestions")))
  )
  private[this] lazy val controllers_LookupController_getBankSuggestion3_invoker = createInvoker(
    LookupController_0.getBankSuggestion,
    HandlerDef(this.getClass.getClassLoader,
      "lookup",
      "controllers.LookupController",
      "getBankSuggestion",
      Nil,
      "POST",
      """""",
      this.prefix + """getBankSuggestions"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:4
    case controllers_LookupController_postCNDgroup0_route(params) =>
      call { 
        controllers_LookupController_postCNDgroup0_invoker.call(LookupController_0.postCNDgroup)
      }
  
    // @LINE:5
    case controllers_LookupController_getCNDgroup1_route(params) =>
      call(params.fromPath[String]("group", None)) { (group) =>
        controllers_LookupController_getCNDgroup1_invoker.call(LookupController_0.getCNDgroup(group))
      }
  
    // @LINE:7
    case controllers_LookupController_getBankNames2_route(params) =>
      call { 
        controllers_LookupController_getBankNames2_invoker.call(LookupController_0.getBankNames)
      }
  
    // @LINE:8
    case controllers_LookupController_getBankSuggestion3_route(params) =>
      call { 
        controllers_LookupController_getBankSuggestion3_invoker.call(LookupController_0.getBankSuggestion)
      }
  }
}
