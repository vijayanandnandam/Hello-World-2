
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object welcomeTxt_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._
import utils.mail._
import models._

class welcomeTxt extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: String = "Investor", baseurl:String = "https://uat.fincash.com:81"):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.76*/("""

"""),format.raw/*3.1*/("""Dear """),_display_(/*3.7*/user),format.raw/*3.11*/(""",

    We welcome you to the Fincash family and look forward to have a healthy and wealthy relationship with you.

    To start making most out of your Fincash account kindly follow these steps:
        Login (""""),_display_(/*8.18*/baseurl),format.raw/*8.25*/("""/auth/login") to your account.
        Fill up the registration form with all the correct information(""""),_display_(/*9.74*/baseurl),format.raw/*9.81*/("""/registration/kyc)
        Upload all the required documents.

    After the successful registration, your Account with fincash.com will be activated.
        You will receive the Account Activation email once the process is complete.

    """),_display_(/*15.6*/contactTxt()),format.raw/*15.18*/("""

    """),format.raw/*17.5*/("""Please visit our RESOURCE CENTRE("https://www.fincash.com/b/")to know about Mutual Fund Investments and other investment products.

    With Warm Regards,
    Team Fincash
"""))
      }
    }
  }

  def render(user:String,baseurl:String): play.twirl.api.HtmlFormat.Appendable = apply(user,baseurl)

  def f:((String,String) => play.twirl.api.HtmlFormat.Appendable) = (user,baseurl) => apply(user,baseurl)

  def ref: this.type = this

}


}

/**/
object welcomeTxt extends welcomeTxt_Scope0.welcomeTxt
              /*
                  -- GENERATED --
                  DATE: Thu Apr 20 15:53:39 IST 2017
                  SOURCE: D:/workspace/fincash-backend/app/views/welcomeTxt.scala.html
                  HASH: 691cb74532edf71ea78fcf400fc9dd0eeffed79f
                  MATRIX: 580->1|749->75|779->79|810->85|834->89|1077->306|1104->313|1235->418|1262->425|1535->672|1568->684|1603->692
                  LINES: 22->1|27->1|29->3|29->3|29->3|34->8|34->8|35->9|35->9|41->15|41->15|43->17
                  -- GENERATED --
              */
          