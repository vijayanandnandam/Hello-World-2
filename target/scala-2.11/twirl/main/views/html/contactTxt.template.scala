
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object contactTxt_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._
import utils.mail._
import models._

class contactTxt extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(supPhone: String = "+91-7700954611", supEmail:String = "support@fincash.com"):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.80*/("""

"""),format.raw/*3.1*/("""For any queries, you can contact us at:
Phone: """),_display_(/*4.9*/supPhone),format.raw/*4.17*/("""
"""),format.raw/*5.1*/("""Email: """),_display_(/*5.9*/supEmail))
      }
    }
  }

  def render(supPhone:String,supEmail:String): play.twirl.api.HtmlFormat.Appendable = apply(supPhone,supEmail)

  def f:((String,String) => play.twirl.api.HtmlFormat.Appendable) = (supPhone,supEmail) => apply(supPhone,supEmail)

  def ref: this.type = this

}


}

/**/
object contactTxt extends contactTxt_Scope0.contactTxt
              /*
                  -- GENERATED --
                  DATE: Thu Apr 20 15:53:37 IST 2017
                  SOURCE: D:/workspace/fincash-backend/app/views/contactTxt.scala.html
                  HASH: 3e8a0066b91ee217728960cac9311159b8d63409
                  MATRIX: 580->1|753->79|783->83|857->132|885->140|913->142|946->150
                  LINES: 22->1|27->1|29->3|30->4|30->4|31->5|31->5
                  -- GENERATED --
              */
          