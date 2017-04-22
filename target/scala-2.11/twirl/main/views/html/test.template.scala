
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object test_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._
import utils.mail._
import models._

class test extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.16*/("""
"""),format.raw/*2.1*/("""<!doctype html>
<html lang="en">
    <head>
     
    </head>
    <body>
       Hello <b>"""),_display_(/*8.18*/user),format.raw/*8.22*/("""!</b>
    </body>
</html>
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
object test extends test_Scope0.test
              /*
                  -- GENERATED --
                  DATE: Thu Apr 20 15:53:39 IST 2017
                  SOURCE: D:/workspace/fincash-backend/app/views/test.scala.html
                  HASH: 9da9d0f0fb606e1888c08b26022d0b6aceba4f85
                  MATRIX: 561->1|670->15|698->17|820->113|844->117
                  LINES: 22->1|27->1|28->2|34->8|34->8
                  -- GENERATED --
              */
          