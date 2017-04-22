
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object orderSIP_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._
import utils.mail._
import models._

     object orderSIP_Scope1 {
import _root_.data.model.Tables._

class orderSIP extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template5[FcubdRow,Boolean,List[SubOrderDetails],Map[Long, String],MailTemplateHelper,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(user: FcubdRow, typeISIP:Boolean, orders :List[SubOrderDetails], urnMap:Map[Long, String], utils: MailTemplateHelper):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.120*/("""

"""),format.raw/*5.1*/("""<div style="padding:4% 5%;background-color:white; position:relative; background-color:white; border-left:solid 1px #c1bdbd;border-right:solid 1px #c1bdbd;">
    Dear <span style="text-transform: capitalize;">
    """),_display_(/*7.6*/if(user.ubdfirstname)/*7.27*/{_display_(_display_(/*7.29*/user/*7.33*/.ubdfirstname))}/*7.48*/else/*7.52*/{_display_(Seq[Any](format.raw/*7.53*/("""Investor""")))}),format.raw/*7.62*/("""</span>,<br>

    <p>Thank you for the request for Online SIP in in the below mentioned scheme/schemes.</p>

    <table style="border-collapse: collapse;width:95%; font-size:0.9em; letter-spacing:0; text-align:center;">
        <thead>
        <th  style="border: 1px solid black;">Id</th>
        <th  style="border: 1px solid black;">Scheme</th>
        <th  style="border: 1px solid black;">Plan</th>
        <th  style="border: 1px solid black;">Option</th>
        <th  style="border: 1px solid black;">Amount<br/>(in Rs.)</th>
        <th  style="border: 1px solid black;">Frequency</th>
        """),_display_(/*19.10*/if(typeISIP)/*19.22*/{_display_(Seq[Any](format.raw/*19.23*/("""
        """),format.raw/*20.9*/("""<th  style="border: 1px solid black;">URN</th>
        """)))}),format.raw/*21.10*/("""
        """),format.raw/*22.9*/("""</thead>
        <tbody>
        """),_display_(/*24.10*/for(order <- orders) yield /*24.30*/ {_display_(Seq[Any](format.raw/*24.32*/("""
        """),format.raw/*25.9*/("""<tr>
            <td  style="border: 1px solid black;">"""),_display_(/*26.52*/order/*26.57*/.subOrderId),format.raw/*26.68*/("""</td>
            <td  style="border: 1px solid black;">"""),_display_(/*27.52*/order/*27.57*/.schemeName),format.raw/*27.68*/(""" """),format.raw/*27.69*/("""</td>
            <td  style="border: 1px solid black;">"""),_display_(/*28.52*/order/*28.57*/.schemePlan),format.raw/*28.68*/("""</td>
            <td  style="border: 1px solid black;">"""),_display_(/*29.52*/order/*29.57*/.schemeOption),format.raw/*29.70*/("""</td>
            <td  style="border: 1px solid black;">"""),_display_(/*30.52*/utils/*30.57*/.parse(order.amount.get)),format.raw/*30.81*/("""</td>
            <td  style="border: 1px solid black;">"""),_display_(/*31.52*/order/*31.57*/.sipFrequency),format.raw/*31.70*/("""</td>
            """),_display_(/*32.14*/if(typeISIP)/*32.26*/{_display_(Seq[Any](format.raw/*32.27*/("""
            """),format.raw/*33.13*/("""<td  style="border: 1px solid black;">"""),_display_(/*33.52*/urnMap(order.subOrderId)),format.raw/*33.76*/("""</td>
            """)))}),format.raw/*34.14*/("""

        """),format.raw/*36.9*/("""</tr>
        """)))}),format.raw/*37.10*/("""
        """),format.raw/*38.9*/("""</tbody>

    </table>

    """),_display_(/*42.6*/if(!typeISIP)/*42.19*/{_display_(Seq[Any](format.raw/*42.20*/("""
    """),format.raw/*43.5*/("""<p>In order to automate the deduction of the invested amount from your bank account you need
        to submit a signed one-time mandate.</p>
    <p>Soon we will get in touch with you to pick-up the mandate form from you.</p>
    """)))}),format.raw/*46.6*/("""

    """),_display_(/*48.6*/if(typeISIP)/*48.18*/{_display_(Seq[Any](format.raw/*48.19*/("""
    """),format.raw/*49.5*/("""<p>Please complete the online registration of your ISIP by registering the above URN in your registered
        bank website within 20 days (follow the below steps):</p>
    <ul>
        <li>Login to your bank website</li>
        <li>Select the Bill Pay or Biller Registration section</li>
        <li>Select BSE Limited from the Biller list</li>
        <li>Enter the URN number as above</li>
    </ul>

    <em>Note</em>:
    <i>While registering the URN on your bank website, please select Auto Pay option (if available) to avoid
        authorization for each SIP debit. On successful registration of URN on your registered bank website, your ISIP
        would be registered in our records subject to the confirmation received from your bank.</i>

    <p><b>Kindly note that the transaction is liable to be rejected in case information provided is incomplete/incorrect.</b></p>

    """)))}),format.raw/*65.6*/("""

    """),_display_(/*67.6*/contact()),format.raw/*67.15*/("""
    """),format.raw/*68.5*/("""<p>For further information please visit our website<a href=""""),_display_(/*68.66*/utils/*68.71*/.getBaseUrl()),format.raw/*68.84*/("""" style="color:#53ADD0">"""),_display_(/*68.109*/utils/*68.114*/.getBaseUrl()),format.raw/*68.127*/("""</a>.</p>

    <p style="position:absolute; bottom:2%;">
        With Warm Regards,<br>
        Team Fincash</p>

</div>

"""),_display_(/*76.2*/products(utils.getBaseUrl(), utils.getImagePath())))
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
object orderSIP extends orderSIP_Scope0.orderSIP_Scope1.orderSIP
              /*
                  -- GENERATED --
                  DATE: Thu Apr 20 15:53:38 IST 2017
                  SOURCE: D:/workspace/fincash-backend/app/views/orderSIP.scala.html
                  HASH: c5e09fb772cc8cf9401edebe62e5aafb9a7eef4c
                  MATRIX: 703->39|917->157|947->161|1188->377|1217->398|1246->400|1258->404|1282->419|1294->423|1332->424|1371->433|2013->1048|2034->1060|2073->1061|2110->1071|2198->1128|2235->1138|2298->1174|2334->1194|2374->1196|2411->1206|2495->1263|2509->1268|2541->1279|2626->1337|2640->1342|2672->1353|2701->1354|2786->1412|2800->1417|2832->1428|2917->1486|2931->1491|2965->1504|3050->1562|3064->1567|3109->1591|3194->1649|3208->1654|3242->1667|3289->1687|3310->1699|3349->1700|3391->1714|3457->1753|3502->1777|3553->1797|3592->1809|3639->1825|3676->1835|3735->1868|3757->1881|3796->1882|3829->1888|4093->2122|4128->2131|4149->2143|4188->2144|4221->2150|5157->3056|5192->3065|5222->3074|5255->3080|5343->3141|5357->3146|5391->3159|5444->3184|5459->3189|5494->3202|5651->3333
                  LINES: 25->3|30->3|32->5|34->7|34->7|34->7|34->7|34->7|34->7|34->7|34->7|46->19|46->19|46->19|47->20|48->21|49->22|51->24|51->24|51->24|52->25|53->26|53->26|53->26|54->27|54->27|54->27|54->27|55->28|55->28|55->28|56->29|56->29|56->29|57->30|57->30|57->30|58->31|58->31|58->31|59->32|59->32|59->32|60->33|60->33|60->33|61->34|63->36|64->37|65->38|69->42|69->42|69->42|70->43|73->46|75->48|75->48|75->48|76->49|92->65|94->67|94->67|95->68|95->68|95->68|95->68|95->68|95->68|95->68|103->76
                  -- GENERATED --
              */
          