
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object resetPassword_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._
import utils.mail._
import models._

     object resetPassword_Scope1 {
import _root_.data.model.Tables._

class resetPassword extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[FcubdRow,String,MailTemplateHelper,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(user: FcubdRow, link: String, utils: MailTemplateHelper):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.59*/("""

"""),format.raw/*5.1*/("""<div style="padding:4% 5%;background-color:white; position:relative; background-color:white; border-left:solid 1px #c1bdbd;border-right:solid 1px #c1bdbd;">
    Dear <span style="text-transform: capitalize;">
    """),_display_(/*7.6*/if(user.ubdfirstname)/*7.27*/{_display_(Seq[Any](format.raw/*7.28*/("""
      """),_display_(/*8.8*/user/*8.12*/.ubdfirstname),format.raw/*8.25*/("""
    """)))}/*9.7*/else/*9.11*/{_display_(Seq[Any](format.raw/*9.12*/("""
      """),format.raw/*10.7*/("""Investor
    """)))}),format.raw/*11.6*/("""
"""),format.raw/*12.1*/("""</span>,<br>

    <p>Please click on the following link to reset your password</p>

    <div style="text-align:center">
        <a href=""""),_display_(/*17.19*/link),format.raw/*17.23*/("""" style="text-decoration:none">
            <div  style="padding:0.5% 0.5%; color:white; background-color:#53ADD0; min-width:25%; margin:auto;text-align:center; color:white; font-size:1.1em; font-weight:bold; display:inline-block">
                Reset Password
            </div>
        </a>
    </div>
    <p>If you did not initiate this request, kindly ignore this email.</p>

    """),_display_(/*25.6*/contact()),format.raw/*25.15*/("""

    """),format.raw/*27.5*/("""<p>Please visit our <a href="https://www.fincash.com/b/" style="color:#53ADD0">RESOURCE CENTRE</a> to know about Mutual Fund Investments and other investment products.</p>

    <p style="position:absolute; bottom:2%;">
        With Warm Regards,<br>
        Team Fincash</p>
</div>

"""),_display_(/*34.2*/products(utils.getBaseUrl(), utils.getImagePath())))
      }
    }
  }

  def render(user:FcubdRow,link:String,utils:MailTemplateHelper): play.twirl.api.HtmlFormat.Appendable = apply(user,link,utils)

  def f:((FcubdRow,String,MailTemplateHelper) => play.twirl.api.HtmlFormat.Appendable) = (user,link,utils) => apply(user,link,utils)

  def ref: this.type = this

}


}
}

/**/
object resetPassword extends resetPassword_Scope0.resetPassword_Scope1.resetPassword
              /*
                  -- GENERATED --
                  DATE: Thu Apr 20 15:53:38 IST 2017
                  SOURCE: D:/workspace/fincash-backend/app/views/resetPassword.scala.html
                  HASH: d60c945d9ed3da73aed33ccfbbb1b216ea2b851a
                  MATRIX: 677->39|829->96|859->100|1100->316|1129->337|1167->338|1201->347|1213->351|1246->364|1270->372|1282->376|1320->377|1355->385|1400->400|1429->402|1599->545|1624->549|2045->944|2075->953|2110->961|2427->1252
                  LINES: 25->3|30->3|32->5|34->7|34->7|34->7|35->8|35->8|35->8|36->9|36->9|36->9|37->10|38->11|39->12|44->17|44->17|52->25|52->25|54->27|61->34
                  -- GENERATED --
              */
          