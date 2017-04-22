
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object registrationVerification_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._
import utils.mail._
import models._

     object registrationVerification_Scope1 {
import _root_.data.model.Tables._

class registrationVerification extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template6[FcubdRow,UserAddress,UserBank,UserFatca,String,MailTemplateHelper,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(user: FcubdRow, address:UserAddress, userBank:UserBank, userFatca:UserFatca, kycStatus: String, utils: MailTemplateHelper):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.125*/("""


"""),format.raw/*6.1*/("""<div style="padding:4% 5%;background-color:white; position:relative; background-color:white; border-left:solid 1px #c1bdbd;border-right:solid 1px #c1bdbd;">

    <h3>UserId/BSE-Client-Code: """),_display_(/*8.34*/user/*8.38*/.id),format.raw/*8.41*/("""</h3>
    <h3>KYC Status: """),_display_(/*9.22*/kycStatus),format.raw/*9.31*/("""</h3>

    <h3><b>User Details:</b></h3>
    <table style="border-collapse: collapse;width:95%; font-size:0.9em; letter-spacing:0; text-align:center;">
        <thead>
        <th style="border: 1px solid black;">Email</th>
        <th style="border: 1px solid black;">Mobile</th>
        <th style="border: 1px solid black;">PAN</th>
        <th style="border: 1px solid black;">First Name</th>
        <th style="border: 1px solid black;">Middle Name</th>
        <th style="border: 1px solid black;">Last Name</th>
        <th style="border: 1px solid black;">Gender</th>
        </thead>
        <tbody>
            <tr>
                <td style="border: 1px solid black;">"""),_display_(/*24.55*/user/*24.59*/.ubdemailid),format.raw/*24.70*/("""</td>
                <td style="border: 1px solid black;">"""),_display_(/*25.55*/user/*25.59*/.ubdmobileno),format.raw/*25.71*/("""</td>
                <td style="border: 1px solid black;">"""),_display_(/*26.55*/user/*26.59*/.ubdpan),format.raw/*26.66*/("""</td>
                <td style="border: 1px solid black;">"""),_display_(/*27.55*/user/*27.59*/.ubdfirstname),format.raw/*27.72*/("""</td>
                <td style="border: 1px solid black;">"""),_display_(/*28.55*/user/*28.59*/.ubdmiddlename),format.raw/*28.73*/("""</td>
                <td style="border: 1px solid black;">"""),_display_(/*29.55*/user/*29.59*/.ubdlastname),format.raw/*29.71*/("""</td>
                <td style="border: 1px solid black;" >"""),_display_(/*30.56*/user/*30.60*/.ubdgender),format.raw/*30.70*/("""</td>
            </tr>
        </tbody>
    </table>
    <h3 style="text-decoration:underline;text-align:center;">Permanent Address</h3>
       <p>"""),_display_(/*35.12*/address/*35.19*/.permanentAddress.get.address1),format.raw/*35.49*/(""", """),_display_(/*35.52*/address/*35.59*/.permanentAddress.get.address2),format.raw/*35.89*/("""</p>
        <p>
            <b>Landmark : </b>"""),_display_(/*37.32*/address/*37.39*/.permanentAddress.get.landmark),format.raw/*37.69*/("""
            """),format.raw/*38.13*/("""<b>Pin : </b>"""),_display_(/*38.27*/address/*38.34*/.permanentAddress.get.pin),format.raw/*38.59*/("""
            """),format.raw/*39.13*/("""<b>City : </b>"""),_display_(/*39.28*/address/*39.35*/.permanentAddress.get.city),format.raw/*39.61*/("""
            """),format.raw/*40.13*/("""<b>District :</b>"""),_display_(/*40.31*/address/*40.38*/.permanentAddress.get.district),format.raw/*40.68*/("""
        """),format.raw/*41.9*/("""</p>
        <p>
            <b>State</b>:"""),_display_(/*43.27*/utils/*43.32*/.getcndVal(address.permanentAddress.get.state.get)),format.raw/*43.82*/("""
            """),format.raw/*44.13*/("""<b>Country</b>:"""),_display_(/*44.29*/utils/*44.34*/.getcndVal(address.permanentAddress.get.country.get)),format.raw/*44.86*/("""
        """),format.raw/*45.9*/("""</p>

    <h3 style="text-decoration:underline;text-align:center;">Current Address</h3>
    <p>"""),_display_(/*48.9*/address/*48.16*/.currentAddress.get.address1),format.raw/*48.44*/(""", """),_display_(/*48.47*/address/*48.54*/.currentAddress.get.address2),format.raw/*48.82*/("""</p>
     <p>
         <b>Landmark : </b>"""),_display_(/*50.29*/address/*50.36*/.currentAddress.get.landmark),format.raw/*50.64*/("""
         """),format.raw/*51.10*/("""<b>Pin : </b>"""),_display_(/*51.24*/address/*51.31*/.currentAddress.get.pin),format.raw/*51.54*/("""
         """),format.raw/*52.10*/("""<b>City : </b>"""),_display_(/*52.25*/address/*52.32*/.currentAddress.get.city),format.raw/*52.56*/("""
         """),format.raw/*53.10*/("""<b>District : </b>"""),_display_(/*53.29*/address/*53.36*/.currentAddress.get.district),format.raw/*53.64*/("""
     """),format.raw/*54.6*/("""</p>
    <p>
        <b>State : </b>:"""),_display_(/*56.26*/utils/*56.31*/.getcndVal(address.currentAddress.get.state.get)),format.raw/*56.79*/("""
        """),format.raw/*57.9*/("""<b>Country : </b>"""),_display_(/*57.27*/utils/*57.32*/.getcndVal(address.currentAddress.get.country.get)),format.raw/*57.82*/("""
    """),format.raw/*58.5*/("""</p>

    <h3 style="text-decoration:underline;text-align:center;">Bank Details</h3>
       <p><b>Holder Name : </b>"""),_display_(/*61.33*/userBank/*61.41*/.holderName),format.raw/*61.52*/(""" """),format.raw/*61.53*/("""</p>
       <p>
           <b>Account Number : </b>"""),_display_(/*63.37*/userBank/*63.45*/.accountNumber),format.raw/*63.59*/("""
           """),format.raw/*64.12*/("""<b>Account Type : </b>"""),_display_(/*64.35*/utils/*64.40*/.getcndVal(userBank.accountType.get)),format.raw/*64.76*/("""
       """),format.raw/*65.8*/("""</p>
       <p>
           <b>Bank Name : </b>"""),_display_(/*67.32*/userBank/*67.40*/.bank.get.bankName),format.raw/*67.58*/("""
           """),format.raw/*68.12*/("""<b>IFSC : </b>"""),_display_(/*68.27*/userBank/*68.35*/.bank.get.IFSC),format.raw/*68.49*/("""
       """),format.raw/*69.8*/("""</p>
        <p><b>Branch : </b>"""),_display_(/*70.29*/userBank/*70.37*/.bank.get.branch),format.raw/*70.53*/("""</p>
        <p><b>District : </b>"""),_display_(/*71.31*/userBank/*71.39*/.bank.get.district),format.raw/*71.57*/("""</p>
        <p><b>State : </b>"""),_display_(/*72.28*/userBank/*72.36*/.bank.get.state),format.raw/*72.51*/("""</p>



    <h3 style="text-decoration:underline;text-align:center;">FATCA Details</h3>
        <p><b>Income : </b>"""),_display_(/*77.29*/utils/*77.34*/.getcndVal(userFatca.income.get)),format.raw/*77.66*/("""</p>
        <p>
            <b>Occupation : </b>"""),_display_(/*79.34*/utils/*79.39*/.getcndVal(userFatca.occupation.get)),format.raw/*79.75*/("""
            """),format.raw/*80.13*/("""<b>Source Of Wealth : </b>"""),_display_(/*80.40*/utils/*80.45*/.getcndVal(userFatca.sourceOfWealth.get)),format.raw/*80.85*/("""
        """),format.raw/*81.9*/("""</p>
        <p>
            <b>Nationality : </b>"""),_display_(/*83.35*/utils/*83.40*/.getcndVal(userFatca.nationality.get)),format.raw/*83.77*/("""
            """),format.raw/*84.13*/("""<b>Birth Country : </b>"""),_display_(/*84.37*/utils/*84.42*/.getcndVal(userFatca.birthCountry.get)),format.raw/*84.80*/("""
            """),format.raw/*85.13*/("""<b>Birth City : </b>"""),_display_(/*85.34*/userFatca/*85.43*/.birthCity),format.raw/*85.53*/("""
        """),format.raw/*86.9*/("""</p>
        <p>
            <b>Politically Exposed : </b>"""),_display_(/*88.43*/userFatca/*88.52*/.politicallyExposed),format.raw/*88.71*/("""
            """),format.raw/*89.13*/("""<b>Politically Related : </b>"""),_display_(/*89.43*/userFatca/*89.52*/.politicallyRelated),format.raw/*89.71*/("""
        """),format.raw/*90.9*/("""</p>


    <p>Please find the screen shot of user's uploaded details attached along with this email.</p>


    <pre>Note:</pre> To activate the user post verification, please click on the following link.

    <div style="text-align:center">
        <a href=""""),_display_(/*99.19*/utils/*99.24*/.userBSERegisterLink(user.id)),format.raw/*99.53*/("""" style="text-decoration:none">
            <div  style="padding:0.5% 0.5%; color:white; background-color:#53ADD0; min-width:25%; margin:auto;text-align:center; color:white; font-size:1.1em; font-weight:bold; display:inline-block">
                Register In BSE & FATCA
            </div>
        </a>

        <a href=""""),_display_(/*105.19*/utils/*105.24*/.userActivationLink(user.id)),format.raw/*105.52*/("""" style="text-decoration:none">
            <div  style="padding:0.5% 0.5%; color:white; background-color:#53ADD0; min-width:25%; margin:auto;text-align:center; color:white; font-size:1.1em; font-weight:bold; display:inline-block">
                Activate User
            </div>
        </a>
    </div>

    """),_display_(/*112.6*/contact()),format.raw/*112.15*/("""

    """),format.raw/*114.5*/("""<p style="position:absolute; bottom:2%;">
        With Warm Regards,<br>
        Team Fincash</p>
</div>

"""),_display_(/*119.2*/products(utils.getBaseUrl(), utils.getImagePath())))
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
object registrationVerification extends registrationVerification_Scope0.registrationVerification_Scope1.registrationVerification
              /*
                  -- GENERATED --
                  DATE: Thu Apr 20 15:53:38 IST 2017
                  SOURCE: D:/workspace/fincash-backend/app/views/registrationVerification.scala.html
                  HASH: 59069eb0bd8e7a916dea30612eb2c558fc55db9d
                  MATRIX: 741->39|960->162|992->168|1211->361|1223->365|1246->368|1300->396|1329->405|2050->1099|2063->1103|2095->1114|2183->1175|2196->1179|2229->1191|2317->1252|2330->1256|2358->1263|2446->1324|2459->1328|2493->1341|2581->1402|2594->1406|2629->1420|2717->1481|2730->1485|2763->1497|2852->1559|2865->1563|2896->1573|3077->1727|3093->1734|3144->1764|3174->1767|3190->1774|3241->1804|3318->1854|3334->1861|3385->1891|3427->1905|3468->1919|3484->1926|3530->1951|3572->1965|3614->1980|3630->1987|3677->2013|3719->2027|3764->2045|3780->2052|3831->2082|3868->2092|3940->2137|3954->2142|4025->2192|4067->2206|4110->2222|4124->2227|4197->2279|4234->2289|4359->2388|4375->2395|4424->2423|4454->2426|4470->2433|4519->2461|4590->2505|4606->2512|4655->2540|4694->2551|4735->2565|4751->2572|4795->2595|4834->2606|4876->2621|4892->2628|4937->2652|4976->2663|5022->2682|5038->2689|5087->2717|5121->2724|5188->2764|5202->2769|5271->2817|5308->2827|5353->2845|5367->2850|5438->2900|5471->2906|5618->3026|5635->3034|5667->3045|5696->3046|5777->3100|5794->3108|5829->3122|5870->3135|5920->3158|5934->3163|5991->3199|6027->3208|6103->3257|6120->3265|6159->3283|6200->3296|6242->3311|6259->3319|6294->3333|6330->3342|6391->3376|6408->3384|6445->3400|6508->3436|6525->3444|6564->3462|6624->3495|6641->3503|6677->3518|6825->3639|6839->3644|6892->3676|6971->3728|6985->3733|7042->3769|7084->3783|7138->3810|7152->3815|7213->3855|7250->3865|7330->3918|7344->3923|7402->3960|7444->3974|7495->3998|7509->4003|7568->4041|7610->4055|7658->4076|7676->4085|7707->4095|7744->4105|7832->4166|7850->4175|7890->4194|7932->4208|7989->4238|8007->4247|8047->4266|8084->4276|8379->4544|8393->4549|8443->4578|8800->4907|8815->4912|8865->4940|9210->5258|9241->5267|9277->5275|9416->5387
                  LINES: 25->3|30->3|33->6|35->8|35->8|35->8|36->9|36->9|51->24|51->24|51->24|52->25|52->25|52->25|53->26|53->26|53->26|54->27|54->27|54->27|55->28|55->28|55->28|56->29|56->29|56->29|57->30|57->30|57->30|62->35|62->35|62->35|62->35|62->35|62->35|64->37|64->37|64->37|65->38|65->38|65->38|65->38|66->39|66->39|66->39|66->39|67->40|67->40|67->40|67->40|68->41|70->43|70->43|70->43|71->44|71->44|71->44|71->44|72->45|75->48|75->48|75->48|75->48|75->48|75->48|77->50|77->50|77->50|78->51|78->51|78->51|78->51|79->52|79->52|79->52|79->52|80->53|80->53|80->53|80->53|81->54|83->56|83->56|83->56|84->57|84->57|84->57|84->57|85->58|88->61|88->61|88->61|88->61|90->63|90->63|90->63|91->64|91->64|91->64|91->64|92->65|94->67|94->67|94->67|95->68|95->68|95->68|95->68|96->69|97->70|97->70|97->70|98->71|98->71|98->71|99->72|99->72|99->72|104->77|104->77|104->77|106->79|106->79|106->79|107->80|107->80|107->80|107->80|108->81|110->83|110->83|110->83|111->84|111->84|111->84|111->84|112->85|112->85|112->85|112->85|113->86|115->88|115->88|115->88|116->89|116->89|116->89|116->89|117->90|126->99|126->99|126->99|132->105|132->105|132->105|139->112|139->112|141->114|146->119
                  -- GENERATED --
              */
          