
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object registrationStatusTxt_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._
import utils.mail._
import models._

     object registrationStatusTxt_Scope1 {
import _root_.data.model.Tables._

class registrationStatusTxt extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[FcubdRow,MailTemplateHelper,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(user: FcubdRow, utils: MailTemplateHelper):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.45*/("""



    """),format.raw/*7.5*/("""Dear """),_display_(/*7.11*/if(user.ubdfirstname)/*7.32*/{_display_(_display_(/*7.34*/user/*7.38*/.ubdfirstname))}/*7.53*/else/*7.57*/{_display_(Seq[Any](format.raw/*7.58*/("""Investor""")))}),format.raw/*7.67*/(""",

    Congratulations!
    Your registration with Fincash is successful and your Fincash Account is active!
    You can now start investing online with Fincash and to know more about our offerings check out our below mentioned products.

    """),_display_(/*13.6*/contactTxt()),format.raw/*13.18*/("""

    """),format.raw/*15.5*/("""Please visit our RESOURCE CENTRE("""),_display_(/*15.39*/utils/*15.44*/.getBaseUrl()),format.raw/*15.57*/("""/b/) to know about Mutual Fund Investments and other investment products.

    With Warm Regards,
    Team Fincash


"""))
      }
    }
  }

  def render(user:FcubdRow,utils:MailTemplateHelper): play.twirl.api.HtmlFormat.Appendable = apply(user,utils)

  def f:((FcubdRow,MailTemplateHelper) => play.twirl.api.HtmlFormat.Appendable) = (user,utils) => apply(user,utils)

  def ref: this.type = this

}


}
}

/**/
object registrationStatusTxt extends registrationStatusTxt_Scope0.registrationStatusTxt_Scope1.registrationStatusTxt
              /*
                  -- GENERATED --
                  DATE: Thu Apr 20 15:53:38 IST 2017
                  SOURCE: D:/workspace/fincash-backend/app/views/registrationStatusTxt.scala.html
                  HASH: 05414b3a3b321022f5832f739a1cc6587d1e153c
                  MATRIX: 694->39|832->82|870->94|902->100|931->121|960->123|972->127|996->142|1008->146|1046->147|1085->156|1361->406|1394->418|1429->426|1490->460|1504->465|1538->478
                  LINES: 25->3|30->3|34->7|34->7|34->7|34->7|34->7|34->7|34->7|34->7|34->7|40->13|40->13|42->15|42->15|42->15|42->15
                  -- GENERATED --
              */
          