
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object registrationVerificationTxt_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._
import utils.mail._
import models._

     object registrationVerificationTxt_Scope1 {
import _root_.data.model.Tables._

class registrationVerificationTxt extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template6[FcubdRow,UserAddress,UserBank,UserFatca,String,MailTemplateHelper,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(user: FcubdRow, address:UserAddress, userBank:UserBank, userFatca:UserFatca, kycStatus: String, utils: MailTemplateHelper):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.125*/("""


"""),format.raw/*6.1*/("""UserId/BSE-Client-Code: """),_display_(/*6.26*/user/*6.30*/.id),format.raw/*6.33*/("""
"""),format.raw/*7.1*/("""------------------------------------------------------------
KYC Status: """),_display_(/*8.14*/kycStatus),format.raw/*8.23*/("""
"""),format.raw/*9.1*/("""------------------------------------------------------------
** User Details:
    Email : """),_display_(/*11.14*/user/*11.18*/.ubdemailid),format.raw/*11.29*/("""
    """),format.raw/*12.5*/("""Mobile :  """),_display_(/*12.16*/user/*12.20*/.ubdmobileno),format.raw/*12.32*/("""
    """),format.raw/*13.5*/("""PAN : """),_display_(/*13.12*/user/*13.16*/.ubdpan),format.raw/*13.23*/("""
    """),format.raw/*14.5*/("""First Name : """),_display_(/*14.19*/user/*14.23*/.ubdfirstname),format.raw/*14.36*/("""
    """),format.raw/*15.5*/("""Middle Name : """),_display_(/*15.20*/user/*15.24*/.ubdmiddlename),format.raw/*15.38*/("""
    """),format.raw/*16.5*/("""Last Name : """),_display_(/*16.18*/user/*16.22*/.ubdlastname),format.raw/*16.34*/("""
    """),format.raw/*17.5*/("""Gender : """),_display_(/*17.15*/user/*17.19*/.ubdgender),format.raw/*17.29*/("""


"""),format.raw/*20.1*/("""** Permanent Address
------------------------------------------------------------

"""),_display_(/*23.2*/address/*23.9*/.permanentAddress.get.address1),format.raw/*23.39*/(""", """),_display_(/*23.42*/address/*23.49*/.permanentAddress.get.address2),format.raw/*23.79*/("""

"""),format.raw/*25.1*/("""Landmark : """),_display_(/*25.13*/address/*25.20*/.permanentAddress.get.landmark),format.raw/*25.50*/(""" """),format.raw/*25.51*/("""Pin : """),_display_(/*25.58*/address/*25.65*/.permanentAddress.get.pin),format.raw/*25.90*/(""" """),format.raw/*25.91*/("""City : """),_display_(/*25.99*/address/*25.106*/.permanentAddress.get.city),format.raw/*25.132*/(""" """),format.raw/*25.133*/("""District :"""),_display_(/*25.144*/address/*25.151*/.permanentAddress.get.district),format.raw/*25.181*/("""

"""),format.raw/*27.1*/("""State:"""),_display_(/*27.8*/utils/*27.13*/.getcndVal(address.permanentAddress.get.state.get)),format.raw/*27.63*/(""" """),format.raw/*27.64*/("""Country:"""),_display_(/*27.73*/utils/*27.78*/.getcndVal(address.permanentAddress.get.country.get)),format.raw/*27.130*/("""


"""),format.raw/*30.1*/("""** Current Address
------------------------------------------------------------

"""),_display_(/*33.2*/address/*33.9*/.currentAddress.get.address1),format.raw/*33.37*/(""", """),_display_(/*33.40*/address/*33.47*/.currentAddress.get.address2),format.raw/*33.75*/("""

"""),format.raw/*35.1*/("""Landmark : """),_display_(/*35.13*/address/*35.20*/.currentAddress.get.landmark),format.raw/*35.48*/(""" """),format.raw/*35.49*/("""Pin : """),_display_(/*35.56*/address/*35.63*/.currentAddress.get.pin),format.raw/*35.86*/(""" """),format.raw/*35.87*/("""City : """),_display_(/*35.95*/address/*35.102*/.currentAddress.get.city),format.raw/*35.126*/(""" """),format.raw/*35.127*/("""District : """),_display_(/*35.139*/address/*35.146*/.currentAddress.get.district),format.raw/*35.174*/("""

"""),format.raw/*37.1*/("""State : :"""),_display_(/*37.11*/utils/*37.16*/.getcndVal(address.currentAddress.get.state.get)),format.raw/*37.64*/(""" """),format.raw/*37.65*/("""Country : """),_display_(/*37.76*/utils/*37.81*/.getcndVal(address.currentAddress.get.country.get)),format.raw/*37.131*/("""


"""),format.raw/*40.1*/("""** Bank Details
------------------------------------------------------------

Holder Name : """),_display_(/*43.16*/userBank/*43.24*/.holderName),format.raw/*43.35*/("""

"""),format.raw/*45.1*/("""Account Number : """),_display_(/*45.19*/userBank/*45.27*/.accountNumber),format.raw/*45.41*/(""" """),format.raw/*45.42*/("""Account Type : """),_display_(/*45.58*/utils/*45.63*/.getcndVal(userBank.accountType.get)),format.raw/*45.99*/("""

"""),format.raw/*47.1*/("""Bank Name : """),_display_(/*47.14*/userBank/*47.22*/.bank.get.bankName),format.raw/*47.40*/(""" """),format.raw/*47.41*/("""IFSC : """),_display_(/*47.49*/userBank/*47.57*/.bank.get.IFSC),format.raw/*47.71*/("""

"""),format.raw/*49.1*/("""Branch : """),_display_(/*49.11*/userBank/*49.19*/.bank.get.branch),format.raw/*49.35*/("""

"""),format.raw/*51.1*/("""District : """),_display_(/*51.13*/userBank/*51.21*/.bank.get.district),format.raw/*51.39*/("""

"""),format.raw/*53.1*/("""State : """),_display_(/*53.10*/userBank/*53.18*/.bank.get.state),format.raw/*53.33*/("""


"""),format.raw/*56.1*/("""** FATCA Details
------------------------------------------------------------

Income : """),_display_(/*59.11*/utils/*59.16*/.getcndVal(userFatca.income.get)),format.raw/*59.48*/("""

"""),format.raw/*61.1*/("""Occupation : """),_display_(/*61.15*/utils/*61.20*/.getcndVal(userFatca.occupation.get)),format.raw/*61.56*/(""" """),format.raw/*61.57*/("""Source Of Wealth : """),_display_(/*61.77*/utils/*61.82*/.getcndVal(userFatca.sourceOfWealth.get)),format.raw/*61.122*/("""

"""),format.raw/*63.1*/("""Nationality : """),_display_(/*63.16*/utils/*63.21*/.getcndVal(userFatca.nationality.get)),format.raw/*63.58*/(""" """),format.raw/*63.59*/("""Birth Country : """),_display_(/*63.76*/utils/*63.81*/.getcndVal(userFatca.birthCountry.get)),format.raw/*63.119*/(""" """),format.raw/*63.120*/("""Birth City : """),_display_(/*63.134*/userFatca/*63.143*/.birthCity),format.raw/*63.153*/("""

"""),format.raw/*65.1*/("""Politically Exposed : """),_display_(/*65.24*/userFatca/*65.33*/.politicallyExposed),format.raw/*65.52*/(""" """),format.raw/*65.53*/("""Politically Related : """),_display_(/*65.76*/userFatca/*65.85*/.politicallyRelated),format.raw/*65.104*/("""

"""),format.raw/*67.1*/("""Please find the screen shot of user's uploaded details attached along with this email.
Note:

To activate the user post verification, please click on the following link.

Register In BSE & FATCA ("""),_display_(/*72.27*/utils/*72.32*/.userBSERegisterLink(user.id)),format.raw/*72.61*/(""")
Activate User ("""),_display_(/*73.17*/utils/*73.22*/.userActivationLink(user.id)),format.raw/*73.50*/(""")

"""),_display_(/*75.2*/contactTxt()),format.raw/*75.14*/("""

"""),format.raw/*77.1*/("""With Warm Regards,
Team Fincash"""))
      }
    }
  }

  def render(user:FcubdRow,address:UserAddress,userBank:UserBank,userFatca:UserFatca,kycStatus:String,utils:MailTemplateHelper): play.twirl.api.HtmlFormat.Appendable = apply(user,address,userBank,userFatca,kycStatus,utils)

  def f:((FcubdRow,UserAddress,UserBank,UserFatca,String,MailTemplateHelper) => play.twirl.api.HtmlFormat.Appendable) = (user,address,userBank,userFatca,kycStatus,utils) => apply(user,address,userBank,userFatca,kycStatus,utils)

  def ref: this.type = this

}


}
}

/**/
object registrationVerificationTxt extends registrationVerificationTxt_Scope0.registrationVerificationTxt_Scope1.registrationVerificationTxt
              /*
                  -- GENERATED --
                  DATE: Thu Apr 20 15:53:38 IST 2017
                  SOURCE: D:/workspace/fincash-backend/app/views/registrationVerificationTxt.scala.html
                  HASH: f1d5adafb7751f9152c212fb9a30167c1ed7e219
                  MATRIX: 750->39|969->162|1001->168|1052->193|1064->197|1087->200|1115->202|1216->277|1245->286|1273->288|1393->381|1406->385|1438->396|1471->402|1509->413|1522->417|1555->429|1588->435|1622->442|1635->446|1663->453|1696->459|1737->473|1750->477|1784->490|1817->496|1859->511|1872->515|1907->529|1940->535|1980->548|1993->552|2026->564|2059->570|2096->580|2109->584|2140->594|2173->600|2286->687|2301->694|2352->724|2382->727|2398->734|2449->764|2480->768|2519->780|2535->787|2586->817|2615->818|2649->825|2665->832|2711->857|2740->858|2775->866|2792->873|2840->899|2870->900|2909->911|2926->918|2978->948|3009->952|3042->959|3056->964|3127->1014|3156->1015|3192->1024|3206->1029|3280->1081|3313->1087|3424->1172|3439->1179|3488->1207|3518->1210|3534->1217|3583->1245|3614->1249|3653->1261|3669->1268|3718->1296|3747->1297|3781->1304|3797->1311|3841->1334|3870->1335|3905->1343|3922->1350|3968->1374|3998->1375|4038->1387|4055->1394|4105->1422|4136->1426|4173->1436|4187->1441|4256->1489|4285->1490|4323->1501|4337->1506|4409->1556|4442->1562|4565->1658|4582->1666|4614->1677|4645->1681|4690->1699|4707->1707|4742->1721|4771->1722|4814->1738|4828->1743|4885->1779|4916->1783|4956->1796|4973->1804|5012->1822|5041->1823|5076->1831|5093->1839|5128->1853|5159->1857|5196->1867|5213->1875|5250->1891|5281->1895|5320->1907|5337->1915|5376->1933|5407->1937|5443->1946|5460->1954|5496->1969|5529->1975|5648->2067|5662->2072|5715->2104|5746->2108|5787->2122|5801->2127|5858->2163|5887->2164|5934->2184|5948->2189|6010->2229|6041->2233|6083->2248|6097->2253|6155->2290|6184->2291|6228->2308|6242->2313|6302->2351|6332->2352|6374->2366|6393->2375|6425->2385|6456->2389|6506->2412|6524->2421|6564->2440|6593->2441|6643->2464|6661->2473|6702->2492|6733->2496|6962->2698|6976->2703|7026->2732|7072->2751|7086->2756|7135->2784|7167->2790|7200->2802|7231->2806
                  LINES: 25->3|30->3|33->6|33->6|33->6|33->6|34->7|35->8|35->8|36->9|38->11|38->11|38->11|39->12|39->12|39->12|39->12|40->13|40->13|40->13|40->13|41->14|41->14|41->14|41->14|42->15|42->15|42->15|42->15|43->16|43->16|43->16|43->16|44->17|44->17|44->17|44->17|47->20|50->23|50->23|50->23|50->23|50->23|50->23|52->25|52->25|52->25|52->25|52->25|52->25|52->25|52->25|52->25|52->25|52->25|52->25|52->25|52->25|52->25|52->25|54->27|54->27|54->27|54->27|54->27|54->27|54->27|54->27|57->30|60->33|60->33|60->33|60->33|60->33|60->33|62->35|62->35|62->35|62->35|62->35|62->35|62->35|62->35|62->35|62->35|62->35|62->35|62->35|62->35|62->35|62->35|64->37|64->37|64->37|64->37|64->37|64->37|64->37|64->37|67->40|70->43|70->43|70->43|72->45|72->45|72->45|72->45|72->45|72->45|72->45|72->45|74->47|74->47|74->47|74->47|74->47|74->47|74->47|74->47|76->49|76->49|76->49|76->49|78->51|78->51|78->51|78->51|80->53|80->53|80->53|80->53|83->56|86->59|86->59|86->59|88->61|88->61|88->61|88->61|88->61|88->61|88->61|88->61|90->63|90->63|90->63|90->63|90->63|90->63|90->63|90->63|90->63|90->63|90->63|90->63|92->65|92->65|92->65|92->65|92->65|92->65|92->65|92->65|94->67|99->72|99->72|99->72|100->73|100->73|100->73|102->75|102->75|104->77
                  -- GENERATED --
              */
          