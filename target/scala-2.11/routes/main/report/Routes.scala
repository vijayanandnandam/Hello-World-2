
// @GENERATOR:play-routes-compiler
// @SOURCE:D:/workspace/fincash-backend/conf/report.routes
// @DATE:Thu Apr 20 15:53:38 IST 2017

package report

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:1
  ReportsController_1: controllers.ReportsController,
  // @LINE:7
  DashboardController_0: controllers.DashboardController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:1
    ReportsController_1: controllers.ReportsController,
    // @LINE:7
    DashboardController_0: controllers.DashboardController
  ) = this(errorHandler, ReportsController_1, DashboardController_0, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    report.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, ReportsController_1, DashboardController_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """summaryReport""", """controllers.ReportsController.getPortfolioAssetAllocation"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getCapitalGainsReport/""" + "$" + """finYear<[^/]+>""", """controllers.ReportsController.getCapitalGainReport(finYear:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getHoldingReport""", """controllers.ReportsController.getHoldingReport"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getTransactionReport""", """controllers.ReportsController.getTransactionReport"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getAssetAllocationReport""", """controllers.ReportsController.getAssetAllocationReport"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getTransactionFilterValues""", """controllers.ReportsController.getTransactionFilterValues"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getAssetClassFundDetails""", """controllers.DashboardController.getCategoryWiseFunds"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getTopFunds""", """controllers.DashboardController.getTopThreeFundPerformers"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getUserTransactions""", """controllers.ReportsController.getUserTransactions"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:1
  private[this] lazy val controllers_ReportsController_getPortfolioAssetAllocation0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("summaryReport")))
  )
  private[this] lazy val controllers_ReportsController_getPortfolioAssetAllocation0_invoker = createInvoker(
    ReportsController_1.getPortfolioAssetAllocation,
    HandlerDef(this.getClass.getClassLoader,
      "report",
      "controllers.ReportsController",
      "getPortfolioAssetAllocation",
      Nil,
      "GET",
      """""",
      this.prefix + """summaryReport"""
    )
  )

  // @LINE:2
  private[this] lazy val controllers_ReportsController_getCapitalGainReport1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getCapitalGainsReport/"), DynamicPart("finYear", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ReportsController_getCapitalGainReport1_invoker = createInvoker(
    ReportsController_1.getCapitalGainReport(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "report",
      "controllers.ReportsController",
      "getCapitalGainReport",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """getCapitalGainsReport/""" + "$" + """finYear<[^/]+>"""
    )
  )

  // @LINE:3
  private[this] lazy val controllers_ReportsController_getHoldingReport2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getHoldingReport")))
  )
  private[this] lazy val controllers_ReportsController_getHoldingReport2_invoker = createInvoker(
    ReportsController_1.getHoldingReport,
    HandlerDef(this.getClass.getClassLoader,
      "report",
      "controllers.ReportsController",
      "getHoldingReport",
      Nil,
      "GET",
      """""",
      this.prefix + """getHoldingReport"""
    )
  )

  // @LINE:4
  private[this] lazy val controllers_ReportsController_getTransactionReport3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getTransactionReport")))
  )
  private[this] lazy val controllers_ReportsController_getTransactionReport3_invoker = createInvoker(
    ReportsController_1.getTransactionReport,
    HandlerDef(this.getClass.getClassLoader,
      "report",
      "controllers.ReportsController",
      "getTransactionReport",
      Nil,
      "POST",
      """""",
      this.prefix + """getTransactionReport"""
    )
  )

  // @LINE:5
  private[this] lazy val controllers_ReportsController_getAssetAllocationReport4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getAssetAllocationReport")))
  )
  private[this] lazy val controllers_ReportsController_getAssetAllocationReport4_invoker = createInvoker(
    ReportsController_1.getAssetAllocationReport,
    HandlerDef(this.getClass.getClassLoader,
      "report",
      "controllers.ReportsController",
      "getAssetAllocationReport",
      Nil,
      "GET",
      """""",
      this.prefix + """getAssetAllocationReport"""
    )
  )

  // @LINE:6
  private[this] lazy val controllers_ReportsController_getTransactionFilterValues5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getTransactionFilterValues")))
  )
  private[this] lazy val controllers_ReportsController_getTransactionFilterValues5_invoker = createInvoker(
    ReportsController_1.getTransactionFilterValues,
    HandlerDef(this.getClass.getClassLoader,
      "report",
      "controllers.ReportsController",
      "getTransactionFilterValues",
      Nil,
      "GET",
      """""",
      this.prefix + """getTransactionFilterValues"""
    )
  )

  // @LINE:7
  private[this] lazy val controllers_DashboardController_getCategoryWiseFunds6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getAssetClassFundDetails")))
  )
  private[this] lazy val controllers_DashboardController_getCategoryWiseFunds6_invoker = createInvoker(
    DashboardController_0.getCategoryWiseFunds,
    HandlerDef(this.getClass.getClassLoader,
      "report",
      "controllers.DashboardController",
      "getCategoryWiseFunds",
      Nil,
      "GET",
      """""",
      this.prefix + """getAssetClassFundDetails"""
    )
  )

  // @LINE:8
  private[this] lazy val controllers_DashboardController_getTopThreeFundPerformers7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getTopFunds")))
  )
  private[this] lazy val controllers_DashboardController_getTopThreeFundPerformers7_invoker = createInvoker(
    DashboardController_0.getTopThreeFundPerformers,
    HandlerDef(this.getClass.getClassLoader,
      "report",
      "controllers.DashboardController",
      "getTopThreeFundPerformers",
      Nil,
      "GET",
      """""",
      this.prefix + """getTopFunds"""
    )
  )

  // @LINE:9
  private[this] lazy val controllers_ReportsController_getUserTransactions8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getUserTransactions")))
  )
  private[this] lazy val controllers_ReportsController_getUserTransactions8_invoker = createInvoker(
    ReportsController_1.getUserTransactions,
    HandlerDef(this.getClass.getClassLoader,
      "report",
      "controllers.ReportsController",
      "getUserTransactions",
      Nil,
      "GET",
      """""",
      this.prefix + """getUserTransactions"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:1
    case controllers_ReportsController_getPortfolioAssetAllocation0_route(params) =>
      call { 
        controllers_ReportsController_getPortfolioAssetAllocation0_invoker.call(ReportsController_1.getPortfolioAssetAllocation)
      }
  
    // @LINE:2
    case controllers_ReportsController_getCapitalGainReport1_route(params) =>
      call(params.fromPath[String]("finYear", None)) { (finYear) =>
        controllers_ReportsController_getCapitalGainReport1_invoker.call(ReportsController_1.getCapitalGainReport(finYear))
      }
  
    // @LINE:3
    case controllers_ReportsController_getHoldingReport2_route(params) =>
      call { 
        controllers_ReportsController_getHoldingReport2_invoker.call(ReportsController_1.getHoldingReport)
      }
  
    // @LINE:4
    case controllers_ReportsController_getTransactionReport3_route(params) =>
      call { 
        controllers_ReportsController_getTransactionReport3_invoker.call(ReportsController_1.getTransactionReport)
      }
  
    // @LINE:5
    case controllers_ReportsController_getAssetAllocationReport4_route(params) =>
      call { 
        controllers_ReportsController_getAssetAllocationReport4_invoker.call(ReportsController_1.getAssetAllocationReport)
      }
  
    // @LINE:6
    case controllers_ReportsController_getTransactionFilterValues5_route(params) =>
      call { 
        controllers_ReportsController_getTransactionFilterValues5_invoker.call(ReportsController_1.getTransactionFilterValues)
      }
  
    // @LINE:7
    case controllers_DashboardController_getCategoryWiseFunds6_route(params) =>
      call { 
        controllers_DashboardController_getCategoryWiseFunds6_invoker.call(DashboardController_0.getCategoryWiseFunds)
      }
  
    // @LINE:8
    case controllers_DashboardController_getTopThreeFundPerformers7_route(params) =>
      call { 
        controllers_DashboardController_getTopThreeFundPerformers7_invoker.call(DashboardController_0.getTopThreeFundPerformers)
      }
  
    // @LINE:9
    case controllers_ReportsController_getUserTransactions8_route(params) =>
      call { 
        controllers_ReportsController_getUserTransactions8_invoker.call(ReportsController_1.getUserTransactions)
      }
  }
}
