
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object kycStatusTxt_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._
import utils.mail._
import models._

     object kycStatusTxt_Scope1 {
import _root_.data.model.Tables._

class kycStatusTxt extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[FcubdRow,Boolean,MailTemplateHelper,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(user: FcubdRow, status:Boolean,  utils: MailTemplateHelper):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.62*/("""

"""),format.raw/*5.1*/("""Dear """),_display_(/*5.7*/if(user.ubdfirstname)/*5.28*/{_display_(Seq[Any](format.raw/*5.29*/(""" """),_display_(/*5.31*/user/*5.35*/.ubdfirstname)))}/*5.50*/else/*5.54*/{_display_(Seq[Any](format.raw/*5.55*/("""Investor""")))}),format.raw/*5.64*/(""",

"""),_display_(/*7.2*/if(status)/*7.12*/{_display_(Seq[Any](format.raw/*7.13*/("""Congratulations! Your eKYC registration is successful.
You are just few steps away from investing online on Fincash.com""")))}/*8.66*/else/*8.70*/{_display_(Seq[Any](format.raw/*8.71*/("""We are sorry to inform you that we are unable to process your eKYC registration.Please try again after some time.If the problem persists, we recommend you to opt for the normal PAN based KYC process.""")))}),format.raw/*8.271*/("""
"""),_display_(/*9.2*/contactTxt()),format.raw/*9.14*/("""

"""),format.raw/*11.1*/("""Please visit our RESOURCE CENTRE (""""),_display_(/*11.37*/utils/*11.42*/.getBaseUrl()),format.raw/*11.55*/("""/b/") to know about Mutual Fund Investments and other investment products.

With Warm Regards,
Team Fincash
"""))
      }
    }
  }

  def render(user:FcubdRow,status:Boolean,utils:MailTemplateHelper): play.twirl.api.HtmlFormat.Appendable = apply(user,status,utils)

  def f:((FcubdRow,Boolean,MailTemplateHelper) => play.twirl.api.HtmlFormat.Appendable) = (user,status,utils) => apply(user,status,utils)

  def ref: this.type = this

}


}
}

/**/
object kycStatusTxt extends kycStatusTxt_Scope0.kycStatusTxt_Scope1.kycStatusTxt
              /*
                  -- GENERATED --
                  DATE: Thu Apr 20 15:53:38 IST 2017
                  SOURCE: D:/workspace/fincash-backend/app/views/kycStatusTxt.scala.html
                  HASH: 15b4876695f33cccee41abdd51a28bad0db8a81c
                  MATRIX: 675->39|830->99|860->103|891->109|920->130|958->131|986->133|998->137|1023->152|1035->156|1073->157|1112->166|1143->172|1161->182|1199->183|1338->304|1350->308|1388->309|1619->509|1647->512|1679->524|1710->528|1773->564|1787->569|1821->582
                  LINES: 25->3|30->3|32->5|32->5|32->5|32->5|32->5|32->5|32->5|32->5|32->5|32->5|34->7|34->7|34->7|35->8|35->8|35->8|35->8|36->9|36->9|38->11|38->11|38->11|38->11
                  -- GENERATED --
              */
          