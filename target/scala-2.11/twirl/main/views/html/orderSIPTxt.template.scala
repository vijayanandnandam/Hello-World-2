
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object orderSIPTxt_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._
import utils.mail._
import models._

     object orderSIPTxt_Scope1 {
import _root_.data.model.Tables._

class orderSIPTxt extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template5[FcubdRow,Boolean,List[SubOrderDetails],Map[Long, String],MailTemplateHelper,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(user: FcubdRow, typeISIP:Boolean, orders :List[SubOrderDetails], urnMap:Map[Long, String], utils: MailTemplateHelper):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.120*/("""

"""),format.raw/*5.1*/("""Dear """),_display_(/*5.7*/if(user.ubdfirstname)/*5.28*/{_display_(_display_(/*5.30*/user/*5.34*/.ubdfirstname))}/*5.49*/else/*5.53*/{_display_(Seq[Any](format.raw/*5.54*/("""Investor""")))}),format.raw/*5.63*/(""",

Thank you for the request for Online SIP in in the below mentioned scheme/schemes.
"""),_display_(/*8.2*/for(order <- orders) yield /*8.22*/ {_display_(Seq[Any](format.raw/*8.24*/("""
"""),format.raw/*9.1*/("""Id - """),_display_(/*9.7*/order/*9.12*/.subOrderId),format.raw/*9.23*/("""
"""),format.raw/*10.1*/("""Scheme - """),_display_(/*10.11*/order/*10.16*/.schemeName),format.raw/*10.27*/("""
"""),format.raw/*11.1*/("""Plan - """),_display_(/*11.9*/order/*11.14*/.schemePlan),format.raw/*11.25*/("""
"""),format.raw/*12.1*/("""Option - """),_display_(/*12.11*/order/*12.16*/.schemeOption),format.raw/*12.29*/("""
"""),format.raw/*13.1*/("""Amount(in Rs.) - """),_display_(/*13.19*/utils/*13.24*/.parse(order.amount.get)),format.raw/*13.48*/("""
"""),format.raw/*14.1*/("""Frequency - """),_display_(/*14.14*/order/*14.19*/.sipFrequency),format.raw/*14.32*/("""
"""),_display_(/*15.2*/if(typeISIP)/*15.14*/{_display_(Seq[Any](format.raw/*15.15*/("""URN - """),_display_(/*15.22*/urnMap(order.subOrderId))))}),format.raw/*15.47*/("""
""")))}),format.raw/*16.2*/("""

"""),_display_(/*18.2*/if(!typeISIP)/*18.15*/{_display_(Seq[Any](format.raw/*18.16*/("""In order to automate deduction of the invested amount from your bank account you need to submit a signed one-time mandate.
Soon we will get in touch with you to pick-up the mandate form from you.
""")))}),format.raw/*20.2*/("""
"""),_display_(/*21.2*/if(typeISIP)/*21.14*/{_display_(Seq[Any](format.raw/*21.15*/("""
"""),format.raw/*22.1*/("""Please complete the online registration of your ISIP by registering the above URN in your registered bank website within 20 days (follow the below steps):
* Login to your bank website
* Select the Bill Pay or Biller Registration section
* Select BSE Limited from the Biller list
* Enter the URN number as above

Note: While registering the URN on your bank website, please select Auto Pay option (if available) to avoid authorization for each SIP debit. On successful registration of URN on your registered bank website, your ISIP would be registered in our records subject to the confirmation received from your bank.

Kindly note that the transaction is liable to be rejected in case information provided is incomplete/incorrect.
""")))}),format.raw/*31.2*/("""
"""),_display_(/*32.2*/contactTxt()),format.raw/*32.14*/("""

"""),format.raw/*34.1*/("""For further information please visit our website """),_display_(/*34.51*/utils/*34.56*/.getBaseUrl()),format.raw/*34.69*/(""".

With Warm Regards,
Team Fincash"""))
      }
    }
  }

  def render(user:FcubdRow,typeISIP:Boolean,orders:List[SubOrderDetails],urnMap:Map[Long, String],utils:MailTemplateHelper): play.twirl.api.HtmlFormat.Appendable = apply(user,typeISIP,orders,urnMap,utils)

  def f:((FcubdRow,Boolean,List[SubOrderDetails],Map[Long, String],MailTemplateHelper) => play.twirl.api.HtmlFormat.Appendable) = (user,typeISIP,orders,urnMap,utils) => apply(user,typeISIP,orders,urnMap,utils)

  def ref: this.type = this

}


}
}

/**/
object orderSIPTxt extends orderSIPTxt_Scope0.orderSIPTxt_Scope1.orderSIPTxt
              /*
                  -- GENERATED --
                  DATE: Thu Apr 20 15:53:38 IST 2017
                  SOURCE: D:/workspace/fincash-backend/app/views/orderSIPTxt.scala.html
                  HASH: 9bb949b328bda7559867ffec5528a9ece11e7674
                  MATRIX: 712->39|926->157|956->161|987->167|1016->188|1045->190|1057->194|1081->209|1093->213|1131->214|1170->223|1285->313|1320->333|1359->335|1387->337|1418->343|1431->348|1462->359|1491->361|1528->371|1542->376|1574->387|1603->389|1637->397|1651->402|1683->413|1712->415|1749->425|1763->430|1797->443|1826->445|1871->463|1885->468|1930->492|1959->494|1999->507|2013->512|2047->525|2076->528|2097->540|2136->541|2170->548|2219->573|2252->576|2283->581|2305->594|2344->595|2573->794|2602->797|2623->809|2662->810|2691->812|3463->1554|3492->1557|3525->1569|3556->1573|3633->1623|3647->1628|3681->1641
                  LINES: 25->3|30->3|32->5|32->5|32->5|32->5|32->5|32->5|32->5|32->5|32->5|35->8|35->8|35->8|36->9|36->9|36->9|36->9|37->10|37->10|37->10|37->10|38->11|38->11|38->11|38->11|39->12|39->12|39->12|39->12|40->13|40->13|40->13|40->13|41->14|41->14|41->14|41->14|42->15|42->15|42->15|42->15|42->15|43->16|45->18|45->18|45->18|47->20|48->21|48->21|48->21|49->22|58->31|59->32|59->32|61->34|61->34|61->34|61->34
                  -- GENERATED --
              */
          