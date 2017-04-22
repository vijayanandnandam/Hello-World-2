
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object testText_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._
import utils.mail._
import models._

class testText extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.16*/("""
"""),format.raw/*2.1*/("""Hello """),_display_(/*2.8*/user),format.raw/*2.12*/("""!
"""))
      }
    }
  }

  def render(user:String): play.twirl.api.HtmlFormat.Appendable = apply(user)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (user) => apply(user)

  def ref: this.type = this

}


}

/**/
object testText extends testText_Scope0.testText
              /*
                  -- GENERATED --
                  DATE: Thu Apr 20 15:53:39 IST 2017
                  SOURCE: D:/workspace/fincash-backend/app/views/testText.scala.html
                  HASH: 5fc7c8e5cffe1e11a045953c03ff393e7b2e0e92
                  MATRIX: 569->1|678->15|706->17|738->24|762->28
                  LINES: 22->1|27->1|28->2|28->2|28->2
                  -- GENERATED --
              */
          