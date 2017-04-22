
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object mailHeader_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._
import utils.mail._
import models._

class mailHeader extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,MailTemplateHelper,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(heading:String = "Welcome", utils: MailTemplateHelper):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.57*/("""
"""),format.raw/*2.1*/("""<a  href=""""),_display_(/*2.12*/utils/*2.17*/.getBaseUrl()),format.raw/*2.30*/("""" style="text-decoration:none;">
    <div style="text-align:right;max-width:100%;border:solid 1px #c1bdbd; padding:2.5%; background: white url("""),_display_(/*3.112*/utils/*3.117*/.getImagePath()),format.raw/*3.132*/("""/assets/img/logo.png) no-repeat 2%; background-size: auto 30px;" >
        <div style="color: #6e6e6e; font-size:1.3em; font-weight:600">"""),_display_(/*4.72*/heading),format.raw/*4.79*/(""" """),format.raw/*4.80*/("""</div>
    </div>
</a>"""))
      }
    }
  }

  def render(heading:String,utils:MailTemplateHelper): play.twirl.api.HtmlFormat.Appendable = apply(heading,utils)

  def f:((String,MailTemplateHelper) => play.twirl.api.HtmlFormat.Appendable) = (heading,utils) => apply(heading,utils)

  def ref: this.type = this

}


}

/**/
object mailHeader extends mailHeader_Scope0.mailHeader
              /*
                  -- GENERATED --
                  DATE: Thu Apr 20 15:53:38 IST 2017
                  SOURCE: D:/workspace/fincash-backend/app/views/mailHeader.scala.html
                  HASH: 587dbd90de941ccc60f4e5cbcbd9444da55efe9b
                  MATRIX: 592->1|742->56|770->58|807->69|820->74|853->87|1025->232|1039->237|1075->252|1240->391|1267->398|1295->399
                  LINES: 22->1|27->1|28->2|28->2|28->2|28->2|29->3|29->3|29->3|30->4|30->4|30->4
                  -- GENERATED --
              */
          