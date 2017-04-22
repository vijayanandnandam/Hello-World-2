
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object resetPasswordTxt_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._
import utils.mail._
import models._

     object resetPasswordTxt_Scope1 {
import _root_.data.model.Tables._

class resetPasswordTxt extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[FcubdRow,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(user: FcubdRow, link: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.32*/("""

"""),format.raw/*5.1*/("""Dear """),_display_(/*5.7*/if(user.ubdfirstname)/*5.28*/{_display_(Seq[Any](format.raw/*5.29*/(""" """),_display_(/*5.31*/user/*5.35*/.ubdfirstname)))}/*5.50*/else/*5.54*/{_display_(Seq[Any](format.raw/*5.55*/("""Investor""")))}),format.raw/*5.64*/(""",
    Please click on the following link to reset your password
    """),_display_(/*7.6*/link),format.raw/*7.10*/("""

    """),format.raw/*9.5*/("""If you did not initiate this request, kindly ignore this email.

    """),_display_(/*11.6*/contactTxt()),format.raw/*11.18*/("""


    """),format.raw/*14.5*/("""Please visit our RESOURCE CENTRE (https://www.fincash.com/b/) to know about Mutual Fund Investments and other investment products.

    Disclaimer:
        The information provided herein is intended only as an indicative guide and a generic description of the
        products/schemes/services and no representation is given as to the accuracy or completeness of the whole or
        any part of this information. The details provided herein are tentative and subject to change by the service
        provider/product manufacturer without any prior information. Potential investors/buyers are advised to make their
        own enquiries, do their own due diligence and satisfy themselves on all aspects of the products/schemes/services and
        other term including but not limited to pricing, features, benefits both financial and otherwise before making an
        investment/buying decision. Since the product and related services are owned and operated by third party,
        Shepard Technologies Pvt. Ltd. make no warranties or representations express or implied
        on such product and related services.

    With Warm Regards,
    Team Fincash"""))
      }
    }
  }

  def render(user:FcubdRow,link:String): play.twirl.api.HtmlFormat.Appendable = apply(user,link)

  def f:((FcubdRow,String) => play.twirl.api.HtmlFormat.Appendable) = (user,link) => apply(user,link)

  def ref: this.type = this

}


}
}

/**/
object resetPasswordTxt extends resetPasswordTxt_Scope0.resetPasswordTxt_Scope1.resetPasswordTxt
              /*
                  -- GENERATED --
                  DATE: Thu Apr 20 15:53:39 IST 2017
                  SOURCE: D:/workspace/fincash-backend/app/views/resetPasswordTxt.scala.html
                  HASH: 00dabd1858b4ab2a8317ee510ee4040bf23c32e3
                  MATRIX: 667->39|792->69|822->73|853->79|882->100|920->101|948->103|960->107|985->122|997->126|1035->127|1074->136|1170->207|1194->211|1228->219|1326->291|1359->303|1396->313
                  LINES: 25->3|30->3|32->5|32->5|32->5|32->5|32->5|32->5|32->5|32->5|32->5|32->5|34->7|34->7|36->9|38->11|38->11|41->14
                  -- GENERATED --
              */
          