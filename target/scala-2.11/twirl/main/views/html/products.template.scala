
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object products_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._
import utils.mail._
import models._

class products extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(baseURL: String, imageURL: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.37*/("""

"""),format.raw/*3.1*/("""<div style="max-width:100%;background-color:#f2f2f2;text-align:center;margin-top:-20px;padding:2% 3% 1%;border:solid 1px #c1bdbd;border-top:none;">
    <h3 style="text-align:center; color: #6e6e6e;margin:0"> Fincash Products</h3>

    <ul style="text-align:center; list-style:none; margin:auto; padding:0;">
        <li style="display:inline-block">
            <figure style="display:inline-block">
                <a href=""""),_display_(/*9.27*/baseURL),format.raw/*9.34*/("""/sip"> <img src=""""),_display_(/*9.52*/imageURL),format.raw/*9.60*/("""/assets/img/product/smart-sip.png" ></a>
                <figcaption>SmartSIP</figcaption>
            </figure>
        </li>
        <li style="display:inline-block">
            <figure style="display:inline-block">
                <a href=""""),_display_(/*15.27*/baseURL),format.raw/*15.34*/("""/cash"> <img src=""""),_display_(/*15.53*/imageURL),format.raw/*15.61*/("""/assets/img/product/saving-plus.png" ></a>
                <figcaption>SavingsPlus</figcaption>
            </figure>
        </li>
        <li style="display:inline-block">
            <figure style="display:inline-block">
                <a href=""""),_display_(/*21.27*/baseURL),format.raw/*21.34*/("""/tax"> <img src=""""),_display_(/*21.52*/imageURL),format.raw/*21.60*/("""/assets/img/product/tax-saver.png" ></a>
                <figcaption>Tax Saver</figcaption>
            </figure>
        </li>
    </ul>

</div>"""))
      }
    }
  }

  def render(baseURL:String,imageURL:String): play.twirl.api.HtmlFormat.Appendable = apply(baseURL,imageURL)

  def f:((String,String) => play.twirl.api.HtmlFormat.Appendable) = (baseURL,imageURL) => apply(baseURL,imageURL)

  def ref: this.type = this

}


}

/**/
object products extends products_Scope0.products
              /*
                  -- GENERATED --
                  DATE: Thu Apr 20 15:53:38 IST 2017
                  SOURCE: D:/workspace/fincash-backend/app/views/products.scala.html
                  HASH: af571d8176348b7d7bc1778ac972a7b4a8482b5c
                  MATRIX: 576->1|706->36|736->40|1194->472|1221->479|1265->497|1293->505|1571->756|1599->763|1645->782|1674->790|1957->1046|1985->1053|2030->1071|2059->1079
                  LINES: 22->1|27->1|29->3|35->9|35->9|35->9|35->9|41->15|41->15|41->15|41->15|47->21|47->21|47->21|47->21
                  -- GENERATED --
              */
          