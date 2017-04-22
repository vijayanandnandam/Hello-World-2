
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object welcome_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._
import utils.mail._
import models._

class welcome extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[MailTemplateHelper,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(utils: MailTemplateHelper, user: String = "Investor"):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.56*/("""


"""),format.raw/*4.1*/("""<div style="padding:4% 5%;background-color:white; position:relative; background-color:white; border-left:solid 1px #c1bdbd;border-right:solid 1px #c1bdbd;">
    Dear """),_display_(/*5.11*/user),format.raw/*5.15*/(""", <br>

    <p>We welcome you to the Fincash family and look forward to have a healthy and wealthy relationship with you.</p>

    <p>To start making most out of your Fincash account kindly follow these steps:</p>
    <ol style="list-style:number">
        <li><a href=""""),_display_(/*11.23*/utils/*11.28*/.getBaseUrl()),format.raw/*11.41*/("""/auth/login">Login</a> to your account.</li>
        <li>Fill up the <a href=""""),_display_(/*12.35*/utils/*12.40*/.getBaseUrl()),format.raw/*12.53*/("""/registration/kyc">registration</a> form with all the correct information</li>
        <li>Upload all the required documents.</li>
    </ol>

    <p>After the successful registration, your Account with fincash.com will be activated.
    You will receive the Account Activation email once the process is complete.</p>

    """),_display_(/*19.6*/contact()),format.raw/*19.15*/("""

    """),format.raw/*21.5*/("""<p>Please visit our <a href=""""),_display_(/*21.35*/utils/*21.40*/.getBaseUrl()),format.raw/*21.53*/("""/b/" style="color:#53ADD0">RESOURCE CENTRE</a> to know about Mutual Fund Investments and other investment products.</p>

    <p style="position:absolute; bottom:2%;">
        With Warm Regards,<br>
        Team Fincash</p>
</div>

"""),_display_(/*28.2*/products(utils.getBaseUrl(), utils.getImagePath())))
      }
    }
  }

  def render(utils:MailTemplateHelper,user:String): play.twirl.api.HtmlFormat.Appendable = apply(utils,user)

  def f:((MailTemplateHelper,String) => play.twirl.api.HtmlFormat.Appendable) = (utils,user) => apply(utils,user)

  def ref: this.type = this

}


}

/**/
object welcome extends welcome_Scope0.welcome
              /*
                  -- GENERATED --
                  DATE: Thu Apr 20 15:53:39 IST 2017
                  SOURCE: D:/workspace/fincash-backend/app/views/welcome.scala.html
                  HASH: c5f3809f91c1889dc22d2a58825fd1bd38160184
                  MATRIX: 586->1|735->55|767->61|961->229|985->233|1289->510|1303->515|1337->528|1444->608|1458->613|1492->626|1848->956|1878->965|1913->973|1970->1003|1984->1008|2018->1021|2283->1260
                  LINES: 22->1|27->1|30->4|31->5|31->5|37->11|37->11|37->11|38->12|38->12|38->12|45->19|45->19|47->21|47->21|47->21|47->21|54->28
                  -- GENERATED --
              */
          