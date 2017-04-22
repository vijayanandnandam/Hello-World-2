
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object mail_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._
import utils.mail._
import models._

     object mail_Scope1 {
import _root_.data.model.Tables._

class mail extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[Html,Html,MailTemplateHelper,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(header:Html, body:Html, mth : MailTemplateHelper, disclaimer:String =""):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.75*/("""
"""),format.raw/*3.1*/("""<html>

<body>

    <div style="background-color: rgba(87,164,190, 0.4); padding:4% 0 1%; letter-spacing:0.6px;line-height:1.5em;">
     <div style="box-sizing:border-box; width:680px; margin:auto;">
        """),_display_(/*9.10*/header),format.raw/*9.16*/("""
        """),_display_(/*10.10*/body),format.raw/*10.14*/("""

        """),format.raw/*12.9*/("""<div style="width:100%; margin-top:5%; letter-spacing:0.6px;">
            Disclaimer:
            <i style="font-size:0.9em; text-align: justify; font-style: italic;">
                """),_display_(/*15.18*/if(disclaimer.isEmpty)/*15.40*/{_display_(Seq[Any](format.raw/*15.41*/("""
                """),format.raw/*16.17*/("""The information provided herein is intended only as an indicative guide and a generic description of the
                products/schemes/services and no representation is given as to the accuracy or completeness of the whole or
                any part of this information. The details provided herein are tentative and subject to change by the service
                provider/product manufacturer without any prior information. Potential investors/buyers are advised to make their
                own enquiries, do their own due diligence and satisfy themselves on all aspects of the products/schemes/services and
                other term including but not limited to pricing, features, benefits both financial and otherwise before making an
                investment/buying decision. Since the product and related services are owned and operated by third party,
                Shepard Technologies Pvt. Ltd. make no warranties or representations express or implied on such product and related services.
                """)))}/*24.18*/else/*24.22*/{_display_(Seq[Any](format.raw/*24.23*/("""
                """),_display_(/*25.18*/disclaimer),format.raw/*25.28*/("""
                """)))}),format.raw/*26.18*/("""
            """),format.raw/*27.13*/("""</i>


            <hr width="50%"/>
            <p style="margin-bottom:5px; text-align:center;">204, A-Wing, Technocity,TTC, MIDC,Mahape,<br/>
                Navi Mumbai- 400710<br/>
            </p>
            <p style="text-align:center;">
                <span style="font-size:12px;">
                    <span class="symbol">&#169;</span>
                    <span class="pad-lr-5">"""),_display_(/*37.45*/mth/*37.48*/.getCurrentYearString),format.raw/*37.69*/(""" """),format.raw/*37.70*/("""Shepard Technologies Private Limited. All Rights Reserved</span>
                </span>
            </p>
        </div>
        </div>
    </div>


</body>
</html>"""))
      }
    }
  }

  def render(header:Html,body:Html,mth:MailTemplateHelper,disclaimer:String): play.twirl.api.HtmlFormat.Appendable = apply(header,body,mth,disclaimer)

  def f:((Html,Html,MailTemplateHelper,String) => play.twirl.api.HtmlFormat.Appendable) = (header,body,mth,disclaimer) => apply(header,body,mth,disclaimer)

  def ref: this.type = this

}


}
}

/**/
object mail extends mail_Scope0.mail_Scope1.mail
              /*
                  -- GENERATED --
                  DATE: Thu Apr 20 15:53:38 IST 2017
                  SOURCE: D:/workspace/fincash-backend/app/views/mail.scala.html
                  HASH: b17a1469da6c90adbd9f19439988acd67662b702
                  MATRIX: 651->37|819->110|847->112|1088->327|1114->333|1152->344|1177->348|1216->360|1432->549|1463->571|1502->572|1548->590|2603->1626|2616->1630|2655->1631|2701->1650|2732->1660|2782->1679|2824->1693|3253->2095|3265->2098|3307->2119|3336->2120
                  LINES: 25->2|30->2|31->3|37->9|37->9|38->10|38->10|40->12|43->15|43->15|43->15|44->16|52->24|52->24|52->24|53->25|53->25|54->26|55->27|65->37|65->37|65->37|65->37
                  -- GENERATED --
              */
          