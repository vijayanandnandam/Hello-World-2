
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object password_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._
import utils.mail._
import models._

class password extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[String,String,MailTemplateHelper,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: String, password: String, utils: MailTemplateHelper):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.61*/("""

"""),format.raw/*3.1*/("""<div style="padding:4% 5%;background-color:white; position:relative; background-color:white; border-left:solid 1px #c1bdbd;border-right:solid 1px #c1bdbd;">
    Dear <span style="text-transform: capitalize;">
    """),_display_(/*5.6*/if(user)/*5.14*/{_display_(Seq[Any](format.raw/*5.15*/("""
      """),_display_(/*6.8*/user),format.raw/*6.12*/("""
    """)))}/*7.7*/else/*7.11*/{_display_(Seq[Any](format.raw/*7.12*/("""
      """),format.raw/*8.7*/("""Investor
    """)))}),format.raw/*9.6*/("""
"""),format.raw/*10.1*/("""</span>,<br>
    <p>Here is your temporary password for login to Fincash:</p>
    <p style="text-align:center">"""),_display_(/*12.35*/password),format.raw/*12.43*/("""</p>
    <p>Kindly change the password after first login</p>
    <p>If you did not initiate this request, kindly ignore this email.</p>

    """),_display_(/*16.6*/contact()),format.raw/*16.15*/("""

    """),format.raw/*18.5*/("""<p>Please visit our <a href=""""),_display_(/*18.35*/utils/*18.40*/.getBaseUrl()),format.raw/*18.53*/("""/b/" style="color:#53ADD0">RESOURCE CENTRE</a> to know about Mutual Fund Investments and other investment products.</p>

    <p style="position:absolute; bottom:2%;">
        With Warm Regards,<br>
        Team Fincash</p>
</div>

"""),_display_(/*25.2*/products(utils.getBaseUrl(), utils.getImagePath())))
      }
    }
  }

  def render(user:String,password:String,utils:MailTemplateHelper): play.twirl.api.HtmlFormat.Appendable = apply(user,password,utils)

  def f:((String,String,MailTemplateHelper) => play.twirl.api.HtmlFormat.Appendable) = (user,password,utils) => apply(user,password,utils)

  def ref: this.type = this

}


}

/**/
object password extends password_Scope0.password
              /*
                  -- GENERATED --
                  DATE: Thu Apr 20 15:53:38 IST 2017
                  SOURCE: D:/workspace/fincash-backend/app/views/password.scala.html
                  HASH: f0e5119e4e9b11fa24492c37915884675afd13d4
                  MATRIX: 595->1|749->60|779->64|1020->280|1036->288|1074->289|1108->298|1132->302|1156->310|1168->314|1206->315|1240->323|1284->338|1313->340|1454->454|1483->462|1655->608|1685->617|1720->625|1777->655|1791->660|1825->673|2090->912
                  LINES: 22->1|27->1|29->3|31->5|31->5|31->5|32->6|32->6|33->7|33->7|33->7|34->8|35->9|36->10|38->12|38->12|42->16|42->16|44->18|44->18|44->18|44->18|51->25
                  -- GENERATED --
              */
          