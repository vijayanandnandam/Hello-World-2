
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object registrationStatus_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._
import utils.mail._
import models._

     object registrationStatus_Scope1 {
import _root_.data.model.Tables._

class registrationStatus extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[FcubdRow,MailTemplateHelper,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(user: FcubdRow, utils: MailTemplateHelper):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.45*/("""

"""),format.raw/*5.1*/("""<div style="padding:4% 5%;background-color:white; position:relative; background-color:white; border-left:solid 1px #c1bdbd;border-right:solid 1px #c1bdbd;">
    Dear <span style="text-transform: capitalize;">
    """),_display_(/*7.6*/if(user.ubdfirstname)/*7.27*/{_display_(_display_(/*7.29*/user/*7.33*/.ubdfirstname))}/*7.48*/else/*7.52*/{_display_(Seq[Any](format.raw/*7.53*/("""Investor""")))}),format.raw/*7.62*/("""</span>,<br>

    <p>Congratulations! <br/> Your registration with Fincash is successful and your Fincash Account is active!</p>
    <p>You can now start investing online with Fincash and to know more about our offerings check out our below mentioned products.</p>

    """),_display_(/*12.6*/contact()),format.raw/*12.15*/("""

    """),format.raw/*14.5*/("""<p>Please visit our <a href=""""),_display_(/*14.35*/utils/*14.40*/.getBaseUrl()),format.raw/*14.53*/("""/b/" style="color:#53ADD0">RESOURCE CENTRE</a> to know about Mutual Fund Investments and other investment products.</p>

    <p style="position:absolute; bottom:2%;">
    With Warm Regards,<br>
    Team Fincash</p>
</div>

"""),_display_(/*21.2*/products(utils.getBaseUrl(), utils.getImagePath())),format.raw/*21.52*/("""



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
object registrationStatus extends registrationStatus_Scope0.registrationStatus_Scope1.registrationStatus
              /*
                  -- GENERATED --
                  DATE: Thu Apr 20 15:53:38 IST 2017
                  SOURCE: D:/workspace/fincash-backend/app/views/registrationStatus.scala.html
                  HASH: 20b3d5f439cc5cb8bbfe49f2a238619c26ad5c92
                  MATRIX: 685->39|823->82|853->86|1094->302|1123->323|1152->325|1164->329|1188->344|1200->348|1238->349|1277->358|1579->634|1609->643|1644->651|1701->681|1715->686|1749->699|2006->930|2077->980
                  LINES: 25->3|30->3|32->5|34->7|34->7|34->7|34->7|34->7|34->7|34->7|34->7|39->12|39->12|41->14|41->14|41->14|41->14|48->21|48->21
                  -- GENERATED --
              */
          