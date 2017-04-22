
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object orderProcessedTxt_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._
import utils.mail._
import models._

     object orderProcessedTxt_Scope1 {
import _root_.data.model.Tables._

class orderProcessedTxt extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[FcubdRow,OrderDetails,MailTemplateHelper,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(user: FcubdRow, orders :OrderDetails, utils: MailTemplateHelper ,baseURL:String = "https://uat.fincash.com:81"):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.114*/("""


    """),format.raw/*6.5*/("""Dear """),_display_(/*6.11*/if(user.ubdfirstname)/*6.32*/{_display_(Seq[Any](format.raw/*6.33*/(""" """),_display_(/*6.35*/user/*6.39*/.ubdfirstname)))}/*6.54*/else/*6.58*/{_display_(Seq[Any](format.raw/*6.59*/("""Investor""")))}),format.raw/*6.68*/(""",

    Thank you for choosing Fincash!

    This is a confirmation mail that your request for purchase with Order ID - """),_display_(/*10.81*/orders/*10.87*/.orderId),format.raw/*10.95*/("""
    """),format.raw/*11.5*/("""in the below mentioned scheme/s as placed on """),_display_(/*11.51*/utils/*11.56*/.parseDate(orders.createDate,"yyyy/MM/dd HH:mm:ss","dd MMM yy hh:mm a")),format.raw/*11.127*/("""is initiated.
    """),_display_(/*12.6*/for(order <- orders.subOrderDetails) yield /*12.42*/ {_display_(Seq[Any](format.raw/*12.44*/("""
        """),format.raw/*13.9*/("""id -> """),_display_(/*13.16*/orders/*13.22*/.orderId),format.raw/*13.30*/("""/"""),_display_(/*13.32*/order/*13.37*/.subOrderId),format.raw/*13.48*/("""
        """),format.raw/*14.9*/("""Transaction Type -> """),_display_(/*14.30*/order/*14.35*/.investmentMode),format.raw/*14.50*/(""" """),format.raw/*14.51*/("""( status : """),_display_(/*14.63*/order/*14.68*/.stateName),format.raw/*14.78*/(""" """),format.raw/*14.79*/(""")
        Scheme Name-Plan-Option -> """),_display_(/*15.37*/order/*15.42*/.schemeName),format.raw/*15.53*/(""" """),format.raw/*15.54*/("""- """),_display_(/*15.57*/order/*15.62*/.schemePlan),format.raw/*15.73*/(""" """),format.raw/*15.74*/("""- """),_display_(/*15.77*/order/*15.82*/.schemeOption),format.raw/*15.95*/("""
        """),_display_(/*16.10*/if(order.investmentMode=="SIP" ||  order.investmentMode=="sip")/*16.73*/{_display_(Seq[Any](format.raw/*16.74*/("""Amount(in Rs.) ->  """),_display_(/*16.94*/utils/*16.99*/.parse(order.amount.get)),format.raw/*16.123*/("""  """),format.raw/*16.125*/("""freq - """),_display_(/*16.133*/order/*16.138*/.sipFrequency),format.raw/*16.151*/(""" """),format.raw/*16.152*/("""| Instalments - """),_display_(/*16.169*/order/*16.174*/.sipNoOfInstallments)))}/*16.196*/else/*16.200*/{_display_(Seq[Any](format.raw/*16.201*/("""Amount(in Rs.) -> """),_display_(/*16.220*/utils/*16.225*/.parse(order.amount.get))))}),format.raw/*16.250*/("""
        """),format.raw/*17.9*/("""Status -> """),_display_(/*17.20*/order/*17.25*/.stateName),format.raw/*17.35*/("""
            """),format.raw/*18.13*/("""--------
        """)))}),format.raw/*19.10*/("""
    """),format.raw/*20.5*/("""You can check the unit allotment details after the settlement period
    (usually 1-3 days) by login("""),_display_(/*21.34*/utils/*21.39*/.getBaseUrl()),format.raw/*21.52*/("""/auth/login) into your Fincash account.

    Please find the screen shot of your order summary attached along with this email.

    """),_display_(/*25.6*/contactTxt()),format.raw/*25.18*/("""

    """),format.raw/*27.5*/("""Please visit our RESOURCE CENTRE (""""),_display_(/*27.41*/utils/*27.46*/.getBaseUrl()),format.raw/*27.59*/("""/b/") to know about Mutual Fund Investments and other investment products.

    With Warm Regards,
    Team Fincash"""))
      }
    }
  }

  def render(user:FcubdRow,orders:OrderDetails,utils:MailTemplateHelper,baseURL:String): play.twirl.api.HtmlFormat.Appendable = apply(user,orders,utils,baseURL)

  def f:((FcubdRow,OrderDetails,MailTemplateHelper,String) => play.twirl.api.HtmlFormat.Appendable) = (user,orders,utils,baseURL) => apply(user,orders,utils,baseURL)

  def ref: this.type = this

}


}
}

/**/
object orderProcessedTxt extends orderProcessedTxt_Scope0.orderProcessedTxt_Scope1.orderProcessedTxt
              /*
                  -- GENERATED --
                  DATE: Thu Apr 20 15:53:38 IST 2017
                  SOURCE: D:/workspace/fincash-backend/app/views/orderProcessedTxt.scala.html
                  HASH: 18f7319d49ddf390d91296ce58dc49782bca9f6b
                  MATRIX: 702->39|910->151|946->161|978->167|1007->188|1045->189|1073->191|1085->195|1110->210|1122->214|1160->215|1199->224|1350->348|1365->354|1394->362|1427->368|1500->414|1514->419|1607->490|1653->510|1705->546|1745->548|1782->558|1816->565|1831->571|1860->579|1889->581|1903->586|1935->597|1972->607|2020->628|2034->633|2070->648|2099->649|2138->661|2152->666|2183->676|2212->677|2278->716|2292->721|2324->732|2353->733|2383->736|2397->741|2429->752|2458->753|2488->756|2502->761|2536->774|2574->785|2646->848|2685->849|2732->869|2746->874|2792->898|2823->900|2859->908|2874->913|2909->926|2939->927|2984->944|2999->949|3033->971|3047->975|3087->976|3134->995|3149->1000|3199->1025|3236->1035|3274->1046|3288->1051|3319->1061|3361->1075|3411->1094|3444->1100|3574->1203|3588->1208|3622->1221|3785->1358|3818->1370|3853->1378|3916->1414|3930->1419|3964->1432
                  LINES: 25->3|30->3|33->6|33->6|33->6|33->6|33->6|33->6|33->6|33->6|33->6|33->6|37->10|37->10|37->10|38->11|38->11|38->11|38->11|39->12|39->12|39->12|40->13|40->13|40->13|40->13|40->13|40->13|40->13|41->14|41->14|41->14|41->14|41->14|41->14|41->14|41->14|41->14|42->15|42->15|42->15|42->15|42->15|42->15|42->15|42->15|42->15|42->15|42->15|43->16|43->16|43->16|43->16|43->16|43->16|43->16|43->16|43->16|43->16|43->16|43->16|43->16|43->16|43->16|43->16|43->16|43->16|43->16|44->17|44->17|44->17|44->17|45->18|46->19|47->20|48->21|48->21|48->21|52->25|52->25|54->27|54->27|54->27|54->27
                  -- GENERATED --
              */
          