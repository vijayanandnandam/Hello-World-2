
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object contact_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._
import utils.mail._
import models._

class contact extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(supPhone: String = "+91-7700954611", supEmail:String = "support@fincash.com"):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.80*/("""


"""),format.raw/*4.1*/("""<p>For any queries, you can contact us at:</p>

<ul style="padding:2% 0%; list-style:none; margin:0; min-width:30%;display:inline-block;">
    <li style="margin:0 1% 2% 0;min-width:20%; font-weight:bold;">Phone</li>
    <li style="margin:0 1% 0 0;min-width:20%;color:#53ADD0;">"""),_display_(/*8.63*/supPhone),format.raw/*8.71*/("""</li>
</ul>
<ul style="padding:0%; list-style:none;min-width:50%;  margin-top:0;display:inline-block;">
    <li style="margin:0 1% 2% 0; font-weight:bold;">Email</li>
    <li style="margin:0 1% 0 0;color:#53ADD0;">"""),_display_(/*12.49*/supEmail),format.raw/*12.57*/("""</li>
</ul>"""))
      }
    }
  }

  def render(supPhone:String,supEmail:String): play.twirl.api.HtmlFormat.Appendable = apply(supPhone,supEmail)

  def f:((String,String) => play.twirl.api.HtmlFormat.Appendable) = (supPhone,supEmail) => apply(supPhone,supEmail)

  def ref: this.type = this

}


}

/**/
object contact extends contact_Scope0.contact
              /*
                  -- GENERATED --
                  DATE: Thu Apr 20 15:53:37 IST 2017
                  SOURCE: D:/workspace/fincash-backend/app/views/contact.scala.html
                  HASH: 59edfd784a3ad19273648b674a227f64b4c3b651
                  MATRIX: 574->1|747->79|779->85|1087->367|1115->375|1361->594|1390->602
                  LINES: 22->1|27->1|30->4|34->8|34->8|38->12|38->12
                  -- GENERATED --
              */
          