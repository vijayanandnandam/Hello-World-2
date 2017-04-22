
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object orderProcessed_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._
import utils.mail._
import models._

     object orderProcessed_Scope1 {
import _root_.data.model.Tables._

class orderProcessed extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[FcubdRow,OrderDetails,MailTemplateHelper,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(user: FcubdRow, orders :OrderDetails, utils: MailTemplateHelper ,baseURL:String = "https://uat.fincash.com:81"):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.114*/("""


"""),format.raw/*6.1*/("""<div style="padding:4% 5%;background-color:white; position:relative; background-color:white; border-left:solid 1px #c1bdbd;border-right:solid 1px #c1bdbd;">
     Dear <span style="text-transform: capitalize;">
    """),_display_(/*8.6*/if(user.ubdfirstname)/*8.27*/{_display_(_display_(/*8.29*/user/*8.33*/.ubdfirstname))}/*8.48*/else/*8.52*/{_display_(Seq[Any](format.raw/*8.53*/("""Investor""")))}),format.raw/*8.62*/("""</span>,<br>
    <p>Thank you for choosing Fincash! </p>
        <p>This is a confirmation mail that your request for purchase with Order ID - <b>"""),_display_(/*10.91*/orders/*10.97*/.orderId),format.raw/*10.105*/("""</b>
            in the below mentioned scheme/s as placed on """),_display_(/*11.59*/utils/*11.64*/.parseDate(orders.createDate,"yyyy/MM/dd HH:mm:ss","dd MMM yy hh:mm a")),format.raw/*11.135*/("""

            """),format.raw/*13.13*/("""is initiated.</p>

        <table style="border-collapse: collapse;width:95%; font-size:0.9em; letter-spacing:0; text-align:center;">
            <thead>
            <th  style="border: 1px solid black;">Id</th>
            <th  style="border: 1px solid black;">Type</th>
            <th  style="border: 1px solid black;">Scheme</th>
            <th  style="border: 1px solid black;">Amount<br/>(in Rs.)</th>
            <th  style="border: 1px solid black;">Status</th>
            </thead>
            <tbody>
            """),_display_(/*24.14*/for(order <- orders.subOrderDetails) yield /*24.50*/ {_display_(Seq[Any](format.raw/*24.52*/("""
            """),format.raw/*25.13*/("""<tr>
                <td  style="border: 1px solid black;">"""),_display_(/*26.56*/orders/*26.62*/.orderId),format.raw/*26.70*/("""/"""),_display_(/*26.72*/order/*26.77*/.subOrderId),format.raw/*26.88*/("""</td>

                <td  style="border: 1px solid black;">
                    """),_display_(/*29.22*/order/*29.27*/.investmentMode),format.raw/*29.42*/("""
                """),format.raw/*30.17*/("""</td>

                <td  style="border: 1px solid black;">"""),_display_(/*32.56*/order/*32.61*/.schemeName),format.raw/*32.72*/(""" """),format.raw/*32.73*/("""<br/>
                    <i style="font-size:0.9em;">
                        Plan - """),_display_(/*34.33*/order/*34.38*/.schemePlan),format.raw/*34.49*/(""", Option - """),_display_(/*34.61*/order/*34.66*/.schemeOption),format.raw/*34.79*/("""
                    """),format.raw/*35.21*/("""</i>
                </td>

                """),_display_(/*38.18*/if(order.investmentMode=="SIP" ||  order.investmentMode=="sip")/*38.81*/{_display_(Seq[Any](format.raw/*38.82*/("""
                """),format.raw/*39.17*/("""<td  style="border: 1px solid black;padding:1%;">
                    """),_display_(/*40.22*/utils/*40.27*/.parse(order.amount.get)),format.raw/*40.51*/(""" """),format.raw/*40.52*/("""<br/>
                    <i style="font-size:0.9em;">
                        freq - """),_display_(/*42.33*/order/*42.38*/.sipFrequency),format.raw/*42.51*/(""" """),format.raw/*42.52*/("""<br/>
                        Installments - """),_display_(/*43.41*/order/*43.46*/.sipNoOfInstallments),format.raw/*43.66*/("""
                    """),format.raw/*44.21*/("""</i>
                </td>
                """)))}/*46.19*/else/*46.23*/{_display_(Seq[Any](format.raw/*46.24*/("""
                """),format.raw/*47.17*/("""<td  style="border: 1px solid black;">"""),_display_(/*47.56*/utils/*47.61*/.parse(order.amount.get)),format.raw/*47.85*/("""</td>
                """)))}),format.raw/*48.18*/("""

                """),format.raw/*50.17*/("""<td  style="border: 1px solid black;">
                    """),_display_(/*51.22*/order/*51.27*/.stateName),format.raw/*51.37*/("""
                """),format.raw/*52.17*/("""</td>
            </tr>
            """)))}),format.raw/*54.14*/("""
            """),format.raw/*55.13*/("""</tbody>

        </table>
    <p>
        You can check the unit allotment details after the settlement period
        (usually 1-3 days) by <a href=""""),_display_(/*60.41*/utils/*60.46*/.getBaseUrl()),format.raw/*60.59*/("""/auth/login">login</a> into your Fincash account.</p>

    <p>Please find the screen shot of your order summary attached along with this email.</p>

    """),_display_(/*64.6*/contact()),format.raw/*64.15*/("""

    """),format.raw/*66.5*/("""<p>Please visit our <a href=""""),_display_(/*66.35*/utils/*66.40*/.getBaseUrl()),format.raw/*66.53*/("""/b/" style="color:#53ADD0">RESOURCE CENTRE</a> to know about Mutual Fund Investments and other investment products.</p>

    <p style="position:absolute; bottom:2%;">
        With Warm Regards,<br>
        Team Fincash</p>
</div>

"""),_display_(/*73.2*/products(utils.getBaseUrl(), utils.getImagePath())))
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
object orderProcessed extends orderProcessed_Scope0.orderProcessed_Scope1.orderProcessed
              /*
                  -- GENERATED --
                  DATE: Thu Apr 20 15:53:38 IST 2017
                  SOURCE: D:/workspace/fincash-backend/app/views/orderProcessed.scala.html
                  HASH: d3e508f0e23c149c718c8ea3112c14723327657e
                  MATRIX: 693->39|901->151|933->157|1175->374|1204->395|1233->397|1245->401|1269->416|1281->420|1319->421|1358->430|1534->579|1549->585|1579->593|1670->657|1684->662|1777->733|1821->749|2384->1285|2436->1321|2476->1323|2518->1337|2606->1398|2621->1404|2650->1412|2679->1414|2693->1419|2725->1430|2838->1516|2852->1521|2888->1536|2934->1554|3025->1618|3039->1623|3071->1634|3100->1635|3216->1724|3230->1729|3262->1740|3301->1752|3315->1757|3349->1770|3399->1792|3474->1840|3546->1903|3585->1904|3631->1922|3730->1994|3744->1999|3789->2023|3818->2024|3934->2113|3948->2118|3982->2131|4011->2132|4085->2179|4099->2184|4140->2204|4190->2226|4255->2273|4268->2277|4307->2278|4353->2296|4419->2335|4433->2340|4478->2364|4533->2388|4581->2408|4669->2469|4683->2474|4714->2484|4760->2502|4830->2541|4872->2555|5056->2712|5070->2717|5104->2730|5288->2888|5318->2897|5353->2905|5410->2935|5424->2940|5458->2953|5723->3192
                  LINES: 25->3|30->3|33->6|35->8|35->8|35->8|35->8|35->8|35->8|35->8|35->8|37->10|37->10|37->10|38->11|38->11|38->11|40->13|51->24|51->24|51->24|52->25|53->26|53->26|53->26|53->26|53->26|53->26|56->29|56->29|56->29|57->30|59->32|59->32|59->32|59->32|61->34|61->34|61->34|61->34|61->34|61->34|62->35|65->38|65->38|65->38|66->39|67->40|67->40|67->40|67->40|69->42|69->42|69->42|69->42|70->43|70->43|70->43|71->44|73->46|73->46|73->46|74->47|74->47|74->47|74->47|75->48|77->50|78->51|78->51|78->51|79->52|81->54|82->55|87->60|87->60|87->60|91->64|91->64|93->66|93->66|93->66|93->66|100->73
                  -- GENERATED --
              */
          