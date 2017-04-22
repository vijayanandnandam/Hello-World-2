
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object kycStatus_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._
import utils.mail._
import models._

     object kycStatus_Scope1 {
import _root_.data.model.Tables._

class kycStatus extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[FcubdRow,Boolean,MailTemplateHelper,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(user: FcubdRow, status:Boolean,  utils: MailTemplateHelper):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.62*/("""


"""),format.raw/*6.1*/("""<div style="padding:4% 5%;background-color:white; position:relative; background-color:white; border-left:solid 1px #c1bdbd;border-right:solid 1px #c1bdbd;">
    Dear <span style="text-transform: capitalize;">
    """),_display_(/*8.6*/if(user.ubdfirstname)/*8.27*/{_display_(_display_(/*8.29*/user/*8.33*/.ubdfirstname))}/*8.48*/else/*8.52*/{_display_(Seq[Any](format.raw/*8.53*/("""Investor""")))}),format.raw/*8.62*/("""</span>,<br>

    """),_display_(/*10.6*/if(status)/*10.16*/{_display_(Seq[Any](format.raw/*10.17*/("""
    """),format.raw/*11.5*/("""<p>Congratulations! Your eKYC registration is successful.</p>
    <p>You are just few steps away from investing online on Fincash.com</p>
    """)))}/*13.6*/else/*13.10*/{_display_(Seq[Any](format.raw/*13.11*/("""
    """),format.raw/*14.5*/("""<p>We are sorry to inform you that we are unable to process your eKYC registration.</p>
    <p>Please try again after some time.</p>

    <b>If the problem persists, we recommend you to opt for the normal PAN based KYC process.</b>
    """)))}),format.raw/*18.6*/("""

    """),_display_(/*20.6*/contact()),format.raw/*20.15*/("""

    """),format.raw/*22.5*/("""<p>Please visit our <a href=""""),_display_(/*22.35*/utils/*22.40*/.getBaseUrl()),format.raw/*22.53*/("""/b/" style="color:#53ADD0">RESOURCE CENTRE</a> to know about Mutual Fund Investments and other investment products.</p>

    <p style="position:absolute; bottom:2%;">
        With Warm Regards,<br>
        Team Fincash</p>
</div>

"""),_display_(/*29.2*/products(utils.getBaseUrl(), utils.getImagePath())))
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
object kycStatus extends kycStatus_Scope0.kycStatus_Scope1.kycStatus
              /*
                  -- GENERATED --
                  DATE: Thu Apr 20 15:53:38 IST 2017
                  SOURCE: D:/workspace/fincash-backend/app/views/kycStatus.scala.html
                  HASH: be11e180071686b5a9d2842ffbaf30960948bdb7
                  MATRIX: 666->39|821->99|853->105|1094->321|1123->342|1152->344|1164->348|1188->363|1200->367|1238->368|1277->377|1324->398|1343->408|1382->409|1415->415|1578->560|1591->564|1630->565|1663->571|1934->812|1969->821|1999->830|2034->838|2091->868|2105->873|2139->886|2404->1125
                  LINES: 25->3|30->3|33->6|35->8|35->8|35->8|35->8|35->8|35->8|35->8|35->8|37->10|37->10|37->10|38->11|40->13|40->13|40->13|41->14|45->18|47->20|47->20|49->22|49->22|49->22|49->22|56->29
                  -- GENERATED --
              */
          