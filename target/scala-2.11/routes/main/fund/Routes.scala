
// @GENERATOR:play-routes-compiler
// @SOURCE:D:/workspace/fincash-backend/conf/fund.routes
// @DATE:Thu Apr 20 15:53:37 IST 2017

package fund

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:4
  FundsController_1: controllers.FundsController,
  // @LINE:10
  TaxController_0: controllers.TaxController,
  // @LINE:24
  IRRController_2: controllers.IRRController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:4
    FundsController_1: controllers.FundsController,
    // @LINE:10
    TaxController_0: controllers.TaxController,
    // @LINE:24
    IRRController_2: controllers.IRRController
  ) = this(errorHandler, FundsController_1, TaxController_0, IRRController_2, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    fund.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, FundsController_1, TaxController_0, IRRController_2, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """searchFund""", """controllers.FundsController.searchFunds"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getBasicFactsheet""", """controllers.FundsController.getBasicFactSheet"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getAdvancedFactsheet""", """controllers.FundsController.getAdvancedFactSheet"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """autoComplete""", """controllers.FundsController.getAutoCompleteData"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getFacets""", """controllers.FundsController.getFacets"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getTaxSaverFunds""", """controllers.TaxController.getTaxSaverFunds"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getComparisonData""", """controllers.FundsController.getComparisonData"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getIrr""", """controllers.IRRController.getIRR"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:4
  private[this] lazy val controllers_FundsController_searchFunds0_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("searchFund")))
  )
  private[this] lazy val controllers_FundsController_searchFunds0_invoker = createInvoker(
    FundsController_1.searchFunds,
    HandlerDef(this.getClass.getClassLoader,
      "fund",
      "controllers.FundsController",
      "searchFunds",
      Nil,
      "POST",
      """""",
      this.prefix + """searchFund"""
    )
  )

  // @LINE:5
  private[this] lazy val controllers_FundsController_getBasicFactSheet1_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getBasicFactsheet")))
  )
  private[this] lazy val controllers_FundsController_getBasicFactSheet1_invoker = createInvoker(
    FundsController_1.getBasicFactSheet,
    HandlerDef(this.getClass.getClassLoader,
      "fund",
      "controllers.FundsController",
      "getBasicFactSheet",
      Nil,
      "POST",
      """""",
      this.prefix + """getBasicFactsheet"""
    )
  )

  // @LINE:6
  private[this] lazy val controllers_FundsController_getAdvancedFactSheet2_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getAdvancedFactsheet")))
  )
  private[this] lazy val controllers_FundsController_getAdvancedFactSheet2_invoker = createInvoker(
    FundsController_1.getAdvancedFactSheet,
    HandlerDef(this.getClass.getClassLoader,
      "fund",
      "controllers.FundsController",
      "getAdvancedFactSheet",
      Nil,
      "POST",
      """""",
      this.prefix + """getAdvancedFactsheet"""
    )
  )

  // @LINE:7
  private[this] lazy val controllers_FundsController_getAutoCompleteData3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("autoComplete")))
  )
  private[this] lazy val controllers_FundsController_getAutoCompleteData3_invoker = createInvoker(
    FundsController_1.getAutoCompleteData,
    HandlerDef(this.getClass.getClassLoader,
      "fund",
      "controllers.FundsController",
      "getAutoCompleteData",
      Nil,
      "POST",
      """""",
      this.prefix + """autoComplete"""
    )
  )

  // @LINE:8
  private[this] lazy val controllers_FundsController_getFacets4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getFacets")))
  )
  private[this] lazy val controllers_FundsController_getFacets4_invoker = createInvoker(
    FundsController_1.getFacets,
    HandlerDef(this.getClass.getClassLoader,
      "fund",
      "controllers.FundsController",
      "getFacets",
      Nil,
      "POST",
      """""",
      this.prefix + """getFacets"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_TaxController_getTaxSaverFunds5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getTaxSaverFunds")))
  )
  private[this] lazy val controllers_TaxController_getTaxSaverFunds5_invoker = createInvoker(
    TaxController_0.getTaxSaverFunds,
    HandlerDef(this.getClass.getClassLoader,
      "fund",
      "controllers.TaxController",
      "getTaxSaverFunds",
      Nil,
      "GET",
      """tax""",
      this.prefix + """getTaxSaverFunds"""
    )
  )

  // @LINE:13
  private[this] lazy val controllers_FundsController_getComparisonData6_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getComparisonData")))
  )
  private[this] lazy val controllers_FundsController_getComparisonData6_invoker = createInvoker(
    FundsController_1.getComparisonData,
    HandlerDef(this.getClass.getClassLoader,
      "fund",
      "controllers.FundsController",
      "getComparisonData",
      Nil,
      "POST",
      """Comparison""",
      this.prefix + """getComparisonData"""
    )
  )

  // @LINE:24
  private[this] lazy val controllers_IRRController_getIRR7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getIrr")))
  )
  private[this] lazy val controllers_IRRController_getIRR7_invoker = createInvoker(
    IRRController_2.getIRR,
    HandlerDef(this.getClass.getClassLoader,
      "fund",
      "controllers.IRRController",
      "getIRR",
      Nil,
      "GET",
      """Report""",
      this.prefix + """getIrr"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:4
    case controllers_FundsController_searchFunds0_route(params) =>
      call { 
        controllers_FundsController_searchFunds0_invoker.call(FundsController_1.searchFunds)
      }
  
    // @LINE:5
    case controllers_FundsController_getBasicFactSheet1_route(params) =>
      call { 
        controllers_FundsController_getBasicFactSheet1_invoker.call(FundsController_1.getBasicFactSheet)
      }
  
    // @LINE:6
    case controllers_FundsController_getAdvancedFactSheet2_route(params) =>
      call { 
        controllers_FundsController_getAdvancedFactSheet2_invoker.call(FundsController_1.getAdvancedFactSheet)
      }
  
    // @LINE:7
    case controllers_FundsController_getAutoCompleteData3_route(params) =>
      call { 
        controllers_FundsController_getAutoCompleteData3_invoker.call(FundsController_1.getAutoCompleteData)
      }
  
    // @LINE:8
    case controllers_FundsController_getFacets4_route(params) =>
      call { 
        controllers_FundsController_getFacets4_invoker.call(FundsController_1.getFacets)
      }
  
    // @LINE:10
    case controllers_TaxController_getTaxSaverFunds5_route(params) =>
      call { 
        controllers_TaxController_getTaxSaverFunds5_invoker.call(TaxController_0.getTaxSaverFunds)
      }
  
    // @LINE:13
    case controllers_FundsController_getComparisonData6_route(params) =>
      call { 
        controllers_FundsController_getComparisonData6_invoker.call(FundsController_1.getComparisonData)
      }
  
    // @LINE:24
    case controllers_IRRController_getIRR7_route(params) =>
      call { 
        controllers_IRRController_getIRR7_invoker.call(IRRController_2.getIRR)
      }
  }
}
