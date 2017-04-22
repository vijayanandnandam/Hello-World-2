
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object passwordTxt_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._
import utils.mail._
import models._

class passwordTxt extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[String,String,MailTemplateHelper,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: String, password: String, utils: MailTemplateHelper):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.61*/("""


    """),format.raw/*4.5*/("""Dear """),_display_(/*4.11*/if(user)/*4.19*/{_display_(Seq[Any](format.raw/*4.20*/(""" """),_display_(/*4.22*/user)))}/*4.28*/else/*4.32*/{_display_(Seq[Any](format.raw/*4.33*/(""" """),format.raw/*4.34*/("""Investor""")))}),format.raw/*4.43*/("""

    """),format.raw/*6.5*/("""Here is your temporary password : """),_display_(/*6.40*/password),format.raw/*6.48*/("""
    """),format.raw/*7.5*/("""Kindly change the password after first login
    If you did not initiate this request, kindly ignore this email.

    """),_display_(/*10.6*/contactTxt()),format.raw/*10.18*/("""

    """),format.raw/*12.5*/("""Please visit our RESOURCE CENTRE("""),_display_(/*12.39*/utils/*12.44*/.getBaseUrl()),format.raw/*12.57*/("""/b/) to know about Mutual Fund Investments and other investment products.


    With Warm Regards,
    Team Fincash"""))
      }
    }
  }

  def render(user:String,password:String,utils:MailTemplateHelper): play.twirl.api.HtmlFormat.Appendable = apply(user,password,utils)

  def f:((String,String,MailTemplateHelper) => play.twirl.api.HtmlFormat.Appendable) = (user,password,utils) => apply(user,password,utils)

  def ref: this.type = this

}


}

/**/
object passwordTxt extends passwordTxt_Scope0.passwordTxt
              /*
                  -- GENERATED --
                  DATE: Thu Apr 20 15:53:38 IST 2017
                  SOURCE: D:/workspace/fincash-backend/app/views/passwordTxt.scala.html
                  HASH: c6db4f2eacacc3b19d7fd8c18b7dbbafb7e1711c
                  MATRIX: 601->1|755->60|791->70|823->76|839->84|877->85|905->87|921->93|933->97|971->98|999->99|1038->108|1072->116|1133->151|1161->159|1193->165|1341->287|1374->299|1409->307|1470->341|1484->346|1518->359
                  LINES: 22->1|27->1|30->4|30->4|30->4|30->4|30->4|30->4|30->4|30->4|30->4|30->4|32->6|32->6|32->6|33->7|36->10|36->10|38->12|38->12|38->12|38->12
                  -- GENERATED --
              */
          