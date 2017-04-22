package data.model

import repository.core.BaseEntity
import repository.core.BaseTable
import java.util.Calendar
import utils.DateTimeUtils

// AUTO-GENERATED Slick data model
/** Stand-alone Slick data model for immediate use */
object Tables extends {
  val profile = slick.jdbc.MySQLProfile
} with Tables


/** Slick data model trait for extension, choice of backend or usage in the cake pattern. (Make sure to initialize this late.) */
trait Tables {
  val profile: slick.jdbc.JdbcProfile
  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}

  /** DDL for all tables. Call .create to execute. */
  lazy val schema = Array(Fcact.schema, Fcaipt.schema, Fcall.schema, Fcalt.schema, Fcamct.schema, Fcamt.schema, Fcanst.schema, Fcara.schema, Fcasbt.schema, Fcasst.schema, Fcbbt.schema, Fcbca.schema, Fcbcra.schema, Fcbda.schema, Fcben.schema, Fcbmt.schema, Fcbpa.schema, Fcbra.schema, Fcbraa.schema, Fcbrta.schema, Fcbse.schema, Fcbua.schema, Fccnd.schema, Fccomt.schema, Fccost.schema, Fccst.schema, Fcctmt.schema, Fccyr.schema, Fcdam.schema, Fcdbd.schema, Fcdbr.schema, Fcdmt.schema, Fcdpc.schema, Fcdrd.schema, Fcdrqp.schema, Fcdsa.schema, Fcdsd.schema, Fcebse.schema, Fcefut.schema, Fceubd.schema, Fcfhs.schema, Fcfht.schema, Fcfomt.schema, Fcfpt.schema, Fcfrt.schema, Fcfut.schema, Fcholi.schema, Fchspa.schema, Fcimt.schema, Fcipv.schema, Fcirql.schema, Fcirsl.schema, Fckra.schema, Fckyc.schema, Fclpsa.schema, Fcmdt.schema, Fcmmt.schema, Fcmmtl.schema, Fcndt.schema, Fcoaf.schema, Fcoht.schema, Fcolt.schema, Fcomt.schema, Fcopd.schema, Fcosht.schema, Fcostm.schema, Fcotpt.schema, Fcpass.schema, Fcppa.schema, Fcprmt.schema, Fcpst.schema, Fcqkey.schema, Fcqmt.schema, Fcqst.schema, Fcrag.schema, Fcramt.schema, Fcrbt.schema, Fcremt.schema, Fcrfl.schema, Fcrlt.schema, Fcrmt.schema, Fcrta.schema, Fcsaa.schema, Fcscq.schema, Fcscra.schema, Fcsec.schema, Fcset.schema, Fcsft.schema, Fcsia.schema, Fcsidt.schema, Fcsip.schema, Fcsips.schema, Fcsit.schema, Fcslmt.schema, Fcsmt.schema, Fcsoct.schema, Fcsoel.schema, Fcsoit.schema, Fcsopt.schema, Fcsot.schema, Fcspst.schema, Fcsra.schema, Fcsraa.schema, Fcssh.schema, Fcsst.schema, Fcstt.schema, Fcsttl.schema, Fctlt.schema, Fcuaa.schema, Fcuact.schema, Fcubd.schema, Fcuft.schema, Fcull.schema, Fcult.schema, Fcuoa.schema, Fcupd.schema, Fcupt.schema, Fcurp.schema, Fcvlog.schema, Fcxlt.schema).reduceLeft(_ ++ _)
  @deprecated("Use .schema instead of .ddl", "3.0")
  def ddl = schema

  /** Entity class storing rows of table Fcact
   *  @param actrfnum Database column ACTRFNUM SqlType(BIGINT), AutoInc, PrimaryKey
   *  @param actconstantname Database column ACTCONSTANTNAME SqlType(VARCHAR), Length(256,true)
   *  @param actconstantvalue Database column ACTCONSTANTVALUE SqlType(VARCHAR), Length(512,true)
   *  @param actactive Database column ACTACTIVE SqlType(CHAR), Length(2,false)
   *  @param createdate 
   *  @param modifydate 
   *  @param createdby 
   *  @param lastmodifiedby  */
  case class FcactRow(id: Long, actconstantname: String, actconstantvalue: String, actactive: String, createdate: Option[java.sql.Timestamp] = None, modifydate: java.sql.Timestamp, createdby: String, lastmodifiedby: String) extends BaseEntity 
  class FcactRowWrapper(id: Option[Long], actconstantname: String, actconstantvalue: String, actactive: String) {
    def get(userName: String): FcactRow = {
      FcactRow(this.id.getOrElse(0), this.actconstantname, this.actconstantvalue, this.actactive, Some(DateTimeUtils.getCurrentTimeStamp), DateTimeUtils.getCurrentTimeStamp, userName, userName)
  	}
  }
  /** GetResult implicit for fetching FcactRow objects using plain SQL queries */
  implicit def GetResultFcactRow(implicit e0: GR[Long], e1: GR[String], e2: GR[Option[java.sql.Timestamp]], e3: GR[java.sql.Timestamp]): GR[FcactRow] = GR{
    prs => import prs._
    FcactRow.tupled((<<[Long], <<[String], <<[String], <<[String], <<?[java.sql.Timestamp], <<[java.sql.Timestamp], <<[String], <<[String]))
  }
  /** Table description of table FCACT. Objects of this class serve as prototypes for rows in queries. */
  class Fcact(_tableTag: Tag) extends BaseTable[FcactRow](_tableTag, "FCACT") {
    def * = (id, actconstantname, actconstantvalue, actactive, createdate, modifydate, createdby, lastmodifiedby) <> (FcactRow.tupled, FcactRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(actconstantname), Rep.Some(actconstantvalue), Rep.Some(actactive), createdate, Rep.Some(modifydate), Rep.Some(createdby), Rep.Some(lastmodifiedby)).shaped.<>({r=>import r._; _1.map(_=> FcactRow.tupled((_1.get, _2.get, _3.get, _4.get, _5, _6.get, _7.get, _8.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column ACTRFNUM SqlType(BIGINT), AutoInc, PrimaryKey */
    override val id: Rep[Long] = column[Long]("ACTRFNUM", O.AutoInc, O.PrimaryKey)
    /** Database column ACTCONSTANTNAME SqlType(VARCHAR), Length(256,true) */
    val actconstantname: Rep[String] = column[String]("ACTCONSTANTNAME", O.Length(256,varying=true))
    /** Database column ACTCONSTANTVALUE SqlType(VARCHAR), Length(512,true) */
    val actconstantvalue: Rep[String] = column[String]("ACTCONSTANTVALUE", O.Length(512,varying=true))
    /** Database column ACTACTIVE SqlType(CHAR), Length(2,false) */
    val actactive: Rep[String] = column[String]("ACTACTIVE", O.Length(2,varying=false))
  }
  /** Collection-like TableQuery object for table Fcact */
  lazy val Fcact = new TableQuery(tag => new Fcact(tag))

  /** Entity class storing rows of table Fcaipt
   *  @param aiptrfnum Database column AIPTRFNUM SqlType(BIGINT), AutoInc, PrimaryKey
   *  @param aiptsipday Database column AIPTSIPDAY SqlType(VARCHAR), Length(128,true)
   *  @param aiptsoptrfnum Database column AIPTSOPTRFNUM SqlType(BIGINT)
   *  @param aiptfrequency Database column AIPTFREQUENCY SqlType(CHAR), Length(2,false)
   *  @param aiptmintenure Database column AIPTMINTENURE SqlType(INT)
   *  @param aipttype Database column AIPTTYPE SqlType(CHAR), Length(4,false)
   *  @param aiptminamount Database column AIPTMINAMOUNT SqlType(INT)
   *  @param aiptadditionalamt Database column AIPTADDITIONALAMT SqlType(INT)
   *  @param aiptmaxamount Database column AIPTMAXAMOUNT SqlType(BIGINT)
   *  @param aiptmaxtenure Database column AIPTMAXTENURE SqlType(BIGINT)
   *  @param aiptmultiplier Database column AIPTMULTIPLIER SqlType(INT)
   *  @param aiptidentifier Database column AIPTIDENTIFIER SqlType(CHAR), Length(10,false)
   *  @param createdate 
   *  @param modifydate 
   *  @param createdby 
   *  @param lastmodifiedby  */
  case class FcaiptRow(id: Long, aiptsipday: String, aiptsoptrfnum: Long, aiptfrequency: String, aiptmintenure: Int, aipttype: String, aiptminamount: Int, aiptadditionalamt: Int, aiptmaxamount: Long, aiptmaxtenure: Long, aiptmultiplier: Int, aiptidentifier: String, createdate: Option[java.sql.Timestamp] = None, modifydate: java.sql.Timestamp, createdby: String, lastmodifiedby: String) extends BaseEntity 
  class FcaiptRowWrapper(id: Option[Long], aiptsipday: String, aiptsoptrfnum: Long, aiptfrequency: String, aiptmintenure: Int, aipttype: String, aiptminamount: Int, aiptadditionalamt: Int, aiptmaxamount: Long, aiptmaxtenure: Long, aiptmultiplier: Int, aiptidentifier: String) {
    def get(userName: String): FcaiptRow = {
      FcaiptRow(this.id.getOrElse(0), this.aiptsipday, this.aiptsoptrfnum, this.aiptfrequency, this.aiptmintenure, this.aipttype, this.aiptminamount, this.aiptadditionalamt, this.aiptmaxamount, this.aiptmaxtenure, this.aiptmultiplier, this.aiptidentifier, Some(DateTimeUtils.getCurrentTimeStamp), DateTimeUtils.getCurrentTimeStamp, userName, userName)
  	}
  }
  /** GetResult implicit for fetching FcaiptRow objects using plain SQL queries */
  implicit def GetResultFcaiptRow(implicit e0: GR[Long], e1: GR[String], e2: GR[Int], e3: GR[Option[java.sql.Timestamp]], e4: GR[java.sql.Timestamp]): GR[FcaiptRow] = GR{
    prs => import prs._
    FcaiptRow.tupled((<<[Long], <<[String], <<[Long], <<[String], <<[Int], <<[String], <<[Int], <<[Int], <<[Long], <<[Long], <<[Int], <<[String], <<?[java.sql.Timestamp], <<[java.sql.Timestamp], <<[String], <<[String]))
  }
  /** Table description of table FCAIPT. Objects of this class serve as prototypes for rows in queries. */
  class Fcaipt(_tableTag: Tag) extends BaseTable[FcaiptRow](_tableTag, "FCAIPT") {
    def * = (id, aiptsipday, aiptsoptrfnum, aiptfrequency, aiptmintenure, aipttype, aiptminamount, aiptadditionalamt, aiptmaxamount, aiptmaxtenure, aiptmultiplier, aiptidentifier, createdate, modifydate, createdby, lastmodifiedby) <> (FcaiptRow.tupled, FcaiptRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(aiptsipday), Rep.Some(aiptsoptrfnum), Rep.Some(aiptfrequency), Rep.Some(aiptmintenure), Rep.Some(aipttype), Rep.Some(aiptminamount), Rep.Some(aiptadditionalamt), Rep.Some(aiptmaxamount), Rep.Some(aiptmaxtenure), Rep.Some(aiptmultiplier), Rep.Some(aiptidentifier), createdate, Rep.Some(modifydate), Rep.Some(createdby), Rep.Some(lastmodifiedby)).shaped.<>({r=>import r._; _1.map(_=> FcaiptRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get, _7.get, _8.get, _9.get, _10.get, _11.get, _12.get, _13, _14.get, _15.get, _16.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column AIPTRFNUM SqlType(BIGINT), AutoInc, PrimaryKey */
    override val id: Rep[Long] = column[Long]("AIPTRFNUM", O.AutoInc, O.PrimaryKey)
    /** Database column AIPTSIPDAY SqlType(VARCHAR), Length(128,true) */
    val aiptsipday: Rep[String] = column[String]("AIPTSIPDAY", O.Length(128,varying=true))
    /** Database column AIPTSOPTRFNUM SqlType(BIGINT) */
    val aiptsoptrfnum: Rep[Long] = column[Long]("AIPTSOPTRFNUM")
    /** Database column AIPTFREQUENCY SqlType(CHAR), Length(2,false) */
    val aiptfrequency: Rep[String] = column[String]("AIPTFREQUENCY", O.Length(2,varying=false))
    /** Database column AIPTMINTENURE SqlType(INT) */
    val aiptmintenure: Rep[Int] = column[Int]("AIPTMINTENURE")
    /** Database column AIPTTYPE SqlType(CHAR), Length(4,false) */
    val aipttype: Rep[String] = column[String]("AIPTTYPE", O.Length(4,varying=false))
    /** Database column AIPTMINAMOUNT SqlType(INT) */
    val aiptminamount: Rep[Int] = column[Int]("AIPTMINAMOUNT")
    /** Database column AIPTADDITIONALAMT SqlType(INT) */
    val aiptadditionalamt: Rep[Int] = column[Int]("AIPTADDITIONALAMT")
    /** Database column AIPTMAXAMOUNT SqlType(BIGINT) */
    val aiptmaxamount: Rep[Long] = column[Long]("AIPTMAXAMOUNT")
    /** Database column AIPTMAXTENURE SqlType(BIGINT) */
    val aiptmaxtenure: Rep[Long] = column[Long]("AIPTMAXTENURE")
    /** Database column AIPTMULTIPLIER SqlType(INT) */
    val aiptmultiplier: Rep[Int] = column[Int]("AIPTMULTIPLIER")
    /** Database column AIPTIDENTIFIER SqlType(CHAR), Length(10,false) */
    val aiptidentifier: Rep[String] = column[String]("AIPTIDENTIFIER", O.Length(10,varying=false))





    /** Foreign key referencing Fcsopt (database name FK_FCAIPT_FCSOPT) */
    lazy val fcsoptFk = foreignKey("FK_FCAIPT_FCSOPT", aiptsoptrfnum, Fcsopt)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table Fcaipt */
  lazy val Fcaipt = new TableQuery(tag => new Fcaipt(tag))

  /** Entity class storing rows of table Fcall
   *  @param allrfnum Database column ALLRFNUM SqlType(BIGINT), AutoInc, PrimaryKey
   *  @param allaltrfnum Database column ALLALTRFNUM SqlType(BIGINT)
   *  @param alllogintime Database column ALLLOGINTIME SqlType(TIME)
   *  @param allloginip Database column ALLLOGINIP SqlType(VARCHAR), Length(16,true)
   *  @param alllogindevice Database column ALLLOGINDEVICE SqlType(CHAR), Length(2,false), Default(None)
   *  @param allisuccessful Database column ALLISUCCESSFUL SqlType(CHAR), Length(2,false) */
  case class FcallRow(id: Long, allaltrfnum: Long, alllogintime: java.sql.Time, allloginip: String, alllogindevice: Option[String] = None, allisuccessful: String) extends BaseEntity 
  class FcallRowWrapper(id: Option[Long], allaltrfnum: Long, alllogintime: java.sql.Time, allloginip: String, alllogindevice: Option[String] = None, allisuccessful: String) {
    def get(userName: String): FcallRow = {
      FcallRow(this.id.getOrElse(0), this.allaltrfnum, this.alllogintime, this.allloginip, this.alllogindevice, this.allisuccessful)
  	}
  }
  /** GetResult implicit for fetching FcallRow objects using plain SQL queries */
  implicit def GetResultFcallRow(implicit e0: GR[Long], e1: GR[java.sql.Time], e2: GR[String], e3: GR[Option[String]]): GR[FcallRow] = GR{
    prs => import prs._
    FcallRow.tupled((<<[Long], <<[Long], <<[java.sql.Time], <<[String], <<?[String], <<[String]))
  }
  /** Table description of table FCALL. Objects of this class serve as prototypes for rows in queries. */
  class Fcall(_tableTag: Tag) extends BaseTable[FcallRow](_tableTag, "FCALL") {
    def * = (id, allaltrfnum, alllogintime, allloginip, alllogindevice, allisuccessful) <> (FcallRow.tupled, FcallRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(allaltrfnum), Rep.Some(alllogintime), Rep.Some(allloginip), alllogindevice, Rep.Some(allisuccessful)).shaped.<>({r=>import r._; _1.map(_=> FcallRow.tupled((_1.get, _2.get, _3.get, _4.get, _5, _6.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column ALLRFNUM SqlType(BIGINT), AutoInc, PrimaryKey */
    override val id: Rep[Long] = column[Long]("ALLRFNUM", O.AutoInc, O.PrimaryKey)
    /** Database column ALLALTRFNUM SqlType(BIGINT) */
    val allaltrfnum: Rep[Long] = column[Long]("ALLALTRFNUM")
    /** Database column ALLLOGINTIME SqlType(TIME) */
    val alllogintime: Rep[java.sql.Time] = column[java.sql.Time]("ALLLOGINTIME")
    /** Database column ALLLOGINIP SqlType(VARCHAR), Length(16,true) */
    val allloginip: Rep[String] = column[String]("ALLLOGINIP", O.Length(16,varying=true))
    /** Database column ALLLOGINDEVICE SqlType(CHAR), Length(2,false), Default(None) */
    val alllogindevice: Rep[Option[String]] = column[Option[String]]("ALLLOGINDEVICE", O.Length(2,varying=false), O.Default(None))
    /** Database column ALLISUCCESSFUL SqlType(CHAR), Length(2,false) */
    val allisuccessful: Rep[String] = column[String]("ALLISUCCESSFUL", O.Length(2,varying=false))

    /** Foreign key referencing Fcalt (database name FK_FCALL_FCALT) */
    lazy val fcaltFk = foreignKey("FK_FCALL_FCALT", allaltrfnum, Fcalt)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table Fcall */
  lazy val Fcall = new TableQuery(tag => new Fcall(tag))

  /** Entity class storing rows of table Fcalt
   *  @param altrfnum Database column ALTRFNUM SqlType(BIGINT), AutoInc, PrimaryKey
   *  @param altubdrfnum Database column ALTUBDRFNUM SqlType(BIGINT)
   *  @param altusername Database column ALTUSERNAME SqlType(VARCHAR), Length(64,true)
   *  @param altpassword Database column ALTPASSWORD SqlType(VARCHAR), Length(32,true)
   *  @param altlastlogin Database column ALTLASTLOGIN SqlType(TIME)
   *  @param altloginstatus Database column ALTLOGINSTATUS SqlType(CHAR), Length(2,false) */
  case class FcaltRow(id: Long, altubdrfnum: Long, altusername: String, altpassword: String, altlastlogin: java.sql.Time, altloginstatus: String) extends BaseEntity 
  class FcaltRowWrapper(id: Option[Long], altubdrfnum: Long, altusername: String, altpassword: String, altlastlogin: java.sql.Time, altloginstatus: String) {
    def get(userName: String): FcaltRow = {
      FcaltRow(this.id.getOrElse(0), this.altubdrfnum, this.altusername, this.altpassword, this.altlastlogin, this.altloginstatus)
  	}
  }
  /** GetResult implicit for fetching FcaltRow objects using plain SQL queries */
  implicit def GetResultFcaltRow(implicit e0: GR[Long], e1: GR[String], e2: GR[java.sql.Time]): GR[FcaltRow] = GR{
    prs => import prs._
    FcaltRow.tupled((<<[Long], <<[Long], <<[String], <<[String], <<[java.sql.Time], <<[String]))
  }
  /** Table description of table FCALT. Objects of this class serve as prototypes for rows in queries. */
  class Fcalt(_tableTag: Tag) extends BaseTable[FcaltRow](_tableTag, "FCALT") {
    def * = (id, altubdrfnum, altusername, altpassword, altlastlogin, altloginstatus) <> (FcaltRow.tupled, FcaltRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(altubdrfnum), Rep.Some(altusername), Rep.Some(altpassword), Rep.Some(altlastlogin), Rep.Some(altloginstatus)).shaped.<>({r=>import r._; _1.map(_=> FcaltRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column ALTRFNUM SqlType(BIGINT), AutoInc, PrimaryKey */
    override val id: Rep[Long] = column[Long]("ALTRFNUM", O.AutoInc, O.PrimaryKey)
    /** Database column ALTUBDRFNUM SqlType(BIGINT) */
    val altubdrfnum: Rep[Long] = column[Long]("ALTUBDRFNUM")
    /** Database column ALTUSERNAME SqlType(VARCHAR), Length(64,true) */
    val altusername: Rep[String] = column[String]("ALTUSERNAME", O.Length(64,varying=true))
    /** Database column ALTPASSWORD SqlType(VARCHAR), Length(32,true) */
    val altpassword: Rep[String] = column[String]("ALTPASSWORD", O.Length(32,varying=true))
    /** Database column ALTLASTLOGIN SqlType(TIME) */
    val altlastlogin: Rep[java.sql.Time] = column[java.sql.Time]("ALTLASTLOGIN")
    /** Database column ALTLOGINSTATUS SqlType(CHAR), Length(2,false) */
    val altloginstatus: Rep[String] = column[String]("ALTLOGINSTATUS", O.Length(2,varying=false))

    /** Index over (altubdrfnum) (database name IXFK_FCALT_FCUBD) */
    val index1 = index("IXFK_FCALT_FCUBD", altubdrfnum)
    /** Uniqueness Index over (altusername) (database name UNIQUEUSERNAME) */
    val index2 = index("UNIQUEUSERNAME", altusername, unique=true)
  }
  /** Collection-like TableQuery object for table Fcalt */
  lazy val Fcalt = new TableQuery(tag => new Fcalt(tag))

  /** Entity class storing rows of table Fcamct
   *  @param amctrfnum Database column AMCTRFNUM SqlType(BIGINT), AutoInc, PrimaryKey
   *  @param amctlegalname Database column AMCTLEGALNAME SqlType(VARCHAR), Length(128,true)
   *  @param amctdisplayname Database column AMCTDISPLAYNAME SqlType(VARCHAR), Length(128,true), Default(None)
   *  @param amctbrandname Database column AMCTBRANDNAME SqlType(VARCHAR), Length(128,true), Default(None)
   *  @param amctdetails Database column AMCTDETAILS SqlType(VARCHAR), Length(128,true), Default(None)
   *  @param amctamtrfnum Database column AMCTAMTRFNUM SqlType(BIGINT), Default(None)
   *  @param amctwebsite Database column AMCTWEBSITE SqlType(VARCHAR), Length(128,true), Default(None)
   *  @param amctincorporationdate Database column AMCTINCORPORATIONDATE SqlType(TIMESTAMP), Default(None)
   *  @param amctfundhousetype Database column AMCTFUNDHOUSETYPE SqlType(CHAR), Length(4,false), Default(None)
   *  @param amctaum Database column AMCTAUM SqlType(DOUBLE), Default(None)
   *  @param amctactive Database column AMCTACTIVE SqlType(CHAR), Length(2,false), Default(Y)
   *  @param amctrtacode Database column AMCTRTACODE SqlType(CHAR), Length(10,false)
   *  @param createdate 
   *  @param modifydate 
   *  @param createdby 
   *  @param lastmodifiedby  */
  case class FcamctRow(id: Long, amctlegalname: String, amctdisplayname: Option[String] = None, amctbrandname: Option[String] = None, amctdetails: Option[String] = None, amctamtrfnum: Option[Long] = None, amctwebsite: Option[String] = None, amctincorporationdate: Option[java.sql.Timestamp] = None, amctfundhousetype: Option[String] = None, amctaum: Option[Double] = None, amctactive: String = "Y", amctrtacode: String, createdate: Option[java.sql.Timestamp] = None, modifydate: java.sql.Timestamp, createdby: String, lastmodifiedby: String) extends BaseEntity 
  class FcamctRowWrapper(id: Option[Long], amctlegalname: String, amctdisplayname: Option[String] = None, amctbrandname: Option[String] = None, amctdetails: Option[String] = None, amctamtrfnum: Option[Long] = None, amctwebsite: Option[String] = None, amctincorporationdate: Option[java.sql.Timestamp] = None, amctfundhousetype: Option[String] = None, amctaum: Option[Double] = None, amctactive: String = "Y", amctrtacode: String) {
    def get(userName: String): FcamctRow = {
      FcamctRow(this.id.getOrElse(0), this.amctlegalname, this.amctdisplayname, this.amctbrandname, this.amctdetails, this.amctamtrfnum, this.amctwebsite, this.amctincorporationdate, this.amctfundhousetype, this.amctaum, this.amctactive, this.amctrtacode, Some(DateTimeUtils.getCurrentTimeStamp), DateTimeUtils.getCurrentTimeStamp, userName, userName)
  	}
  }
  /** GetResult implicit for fetching FcamctRow objects using plain SQL queries */
  implicit def GetResultFcamctRow(implicit e0: GR[Long], e1: GR[String], e2: GR[Option[String]], e3: GR[Option[Long]], e4: GR[Option[java.sql.Timestamp]], e5: GR[Option[Double]], e6: GR[java.sql.Timestamp]): GR[FcamctRow] = GR{
    prs => import prs._
    FcamctRow.tupled((<<[Long], <<[String], <<?[String], <<?[String], <<?[String], <<?[Long], <<?[String], <<?[java.sql.Timestamp], <<?[String], <<?[Double], <<[String], <<[String], <<?[java.sql.Timestamp], <<[java.sql.Timestamp], <<[String], <<[String]))
  }
  /** Table description of table FCAMCT. Objects of this class serve as prototypes for rows in queries. */
  class Fcamct(_tableTag: Tag) extends BaseTable[FcamctRow](_tableTag, "FCAMCT") {
    def * = (id, amctlegalname, amctdisplayname, amctbrandname, amctdetails, amctamtrfnum, amctwebsite, amctincorporationdate, amctfundhousetype, amctaum, amctactive, amctrtacode, createdate, modifydate, createdby, lastmodifiedby) <> (FcamctRow.tupled, FcamctRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(amctlegalname), amctdisplayname, amctbrandname, amctdetails, amctamtrfnum, amctwebsite, amctincorporationdate, amctfundhousetype, amctaum, Rep.Some(amctactive), Rep.Some(amctrtacode), createdate, Rep.Some(modifydate), Rep.Some(createdby), Rep.Some(lastmodifiedby)).shaped.<>({r=>import r._; _1.map(_=> FcamctRow.tupled((_1.get, _2.get, _3, _4, _5, _6, _7, _8, _9, _10, _11.get, _12.get, _13, _14.get, _15.get, _16.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column AMCTRFNUM SqlType(BIGINT), AutoInc, PrimaryKey */
    override val id: Rep[Long] = column[Long]("AMCTRFNUM", O.AutoInc, O.PrimaryKey)
    /** Database column AMCTLEGALNAME SqlType(VARCHAR), Length(128,true) */
    val amctlegalname: Rep[String] = column[String]("AMCTLEGALNAME", O.Length(128,varying=true))
    /** Database column AMCTDISPLAYNAME SqlType(VARCHAR), Length(128,true), Default(None) */
    val amctdisplayname: Rep[Option[String]] = column[Option[String]]("AMCTDISPLAYNAME", O.Length(128,varying=true), O.Default(None))
    /** Database column AMCTBRANDNAME SqlType(VARCHAR), Length(128,true), Default(None) */
    val amctbrandname: Rep[Option[String]] = column[Option[String]]("AMCTBRANDNAME", O.Length(128,varying=true), O.Default(None))
    /** Database column AMCTDETAILS SqlType(VARCHAR), Length(128,true), Default(None) */
    val amctdetails: Rep[Option[String]] = column[Option[String]]("AMCTDETAILS", O.Length(128,varying=true), O.Default(None))
    /** Database column AMCTAMTRFNUM SqlType(BIGINT), Default(None) */
    val amctamtrfnum: Rep[Option[Long]] = column[Option[Long]]("AMCTAMTRFNUM", O.Default(None))
    /** Database column AMCTWEBSITE SqlType(VARCHAR), Length(128,true), Default(None) */
    val amctwebsite: Rep[Option[String]] = column[Option[String]]("AMCTWEBSITE", O.Length(128,varying=true), O.Default(None))
    /** Database column AMCTINCORPORATIONDATE SqlType(TIMESTAMP), Default(None) */
    val amctincorporationdate: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("AMCTINCORPORATIONDATE", O.Default(None))
    /** Database column AMCTFUNDHOUSETYPE SqlType(CHAR), Length(4,false), Default(None) */
    val amctfundhousetype: Rep[Option[String]] = column[Option[String]]("AMCTFUNDHOUSETYPE", O.Length(4,varying=false), O.Default(None))
    /** Database column AMCTAUM SqlType(DOUBLE), Default(None) */
    val amctaum: Rep[Option[Double]] = column[Option[Double]]("AMCTAUM", O.Default(None))
    /** Database column AMCTACTIVE SqlType(CHAR), Length(2,false), Default(Y) */
    val amctactive: Rep[String] = column[String]("AMCTACTIVE", O.Length(2,varying=false), O.Default("Y"))
    /** Database column AMCTRTACODE SqlType(CHAR), Length(10,false) */
    val amctrtacode: Rep[String] = column[String]("AMCTRTACODE", O.Length(10,varying=false))





    /** Foreign key referencing Fcamt (database name FK_FCAMCT_FCAMT) */
    lazy val fcamtFk = foreignKey("FK_FCAMCT_FCAMT", amctamtrfnum, Fcamt)(r => Rep.Some(r.id), onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table Fcamct */
  lazy val Fcamct = new TableQuery(tag => new Fcamct(tag))

  /** Entity class storing rows of table Fcamt
   *  @param amtrfnum Database column AMTRFNUM SqlType(BIGINT), AutoInc, PrimaryKey
   *  @param amtaddtype Database column AMTADDTYPE SqlType(CHAR), Length(2,false)
   *  @param amtaddline1 Database column AMTADDLINE1 SqlType(VARCHAR), Length(256,true)
   *  @param amtaddline2 Database column AMTADDLINE2 SqlType(VARCHAR), Length(256,true), Default(None)
   *  @param amtaddline3 Database column AMTADDLINE3 SqlType(VARCHAR), Length(256,true), Default(None)
   *  @param amtaddlandmark Database column AMTADDLANDMARK SqlType(VARCHAR), Length(64,true), Default(None)
   *  @param amtmobileno Database column AMTMOBILENO SqlType(CHAR), Length(18,false), Default(None)
   *  @param amttelephoneno Database column AMTTELEPHONENO SqlType(VARCHAR), Length(32,true), Default(None)
   *  @param amtemail1 Database column AMTEMAIL1 SqlType(VARCHAR), Length(64,true), Default(None)
   *  @param amtemail2 Database column AMTEMAIL2 SqlType(VARCHAR), Length(64,true), Default(None)
   *  @param amtfax Database column AMTFAX SqlType(VARCHAR), Length(32,true), Default(None)
   *  @param amtcndcityrfnum Database column AMTCNDCITYRFNUM SqlType(BIGINT), Default(None)
   *  @param amtcndstaterfnum Database column AMTCNDSTATERFNUM SqlType(BIGINT), Default(None)
   *  @param amtcndcountryrfnum Database column AMTCNDCOUNTRYRFNUM SqlType(BIGINT), Default(None)
   *  @param amtcndpinrfnum Database column AMTCNDPINRFNUM SqlType(BIGINT), Default(None)
   *  @param amtcnddistrictrfnum Database column AMTCNDDISTRICTRFNUM SqlType(BIGINT), Default(None)
   *  @param amtcntctperson Database column AMTCNTCTPERSON SqlType(VARCHAR), Length(64,true), Default(None)
   *  @param createdate 
   *  @param modifydate 
   *  @param createdby 
   *  @param lastmodifiedby  */
  case class FcamtRow(id: Long, amtaddtype: String, amtaddline1: String, amtaddline2: Option[String] = None, amtaddline3: Option[String] = None, amtaddlandmark: Option[String] = None, amtmobileno: Option[String] = None, amttelephoneno: Option[String] = None, amtemail1: Option[String] = None, amtemail2: Option[String] = None, amtfax: Option[String] = None, amtcndcityrfnum: Option[Long] = None, amtcndstaterfnum: Option[Long] = None, amtcndcountryrfnum: Option[Long] = None, amtcndpinrfnum: Option[Long] = None, amtcnddistrictrfnum: Option[Long] = None, amtcntctperson: Option[String] = None, createdate: Option[java.sql.Timestamp] = None, modifydate: java.sql.Timestamp, createdby: String, lastmodifiedby: String) extends BaseEntity 
  class FcamtRowWrapper(id: Option[Long], amtaddtype: String, amtaddline1: String, amtaddline2: Option[String] = None, amtaddline3: Option[String] = None, amtaddlandmark: Option[String] = None, amtmobileno: Option[String] = None, amttelephoneno: Option[String] = None, amtemail1: Option[String] = None, amtemail2: Option[String] = None, amtfax: Option[String] = None, amtcndcityrfnum: Option[Long] = None, amtcndstaterfnum: Option[Long] = None, amtcndcountryrfnum: Option[Long] = None, amtcndpinrfnum: Option[Long] = None, amtcnddistrictrfnum: Option[Long] = None, amtcntctperson: Option[String] = None) {
    def get(userName: String): FcamtRow = {
      FcamtRow(this.id.getOrElse(0), this.amtaddtype, this.amtaddline1, this.amtaddline2, this.amtaddline3, this.amtaddlandmark, this.amtmobileno, this.amttelephoneno, this.amtemail1, this.amtemail2, this.amtfax, this.amtcndcityrfnum, this.amtcndstaterfnum, this.amtcndcountryrfnum, this.amtcndpinrfnum, this.amtcnddistrictrfnum, this.amtcntctperson, Some(DateTimeUtils.getCurrentTimeStamp), DateTimeUtils.getCurrentTimeStamp, userName, userName)
  	}
  }
  /** GetResult implicit for fetching FcamtRow objects using plain SQL queries */
  implicit def GetResultFcamtRow(implicit e0: GR[Long], e1: GR[String], e2: GR[Option[String]], e3: GR[Option[Long]], e4: GR[Option[java.sql.Timestamp]], e5: GR[java.sql.Timestamp]): GR[FcamtRow] = GR{
    prs => import prs._
    FcamtRow.tupled((<<[Long], <<[String], <<[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[Long], <<?[Long], <<?[Long], <<?[Long], <<?[Long], <<?[String], <<?[java.sql.Timestamp], <<[java.sql.Timestamp], <<[String], <<[String]))
  }
  /** Table description of table FCAMT. Objects of this class serve as prototypes for rows in queries. */
  class Fcamt(_tableTag: Tag) extends BaseTable[FcamtRow](_tableTag, "FCAMT") {
    def * = (id, amtaddtype, amtaddline1, amtaddline2, amtaddline3, amtaddlandmark, amtmobileno, amttelephoneno, amtemail1, amtemail2, amtfax, amtcndcityrfnum, amtcndstaterfnum, amtcndcountryrfnum, amtcndpinrfnum, amtcnddistrictrfnum, amtcntctperson, createdate, modifydate, createdby, lastmodifiedby) <> (FcamtRow.tupled, FcamtRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(amtaddtype), Rep.Some(amtaddline1), amtaddline2, amtaddline3, amtaddlandmark, amtmobileno, amttelephoneno, amtemail1, amtemail2, amtfax, amtcndcityrfnum, amtcndstaterfnum, amtcndcountryrfnum, amtcndpinrfnum, amtcnddistrictrfnum, amtcntctperson, createdate, Rep.Some(modifydate), Rep.Some(createdby), Rep.Some(lastmodifiedby)).shaped.<>({r=>import r._; _1.map(_=> FcamtRow.tupled((_1.get, _2.get, _3.get, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13, _14, _15, _16, _17, _18, _19.get, _20.get, _21.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column AMTRFNUM SqlType(BIGINT), AutoInc, PrimaryKey */
    override val id: Rep[Long] = column[Long]("AMTRFNUM", O.AutoInc, O.PrimaryKey)
    /** Database column AMTADDTYPE SqlType(CHAR), Length(2,false) */
    val amtaddtype: Rep[String] = column[String]("AMTADDTYPE", O.Length(2,varying=false))
    /** Database column AMTADDLINE1 SqlType(VARCHAR), Length(256,true) */
    val amtaddline1: Rep[String] = column[String]("AMTADDLINE1", O.Length(256,varying=true))
    /** Database column AMTADDLINE2 SqlType(VARCHAR), Length(256,true), Default(None) */
    val amtaddline2: Rep[Option[String]] = column[Option[String]]("AMTADDLINE2", O.Length(256,varying=true), O.Default(None))
    /** Database column AMTADDLINE3 SqlType(VARCHAR), Length(256,true), Default(None) */
    val amtaddline3: Rep[Option[String]] = column[Option[String]]("AMTADDLINE3", O.Length(256,varying=true), O.Default(None))
    /** Database column AMTADDLANDMARK SqlType(VARCHAR), Length(64,true), Default(None) */
    val amtaddlandmark: Rep[Option[String]] = column[Option[String]]("AMTADDLANDMARK", O.Length(64,varying=true), O.Default(None))
    /** Database column AMTMOBILENO SqlType(CHAR), Length(18,false), Default(None) */
    val amtmobileno: Rep[Option[String]] = column[Option[String]]("AMTMOBILENO", O.Length(18,varying=false), O.Default(None))
    /** Database column AMTTELEPHONENO SqlType(VARCHAR), Length(32,true), Default(None) */
    val amttelephoneno: Rep[Option[String]] = column[Option[String]]("AMTTELEPHONENO", O.Length(32,varying=true), O.Default(None))
    /** Database column AMTEMAIL1 SqlType(VARCHAR), Length(64,true), Default(None) */
    val amtemail1: Rep[Option[String]] = column[Option[String]]("AMTEMAIL1", O.Length(64,varying=true), O.Default(None))
    /** Database column AMTEMAIL2 SqlType(VARCHAR), Length(64,true), Default(None) */
    val amtemail2: Rep[Option[String]] = column[Option[String]]("AMTEMAIL2", O.Length(64,varying=true), O.Default(None))
    /** Database column AMTFAX SqlType(VARCHAR), Length(32,true), Default(None) */
    val amtfax: Rep[Option[String]] = column[Option[String]]("AMTFAX", O.Length(32,varying=true), O.Default(None))
    /** Database column AMTCNDCITYRFNUM SqlType(BIGINT), Default(None) */
    val amtcndcityrfnum: Rep[Option[Long]] = column[Option[Long]]("AMTCNDCITYRFNUM", O.Default(None))
    /** Database column AMTCNDSTATERFNUM SqlType(BIGINT), Default(None) */
    val amtcndstaterfnum: Rep[Option[Long]] = column[Option[Long]]("AMTCNDSTATERFNUM", O.Default(None))
    /** Database column AMTCNDCOUNTRYRFNUM SqlType(BIGINT), Default(None) */
    val amtcndcountryrfnum: Rep[Option[Long]] = column[Option[Long]]("AMTCNDCOUNTRYRFNUM", O.Default(None))
    /** Database column AMTCNDPINRFNUM SqlType(BIGINT), Default(None) */
    val amtcndpinrfnum: Rep[Option[Long]] = column[Option[Long]]("AMTCNDPINRFNUM", O.Default(None))
    /** Database column AMTCNDDISTRICTRFNUM SqlType(BIGINT), Default(None) */
    val amtcnddistrictrfnum: Rep[Option[Long]] = column[Option[Long]]("AMTCNDDISTRICTRFNUM", O.Default(None))
    /** Database column AMTCNTCTPERSON SqlType(VARCHAR), Length(64,true), Default(None) */
    val amtcntctperson: Rep[Option[String]] = column[Option[String]]("AMTCNTCTPERSON", O.Length(64,varying=true), O.Default(None))





    /** Foreign key referencing Fccnd (database name FK_FCAMT_FCCND) */
    lazy val fccndFk1 = foreignKey("FK_FCAMT_FCCND", amtcndcountryrfnum, Fccnd)(r => Rep.Some(r.id), onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Fccnd (database name FK_FCAMT_FCCND_CITY) */
    lazy val fccndFk2 = foreignKey("FK_FCAMT_FCCND_CITY", amtcndcityrfnum, Fccnd)(r => Rep.Some(r.id), onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Fccnd (database name FK_FCAMT_FCCND_DIS) */
    lazy val fccndFk3 = foreignKey("FK_FCAMT_FCCND_DIS", amtcnddistrictrfnum, Fccnd)(r => Rep.Some(r.id), onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Fccnd (database name FK_FCAMT_FCCND_PIN) */
    lazy val fccndFk4 = foreignKey("FK_FCAMT_FCCND_PIN", amtcndpinrfnum, Fccnd)(r => Rep.Some(r.id), onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Fccnd (database name FK_FCAMT_FCCND_STATE) */
    lazy val fccndFk5 = foreignKey("FK_FCAMT_FCCND_STATE", amtcndstaterfnum, Fccnd)(r => Rep.Some(r.id), onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table Fcamt */
  lazy val Fcamt = new TableQuery(tag => new Fcamt(tag))

  /** Entity class storing rows of table Fcanst
   *  @param anstrfnum Database column ANSTRFNUM SqlType(BIGINT), AutoInc, PrimaryKey
   *  @param anstqmtrfnum Database column ANSTQMTRFNUM SqlType(BIGINT)
   *  @param anstansvalue Database column ANSTANSVALUE SqlType(DOUBLE), Default(None)
   *  @param anstanslabel Database column ANSTANSLABEL SqlType(CHAR), Length(32,false)
   *  @param anstmarks Database column ANSTMARKS SqlType(DOUBLE)
   *  @param createdate 
   *  @param modifydate 
   *  @param createdby 
   *  @param lastmodifiedby  */
  case class FcanstRow(id: Long, anstqmtrfnum: Long, anstansvalue: Option[Double] = None, anstanslabel: String, anstmarks: Double, createdate: Option[java.sql.Timestamp] = None, modifydate: java.sql.Timestamp, createdby: String, lastmodifiedby: String) extends BaseEntity 
  class FcanstRowWrapper(id: Option[Long], anstqmtrfnum: Long, anstansvalue: Option[Double] = None, anstanslabel: String, anstmarks: Double) {
    def get(userName: String): FcanstRow = {
      FcanstRow(this.id.getOrElse(0), this.anstqmtrfnum, this.anstansvalue, this.anstanslabel, this.anstmarks, Some(DateTimeUtils.getCurrentTimeStamp), DateTimeUtils.getCurrentTimeStamp, userName, userName)
  	}
  }
  /** GetResult implicit for fetching FcanstRow objects using plain SQL queries */
  implicit def GetResultFcanstRow(implicit e0: GR[Long], e1: GR[Option[Double]], e2: GR[String], e3: GR[Double], e4: GR[Option[java.sql.Timestamp]], e5: GR[java.sql.Timestamp]): GR[FcanstRow] = GR{
    prs => import prs._
    FcanstRow.tupled((<<[Long], <<[Long], <<?[Double], <<[String], <<[Double], <<?[java.sql.Timestamp], <<[java.sql.Timestamp], <<[String], <<[String]))
  }
  /** Table description of table FCANST. Objects of this class serve as prototypes for rows in queries. */
  class Fcanst(_tableTag: Tag) extends BaseTable[FcanstRow](_tableTag, "FCANST") {
    def * = (id, anstqmtrfnum, anstansvalue, anstanslabel, anstmarks, createdate, modifydate, createdby, lastmodifiedby) <> (FcanstRow.tupled, FcanstRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(anstqmtrfnum), anstansvalue, Rep.Some(anstanslabel), Rep.Some(anstmarks), createdate, Rep.Some(modifydate), Rep.Some(createdby), Rep.Some(lastmodifiedby)).shaped.<>({r=>import r._; _1.map(_=> FcanstRow.tupled((_1.get, _2.get, _3, _4.get, _5.get, _6, _7.get, _8.get, _9.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column ANSTRFNUM SqlType(BIGINT), AutoInc, PrimaryKey */
    override val id: Rep[Long] = column[Long]("ANSTRFNUM", O.AutoInc, O.PrimaryKey)
    /** Database column ANSTQMTRFNUM SqlType(BIGINT) */
    val anstqmtrfnum: Rep[Long] = column[Long]("ANSTQMTRFNUM")
    /** Database column ANSTANSVALUE SqlType(DOUBLE), Default(None) */
    val anstansvalue: Rep[Option[Double]] = column[Option[Double]]("ANSTANSVALUE", O.Default(None))
    /** Database column ANSTANSLABEL SqlType(CHAR), Length(32,false) */
    val anstanslabel: Rep[String] = column[String]("ANSTANSLABEL", O.Length(32,varying=false))
    /** Database column ANSTMARKS SqlType(DOUBLE) */
    val anstmarks: Rep[Double] = column[Double]("ANSTMARKS")





    /** Foreign key referencing Fcqmt (database name FK_FCANST_FCQMT) */
    lazy val fcqmtFk = foreignKey("FK_FCANST_FCQMT", anstqmtrfnum, Fcqmt)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table Fcanst */
  lazy val Fcanst = new TableQuery(tag => new Fcanst(tag))

  /** Entity class storing rows of table Fcara
   *  @param ararfnum Database column ARARFNUM SqlType(BIGINT), AutoInc, PrimaryKey
   *  @param ararmtrfnum Database column ARARMTRFNUM SqlType(BIGINT)
   *  @param araaltrfnum Database column ARAALTRFNUM SqlType(BIGINT)
   *  @param araactive Database column ARAACTIVE SqlType(CHAR), Length(2,false) */
  case class FcaraRow(id: Long, ararmtrfnum: Long, araaltrfnum: Long, araactive: String) extends BaseEntity 
  class FcaraRowWrapper(id: Option[Long], ararmtrfnum: Long, araaltrfnum: Long, araactive: String) {
    def get(userName: String): FcaraRow = {
      FcaraRow(this.id.getOrElse(0), this.ararmtrfnum, this.araaltrfnum, this.araactive)
  	}
  }
  /** GetResult implicit for fetching FcaraRow objects using plain SQL queries */
  implicit def GetResultFcaraRow(implicit e0: GR[Long], e1: GR[String]): GR[FcaraRow] = GR{
    prs => import prs._
    FcaraRow.tupled((<<[Long], <<[Long], <<[Long], <<[String]))
  }
  /** Table description of table FCARA. Objects of this class serve as prototypes for rows in queries. */
  class Fcara(_tableTag: Tag) extends BaseTable[FcaraRow](_tableTag, "FCARA") {
    def * = (id, ararmtrfnum, araaltrfnum, araactive) <> (FcaraRow.tupled, FcaraRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(ararmtrfnum), Rep.Some(araaltrfnum), Rep.Some(araactive)).shaped.<>({r=>import r._; _1.map(_=> FcaraRow.tupled((_1.get, _2.get, _3.get, _4.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column ARARFNUM SqlType(BIGINT), AutoInc, PrimaryKey */
    override val id: Rep[Long] = column[Long]("ARARFNUM", O.AutoInc, O.PrimaryKey)
    /** Database column ARARMTRFNUM SqlType(BIGINT) */
    val ararmtrfnum: Rep[Long] = column[Long]("ARARMTRFNUM")
    /** Database column ARAALTRFNUM SqlType(BIGINT) */
    val araaltrfnum: Rep[Long] = column[Long]("ARAALTRFNUM")
    /** Database column ARAACTIVE SqlType(CHAR), Length(2,false) */
    val araactive: Rep[String] = column[String]("ARAACTIVE", O.Length(2,varying=false))

    /** Foreign key referencing Fcalt (database name FK_FCARA_FCALT) */
    lazy val fcaltFk = foreignKey("FK_FCARA_FCALT", araaltrfnum, Fcalt)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Fcrmt (database name FK_FCARA_FCRMT) */
    lazy val fcrmtFk = foreignKey("FK_FCARA_FCRMT", ararmtrfnum, Fcrmt)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table Fcara */
  lazy val Fcara = new TableQuery(tag => new Fcara(tag))

  /** Entity class storing rows of table Fcasbt
   *  @param asbtrfnum Database column ASBTRFNUM SqlType(BIGINT), AutoInc, PrimaryKey
   *  @param asbtacctno Database column ASBTACCTNO SqlType(VARCHAR), Length(16,true), Default(None)
   *  @param asbtbalancetobepaid Database column ASBTBALANCETOBEPAID SqlType(DOUBLE), Default(None)
   *  @param asbtamctrfnum Database column ASBTAMCTRFNUM SqlType(BIGINT), Default(None)
   *  @param createdate 
   *  @param modifydate 
   *  @param createdby 
   *  @param lastmodifiedby  */
  case class FcasbtRow(id: Long, asbtacctno: Option[String] = None, asbtbalancetobepaid: Option[Double] = None, asbtamctrfnum: Option[Long] = None, createdate: Option[java.sql.Timestamp] = None, modifydate: java.sql.Timestamp, createdby: String, lastmodifiedby: String) extends BaseEntity 
  class FcasbtRowWrapper(id: Option[Long], asbtacctno: Option[String] = None, asbtbalancetobepaid: Option[Double] = None, asbtamctrfnum: Option[Long] = None) {
    def get(userName: String): FcasbtRow = {
      FcasbtRow(this.id.getOrElse(0), this.asbtacctno, this.asbtbalancetobepaid, this.asbtamctrfnum, Some(DateTimeUtils.getCurrentTimeStamp), DateTimeUtils.getCurrentTimeStamp, userName, userName)
  	}
  }
  /** GetResult implicit for fetching FcasbtRow objects using plain SQL queries */
  implicit def GetResultFcasbtRow(implicit e0: GR[Long], e1: GR[Option[String]], e2: GR[Option[Double]], e3: GR[Option[Long]], e4: GR[Option[java.sql.Timestamp]], e5: GR[java.sql.Timestamp], e6: GR[String]): GR[FcasbtRow] = GR{
    prs => import prs._
    FcasbtRow.tupled((<<[Long], <<?[String], <<?[Double], <<?[Long], <<?[java.sql.Timestamp], <<[java.sql.Timestamp], <<[String], <<[String]))
  }
  /** Table description of table FCASBT. Objects of this class serve as prototypes for rows in queries. */
  class Fcasbt(_tableTag: Tag) extends BaseTable[FcasbtRow](_tableTag, "FCASBT") {
    def * = (id, asbtacctno, asbtbalancetobepaid, asbtamctrfnum, createdate, modifydate, createdby, lastmodifiedby) <> (FcasbtRow.tupled, FcasbtRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), asbtacctno, asbtbalancetobepaid, asbtamctrfnum, createdate, Rep.Some(modifydate), Rep.Some(createdby), Rep.Some(lastmodifiedby)).shaped.<>({r=>import r._; _1.map(_=> FcasbtRow.tupled((_1.get, _2, _3, _4, _5, _6.get, _7.get, _8.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column ASBTRFNUM SqlType(BIGINT), AutoInc, PrimaryKey */
    override val id: Rep[Long] = column[Long]("ASBTRFNUM", O.AutoInc, O.PrimaryKey)
    /** Database column ASBTACCTNO SqlType(VARCHAR), Length(16,true), Default(None) */
    val asbtacctno: Rep[Option[String]] = column[Option[String]]("ASBTACCTNO", O.Length(16,varying=true), O.Default(None))
    /** Database column ASBTBALANCETOBEPAID SqlType(DOUBLE), Default(None) */
    val asbtbalancetobepaid: Rep[Option[Double]] = column[Option[Double]]("ASBTBALANCETOBEPAID", O.Default(None))
    /** Database column ASBTAMCTRFNUM SqlType(BIGINT), Default(None) */
    val asbtamctrfnum: Rep[Option[Long]] = column[Option[Long]]("ASBTAMCTRFNUM", O.Default(None))





    /** Foreign key referencing Fcamct (database name FK_FCASBT_FCAMCT) */
    lazy val fcamctFk = foreignKey("FK_FCASBT_FCAMCT", asbtamctrfnum, Fcamct)(r => Rep.Some(r.id), onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table Fcasbt */
  lazy val Fcasbt = new TableQuery(tag => new Fcasbt(tag))

  /** Entity class storing rows of table Fcasst
   *  @param asstrfnum Database column ASSTRFNUM SqlType(BIGINT), AutoInc, PrimaryKey
   *  @param asstamctrfnum Database column ASSTAMCTRFNUM SqlType(BIGINT), Default(None)
   *  @param asstsmtrfnum Database column ASSTSMTRFNUM SqlType(BIGINT), Default(None)
   *  @param asstasbtrfnum Database column ASSTASBTRFNUM SqlType(BIGINT)
   *  @param asstamount Database column ASSTAMOUNT SqlType(DOUBLE)
   *  @param asstiscredit Database column ASSTISCREDIT SqlType(CHAR), Length(2,false)
   *  @param asstcostrfnum Database column ASSTCOSTRFNUM SqlType(BIGINT), Default(None)
   *  @param createdate 
   *  @param modifydate 
   *  @param createdby 
   *  @param lastmodifiedby  */
  case class FcasstRow(id: Long, asstamctrfnum: Option[Long] = None, asstsmtrfnum: Option[Long] = None, asstasbtrfnum: Long, asstamount: Double, asstiscredit: String, asstcostrfnum: Option[Long] = None, createdate: Option[java.sql.Timestamp] = None, modifydate: java.sql.Timestamp, createdby: String, lastmodifiedby: String) extends BaseEntity 
  class FcasstRowWrapper(id: Option[Long], asstamctrfnum: Option[Long] = None, asstsmtrfnum: Option[Long] = None, asstasbtrfnum: Long, asstamount: Double, asstiscredit: String, asstcostrfnum: Option[Long] = None) {
    def get(userName: String): FcasstRow = {
      FcasstRow(this.id.getOrElse(0), this.asstamctrfnum, this.asstsmtrfnum, this.asstasbtrfnum, this.asstamount, this.asstiscredit, this.asstcostrfnum, Some(DateTimeUtils.getCurrentTimeStamp), DateTimeUtils.getCurrentTimeStamp, userName, userName)
  	}
  }
  /** GetResult implicit for fetching FcasstRow objects using plain SQL queries */
  implicit def GetResultFcasstRow(implicit e0: GR[Long], e1: GR[Option[Long]], e2: GR[Double], e3: GR[String], e4: GR[Option[java.sql.Timestamp]], e5: GR[java.sql.Timestamp]): GR[FcasstRow] = GR{
    prs => import prs._
    FcasstRow.tupled((<<[Long], <<?[Long], <<?[Long], <<[Long], <<[Double], <<[String], <<?[Long], <<?[java.sql.Timestamp], <<[java.sql.Timestamp], <<[String], <<[String]))
  }
  /** Table description of table FCASST. Objects of this class serve as prototypes for rows in queries. */
  class Fcasst(_tableTag: Tag) extends BaseTable[FcasstRow](_tableTag, "FCASST") {
    def * = (id, asstamctrfnum, asstsmtrfnum, asstasbtrfnum, asstamount, asstiscredit, asstcostrfnum, createdate, modifydate, createdby, lastmodifiedby) <> (FcasstRow.tupled, FcasstRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), asstamctrfnum, asstsmtrfnum, Rep.Some(asstasbtrfnum), Rep.Some(asstamount), Rep.Some(asstiscredit), asstcostrfnum, createdate, Rep.Some(modifydate), Rep.Some(createdby), Rep.Some(lastmodifiedby)).shaped.<>({r=>import r._; _1.map(_=> FcasstRow.tupled((_1.get, _2, _3, _4.get, _5.get, _6.get, _7, _8, _9.get, _10.get, _11.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column ASSTRFNUM SqlType(BIGINT), AutoInc, PrimaryKey */
    override val id: Rep[Long] = column[Long]("ASSTRFNUM", O.AutoInc, O.PrimaryKey)
    /** Database column ASSTAMCTRFNUM SqlType(BIGINT), Default(None) */
    val asstamctrfnum: Rep[Option[Long]] = column[Option[Long]]("ASSTAMCTRFNUM", O.Default(None))
    /** Database column ASSTSMTRFNUM SqlType(BIGINT), Default(None) */
    val asstsmtrfnum: Rep[Option[Long]] = column[Option[Long]]("ASSTSMTRFNUM", O.Default(None))
    /** Database column ASSTASBTRFNUM SqlType(BIGINT) */
    val asstasbtrfnum: Rep[Long] = column[Long]("ASSTASBTRFNUM")
    /** Database column ASSTAMOUNT SqlType(DOUBLE) */
    val asstamount: Rep[Double] = column[Double]("ASSTAMOUNT")
    /** Database column ASSTISCREDIT SqlType(CHAR), Length(2,false) */
    val asstiscredit: Rep[String] = column[String]("ASSTISCREDIT", O.Length(2,varying=false))
    /** Database column ASSTCOSTRFNUM SqlType(BIGINT), Default(None) */
    val asstcostrfnum: Rep[Option[Long]] = column[Option[Long]]("ASSTCOSTRFNUM", O.Default(None))





    /** Foreign key referencing Fcamct (database name FK_FCASST_FCAMCT) */
    lazy val fcamctFk = foreignKey("FK_FCASST_FCAMCT", asstamctrfnum, Fcamct)(r => Rep.Some(r.id), onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Fcasbt (database name FK_FCASST_FCASBT) */
    lazy val fcasbtFk = foreignKey("FK_FCASST_FCASBT", asstasbtrfnum, Fcasbt)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Fccost (database name FK_FCASST_FCCOST) */
    lazy val fccostFk = foreignKey("FK_FCASST_FCCOST", asstcostrfnum, Fccost)(r => Rep.Some(r.id), onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Fcsmt (database name FK_FCASST_FCSMT) */
    lazy val fcsmtFk = foreignKey("FK_FCASST_FCSMT", asstsmtrfnum, Fcsmt)(r => Rep.Some(r.id), onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table Fcasst */
  lazy val Fcasst = new TableQuery(tag => new Fcasst(tag))

  /** Entity class storing rows of table Fcbbt
   *  @param bbtrfnum Database column BBTRFNUM SqlType(BIGINT), AutoInc, PrimaryKey
   *  @param bbtbmtrfnum Database column BBTBMTRFNUM SqlType(BIGINT)
   *  @param bbtbranchname Database column BBTBRANCHNAME SqlType(VARCHAR), Length(256,true), Default(None)
   *  @param bbtactive Database column BBTACTIVE SqlType(CHAR), Length(2,false)
   *  @param bbtmicr Database column BBTMICR SqlType(VARCHAR), Length(32,true), Default(None)
   *  @param bbtifsccode Database column BBTIFSCCODE SqlType(VARCHAR), Length(32,true)
   *  @param bbtcity Database column BBTCITY SqlType(CHAR), Length(10,false), Default(None)
   *  @param bbtdistrict Database column BBTDISTRICT SqlType(CHAR), Length(32,false), Default(None)
   *  @param bbtstate Database column BBTSTATE SqlType(CHAR), Length(32,false), Default(None)
   *  @param bbtaddress Database column BBTADDRESS SqlType(VARCHAR), Length(2048,true), Default(None)
   *  @param createdate 
   *  @param modifydate 
   *  @param createdby 
   *  @param lastmodifiedby  */
  case class FcbbtRow(id: Long, bbtbmtrfnum: Long, bbtbranchname: Option[String] = None, bbtactive: String, bbtmicr: Option[String] = None, bbtifsccode: String, bbtcity: Option[String] = None, bbtdistrict: Option[String] = None, bbtstate: Option[String] = None, bbtaddress: Option[String] = None, createdate: Option[java.sql.Timestamp] = None, modifydate: java.sql.Timestamp, createdby: String, lastmodifiedby: String) extends BaseEntity 
  class FcbbtRowWrapper(id: Option[Long], bbtbmtrfnum: Long, bbtbranchname: Option[String] = None, bbtactive: String, bbtmicr: Option[String] = None, bbtifsccode: String, bbtcity: Option[String] = None, bbtdistrict: Option[String] = None, bbtstate: Option[String] = None, bbtaddress: Option[String] = None) {
    def get(userName: String): FcbbtRow = {
      FcbbtRow(this.id.getOrElse(0), this.bbtbmtrfnum, this.bbtbranchname, this.bbtactive, this.bbtmicr, this.bbtifsccode, this.bbtcity, this.bbtdistrict, this.bbtstate, this.bbtaddress, Some(DateTimeUtils.getCurrentTimeStamp), DateTimeUtils.getCurrentTimeStamp, userName, userName)
  	}
  }
  /** GetResult implicit for fetching FcbbtRow objects using plain SQL queries */
  implicit def GetResultFcbbtRow(implicit e0: GR[Long], e1: GR[Option[String]], e2: GR[String], e3: GR[Option[java.sql.Timestamp]], e4: GR[java.sql.Timestamp]): GR[FcbbtRow] = GR{
    prs => import prs._
    FcbbtRow.tupled((<<[Long], <<[Long], <<?[String], <<[String], <<?[String], <<[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[java.sql.Timestamp], <<[java.sql.Timestamp], <<[String], <<[String]))
  }
  /** Table description of table FCBBT. Objects of this class serve as prototypes for rows in queries. */
  class Fcbbt(_tableTag: Tag) extends BaseTable[FcbbtRow](_tableTag, "FCBBT") {
    def * = (id, bbtbmtrfnum, bbtbranchname, bbtactive, bbtmicr, bbtifsccode, bbtcity, bbtdistrict, bbtstate, bbtaddress, createdate, modifydate, createdby, lastmodifiedby) <> (FcbbtRow.tupled, FcbbtRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(bbtbmtrfnum), bbtbranchname, Rep.Some(bbtactive), bbtmicr, Rep.Some(bbtifsccode), bbtcity, bbtdistrict, bbtstate, bbtaddress, createdate, Rep.Some(modifydate), Rep.Some(createdby), Rep.Some(lastmodifiedby)).shaped.<>({r=>import r._; _1.map(_=> FcbbtRow.tupled((_1.get, _2.get, _3, _4.get, _5, _6.get, _7, _8, _9, _10, _11, _12.get, _13.get, _14.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column BBTRFNUM SqlType(BIGINT), AutoInc, PrimaryKey */
    override val id: Rep[Long] = column[Long]("BBTRFNUM", O.AutoInc, O.PrimaryKey)
    /** Database column BBTBMTRFNUM SqlType(BIGINT) */
    val bbtbmtrfnum: Rep[Long] = column[Long]("BBTBMTRFNUM")
    /** Database column BBTBRANCHNAME SqlType(VARCHAR), Length(256,true), Default(None) */
    val bbtbranchname: Rep[Option[String]] = column[Option[String]]("BBTBRANCHNAME", O.Length(256,varying=true), O.Default(None))
    /** Database column BBTACTIVE SqlType(CHAR), Length(2,false) */
    val bbtactive: Rep[String] = column[String]("BBTACTIVE", O.Length(2,varying=false))
    /** Database column BBTMICR SqlType(VARCHAR), Length(32,true), Default(None) */
    val bbtmicr: Rep[Option[String]] = column[Option[String]]("BBTMICR", O.Length(32,varying=true), O.Default(None))
    /** Database column BBTIFSCCODE SqlType(VARCHAR), Length(32,true) */
    val bbtifsccode: Rep[String] = column[String]("BBTIFSCCODE", O.Length(32,varying=true))
    /** Database column BBTCITY SqlType(CHAR), Length(10,false), Default(None) */
    val bbtcity: Rep[Option[String]] = column[Option[String]]("BBTCITY", O.Length(10,varying=false), O.Default(None))
    /** Database column BBTDISTRICT SqlType(CHAR), Length(32,false), Default(None) */
    val bbtdistrict: Rep[Option[String]] = column[Option[String]]("BBTDISTRICT", O.Length(32,varying=false), O.Default(None))
    /** Database column BBTSTATE SqlType(CHAR), Length(32,false), Default(None) */
    val bbtstate: Rep[Option[String]] = column[Option[String]]("BBTSTATE", O.Length(32,varying=false), O.Default(None))
    /** Database column BBTADDRESS SqlType(VARCHAR), Length(2048,true), Default(None) */
    val bbtaddress: Rep[Option[String]] = column[Option[String]]("BBTADDRESS", O.Length(2048,varying=true), O.Default(None))





    /** Foreign key referencing Fcbmt (database name FK_FCBBT_FCBMT) */
    lazy val fcbmtFk = foreignKey("FK_FCBBT_FCBMT", bbtbmtrfnum, Fcbmt)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)

    /** Uniqueness Index over (bbtifsccode) (database name BBT_IFSC_UNQ) */
    val index1 = index("BBT_IFSC_UNQ", bbtifsccode, unique=true)
  }
  /** Collection-like TableQuery object for table Fcbbt */
  lazy val Fcbbt = new TableQuery(tag => new Fcbbt(tag))

  /** Entity class storing rows of table Fcbca
   *  @param bcarfnum Database column BCARFNUM SqlType(BIGINT), AutoInc, PrimaryKey
   *  @param bcadate Database column BCADATE SqlType(DATE)
   *  @param bcaenddate Database column BCAENDDATE SqlType(DATE), Default(None)
   *  @param bcaactive Database column BCAACTIVE SqlType(CHAR), Length(2,false)
   *  @param bcabenrfnum Database column BCABENRFNUM SqlType(BIGINT)
   *  @param bcactmtrfnum Database column BCACTMTRFNUM SqlType(BIGINT)
   *  @param bcasoptrfnum Database column BCASOPTRFNUM SqlType(BIGINT), Default(None)
   *  @param createdate 
   *  @param modifydate 
   *  @param createdby 
   *  @param lastmodifiedby  */
  case class FcbcaRow(id: Long, bcadate: java.sql.Date, bcaenddate: Option[java.sql.Date] = None, bcaactive: String, bcabenrfnum: Long, bcactmtrfnum: Long, bcasoptrfnum: Option[Long] = None, createdate: Option[java.sql.Timestamp] = None, modifydate: java.sql.Timestamp, createdby: String, lastmodifiedby: String) extends BaseEntity 
  class FcbcaRowWrapper(id: Option[Long], bcadate: java.sql.Date, bcaenddate: Option[java.sql.Date] = None, bcaactive: String, bcabenrfnum: Long, bcactmtrfnum: Long, bcasoptrfnum: Option[Long] = None) {
    def get(userName: String): FcbcaRow = {
      FcbcaRow(this.id.getOrElse(0), this.bcadate, this.bcaenddate, this.bcaactive, this.bcabenrfnum, this.bcactmtrfnum, this.bcasoptrfnum, Some(DateTimeUtils.getCurrentTimeStamp), DateTimeUtils.getCurrentTimeStamp, userName, userName)
  	}
  }
  /** GetResult implicit for fetching FcbcaRow objects using plain SQL queries */
  implicit def GetResultFcbcaRow(implicit e0: GR[Long], e1: GR[java.sql.Date], e2: GR[Option[java.sql.Date]], e3: GR[String], e4: GR[Option[Long]], e5: GR[Option[java.sql.Timestamp]], e6: GR[java.sql.Timestamp]): GR[FcbcaRow] = GR{
    prs => import prs._
    FcbcaRow.tupled((<<[Long], <<[java.sql.Date], <<?[java.sql.Date], <<[String], <<[Long], <<[Long], <<?[Long], <<?[java.sql.Timestamp], <<[java.sql.Timestamp], <<[String], <<[String]))
  }
  /** Table description of table FCBCA. Objects of this class serve as prototypes for rows in queries. */
  class Fcbca(_tableTag: Tag) extends BaseTable[FcbcaRow](_tableTag, "FCBCA") {
    def * = (id, bcadate, bcaenddate, bcaactive, bcabenrfnum, bcactmtrfnum, bcasoptrfnum, createdate, modifydate, createdby, lastmodifiedby) <> (FcbcaRow.tupled, FcbcaRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(bcadate), bcaenddate, Rep.Some(bcaactive), Rep.Some(bcabenrfnum), Rep.Some(bcactmtrfnum), bcasoptrfnum, createdate, Rep.Some(modifydate), Rep.Some(createdby), Rep.Some(lastmodifiedby)).shaped.<>({r=>import r._; _1.map(_=> FcbcaRow.tupled((_1.get, _2.get, _3, _4.get, _5.get, _6.get, _7, _8, _9.get, _10.get, _11.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column BCARFNUM SqlType(BIGINT), AutoInc, PrimaryKey */
    override val id: Rep[Long] = column[Long]("BCARFNUM", O.AutoInc, O.PrimaryKey)
    /** Database column BCADATE SqlType(DATE) */
    val bcadate: Rep[java.sql.Date] = column[java.sql.Date]("BCADATE")
    /** Database column BCAENDDATE SqlType(DATE), Default(None) */
    val bcaenddate: Rep[Option[java.sql.Date]] = column[Option[java.sql.Date]]("BCAENDDATE", O.Default(None))
    /** Database column BCAACTIVE SqlType(CHAR), Length(2,false) */
    val bcaactive: Rep[String] = column[String]("BCAACTIVE", O.Length(2,varying=false))
    /** Database column BCABENRFNUM SqlType(BIGINT) */
    val bcabenrfnum: Rep[Long] = column[Long]("BCABENRFNUM")
    /** Database column BCACTMTRFNUM SqlType(BIGINT) */
    val bcactmtrfnum: Rep[Long] = column[Long]("BCACTMTRFNUM")
    /** Database column BCASOPTRFNUM SqlType(BIGINT), Default(None) */
    val bcasoptrfnum: Rep[Option[Long]] = column[Option[Long]]("BCASOPTRFNUM", O.Default(None))





    /** Foreign key referencing Fcben (database name FK_FCBCA_FCBEN) */
    lazy val fcbenFk = foreignKey("FK_FCBCA_FCBEN", bcabenrfnum, Fcben)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Fcctmt (database name FK_FCBCA_FCCTMT) */
    lazy val fcctmtFk = foreignKey("FK_FCBCA_FCCTMT", bcactmtrfnum, Fcctmt)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Fcsopt (database name FK_FCBCA_FCSOPT) */
    lazy val fcsoptFk = foreignKey("FK_FCBCA_FCSOPT", bcasoptrfnum, Fcsopt)(r => Rep.Some(r.id), onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)

    /** Uniqueness Index over (bcactmtrfnum,bcasoptrfnum,bcabenrfnum) (database name UNQ_FCBEN_FCCTMT_FCSOPT) */
    val index1 = index("UNQ_FCBEN_FCCTMT_FCSOPT", (bcactmtrfnum, bcasoptrfnum, bcabenrfnum), unique=true)
  }
  /** Collection-like TableQuery object for table Fcbca */
  lazy val Fcbca = new TableQuery(tag => new Fcbca(tag))

  /** Entity class storing rows of table Fcbcra
   *  @param bcrarfnum Database column BCRARFNUM SqlType(BIGINT), AutoInc, PrimaryKey
   *  @param bcrabenrfnum Database column BCRABENRFNUM SqlType(BIGINT)
   *  @param bcracyrrfnum Database column BCRACYRRFNUM SqlType(BIGINT)
   *  @param createdate 
   *  @param modifydate 
   *  @param createdby 
   *  @param lastmodifiedby  */
  case class FcbcraRow(id: Long, bcrabenrfnum: Long, bcracyrrfnum: Long, createdate: Option[java.sql.Timestamp] = None, modifydate: java.sql.Timestamp, createdby: String, lastmodifiedby: String) extends BaseEntity 
  class FcbcraRowWrapper(id: Option[Long], bcrabenrfnum: Long, bcracyrrfnum: Long) {
    def get(userName: String): FcbcraRow = {
      FcbcraRow(this.id.getOrElse(0), this.bcrabenrfnum, this.bcracyrrfnum, Some(DateTimeUtils.getCurrentTimeStamp), DateTimeUtils.getCurrentTimeStamp, userName, userName)
  	}
  }
  /** GetResult implicit for fetching FcbcraRow objects using plain SQL queries */
  implicit def GetResultFcbcraRow(implicit e0: GR[Long], e1: GR[Option[java.sql.Timestamp]], e2: GR[java.sql.Timestamp], e3: GR[String]): GR[FcbcraRow] = GR{
    prs => import prs._
    FcbcraRow.tupled((<<[Long], <<[Long], <<[Long], <<?[java.sql.Timestamp], <<[java.sql.Timestamp], <<[String], <<[String]))
  }
  /** Table description of table FCBCRA. Objects of this class serve as prototypes for rows in queries. */
  class Fcbcra(_tableTag: Tag) extends BaseTable[FcbcraRow](_tableTag, "FCBCRA") {
    def * = (id, bcrabenrfnum, bcracyrrfnum, createdate, modifydate, createdby, lastmodifiedby) <> (FcbcraRow.tupled, FcbcraRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(bcrabenrfnum), Rep.Some(bcracyrrfnum), createdate, Rep.Some(modifydate), Rep.Some(createdby), Rep.Some(lastmodifiedby)).shaped.<>({r=>import r._; _1.map(_=> FcbcraRow.tupled((_1.get, _2.get, _3.get, _4, _5.get, _6.get, _7.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column BCRARFNUM SqlType(BIGINT), AutoInc, PrimaryKey */
    override val id: Rep[Long] = column[Long]("BCRARFNUM", O.AutoInc, O.PrimaryKey)
    /** Database column BCRABENRFNUM SqlType(BIGINT) */
    val bcrabenrfnum: Rep[Long] = column[Long]("BCRABENRFNUM")
    /** Database column BCRACYRRFNUM SqlType(BIGINT) */
    val bcracyrrfnum: Rep[Long] = column[Long]("BCRACYRRFNUM")





    /** Foreign key referencing Fcben (database name FK_FCBCRA_FCBEN) */
    lazy val fcbenFk = foreignKey("FK_FCBCRA_FCBEN", bcrabenrfnum, Fcben)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Fccyr (database name FK_FCBCRA_FCCYR) */
    lazy val fccyrFk = foreignKey("FK_FCBCRA_FCCYR", bcracyrrfnum, Fccyr)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table Fcbcra */
  lazy val Fcbcra = new TableQuery(tag => new Fcbcra(tag))

  /** Entity class storing rows of table Fcbda
   *  @param bdarfnum Database column BDARFNUM SqlType(BIGINT), AutoInc, PrimaryKey
   *  @param bdadamrfnum Database column BDADAMRFNUM SqlType(BIGINT)
   *  @param bdabenrfnum Database column BDABENRFNUM SqlType(BIGINT)
   *  @param bdaexternalid1 Database column BDAEXTERNALID1 SqlType(VARCHAR), Length(32,true), Default(None)
   *  @param bdaexternalid2 Database column BDAEXTERNALID2 SqlType(VARCHAR), Length(32,true), Default(None)
   *  @param bdaexternalid3 Database column BDAEXTERNALID3 SqlType(VARCHAR), Length(32,true), Default(None)
   *  @param bdaexternalid4 Database column BDAEXTERNALID4 SqlType(VARCHAR), Length(32,true), Default(None)
   *  @param bdaexternalid5 Database column BDAEXTERNALID5 SqlType(VARCHAR), Length(32,true), Default(None)
   *  @param bdaexternalid6 Database column BDAEXTERNALID6 SqlType(VARCHAR), Length(32,true), Default(None)
   *  @param bdaexternalid7 Database column BDAEXTERNALID7 SqlType(VARCHAR), Length(32,true), Default(None)
   *  @param bdaexternalid8 Database column BDAEXTERNALID8 SqlType(VARCHAR), Length(32,true), Default(None)
   *  @param createdate 
   *  @param modifydate 
   *  @param createdby 
   *  @param lastmodifiedby  */
  case class FcbdaRow(id: Long, bdadamrfnum: Long, bdabenrfnum: Long, bdaexternalid1: Option[String] = None, bdaexternalid2: Option[String] = None, bdaexternalid3: Option[String] = None, bdaexternalid4: Option[String] = None, bdaexternalid5: Option[String] = None, bdaexternalid6: Option[String] = None, bdaexternalid7: Option[String] = None, bdaexternalid8: Option[String] = None, createdate: Option[java.sql.Timestamp] = None, modifydate: java.sql.Timestamp, createdby: String, lastmodifiedby: String) extends BaseEntity 
  class FcbdaRowWrapper(id: Option[Long], bdadamrfnum: Long, bdabenrfnum: Long, bdaexternalid1: Option[String] = None, bdaexternalid2: Option[String] = None, bdaexternalid3: Option[String] = None, bdaexternalid4: Option[String] = None, bdaexternalid5: Option[String] = None, bdaexternalid6: Option[String] = None, bdaexternalid7: Option[String] = None, bdaexternalid8: Option[String] = None) {
    def get(userName: String): FcbdaRow = {
      FcbdaRow(this.id.getOrElse(0), this.bdadamrfnum, this.bdabenrfnum, this.bdaexternalid1, this.bdaexternalid2, this.bdaexternalid3, this.bdaexternalid4, this.bdaexternalid5, this.bdaexternalid6, this.bdaexternalid7, this.bdaexternalid8, Some(DateTimeUtils.getCurrentTimeStamp), DateTimeUtils.getCurrentTimeStamp, userName, userName)
  	}
  }
  /** GetResult implicit for fetching FcbdaRow objects using plain SQL queries */
  implicit def GetResultFcbdaRow(implicit e0: GR[Long], e1: GR[Option[String]], e2: GR[Option[java.sql.Timestamp]], e3: GR[java.sql.Timestamp], e4: GR[String]): GR[FcbdaRow] = GR{
    prs => import prs._
    FcbdaRow.tupled((<<[Long], <<[Long], <<[Long], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[java.sql.Timestamp], <<[java.sql.Timestamp], <<[String], <<[String]))
  }
  /** Table description of table FCBDA. Objects of this class serve as prototypes for rows in queries. */
  class Fcbda(_tableTag: Tag) extends BaseTable[FcbdaRow](_tableTag, "FCBDA") {
    def * = (id, bdadamrfnum, bdabenrfnum, bdaexternalid1, bdaexternalid2, bdaexternalid3, bdaexternalid4, bdaexternalid5, bdaexternalid6, bdaexternalid7, bdaexternalid8, createdate, modifydate, createdby, lastmodifiedby) <> (FcbdaRow.tupled, FcbdaRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(bdadamrfnum), Rep.Some(bdabenrfnum), bdaexternalid1, bdaexternalid2, bdaexternalid3, bdaexternalid4, bdaexternalid5, bdaexternalid6, bdaexternalid7, bdaexternalid8, createdate, Rep.Some(modifydate), Rep.Some(createdby), Rep.Some(lastmodifiedby)).shaped.<>({r=>import r._; _1.map(_=> FcbdaRow.tupled((_1.get, _2.get, _3.get, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13.get, _14.get, _15.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column BDARFNUM SqlType(BIGINT), AutoInc, PrimaryKey */
    override val id: Rep[Long] = column[Long]("BDARFNUM", O.AutoInc, O.PrimaryKey)
    /** Database column BDADAMRFNUM SqlType(BIGINT) */
    val bdadamrfnum: Rep[Long] = column[Long]("BDADAMRFNUM")
    /** Database column BDABENRFNUM SqlType(BIGINT) */
    val bdabenrfnum: Rep[Long] = column[Long]("BDABENRFNUM")
    /** Database column BDAEXTERNALID1 SqlType(VARCHAR), Length(32,true), Default(None) */
    val bdaexternalid1: Rep[Option[String]] = column[Option[String]]("BDAEXTERNALID1", O.Length(32,varying=true), O.Default(None))
    /** Database column BDAEXTERNALID2 SqlType(VARCHAR), Length(32,true), Default(None) */
    val bdaexternalid2: Rep[Option[String]] = column[Option[String]]("BDAEXTERNALID2", O.Length(32,varying=true), O.Default(None))
    /** Database column BDAEXTERNALID3 SqlType(VARCHAR), Length(32,true), Default(None) */
    val bdaexternalid3: Rep[Option[String]] = column[Option[String]]("BDAEXTERNALID3", O.Length(32,varying=true), O.Default(None))
    /** Database column BDAEXTERNALID4 SqlType(VARCHAR), Length(32,true), Default(None) */
    val bdaexternalid4: Rep[Option[String]] = column[Option[String]]("BDAEXTERNALID4", O.Length(32,varying=true), O.Default(None))
    /** Database column BDAEXTERNALID5 SqlType(VARCHAR), Length(32,true), Default(None) */
    val bdaexternalid5: Rep[Option[String]] = column[Option[String]]("BDAEXTERNALID5", O.Length(32,varying=true), O.Default(None))
    /** Database column BDAEXTERNALID6 SqlType(VARCHAR), Length(32,true), Default(None) */
    val bdaexternalid6: Rep[Option[String]] = column[Option[String]]("BDAEXTERNALID6", O.Length(32,varying=true), O.Default(None))
    /** Database column BDAEXTERNALID7 SqlType(VARCHAR), Length(32,true), Default(None) */
    val bdaexternalid7: Rep[Option[String]] = column[Option[String]]("BDAEXTERNALID7", O.Length(32,varying=true), O.Default(None))
    /** Database column BDAEXTERNALID8 SqlType(VARCHAR), Length(32,true), Default(None) */
    val bdaexternalid8: Rep[Option[String]] = column[Option[String]]("BDAEXTERNALID8", O.Length(32,varying=true), O.Default(None))





    /** Foreign key referencing Fcben (database name FK_FCBDA_FCBEN) */
    lazy val fcbenFk = foreignKey("FK_FCBDA_FCBEN", bdabenrfnum, Fcben)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Fcdam (database name FK_FCBDA_FCDAM) */
    lazy val fcdamFk = foreignKey("FK_FCBDA_FCDAM", bdadamrfnum, Fcdam)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table Fcbda */
  lazy val Fcbda = new TableQuery(tag => new Fcbda(tag))

  /** Entity class storing rows of table Fcben
   *  @param benrfnum Database column BENRFNUM SqlType(BIGINT), AutoInc, PrimaryKey
   *  @param benname Database column BENNAME SqlType(VARCHAR), Length(128,true)
   *  @param bendisplayname Database column BENDISPLAYNAME SqlType(VARCHAR), Length(128,true), Default(None)
   *  @param bencode Database column BENCODE SqlType(VARCHAR), Length(64,true), Default(None)
   *  @param bendecription Database column BENDECRIPTION SqlType(VARCHAR), Length(1024,true), Default(None)
   *  @param createdate 
   *  @param modifydate 
   *  @param createdby 
   *  @param lastmodifiedby  */
  case class FcbenRow(id: Long, benname: String, bendisplayname: Option[String] = None, bencode: Option[String] = None, bendecription: Option[String] = None, createdate: Option[java.sql.Timestamp] = None, modifydate: java.sql.Timestamp, createdby: String, lastmodifiedby: String) extends BaseEntity 
  class FcbenRowWrapper(id: Option[Long], benname: String, bendisplayname: Option[String] = None, bencode: Option[String] = None, bendecription: Option[String] = None) {
    def get(userName: String): FcbenRow = {
      FcbenRow(this.id.getOrElse(0), this.benname, this.bendisplayname, this.bencode, this.bendecription, Some(DateTimeUtils.getCurrentTimeStamp), DateTimeUtils.getCurrentTimeStamp, userName, userName)
  	}
  }
  /** GetResult implicit for fetching FcbenRow objects using plain SQL queries */
  implicit def GetResultFcbenRow(implicit e0: GR[Long], e1: GR[String], e2: GR[Option[String]], e3: GR[Option[java.sql.Timestamp]], e4: GR[java.sql.Timestamp]): GR[FcbenRow] = GR{
    prs => import prs._
    FcbenRow.tupled((<<[Long], <<[String], <<?[String], <<?[String], <<?[String], <<?[java.sql.Timestamp], <<[java.sql.Timestamp], <<[String], <<[String]))
  }
  /** Table description of table FCBEN. Objects of this class serve as prototypes for rows in queries. */
  class Fcben(_tableTag: Tag) extends BaseTable[FcbenRow](_tableTag, "FCBEN") {
    def * = (id, benname, bendisplayname, bencode, bendecription, createdate, modifydate, createdby, lastmodifiedby) <> (FcbenRow.tupled, FcbenRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(benname), bendisplayname, bencode, bendecription, createdate, Rep.Some(modifydate), Rep.Some(createdby), Rep.Some(lastmodifiedby)).shaped.<>({r=>import r._; _1.map(_=> FcbenRow.tupled((_1.get, _2.get, _3, _4, _5, _6, _7.get, _8.get, _9.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column BENRFNUM SqlType(BIGINT), AutoInc, PrimaryKey */
    override val id: Rep[Long] = column[Long]("BENRFNUM", O.AutoInc, O.PrimaryKey)
    /** Database column BENNAME SqlType(VARCHAR), Length(128,true) */
    val benname: Rep[String] = column[String]("BENNAME", O.Length(128,varying=true))
    /** Database column BENDISPLAYNAME SqlType(VARCHAR), Length(128,true), Default(None) */
    val bendisplayname: Rep[Option[String]] = column[Option[String]]("BENDISPLAYNAME", O.Length(128,varying=true), O.Default(None))
    /** Database column BENCODE SqlType(VARCHAR), Length(64,true), Default(None) */
    val bencode: Rep[Option[String]] = column[Option[String]]("BENCODE", O.Length(64,varying=true), O.Default(None))
    /** Database column BENDECRIPTION SqlType(VARCHAR), Length(1024,true), Default(None) */
    val bendecription: Rep[Option[String]] = column[Option[String]]("BENDECRIPTION", O.Length(1024,varying=true), O.Default(None))
  }
  /** Collection-like TableQuery object for table Fcben */
  lazy val Fcben = new TableQuery(tag => new Fcben(tag))

  /** Entity class storing rows of table Fcbmt
   *  @param bmtrfnum Database column BMTRFNUM SqlType(BIGINT), AutoInc, PrimaryKey
   *  @param bmtbankname Database column BMTBANKNAME SqlType(VARCHAR), Length(256,true)
   *  @param bmtbankcode Database column BMTBANKCODE SqlType(CHAR), Length(20,false), Default(None)
   *  @param bmtactive Database column BMTACTIVE SqlType(CHAR), Length(2,false)
   *  @param createdate 
   *  @param modifydate 
   *  @param createdby 
   *  @param lastmodifiedby 
   *  @param bmtisipallowed Database column BMTISIPALLOWED SqlType(CHAR), Length(2,false) */
  case class FcbmtRow(id: Long, bmtbankname: String, bmtbankcode: Option[String] = None, bmtactive: String, createdate: Option[java.sql.Timestamp] = None, modifydate: java.sql.Timestamp, createdby: String, lastmodifiedby: String, bmtisipallowed: String) extends BaseEntity 
  class FcbmtRowWrapper(id: Option[Long], bmtbankname: String, bmtbankcode: Option[String] = None, bmtactive: String, bmtisipallowed: String) {
    def get(userName: String): FcbmtRow = {
      FcbmtRow(this.id.getOrElse(0), this.bmtbankname, this.bmtbankcode, this.bmtactive, Some(DateTimeUtils.getCurrentTimeStamp), DateTimeUtils.getCurrentTimeStamp, userName, userName, this.bmtisipallowed)
  	}
  }
  /** GetResult implicit for fetching FcbmtRow objects using plain SQL queries */
  implicit def GetResultFcbmtRow(implicit e0: GR[Long], e1: GR[String], e2: GR[Option[String]], e3: GR[Option[java.sql.Timestamp]], e4: GR[java.sql.Timestamp]): GR[FcbmtRow] = GR{
    prs => import prs._
    FcbmtRow.tupled((<<[Long], <<[String], <<?[String], <<[String], <<?[java.sql.Timestamp], <<[java.sql.Timestamp], <<[String], <<[String], <<[String]))
  }
  /** Table description of table FCBMT. Objects of this class serve as prototypes for rows in queries. */
  class Fcbmt(_tableTag: Tag) extends BaseTable[FcbmtRow](_tableTag, "FCBMT") {
    def * = (id, bmtbankname, bmtbankcode, bmtactive, createdate, modifydate, createdby, lastmodifiedby, bmtisipallowed) <> (FcbmtRow.tupled, FcbmtRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(bmtbankname), bmtbankcode, Rep.Some(bmtactive), createdate, Rep.Some(modifydate), Rep.Some(createdby), Rep.Some(lastmodifiedby), Rep.Some(bmtisipallowed)).shaped.<>({r=>import r._; _1.map(_=> FcbmtRow.tupled((_1.get, _2.get, _3, _4.get, _5, _6.get, _7.get, _8.get, _9.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column BMTRFNUM SqlType(BIGINT), AutoInc, PrimaryKey */
    override val id: Rep[Long] = column[Long]("BMTRFNUM", O.AutoInc, O.PrimaryKey)
    /** Database column BMTBANKNAME SqlType(VARCHAR), Length(256,true) */
    val bmtbankname: Rep[String] = column[String]("BMTBANKNAME", O.Length(256,varying=true))
    /** Database column BMTBANKCODE SqlType(CHAR), Length(20,false), Default(None) */
    val bmtbankcode: Rep[Option[String]] = column[Option[String]]("BMTBANKCODE", O.Length(20,varying=false), O.Default(None))
    /** Database column BMTACTIVE SqlType(CHAR), Length(2,false) */
    val bmtactive: Rep[String] = column[String]("BMTACTIVE", O.Length(2,varying=false))




    /** Database column BMTISIPALLOWED SqlType(CHAR), Length(2,false) */
    val bmtisipallowed: Rep[String] = column[String]("BMTISIPALLOWED", O.Length(2,varying=false))
  }
  /** Collection-like TableQuery object for table Fcbmt */
  lazy val Fcbmt = new TableQuery(tag => new Fcbmt(tag))

  /** Entity class storing rows of table Fcbpa
   *  @param bparfnum Database column BPARFNUM SqlType(BIGINT), AutoInc, PrimaryKey
   *  @param bpaprmtrfnum Database column BPAPRMTRFNUM SqlType(BIGINT)
   *  @param bpabdarfnum Database column BPABDARFNUM SqlType(BIGINT)
   *  @param createdate 
   *  @param modifydate 
   *  @param createdby 
   *  @param lastmodifiedby  */
  case class FcbpaRow(id: Long, bpaprmtrfnum: Long, bpabdarfnum: Long, createdate: Option[java.sql.Timestamp] = None, modifydate: java.sql.Timestamp, createdby: String, lastmodifiedby: String) extends BaseEntity 
  class FcbpaRowWrapper(id: Option[Long], bpaprmtrfnum: Long, bpabdarfnum: Long) {
    def get(userName: String): FcbpaRow = {
      FcbpaRow(this.id.getOrElse(0), this.bpaprmtrfnum, this.bpabdarfnum, Some(DateTimeUtils.getCurrentTimeStamp), DateTimeUtils.getCurrentTimeStamp, userName, userName)
  	}
  }
  /** GetResult implicit for fetching FcbpaRow objects using plain SQL queries */
  implicit def GetResultFcbpaRow(implicit e0: GR[Long], e1: GR[Option[java.sql.Timestamp]], e2: GR[java.sql.Timestamp], e3: GR[String]): GR[FcbpaRow] = GR{
    prs => import prs._
    FcbpaRow.tupled((<<[Long], <<[Long], <<[Long], <<?[java.sql.Timestamp], <<[java.sql.Timestamp], <<[String], <<[String]))
  }
  /** Table description of table FCBPA. Objects of this class serve as prototypes for rows in queries. */
  class Fcbpa(_tableTag: Tag) extends BaseTable[FcbpaRow](_tableTag, "FCBPA") {
    def * = (id, bpaprmtrfnum, bpabdarfnum, createdate, modifydate, createdby, lastmodifiedby) <> (FcbpaRow.tupled, FcbpaRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(bpaprmtrfnum), Rep.Some(bpabdarfnum), createdate, Rep.Some(modifydate), Rep.Some(createdby), Rep.Some(lastmodifiedby)).shaped.<>({r=>import r._; _1.map(_=> FcbpaRow.tupled((_1.get, _2.get, _3.get, _4, _5.get, _6.get, _7.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column BPARFNUM SqlType(BIGINT), AutoInc, PrimaryKey */
    override val id: Rep[Long] = column[Long]("BPARFNUM", O.AutoInc, O.PrimaryKey)
    /** Database column BPAPRMTRFNUM SqlType(BIGINT) */
    val bpaprmtrfnum: Rep[Long] = column[Long]("BPAPRMTRFNUM")
    /** Database column BPABDARFNUM SqlType(BIGINT) */
    val bpabdarfnum: Rep[Long] = column[Long]("BPABDARFNUM")





    /** Foreign key referencing Fcbda (database name FK_FCBPA_FCBDA) */
    lazy val fcbdaFk = foreignKey("FK_FCBPA_FCBDA", bpabdarfnum, Fcbda)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Fcprmt (database name FK_FCBPA_FCPRMT) */
    lazy val fcprmtFk = foreignKey("FK_FCBPA_FCPRMT", bpaprmtrfnum, Fcprmt)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table Fcbpa */
  lazy val Fcbpa = new TableQuery(tag => new Fcbpa(tag))

  /** Entity class storing rows of table Fcbra
   *  @param brarfnum Database column BRARFNUM SqlType(BIGINT), AutoInc, PrimaryKey
   *  @param brabenrfnum Database column BRABENRFNUM SqlType(BIGINT)
   *  @param braremtrfnum Database column BRAREMTRFNUM SqlType(BIGINT)
   *  @param createdate 
   *  @param modifydate 
   *  @param createdby 
   *  @param lastmodifiedby  */
  case class FcbraRow(id: Long, brabenrfnum: Long, braremtrfnum: Long, createdate: Option[java.sql.Timestamp] = None, modifydate: java.sql.Timestamp, createdby: String, lastmodifiedby: String) extends BaseEntity 
  class FcbraRowWrapper(id: Option[Long], brabenrfnum: Long, braremtrfnum: Long) {
    def get(userName: String): FcbraRow = {
      FcbraRow(this.id.getOrElse(0), this.brabenrfnum, this.braremtrfnum, Some(DateTimeUtils.getCurrentTimeStamp), DateTimeUtils.getCurrentTimeStamp, userName, userName)
  	}
  }
  /** GetResult implicit for fetching FcbraRow objects using plain SQL queries */
  implicit def GetResultFcbraRow(implicit e0: GR[Long], e1: GR[Option[java.sql.Timestamp]], e2: GR[java.sql.Timestamp], e3: GR[String]): GR[FcbraRow] = GR{
    prs => import prs._
    FcbraRow.tupled((<<[Long], <<[Long], <<[Long], <<?[java.sql.Timestamp], <<[java.sql.Timestamp], <<[String], <<[String]))
  }
  /** Table description of table FCBRA. Objects of this class serve as prototypes for rows in queries. */
  class Fcbra(_tableTag: Tag) extends BaseTable[FcbraRow](_tableTag, "FCBRA") {
    def * = (id, brabenrfnum, braremtrfnum, createdate, modifydate, createdby, lastmodifiedby) <> (FcbraRow.tupled, FcbraRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(brabenrfnum), Rep.Some(braremtrfnum), createdate, Rep.Some(modifydate), Rep.Some(createdby), Rep.Some(lastmodifiedby)).shaped.<>({r=>import r._; _1.map(_=> FcbraRow.tupled((_1.get, _2.get, _3.get, _4, _5.get, _6.get, _7.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column BRARFNUM SqlType(BIGINT), AutoInc, PrimaryKey */
    override val id: Rep[Long] = column[Long]("BRARFNUM", O.AutoInc, O.PrimaryKey)
    /** Database column BRABENRFNUM SqlType(BIGINT) */
    val brabenrfnum: Rep[Long] = column[Long]("BRABENRFNUM")
    /** Database column BRAREMTRFNUM SqlType(BIGINT) */
    val braremtrfnum: Rep[Long] = column[Long]("BRAREMTRFNUM")





    /** Foreign key referencing Fcben (database name FK_FCBRA_FCBEN) */
    lazy val fcbenFk = foreignKey("FK_FCBRA_FCBEN", brabenrfnum, Fcben)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Fcremt (database name FK_FCBRA_FCREMT) */
    lazy val fcremtFk = foreignKey("FK_FCBRA_FCREMT", braremtrfnum, Fcremt)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table Fcbra */
  lazy val Fcbra = new TableQuery(tag => new Fcbra(tag))

  /** Entity class storing rows of table Fcbraa
   *  @param braarfnum Database column BRAARFNUM SqlType(BIGINT), AutoInc, PrimaryKey
   *  @param braabenrfnum Database column BRAABENRFNUM SqlType(BIGINT)
   *  @param braaramtrfnum Database column BRAARAMTRFNUM SqlType(BIGINT)
   *  @param createdate 
   *  @param modifydate 
   *  @param createdby 
   *  @param lastmodifiedby  */
  case class FcbraaRow(id: Long, braabenrfnum: Long, braaramtrfnum: Long, createdate: Option[java.sql.Timestamp] = None, modifydate: java.sql.Timestamp, createdby: String, lastmodifiedby: String) extends BaseEntity 
  class FcbraaRowWrapper(id: Option[Long], braabenrfnum: Long, braaramtrfnum: Long) {
    def get(userName: String): FcbraaRow = {
      FcbraaRow(this.id.getOrElse(0), this.braabenrfnum, this.braaramtrfnum, Some(DateTimeUtils.getCurrentTimeStamp), DateTimeUtils.getCurrentTimeStamp, userName, userName)
  	}
  }
  /** GetResult implicit for fetching FcbraaRow objects using plain SQL queries */
  implicit def GetResultFcbraaRow(implicit e0: GR[Long], e1: GR[Option[java.sql.Timestamp]], e2: GR[java.sql.Timestamp], e3: GR[String]): GR[FcbraaRow] = GR{
    prs => import prs._
    FcbraaRow.tupled((<<[Long], <<[Long], <<[Long], <<?[java.sql.Timestamp], <<[java.sql.Timestamp], <<[String], <<[String]))
  }
  /** Table description of table FCBRAA. Objects of this class serve as prototypes for rows in queries. */
  class Fcbraa(_tableTag: Tag) extends BaseTable[FcbraaRow](_tableTag, "FCBRAA") {
    def * = (id, braabenrfnum, braaramtrfnum, createdate, modifydate, createdby, lastmodifiedby) <> (FcbraaRow.tupled, FcbraaRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(braabenrfnum), Rep.Some(braaramtrfnum), createdate, Rep.Some(modifydate), Rep.Some(createdby), Rep.Some(lastmodifiedby)).shaped.<>({r=>import r._; _1.map(_=> FcbraaRow.tupled((_1.get, _2.get, _3.get, _4, _5.get, _6.get, _7.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column BRAARFNUM SqlType(BIGINT), AutoInc, PrimaryKey */
    override val id: Rep[Long] = column[Long]("BRAARFNUM", O.AutoInc, O.PrimaryKey)
    /** Database column BRAABENRFNUM SqlType(BIGINT) */
    val braabenrfnum: Rep[Long] = column[Long]("BRAABENRFNUM")
    /** Database column BRAARAMTRFNUM SqlType(BIGINT) */
    val braaramtrfnum: Rep[Long] = column[Long]("BRAARAMTRFNUM")





    /** Foreign key referencing Fcben (database name FK_FCBRAA_FCBEN) */
    lazy val fcbenFk = foreignKey("FK_FCBRAA_FCBEN", braabenrfnum, Fcben)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Fcramt (database name FK_FCBRAA_FCRAMT) */
    lazy val fcramtFk = foreignKey("FK_FCBRAA_FCRAMT", braaramtrfnum, Fcramt)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table Fcbraa */
  lazy val Fcbraa = new TableQuery(tag => new Fcbraa(tag))

  /** Entity class storing rows of table Fcbrta
   *  @param brtarfnum Database column BRTARFNUM SqlType(BIGINT), AutoInc, PrimaryKey
   *  @param brtabenrfnum Database column BRTABENRFNUM SqlType(BIGINT)
   *  @param brtafrtrfnum Database column BRTAFRTRFNUM SqlType(BIGINT)
   *  @param createdate 
   *  @param modifydate 
   *  @param createdby 
   *  @param lastmodifiedby  */
  case class FcbrtaRow(id: Long, brtabenrfnum: Long, brtafrtrfnum: Long, createdate: Option[java.sql.Timestamp] = None, modifydate: java.sql.Timestamp, createdby: String, lastmodifiedby: String) extends BaseEntity 
  class FcbrtaRowWrapper(id: Option[Long], brtabenrfnum: Long, brtafrtrfnum: Long) {
    def get(userName: String): FcbrtaRow = {
      FcbrtaRow(this.id.getOrElse(0), this.brtabenrfnum, this.brtafrtrfnum, Some(DateTimeUtils.getCurrentTimeStamp), DateTimeUtils.getCurrentTimeStamp, userName, userName)
  	}
  }
  /** GetResult implicit for fetching FcbrtaRow objects using plain SQL queries */
  implicit def GetResultFcbrtaRow(implicit e0: GR[Long], e1: GR[Option[java.sql.Timestamp]], e2: GR[java.sql.Timestamp], e3: GR[String]): GR[FcbrtaRow] = GR{
    prs => import prs._
    FcbrtaRow.tupled((<<[Long], <<[Long], <<[Long], <<?[java.sql.Timestamp], <<[java.sql.Timestamp], <<[String], <<[String]))
  }
  /** Table description of table FCBRTA. Objects of this class serve as prototypes for rows in queries. */
  class Fcbrta(_tableTag: Tag) extends BaseTable[FcbrtaRow](_tableTag, "FCBRTA") {
    def * = (id, brtabenrfnum, brtafrtrfnum, createdate, modifydate, createdby, lastmodifiedby) <> (FcbrtaRow.tupled, FcbrtaRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(brtabenrfnum), Rep.Some(brtafrtrfnum), createdate, Rep.Some(modifydate), Rep.Some(createdby), Rep.Some(lastmodifiedby)).shaped.<>({r=>import r._; _1.map(_=> FcbrtaRow.tupled((_1.get, _2.get, _3.get, _4, _5.get, _6.get, _7.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column BRTARFNUM SqlType(BIGINT), AutoInc, PrimaryKey */
    override val id: Rep[Long] = column[Long]("BRTARFNUM", O.AutoInc, O.PrimaryKey)
    /** Database column BRTABENRFNUM SqlType(BIGINT) */
    val brtabenrfnum: Rep[Long] = column[Long]("BRTABENRFNUM")
    /** Database column BRTAFRTRFNUM SqlType(BIGINT) */
    val brtafrtrfnum: Rep[Long] = column[Long]("BRTAFRTRFNUM")





    /** Foreign key referencing Fcben (database name FK_FCBRTA_FCBEN) */
    lazy val fcbenFk = foreignKey("FK_FCBRTA_FCBEN", brtabenrfnum, Fcben)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Fcfrt (database name FK_FCBRTA_FCFRT) */
    lazy val fcfrtFk = foreignKey("FK_FCBRTA_FCFRT", brtafrtrfnum, Fcfrt)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table Fcbrta */
  lazy val Fcbrta = new TableQuery(tag => new Fcbrta(tag))

  /** Entity class storing rows of table Fcbse
   *  @param bserfnum Database column BSERFNUM SqlType(BIGINT), PrimaryKey
   *  @param bsesoptrfnum Database column BSESOPTRFNUM SqlType(BIGINT)
   *  @param bseschemecode Database column BSESCHEMECODE SqlType(VARCHAR), Length(32,true), Default(None)
   *  @param bsertaschemecode Database column BSERTASCHEMECODE SqlType(VARCHAR), Length(8,true), Default(None)
   *  @param bseisin Database column BSEISIN SqlType(VARCHAR), Length(16,true), Default(None)
   *  @param bseamccode Database column BSEAMCCODE SqlType(VARCHAR), Length(32,true), Default(None)
   *  @param bseschemetype Database column BSESCHEMETYPE SqlType(VARCHAR), Length(16,true), Default(None)
   *  @param bseschemeplan Database column BSESCHEMEPLAN SqlType(VARCHAR), Length(16,true), Default(None)
   *  @param bseschemename Database column BSESCHEMENAME SqlType(VARCHAR), Length(512,true), Default(None)
   *  @param bsepurchaseallowed Database column BSEPURCHASEALLOWED SqlType(VARCHAR), Length(8,true), Default(None)
   *  @param bsepurchasetxnmode Database column BSEPURCHASETXNMODE SqlType(VARCHAR), Length(3,true), Default(None)
   *  @param bseminpurchaseamt Database column BSEMINPURCHASEAMT SqlType(DOUBLE), Default(None)
   *  @param bseaddpuramtmultiple Database column BSEADDPURAMTMULTIPLE SqlType(DOUBLE), Default(None)
   *  @param bsemaxpurchaseamt Database column BSEMAXPURCHASEAMT SqlType(DOUBLE), Default(None)
   *  @param bsepuramtmultiplier Database column BSEPURAMTMULTIPLIER SqlType(DOUBLE), Default(None)
   *  @param bsepurcutofftime Database column BSEPURCUTOFFTIME SqlType(TIME), Default(None)
   *  @param bseredemptionallowed Database column BSEREDEMPTIONALLOWED SqlType(VARCHAR), Length(8,true), Default(None)
   *  @param bseredemtxnmode Database column BSEREDEMTXNMODE SqlType(VARCHAR), Length(3,true), Default(None)
   *  @param bseminredemqty Database column BSEMINREDEMQTY SqlType(DOUBLE), Default(None)
   *  @param bseredemqtymultiplier Database column BSEREDEMQTYMULTIPLIER SqlType(DOUBLE), Default(None)
   *  @param bsemaxredemqty Database column BSEMAXREDEMQTY SqlType(DOUBLE), Default(None)
   *  @param createdate  */
  case class FcbseRow(id: Long, bsesoptrfnum: Long, bseschemecode: Option[String] = None, bsertaschemecode: Option[String] = None, bseisin: Option[String] = None, bseamccode: Option[String] = None, bseschemetype: Option[String] = None, bseschemeplan: Option[String] = None, bseschemename: Option[String] = None, bsepurchaseallowed: Option[String] = None, bsepurchasetxnmode: Option[String] = None, bseminpurchaseamt: Option[Double] = None, bseaddpuramtmultiple: Option[Double] = None, bsemaxpurchaseamt: Option[Double] = None, bsepuramtmultiplier: Option[Double] = None, bsepurcutofftime: Option[java.sql.Time] = None, bseredemptionallowed: Option[String] = None, bseredemtxnmode: Option[String] = None, bseminredemqty: Option[Double] = None, bseredemqtymultiplier: Option[Double] = None, bsemaxredemqty: Option[Double] = None, createdate: Option[java.sql.Timestamp] = None) extends BaseEntity 
  class FcbseRowWrapper(id: Long, bsesoptrfnum: Long, bseschemecode: Option[String] = None, bsertaschemecode: Option[String] = None, bseisin: Option[String] = None, bseamccode: Option[String] = None, bseschemetype: Option[String] = None, bseschemeplan: Option[String] = None, bseschemename: Option[String] = None, bsepurchaseallowed: Option[String] = None, bsepurchasetxnmode: Option[String] = None, bseminpurchaseamt: Option[Double] = None, bseaddpuramtmultiple: Option[Double] = None, bsemaxpurchaseamt: Option[Double] = None, bsepuramtmultiplier: Option[Double] = None, bsepurcutofftime: Option[java.sql.Time] = None, bseredemptionallowed: Option[String] = None, bseredemtxnmode: Option[String] = None, bseminredemqty: Option[Double] = None, bseredemqtymultiplier: Option[Double] = None, bsemaxredemqty: Option[Double] = None) {
    def get(userName: String): FcbseRow = {
      FcbseRow(this.id, this.bsesoptrfnum, this.bseschemecode, this.bsertaschemecode, this.bseisin, this.bseamccode, this.bseschemetype, this.bseschemeplan, this.bseschemename, this.bsepurchaseallowed, this.bsepurchasetxnmode, this.bseminpurchaseamt, this.bseaddpuramtmultiple, this.bsemaxpurchaseamt, this.bsepuramtmultiplier, this.bsepurcutofftime, this.bseredemptionallowed, this.bseredemtxnmode, this.bseminredemqty, this.bseredemqtymultiplier, this.bsemaxredemqty, Some(DateTimeUtils.getCurrentTimeStamp))
  	}
  }
  /** GetResult implicit for fetching FcbseRow objects using plain SQL queries */
  implicit def GetResultFcbseRow(implicit e0: GR[Long], e1: GR[Option[String]], e2: GR[Option[Double]], e3: GR[Option[java.sql.Time]], e4: GR[Option[java.sql.Timestamp]]): GR[FcbseRow] = GR{
    prs => import prs._
    FcbseRow.tupled((<<[Long], <<[Long], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[Double], <<?[Double], <<?[Double], <<?[Double], <<?[java.sql.Time], <<?[String], <<?[String], <<?[Double], <<?[Double], <<?[Double], <<?[java.sql.Timestamp]))
  }
  /** Table description of table FCBSE. Objects of this class serve as prototypes for rows in queries. */
  class Fcbse(_tableTag: Tag) extends BaseTable[FcbseRow](_tableTag, "FCBSE") {
    def * = (id, bsesoptrfnum, bseschemecode, bsertaschemecode, bseisin, bseamccode, bseschemetype, bseschemeplan, bseschemename, bsepurchaseallowed, bsepurchasetxnmode, bseminpurchaseamt, bseaddpuramtmultiple, bsemaxpurchaseamt, bsepuramtmultiplier, bsepurcutofftime, bseredemptionallowed, bseredemtxnmode, bseminredemqty, bseredemqtymultiplier, bsemaxredemqty, createdate) <> (FcbseRow.tupled, FcbseRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(bsesoptrfnum), bseschemecode, bsertaschemecode, bseisin, bseamccode, bseschemetype, bseschemeplan, bseschemename, bsepurchaseallowed, bsepurchasetxnmode, bseminpurchaseamt, bseaddpuramtmultiple, bsemaxpurchaseamt, bsepuramtmultiplier, bsepurcutofftime, bseredemptionallowed, bseredemtxnmode, bseminredemqty, bseredemqtymultiplier, bsemaxredemqty, createdate).shaped.<>({r=>import r._; _1.map(_=> FcbseRow.tupled((_1.get, _2.get, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13, _14, _15, _16, _17, _18, _19, _20, _21, _22)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column BSERFNUM SqlType(BIGINT), PrimaryKey */
    override val id: Rep[Long] = column[Long]("BSERFNUM", O.PrimaryKey)
    /** Database column BSESOPTRFNUM SqlType(BIGINT) */
    val bsesoptrfnum: Rep[Long] = column[Long]("BSESOPTRFNUM")
    /** Database column BSESCHEMECODE SqlType(VARCHAR), Length(32,true), Default(None) */
    val bseschemecode: Rep[Option[String]] = column[Option[String]]("BSESCHEMECODE", O.Length(32,varying=true), O.Default(None))
    /** Database column BSERTASCHEMECODE SqlType(VARCHAR), Length(8,true), Default(None) */
    val bsertaschemecode: Rep[Option[String]] = column[Option[String]]("BSERTASCHEMECODE", O.Length(8,varying=true), O.Default(None))
    /** Database column BSEISIN SqlType(VARCHAR), Length(16,true), Default(None) */
    val bseisin: Rep[Option[String]] = column[Option[String]]("BSEISIN", O.Length(16,varying=true), O.Default(None))
    /** Database column BSEAMCCODE SqlType(VARCHAR), Length(32,true), Default(None) */
    val bseamccode: Rep[Option[String]] = column[Option[String]]("BSEAMCCODE", O.Length(32,varying=true), O.Default(None))
    /** Database column BSESCHEMETYPE SqlType(VARCHAR), Length(16,true), Default(None) */
    val bseschemetype: Rep[Option[String]] = column[Option[String]]("BSESCHEMETYPE", O.Length(16,varying=true), O.Default(None))
    /** Database column BSESCHEMEPLAN SqlType(VARCHAR), Length(16,true), Default(None) */
    val bseschemeplan: Rep[Option[String]] = column[Option[String]]("BSESCHEMEPLAN", O.Length(16,varying=true), O.Default(None))
    /** Database column BSESCHEMENAME SqlType(VARCHAR), Length(512,true), Default(None) */
    val bseschemename: Rep[Option[String]] = column[Option[String]]("BSESCHEMENAME", O.Length(512,varying=true), O.Default(None))
    /** Database column BSEPURCHASEALLOWED SqlType(VARCHAR), Length(8,true), Default(None) */
    val bsepurchaseallowed: Rep[Option[String]] = column[Option[String]]("BSEPURCHASEALLOWED", O.Length(8,varying=true), O.Default(None))
    /** Database column BSEPURCHASETXNMODE SqlType(VARCHAR), Length(3,true), Default(None) */
    val bsepurchasetxnmode: Rep[Option[String]] = column[Option[String]]("BSEPURCHASETXNMODE", O.Length(3,varying=true), O.Default(None))
    /** Database column BSEMINPURCHASEAMT SqlType(DOUBLE), Default(None) */
    val bseminpurchaseamt: Rep[Option[Double]] = column[Option[Double]]("BSEMINPURCHASEAMT", O.Default(None))
    /** Database column BSEADDPURAMTMULTIPLE SqlType(DOUBLE), Default(None) */
    val bseaddpuramtmultiple: Rep[Option[Double]] = column[Option[Double]]("BSEADDPURAMTMULTIPLE", O.Default(None))
    /** Database column BSEMAXPURCHASEAMT SqlType(DOUBLE), Default(None) */
    val bsemaxpurchaseamt: Rep[Option[Double]] = column[Option[Double]]("BSEMAXPURCHASEAMT", O.Default(None))
    /** Database column BSEPURAMTMULTIPLIER SqlType(DOUBLE), Default(None) */
    val bsepuramtmultiplier: Rep[Option[Double]] = column[Option[Double]]("BSEPURAMTMULTIPLIER", O.Default(None))
    /** Database column BSEPURCUTOFFTIME SqlType(TIME), Default(None) */
    val bsepurcutofftime: Rep[Option[java.sql.Time]] = column[Option[java.sql.Time]]("BSEPURCUTOFFTIME", O.Default(None))
    /** Database column BSEREDEMPTIONALLOWED SqlType(VARCHAR), Length(8,true), Default(None) */
    val bseredemptionallowed: Rep[Option[String]] = column[Option[String]]("BSEREDEMPTIONALLOWED", O.Length(8,varying=true), O.Default(None))
    /** Database column BSEREDEMTXNMODE SqlType(VARCHAR), Length(3,true), Default(None) */
    val bseredemtxnmode: Rep[Option[String]] = column[Option[String]]("BSEREDEMTXNMODE", O.Length(3,varying=true), O.Default(None))
    /** Database column BSEMINREDEMQTY SqlType(DOUBLE), Default(None) */
    val bseminredemqty: Rep[Option[Double]] = column[Option[Double]]("BSEMINREDEMQTY", O.Default(None))
    /** Database column BSEREDEMQTYMULTIPLIER SqlType(DOUBLE), Default(None) */
    val bseredemqtymultiplier: Rep[Option[Double]] = column[Option[Double]]("BSEREDEMQTYMULTIPLIER", O.Default(None))
    /** Database column BSEMAXREDEMQTY SqlType(DOUBLE), Default(None) */
    val bsemaxredemqty: Rep[Option[Double]] = column[Option[Double]]("BSEMAXREDEMQTY", O.Default(None))


    /** Foreign key referencing Fcsopt (database name FK_FCBSE_FCSOPT) */
    lazy val fcsoptFk = foreignKey("FK_FCBSE_FCSOPT", bsesoptrfnum, Fcsopt)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)

    /** Uniqueness Index over (bseschemecode) (database name BSE_BSESCHEMECODE_UNQ) */
    val index1 = index("BSE_BSESCHEMECODE_UNQ", bseschemecode, unique=true)
    /** Uniqueness Index over (bsesoptrfnum) (database name BSE_BSESOPT) */
    val index2 = index("BSE_BSESOPT", bsesoptrfnum, unique=true)
  }
  /** Collection-like TableQuery object for table Fcbse */
  lazy val Fcbse = new TableQuery(tag => new Fcbse(tag))

  /** Entity class storing rows of table Fcbua
   *  @param buarfnum Database column BUARFNUM SqlType(BIGINT), AutoInc, PrimaryKey
   *  @param buaubdrfnum Database column BUAUBDRFNUM SqlType(BIGINT)
   *  @param buabbtrfnum Database column BUABBTRFNUM SqlType(BIGINT)
   *  @param buaholdername Database column BUAHOLDERNAME SqlType(VARCHAR), Length(128,true)
   *  @param buaacctno Database column BUAACCTNO SqlType(VARCHAR), Length(32,true)
   *  @param buacndaccttyperfnum Database column BUACNDACCTTYPERFNUM SqlType(BIGINT)
   *  @param buadmtrfnum Database column BUADMTRFNUM SqlType(BIGINT), Default(None)
   *  @param buaactive Database column BUAACTIVE SqlType(CHAR), Length(2,false)
   *  @param buadocstatus Database column BUADOCSTATUS SqlType(CHAR), Length(32,false), Default(UP)
   *  @param buadocremark Database column BUADOCREMARK SqlType(VARCHAR), Length(256,true), Default(None)
   *  @param createdate 
   *  @param modifydate 
   *  @param createdby 
   *  @param lastmodifiedby  */
  case class FcbuaRow(id: Long, buaubdrfnum: Long, buabbtrfnum: Long, buaholdername: String, buaacctno: String, buacndaccttyperfnum: Long, buadmtrfnum: Option[Long] = None, buaactive: String, buadocstatus: String = "UP", buadocremark: Option[String] = None, createdate: Option[java.sql.Timestamp] = None, modifydate: java.sql.Timestamp, createdby: String, lastmodifiedby: String) extends BaseEntity 
  class FcbuaRowWrapper(id: Option[Long], buaubdrfnum: Long, buabbtrfnum: Long, buaholdername: String, buaacctno: String, buacndaccttyperfnum: Long, buadmtrfnum: Option[Long] = None, buaactive: String, buadocstatus: String = "UP", buadocremark: Option[String] = None) {
    def get(userName: String): FcbuaRow = {
      FcbuaRow(this.id.getOrElse(0), this.buaubdrfnum, this.buabbtrfnum, this.buaholdername, this.buaacctno, this.buacndaccttyperfnum, this.buadmtrfnum, this.buaactive, this.buadocstatus, this.buadocremark, Some(DateTimeUtils.getCurrentTimeStamp), DateTimeUtils.getCurrentTimeStamp, userName, userName)
  	}
  }
  /** GetResult implicit for fetching FcbuaRow objects using plain SQL queries */
  implicit def GetResultFcbuaRow(implicit e0: GR[Long], e1: GR[String], e2: GR[Option[Long]], e3: GR[Option[String]], e4: GR[Option[java.sql.Timestamp]], e5: GR[java.sql.Timestamp]): GR[FcbuaRow] = GR{
    prs => import prs._
    FcbuaRow.tupled((<<[Long], <<[Long], <<[Long], <<[String], <<[String], <<[Long], <<?[Long], <<[String], <<[String], <<?[String], <<?[java.sql.Timestamp], <<[java.sql.Timestamp], <<[String], <<[String]))
  }
  /** Table description of table FCBUA. Objects of this class serve as prototypes for rows in queries. */
  class Fcbua(_tableTag: Tag) extends BaseTable[FcbuaRow](_tableTag, "FCBUA") {
    def * = (id, buaubdrfnum, buabbtrfnum, buaholdername, buaacctno, buacndaccttyperfnum, buadmtrfnum, buaactive, buadocstatus, buadocremark, createdate, modifydate, createdby, lastmodifiedby) <> (FcbuaRow.tupled, FcbuaRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(buaubdrfnum), Rep.Some(buabbtrfnum), Rep.Some(buaholdername), Rep.Some(buaacctno), Rep.Some(buacndaccttyperfnum), buadmtrfnum, Rep.Some(buaactive), Rep.Some(buadocstatus), buadocremark, createdate, Rep.Some(modifydate), Rep.Some(createdby), Rep.Some(lastmodifiedby)).shaped.<>({r=>import r._; _1.map(_=> FcbuaRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get, _7, _8.get, _9.get, _10, _11, _12.get, _13.get, _14.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column BUARFNUM SqlType(BIGINT), AutoInc, PrimaryKey */
    override val id: Rep[Long] = column[Long]("BUARFNUM", O.AutoInc, O.PrimaryKey)
    /** Database column BUAUBDRFNUM SqlType(BIGINT) */
    val buaubdrfnum: Rep[Long] = column[Long]("BUAUBDRFNUM")
    /** Database column BUABBTRFNUM SqlType(BIGINT) */
    val buabbtrfnum: Rep[Long] = column[Long]("BUABBTRFNUM")
    /** Database column BUAHOLDERNAME SqlType(VARCHAR), Length(128,true) */
    val buaholdername: Rep[String] = column[String]("BUAHOLDERNAME", O.Length(128,varying=true))
    /** Database column BUAACCTNO SqlType(VARCHAR), Length(32,true) */
    val buaacctno: Rep[String] = column[String]("BUAACCTNO", O.Length(32,varying=true))
    /** Database column BUACNDACCTTYPERFNUM SqlType(BIGINT) */
    val buacndaccttyperfnum: Rep[Long] = column[Long]("BUACNDACCTTYPERFNUM")
    /** Database column BUADMTRFNUM SqlType(BIGINT), Default(None) */
    val buadmtrfnum: Rep[Option[Long]] = column[Option[Long]]("BUADMTRFNUM", O.Default(None))
    /** Database column BUAACTIVE SqlType(CHAR), Length(2,false) */
    val buaactive: Rep[String] = column[String]("BUAACTIVE", O.Length(2,varying=false))
    /** Database column BUADOCSTATUS SqlType(CHAR), Length(32,false), Default(UP) */
    val buadocstatus: Rep[String] = column[String]("BUADOCSTATUS", O.Length(32,varying=false), O.Default("UP"))
    /** Database column BUADOCREMARK SqlType(VARCHAR), Length(256,true), Default(None) */
    val buadocremark: Rep[Option[String]] = column[Option[String]]("BUADOCREMARK", O.Length(256,varying=true), O.Default(None))





    /** Foreign key referencing Fcbbt (database name FK_FCBUA_FCBBT) */
    lazy val fcbbtFk = foreignKey("FK_FCBUA_FCBBT", buabbtrfnum, Fcbbt)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Fccnd (database name FK_FCBUA_FCCND) */
    lazy val fccndFk = foreignKey("FK_FCBUA_FCCND", buacndaccttyperfnum, Fccnd)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Fcdmt (database name FK_FCBUA_FCDMT) */
    lazy val fcdmtFk = foreignKey("FK_FCBUA_FCDMT", buadmtrfnum, Fcdmt)(r => Rep.Some(r.id), onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Fcubd (database name FK_FCBUA_FCUBD) */
    lazy val fcubdFk = foreignKey("FK_FCBUA_FCUBD", buaubdrfnum, Fcubd)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table Fcbua */
  lazy val Fcbua = new TableQuery(tag => new Fcbua(tag))

  /** Entity class storing rows of table Fccnd
   *  @param cndrfnum Database column CNDRFNUM SqlType(BIGINT), AutoInc, PrimaryKey
   *  @param cndsequence Database column CNDSEQUENCE SqlType(FLOAT), Default(None)
   *  @param cndname Database column CNDNAME SqlType(VARCHAR), Length(32,true)
   *  @param cnddesc Database column CNDDESC SqlType(VARCHAR), Length(256,true), Default(None)
   *  @param cndgroup Database column CNDGROUP SqlType(CHAR), Length(32,false)
   *  @param cndactive Database column CNDACTIVE SqlType(CHAR), Length(2,false)
   *  @param cndcndrfnum Database column CNDCNDRFNUM SqlType(BIGINT), Default(None)
   *  @param cndextfld1 Database column CNDEXTFLD1 SqlType(VARCHAR), Length(64,true), Default(None)
   *  @param cndextfld2 Database column CNDEXTFLD2 SqlType(VARCHAR), Length(64,true), Default(None)
   *  @param cndextfld3 Database column CNDEXTFLD3 SqlType(BIGINT), Default(None)
   *  @param cndextfld4 Database column CNDEXTFLD4 SqlType(BIGINT), Default(None)
   *  @param cndcode Database column CNDCODE SqlType(VARCHAR), Length(64,true), Default(None)
   *  @param createdate 
   *  @param modifydate 
   *  @param createdby 
   *  @param lastmodifiedby  */
  case class FccndRow(id: Long, cndsequence: Option[Float] = None, cndname: String, cnddesc: Option[String] = None, cndgroup: String, cndactive: String, cndcndrfnum: Option[Long] = None, cndextfld1: Option[String] = None, cndextfld2: Option[String] = None, cndextfld3: Option[Long] = None, cndextfld4: Option[Long] = None, cndcode: Option[String] = None, createdate: Option[java.sql.Timestamp] = None, modifydate: java.sql.Timestamp, createdby: String, lastmodifiedby: String) extends BaseEntity 
  class FccndRowWrapper(id: Option[Long], cndsequence: Option[Float] = None, cndname: String, cnddesc: Option[String] = None, cndgroup: String, cndactive: String, cndcndrfnum: Option[Long] = None, cndextfld1: Option[String] = None, cndextfld2: Option[String] = None, cndextfld3: Option[Long] = None, cndextfld4: Option[Long] = None, cndcode: Option[String] = None) {
    def get(userName: String): FccndRow = {
      FccndRow(this.id.getOrElse(0), this.cndsequence, this.cndname, this.cnddesc, this.cndgroup, this.cndactive, this.cndcndrfnum, this.cndextfld1, this.cndextfld2, this.cndextfld3, this.cndextfld4, this.cndcode, Some(DateTimeUtils.getCurrentTimeStamp), DateTimeUtils.getCurrentTimeStamp, userName, userName)
  	}
  }
  /** GetResult implicit for fetching FccndRow objects using plain SQL queries */
  implicit def GetResultFccndRow(implicit e0: GR[Long], e1: GR[Option[Float]], e2: GR[String], e3: GR[Option[String]], e4: GR[Option[Long]], e5: GR[Option[java.sql.Timestamp]], e6: GR[java.sql.Timestamp]): GR[FccndRow] = GR{
    prs => import prs._
    FccndRow.tupled((<<[Long], <<?[Float], <<[String], <<?[String], <<[String], <<[String], <<?[Long], <<?[String], <<?[String], <<?[Long], <<?[Long], <<?[String], <<?[java.sql.Timestamp], <<[java.sql.Timestamp], <<[String], <<[String]))
  }
  /** Table description of table FCCND. Objects of this class serve as prototypes for rows in queries. */
  class Fccnd(_tableTag: Tag) extends BaseTable[FccndRow](_tableTag, "FCCND") {
    def * = (id, cndsequence, cndname, cnddesc, cndgroup, cndactive, cndcndrfnum, cndextfld1, cndextfld2, cndextfld3, cndextfld4, cndcode, createdate, modifydate, createdby, lastmodifiedby) <> (FccndRow.tupled, FccndRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), cndsequence, Rep.Some(cndname), cnddesc, Rep.Some(cndgroup), Rep.Some(cndactive), cndcndrfnum, cndextfld1, cndextfld2, cndextfld3, cndextfld4, cndcode, createdate, Rep.Some(modifydate), Rep.Some(createdby), Rep.Some(lastmodifiedby)).shaped.<>({r=>import r._; _1.map(_=> FccndRow.tupled((_1.get, _2, _3.get, _4, _5.get, _6.get, _7, _8, _9, _10, _11, _12, _13, _14.get, _15.get, _16.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column CNDRFNUM SqlType(BIGINT), AutoInc, PrimaryKey */
    override val id: Rep[Long] = column[Long]("CNDRFNUM", O.AutoInc, O.PrimaryKey)
    /** Database column CNDSEQUENCE SqlType(FLOAT), Default(None) */
    val cndsequence: Rep[Option[Float]] = column[Option[Float]]("CNDSEQUENCE", O.Default(None))
    /** Database column CNDNAME SqlType(VARCHAR), Length(32,true) */
    val cndname: Rep[String] = column[String]("CNDNAME", O.Length(32,varying=true))
    /** Database column CNDDESC SqlType(VARCHAR), Length(256,true), Default(None) */
    val cnddesc: Rep[Option[String]] = column[Option[String]]("CNDDESC", O.Length(256,varying=true), O.Default(None))
    /** Database column CNDGROUP SqlType(CHAR), Length(32,false) */
    val cndgroup: Rep[String] = column[String]("CNDGROUP", O.Length(32,varying=false))
    /** Database column CNDACTIVE SqlType(CHAR), Length(2,false) */
    val cndactive: Rep[String] = column[String]("CNDACTIVE", O.Length(2,varying=false))
    /** Database column CNDCNDRFNUM SqlType(BIGINT), Default(None) */
    val cndcndrfnum: Rep[Option[Long]] = column[Option[Long]]("CNDCNDRFNUM", O.Default(None))
    /** Database column CNDEXTFLD1 SqlType(VARCHAR), Length(64,true), Default(None) */
    val cndextfld1: Rep[Option[String]] = column[Option[String]]("CNDEXTFLD1", O.Length(64,varying=true), O.Default(None))
    /** Database column CNDEXTFLD2 SqlType(VARCHAR), Length(64,true), Default(None) */
    val cndextfld2: Rep[Option[String]] = column[Option[String]]("CNDEXTFLD2", O.Length(64,varying=true), O.Default(None))
    /** Database column CNDEXTFLD3 SqlType(BIGINT), Default(None) */
    val cndextfld3: Rep[Option[Long]] = column[Option[Long]]("CNDEXTFLD3", O.Default(None))
    /** Database column CNDEXTFLD4 SqlType(BIGINT), Default(None) */
    val cndextfld4: Rep[Option[Long]] = column[Option[Long]]("CNDEXTFLD4", O.Default(None))
    /** Database column CNDCODE SqlType(VARCHAR), Length(64,true), Default(None) */
    val cndcode: Rep[Option[String]] = column[Option[String]]("CNDCODE", O.Length(64,varying=true), O.Default(None))





    /** Foreign key referencing Fccnd (database name FK_FCCND_FCCND) */
    lazy val fccndFk = foreignKey("FK_FCCND_FCCND", cndcndrfnum, Fccnd)(r => Rep.Some(r.id), onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table Fccnd */
  lazy val Fccnd = new TableQuery(tag => new Fccnd(tag))

  /** Entity class storing rows of table Fccomt
   *  @param comtrfnum Database column COMTRFNUM SqlType(BIGINT), AutoInc, PrimaryKey
   *  @param comtcomname Database column COMTCOMNAME SqlType(VARCHAR), Length(256,true)
   *  @param comtfromdate Database column COMTFROMDATE SqlType(DATE)
   *  @param comttodate Database column COMTTODATE SqlType(DATE)
   *  @param comtcomactive Database column COMTCOMACTIVE SqlType(CHAR), Length(2,false)
   *  @param comtcomdescption Database column COMTCOMDESCPTION SqlType(VARCHAR), Length(256,true), Default(None)
   *  @param comtamctrfnum Database column COMTAMCTRFNUM SqlType(BIGINT)
   *  @param comtsmtrfnum Database column COMTSMTRFNUM SqlType(BIGINT), Default(None)
   *  @param comtctmtrfnum Database column COMTCTMTRFNUM SqlType(BIGINT), Default(None)
   *  @param createdate 
   *  @param modifydate 
   *  @param createdby 
   *  @param lastmodifiedby  */
  case class FccomtRow(id: Long, comtcomname: String, comtfromdate: java.sql.Date, comttodate: java.sql.Date, comtcomactive: String, comtcomdescption: Option[String] = None, comtamctrfnum: Long, comtsmtrfnum: Option[Long] = None, comtctmtrfnum: Option[Long] = None, createdate: Option[java.sql.Timestamp] = None, modifydate: java.sql.Timestamp, createdby: String, lastmodifiedby: String) extends BaseEntity 
  class FccomtRowWrapper(id: Option[Long], comtcomname: String, comtfromdate: java.sql.Date, comttodate: java.sql.Date, comtcomactive: String, comtcomdescption: Option[String] = None, comtamctrfnum: Long, comtsmtrfnum: Option[Long] = None, comtctmtrfnum: Option[Long] = None) {
    def get(userName: String): FccomtRow = {
      FccomtRow(this.id.getOrElse(0), this.comtcomname, this.comtfromdate, this.comttodate, this.comtcomactive, this.comtcomdescption, this.comtamctrfnum, this.comtsmtrfnum, this.comtctmtrfnum, Some(DateTimeUtils.getCurrentTimeStamp), DateTimeUtils.getCurrentTimeStamp, userName, userName)
  	}
  }
  /** GetResult implicit for fetching FccomtRow objects using plain SQL queries */
  implicit def GetResultFccomtRow(implicit e0: GR[Long], e1: GR[String], e2: GR[java.sql.Date], e3: GR[Option[String]], e4: GR[Option[Long]], e5: GR[Option[java.sql.Timestamp]], e6: GR[java.sql.Timestamp]): GR[FccomtRow] = GR{
    prs => import prs._
    FccomtRow.tupled((<<[Long], <<[String], <<[java.sql.Date], <<[java.sql.Date], <<[String], <<?[String], <<[Long], <<?[Long], <<?[Long], <<?[java.sql.Timestamp], <<[java.sql.Timestamp], <<[String], <<[String]))
  }
  /** Table description of table FCCOMT. Objects of this class serve as prototypes for rows in queries. */
  class Fccomt(_tableTag: Tag) extends BaseTable[FccomtRow](_tableTag, "FCCOMT") {
    def * = (id, comtcomname, comtfromdate, comttodate, comtcomactive, comtcomdescption, comtamctrfnum, comtsmtrfnum, comtctmtrfnum, createdate, modifydate, createdby, lastmodifiedby) <> (FccomtRow.tupled, FccomtRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(comtcomname), Rep.Some(comtfromdate), Rep.Some(comttodate), Rep.Some(comtcomactive), comtcomdescption, Rep.Some(comtamctrfnum), comtsmtrfnum, comtctmtrfnum, createdate, Rep.Some(modifydate), Rep.Some(createdby), Rep.Some(lastmodifiedby)).shaped.<>({r=>import r._; _1.map(_=> FccomtRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6, _7.get, _8, _9, _10, _11.get, _12.get, _13.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column COMTRFNUM SqlType(BIGINT), AutoInc, PrimaryKey */
    override val id: Rep[Long] = column[Long]("COMTRFNUM", O.AutoInc, O.PrimaryKey)
    /** Database column COMTCOMNAME SqlType(VARCHAR), Length(256,true) */
    val comtcomname: Rep[String] = column[String]("COMTCOMNAME", O.Length(256,varying=true))
    /** Database column COMTFROMDATE SqlType(DATE) */
    val comtfromdate: Rep[java.sql.Date] = column[java.sql.Date]("COMTFROMDATE")
    /** Database column COMTTODATE SqlType(DATE) */
    val comttodate: Rep[java.sql.Date] = column[java.sql.Date]("COMTTODATE")
    /** Database column COMTCOMACTIVE SqlType(CHAR), Length(2,false) */
    val comtcomactive: Rep[String] = column[String]("COMTCOMACTIVE", O.Length(2,varying=false))
    /** Database column COMTCOMDESCPTION SqlType(VARCHAR), Length(256,true), Default(None) */
    val comtcomdescption: Rep[Option[String]] = column[Option[String]]("COMTCOMDESCPTION", O.Length(256,varying=true), O.Default(None))
    /** Database column COMTAMCTRFNUM SqlType(BIGINT) */
    val comtamctrfnum: Rep[Long] = column[Long]("COMTAMCTRFNUM")
    /** Database column COMTSMTRFNUM SqlType(BIGINT), Default(None) */
    val comtsmtrfnum: Rep[Option[Long]] = column[Option[Long]]("COMTSMTRFNUM", O.Default(None))
    /** Database column COMTCTMTRFNUM SqlType(BIGINT), Default(None) */
    val comtctmtrfnum: Rep[Option[Long]] = column[Option[Long]]("COMTCTMTRFNUM", O.Default(None))





    /** Foreign key referencing Fcamct (database name FK_FCCOMT_FCAMCT) */
    lazy val fcamctFk = foreignKey("FK_FCCOMT_FCAMCT", comtamctrfnum, Fcamct)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Fcctmt (database name FK_FCCOMT_FCCTMT) */
    lazy val fcctmtFk = foreignKey("FK_FCCOMT_FCCTMT", comtctmtrfnum, Fcctmt)(r => Rep.Some(r.id), onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Fcsmt (database name FK_FCCOMT_FCSMT) */
    lazy val fcsmtFk = foreignKey("FK_FCCOMT_FCSMT", comtsmtrfnum, Fcsmt)(r => Rep.Some(r.id), onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table Fccomt */
  lazy val Fccomt = new TableQuery(tag => new Fccomt(tag))

  /** Entity class storing rows of table Fccost
   *  @param costrfnum Database column COSTRFNUM SqlType(BIGINT), AutoInc, PrimaryKey
   *  @param costamctrfnum Database column COSTAMCTRFNUM SqlType(BIGINT), Default(None)
   *  @param costsmtrfnum Database column COSTSMTRFNUM SqlType(BIGINT), Default(None)
   *  @param costplantype Database column COSTPLANTYPE SqlType(CHAR), Length(2,false), Default(None)
   *  @param costamount Database column COSTAMOUNT SqlType(DOUBLE), Default(None)
   *  @param costcstrfnum Database column COSTCSTRFNUM SqlType(BIGINT), Default(None)
   *  @param costcomtrfnum Database column COSTCOMTRFNUM SqlType(BIGINT), Default(None)
   *  @param costuftrfnum Database column COSTUFTRFNUM SqlType(BIGINT), Default(None)
   *  @param createdate 
   *  @param modifydate 
   *  @param createdby 
   *  @param lastmodifiedby  */
  case class FccostRow(id: Long, costamctrfnum: Option[Long] = None, costsmtrfnum: Option[Long] = None, costplantype: Option[String] = None, costamount: Option[Double] = None, costcstrfnum: Option[Long] = None, costcomtrfnum: Option[Long] = None, costuftrfnum: Option[Long] = None, createdate: Option[java.sql.Timestamp] = None, modifydate: java.sql.Timestamp, createdby: String, lastmodifiedby: String) extends BaseEntity 
  class FccostRowWrapper(id: Option[Long], costamctrfnum: Option[Long] = None, costsmtrfnum: Option[Long] = None, costplantype: Option[String] = None, costamount: Option[Double] = None, costcstrfnum: Option[Long] = None, costcomtrfnum: Option[Long] = None, costuftrfnum: Option[Long] = None) {
    def get(userName: String): FccostRow = {
      FccostRow(this.id.getOrElse(0), this.costamctrfnum, this.costsmtrfnum, this.costplantype, this.costamount, this.costcstrfnum, this.costcomtrfnum, this.costuftrfnum, Some(DateTimeUtils.getCurrentTimeStamp), DateTimeUtils.getCurrentTimeStamp, userName, userName)
  	}
  }
  /** GetResult implicit for fetching FccostRow objects using plain SQL queries */
  implicit def GetResultFccostRow(implicit e0: GR[Long], e1: GR[Option[Long]], e2: GR[Option[String]], e3: GR[Option[Double]], e4: GR[Option[java.sql.Timestamp]], e5: GR[java.sql.Timestamp], e6: GR[String]): GR[FccostRow] = GR{
    prs => import prs._
    FccostRow.tupled((<<[Long], <<?[Long], <<?[Long], <<?[String], <<?[Double], <<?[Long], <<?[Long], <<?[Long], <<?[java.sql.Timestamp], <<[java.sql.Timestamp], <<[String], <<[String]))
  }
  /** Table description of table FCCOST. Objects of this class serve as prototypes for rows in queries. */
  class Fccost(_tableTag: Tag) extends BaseTable[FccostRow](_tableTag, "FCCOST") {
    def * = (id, costamctrfnum, costsmtrfnum, costplantype, costamount, costcstrfnum, costcomtrfnum, costuftrfnum, createdate, modifydate, createdby, lastmodifiedby) <> (FccostRow.tupled, FccostRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), costamctrfnum, costsmtrfnum, costplantype, costamount, costcstrfnum, costcomtrfnum, costuftrfnum, createdate, Rep.Some(modifydate), Rep.Some(createdby), Rep.Some(lastmodifiedby)).shaped.<>({r=>import r._; _1.map(_=> FccostRow.tupled((_1.get, _2, _3, _4, _5, _6, _7, _8, _9, _10.get, _11.get, _12.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column COSTRFNUM SqlType(BIGINT), AutoInc, PrimaryKey */
    override val id: Rep[Long] = column[Long]("COSTRFNUM", O.AutoInc, O.PrimaryKey)
    /** Database column COSTAMCTRFNUM SqlType(BIGINT), Default(None) */
    val costamctrfnum: Rep[Option[Long]] = column[Option[Long]]("COSTAMCTRFNUM", O.Default(None))
    /** Database column COSTSMTRFNUM SqlType(BIGINT), Default(None) */
    val costsmtrfnum: Rep[Option[Long]] = column[Option[Long]]("COSTSMTRFNUM", O.Default(None))
    /** Database column COSTPLANTYPE SqlType(CHAR), Length(2,false), Default(None) */
    val costplantype: Rep[Option[String]] = column[Option[String]]("COSTPLANTYPE", O.Length(2,varying=false), O.Default(None))
    /** Database column COSTAMOUNT SqlType(DOUBLE), Default(None) */
    val costamount: Rep[Option[Double]] = column[Option[Double]]("COSTAMOUNT", O.Default(None))
    /** Database column COSTCSTRFNUM SqlType(BIGINT), Default(None) */
    val costcstrfnum: Rep[Option[Long]] = column[Option[Long]]("COSTCSTRFNUM", O.Default(None))
    /** Database column COSTCOMTRFNUM SqlType(BIGINT), Default(None) */
    val costcomtrfnum: Rep[Option[Long]] = column[Option[Long]]("COSTCOMTRFNUM", O.Default(None))
    /** Database column COSTUFTRFNUM SqlType(BIGINT), Default(None) */
    val costuftrfnum: Rep[Option[Long]] = column[Option[Long]]("COSTUFTRFNUM", O.Default(None))





    /** Foreign key referencing Fcamct (database name FK_FCCOST_FCAMCT) */
    lazy val fcamctFk = foreignKey("FK_FCCOST_FCAMCT", costamctrfnum, Fcamct)(r => Rep.Some(r.id), onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Fccomt (database name FK_FCCOST_FCCOMT) */
    lazy val fccomtFk = foreignKey("FK_FCCOST_FCCOMT", costcomtrfnum, Fccomt)(r => Rep.Some(r.id), onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Fccst (database name FK_FCCOST_FCCST) */
    lazy val fccstFk = foreignKey("FK_FCCOST_FCCST", costcstrfnum, Fccst)(r => Rep.Some(r.id), onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Fcsmt (database name FK_FCCOST_FCSMT) */
    lazy val fcsmtFk = foreignKey("FK_FCCOST_FCSMT", costsmtrfnum, Fcsmt)(r => Rep.Some(r.id), onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Fcuft (database name FK_FCCOST_FCUFT) */
    lazy val fcuftFk = foreignKey("FK_FCCOST_FCUFT", costuftrfnum, Fcuft)(r => Rep.Some(r.id), onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table Fccost */
  lazy val Fccost = new TableQuery(tag => new Fccost(tag))

  /** Entity class storing rows of table Fccst
   *  @param cstrfnum Database column CSTRFNUM SqlType(BIGINT), AutoInc, PrimaryKey
   *  @param cstcomtype Database column CSTCOMTYPE SqlType(CHAR), Length(3,false)
   *  @param cstcomtrfnum Database column CSTCOMTRFNUM SqlType(BIGINT), Default(None)
   *  @param cstslmtrfnum Database column CSTSLMTRFNUM SqlType(BIGINT), Default(None)
   *  @param cstlocation Database column CSTLOCATION SqlType(CHAR), Length(4,false)
   *  @param cstcomrate Database column CSTCOMRATE SqlType(FLOAT)
   *  @param cstiscompercentage Database column CSTISCOMPERCENTAGE SqlType(CHAR), Length(2,false)
   *  @param cstclawbackperiod Database column CSTCLAWBACKPERIOD SqlType(INT), Default(None)
   *  @param cstclawbackperiodunit Database column CSTCLAWBACKPERIODUNIT SqlType(CHAR), Length(8,false), Default(None)
   *  @param cstcalcperiod Database column CSTCALCPERIOD SqlType(CHAR), Length(2,false), Default(None)
   *  @param cstisclawback Database column CSTISCLAWBACK SqlType(CHAR), Length(2,false), Default(None)
   *  @param cstctmtrfnum Database column CSTCTMTRFNUM SqlType(BIGINT), Default(None)
   *  @param cstplantype Database column CSTPLANTYPE SqlType(CHAR), Length(3,false), Default(None)
   *  @param createdate 
   *  @param modifydate 
   *  @param createdby 
   *  @param lastmodifiedby  */
  case class FccstRow(id: Long, cstcomtype: String, cstcomtrfnum: Option[Long] = None, cstslmtrfnum: Option[Long] = None, cstlocation: String, cstcomrate: Float, cstiscompercentage: String, cstclawbackperiod: Option[Int] = None, cstclawbackperiodunit: Option[String] = None, cstcalcperiod: Option[String] = None, cstisclawback: Option[String] = None, cstctmtrfnum: Option[Long] = None, cstplantype: Option[String] = None, createdate: Option[java.sql.Timestamp] = None, modifydate: java.sql.Timestamp, createdby: String, lastmodifiedby: String) extends BaseEntity 
  class FccstRowWrapper(id: Option[Long], cstcomtype: String, cstcomtrfnum: Option[Long] = None, cstslmtrfnum: Option[Long] = None, cstlocation: String, cstcomrate: Float, cstiscompercentage: String, cstclawbackperiod: Option[Int] = None, cstclawbackperiodunit: Option[String] = None, cstcalcperiod: Option[String] = None, cstisclawback: Option[String] = None, cstctmtrfnum: Option[Long] = None, cstplantype: Option[String] = None) {
    def get(userName: String): FccstRow = {
      FccstRow(this.id.getOrElse(0), this.cstcomtype, this.cstcomtrfnum, this.cstslmtrfnum, this.cstlocation, this.cstcomrate, this.cstiscompercentage, this.cstclawbackperiod, this.cstclawbackperiodunit, this.cstcalcperiod, this.cstisclawback, this.cstctmtrfnum, this.cstplantype, Some(DateTimeUtils.getCurrentTimeStamp), DateTimeUtils.getCurrentTimeStamp, userName, userName)
  	}
  }
  /** GetResult implicit for fetching FccstRow objects using plain SQL queries */
  implicit def GetResultFccstRow(implicit e0: GR[Long], e1: GR[String], e2: GR[Option[Long]], e3: GR[Float], e4: GR[Option[Int]], e5: GR[Option[String]], e6: GR[Option[java.sql.Timestamp]], e7: GR[java.sql.Timestamp]): GR[FccstRow] = GR{
    prs => import prs._
    FccstRow.tupled((<<[Long], <<[String], <<?[Long], <<?[Long], <<[String], <<[Float], <<[String], <<?[Int], <<?[String], <<?[String], <<?[String], <<?[Long], <<?[String], <<?[java.sql.Timestamp], <<[java.sql.Timestamp], <<[String], <<[String]))
  }
  /** Table description of table FCCST. Objects of this class serve as prototypes for rows in queries. */
  class Fccst(_tableTag: Tag) extends BaseTable[FccstRow](_tableTag, "FCCST") {
    def * = (id, cstcomtype, cstcomtrfnum, cstslmtrfnum, cstlocation, cstcomrate, cstiscompercentage, cstclawbackperiod, cstclawbackperiodunit, cstcalcperiod, cstisclawback, cstctmtrfnum, cstplantype, createdate, modifydate, createdby, lastmodifiedby) <> (FccstRow.tupled, FccstRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(cstcomtype), cstcomtrfnum, cstslmtrfnum, Rep.Some(cstlocation), Rep.Some(cstcomrate), Rep.Some(cstiscompercentage), cstclawbackperiod, cstclawbackperiodunit, cstcalcperiod, cstisclawback, cstctmtrfnum, cstplantype, createdate, Rep.Some(modifydate), Rep.Some(createdby), Rep.Some(lastmodifiedby)).shaped.<>({r=>import r._; _1.map(_=> FccstRow.tupled((_1.get, _2.get, _3, _4, _5.get, _6.get, _7.get, _8, _9, _10, _11, _12, _13, _14, _15.get, _16.get, _17.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column CSTRFNUM SqlType(BIGINT), AutoInc, PrimaryKey */
    override val id: Rep[Long] = column[Long]("CSTRFNUM", O.AutoInc, O.PrimaryKey)
    /** Database column CSTCOMTYPE SqlType(CHAR), Length(3,false) */
    val cstcomtype: Rep[String] = column[String]("CSTCOMTYPE", O.Length(3,varying=false))
    /** Database column CSTCOMTRFNUM SqlType(BIGINT), Default(None) */
    val cstcomtrfnum: Rep[Option[Long]] = column[Option[Long]]("CSTCOMTRFNUM", O.Default(None))
    /** Database column CSTSLMTRFNUM SqlType(BIGINT), Default(None) */
    val cstslmtrfnum: Rep[Option[Long]] = column[Option[Long]]("CSTSLMTRFNUM", O.Default(None))
    /** Database column CSTLOCATION SqlType(CHAR), Length(4,false) */
    val cstlocation: Rep[String] = column[String]("CSTLOCATION", O.Length(4,varying=false))
    /** Database column CSTCOMRATE SqlType(FLOAT) */
    val cstcomrate: Rep[Float] = column[Float]("CSTCOMRATE")
    /** Database column CSTISCOMPERCENTAGE SqlType(CHAR), Length(2,false) */
    val cstiscompercentage: Rep[String] = column[String]("CSTISCOMPERCENTAGE", O.Length(2,varying=false))
    /** Database column CSTCLAWBACKPERIOD SqlType(INT), Default(None) */
    val cstclawbackperiod: Rep[Option[Int]] = column[Option[Int]]("CSTCLAWBACKPERIOD", O.Default(None))
    /** Database column CSTCLAWBACKPERIODUNIT SqlType(CHAR), Length(8,false), Default(None) */
    val cstclawbackperiodunit: Rep[Option[String]] = column[Option[String]]("CSTCLAWBACKPERIODUNIT", O.Length(8,varying=false), O.Default(None))
    /** Database column CSTCALCPERIOD SqlType(CHAR), Length(2,false), Default(None) */
    val cstcalcperiod: Rep[Option[String]] = column[Option[String]]("CSTCALCPERIOD", O.Length(2,varying=false), O.Default(None))
    /** Database column CSTISCLAWBACK SqlType(CHAR), Length(2,false), Default(None) */
    val cstisclawback: Rep[Option[String]] = column[Option[String]]("CSTISCLAWBACK", O.Length(2,varying=false), O.Default(None))
    /** Database column CSTCTMTRFNUM SqlType(BIGINT), Default(None) */
    val cstctmtrfnum: Rep[Option[Long]] = column[Option[Long]]("CSTCTMTRFNUM", O.Default(None))
    /** Database column CSTPLANTYPE SqlType(CHAR), Length(3,false), Default(None) */
    val cstplantype: Rep[Option[String]] = column[Option[String]]("CSTPLANTYPE", O.Length(3,varying=false), O.Default(None))





    /** Foreign key referencing Fccomt (database name FK_FCCST_FCCOMT) */
    lazy val fccomtFk = foreignKey("FK_FCCST_FCCOMT", cstcomtrfnum, Fccomt)(r => Rep.Some(r.id), onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Fcctmt (database name FK_FCCST_FCCTMT) */
    lazy val fcctmtFk = foreignKey("FK_FCCST_FCCTMT", cstctmtrfnum, Fcctmt)(r => Rep.Some(r.id), onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Fcslmt (database name FK_FCCST_FCSLMT) */
    lazy val fcslmtFk = foreignKey("FK_FCCST_FCSLMT", cstslmtrfnum, Fcslmt)(r => Rep.Some(r.id), onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table Fccst */
  lazy val Fccst = new TableQuery(tag => new Fccst(tag))

  /** Entity class storing rows of table Fcctmt
   *  @param ctmtrfnum Database column CTMTRFNUM SqlType(BIGINT), AutoInc, PrimaryKey
   *  @param ctmtname Database column CTMTNAME SqlType(CHAR), Length(32,false)
   *  @param ctmtdescription Database column CTMTDESCRIPTION SqlType(VARCHAR), Length(256,true), Default(None)
   *  @param ctmtactive Database column CTMTACTIVE SqlType(CHAR), Length(2,false)
   *  @param ctmtparent Database column CTMTPARENT SqlType(CHAR), Length(2,false)
   *  @param ctmtctmtrfnum Database column CTMTCTMTRFNUM SqlType(BIGINT), Default(None)
   *  @param ctmtratingfrequency Database column CTMTRATINGFREQUENCY SqlType(CHAR), Length(2,false), Default(None)
   *  @param ctmtratingperiod Database column CTMTRATINGPERIOD SqlType(INT), Default(None)
   *  @param createdate 
   *  @param modifydate 
   *  @param createdby 
   *  @param lastmodifiedby  */
  case class FcctmtRow(id: Long, ctmtname: String, ctmtdescription: Option[String] = None, ctmtactive: String, ctmtparent: String, ctmtctmtrfnum: Option[Long] = None, ctmtratingfrequency: Option[String] = None, ctmtratingperiod: Option[Int] = None, createdate: Option[java.sql.Timestamp] = None, modifydate: java.sql.Timestamp, createdby: String, lastmodifiedby: String) extends BaseEntity 
  class FcctmtRowWrapper(id: Option[Long], ctmtname: String, ctmtdescription: Option[String] = None, ctmtactive: String, ctmtparent: String, ctmtctmtrfnum: Option[Long] = None, ctmtratingfrequency: Option[String] = None, ctmtratingperiod: Option[Int] = None) {
    def get(userName: String): FcctmtRow = {
      FcctmtRow(this.id.getOrElse(0), this.ctmtname, this.ctmtdescription, this.ctmtactive, this.ctmtparent, this.ctmtctmtrfnum, this.ctmtratingfrequency, this.ctmtratingperiod, Some(DateTimeUtils.getCurrentTimeStamp), DateTimeUtils.getCurrentTimeStamp, userName, userName)
  	}
  }
  /** GetResult implicit for fetching FcctmtRow objects using plain SQL queries */
  implicit def GetResultFcctmtRow(implicit e0: GR[Long], e1: GR[String], e2: GR[Option[String]], e3: GR[Option[Long]], e4: GR[Option[Int]], e5: GR[Option[java.sql.Timestamp]], e6: GR[java.sql.Timestamp]): GR[FcctmtRow] = GR{
    prs => import prs._
    FcctmtRow.tupled((<<[Long], <<[String], <<?[String], <<[String], <<[String], <<?[Long], <<?[String], <<?[Int], <<?[java.sql.Timestamp], <<[java.sql.Timestamp], <<[String], <<[String]))
  }
  /** Table description of table FCCTMT. Objects of this class serve as prototypes for rows in queries. */
  class Fcctmt(_tableTag: Tag) extends BaseTable[FcctmtRow](_tableTag, "FCCTMT") {
    def * = (id, ctmtname, ctmtdescription, ctmtactive, ctmtparent, ctmtctmtrfnum, ctmtratingfrequency, ctmtratingperiod, createdate, modifydate, createdby, lastmodifiedby) <> (FcctmtRow.tupled, FcctmtRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(ctmtname), ctmtdescription, Rep.Some(ctmtactive), Rep.Some(ctmtparent), ctmtctmtrfnum, ctmtratingfrequency, ctmtratingperiod, createdate, Rep.Some(modifydate), Rep.Some(createdby), Rep.Some(lastmodifiedby)).shaped.<>({r=>import r._; _1.map(_=> FcctmtRow.tupled((_1.get, _2.get, _3, _4.get, _5.get, _6, _7, _8, _9, _10.get, _11.get, _12.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column CTMTRFNUM SqlType(BIGINT), AutoInc, PrimaryKey */
    override val id: Rep[Long] = column[Long]("CTMTRFNUM", O.AutoInc, O.PrimaryKey)
    /** Database column CTMTNAME SqlType(CHAR), Length(32,false) */
    val ctmtname: Rep[String] = column[String]("CTMTNAME", O.Length(32,varying=false))
    /** Database column CTMTDESCRIPTION SqlType(VARCHAR), Length(256,true), Default(None) */
    val ctmtdescription: Rep[Option[String]] = column[Option[String]]("CTMTDESCRIPTION", O.Length(256,varying=true), O.Default(None))
    /** Database column CTMTACTIVE SqlType(CHAR), Length(2,false) */
    val ctmtactive: Rep[String] = column[String]("CTMTACTIVE", O.Length(2,varying=false))
    /** Database column CTMTPARENT SqlType(CHAR), Length(2,false) */
    val ctmtparent: Rep[String] = column[String]("CTMTPARENT", O.Length(2,varying=false))
    /** Database column CTMTCTMTRFNUM SqlType(BIGINT), Default(None) */
    val ctmtctmtrfnum: Rep[Option[Long]] = column[Option[Long]]("CTMTCTMTRFNUM", O.Default(None))
    /** Database column CTMTRATINGFREQUENCY SqlType(CHAR), Length(2,false), Default(None) */
    val ctmtratingfrequency: Rep[Option[String]] = column[Option[String]]("CTMTRATINGFREQUENCY", O.Length(2,varying=false), O.Default(None))
    /** Database column CTMTRATINGPERIOD SqlType(INT), Default(None) */
    val ctmtratingperiod: Rep[Option[Int]] = column[Option[Int]]("CTMTRATINGPERIOD", O.Default(None))





    /** Foreign key referencing Fcctmt (database name FK_FCCTMT_FCCTMT) */
    lazy val fcctmtFk = foreignKey("FK_FCCTMT_FCCTMT", ctmtctmtrfnum, Fcctmt)(r => Rep.Some(r.id), onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table Fcctmt */
  lazy val Fcctmt = new TableQuery(tag => new Fcctmt(tag))

  /** Entity class storing rows of table Fccyr
   *  @param cyrrfnum Database column CYRRFNUM SqlType(BIGINT), AutoInc, PrimaryKey
   *  @param cyryear Database column CYRYEAR SqlType(CHAR), Length(4,false)
   *  @param cyrreturn Database column CYRRETURN SqlType(DOUBLE)
   *  @param createdate 
   *  @param modifydate 
   *  @param createdby 
   *  @param lastmodifiedby  */
  case class FccyrRow(id: Long, cyryear: String, cyrreturn: Double, createdate: Option[java.sql.Timestamp] = None, modifydate: java.sql.Timestamp, createdby: String, lastmodifiedby: String) extends BaseEntity 
  class FccyrRowWrapper(id: Option[Long], cyryear: String, cyrreturn: Double) {
    def get(userName: String): FccyrRow = {
      FccyrRow(this.id.getOrElse(0), this.cyryear, this.cyrreturn, Some(DateTimeUtils.getCurrentTimeStamp), DateTimeUtils.getCurrentTimeStamp, userName, userName)
  	}
  }
  /** GetResult implicit for fetching FccyrRow objects using plain SQL queries */
  implicit def GetResultFccyrRow(implicit e0: GR[Long], e1: GR[String], e2: GR[Double], e3: GR[Option[java.sql.Timestamp]], e4: GR[java.sql.Timestamp]): GR[FccyrRow] = GR{
    prs => import prs._
    FccyrRow.tupled((<<[Long], <<[String], <<[Double], <<?[java.sql.Timestamp], <<[java.sql.Timestamp], <<[String], <<[String]))
  }
  /** Table description of table FCCYR. Objects of this class serve as prototypes for rows in queries. */
  class Fccyr(_tableTag: Tag) extends BaseTable[FccyrRow](_tableTag, "FCCYR") {
    def * = (id, cyryear, cyrreturn, createdate, modifydate, createdby, lastmodifiedby) <> (FccyrRow.tupled, FccyrRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(cyryear), Rep.Some(cyrreturn), createdate, Rep.Some(modifydate), Rep.Some(createdby), Rep.Some(lastmodifiedby)).shaped.<>({r=>import r._; _1.map(_=> FccyrRow.tupled((_1.get, _2.get, _3.get, _4, _5.get, _6.get, _7.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column CYRRFNUM SqlType(BIGINT), AutoInc, PrimaryKey */
    override val id: Rep[Long] = column[Long]("CYRRFNUM", O.AutoInc, O.PrimaryKey)
    /** Database column CYRYEAR SqlType(CHAR), Length(4,false) */
    val cyryear: Rep[String] = column[String]("CYRYEAR", O.Length(4,varying=false))
    /** Database column CYRRETURN SqlType(DOUBLE) */
    val cyrreturn: Rep[Double] = column[Double]("CYRRETURN")
  }
  /** Collection-like TableQuery object for table Fccyr */
  lazy val Fccyr = new TableQuery(tag => new Fccyr(tag))

  /** Entity class storing rows of table Fcdam
   *  @param damrfnum Database column DAMRFNUM SqlType(BIGINT), AutoInc, PrimaryKey
   *  @param damname Database column DAMNAME SqlType(VARCHAR), Length(128,true)
   *  @param damactive Database column DAMACTIVE SqlType(CHAR), Length(2,false)
   *  @param damdescription Database column DAMDESCRIPTION SqlType(VARCHAR), Length(256,true), Default(None)
   *  @param damextrafield1 Database column DAMEXTRAFIELD1 SqlType(VARCHAR), Length(128,true), Default(None)
   *  @param damextrafield2 Database column DAMEXTRAFIELD2 SqlType(VARCHAR), Length(128,true), Default(None)
   *  @param damextrafield3 Database column DAMEXTRAFIELD3 SqlType(VARCHAR), Length(128,true), Default(None)
   *  @param damextrafield4 Database column DAMEXTRAFIELD4 SqlType(VARCHAR), Length(128,true), Default(None)
   *  @param createdate 
   *  @param modifydate 
   *  @param createdby 
   *  @param lastmodifiedby  */
  case class FcdamRow(id: Long, damname: String, damactive: String, damdescription: Option[String] = None, damextrafield1: Option[String] = None, damextrafield2: Option[String] = None, damextrafield3: Option[String] = None, damextrafield4: Option[String] = None, createdate: Option[java.sql.Timestamp] = None, modifydate: java.sql.Timestamp, createdby: String, lastmodifiedby: String) extends BaseEntity 
  class FcdamRowWrapper(id: Option[Long], damname: String, damactive: String, damdescription: Option[String] = None, damextrafield1: Option[String] = None, damextrafield2: Option[String] = None, damextrafield3: Option[String] = None, damextrafield4: Option[String] = None) {
    def get(userName: String): FcdamRow = {
      FcdamRow(this.id.getOrElse(0), this.damname, this.damactive, this.damdescription, this.damextrafield1, this.damextrafield2, this.damextrafield3, this.damextrafield4, Some(DateTimeUtils.getCurrentTimeStamp), DateTimeUtils.getCurrentTimeStamp, userName, userName)
  	}
  }
  /** GetResult implicit for fetching FcdamRow objects using plain SQL queries */
  implicit def GetResultFcdamRow(implicit e0: GR[Long], e1: GR[String], e2: GR[Option[String]], e3: GR[Option[java.sql.Timestamp]], e4: GR[java.sql.Timestamp]): GR[FcdamRow] = GR{
    prs => import prs._
    FcdamRow.tupled((<<[Long], <<[String], <<[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[java.sql.Timestamp], <<[java.sql.Timestamp], <<[String], <<[String]))
  }
  /** Table description of table FCDAM. Objects of this class serve as prototypes for rows in queries. */
  class Fcdam(_tableTag: Tag) extends BaseTable[FcdamRow](_tableTag, "FCDAM") {
    def * = (id, damname, damactive, damdescription, damextrafield1, damextrafield2, damextrafield3, damextrafield4, createdate, modifydate, createdby, lastmodifiedby) <> (FcdamRow.tupled, FcdamRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(damname), Rep.Some(damactive), damdescription, damextrafield1, damextrafield2, damextrafield3, damextrafield4, createdate, Rep.Some(modifydate), Rep.Some(createdby), Rep.Some(lastmodifiedby)).shaped.<>({r=>import r._; _1.map(_=> FcdamRow.tupled((_1.get, _2.get, _3.get, _4, _5, _6, _7, _8, _9, _10.get, _11.get, _12.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column DAMRFNUM SqlType(BIGINT), AutoInc, PrimaryKey */
    override val id: Rep[Long] = column[Long]("DAMRFNUM", O.AutoInc, O.PrimaryKey)
    /** Database column DAMNAME SqlType(VARCHAR), Length(128,true) */
    val damname: Rep[String] = column[String]("DAMNAME", O.Length(128,varying=true))
    /** Database column DAMACTIVE SqlType(CHAR), Length(2,false) */
    val damactive: Rep[String] = column[String]("DAMACTIVE", O.Length(2,varying=false))
    /** Database column DAMDESCRIPTION SqlType(VARCHAR), Length(256,true), Default(None) */
    val damdescription: Rep[Option[String]] = column[Option[String]]("DAMDESCRIPTION", O.Length(256,varying=true), O.Default(None))
    /** Database column DAMEXTRAFIELD1 SqlType(VARCHAR), Length(128,true), Default(None) */
    val damextrafield1: Rep[Option[String]] = column[Option[String]]("DAMEXTRAFIELD1", O.Length(128,varying=true), O.Default(None))
    /** Database column DAMEXTRAFIELD2 SqlType(VARCHAR), Length(128,true), Default(None) */
    val damextrafield2: Rep[Option[String]] = column[Option[String]]("DAMEXTRAFIELD2", O.Length(128,varying=true), O.Default(None))
    /** Database column DAMEXTRAFIELD3 SqlType(VARCHAR), Length(128,true), Default(None) */
    val damextrafield3: Rep[Option[String]] = column[Option[String]]("DAMEXTRAFIELD3", O.Length(128,varying=true), O.Default(None))
    /** Database column DAMEXTRAFIELD4 SqlType(VARCHAR), Length(128,true), Default(None) */
    val damextrafield4: Rep[Option[String]] = column[Option[String]]("DAMEXTRAFIELD4", O.Length(128,varying=true), O.Default(None))
  }
  /** Collection-like TableQuery object for table Fcdam */
  lazy val Fcdam = new TableQuery(tag => new Fcdam(tag))

  /** Entity class storing rows of table Fcdbd
   *  @param dbdrfnum Database column DBDRFNUM SqlType(BIGINT), AutoInc, PrimaryKey
   *  @param dbdbenrfnum Database column DBDBENRFNUM SqlType(BIGINT)
   *  @param dbdprice Database column DBDPRICE SqlType(DOUBLE)
   *  @param dbdperatio Database column DBDPERATIO SqlType(FLOAT)
   *  @param dbdpbratio Database column DBDPBRATIO SqlType(FLOAT)
   *  @param createdate 
   *  @param modifydate 
   *  @param createdby 
   *  @param lastmodifiedby  */
  case class FcdbdRow(id: Long, dbdbenrfnum: Long, dbdprice: Double, dbdperatio: Float, dbdpbratio: Float, createdate: Option[java.sql.Timestamp] = None, modifydate: java.sql.Timestamp, createdby: String, lastmodifiedby: String) extends BaseEntity 
  class FcdbdRowWrapper(id: Option[Long], dbdbenrfnum: Long, dbdprice: Double, dbdperatio: Float, dbdpbratio: Float) {
    def get(userName: String): FcdbdRow = {
      FcdbdRow(this.id.getOrElse(0), this.dbdbenrfnum, this.dbdprice, this.dbdperatio, this.dbdpbratio, Some(DateTimeUtils.getCurrentTimeStamp), DateTimeUtils.getCurrentTimeStamp, userName, userName)
  	}
  }
  /** GetResult implicit for fetching FcdbdRow objects using plain SQL queries */
  implicit def GetResultFcdbdRow(implicit e0: GR[Long], e1: GR[Double], e2: GR[Float], e3: GR[Option[java.sql.Timestamp]], e4: GR[java.sql.Timestamp], e5: GR[String]): GR[FcdbdRow] = GR{
    prs => import prs._
    FcdbdRow.tupled((<<[Long], <<[Long], <<[Double], <<[Float], <<[Float], <<?[java.sql.Timestamp], <<[java.sql.Timestamp], <<[String], <<[String]))
  }
  /** Table description of table FCDBD. Objects of this class serve as prototypes for rows in queries. */
  class Fcdbd(_tableTag: Tag) extends BaseTable[FcdbdRow](_tableTag, "FCDBD") {
    def * = (id, dbdbenrfnum, dbdprice, dbdperatio, dbdpbratio, createdate, modifydate, createdby, lastmodifiedby) <> (FcdbdRow.tupled, FcdbdRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(dbdbenrfnum), Rep.Some(dbdprice), Rep.Some(dbdperatio), Rep.Some(dbdpbratio), createdate, Rep.Some(modifydate), Rep.Some(createdby), Rep.Some(lastmodifiedby)).shaped.<>({r=>import r._; _1.map(_=> FcdbdRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6, _7.get, _8.get, _9.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column DBDRFNUM SqlType(BIGINT), AutoInc, PrimaryKey */
    override val id: Rep[Long] = column[Long]("DBDRFNUM", O.AutoInc, O.PrimaryKey)
    /** Database column DBDBENRFNUM SqlType(BIGINT) */
    val dbdbenrfnum: Rep[Long] = column[Long]("DBDBENRFNUM")
    /** Database column DBDPRICE SqlType(DOUBLE) */
    val dbdprice: Rep[Double] = column[Double]("DBDPRICE")
    /** Database column DBDPERATIO SqlType(FLOAT) */
    val dbdperatio: Rep[Float] = column[Float]("DBDPERATIO")
    /** Database column DBDPBRATIO SqlType(FLOAT) */
    val dbdpbratio: Rep[Float] = column[Float]("DBDPBRATIO")





    /** Foreign key referencing Fcben (database name FK_FCDBD_FCBEN) */
    lazy val fcbenFk = foreignKey("FK_FCDBD_FCBEN", dbdbenrfnum, Fcben)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table Fcdbd */
  lazy val Fcdbd = new TableQuery(tag => new Fcdbd(tag))

  /** Entity class storing rows of table Fcdbr
   *  @param dbrrfnum Database column DBRRFNUM SqlType(BIGINT), AutoInc, PrimaryKey
   *  @param dbrdbdrfnum Database column DBRDBDRFNUM SqlType(BIGINT)
   *  @param dbrreturnvalue Database column DBRRETURNVALUE SqlType(DOUBLE)
   *  @param dbrreturnperiod Database column DBRRETURNPERIOD SqlType(INT)
   *  @param dbrreturnunit Database column DBRRETURNUNIT SqlType(CHAR), Length(2,false)
   *  @param createdate 
   *  @param modifydate 
   *  @param createdby 
   *  @param lastmodifiedby  */
  case class FcdbrRow(id: Long, dbrdbdrfnum: Long, dbrreturnvalue: Double, dbrreturnperiod: Int, dbrreturnunit: String, createdate: Option[java.sql.Timestamp] = None, modifydate: java.sql.Timestamp, createdby: String, lastmodifiedby: String) extends BaseEntity 
  class FcdbrRowWrapper(id: Option[Long], dbrdbdrfnum: Long, dbrreturnvalue: Double, dbrreturnperiod: Int, dbrreturnunit: String) {
    def get(userName: String): FcdbrRow = {
      FcdbrRow(this.id.getOrElse(0), this.dbrdbdrfnum, this.dbrreturnvalue, this.dbrreturnperiod, this.dbrreturnunit, Some(DateTimeUtils.getCurrentTimeStamp), DateTimeUtils.getCurrentTimeStamp, userName, userName)
  	}
  }
  /** GetResult implicit for fetching FcdbrRow objects using plain SQL queries */
  implicit def GetResultFcdbrRow(implicit e0: GR[Long], e1: GR[Double], e2: GR[Int], e3: GR[String], e4: GR[Option[java.sql.Timestamp]], e5: GR[java.sql.Timestamp]): GR[FcdbrRow] = GR{
    prs => import prs._
    FcdbrRow.tupled((<<[Long], <<[Long], <<[Double], <<[Int], <<[String], <<?[java.sql.Timestamp], <<[java.sql.Timestamp], <<[String], <<[String]))
  }
  /** Table description of table FCDBR. Objects of this class serve as prototypes for rows in queries. */
  class Fcdbr(_tableTag: Tag) extends BaseTable[FcdbrRow](_tableTag, "FCDBR") {
    def * = (id, dbrdbdrfnum, dbrreturnvalue, dbrreturnperiod, dbrreturnunit, createdate, modifydate, createdby, lastmodifiedby) <> (FcdbrRow.tupled, FcdbrRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(dbrdbdrfnum), Rep.Some(dbrreturnvalue), Rep.Some(dbrreturnperiod), Rep.Some(dbrreturnunit), createdate, Rep.Some(modifydate), Rep.Some(createdby), Rep.Some(lastmodifiedby)).shaped.<>({r=>import r._; _1.map(_=> FcdbrRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6, _7.get, _8.get, _9.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column DBRRFNUM SqlType(BIGINT), AutoInc, PrimaryKey */
    override val id: Rep[Long] = column[Long]("DBRRFNUM", O.AutoInc, O.PrimaryKey)
    /** Database column DBRDBDRFNUM SqlType(BIGINT) */
    val dbrdbdrfnum: Rep[Long] = column[Long]("DBRDBDRFNUM")
    /** Database column DBRRETURNVALUE SqlType(DOUBLE) */
    val dbrreturnvalue: Rep[Double] = column[Double]("DBRRETURNVALUE")
    /** Database column DBRRETURNPERIOD SqlType(INT) */
    val dbrreturnperiod: Rep[Int] = column[Int]("DBRRETURNPERIOD")
    /** Database column DBRRETURNUNIT SqlType(CHAR), Length(2,false) */
    val dbrreturnunit: Rep[String] = column[String]("DBRRETURNUNIT", O.Length(2,varying=false))





    /** Foreign key referencing Fcdbd (database name FK_FCDBR_FCDBD) */
    lazy val fcdbdFk = foreignKey("FK_FCDBR_FCDBD", dbrdbdrfnum, Fcdbd)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table Fcdbr */
  lazy val Fcdbr = new TableQuery(tag => new Fcdbr(tag))

  /** Entity class storing rows of table Fcdmt
   *  @param dmtrfnum Database column DMTRFNUM SqlType(BIGINT), AutoInc, PrimaryKey
   *  @param dmtcndtyperfnum Database column DMTCNDTYPERFNUM SqlType(BIGINT)
   *  @param dmtpath Database column DMTPATH SqlType(VARCHAR), Length(256,true), Default(None)
   *  @param dmtbackuppath Database column DMTBACKUPPATH SqlType(VARCHAR), Length(256,true), Default(None)
   *  @param dmtissuauthority Database column DMTISSUAUTHORITY SqlType(VARCHAR), Length(128,true), Default(None)
   *  @param dmtissuedate Database column DMTISSUEDATE SqlType(DATE), Default(None)
   *  @param dmtdocvalidity Database column DMTDOCVALIDITY SqlType(DATE), Default(None)
   *  @param createdate 
   *  @param modifydate 
   *  @param createdby 
   *  @param lastmodifiedby  */
  case class FcdmtRow(id: Long, dmtcndtyperfnum: Long, dmtpath: Option[String] = None, dmtbackuppath: Option[String] = None, dmtissuauthority: Option[String] = None, dmtissuedate: Option[java.sql.Date] = None, dmtdocvalidity: Option[java.sql.Date] = None, createdate: Option[java.sql.Timestamp] = None, modifydate: java.sql.Timestamp, createdby: String, lastmodifiedby: String) extends BaseEntity 
  class FcdmtRowWrapper(id: Option[Long], dmtcndtyperfnum: Long, dmtpath: Option[String] = None, dmtbackuppath: Option[String] = None, dmtissuauthority: Option[String] = None, dmtissuedate: Option[java.sql.Date] = None, dmtdocvalidity: Option[java.sql.Date] = None) {
    def get(userName: String): FcdmtRow = {
      FcdmtRow(this.id.getOrElse(0), this.dmtcndtyperfnum, this.dmtpath, this.dmtbackuppath, this.dmtissuauthority, this.dmtissuedate, this.dmtdocvalidity, Some(DateTimeUtils.getCurrentTimeStamp), DateTimeUtils.getCurrentTimeStamp, userName, userName)
  	}
  }
  /** GetResult implicit for fetching FcdmtRow objects using plain SQL queries */
  implicit def GetResultFcdmtRow(implicit e0: GR[Long], e1: GR[Option[String]], e2: GR[Option[java.sql.Date]], e3: GR[Option[java.sql.Timestamp]], e4: GR[java.sql.Timestamp], e5: GR[String]): GR[FcdmtRow] = GR{
    prs => import prs._
    FcdmtRow.tupled((<<[Long], <<[Long], <<?[String], <<?[String], <<?[String], <<?[java.sql.Date], <<?[java.sql.Date], <<?[java.sql.Timestamp], <<[java.sql.Timestamp], <<[String], <<[String]))
  }
  /** Table description of table FCDMT. Objects of this class serve as prototypes for rows in queries. */
  class Fcdmt(_tableTag: Tag) extends BaseTable[FcdmtRow](_tableTag, "FCDMT") {
    def * = (id, dmtcndtyperfnum, dmtpath, dmtbackuppath, dmtissuauthority, dmtissuedate, dmtdocvalidity, createdate, modifydate, createdby, lastmodifiedby) <> (FcdmtRow.tupled, FcdmtRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(dmtcndtyperfnum), dmtpath, dmtbackuppath, dmtissuauthority, dmtissuedate, dmtdocvalidity, createdate, Rep.Some(modifydate), Rep.Some(createdby), Rep.Some(lastmodifiedby)).shaped.<>({r=>import r._; _1.map(_=> FcdmtRow.tupled((_1.get, _2.get, _3, _4, _5, _6, _7, _8, _9.get, _10.get, _11.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column DMTRFNUM SqlType(BIGINT), AutoInc, PrimaryKey */
    override val id: Rep[Long] = column[Long]("DMTRFNUM", O.AutoInc, O.PrimaryKey)
    /** Database column DMTCNDTYPERFNUM SqlType(BIGINT) */
    val dmtcndtyperfnum: Rep[Long] = column[Long]("DMTCNDTYPERFNUM")
    /** Database column DMTPATH SqlType(VARCHAR), Length(256,true), Default(None) */
    val dmtpath: Rep[Option[String]] = column[Option[String]]("DMTPATH", O.Length(256,varying=true), O.Default(None))
    /** Database column DMTBACKUPPATH SqlType(VARCHAR), Length(256,true), Default(None) */
    val dmtbackuppath: Rep[Option[String]] = column[Option[String]]("DMTBACKUPPATH", O.Length(256,varying=true), O.Default(None))
    /** Database column DMTISSUAUTHORITY SqlType(VARCHAR), Length(128,true), Default(None) */
    val dmtissuauthority: Rep[Option[String]] = column[Option[String]]("DMTISSUAUTHORITY", O.Length(128,varying=true), O.Default(None))
    /** Database column DMTISSUEDATE SqlType(DATE), Default(None) */
    val dmtissuedate: Rep[Option[java.sql.Date]] = column[Option[java.sql.Date]]("DMTISSUEDATE", O.Default(None))
    /** Database column DMTDOCVALIDITY SqlType(DATE), Default(None) */
    val dmtdocvalidity: Rep[Option[java.sql.Date]] = column[Option[java.sql.Date]]("DMTDOCVALIDITY", O.Default(None))





    /** Foreign key referencing Fccnd (database name FK_FCDMT_FCCND) */
    lazy val fccndFk = foreignKey("FK_FCDMT_FCCND", dmtcndtyperfnum, Fccnd)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)

    /** Index over (dmtissuauthority) (database name IXFK_FCDMT_FCCND_02) */
    val index1 = index("IXFK_FCDMT_FCCND_02", dmtissuauthority)
  }
  /** Collection-like TableQuery object for table Fcdmt */
  lazy val Fcdmt = new TableQuery(tag => new Fcdmt(tag))

  /** Entity class storing rows of table Fcdpc
   *  @param dpcrfnum Database column DPCRFNUM SqlType(BIGINT), AutoInc, PrimaryKey
   *  @param dpcctmtrfnum Database column DPCCTMTRFNUM SqlType(BIGINT)
   *  @param dpccategoryname Database column DPCCATEGORYNAME SqlType(VARCHAR), Length(32,true)
   *  @param dpcactive Database column DPCACTIVE SqlType(CHAR), Length(2,false)
   *  @param dpcdamrfnum Database column DPCDAMRFNUM SqlType(BIGINT)
   *  @param createdate 
   *  @param modifydate 
   *  @param createdby 
   *  @param lastmodifiedby  */
  case class FcdpcRow(id: Long, dpcctmtrfnum: Long, dpccategoryname: String, dpcactive: String, dpcdamrfnum: Long, createdate: Option[java.sql.Timestamp] = None, modifydate: java.sql.Timestamp, createdby: String, lastmodifiedby: String) extends BaseEntity 
  class FcdpcRowWrapper(id: Option[Long], dpcctmtrfnum: Long, dpccategoryname: String, dpcactive: String, dpcdamrfnum: Long) {
    def get(userName: String): FcdpcRow = {
      FcdpcRow(this.id.getOrElse(0), this.dpcctmtrfnum, this.dpccategoryname, this.dpcactive, this.dpcdamrfnum, Some(DateTimeUtils.getCurrentTimeStamp), DateTimeUtils.getCurrentTimeStamp, userName, userName)
  	}
  }
  /** GetResult implicit for fetching FcdpcRow objects using plain SQL queries */
  implicit def GetResultFcdpcRow(implicit e0: GR[Long], e1: GR[String], e2: GR[Option[java.sql.Timestamp]], e3: GR[java.sql.Timestamp]): GR[FcdpcRow] = GR{
    prs => import prs._
    FcdpcRow.tupled((<<[Long], <<[Long], <<[String], <<[String], <<[Long], <<?[java.sql.Timestamp], <<[java.sql.Timestamp], <<[String], <<[String]))
  }
  /** Table description of table FCDPC. Objects of this class serve as prototypes for rows in queries. */
  class Fcdpc(_tableTag: Tag) extends BaseTable[FcdpcRow](_tableTag, "FCDPC") {
    def * = (id, dpcctmtrfnum, dpccategoryname, dpcactive, dpcdamrfnum, createdate, modifydate, createdby, lastmodifiedby) <> (FcdpcRow.tupled, FcdpcRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(dpcctmtrfnum), Rep.Some(dpccategoryname), Rep.Some(dpcactive), Rep.Some(dpcdamrfnum), createdate, Rep.Some(modifydate), Rep.Some(createdby), Rep.Some(lastmodifiedby)).shaped.<>({r=>import r._; _1.map(_=> FcdpcRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6, _7.get, _8.get, _9.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column DPCRFNUM SqlType(BIGINT), AutoInc, PrimaryKey */
    override val id: Rep[Long] = column[Long]("DPCRFNUM", O.AutoInc, O.PrimaryKey)
    /** Database column DPCCTMTRFNUM SqlType(BIGINT) */
    val dpcctmtrfnum: Rep[Long] = column[Long]("DPCCTMTRFNUM")
    /** Database column DPCCATEGORYNAME SqlType(VARCHAR), Length(32,true) */
    val dpccategoryname: Rep[String] = column[String]("DPCCATEGORYNAME", O.Length(32,varying=true))
    /** Database column DPCACTIVE SqlType(CHAR), Length(2,false) */
    val dpcactive: Rep[String] = column[String]("DPCACTIVE", O.Length(2,varying=false))
    /** Database column DPCDAMRFNUM SqlType(BIGINT) */
    val dpcdamrfnum: Rep[Long] = column[Long]("DPCDAMRFNUM")





    /** Foreign key referencing Fcctmt (database name FK_FCDPC_FCCTMT) */
    lazy val fcctmtFk = foreignKey("FK_FCDPC_FCCTMT", dpcctmtrfnum, Fcctmt)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Fcdam (database name FK_FCDPC_FCDAM) */
    lazy val fcdamFk = foreignKey("FK_FCDPC_FCDAM", dpcdamrfnum, Fcdam)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table Fcdpc */
  lazy val Fcdpc = new TableQuery(tag => new Fcdpc(tag))

  /** Entity class storing rows of table Fcdrd
   *  @param drdrfnum Database column DRDRFNUM SqlType(BIGINT), AutoInc, PrimaryKey
   *  @param drddsarfnum Database column DRDDSARFNUM SqlType(BIGINT)
   *  @param drdreturnvalue Database column DRDRETURNVALUE SqlType(FLOAT)
   *  @param drdreturnperiod Database column DRDRETURNPERIOD SqlType(INT)
   *  @param drdreturnasofdate Database column DRDRETURNASOFDATE SqlType(DATE), Default(None)
   *  @param drdreturnunit Database column DRDRETURNUNIT SqlType(CHAR), Length(2,false)
   *  @param createdate 
   *  @param modifydate 
   *  @param createdby 
   *  @param lastmodifiedby  */
  case class FcdrdRow(id: Long, drddsarfnum: Long, drdreturnvalue: Float, drdreturnperiod: Int, drdreturnasofdate: Option[java.sql.Date] = None, drdreturnunit: String, createdate: Option[java.sql.Timestamp] = None, modifydate: java.sql.Timestamp, createdby: String, lastmodifiedby: String) extends BaseEntity 
  class FcdrdRowWrapper(id: Option[Long], drddsarfnum: Long, drdreturnvalue: Float, drdreturnperiod: Int, drdreturnasofdate: Option[java.sql.Date] = None, drdreturnunit: String) {
    def get(userName: String): FcdrdRow = {
      FcdrdRow(this.id.getOrElse(0), this.drddsarfnum, this.drdreturnvalue, this.drdreturnperiod, this.drdreturnasofdate, this.drdreturnunit, Some(DateTimeUtils.getCurrentTimeStamp), DateTimeUtils.getCurrentTimeStamp, userName, userName)
  	}
  }
  /** GetResult implicit for fetching FcdrdRow objects using plain SQL queries */
  implicit def GetResultFcdrdRow(implicit e0: GR[Long], e1: GR[Float], e2: GR[Int], e3: GR[Option[java.sql.Date]], e4: GR[String], e5: GR[Option[java.sql.Timestamp]], e6: GR[java.sql.Timestamp]): GR[FcdrdRow] = GR{
    prs => import prs._
    FcdrdRow.tupled((<<[Long], <<[Long], <<[Float], <<[Int], <<?[java.sql.Date], <<[String], <<?[java.sql.Timestamp], <<[java.sql.Timestamp], <<[String], <<[String]))
  }
  /** Table description of table FCDRD. Objects of this class serve as prototypes for rows in queries. */
  class Fcdrd(_tableTag: Tag) extends BaseTable[FcdrdRow](_tableTag, "FCDRD") {
    def * = (id, drddsarfnum, drdreturnvalue, drdreturnperiod, drdreturnasofdate, drdreturnunit, createdate, modifydate, createdby, lastmodifiedby) <> (FcdrdRow.tupled, FcdrdRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(drddsarfnum), Rep.Some(drdreturnvalue), Rep.Some(drdreturnperiod), drdreturnasofdate, Rep.Some(drdreturnunit), createdate, Rep.Some(modifydate), Rep.Some(createdby), Rep.Some(lastmodifiedby)).shaped.<>({r=>import r._; _1.map(_=> FcdrdRow.tupled((_1.get, _2.get, _3.get, _4.get, _5, _6.get, _7, _8.get, _9.get, _10.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column DRDRFNUM SqlType(BIGINT), AutoInc, PrimaryKey */
    override val id: Rep[Long] = column[Long]("DRDRFNUM", O.AutoInc, O.PrimaryKey)
    /** Database column DRDDSARFNUM SqlType(BIGINT) */
    val drddsarfnum: Rep[Long] = column[Long]("DRDDSARFNUM")
    /** Database column DRDRETURNVALUE SqlType(FLOAT) */
    val drdreturnvalue: Rep[Float] = column[Float]("DRDRETURNVALUE")
    /** Database column DRDRETURNPERIOD SqlType(INT) */
    val drdreturnperiod: Rep[Int] = column[Int]("DRDRETURNPERIOD")
    /** Database column DRDRETURNASOFDATE SqlType(DATE), Default(None) */
    val drdreturnasofdate: Rep[Option[java.sql.Date]] = column[Option[java.sql.Date]]("DRDRETURNASOFDATE", O.Default(None))
    /** Database column DRDRETURNUNIT SqlType(CHAR), Length(2,false) */
    val drdreturnunit: Rep[String] = column[String]("DRDRETURNUNIT", O.Length(2,varying=false))





    /** Foreign key referencing Fcdsa (database name FK_FCDRD_FCDSA) */
    lazy val fcdsaFk = foreignKey("FK_FCDRD_FCDSA", drddsarfnum, Fcdsa)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table Fcdrd */
  lazy val Fcdrd = new TableQuery(tag => new Fcdrd(tag))

  /** Entity class storing rows of table Fcdrqp
   *  @param drqprfnum Database column DRQPRFNUM SqlType(BIGINT), AutoInc, PrimaryKey
   *  @param drqpimtrfnum Database column DRQPIMTRFNUM SqlType(BIGINT)
   *  @param drqpparaname Database column DRQPPARANAME SqlType(VARCHAR), Length(256,true)
   *  @param drqpparavalue Database column DRQPPARAVALUE SqlType(VARCHAR), Length(256,true)
   *  @param createdate 
   *  @param modifydate 
   *  @param createdby 
   *  @param lastmodifiedby  */
  case class FcdrqpRow(id: Long, drqpimtrfnum: Long, drqpparaname: String, drqpparavalue: String, createdate: Option[java.sql.Timestamp] = None, modifydate: java.sql.Timestamp, createdby: String, lastmodifiedby: String) extends BaseEntity 
  class FcdrqpRowWrapper(id: Option[Long], drqpimtrfnum: Long, drqpparaname: String, drqpparavalue: String) {
    def get(userName: String): FcdrqpRow = {
      FcdrqpRow(this.id.getOrElse(0), this.drqpimtrfnum, this.drqpparaname, this.drqpparavalue, Some(DateTimeUtils.getCurrentTimeStamp), DateTimeUtils.getCurrentTimeStamp, userName, userName)
  	}
  }
  /** GetResult implicit for fetching FcdrqpRow objects using plain SQL queries */
  implicit def GetResultFcdrqpRow(implicit e0: GR[Long], e1: GR[String], e2: GR[Option[java.sql.Timestamp]], e3: GR[java.sql.Timestamp]): GR[FcdrqpRow] = GR{
    prs => import prs._
    FcdrqpRow.tupled((<<[Long], <<[Long], <<[String], <<[String], <<?[java.sql.Timestamp], <<[java.sql.Timestamp], <<[String], <<[String]))
  }
  /** Table description of table FCDRQP. Objects of this class serve as prototypes for rows in queries. */
  class Fcdrqp(_tableTag: Tag) extends BaseTable[FcdrqpRow](_tableTag, "FCDRQP") {
    def * = (id, drqpimtrfnum, drqpparaname, drqpparavalue, createdate, modifydate, createdby, lastmodifiedby) <> (FcdrqpRow.tupled, FcdrqpRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(drqpimtrfnum), Rep.Some(drqpparaname), Rep.Some(drqpparavalue), createdate, Rep.Some(modifydate), Rep.Some(createdby), Rep.Some(lastmodifiedby)).shaped.<>({r=>import r._; _1.map(_=> FcdrqpRow.tupled((_1.get, _2.get, _3.get, _4.get, _5, _6.get, _7.get, _8.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column DRQPRFNUM SqlType(BIGINT), AutoInc, PrimaryKey */
    override val id: Rep[Long] = column[Long]("DRQPRFNUM", O.AutoInc, O.PrimaryKey)
    /** Database column DRQPIMTRFNUM SqlType(BIGINT) */
    val drqpimtrfnum: Rep[Long] = column[Long]("DRQPIMTRFNUM")
    /** Database column DRQPPARANAME SqlType(VARCHAR), Length(256,true) */
    val drqpparaname: Rep[String] = column[String]("DRQPPARANAME", O.Length(256,varying=true))
    /** Database column DRQPPARAVALUE SqlType(VARCHAR), Length(256,true) */
    val drqpparavalue: Rep[String] = column[String]("DRQPPARAVALUE", O.Length(256,varying=true))





    /** Foreign key referencing Fcimt (database name FK_FCDRQP_FCIMT) */
    lazy val fcimtFk = foreignKey("FK_FCDRQP_FCIMT", drqpimtrfnum, Fcimt)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table Fcdrqp */
  lazy val Fcdrqp = new TableQuery(tag => new Fcdrqp(tag))

  /** Entity class storing rows of table Fcdsa
   *  @param dsarfnum Database column DSARFNUM SqlType(BIGINT), AutoInc, PrimaryKey
   *  @param dsadamrfnum Database column DSADAMRFNUM SqlType(BIGINT)
   *  @param dsasoptrfnum Database column DSASOPTRFNUM SqlType(BIGINT)
   *  @param dsaexternalid1 Database column DSAEXTERNALID1 SqlType(VARCHAR), Length(32,true), Default(None)
   *  @param dsaexternalid2 Database column DSAEXTERNALID2 SqlType(VARCHAR), Length(32,true), Default(None)
   *  @param dsaexternalid3 Database column DSAEXTERNALID3 SqlType(VARCHAR), Length(32,true), Default(None)
   *  @param dsaexternalid4 Database column DSAEXTERNALID4 SqlType(VARCHAR), Length(32,true), Default(None)
   *  @param dsaexternalid5 Database column DSAEXTERNALID5 SqlType(VARCHAR), Length(32,true), Default(None)
   *  @param dsaexternalid6 Database column DSAEXTERNALID6 SqlType(VARCHAR), Length(32,true), Default(None)
   *  @param dsaexternalid7 Database column DSAEXTERNALID7 SqlType(VARCHAR), Length(32,true), Default(None)
   *  @param dsaexternalid8 Database column DSAEXTERNALID8 SqlType(VARCHAR), Length(32,true), Default(None)
   *  @param createdate 
   *  @param modifydate 
   *  @param createdby 
   *  @param lastmodifiedby  */
  case class FcdsaRow(id: Long, dsadamrfnum: Long, dsasoptrfnum: Long, dsaexternalid1: Option[String] = None, dsaexternalid2: Option[String] = None, dsaexternalid3: Option[String] = None, dsaexternalid4: Option[String] = None, dsaexternalid5: Option[String] = None, dsaexternalid6: Option[String] = None, dsaexternalid7: Option[String] = None, dsaexternalid8: Option[String] = None, createdate: Option[java.sql.Timestamp] = None, modifydate: java.sql.Timestamp, createdby: String, lastmodifiedby: String) extends BaseEntity 
  class FcdsaRowWrapper(id: Option[Long], dsadamrfnum: Long, dsasoptrfnum: Long, dsaexternalid1: Option[String] = None, dsaexternalid2: Option[String] = None, dsaexternalid3: Option[String] = None, dsaexternalid4: Option[String] = None, dsaexternalid5: Option[String] = None, dsaexternalid6: Option[String] = None, dsaexternalid7: Option[String] = None, dsaexternalid8: Option[String] = None) {
    def get(userName: String): FcdsaRow = {
      FcdsaRow(this.id.getOrElse(0), this.dsadamrfnum, this.dsasoptrfnum, this.dsaexternalid1, this.dsaexternalid2, this.dsaexternalid3, this.dsaexternalid4, this.dsaexternalid5, this.dsaexternalid6, this.dsaexternalid7, this.dsaexternalid8, Some(DateTimeUtils.getCurrentTimeStamp), DateTimeUtils.getCurrentTimeStamp, userName, userName)
  	}
  }
  /** GetResult implicit for fetching FcdsaRow objects using plain SQL queries */
  implicit def GetResultFcdsaRow(implicit e0: GR[Long], e1: GR[Option[String]], e2: GR[Option[java.sql.Timestamp]], e3: GR[java.sql.Timestamp], e4: GR[String]): GR[FcdsaRow] = GR{
    prs => import prs._
    FcdsaRow.tupled((<<[Long], <<[Long], <<[Long], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[java.sql.Timestamp], <<[java.sql.Timestamp], <<[String], <<[String]))
  }
  /** Table description of table FCDSA. Objects of this class serve as prototypes for rows in queries. */
  class Fcdsa(_tableTag: Tag) extends BaseTable[FcdsaRow](_tableTag, "FCDSA") {
    def * = (id, dsadamrfnum, dsasoptrfnum, dsaexternalid1, dsaexternalid2, dsaexternalid3, dsaexternalid4, dsaexternalid5, dsaexternalid6, dsaexternalid7, dsaexternalid8, createdate, modifydate, createdby, lastmodifiedby) <> (FcdsaRow.tupled, FcdsaRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(dsadamrfnum), Rep.Some(dsasoptrfnum), dsaexternalid1, dsaexternalid2, dsaexternalid3, dsaexternalid4, dsaexternalid5, dsaexternalid6, dsaexternalid7, dsaexternalid8, createdate, Rep.Some(modifydate), Rep.Some(createdby), Rep.Some(lastmodifiedby)).shaped.<>({r=>import r._; _1.map(_=> FcdsaRow.tupled((_1.get, _2.get, _3.get, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13.get, _14.get, _15.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column DSARFNUM SqlType(BIGINT), AutoInc, PrimaryKey */
    override val id: Rep[Long] = column[Long]("DSARFNUM", O.AutoInc, O.PrimaryKey)
    /** Database column DSADAMRFNUM SqlType(BIGINT) */
    val dsadamrfnum: Rep[Long] = column[Long]("DSADAMRFNUM")
    /** Database column DSASOPTRFNUM SqlType(BIGINT) */
    val dsasoptrfnum: Rep[Long] = column[Long]("DSASOPTRFNUM")
    /** Database column DSAEXTERNALID1 SqlType(VARCHAR), Length(32,true), Default(None) */
    val dsaexternalid1: Rep[Option[String]] = column[Option[String]]("DSAEXTERNALID1", O.Length(32,varying=true), O.Default(None))
    /** Database column DSAEXTERNALID2 SqlType(VARCHAR), Length(32,true), Default(None) */
    val dsaexternalid2: Rep[Option[String]] = column[Option[String]]("DSAEXTERNALID2", O.Length(32,varying=true), O.Default(None))
    /** Database column DSAEXTERNALID3 SqlType(VARCHAR), Length(32,true), Default(None) */
    val dsaexternalid3: Rep[Option[String]] = column[Option[String]]("DSAEXTERNALID3", O.Length(32,varying=true), O.Default(None))
    /** Database column DSAEXTERNALID4 SqlType(VARCHAR), Length(32,true), Default(None) */
    val dsaexternalid4: Rep[Option[String]] = column[Option[String]]("DSAEXTERNALID4", O.Length(32,varying=true), O.Default(None))
    /** Database column DSAEXTERNALID5 SqlType(VARCHAR), Length(32,true), Default(None) */
    val dsaexternalid5: Rep[Option[String]] = column[Option[String]]("DSAEXTERNALID5", O.Length(32,varying=true), O.Default(None))
    /** Database column DSAEXTERNALID6 SqlType(VARCHAR), Length(32,true), Default(None) */
    val dsaexternalid6: Rep[Option[String]] = column[Option[String]]("DSAEXTERNALID6", O.Length(32,varying=true), O.Default(None))
    /** Database column DSAEXTERNALID7 SqlType(VARCHAR), Length(32,true), Default(None) */
    val dsaexternalid7: Rep[Option[String]] = column[Option[String]]("DSAEXTERNALID7", O.Length(32,varying=true), O.Default(None))
    /** Database column DSAEXTERNALID8 SqlType(VARCHAR), Length(32,true), Default(None) */
    val dsaexternalid8: Rep[Option[String]] = column[Option[String]]("DSAEXTERNALID8", O.Length(32,varying=true), O.Default(None))





    /** Foreign key referencing Fcdam (database name FK_FCDSA_FCDAM) */
    lazy val fcdamFk = foreignKey("FK_FCDSA_FCDAM", dsadamrfnum, Fcdam)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Fcsopt (database name FK_FCDSA_FCSOPT) */
    lazy val fcsoptFk = foreignKey("FK_FCDSA_FCSOPT", dsasoptrfnum, Fcsopt)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)

    /** Uniqueness Index over (dsadamrfnum,dsasoptrfnum) (database name DSA_COMBO_UNQ) */
    val index1 = index("DSA_COMBO_UNQ", (dsadamrfnum, dsasoptrfnum), unique=true)
  }
  /** Collection-like TableQuery object for table Fcdsa */
  lazy val Fcdsa = new TableQuery(tag => new Fcdsa(tag))

  /** Entity class storing rows of table Fcdsd
   *  @param dsdrfnum Database column DSDRFNUM SqlType(BIGINT), AutoInc, PrimaryKey
   *  @param dsdnavchange Database column DSDNAVCHANGE SqlType(DOUBLE), Default(None)
   *  @param dsdnavpercentchange Database column DSDNAVPERCENTCHANGE SqlType(DOUBLE), Default(None)
   *  @param dsddsarfnum Database column DSDDSARFNUM SqlType(BIGINT)
   *  @param dsdnav Database column DSDNAV SqlType(FLOAT)
   *  @param dsdnavasofdate Database column DSDNAVASOFDATE SqlType(DATE), Default(None)
   *  @param createdate 
   *  @param modifydate 
   *  @param createdby 
   *  @param lastmodifiedby  */
  case class FcdsdRow(id: Long, dsdnavchange: Option[Double] = None, dsdnavpercentchange: Option[Double] = None, dsddsarfnum: Long, dsdnav: Float, dsdnavasofdate: Option[java.sql.Date] = None, createdate: Option[java.sql.Timestamp] = None, modifydate: java.sql.Timestamp, createdby: String, lastmodifiedby: String) extends BaseEntity 
  class FcdsdRowWrapper(id: Option[Long], dsdnavchange: Option[Double] = None, dsdnavpercentchange: Option[Double] = None, dsddsarfnum: Long, dsdnav: Float, dsdnavasofdate: Option[java.sql.Date] = None) {
    def get(userName: String): FcdsdRow = {
      FcdsdRow(this.id.getOrElse(0), this.dsdnavchange, this.dsdnavpercentchange, this.dsddsarfnum, this.dsdnav, this.dsdnavasofdate, Some(DateTimeUtils.getCurrentTimeStamp), DateTimeUtils.getCurrentTimeStamp, userName, userName)
  	}
  }
  /** GetResult implicit for fetching FcdsdRow objects using plain SQL queries */
  implicit def GetResultFcdsdRow(implicit e0: GR[Long], e1: GR[Option[Double]], e2: GR[Float], e3: GR[Option[java.sql.Date]], e4: GR[Option[java.sql.Timestamp]], e5: GR[java.sql.Timestamp], e6: GR[String]): GR[FcdsdRow] = GR{
    prs => import prs._
    FcdsdRow.tupled((<<[Long], <<?[Double], <<?[Double], <<[Long], <<[Float], <<?[java.sql.Date], <<?[java.sql.Timestamp], <<[java.sql.Timestamp], <<[String], <<[String]))
  }
  /** Table description of table FCDSD. Objects of this class serve as prototypes for rows in queries. */
  class Fcdsd(_tableTag: Tag) extends BaseTable[FcdsdRow](_tableTag, "FCDSD") {
    def * = (id, dsdnavchange, dsdnavpercentchange, dsddsarfnum, dsdnav, dsdnavasofdate, createdate, modifydate, createdby, lastmodifiedby) <> (FcdsdRow.tupled, FcdsdRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), dsdnavchange, dsdnavpercentchange, Rep.Some(dsddsarfnum), Rep.Some(dsdnav), dsdnavasofdate, createdate, Rep.Some(modifydate), Rep.Some(createdby), Rep.Some(lastmodifiedby)).shaped.<>({r=>import r._; _1.map(_=> FcdsdRow.tupled((_1.get, _2, _3, _4.get, _5.get, _6, _7, _8.get, _9.get, _10.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column DSDRFNUM SqlType(BIGINT), AutoInc, PrimaryKey */
    override val id: Rep[Long] = column[Long]("DSDRFNUM", O.AutoInc, O.PrimaryKey)
    /** Database column DSDNAVCHANGE SqlType(DOUBLE), Default(None) */
    val dsdnavchange: Rep[Option[Double]] = column[Option[Double]]("DSDNAVCHANGE", O.Default(None))
    /** Database column DSDNAVPERCENTCHANGE SqlType(DOUBLE), Default(None) */
    val dsdnavpercentchange: Rep[Option[Double]] = column[Option[Double]]("DSDNAVPERCENTCHANGE", O.Default(None))
    /** Database column DSDDSARFNUM SqlType(BIGINT) */
    val dsddsarfnum: Rep[Long] = column[Long]("DSDDSARFNUM")
    /** Database column DSDNAV SqlType(FLOAT) */
    val dsdnav: Rep[Float] = column[Float]("DSDNAV")
    /** Database column DSDNAVASOFDATE SqlType(DATE), Default(None) */
    val dsdnavasofdate: Rep[Option[java.sql.Date]] = column[Option[java.sql.Date]]("DSDNAVASOFDATE", O.Default(None))





    /** Foreign key referencing Fcdsa (database name FK_FCDSD_FCDSA) */
    lazy val fcdsaFk = foreignKey("FK_FCDSD_FCDSA", dsddsarfnum, Fcdsa)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table Fcdsd */
  lazy val Fcdsd = new TableQuery(tag => new Fcdsd(tag))

  /** Entity class storing rows of table Fcebse
   *  @param ebserfnum Database column EBSERFNUM SqlType(BIGINT), PrimaryKey
   *  @param ebseminredamt Database column EBSEMINREDAMT SqlType(DOUBLE), Default(None)
   *  @param ebsemaxredamt Database column EBSEMAXREDAMT SqlType(DOUBLE), Default(None)
   *  @param ebseredamtmultiple Database column EBSEREDAMTMULTIPLE SqlType(DOUBLE), Default(None)
   *  @param ebseredcutofftime Database column EBSEREDCUTOFFTIME SqlType(TIME), Default(None)
   *  @param ebsertaagentcode Database column EBSERTAAGENTCODE SqlType(VARCHAR), Length(16,true), Default(None)
   *  @param ebseamcactiveflag Database column EBSEAMCACTIVEFLAG SqlType(VARCHAR), Length(2,true), Default(None)
   *  @param ebsedivreinvestflag Database column EBSEDIVREINVESTFLAG SqlType(VARCHAR), Length(2,true), Default(None)
   *  @param ebsesipflag Database column EBSESIPFLAG SqlType(VARCHAR), Length(2,true), Default(None)
   *  @param ebsestpflag Database column EBSESTPFLAG SqlType(VARCHAR), Length(2,true), Default(None)
   *  @param ebseswpflag Database column EBSESWPFLAG SqlType(VARCHAR), Length(2,true), Default(None)
   *  @param ebseswitchflag Database column EBSESWITCHFLAG SqlType(VARCHAR), Length(2,true), Default(None)
   *  @param ebsesettlementtype Database column EBSESETTLEMENTTYPE SqlType(VARCHAR), Length(3,true), Default(None)
   *  @param ebseamcind Database column EBSEAMCIND SqlType(VARCHAR), Length(32,true), Default(None)
   *  @param ebsefacevalue Database column EBSEFACEVALUE SqlType(DOUBLE), Default(None)
   *  @param ebsestartdate Database column EBSESTARTDATE SqlType(VARCHAR), Length(50,true), Default(None)
   *  @param ebseenddate Database column EBSEENDDATE SqlType(VARCHAR), Length(50,true), Default(None)
   *  @param ebseexitloadflag Database column EBSEEXITLOADFLAG SqlType(VARCHAR), Length(2,true), Default(None)
   *  @param ebseexitload Database column EBSEEXITLOAD SqlType(VARCHAR), Length(1024,true), Default(None)
   *  @param ebselockinperiodflag Database column EBSELOCKINPERIODFLAG SqlType(VARCHAR), Length(2,true), Default(None)
   *  @param ebselockinperiod Database column EBSELOCKINPERIOD SqlType(VARCHAR), Length(16,true), Default(None)
   *  @param createdate  */
  case class FcebseRow(id: Long, ebseminredamt: Option[Double] = None, ebsemaxredamt: Option[Double] = None, ebseredamtmultiple: Option[Double] = None, ebseredcutofftime: Option[java.sql.Time] = None, ebsertaagentcode: Option[String] = None, ebseamcactiveflag: Option[String] = None, ebsedivreinvestflag: Option[String] = None, ebsesipflag: Option[String] = None, ebsestpflag: Option[String] = None, ebseswpflag: Option[String] = None, ebseswitchflag: Option[String] = None, ebsesettlementtype: Option[String] = None, ebseamcind: Option[String] = None, ebsefacevalue: Option[Double] = None, ebsestartdate: Option[String] = None, ebseenddate: Option[String] = None, ebseexitloadflag: Option[String] = None, ebseexitload: Option[String] = None, ebselockinperiodflag: Option[String] = None, ebselockinperiod: Option[String] = None, createdate: Option[java.sql.Timestamp] = None) extends BaseEntity 
  class FcebseRowWrapper(id: Long, ebseminredamt: Option[Double] = None, ebsemaxredamt: Option[Double] = None, ebseredamtmultiple: Option[Double] = None, ebseredcutofftime: Option[java.sql.Time] = None, ebsertaagentcode: Option[String] = None, ebseamcactiveflag: Option[String] = None, ebsedivreinvestflag: Option[String] = None, ebsesipflag: Option[String] = None, ebsestpflag: Option[String] = None, ebseswpflag: Option[String] = None, ebseswitchflag: Option[String] = None, ebsesettlementtype: Option[String] = None, ebseamcind: Option[String] = None, ebsefacevalue: Option[Double] = None, ebsestartdate: Option[String] = None, ebseenddate: Option[String] = None, ebseexitloadflag: Option[String] = None, ebseexitload: Option[String] = None, ebselockinperiodflag: Option[String] = None, ebselockinperiod: Option[String] = None) {
    def get(userName: String): FcebseRow = {
      FcebseRow(this.id, this.ebseminredamt, this.ebsemaxredamt, this.ebseredamtmultiple, this.ebseredcutofftime, this.ebsertaagentcode, this.ebseamcactiveflag, this.ebsedivreinvestflag, this.ebsesipflag, this.ebsestpflag, this.ebseswpflag, this.ebseswitchflag, this.ebsesettlementtype, this.ebseamcind, this.ebsefacevalue, this.ebsestartdate, this.ebseenddate, this.ebseexitloadflag, this.ebseexitload, this.ebselockinperiodflag, this.ebselockinperiod, Some(DateTimeUtils.getCurrentTimeStamp))
  	}
  }
  /** GetResult implicit for fetching FcebseRow objects using plain SQL queries */
  implicit def GetResultFcebseRow(implicit e0: GR[Long], e1: GR[Option[Double]], e2: GR[Option[java.sql.Time]], e3: GR[Option[String]], e4: GR[Option[java.sql.Timestamp]]): GR[FcebseRow] = GR{
    prs => import prs._
    FcebseRow.tupled((<<[Long], <<?[Double], <<?[Double], <<?[Double], <<?[java.sql.Time], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[Double], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[java.sql.Timestamp]))
  }
  /** Table description of table FCEBSE. Objects of this class serve as prototypes for rows in queries. */
  class Fcebse(_tableTag: Tag) extends BaseTable[FcebseRow](_tableTag, "FCEBSE") {
    def * = (id, ebseminredamt, ebsemaxredamt, ebseredamtmultiple, ebseredcutofftime, ebsertaagentcode, ebseamcactiveflag, ebsedivreinvestflag, ebsesipflag, ebsestpflag, ebseswpflag, ebseswitchflag, ebsesettlementtype, ebseamcind, ebsefacevalue, ebsestartdate, ebseenddate, ebseexitloadflag, ebseexitload, ebselockinperiodflag, ebselockinperiod, createdate) <> (FcebseRow.tupled, FcebseRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), ebseminredamt, ebsemaxredamt, ebseredamtmultiple, ebseredcutofftime, ebsertaagentcode, ebseamcactiveflag, ebsedivreinvestflag, ebsesipflag, ebsestpflag, ebseswpflag, ebseswitchflag, ebsesettlementtype, ebseamcind, ebsefacevalue, ebsestartdate, ebseenddate, ebseexitloadflag, ebseexitload, ebselockinperiodflag, ebselockinperiod, createdate).shaped.<>({r=>import r._; _1.map(_=> FcebseRow.tupled((_1.get, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13, _14, _15, _16, _17, _18, _19, _20, _21, _22)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column EBSERFNUM SqlType(BIGINT), PrimaryKey */
    override val id: Rep[Long] = column[Long]("EBSERFNUM", O.PrimaryKey)
    /** Database column EBSEMINREDAMT SqlType(DOUBLE), Default(None) */
    val ebseminredamt: Rep[Option[Double]] = column[Option[Double]]("EBSEMINREDAMT", O.Default(None))
    /** Database column EBSEMAXREDAMT SqlType(DOUBLE), Default(None) */
    val ebsemaxredamt: Rep[Option[Double]] = column[Option[Double]]("EBSEMAXREDAMT", O.Default(None))
    /** Database column EBSEREDAMTMULTIPLE SqlType(DOUBLE), Default(None) */
    val ebseredamtmultiple: Rep[Option[Double]] = column[Option[Double]]("EBSEREDAMTMULTIPLE", O.Default(None))
    /** Database column EBSEREDCUTOFFTIME SqlType(TIME), Default(None) */
    val ebseredcutofftime: Rep[Option[java.sql.Time]] = column[Option[java.sql.Time]]("EBSEREDCUTOFFTIME", O.Default(None))
    /** Database column EBSERTAAGENTCODE SqlType(VARCHAR), Length(16,true), Default(None) */
    val ebsertaagentcode: Rep[Option[String]] = column[Option[String]]("EBSERTAAGENTCODE", O.Length(16,varying=true), O.Default(None))
    /** Database column EBSEAMCACTIVEFLAG SqlType(VARCHAR), Length(2,true), Default(None) */
    val ebseamcactiveflag: Rep[Option[String]] = column[Option[String]]("EBSEAMCACTIVEFLAG", O.Length(2,varying=true), O.Default(None))
    /** Database column EBSEDIVREINVESTFLAG SqlType(VARCHAR), Length(2,true), Default(None) */
    val ebsedivreinvestflag: Rep[Option[String]] = column[Option[String]]("EBSEDIVREINVESTFLAG", O.Length(2,varying=true), O.Default(None))
    /** Database column EBSESIPFLAG SqlType(VARCHAR), Length(2,true), Default(None) */
    val ebsesipflag: Rep[Option[String]] = column[Option[String]]("EBSESIPFLAG", O.Length(2,varying=true), O.Default(None))
    /** Database column EBSESTPFLAG SqlType(VARCHAR), Length(2,true), Default(None) */
    val ebsestpflag: Rep[Option[String]] = column[Option[String]]("EBSESTPFLAG", O.Length(2,varying=true), O.Default(None))
    /** Database column EBSESWPFLAG SqlType(VARCHAR), Length(2,true), Default(None) */
    val ebseswpflag: Rep[Option[String]] = column[Option[String]]("EBSESWPFLAG", O.Length(2,varying=true), O.Default(None))
    /** Database column EBSESWITCHFLAG SqlType(VARCHAR), Length(2,true), Default(None) */
    val ebseswitchflag: Rep[Option[String]] = column[Option[String]]("EBSESWITCHFLAG", O.Length(2,varying=true), O.Default(None))
    /** Database column EBSESETTLEMENTTYPE SqlType(VARCHAR), Length(3,true), Default(None) */
    val ebsesettlementtype: Rep[Option[String]] = column[Option[String]]("EBSESETTLEMENTTYPE", O.Length(3,varying=true), O.Default(None))
    /** Database column EBSEAMCIND SqlType(VARCHAR), Length(32,true), Default(None) */
    val ebseamcind: Rep[Option[String]] = column[Option[String]]("EBSEAMCIND", O.Length(32,varying=true), O.Default(None))
    /** Database column EBSEFACEVALUE SqlType(DOUBLE), Default(None) */
    val ebsefacevalue: Rep[Option[Double]] = column[Option[Double]]("EBSEFACEVALUE", O.Default(None))
    /** Database column EBSESTARTDATE SqlType(VARCHAR), Length(50,true), Default(None) */
    val ebsestartdate: Rep[Option[String]] = column[Option[String]]("EBSESTARTDATE", O.Length(50,varying=true), O.Default(None))
    /** Database column EBSEENDDATE SqlType(VARCHAR), Length(50,true), Default(None) */
    val ebseenddate: Rep[Option[String]] = column[Option[String]]("EBSEENDDATE", O.Length(50,varying=true), O.Default(None))
    /** Database column EBSEEXITLOADFLAG SqlType(VARCHAR), Length(2,true), Default(None) */
    val ebseexitloadflag: Rep[Option[String]] = column[Option[String]]("EBSEEXITLOADFLAG", O.Length(2,varying=true), O.Default(None))
    /** Database column EBSEEXITLOAD SqlType(VARCHAR), Length(1024,true), Default(None) */
    val ebseexitload: Rep[Option[String]] = column[Option[String]]("EBSEEXITLOAD", O.Length(1024,varying=true), O.Default(None))
    /** Database column EBSELOCKINPERIODFLAG SqlType(VARCHAR), Length(2,true), Default(None) */
    val ebselockinperiodflag: Rep[Option[String]] = column[Option[String]]("EBSELOCKINPERIODFLAG", O.Length(2,varying=true), O.Default(None))
    /** Database column EBSELOCKINPERIOD SqlType(VARCHAR), Length(16,true), Default(None) */
    val ebselockinperiod: Rep[Option[String]] = column[Option[String]]("EBSELOCKINPERIOD", O.Length(16,varying=true), O.Default(None))


    /** Foreign key referencing Fcbse (database name FK_FCEBSE_FCBSE) */
    lazy val fcbseFk = foreignKey("FK_FCEBSE_FCBSE", id, Fcbse)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table Fcebse */
  lazy val Fcebse = new TableQuery(tag => new Fcebse(tag))

  /** Entity class storing rows of table Fcefut
   *  @param efutfutrfnum Database column EFUTFUTRFNUM SqlType(BIGINT), PrimaryKey
   *  @param efutfatcastatus Database column EFUTFATCASTATUS SqlType(CHAR), Length(8,false), Default(None)
   *  @param efutcndwealthsource Database column EFUTCNDWEALTHSOURCE SqlType(BIGINT), Default(None)
   *  @param createdate 
   *  @param modifydate 
   *  @param createdby 
   *  @param lastmodifiedby  */
  case class FcefutRow(id: Long, efutfatcastatus: Option[String] = None, efutcndwealthsource: Option[Long] = None, createdate: Option[java.sql.Timestamp] = None, modifydate: java.sql.Timestamp, createdby: String, lastmodifiedby: String) extends BaseEntity 
  class FcefutRowWrapper(id: Long, efutfatcastatus: Option[String] = None, efutcndwealthsource: Option[Long] = None) {
    def get(userName: String): FcefutRow = {
      FcefutRow(this.id, this.efutfatcastatus, this.efutcndwealthsource, Some(DateTimeUtils.getCurrentTimeStamp), DateTimeUtils.getCurrentTimeStamp, userName, userName)
  	}
  }
  /** GetResult implicit for fetching FcefutRow objects using plain SQL queries */
  implicit def GetResultFcefutRow(implicit e0: GR[Long], e1: GR[Option[String]], e2: GR[Option[Long]], e3: GR[Option[java.sql.Timestamp]], e4: GR[java.sql.Timestamp], e5: GR[String]): GR[FcefutRow] = GR{
    prs => import prs._
    FcefutRow.tupled((<<[Long], <<?[String], <<?[Long], <<?[java.sql.Timestamp], <<[java.sql.Timestamp], <<[String], <<[String]))
  }
  /** Table description of table FCEFUT. Objects of this class serve as prototypes for rows in queries. */
  class Fcefut(_tableTag: Tag) extends BaseTable[FcefutRow](_tableTag, "FCEFUT") {
    def * = (id, efutfatcastatus, efutcndwealthsource, createdate, modifydate, createdby, lastmodifiedby) <> (FcefutRow.tupled, FcefutRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), efutfatcastatus, efutcndwealthsource, createdate, Rep.Some(modifydate), Rep.Some(createdby), Rep.Some(lastmodifiedby)).shaped.<>({r=>import r._; _1.map(_=> FcefutRow.tupled((_1.get, _2, _3, _4, _5.get, _6.get, _7.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column EFUTFUTRFNUM SqlType(BIGINT), PrimaryKey */
    override val id: Rep[Long] = column[Long]("EFUTFUTRFNUM", O.PrimaryKey)
    /** Database column EFUTFATCASTATUS SqlType(CHAR), Length(8,false), Default(None) */
    val efutfatcastatus: Rep[Option[String]] = column[Option[String]]("EFUTFATCASTATUS", O.Length(8,varying=false), O.Default(None))
    /** Database column EFUTCNDWEALTHSOURCE SqlType(BIGINT), Default(None) */
    val efutcndwealthsource: Rep[Option[Long]] = column[Option[Long]]("EFUTCNDWEALTHSOURCE", O.Default(None))





    /** Foreign key referencing Fccnd (database name FK_FCEFUT_FCCND) */
    lazy val fccndFk = foreignKey("FK_FCEFUT_FCCND", efutcndwealthsource, Fccnd)(r => Rep.Some(r.id), onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Fcfut (database name FK_FCEFUT_FCFUT) */
    lazy val fcfutFk = foreignKey("FK_FCEFUT_FCFUT", id, Fcfut)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table Fcefut */
  lazy val Fcefut = new TableQuery(tag => new Fcefut(tag))

  /** Entity class storing rows of table Fceubd
   *  @param eubdubdrfnum Database column EUBDUBDRFNUM SqlType(BIGINT), PrimaryKey
   *  @param eubdaadharno Database column EUBDAADHARNO SqlType(VARCHAR), Length(16,true), Default(None)
   *  @param eubdisexternallyreg Database column EUBDISEXTERNALLYREG SqlType(CHAR), Length(2,false), Default(N)
   *  @param eubdexternalid Database column EUBDEXTERNALID SqlType(VARCHAR), Length(45,true), Default(None)
   *  @param eubdisexternallyfatca Database column EUBDISEXTERNALLYFATCA SqlType(CHAR), Length(2,false), Default(N)
   *  @param eubdriskrating Database column EUBDRISKRATING SqlType(CHAR), Length(16,false), Default(None)
   *  @param eubdisvarified Database column EUBDISVARIFIED SqlType(CHAR), Length(2,false), Default(N)
   *  @param createdate 
   *  @param modifydate 
   *  @param createdby 
   *  @param lastmodifiedby  */
  case class FceubdRow(id: Long, eubdaadharno: Option[String] = None, eubdisexternallyreg: String = "N", eubdexternalid: Option[String] = None, eubdisexternallyfatca: String = "N", eubdriskrating: Option[String] = None, eubdisvarified: String = "N", createdate: Option[java.sql.Timestamp] = None, modifydate: java.sql.Timestamp, createdby: String, lastmodifiedby: String) extends BaseEntity 
  class FceubdRowWrapper(id: Long, eubdaadharno: Option[String] = None, eubdisexternallyreg: String = "N", eubdexternalid: Option[String] = None, eubdisexternallyfatca: String = "N", eubdriskrating: Option[String] = None, eubdisvarified: String = "N") {
    def get(userName: String): FceubdRow = {
      FceubdRow(this.id, this.eubdaadharno, this.eubdisexternallyreg, this.eubdexternalid, this.eubdisexternallyfatca, this.eubdriskrating, this.eubdisvarified, Some(DateTimeUtils.getCurrentTimeStamp), DateTimeUtils.getCurrentTimeStamp, userName, userName)
  	}
  }
  /** GetResult implicit for fetching FceubdRow objects using plain SQL queries */
  implicit def GetResultFceubdRow(implicit e0: GR[Long], e1: GR[Option[String]], e2: GR[String], e3: GR[Option[java.sql.Timestamp]], e4: GR[java.sql.Timestamp]): GR[FceubdRow] = GR{
    prs => import prs._
    FceubdRow.tupled((<<[Long], <<?[String], <<[String], <<?[String], <<[String], <<?[String], <<[String], <<?[java.sql.Timestamp], <<[java.sql.Timestamp], <<[String], <<[String]))
  }
  /** Table description of table FCEUBD. Objects of this class serve as prototypes for rows in queries. */
  class Fceubd(_tableTag: Tag) extends BaseTable[FceubdRow](_tableTag, "FCEUBD") {
    def * = (id, eubdaadharno, eubdisexternallyreg, eubdexternalid, eubdisexternallyfatca, eubdriskrating, eubdisvarified, createdate, modifydate, createdby, lastmodifiedby) <> (FceubdRow.tupled, FceubdRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), eubdaadharno, Rep.Some(eubdisexternallyreg), eubdexternalid, Rep.Some(eubdisexternallyfatca), eubdriskrating, Rep.Some(eubdisvarified), createdate, Rep.Some(modifydate), Rep.Some(createdby), Rep.Some(lastmodifiedby)).shaped.<>({r=>import r._; _1.map(_=> FceubdRow.tupled((_1.get, _2, _3.get, _4, _5.get, _6, _7.get, _8, _9.get, _10.get, _11.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column EUBDUBDRFNUM SqlType(BIGINT), PrimaryKey */
    override val id: Rep[Long] = column[Long]("EUBDUBDRFNUM", O.PrimaryKey)
    /** Database column EUBDAADHARNO SqlType(VARCHAR), Length(16,true), Default(None) */
    val eubdaadharno: Rep[Option[String]] = column[Option[String]]("EUBDAADHARNO", O.Length(16,varying=true), O.Default(None))
    /** Database column EUBDISEXTERNALLYREG SqlType(CHAR), Length(2,false), Default(N) */
    val eubdisexternallyreg: Rep[String] = column[String]("EUBDISEXTERNALLYREG", O.Length(2,varying=false), O.Default("N"))
    /** Database column EUBDEXTERNALID SqlType(VARCHAR), Length(45,true), Default(None) */
    val eubdexternalid: Rep[Option[String]] = column[Option[String]]("EUBDEXTERNALID", O.Length(45,varying=true), O.Default(None))
    /** Database column EUBDISEXTERNALLYFATCA SqlType(CHAR), Length(2,false), Default(N) */
    val eubdisexternallyfatca: Rep[String] = column[String]("EUBDISEXTERNALLYFATCA", O.Length(2,varying=false), O.Default("N"))
    /** Database column EUBDRISKRATING SqlType(CHAR), Length(16,false), Default(None) */
    val eubdriskrating: Rep[Option[String]] = column[Option[String]]("EUBDRISKRATING", O.Length(16,varying=false), O.Default(None))
    /** Database column EUBDISVARIFIED SqlType(CHAR), Length(2,false), Default(N) */
    val eubdisvarified: Rep[String] = column[String]("EUBDISVARIFIED", O.Length(2,varying=false), O.Default("N"))





    /** Foreign key referencing Fcubd (database name FK_FCEUBD_FCUBD) */
    lazy val fcubdFk = foreignKey("FK_FCEUBD_FCUBD", id, Fcubd)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table Fceubd */
  lazy val Fceubd = new TableQuery(tag => new Fceubd(tag))

  /** Entity class storing rows of table Fcfhs
   *  @param fhsrfnum Database column FHSRFNUM SqlType(BIGINT), AutoInc, PrimaryKey
   *  @param fhstype Database column FHSTYPE SqlType(CHAR), Length(2,false)
   *  @param fhsunits Database column FHSUNITS SqlType(DOUBLE)
   *  @param fhsrtarefnum Database column FHSRTAREFNUM SqlType(VARCHAR), Length(32,true)
   *  @param fhssotrfnum Database column FHSSOTRFNUM SqlType(BIGINT), Default(None)
   *  @param fhssoptrfnum Database column FHSSOPTRFNUM SqlType(BIGINT)
   *  @param fhsprice Database column FHSPRICE SqlType(DOUBLE)
   *  @param fhsamount Database column FHSAMOUNT SqlType(DOUBLE)
   *  @param fhsdescription Database column FHSDESCRIPTION SqlType(VARCHAR), Length(128,true), Default(None)
   *  @param fhspostdate Database column FHSPOSTDATE SqlType(DATE)
   *  @param fhsrtareportdate Database column FHSRTAREPORTDATE SqlType(DATE)
   *  @param fhstransactionmode Database column FHSTRANSACTIONMODE SqlType(CHAR), Length(2,false)
   *  @param fhstransactiontype Database column FHSTRANSACTIONTYPE SqlType(CHAR), Length(8,false)
   *  @param fhsfhtrfnum Database column FHSFHTRFNUM SqlType(BIGINT)
   *  @param fhsrtasequenceno Database column FHSRTASEQUENCENO SqlType(VARCHAR), Length(32,true)
   *  @param fhsstt Database column FHSSTT SqlType(DOUBLE)
   *  @param createdate 
   *  @param modifydate 
   *  @param createdby 
   *  @param lastmodifiedby  */
  case class FcfhsRow(id: Long, fhstype: String, fhsunits: Double, fhsrtarefnum: String, fhssotrfnum: Option[Long] = None, fhssoptrfnum: Long, fhsprice: Double, fhsamount: Double, fhsdescription: Option[String] = None, fhspostdate: java.sql.Date, fhsrtareportdate: java.sql.Date, fhstransactionmode: String, fhstransactiontype: String, fhsfhtrfnum: Long, fhsrtasequenceno: String, fhsstt: Double, createdate: Option[java.sql.Timestamp] = None, modifydate: java.sql.Timestamp, createdby: String, lastmodifiedby: String) extends BaseEntity 
  class FcfhsRowWrapper(id: Option[Long], fhstype: String, fhsunits: Double, fhsrtarefnum: String, fhssotrfnum: Option[Long] = None, fhssoptrfnum: Long, fhsprice: Double, fhsamount: Double, fhsdescription: Option[String] = None, fhspostdate: java.sql.Date, fhsrtareportdate: java.sql.Date, fhstransactionmode: String, fhstransactiontype: String, fhsfhtrfnum: Long, fhsrtasequenceno: String, fhsstt: Double) {
    def get(userName: String): FcfhsRow = {
      FcfhsRow(this.id.getOrElse(0), this.fhstype, this.fhsunits, this.fhsrtarefnum, this.fhssotrfnum, this.fhssoptrfnum, this.fhsprice, this.fhsamount, this.fhsdescription, this.fhspostdate, this.fhsrtareportdate, this.fhstransactionmode, this.fhstransactiontype, this.fhsfhtrfnum, this.fhsrtasequenceno, this.fhsstt, Some(DateTimeUtils.getCurrentTimeStamp), DateTimeUtils.getCurrentTimeStamp, userName, userName)
  	}
  }
  /** GetResult implicit for fetching FcfhsRow objects using plain SQL queries */
  implicit def GetResultFcfhsRow(implicit e0: GR[Long], e1: GR[String], e2: GR[Double], e3: GR[Option[Long]], e4: GR[Option[String]], e5: GR[java.sql.Date], e6: GR[Option[java.sql.Timestamp]], e7: GR[java.sql.Timestamp]): GR[FcfhsRow] = GR{
    prs => import prs._
    FcfhsRow.tupled((<<[Long], <<[String], <<[Double], <<[String], <<?[Long], <<[Long], <<[Double], <<[Double], <<?[String], <<[java.sql.Date], <<[java.sql.Date], <<[String], <<[String], <<[Long], <<[String], <<[Double], <<?[java.sql.Timestamp], <<[java.sql.Timestamp], <<[String], <<[String]))
  }
  /** Table description of table FCFHS. Objects of this class serve as prototypes for rows in queries. */
  class Fcfhs(_tableTag: Tag) extends BaseTable[FcfhsRow](_tableTag, "FCFHS") {
    def * = (id, fhstype, fhsunits, fhsrtarefnum, fhssotrfnum, fhssoptrfnum, fhsprice, fhsamount, fhsdescription, fhspostdate, fhsrtareportdate, fhstransactionmode, fhstransactiontype, fhsfhtrfnum, fhsrtasequenceno, fhsstt, createdate, modifydate, createdby, lastmodifiedby) <> (FcfhsRow.tupled, FcfhsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(fhstype), Rep.Some(fhsunits), Rep.Some(fhsrtarefnum), fhssotrfnum, Rep.Some(fhssoptrfnum), Rep.Some(fhsprice), Rep.Some(fhsamount), fhsdescription, Rep.Some(fhspostdate), Rep.Some(fhsrtareportdate), Rep.Some(fhstransactionmode), Rep.Some(fhstransactiontype), Rep.Some(fhsfhtrfnum), Rep.Some(fhsrtasequenceno), Rep.Some(fhsstt), createdate, Rep.Some(modifydate), Rep.Some(createdby), Rep.Some(lastmodifiedby)).shaped.<>({r=>import r._; _1.map(_=> FcfhsRow.tupled((_1.get, _2.get, _3.get, _4.get, _5, _6.get, _7.get, _8.get, _9, _10.get, _11.get, _12.get, _13.get, _14.get, _15.get, _16.get, _17, _18.get, _19.get, _20.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column FHSRFNUM SqlType(BIGINT), AutoInc, PrimaryKey */
    override val id: Rep[Long] = column[Long]("FHSRFNUM", O.AutoInc, O.PrimaryKey)
    /** Database column FHSTYPE SqlType(CHAR), Length(2,false) */
    val fhstype: Rep[String] = column[String]("FHSTYPE", O.Length(2,varying=false))
    /** Database column FHSUNITS SqlType(DOUBLE) */
    val fhsunits: Rep[Double] = column[Double]("FHSUNITS")
    /** Database column FHSRTAREFNUM SqlType(VARCHAR), Length(32,true) */
    val fhsrtarefnum: Rep[String] = column[String]("FHSRTAREFNUM", O.Length(32,varying=true))
    /** Database column FHSSOTRFNUM SqlType(BIGINT), Default(None) */
    val fhssotrfnum: Rep[Option[Long]] = column[Option[Long]]("FHSSOTRFNUM", O.Default(None))
    /** Database column FHSSOPTRFNUM SqlType(BIGINT) */
    val fhssoptrfnum: Rep[Long] = column[Long]("FHSSOPTRFNUM")
    /** Database column FHSPRICE SqlType(DOUBLE) */
    val fhsprice: Rep[Double] = column[Double]("FHSPRICE")
    /** Database column FHSAMOUNT SqlType(DOUBLE) */
    val fhsamount: Rep[Double] = column[Double]("FHSAMOUNT")
    /** Database column FHSDESCRIPTION SqlType(VARCHAR), Length(128,true), Default(None) */
    val fhsdescription: Rep[Option[String]] = column[Option[String]]("FHSDESCRIPTION", O.Length(128,varying=true), O.Default(None))
    /** Database column FHSPOSTDATE SqlType(DATE) */
    val fhspostdate: Rep[java.sql.Date] = column[java.sql.Date]("FHSPOSTDATE")
    /** Database column FHSRTAREPORTDATE SqlType(DATE) */
    val fhsrtareportdate: Rep[java.sql.Date] = column[java.sql.Date]("FHSRTAREPORTDATE")
    /** Database column FHSTRANSACTIONMODE SqlType(CHAR), Length(2,false) */
    val fhstransactionmode: Rep[String] = column[String]("FHSTRANSACTIONMODE", O.Length(2,varying=false))
    /** Database column FHSTRANSACTIONTYPE SqlType(CHAR), Length(8,false) */
    val fhstransactiontype: Rep[String] = column[String]("FHSTRANSACTIONTYPE", O.Length(8,varying=false))
    /** Database column FHSFHTRFNUM SqlType(BIGINT) */
    val fhsfhtrfnum: Rep[Long] = column[Long]("FHSFHTRFNUM")
    /** Database column FHSRTASEQUENCENO SqlType(VARCHAR), Length(32,true) */
    val fhsrtasequenceno: Rep[String] = column[String]("FHSRTASEQUENCENO", O.Length(32,varying=true))
    /** Database column FHSSTT SqlType(DOUBLE) */
    val fhsstt: Rep[Double] = column[Double]("FHSSTT")





    /** Foreign key referencing Fcfht (database name FK_FCFHS_FCFHT) */
    lazy val fcfhtFk = foreignKey("FK_FCFHS_FCFHT", fhsfhtrfnum, Fcfht)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Fcsopt (database name FK_FCFHS_FCSOPT) */
    lazy val fcsoptFk = foreignKey("FK_FCFHS_FCSOPT", fhssoptrfnum, Fcsopt)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Fcsot (database name FK_FCFHS_FCSOT) */
    lazy val fcsotFk = foreignKey("FK_FCFHS_FCSOT", fhssotrfnum, Fcsot)(r => Rep.Some(r.id), onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table Fcfhs */
  lazy val Fcfhs = new TableQuery(tag => new Fcfhs(tag))

  /** Entity class storing rows of table Fcfht
   *  @param fhtrfnum Database column FHTRFNUM SqlType(BIGINT), AutoInc, PrimaryKey
   *  @param fhtholdingname Database column FHTHOLDINGNAME SqlType(VARCHAR), Length(128,true), Default(None)
   *  @param fhtholdingunits Database column FHTHOLDINGUNITS SqlType(DOUBLE)
   *  @param fhttradedate Database column FHTTRADEDATE SqlType(DATE)
   *  @param fhtcomstructjson Database column FHTCOMSTRUCTJSON SqlType(VARCHAR), Length(2048,true), Default(None)
   *  @param fhtsoptrfnum Database column FHTSOPTRFNUM SqlType(BIGINT)
   *  @param fhtinvestmentmode Database column FHTINVESTMENTMODE SqlType(CHAR), Length(2,false)
   *  @param fhtjsonname Database column FHTJSONNAME SqlType(CHAR), Length(32,false), Default(None)
   *  @param fhtfomtrfnum Database column FHTFOMTRFNUM SqlType(BIGINT)
   *  @param fhtsotrfnum Database column FHTSOTRFNUM SqlType(BIGINT), Default(None)
   *  @param fhtexitload Database column FHTEXITLOAD SqlType(VARCHAR), Length(264,true), Default(None)
   *  @param fhtinvlocation Database column FHTINVLOCATION SqlType(CHAR), Length(2,false)
   *  @param fhtstatus Database column FHTSTATUS SqlType(VARCHAR), Length(32,true)
   *  @param createdate 
   *  @param modifydate 
   *  @param createdby 
   *  @param lastmodifiedby  */
  case class FcfhtRow(id: Long, fhtholdingname: Option[String] = None, fhtholdingunits: Double, fhttradedate: java.sql.Date, fhtcomstructjson: Option[String] = None, fhtsoptrfnum: Long, fhtinvestmentmode: String, fhtjsonname: Option[String] = None, fhtfomtrfnum: Long, fhtsotrfnum: Option[Long] = None, fhtexitload: Option[String] = None, fhtinvlocation: String, fhtstatus: String, createdate: Option[java.sql.Timestamp] = None, modifydate: java.sql.Timestamp, createdby: String, lastmodifiedby: String) extends BaseEntity 
  class FcfhtRowWrapper(id: Option[Long], fhtholdingname: Option[String] = None, fhtholdingunits: Double, fhttradedate: java.sql.Date, fhtcomstructjson: Option[String] = None, fhtsoptrfnum: Long, fhtinvestmentmode: String, fhtjsonname: Option[String] = None, fhtfomtrfnum: Long, fhtsotrfnum: Option[Long] = None, fhtexitload: Option[String] = None, fhtinvlocation: String, fhtstatus: String) {
    def get(userName: String): FcfhtRow = {
      FcfhtRow(this.id.getOrElse(0), this.fhtholdingname, this.fhtholdingunits, this.fhttradedate, this.fhtcomstructjson, this.fhtsoptrfnum, this.fhtinvestmentmode, this.fhtjsonname, this.fhtfomtrfnum, this.fhtsotrfnum, this.fhtexitload, this.fhtinvlocation, this.fhtstatus, Some(DateTimeUtils.getCurrentTimeStamp), DateTimeUtils.getCurrentTimeStamp, userName, userName)
  	}
  }
  /** GetResult implicit for fetching FcfhtRow objects using plain SQL queries */
  implicit def GetResultFcfhtRow(implicit e0: GR[Long], e1: GR[Option[String]], e2: GR[Double], e3: GR[java.sql.Date], e4: GR[String], e5: GR[Option[Long]], e6: GR[Option[java.sql.Timestamp]], e7: GR[java.sql.Timestamp]): GR[FcfhtRow] = GR{
    prs => import prs._
    FcfhtRow.tupled((<<[Long], <<?[String], <<[Double], <<[java.sql.Date], <<?[String], <<[Long], <<[String], <<?[String], <<[Long], <<?[Long], <<?[String], <<[String], <<[String], <<?[java.sql.Timestamp], <<[java.sql.Timestamp], <<[String], <<[String]))
  }
  /** Table description of table FCFHT. Objects of this class serve as prototypes for rows in queries. */
  class Fcfht(_tableTag: Tag) extends BaseTable[FcfhtRow](_tableTag, "FCFHT") {
    def * = (id, fhtholdingname, fhtholdingunits, fhttradedate, fhtcomstructjson, fhtsoptrfnum, fhtinvestmentmode, fhtjsonname, fhtfomtrfnum, fhtsotrfnum, fhtexitload, fhtinvlocation, fhtstatus, createdate, modifydate, createdby, lastmodifiedby) <> (FcfhtRow.tupled, FcfhtRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), fhtholdingname, Rep.Some(fhtholdingunits), Rep.Some(fhttradedate), fhtcomstructjson, Rep.Some(fhtsoptrfnum), Rep.Some(fhtinvestmentmode), fhtjsonname, Rep.Some(fhtfomtrfnum), fhtsotrfnum, fhtexitload, Rep.Some(fhtinvlocation), Rep.Some(fhtstatus), createdate, Rep.Some(modifydate), Rep.Some(createdby), Rep.Some(lastmodifiedby)).shaped.<>({r=>import r._; _1.map(_=> FcfhtRow.tupled((_1.get, _2, _3.get, _4.get, _5, _6.get, _7.get, _8, _9.get, _10, _11, _12.get, _13.get, _14, _15.get, _16.get, _17.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column FHTRFNUM SqlType(BIGINT), AutoInc, PrimaryKey */
    override val id: Rep[Long] = column[Long]("FHTRFNUM", O.AutoInc, O.PrimaryKey)
    /** Database column FHTHOLDINGNAME SqlType(VARCHAR), Length(128,true), Default(None) */
    val fhtholdingname: Rep[Option[String]] = column[Option[String]]("FHTHOLDINGNAME", O.Length(128,varying=true), O.Default(None))
    /** Database column FHTHOLDINGUNITS SqlType(DOUBLE) */
    val fhtholdingunits: Rep[Double] = column[Double]("FHTHOLDINGUNITS")
    /** Database column FHTTRADEDATE SqlType(DATE) */
    val fhttradedate: Rep[java.sql.Date] = column[java.sql.Date]("FHTTRADEDATE")
    /** Database column FHTCOMSTRUCTJSON SqlType(VARCHAR), Length(2048,true), Default(None) */
    val fhtcomstructjson: Rep[Option[String]] = column[Option[String]]("FHTCOMSTRUCTJSON", O.Length(2048,varying=true), O.Default(None))
    /** Database column FHTSOPTRFNUM SqlType(BIGINT) */
    val fhtsoptrfnum: Rep[Long] = column[Long]("FHTSOPTRFNUM")
    /** Database column FHTINVESTMENTMODE SqlType(CHAR), Length(2,false) */
    val fhtinvestmentmode: Rep[String] = column[String]("FHTINVESTMENTMODE", O.Length(2,varying=false))
    /** Database column FHTJSONNAME SqlType(CHAR), Length(32,false), Default(None) */
    val fhtjsonname: Rep[Option[String]] = column[Option[String]]("FHTJSONNAME", O.Length(32,varying=false), O.Default(None))
    /** Database column FHTFOMTRFNUM SqlType(BIGINT) */
    val fhtfomtrfnum: Rep[Long] = column[Long]("FHTFOMTRFNUM")
    /** Database column FHTSOTRFNUM SqlType(BIGINT), Default(None) */
    val fhtsotrfnum: Rep[Option[Long]] = column[Option[Long]]("FHTSOTRFNUM", O.Default(None))
    /** Database column FHTEXITLOAD SqlType(VARCHAR), Length(264,true), Default(None) */
    val fhtexitload: Rep[Option[String]] = column[Option[String]]("FHTEXITLOAD", O.Length(264,varying=true), O.Default(None))
    /** Database column FHTINVLOCATION SqlType(CHAR), Length(2,false) */
    val fhtinvlocation: Rep[String] = column[String]("FHTINVLOCATION", O.Length(2,varying=false))
    /** Database column FHTSTATUS SqlType(VARCHAR), Length(32,true) */
    val fhtstatus: Rep[String] = column[String]("FHTSTATUS", O.Length(32,varying=true))





    /** Foreign key referencing Fcfomt (database name FK_FCFHT_FCFOMT) */
    lazy val fcfomtFk = foreignKey("FK_FCFHT_FCFOMT", fhtfomtrfnum, Fcfomt)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Fcsopt (database name FK_FCFHT_FCSOPT) */
    lazy val fcsoptFk = foreignKey("FK_FCFHT_FCSOPT", fhtsoptrfnum, Fcsopt)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Fcsot (database name FK_FCFHT_FCSOT) */
    lazy val fcsotFk = foreignKey("FK_FCFHT_FCSOT", fhtsotrfnum, Fcsot)(r => Rep.Some(r.id), onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table Fcfht */
  lazy val Fcfht = new TableQuery(tag => new Fcfht(tag))

  /** Entity class storing rows of table Fcfomt
   *  @param fomtrfnum Database column FOMTRFNUM SqlType(BIGINT), AutoInc, PrimaryKey
   *  @param fomtfolioname Database column FOMTFOLIONAME SqlType(VARCHAR), Length(64,true), Default(None)
   *  @param fomtfoliono Database column FOMTFOLIONO SqlType(VARCHAR), Length(32,true)
   *  @param fomtfoliodescp Database column FOMTFOLIODESCP SqlType(VARCHAR), Length(128,true), Default(None)
   *  @param fomtcreationdate Database column FOMTCREATIONDATE SqlType(VARCHAR), Length(50,true), Default(None)
   *  @param fomtamcname Database column FOMTAMCNAME SqlType(VARCHAR), Length(256,true), Default(None)
   *  @param fomtamctrfnum Database column FOMTAMCTRFNUM SqlType(BIGINT)
   *  @param fomtomtrfnum Database column FOMTOMTRFNUM SqlType(BIGINT), Default(None)
   *  @param fomtmodeofholding Database column FOMTMODEOFHOLDING SqlType(CHAR), Length(4,false)
   *  @param fomtsotrfnum Database column FOMTSOTRFNUM SqlType(BIGINT), Default(None)
   *  @param fomtjointpan1 Database column FOMTJOINTPAN1 SqlType(CHAR), Length(10,false), Default(None)
   *  @param fomtjointpan2 Database column FOMTJOINTPAN2 SqlType(CHAR), Length(10,false), Default(None)
   *  @param createdate 
   *  @param modifydate 
   *  @param createdby 
   *  @param lastmodifiedby  */
  case class FcfomtRow(id: Long, fomtfolioname: Option[String] = None, fomtfoliono: String, fomtfoliodescp: Option[String] = None, fomtcreationdate: Option[String] = None, fomtamcname: Option[String] = None, fomtamctrfnum: Long, fomtomtrfnum: Option[Long] = None, fomtmodeofholding: String, fomtsotrfnum: Option[Long] = None, fomtjointpan1: Option[String] = None, fomtjointpan2: Option[String] = None, createdate: Option[java.sql.Timestamp] = None, modifydate: java.sql.Timestamp, createdby: String, lastmodifiedby: String) extends BaseEntity 
  class FcfomtRowWrapper(id: Option[Long], fomtfolioname: Option[String] = None, fomtfoliono: String, fomtfoliodescp: Option[String] = None, fomtcreationdate: Option[String] = None, fomtamcname: Option[String] = None, fomtamctrfnum: Long, fomtomtrfnum: Option[Long] = None, fomtmodeofholding: String, fomtsotrfnum: Option[Long] = None, fomtjointpan1: Option[String] = None, fomtjointpan2: Option[String] = None) {
    def get(userName: String): FcfomtRow = {
      FcfomtRow(this.id.getOrElse(0), this.fomtfolioname, this.fomtfoliono, this.fomtfoliodescp, this.fomtcreationdate, this.fomtamcname, this.fomtamctrfnum, this.fomtomtrfnum, this.fomtmodeofholding, this.fomtsotrfnum, this.fomtjointpan1, this.fomtjointpan2, Some(DateTimeUtils.getCurrentTimeStamp), DateTimeUtils.getCurrentTimeStamp, userName, userName)
  	}
  }
  /** GetResult implicit for fetching FcfomtRow objects using plain SQL queries */
  implicit def GetResultFcfomtRow(implicit e0: GR[Long], e1: GR[Option[String]], e2: GR[String], e3: GR[Option[Long]], e4: GR[Option[java.sql.Timestamp]], e5: GR[java.sql.Timestamp]): GR[FcfomtRow] = GR{
    prs => import prs._
    FcfomtRow.tupled((<<[Long], <<?[String], <<[String], <<?[String], <<?[String], <<?[String], <<[Long], <<?[Long], <<[String], <<?[Long], <<?[String], <<?[String], <<?[java.sql.Timestamp], <<[java.sql.Timestamp], <<[String], <<[String]))
  }
  /** Table description of table FCFOMT. Objects of this class serve as prototypes for rows in queries. */
  class Fcfomt(_tableTag: Tag) extends BaseTable[FcfomtRow](_tableTag, "FCFOMT") {
    def * = (id, fomtfolioname, fomtfoliono, fomtfoliodescp, fomtcreationdate, fomtamcname, fomtamctrfnum, fomtomtrfnum, fomtmodeofholding, fomtsotrfnum, fomtjointpan1, fomtjointpan2, createdate, modifydate, createdby, lastmodifiedby) <> (FcfomtRow.tupled, FcfomtRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), fomtfolioname, Rep.Some(fomtfoliono), fomtfoliodescp, fomtcreationdate, fomtamcname, Rep.Some(fomtamctrfnum), fomtomtrfnum, Rep.Some(fomtmodeofholding), fomtsotrfnum, fomtjointpan1, fomtjointpan2, createdate, Rep.Some(modifydate), Rep.Some(createdby), Rep.Some(lastmodifiedby)).shaped.<>({r=>import r._; _1.map(_=> FcfomtRow.tupled((_1.get, _2, _3.get, _4, _5, _6, _7.get, _8, _9.get, _10, _11, _12, _13, _14.get, _15.get, _16.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column FOMTRFNUM SqlType(BIGINT), AutoInc, PrimaryKey */
    override val id: Rep[Long] = column[Long]("FOMTRFNUM", O.AutoInc, O.PrimaryKey)
    /** Database column FOMTFOLIONAME SqlType(VARCHAR), Length(64,true), Default(None) */
    val fomtfolioname: Rep[Option[String]] = column[Option[String]]("FOMTFOLIONAME", O.Length(64,varying=true), O.Default(None))
    /** Database column FOMTFOLIONO SqlType(VARCHAR), Length(32,true) */
    val fomtfoliono: Rep[String] = column[String]("FOMTFOLIONO", O.Length(32,varying=true))
    /** Database column FOMTFOLIODESCP SqlType(VARCHAR), Length(128,true), Default(None) */
    val fomtfoliodescp: Rep[Option[String]] = column[Option[String]]("FOMTFOLIODESCP", O.Length(128,varying=true), O.Default(None))
    /** Database column FOMTCREATIONDATE SqlType(VARCHAR), Length(50,true), Default(None) */
    val fomtcreationdate: Rep[Option[String]] = column[Option[String]]("FOMTCREATIONDATE", O.Length(50,varying=true), O.Default(None))
    /** Database column FOMTAMCNAME SqlType(VARCHAR), Length(256,true), Default(None) */
    val fomtamcname: Rep[Option[String]] = column[Option[String]]("FOMTAMCNAME", O.Length(256,varying=true), O.Default(None))
    /** Database column FOMTAMCTRFNUM SqlType(BIGINT) */
    val fomtamctrfnum: Rep[Long] = column[Long]("FOMTAMCTRFNUM")
    /** Database column FOMTOMTRFNUM SqlType(BIGINT), Default(None) */
    val fomtomtrfnum: Rep[Option[Long]] = column[Option[Long]]("FOMTOMTRFNUM", O.Default(None))
    /** Database column FOMTMODEOFHOLDING SqlType(CHAR), Length(4,false) */
    val fomtmodeofholding: Rep[String] = column[String]("FOMTMODEOFHOLDING", O.Length(4,varying=false))
    /** Database column FOMTSOTRFNUM SqlType(BIGINT), Default(None) */
    val fomtsotrfnum: Rep[Option[Long]] = column[Option[Long]]("FOMTSOTRFNUM", O.Default(None))
    /** Database column FOMTJOINTPAN1 SqlType(CHAR), Length(10,false), Default(None) */
    val fomtjointpan1: Rep[Option[String]] = column[Option[String]]("FOMTJOINTPAN1", O.Length(10,varying=false), O.Default(None))
    /** Database column FOMTJOINTPAN2 SqlType(CHAR), Length(10,false), Default(None) */
    val fomtjointpan2: Rep[Option[String]] = column[Option[String]]("FOMTJOINTPAN2", O.Length(10,varying=false), O.Default(None))





    /** Foreign key referencing Fcamct (database name FK_FCFOMT_FCAMCT) */
    lazy val fcamctFk = foreignKey("FK_FCFOMT_FCAMCT", fomtamctrfnum, Fcamct)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Fcomt (database name FK_FCFOMT_FCOMT) */
    lazy val fcomtFk = foreignKey("FK_FCFOMT_FCOMT", fomtomtrfnum, Fcomt)(r => Rep.Some(r.id), onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Fcsot (database name FK_FCFOMT_FCSOT) */
    lazy val fcsotFk = foreignKey("FK_FCFOMT_FCSOT", fomtsotrfnum, Fcsot)(r => Rep.Some(r.id), onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table Fcfomt */
  lazy val Fcfomt = new TableQuery(tag => new Fcfomt(tag))

  /** Entity class storing rows of table Fcfpt
   *  @param fptrfnum Database column FPTRFNUM SqlType(BIGINT), AutoInc, PrimaryKey
   *  @param fptfomtrfnum Database column FPTFOMTRFNUM SqlType(BIGINT)
   *  @param fptexternalid Database column FPTEXTERNALID SqlType(VARCHAR), Length(32,true), Default(None)
   *  @param fptamount Database column FPTAMOUNT SqlType(DOUBLE)
   *  @param fptcreditdate Database column FPTCREDITDATE SqlType(DATE), Default(None)
   *  @param fptdeclarationdate Database column FPTDECLARATIONDATE SqlType(DATE), Default(None)
   *  @param fptinvestmentmode Database column FPTINVESTMENTMODE SqlType(CHAR), Length(2,false), Default(None)
   *  @param fptsoptrfnum Database column FPTSOPTRFNUM SqlType(BIGINT)
   *  @param fptpayouttype Database column FPTPAYOUTTYPE SqlType(CHAR), Length(2,false), Default(None)
   *  @param createdate 
   *  @param modifydate 
   *  @param createdby 
   *  @param lastmodifiedby  */
  case class FcfptRow(id: Long, fptfomtrfnum: Long, fptexternalid: Option[String] = None, fptamount: Double, fptcreditdate: Option[java.sql.Date] = None, fptdeclarationdate: Option[java.sql.Date] = None, fptinvestmentmode: Option[String] = None, fptsoptrfnum: Long, fptpayouttype: Option[String] = None, createdate: Option[java.sql.Timestamp] = None, modifydate: java.sql.Timestamp, createdby: String, lastmodifiedby: String) extends BaseEntity 
  class FcfptRowWrapper(id: Option[Long], fptfomtrfnum: Long, fptexternalid: Option[String] = None, fptamount: Double, fptcreditdate: Option[java.sql.Date] = None, fptdeclarationdate: Option[java.sql.Date] = None, fptinvestmentmode: Option[String] = None, fptsoptrfnum: Long, fptpayouttype: Option[String] = None) {
    def get(userName: String): FcfptRow = {
      FcfptRow(this.id.getOrElse(0), this.fptfomtrfnum, this.fptexternalid, this.fptamount, this.fptcreditdate, this.fptdeclarationdate, this.fptinvestmentmode, this.fptsoptrfnum, this.fptpayouttype, Some(DateTimeUtils.getCurrentTimeStamp), DateTimeUtils.getCurrentTimeStamp, userName, userName)
  	}
  }
  /** GetResult implicit for fetching FcfptRow objects using plain SQL queries */
  implicit def GetResultFcfptRow(implicit e0: GR[Long], e1: GR[Option[String]], e2: GR[Double], e3: GR[Option[java.sql.Date]], e4: GR[Option[java.sql.Timestamp]], e5: GR[java.sql.Timestamp], e6: GR[String]): GR[FcfptRow] = GR{
    prs => import prs._
    FcfptRow.tupled((<<[Long], <<[Long], <<?[String], <<[Double], <<?[java.sql.Date], <<?[java.sql.Date], <<?[String], <<[Long], <<?[String], <<?[java.sql.Timestamp], <<[java.sql.Timestamp], <<[String], <<[String]))
  }
  /** Table description of table FCFPT. Objects of this class serve as prototypes for rows in queries. */
  class Fcfpt(_tableTag: Tag) extends BaseTable[FcfptRow](_tableTag, "FCFPT") {
    def * = (id, fptfomtrfnum, fptexternalid, fptamount, fptcreditdate, fptdeclarationdate, fptinvestmentmode, fptsoptrfnum, fptpayouttype, createdate, modifydate, createdby, lastmodifiedby) <> (FcfptRow.tupled, FcfptRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(fptfomtrfnum), fptexternalid, Rep.Some(fptamount), fptcreditdate, fptdeclarationdate, fptinvestmentmode, Rep.Some(fptsoptrfnum), fptpayouttype, createdate, Rep.Some(modifydate), Rep.Some(createdby), Rep.Some(lastmodifiedby)).shaped.<>({r=>import r._; _1.map(_=> FcfptRow.tupled((_1.get, _2.get, _3, _4.get, _5, _6, _7, _8.get, _9, _10, _11.get, _12.get, _13.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column FPTRFNUM SqlType(BIGINT), AutoInc, PrimaryKey */
    override val id: Rep[Long] = column[Long]("FPTRFNUM", O.AutoInc, O.PrimaryKey)
    /** Database column FPTFOMTRFNUM SqlType(BIGINT) */
    val fptfomtrfnum: Rep[Long] = column[Long]("FPTFOMTRFNUM")
    /** Database column FPTEXTERNALID SqlType(VARCHAR), Length(32,true), Default(None) */
    val fptexternalid: Rep[Option[String]] = column[Option[String]]("FPTEXTERNALID", O.Length(32,varying=true), O.Default(None))
    /** Database column FPTAMOUNT SqlType(DOUBLE) */
    val fptamount: Rep[Double] = column[Double]("FPTAMOUNT")
    /** Database column FPTCREDITDATE SqlType(DATE), Default(None) */
    val fptcreditdate: Rep[Option[java.sql.Date]] = column[Option[java.sql.Date]]("FPTCREDITDATE", O.Default(None))
    /** Database column FPTDECLARATIONDATE SqlType(DATE), Default(None) */
    val fptdeclarationdate: Rep[Option[java.sql.Date]] = column[Option[java.sql.Date]]("FPTDECLARATIONDATE", O.Default(None))
    /** Database column FPTINVESTMENTMODE SqlType(CHAR), Length(2,false), Default(None) */
    val fptinvestmentmode: Rep[Option[String]] = column[Option[String]]("FPTINVESTMENTMODE", O.Length(2,varying=false), O.Default(None))
    /** Database column FPTSOPTRFNUM SqlType(BIGINT) */
    val fptsoptrfnum: Rep[Long] = column[Long]("FPTSOPTRFNUM")
    /** Database column FPTPAYOUTTYPE SqlType(CHAR), Length(2,false), Default(None) */
    val fptpayouttype: Rep[Option[String]] = column[Option[String]]("FPTPAYOUTTYPE", O.Length(2,varying=false), O.Default(None))





    /** Foreign key referencing Fcfomt (database name FK_FCFPT_FCFOMT) */
    lazy val fcfomtFk = foreignKey("FK_FCFPT_FCFOMT", fptfomtrfnum, Fcfomt)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Fcsopt (database name FK_FCFPT_FCSOPT) */
    lazy val fcsoptFk = foreignKey("FK_FCFPT_FCSOPT", fptsoptrfnum, Fcsopt)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table Fcfpt */
  lazy val Fcfpt = new TableQuery(tag => new Fcfpt(tag))

  /** Entity class storing rows of table Fcfrt
   *  @param frtrfnum Database column FRTRFNUM SqlType(BIGINT), AutoInc, PrimaryKey
   *  @param frtragrfnum Database column FRTRAGRFNUM SqlType(BIGINT)
   *  @param frtrating Database column FRTRATING SqlType(CHAR), Length(5,false)
   *  @param frtratingdate Database column FRTRATINGDATE SqlType(TIMESTAMP), Default(None)
   *  @param frtschemerank Database column FRTSCHEMERANK SqlType(FLOAT), Default(None)
   *  @param createdate 
   *  @param modifydate 
   *  @param createdby 
   *  @param lastmodifiedby 
   *  @param frtsmtrfnum Database column FRTSMTRFNUM SqlType(BIGINT) */
  case class FcfrtRow(id: Long, frtragrfnum: Long, frtrating: String, frtratingdate: Option[java.sql.Timestamp] = None, frtschemerank: Option[Float] = None, createdate: Option[java.sql.Timestamp] = None, modifydate: java.sql.Timestamp, createdby: String, lastmodifiedby: String, frtsmtrfnum: Long) extends BaseEntity 
  class FcfrtRowWrapper(id: Option[Long], frtragrfnum: Long, frtrating: String, frtratingdate: Option[java.sql.Timestamp] = None, frtschemerank: Option[Float] = None, frtsmtrfnum: Long) {
    def get(userName: String): FcfrtRow = {
      FcfrtRow(this.id.getOrElse(0), this.frtragrfnum, this.frtrating, this.frtratingdate, this.frtschemerank, Some(DateTimeUtils.getCurrentTimeStamp), DateTimeUtils.getCurrentTimeStamp, userName, userName, this.frtsmtrfnum)
  	}
  }
  /** GetResult implicit for fetching FcfrtRow objects using plain SQL queries */
  implicit def GetResultFcfrtRow(implicit e0: GR[Long], e1: GR[String], e2: GR[Option[java.sql.Timestamp]], e3: GR[Option[Float]], e4: GR[java.sql.Timestamp]): GR[FcfrtRow] = GR{
    prs => import prs._
    FcfrtRow.tupled((<<[Long], <<[Long], <<[String], <<?[java.sql.Timestamp], <<?[Float], <<?[java.sql.Timestamp], <<[java.sql.Timestamp], <<[String], <<[String], <<[Long]))
  }
  /** Table description of table FCFRT. Objects of this class serve as prototypes for rows in queries. */
  class Fcfrt(_tableTag: Tag) extends BaseTable[FcfrtRow](_tableTag, "FCFRT") {
    def * = (id, frtragrfnum, frtrating, frtratingdate, frtschemerank, createdate, modifydate, createdby, lastmodifiedby, frtsmtrfnum) <> (FcfrtRow.tupled, FcfrtRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(frtragrfnum), Rep.Some(frtrating), frtratingdate, frtschemerank, createdate, Rep.Some(modifydate), Rep.Some(createdby), Rep.Some(lastmodifiedby), Rep.Some(frtsmtrfnum)).shaped.<>({r=>import r._; _1.map(_=> FcfrtRow.tupled((_1.get, _2.get, _3.get, _4, _5, _6, _7.get, _8.get, _9.get, _10.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column FRTRFNUM SqlType(BIGINT), AutoInc, PrimaryKey */
    override val id: Rep[Long] = column[Long]("FRTRFNUM", O.AutoInc, O.PrimaryKey)
    /** Database column FRTRAGRFNUM SqlType(BIGINT) */
    val frtragrfnum: Rep[Long] = column[Long]("FRTRAGRFNUM")
    /** Database column FRTRATING SqlType(CHAR), Length(5,false) */
    val frtrating: Rep[String] = column[String]("FRTRATING", O.Length(5,varying=false))
    /** Database column FRTRATINGDATE SqlType(TIMESTAMP), Default(None) */
    val frtratingdate: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("FRTRATINGDATE", O.Default(None))
    /** Database column FRTSCHEMERANK SqlType(FLOAT), Default(None) */
    val frtschemerank: Rep[Option[Float]] = column[Option[Float]]("FRTSCHEMERANK", O.Default(None))




    /** Database column FRTSMTRFNUM SqlType(BIGINT) */
    val frtsmtrfnum: Rep[Long] = column[Long]("FRTSMTRFNUM")

    /** Foreign key referencing Fcrag (database name FK_FCFRT_FCRAG) */
    lazy val fcragFk = foreignKey("FK_FCFRT_FCRAG", frtragrfnum, Fcrag)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Fcsmt (database name FK_FCFRT_FCSMT) */
    lazy val fcsmtFk = foreignKey("FK_FCFRT_FCSMT", frtsmtrfnum, Fcsmt)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table Fcfrt */
  lazy val Fcfrt = new TableQuery(tag => new Fcfrt(tag))

  /** Entity class storing rows of table Fcfut
   *  @param futrfnum Database column FUTRFNUM SqlType(BIGINT), AutoInc, PrimaryKey
   *  @param futubdrfnum Database column FUTUBDRFNUM SqlType(BIGINT)
   *  @param futtaxpayeridno Database column FUTTAXPAYERIDNO SqlType(VARCHAR), Length(128,true), Default(None)
   *  @param futcndiddoctyperfnum Database column FUTCNDIDDOCTYPERFNUM SqlType(VARCHAR), Length(512,true), Default(None)
   *  @param futcndbirthcountryrfnum Database column FUTCNDBIRTHCOUNTRYRFNUM SqlType(BIGINT), Default(None)
   *  @param futcndtaxresidentrfnum Database column FUTCNDTAXRESIDENTRFNUM SqlType(BIGINT), Default(None)
   *  @param futisindiaresident Database column FUTISINDIARESIDENT SqlType(CHAR), Length(2,false), Default(None)
   *  @param futbirthcity Database column FUTBIRTHCITY SqlType(CHAR), Length(32,false), Default(None)
   *  @param futincorporationplace Database column FUTINCORPORATIONPLACE SqlType(CHAR), Length(32,false), Default(None)
   *  @param futcndincorpcountryrfnum Database column FUTCNDINCORPCOUNTRYRFNUM SqlType(BIGINT), Default(None)
   *  @param futcndincomeslabrfnum Database column FUTCNDINCOMESLABRFNUM SqlType(BIGINT), Default(None)
   *  @param futcndaddresstyperfnum Database column FUTCNDADDRESSTYPERFNUM SqlType(BIGINT), Default(None)
   *  @param futpoliticallyexposed Database column FUTPOLITICALLYEXPOSED SqlType(CHAR), Length(4,false), Default(None)
   *  @param futpoliticallyrelated Database column FUTPOLITICALLYRELATED SqlType(CHAR), Length(4,false), Default(None)
   *  @param futotherinfo Database column FUTOTHERINFO SqlType(VARCHAR), Length(256,true), Default(None)
   *  @param futnetworth Database column FUTNETWORTH SqlType(DOUBLE), Default(None)
   *  @param futiscorporate Database column FUTISCORPORATE SqlType(CHAR), Length(2,false), Default(None)
   *  @param futnetworthdate Database column FUTNETWORTHDATE SqlType(TIMESTAMP), Default(None)
   *  @param createdate 
   *  @param modifydate 
   *  @param createdby 
   *  @param lastmodifiedby  */
  case class FcfutRow(id: Long, futubdrfnum: Long, futtaxpayeridno: Option[String] = None, futcndiddoctyperfnum: Option[String] = None, futcndbirthcountryrfnum: Option[Long] = None, futcndtaxresidentrfnum: Option[Long] = None, futisindiaresident: Option[String] = None, futbirthcity: Option[String] = None, futincorporationplace: Option[String] = None, futcndincorpcountryrfnum: Option[Long] = None, futcndincomeslabrfnum: Option[Long] = None, futcndaddresstyperfnum: Option[Long] = None, futpoliticallyexposed: Option[String] = None, futpoliticallyrelated: Option[String] = None, futotherinfo: Option[String] = None, futnetworth: Option[Double] = None, futiscorporate: Option[String] = None, futnetworthdate: Option[java.sql.Timestamp] = None, createdate: Option[java.sql.Timestamp] = None, modifydate: java.sql.Timestamp, createdby: String, lastmodifiedby: String) extends BaseEntity 
  class FcfutRowWrapper(id: Option[Long], futubdrfnum: Long, futtaxpayeridno: Option[String] = None, futcndiddoctyperfnum: Option[String] = None, futcndbirthcountryrfnum: Option[Long] = None, futcndtaxresidentrfnum: Option[Long] = None, futisindiaresident: Option[String] = None, futbirthcity: Option[String] = None, futincorporationplace: Option[String] = None, futcndincorpcountryrfnum: Option[Long] = None, futcndincomeslabrfnum: Option[Long] = None, futcndaddresstyperfnum: Option[Long] = None, futpoliticallyexposed: Option[String] = None, futpoliticallyrelated: Option[String] = None, futotherinfo: Option[String] = None, futnetworth: Option[Double] = None, futiscorporate: Option[String] = None, futnetworthdate: Option[java.sql.Timestamp] = None) {
    def get(userName: String): FcfutRow = {
      FcfutRow(this.id.getOrElse(0), this.futubdrfnum, this.futtaxpayeridno, this.futcndiddoctyperfnum, this.futcndbirthcountryrfnum, this.futcndtaxresidentrfnum, this.futisindiaresident, this.futbirthcity, this.futincorporationplace, this.futcndincorpcountryrfnum, this.futcndincomeslabrfnum, this.futcndaddresstyperfnum, this.futpoliticallyexposed, this.futpoliticallyrelated, this.futotherinfo, this.futnetworth, this.futiscorporate, this.futnetworthdate, Some(DateTimeUtils.getCurrentTimeStamp), DateTimeUtils.getCurrentTimeStamp, userName, userName)
  	}
  }
  /** GetResult implicit for fetching FcfutRow objects using plain SQL queries */
  implicit def GetResultFcfutRow(implicit e0: GR[Long], e1: GR[Option[String]], e2: GR[Option[Long]], e3: GR[Option[Double]], e4: GR[Option[java.sql.Timestamp]], e5: GR[java.sql.Timestamp], e6: GR[String]): GR[FcfutRow] = GR{
    prs => import prs._
    FcfutRow.tupled((<<[Long], <<[Long], <<?[String], <<?[String], <<?[Long], <<?[Long], <<?[String], <<?[String], <<?[String], <<?[Long], <<?[Long], <<?[Long], <<?[String], <<?[String], <<?[String], <<?[Double], <<?[String], <<?[java.sql.Timestamp], <<?[java.sql.Timestamp], <<[java.sql.Timestamp], <<[String], <<[String]))
  }
  /** Table description of table FCFUT. Objects of this class serve as prototypes for rows in queries. */
  class Fcfut(_tableTag: Tag) extends BaseTable[FcfutRow](_tableTag, "FCFUT") {
    def * = (id, futubdrfnum, futtaxpayeridno, futcndiddoctyperfnum, futcndbirthcountryrfnum, futcndtaxresidentrfnum, futisindiaresident, futbirthcity, futincorporationplace, futcndincorpcountryrfnum, futcndincomeslabrfnum, futcndaddresstyperfnum, futpoliticallyexposed, futpoliticallyrelated, futotherinfo, futnetworth, futiscorporate, futnetworthdate, createdate, modifydate, createdby, lastmodifiedby) <> (FcfutRow.tupled, FcfutRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(futubdrfnum), futtaxpayeridno, futcndiddoctyperfnum, futcndbirthcountryrfnum, futcndtaxresidentrfnum, futisindiaresident, futbirthcity, futincorporationplace, futcndincorpcountryrfnum, futcndincomeslabrfnum, futcndaddresstyperfnum, futpoliticallyexposed, futpoliticallyrelated, futotherinfo, futnetworth, futiscorporate, futnetworthdate, createdate, Rep.Some(modifydate), Rep.Some(createdby), Rep.Some(lastmodifiedby)).shaped.<>({r=>import r._; _1.map(_=> FcfutRow.tupled((_1.get, _2.get, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13, _14, _15, _16, _17, _18, _19, _20.get, _21.get, _22.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column FUTRFNUM SqlType(BIGINT), AutoInc, PrimaryKey */
    override val id: Rep[Long] = column[Long]("FUTRFNUM", O.AutoInc, O.PrimaryKey)
    /** Database column FUTUBDRFNUM SqlType(BIGINT) */
    val futubdrfnum: Rep[Long] = column[Long]("FUTUBDRFNUM")
    /** Database column FUTTAXPAYERIDNO SqlType(VARCHAR), Length(128,true), Default(None) */
    val futtaxpayeridno: Rep[Option[String]] = column[Option[String]]("FUTTAXPAYERIDNO", O.Length(128,varying=true), O.Default(None))
    /** Database column FUTCNDIDDOCTYPERFNUM SqlType(VARCHAR), Length(512,true), Default(None) */
    val futcndiddoctyperfnum: Rep[Option[String]] = column[Option[String]]("FUTCNDIDDOCTYPERFNUM", O.Length(512,varying=true), O.Default(None))
    /** Database column FUTCNDBIRTHCOUNTRYRFNUM SqlType(BIGINT), Default(None) */
    val futcndbirthcountryrfnum: Rep[Option[Long]] = column[Option[Long]]("FUTCNDBIRTHCOUNTRYRFNUM", O.Default(None))
    /** Database column FUTCNDTAXRESIDENTRFNUM SqlType(BIGINT), Default(None) */
    val futcndtaxresidentrfnum: Rep[Option[Long]] = column[Option[Long]]("FUTCNDTAXRESIDENTRFNUM", O.Default(None))
    /** Database column FUTISINDIARESIDENT SqlType(CHAR), Length(2,false), Default(None) */
    val futisindiaresident: Rep[Option[String]] = column[Option[String]]("FUTISINDIARESIDENT", O.Length(2,varying=false), O.Default(None))
    /** Database column FUTBIRTHCITY SqlType(CHAR), Length(32,false), Default(None) */
    val futbirthcity: Rep[Option[String]] = column[Option[String]]("FUTBIRTHCITY", O.Length(32,varying=false), O.Default(None))
    /** Database column FUTINCORPORATIONPLACE SqlType(CHAR), Length(32,false), Default(None) */
    val futincorporationplace: Rep[Option[String]] = column[Option[String]]("FUTINCORPORATIONPLACE", O.Length(32,varying=false), O.Default(None))
    /** Database column FUTCNDINCORPCOUNTRYRFNUM SqlType(BIGINT), Default(None) */
    val futcndincorpcountryrfnum: Rep[Option[Long]] = column[Option[Long]]("FUTCNDINCORPCOUNTRYRFNUM", O.Default(None))
    /** Database column FUTCNDINCOMESLABRFNUM SqlType(BIGINT), Default(None) */
    val futcndincomeslabrfnum: Rep[Option[Long]] = column[Option[Long]]("FUTCNDINCOMESLABRFNUM", O.Default(None))
    /** Database column FUTCNDADDRESSTYPERFNUM SqlType(BIGINT), Default(None) */
    val futcndaddresstyperfnum: Rep[Option[Long]] = column[Option[Long]]("FUTCNDADDRESSTYPERFNUM", O.Default(None))
    /** Database column FUTPOLITICALLYEXPOSED SqlType(CHAR), Length(4,false), Default(None) */
    val futpoliticallyexposed: Rep[Option[String]] = column[Option[String]]("FUTPOLITICALLYEXPOSED", O.Length(4,varying=false), O.Default(None))
    /** Database column FUTPOLITICALLYRELATED SqlType(CHAR), Length(4,false), Default(None) */
    val futpoliticallyrelated: Rep[Option[String]] = column[Option[String]]("FUTPOLITICALLYRELATED", O.Length(4,varying=false), O.Default(None))
    /** Database column FUTOTHERINFO SqlType(VARCHAR), Length(256,true), Default(None) */
    val futotherinfo: Rep[Option[String]] = column[Option[String]]("FUTOTHERINFO", O.Length(256,varying=true), O.Default(None))
    /** Database column FUTNETWORTH SqlType(DOUBLE), Default(None) */
    val futnetworth: Rep[Option[Double]] = column[Option[Double]]("FUTNETWORTH", O.Default(None))
    /** Database column FUTISCORPORATE SqlType(CHAR), Length(2,false), Default(None) */
    val futiscorporate: Rep[Option[String]] = column[Option[String]]("FUTISCORPORATE", O.Length(2,varying=false), O.Default(None))
    /** Database column FUTNETWORTHDATE SqlType(TIMESTAMP), Default(None) */
    val futnetworthdate: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("FUTNETWORTHDATE", O.Default(None))





    /** Foreign key referencing Fccnd (database name FK_FCFUT_FCCND) */
    lazy val fccndFk1 = foreignKey("FK_FCFUT_FCCND", futcndaddresstyperfnum, Fccnd)(r => Rep.Some(r.id), onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Fccnd (database name FK_FCFUT_FCCND_02) */
    lazy val fccndFk2 = foreignKey("FK_FCFUT_FCCND_02", futcndbirthcountryrfnum, Fccnd)(r => Rep.Some(r.id), onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Fccnd (database name FK_FCFUT_FCCND_03) */
    lazy val fccndFk3 = foreignKey("FK_FCFUT_FCCND_03", futcndtaxresidentrfnum, Fccnd)(r => Rep.Some(r.id), onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Fccnd (database name FK_FCFUT_FCCND_04) */
    lazy val fccndFk4 = foreignKey("FK_FCFUT_FCCND_04", futcndincorpcountryrfnum, Fccnd)(r => Rep.Some(r.id), onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Fccnd (database name FK_FCFUT_FCCND_05) */
    lazy val fccndFk5 = foreignKey("FK_FCFUT_FCCND_05", futcndincomeslabrfnum, Fccnd)(r => Rep.Some(r.id), onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Fcubd (database name FK_FCFUT_FCUBD) */
    lazy val fcubdFk = foreignKey("FK_FCFUT_FCUBD", futubdrfnum, Fcubd)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table Fcfut */
  lazy val Fcfut = new TableQuery(tag => new Fcfut(tag))

  /** Entity class storing rows of table Fcholi
   *  @param holirfnum Database column HOLIRFNUM SqlType(BIGINT), AutoInc, PrimaryKey
   *  @param holiname Database column HOLINAME SqlType(VARCHAR), Length(128,true)
   *  @param holidate Database column HOLIDATE SqlType(DATE)
   *  @param holimarketsegment Database column HOLIMARKETSEGMENT SqlType(CHAR), Length(10,false), Default(None)
   *  @param holiamcrfnum Database column HOLIAMCRFNUM SqlType(BIGINT), Default(None)
   *  @param createdate 
   *  @param modifydate 
   *  @param createdby 
   *  @param lastmodifiedby  */
  case class FcholiRow(id: Long, holiname: String, holidate: java.sql.Date, holimarketsegment: Option[String] = None, holiamcrfnum: Option[Long] = None, createdate: Option[java.sql.Timestamp] = None, modifydate: java.sql.Timestamp, createdby: String, lastmodifiedby: String) extends BaseEntity 
  class FcholiRowWrapper(id: Option[Long], holiname: String, holidate: java.sql.Date, holimarketsegment: Option[String] = None, holiamcrfnum: Option[Long] = None) {
    def get(userName: String): FcholiRow = {
      FcholiRow(this.id.getOrElse(0), this.holiname, this.holidate, this.holimarketsegment, this.holiamcrfnum, Some(DateTimeUtils.getCurrentTimeStamp), DateTimeUtils.getCurrentTimeStamp, userName, userName)
  	}
  }
  /** GetResult implicit for fetching FcholiRow objects using plain SQL queries */
  implicit def GetResultFcholiRow(implicit e0: GR[Long], e1: GR[String], e2: GR[java.sql.Date], e3: GR[Option[String]], e4: GR[Option[Long]], e5: GR[Option[java.sql.Timestamp]], e6: GR[java.sql.Timestamp]): GR[FcholiRow] = GR{
    prs => import prs._
    FcholiRow.tupled((<<[Long], <<[String], <<[java.sql.Date], <<?[String], <<?[Long], <<?[java.sql.Timestamp], <<[java.sql.Timestamp], <<[String], <<[String]))
  }
  /** Table description of table FCHOLI. Objects of this class serve as prototypes for rows in queries. */
  class Fcholi(_tableTag: Tag) extends BaseTable[FcholiRow](_tableTag, "FCHOLI") {
    def * = (id, holiname, holidate, holimarketsegment, holiamcrfnum, createdate, modifydate, createdby, lastmodifiedby) <> (FcholiRow.tupled, FcholiRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(holiname), Rep.Some(holidate), holimarketsegment, holiamcrfnum, createdate, Rep.Some(modifydate), Rep.Some(createdby), Rep.Some(lastmodifiedby)).shaped.<>({r=>import r._; _1.map(_=> FcholiRow.tupled((_1.get, _2.get, _3.get, _4, _5, _6, _7.get, _8.get, _9.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column HOLIRFNUM SqlType(BIGINT), AutoInc, PrimaryKey */
    override val id: Rep[Long] = column[Long]("HOLIRFNUM", O.AutoInc, O.PrimaryKey)
    /** Database column HOLINAME SqlType(VARCHAR), Length(128,true) */
    val holiname: Rep[String] = column[String]("HOLINAME", O.Length(128,varying=true))
    /** Database column HOLIDATE SqlType(DATE) */
    val holidate: Rep[java.sql.Date] = column[java.sql.Date]("HOLIDATE")
    /** Database column HOLIMARKETSEGMENT SqlType(CHAR), Length(10,false), Default(None) */
    val holimarketsegment: Rep[Option[String]] = column[Option[String]]("HOLIMARKETSEGMENT", O.Length(10,varying=false), O.Default(None))
    /** Database column HOLIAMCRFNUM SqlType(BIGINT), Default(None) */
    val holiamcrfnum: Rep[Option[Long]] = column[Option[Long]]("HOLIAMCRFNUM", O.Default(None))





    /** Uniqueness Index over (holidate,holimarketsegment,holiamcrfnum) (database name HOLI_DATE_SEGMENT_UNQ) */
    val index1 = index("HOLI_DATE_SEGMENT_UNQ", (holidate, holimarketsegment, holiamcrfnum), unique=true)
  }
  /** Collection-like TableQuery object for table Fcholi */
  lazy val Fcholi = new TableQuery(tag => new Fcholi(tag))

  /** Entity class storing rows of table Fchspa
   *  @param hsparfnum Database column HSPARFNUM SqlType(BIGINT), AutoInc, PrimaryKey
   *  @param hspasoptrfnum Database column HSPASOPTRFNUM SqlType(BIGINT), Default(None)
   *  @param hspapstrfnum Database column HSPAPSTRFNUM SqlType(BIGINT), Default(None)
   *  @param hspacomment Database column HSPACOMMENT SqlType(VARCHAR), Length(128,true), Default(None)
   *  @param hspaweightage Database column HSPAWEIGHTAGE SqlType(FLOAT), Default(None)
   *  @param hspaisactive Database column HSPAISACTIVE SqlType(CHAR), Length(2,false)
   *  @param hspaaction Database column HSPAACTION SqlType(CHAR), Length(2,false), Default(None)
   *  @param hspaactdate Database column HSPAACTDATE SqlType(TIMESTAMP), Default(None)
   *  @param hsparatingonactdate Database column HSPARATINGONACTDATE SqlType(CHAR), Length(2,false), Default(None)
   *  @param createdate 
   *  @param modifydate 
   *  @param createdby 
   *  @param lastmodifiedby  */
  case class FchspaRow(id: Long, hspasoptrfnum: Option[Long] = None, hspapstrfnum: Option[Long] = None, hspacomment: Option[String] = None, hspaweightage: Option[Float] = None, hspaisactive: String, hspaaction: Option[String] = None, hspaactdate: Option[java.sql.Timestamp] = None, hsparatingonactdate: Option[String] = None, createdate: Option[java.sql.Timestamp] = None, modifydate: java.sql.Timestamp, createdby: String, lastmodifiedby: String) extends BaseEntity 
  class FchspaRowWrapper(id: Option[Long], hspasoptrfnum: Option[Long] = None, hspapstrfnum: Option[Long] = None, hspacomment: Option[String] = None, hspaweightage: Option[Float] = None, hspaisactive: String, hspaaction: Option[String] = None, hspaactdate: Option[java.sql.Timestamp] = None, hsparatingonactdate: Option[String] = None) {
    def get(userName: String): FchspaRow = {
      FchspaRow(this.id.getOrElse(0), this.hspasoptrfnum, this.hspapstrfnum, this.hspacomment, this.hspaweightage, this.hspaisactive, this.hspaaction, this.hspaactdate, this.hsparatingonactdate, Some(DateTimeUtils.getCurrentTimeStamp), DateTimeUtils.getCurrentTimeStamp, userName, userName)
  	}
  }
  /** GetResult implicit for fetching FchspaRow objects using plain SQL queries */
  implicit def GetResultFchspaRow(implicit e0: GR[Long], e1: GR[Option[Long]], e2: GR[Option[String]], e3: GR[Option[Float]], e4: GR[String], e5: GR[Option[java.sql.Timestamp]], e6: GR[java.sql.Timestamp]): GR[FchspaRow] = GR{
    prs => import prs._
    FchspaRow.tupled((<<[Long], <<?[Long], <<?[Long], <<?[String], <<?[Float], <<[String], <<?[String], <<?[java.sql.Timestamp], <<?[String], <<?[java.sql.Timestamp], <<[java.sql.Timestamp], <<[String], <<[String]))
  }
  /** Table description of table FCHSPA. Objects of this class serve as prototypes for rows in queries. */
  class Fchspa(_tableTag: Tag) extends BaseTable[FchspaRow](_tableTag, "FCHSPA") {
    def * = (id, hspasoptrfnum, hspapstrfnum, hspacomment, hspaweightage, hspaisactive, hspaaction, hspaactdate, hsparatingonactdate, createdate, modifydate, createdby, lastmodifiedby) <> (FchspaRow.tupled, FchspaRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), hspasoptrfnum, hspapstrfnum, hspacomment, hspaweightage, Rep.Some(hspaisactive), hspaaction, hspaactdate, hsparatingonactdate, createdate, Rep.Some(modifydate), Rep.Some(createdby), Rep.Some(lastmodifiedby)).shaped.<>({r=>import r._; _1.map(_=> FchspaRow.tupled((_1.get, _2, _3, _4, _5, _6.get, _7, _8, _9, _10, _11.get, _12.get, _13.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column HSPARFNUM SqlType(BIGINT), AutoInc, PrimaryKey */
    override val id: Rep[Long] = column[Long]("HSPARFNUM", O.AutoInc, O.PrimaryKey)
    /** Database column HSPASOPTRFNUM SqlType(BIGINT), Default(None) */
    val hspasoptrfnum: Rep[Option[Long]] = column[Option[Long]]("HSPASOPTRFNUM", O.Default(None))
    /** Database column HSPAPSTRFNUM SqlType(BIGINT), Default(None) */
    val hspapstrfnum: Rep[Option[Long]] = column[Option[Long]]("HSPAPSTRFNUM", O.Default(None))
    /** Database column HSPACOMMENT SqlType(VARCHAR), Length(128,true), Default(None) */
    val hspacomment: Rep[Option[String]] = column[Option[String]]("HSPACOMMENT", O.Length(128,varying=true), O.Default(None))
    /** Database column HSPAWEIGHTAGE SqlType(FLOAT), Default(None) */
    val hspaweightage: Rep[Option[Float]] = column[Option[Float]]("HSPAWEIGHTAGE", O.Default(None))
    /** Database column HSPAISACTIVE SqlType(CHAR), Length(2,false) */
    val hspaisactive: Rep[String] = column[String]("HSPAISACTIVE", O.Length(2,varying=false))
    /** Database column HSPAACTION SqlType(CHAR), Length(2,false), Default(None) */
    val hspaaction: Rep[Option[String]] = column[Option[String]]("HSPAACTION", O.Length(2,varying=false), O.Default(None))
    /** Database column HSPAACTDATE SqlType(TIMESTAMP), Default(None) */
    val hspaactdate: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("HSPAACTDATE", O.Default(None))
    /** Database column HSPARATINGONACTDATE SqlType(CHAR), Length(2,false), Default(None) */
    val hsparatingonactdate: Rep[Option[String]] = column[Option[String]]("HSPARATINGONACTDATE", O.Length(2,varying=false), O.Default(None))





    /** Foreign key referencing Fcpst (database name FK_FCSPA_FCPST) */
    lazy val fcpstFk = foreignKey("FK_FCSPA_FCPST", hspapstrfnum, Fcpst)(r => Rep.Some(r.id), onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Fcsopt (database name FK_FCHSPA_FCSOPT) */
    lazy val fcsoptFk = foreignKey("FK_FCHSPA_FCSOPT", hspasoptrfnum, Fcsopt)(r => Rep.Some(r.id), onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table Fchspa */
  lazy val Fchspa = new TableQuery(tag => new Fchspa(tag))

  /** Entity class storing rows of table Fcimt
   *  @param imtrfnum Database column IMTRFNUM SqlType(BIGINT), AutoInc, PrimaryKey
   *  @param imtintgratname Database column IMTINTGRATNAME SqlType(VARCHAR), Length(64,true)
   *  @param imtintgratactive Database column IMTINTGRATACTIVE SqlType(CHAR), Length(2,false)
   *  @param imtintgratdescrp Database column IMTINTGRATDESCRP SqlType(VARCHAR), Length(256,true), Default(None)
   *  @param createdate 
   *  @param modifydate 
   *  @param createdby 
   *  @param lastmodifiedby  */
  case class FcimtRow(id: Long, imtintgratname: String, imtintgratactive: String, imtintgratdescrp: Option[String] = None, createdate: Option[java.sql.Timestamp] = None, modifydate: java.sql.Timestamp, createdby: String, lastmodifiedby: String) extends BaseEntity 
  class FcimtRowWrapper(id: Option[Long], imtintgratname: String, imtintgratactive: String, imtintgratdescrp: Option[String] = None) {
    def get(userName: String): FcimtRow = {
      FcimtRow(this.id.getOrElse(0), this.imtintgratname, this.imtintgratactive, this.imtintgratdescrp, Some(DateTimeUtils.getCurrentTimeStamp), DateTimeUtils.getCurrentTimeStamp, userName, userName)
  	}
  }
  /** GetResult implicit for fetching FcimtRow objects using plain SQL queries */
  implicit def GetResultFcimtRow(implicit e0: GR[Long], e1: GR[String], e2: GR[Option[String]], e3: GR[Option[java.sql.Timestamp]], e4: GR[java.sql.Timestamp]): GR[FcimtRow] = GR{
    prs => import prs._
    FcimtRow.tupled((<<[Long], <<[String], <<[String], <<?[String], <<?[java.sql.Timestamp], <<[java.sql.Timestamp], <<[String], <<[String]))
  }
  /** Table description of table FCIMT. Objects of this class serve as prototypes for rows in queries. */
  class Fcimt(_tableTag: Tag) extends BaseTable[FcimtRow](_tableTag, "FCIMT") {
    def * = (id, imtintgratname, imtintgratactive, imtintgratdescrp, createdate, modifydate, createdby, lastmodifiedby) <> (FcimtRow.tupled, FcimtRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(imtintgratname), Rep.Some(imtintgratactive), imtintgratdescrp, createdate, Rep.Some(modifydate), Rep.Some(createdby), Rep.Some(lastmodifiedby)).shaped.<>({r=>import r._; _1.map(_=> FcimtRow.tupled((_1.get, _2.get, _3.get, _4, _5, _6.get, _7.get, _8.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column IMTRFNUM SqlType(BIGINT), AutoInc, PrimaryKey */
    override val id: Rep[Long] = column[Long]("IMTRFNUM", O.AutoInc, O.PrimaryKey)
    /** Database column IMTINTGRATNAME SqlType(VARCHAR), Length(64,true) */
    val imtintgratname: Rep[String] = column[String]("IMTINTGRATNAME", O.Length(64,varying=true))
    /** Database column IMTINTGRATACTIVE SqlType(CHAR), Length(2,false) */
    val imtintgratactive: Rep[String] = column[String]("IMTINTGRATACTIVE", O.Length(2,varying=false))
    /** Database column IMTINTGRATDESCRP SqlType(VARCHAR), Length(256,true), Default(None) */
    val imtintgratdescrp: Rep[Option[String]] = column[Option[String]]("IMTINTGRATDESCRP", O.Length(256,varying=true), O.Default(None))
  }
  /** Collection-like TableQuery object for table Fcimt */
  lazy val Fcimt = new TableQuery(tag => new Fcimt(tag))

  /** Entity class storing rows of table Fcipv
   *  @param ipvrfnum Database column IPVRFNUM SqlType(BIGINT), AutoInc, PrimaryKey
   *  @param ipvconnect Database column IPVCONNECT SqlType(CHAR), Length(2,false)
   *  @param ipvcallingdetails Database column IPVCALLINGDETAILS SqlType(VARCHAR), Length(64,true), Default(None)
   *  @param ipvlong Database column IPVLONG SqlType(DECIMAL), Default(None)
   *  @param ipvlatt Database column IPVLATT SqlType(DECIMAL), Default(None)
   *  @param ipvubdipvpersonrfnum Database column IPVUBDIPVPERSONRFNUM SqlType(BIGINT)
   *  @param ipvstatus Database column IPVSTATUS SqlType(CHAR), Length(2,false)
   *  @param ipvvideopath Database column IPVVIDEOPATH SqlType(VARCHAR), Length(256,true)
   *  @param ipvdatetime Database column IPVDATETIME SqlType(TIMESTAMP), Default(None)
   *  @param createdate 
   *  @param modifydate 
   *  @param createdby 
   *  @param lastmodifiedby  */
  case class FcipvRow(id: Long, ipvconnect: String, ipvcallingdetails: Option[String] = None, ipvlong: Option[scala.math.BigDecimal] = None, ipvlatt: Option[scala.math.BigDecimal] = None, ipvubdipvpersonrfnum: Long, ipvstatus: String, ipvvideopath: String, ipvdatetime: Option[java.sql.Timestamp] = None, createdate: Option[java.sql.Timestamp] = None, modifydate: java.sql.Timestamp, createdby: String, lastmodifiedby: String) extends BaseEntity 
  class FcipvRowWrapper(id: Option[Long], ipvconnect: String, ipvcallingdetails: Option[String] = None, ipvlong: Option[scala.math.BigDecimal] = None, ipvlatt: Option[scala.math.BigDecimal] = None, ipvubdipvpersonrfnum: Long, ipvstatus: String, ipvvideopath: String, ipvdatetime: Option[java.sql.Timestamp] = None) {
    def get(userName: String): FcipvRow = {
      FcipvRow(this.id.getOrElse(0), this.ipvconnect, this.ipvcallingdetails, this.ipvlong, this.ipvlatt, this.ipvubdipvpersonrfnum, this.ipvstatus, this.ipvvideopath, this.ipvdatetime, Some(DateTimeUtils.getCurrentTimeStamp), DateTimeUtils.getCurrentTimeStamp, userName, userName)
  	}
  }
  /** GetResult implicit for fetching FcipvRow objects using plain SQL queries */
  implicit def GetResultFcipvRow(implicit e0: GR[Long], e1: GR[String], e2: GR[Option[String]], e3: GR[Option[scala.math.BigDecimal]], e4: GR[Option[java.sql.Timestamp]], e5: GR[java.sql.Timestamp]): GR[FcipvRow] = GR{
    prs => import prs._
    FcipvRow.tupled((<<[Long], <<[String], <<?[String], <<?[scala.math.BigDecimal], <<?[scala.math.BigDecimal], <<[Long], <<[String], <<[String], <<?[java.sql.Timestamp], <<?[java.sql.Timestamp], <<[java.sql.Timestamp], <<[String], <<[String]))
  }
  /** Table description of table FCIPV. Objects of this class serve as prototypes for rows in queries. */
  class Fcipv(_tableTag: Tag) extends BaseTable[FcipvRow](_tableTag, "FCIPV") {
    def * = (id, ipvconnect, ipvcallingdetails, ipvlong, ipvlatt, ipvubdipvpersonrfnum, ipvstatus, ipvvideopath, ipvdatetime, createdate, modifydate, createdby, lastmodifiedby) <> (FcipvRow.tupled, FcipvRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(ipvconnect), ipvcallingdetails, ipvlong, ipvlatt, Rep.Some(ipvubdipvpersonrfnum), Rep.Some(ipvstatus), Rep.Some(ipvvideopath), ipvdatetime, createdate, Rep.Some(modifydate), Rep.Some(createdby), Rep.Some(lastmodifiedby)).shaped.<>({r=>import r._; _1.map(_=> FcipvRow.tupled((_1.get, _2.get, _3, _4, _5, _6.get, _7.get, _8.get, _9, _10, _11.get, _12.get, _13.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column IPVRFNUM SqlType(BIGINT), AutoInc, PrimaryKey */
    override val id: Rep[Long] = column[Long]("IPVRFNUM", O.AutoInc, O.PrimaryKey)
    /** Database column IPVCONNECT SqlType(CHAR), Length(2,false) */
    val ipvconnect: Rep[String] = column[String]("IPVCONNECT", O.Length(2,varying=false))
    /** Database column IPVCALLINGDETAILS SqlType(VARCHAR), Length(64,true), Default(None) */
    val ipvcallingdetails: Rep[Option[String]] = column[Option[String]]("IPVCALLINGDETAILS", O.Length(64,varying=true), O.Default(None))
    /** Database column IPVLONG SqlType(DECIMAL), Default(None) */
    val ipvlong: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("IPVLONG", O.Default(None))
    /** Database column IPVLATT SqlType(DECIMAL), Default(None) */
    val ipvlatt: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("IPVLATT", O.Default(None))
    /** Database column IPVUBDIPVPERSONRFNUM SqlType(BIGINT) */
    val ipvubdipvpersonrfnum: Rep[Long] = column[Long]("IPVUBDIPVPERSONRFNUM")
    /** Database column IPVSTATUS SqlType(CHAR), Length(2,false) */
    val ipvstatus: Rep[String] = column[String]("IPVSTATUS", O.Length(2,varying=false))
    /** Database column IPVVIDEOPATH SqlType(VARCHAR), Length(256,true) */
    val ipvvideopath: Rep[String] = column[String]("IPVVIDEOPATH", O.Length(256,varying=true))
    /** Database column IPVDATETIME SqlType(TIMESTAMP), Default(None) */
    val ipvdatetime: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("IPVDATETIME", O.Default(None))





    /** Foreign key referencing Fcubd (database name FK_FCIPV_FCUBD) */
    lazy val fcubdFk = foreignKey("FK_FCIPV_FCUBD", ipvubdipvpersonrfnum, Fcubd)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table Fcipv */
  lazy val Fcipv = new TableQuery(tag => new Fcipv(tag))

  /** Entity class storing rows of table Fcirql
   *  @param irqlrfnum Database column IRQLRFNUM SqlType(BIGINT), AutoInc, PrimaryKey
   *  @param irqlimtrfnum Database column IRQLIMTRFNUM SqlType(BIGINT)
   *  @param irqlreqparaname Database column IRQLREQPARANAME SqlType(VARCHAR), Length(256,true)
   *  @param irqlreqparavalue Database column IRQLREQPARAVALUE SqlType(VARCHAR), Length(4096,true)
   *  @param irqlintgrationid Database column IRQLINTGRATIONID SqlType(VARCHAR), Length(16,true), Default(None)
   *  @param createdate 
   *  @param modifydate 
   *  @param createdby 
   *  @param lastmodifiedby  */
  case class FcirqlRow(id: Long, irqlimtrfnum: Long, irqlreqparaname: String, irqlreqparavalue: String, irqlintgrationid: Option[String] = None, createdate: Option[java.sql.Timestamp] = None, modifydate: java.sql.Timestamp, createdby: String, lastmodifiedby: String) extends BaseEntity 
  class FcirqlRowWrapper(id: Option[Long], irqlimtrfnum: Long, irqlreqparaname: String, irqlreqparavalue: String, irqlintgrationid: Option[String] = None) {
    def get(userName: String): FcirqlRow = {
      FcirqlRow(this.id.getOrElse(0), this.irqlimtrfnum, this.irqlreqparaname, this.irqlreqparavalue, this.irqlintgrationid, Some(DateTimeUtils.getCurrentTimeStamp), DateTimeUtils.getCurrentTimeStamp, userName, userName)
  	}
  }
  /** GetResult implicit for fetching FcirqlRow objects using plain SQL queries */
  implicit def GetResultFcirqlRow(implicit e0: GR[Long], e1: GR[String], e2: GR[Option[String]], e3: GR[Option[java.sql.Timestamp]], e4: GR[java.sql.Timestamp]): GR[FcirqlRow] = GR{
    prs => import prs._
    FcirqlRow.tupled((<<[Long], <<[Long], <<[String], <<[String], <<?[String], <<?[java.sql.Timestamp], <<[java.sql.Timestamp], <<[String], <<[String]))
  }
  /** Table description of table FCIRQL. Objects of this class serve as prototypes for rows in queries. */
  class Fcirql(_tableTag: Tag) extends BaseTable[FcirqlRow](_tableTag, "FCIRQL") {
    def * = (id, irqlimtrfnum, irqlreqparaname, irqlreqparavalue, irqlintgrationid, createdate, modifydate, createdby, lastmodifiedby) <> (FcirqlRow.tupled, FcirqlRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(irqlimtrfnum), Rep.Some(irqlreqparaname), Rep.Some(irqlreqparavalue), irqlintgrationid, createdate, Rep.Some(modifydate), Rep.Some(createdby), Rep.Some(lastmodifiedby)).shaped.<>({r=>import r._; _1.map(_=> FcirqlRow.tupled((_1.get, _2.get, _3.get, _4.get, _5, _6, _7.get, _8.get, _9.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column IRQLRFNUM SqlType(BIGINT), AutoInc, PrimaryKey */
    override val id: Rep[Long] = column[Long]("IRQLRFNUM", O.AutoInc, O.PrimaryKey)
    /** Database column IRQLIMTRFNUM SqlType(BIGINT) */
    val irqlimtrfnum: Rep[Long] = column[Long]("IRQLIMTRFNUM")
    /** Database column IRQLREQPARANAME SqlType(VARCHAR), Length(256,true) */
    val irqlreqparaname: Rep[String] = column[String]("IRQLREQPARANAME", O.Length(256,varying=true))
    /** Database column IRQLREQPARAVALUE SqlType(VARCHAR), Length(4096,true) */
    val irqlreqparavalue: Rep[String] = column[String]("IRQLREQPARAVALUE", O.Length(4096,varying=true))
    /** Database column IRQLINTGRATIONID SqlType(VARCHAR), Length(16,true), Default(None) */
    val irqlintgrationid: Rep[Option[String]] = column[Option[String]]("IRQLINTGRATIONID", O.Length(16,varying=true), O.Default(None))





    /** Foreign key referencing Fcimt (database name FK_FCIRQL_FCIMT) */
    lazy val fcimtFk = foreignKey("FK_FCIRQL_FCIMT", irqlimtrfnum, Fcimt)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table Fcirql */
  lazy val Fcirql = new TableQuery(tag => new Fcirql(tag))

  /** Entity class storing rows of table Fcirsl
   *  @param irslrfnum Database column IRSLRFNUM SqlType(BIGINT), AutoInc, PrimaryKey
   *  @param irslimtrfnum Database column IRSLIMTRFNUM SqlType(BIGINT)
   *  @param irslintgrationid Database column IRSLINTGRATIONID SqlType(VARCHAR), Length(16,true), Default(None)
   *  @param irslrespparaname Database column IRSLRESPPARANAME SqlType(VARCHAR), Length(256,true)
   *  @param irslrespvaluename Database column IRSLRESPVALUENAME SqlType(VARCHAR), Length(4096,true)
   *  @param createdate 
   *  @param modifydate 
   *  @param createdby 
   *  @param lastmodifiedby  */
  case class FcirslRow(id: Long, irslimtrfnum: Long, irslintgrationid: Option[String] = None, irslrespparaname: String, irslrespvaluename: String, createdate: Option[java.sql.Timestamp] = None, modifydate: java.sql.Timestamp, createdby: String, lastmodifiedby: String) extends BaseEntity 
  class FcirslRowWrapper(id: Option[Long], irslimtrfnum: Long, irslintgrationid: Option[String] = None, irslrespparaname: String, irslrespvaluename: String) {
    def get(userName: String): FcirslRow = {
      FcirslRow(this.id.getOrElse(0), this.irslimtrfnum, this.irslintgrationid, this.irslrespparaname, this.irslrespvaluename, Some(DateTimeUtils.getCurrentTimeStamp), DateTimeUtils.getCurrentTimeStamp, userName, userName)
  	}
  }
  /** GetResult implicit for fetching FcirslRow objects using plain SQL queries */
  implicit def GetResultFcirslRow(implicit e0: GR[Long], e1: GR[Option[String]], e2: GR[String], e3: GR[Option[java.sql.Timestamp]], e4: GR[java.sql.Timestamp]): GR[FcirslRow] = GR{
    prs => import prs._
    FcirslRow.tupled((<<[Long], <<[Long], <<?[String], <<[String], <<[String], <<?[java.sql.Timestamp], <<[java.sql.Timestamp], <<[String], <<[String]))
  }
  /** Table description of table FCIRSL. Objects of this class serve as prototypes for rows in queries. */
  class Fcirsl(_tableTag: Tag) extends BaseTable[FcirslRow](_tableTag, "FCIRSL") {
    def * = (id, irslimtrfnum, irslintgrationid, irslrespparaname, irslrespvaluename, createdate, modifydate, createdby, lastmodifiedby) <> (FcirslRow.tupled, FcirslRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(irslimtrfnum), irslintgrationid, Rep.Some(irslrespparaname), Rep.Some(irslrespvaluename), createdate, Rep.Some(modifydate), Rep.Some(createdby), Rep.Some(lastmodifiedby)).shaped.<>({r=>import r._; _1.map(_=> FcirslRow.tupled((_1.get, _2.get, _3, _4.get, _5.get, _6, _7.get, _8.get, _9.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column IRSLRFNUM SqlType(BIGINT), AutoInc, PrimaryKey */
    override val id: Rep[Long] = column[Long]("IRSLRFNUM", O.AutoInc, O.PrimaryKey)
    /** Database column IRSLIMTRFNUM SqlType(BIGINT) */
    val irslimtrfnum: Rep[Long] = column[Long]("IRSLIMTRFNUM")
    /** Database column IRSLINTGRATIONID SqlType(VARCHAR), Length(16,true), Default(None) */
    val irslintgrationid: Rep[Option[String]] = column[Option[String]]("IRSLINTGRATIONID", O.Length(16,varying=true), O.Default(None))
    /** Database column IRSLRESPPARANAME SqlType(VARCHAR), Length(256,true) */
    val irslrespparaname: Rep[String] = column[String]("IRSLRESPPARANAME", O.Length(256,varying=true))
    /** Database column IRSLRESPVALUENAME SqlType(VARCHAR), Length(4096,true) */
    val irslrespvaluename: Rep[String] = column[String]("IRSLRESPVALUENAME", O.Length(4096,varying=true))





    /** Foreign key referencing Fcimt (database name FK_FCIRSL_FCIMT) */
    lazy val fcimtFk = foreignKey("FK_FCIRSL_FCIMT", irslimtrfnum, Fcimt)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table Fcirsl */
  lazy val Fcirsl = new TableQuery(tag => new Fcirsl(tag))

  /** Entity class storing rows of table Fckra
   *  @param krarfnum Database column KRARFNUM SqlType(BIGINT), AutoInc, PrimaryKey
   *  @param kraagency Database column KRAAGENCY SqlType(CHAR), Length(10,false)
   *  @param kradetails Database column KRADETAILS SqlType(VARCHAR), Length(128,true), Default(None)
   *  @param createdate 
   *  @param modifydate 
   *  @param createdby 
   *  @param lastmodifiedby  */
  case class FckraRow(id: Long, kraagency: String, kradetails: Option[String] = None, createdate: Option[java.sql.Timestamp] = None, modifydate: java.sql.Timestamp, createdby: String, lastmodifiedby: String) extends BaseEntity 
  class FckraRowWrapper(id: Option[Long], kraagency: String, kradetails: Option[String] = None) {
    def get(userName: String): FckraRow = {
      FckraRow(this.id.getOrElse(0), this.kraagency, this.kradetails, Some(DateTimeUtils.getCurrentTimeStamp), DateTimeUtils.getCurrentTimeStamp, userName, userName)
  	}
  }
  /** GetResult implicit for fetching FckraRow objects using plain SQL queries */
  implicit def GetResultFckraRow(implicit e0: GR[Long], e1: GR[String], e2: GR[Option[String]], e3: GR[Option[java.sql.Timestamp]], e4: GR[java.sql.Timestamp]): GR[FckraRow] = GR{
    prs => import prs._
    FckraRow.tupled((<<[Long], <<[String], <<?[String], <<?[java.sql.Timestamp], <<[java.sql.Timestamp], <<[String], <<[String]))
  }
  /** Table description of table FCKRA. Objects of this class serve as prototypes for rows in queries. */
  class Fckra(_tableTag: Tag) extends BaseTable[FckraRow](_tableTag, "FCKRA") {
    def * = (id, kraagency, kradetails, createdate, modifydate, createdby, lastmodifiedby) <> (FckraRow.tupled, FckraRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(kraagency), kradetails, createdate, Rep.Some(modifydate), Rep.Some(createdby), Rep.Some(lastmodifiedby)).shaped.<>({r=>import r._; _1.map(_=> FckraRow.tupled((_1.get, _2.get, _3, _4, _5.get, _6.get, _7.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column KRARFNUM SqlType(BIGINT), AutoInc, PrimaryKey */
    override val id: Rep[Long] = column[Long]("KRARFNUM", O.AutoInc, O.PrimaryKey)
    /** Database column KRAAGENCY SqlType(CHAR), Length(10,false) */
    val kraagency: Rep[String] = column[String]("KRAAGENCY", O.Length(10,varying=false))
    /** Database column KRADETAILS SqlType(VARCHAR), Length(128,true), Default(None) */
    val kradetails: Rep[Option[String]] = column[Option[String]]("KRADETAILS", O.Length(128,varying=true), O.Default(None))
  }
  /** Collection-like TableQuery object for table Fckra */
  lazy val Fckra = new TableQuery(tag => new Fckra(tag))

  /** Entity class storing rows of table Fckyc
   *  @param kycrfnum Database column KYCRFNUM SqlType(BIGINT), AutoInc, PrimaryKey
   *  @param kycubdrfnum Database column KYCUBDRFNUM SqlType(BIGINT)
   *  @param kycdmtrfnum Database column KYCDMTRFNUM SqlType(BIGINT), Default(None)
   *  @param kycamtrfnum Database column KYCAMTRFNUM SqlType(BIGINT), Default(None)
   *  @param kycipvrfnum Database column KYCIPVRFNUM SqlType(BIGINT), Default(None)
   *  @param kyckrarfnum Database column KYCKRARFNUM SqlType(BIGINT), Default(None)
   *  @param kycubduploadedby Database column KYCUBDUPLOADEDBY SqlType(BIGINT), Default(None)
   *  @param kycid Database column KYCID SqlType(CHAR), Length(16,false), Default(None)
   *  @param kycstatus Database column KYCSTATUS SqlType(CHAR), Length(2,false)
   *  @param kycotherfield Database column KYCOTHERFIELD SqlType(VARCHAR), Length(128,true), Default(None)
   *  @param kyctype Database column KYCTYPE SqlType(CHAR), Length(16,false), Default(None)
   *  @param kycremark Database column KYCREMARK SqlType(VARCHAR), Length(256,true), Default(None)
   *  @param kycdmtphoto Database column KYCDMTPHOTO SqlType(BIGINT), Default(None)
   *  @param kycdmtsignature Database column KYCDMTSIGNATURE SqlType(BIGINT), Default(None)
   *  @param kycidverification Database column KYCIDVERIFICATION SqlType(CHAR), Length(2,false), Default(UP)
   *  @param kycphotoverification Database column KYCPHOTOVERIFICATION SqlType(CHAR), Length(2,false), Default(UP)
   *  @param kycsignverification Database column KYCSIGNVERIFICATION SqlType(CHAR), Length(2,false), Default(UP)
   *  @param createdate 
   *  @param modifydate 
   *  @param createdby 
   *  @param lastmodifiedby  */
  case class FckycRow(id: Long, kycubdrfnum: Long, kycdmtrfnum: Option[Long] = None, kycamtrfnum: Option[Long] = None, kycipvrfnum: Option[Long] = None, kyckrarfnum: Option[Long] = None, kycubduploadedby: Option[Long] = None, kycid: Option[String] = None, kycstatus: String, kycotherfield: Option[String] = None, kyctype: Option[String] = None, kycremark: Option[String] = None, kycdmtphoto: Option[Long] = None, kycdmtsignature: Option[Long] = None, kycidverification: String = "UP", kycphotoverification: String = "UP", kycsignverification: String = "UP", createdate: Option[java.sql.Timestamp] = None, modifydate: java.sql.Timestamp, createdby: String, lastmodifiedby: String) extends BaseEntity 
  class FckycRowWrapper(id: Option[Long], kycubdrfnum: Long, kycdmtrfnum: Option[Long] = None, kycamtrfnum: Option[Long] = None, kycipvrfnum: Option[Long] = None, kyckrarfnum: Option[Long] = None, kycubduploadedby: Option[Long] = None, kycid: Option[String] = None, kycstatus: String, kycotherfield: Option[String] = None, kyctype: Option[String] = None, kycremark: Option[String] = None, kycdmtphoto: Option[Long] = None, kycdmtsignature: Option[Long] = None, kycidverification: String = "UP", kycphotoverification: String = "UP", kycsignverification: String = "UP") {
    def get(userName: String): FckycRow = {
      FckycRow(this.id.getOrElse(0), this.kycubdrfnum, this.kycdmtrfnum, this.kycamtrfnum, this.kycipvrfnum, this.kyckrarfnum, this.kycubduploadedby, this.kycid, this.kycstatus, this.kycotherfield, this.kyctype, this.kycremark, this.kycdmtphoto, this.kycdmtsignature, this.kycidverification, this.kycphotoverification, this.kycsignverification, Some(DateTimeUtils.getCurrentTimeStamp), DateTimeUtils.getCurrentTimeStamp, userName, userName)
  	}
  }
  /** GetResult implicit for fetching FckycRow objects using plain SQL queries */
  implicit def GetResultFckycRow(implicit e0: GR[Long], e1: GR[Option[Long]], e2: GR[Option[String]], e3: GR[String], e4: GR[Option[java.sql.Timestamp]], e5: GR[java.sql.Timestamp]): GR[FckycRow] = GR{
    prs => import prs._
    FckycRow.tupled((<<[Long], <<[Long], <<?[Long], <<?[Long], <<?[Long], <<?[Long], <<?[Long], <<?[String], <<[String], <<?[String], <<?[String], <<?[String], <<?[Long], <<?[Long], <<[String], <<[String], <<[String], <<?[java.sql.Timestamp], <<[java.sql.Timestamp], <<[String], <<[String]))
  }
  /** Table description of table FCKYC. Objects of this class serve as prototypes for rows in queries. */
  class Fckyc(_tableTag: Tag) extends BaseTable[FckycRow](_tableTag, "FCKYC") {
    def * = (id, kycubdrfnum, kycdmtrfnum, kycamtrfnum, kycipvrfnum, kyckrarfnum, kycubduploadedby, kycid, kycstatus, kycotherfield, kyctype, kycremark, kycdmtphoto, kycdmtsignature, kycidverification, kycphotoverification, kycsignverification, createdate, modifydate, createdby, lastmodifiedby) <> (FckycRow.tupled, FckycRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(kycubdrfnum), kycdmtrfnum, kycamtrfnum, kycipvrfnum, kyckrarfnum, kycubduploadedby, kycid, Rep.Some(kycstatus), kycotherfield, kyctype, kycremark, kycdmtphoto, kycdmtsignature, Rep.Some(kycidverification), Rep.Some(kycphotoverification), Rep.Some(kycsignverification), createdate, Rep.Some(modifydate), Rep.Some(createdby), Rep.Some(lastmodifiedby)).shaped.<>({r=>import r._; _1.map(_=> FckycRow.tupled((_1.get, _2.get, _3, _4, _5, _6, _7, _8, _9.get, _10, _11, _12, _13, _14, _15.get, _16.get, _17.get, _18, _19.get, _20.get, _21.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column KYCRFNUM SqlType(BIGINT), AutoInc, PrimaryKey */
    override val id: Rep[Long] = column[Long]("KYCRFNUM", O.AutoInc, O.PrimaryKey)
    /** Database column KYCUBDRFNUM SqlType(BIGINT) */
    val kycubdrfnum: Rep[Long] = column[Long]("KYCUBDRFNUM")
    /** Database column KYCDMTRFNUM SqlType(BIGINT), Default(None) */
    val kycdmtrfnum: Rep[Option[Long]] = column[Option[Long]]("KYCDMTRFNUM", O.Default(None))
    /** Database column KYCAMTRFNUM SqlType(BIGINT), Default(None) */
    val kycamtrfnum: Rep[Option[Long]] = column[Option[Long]]("KYCAMTRFNUM", O.Default(None))
    /** Database column KYCIPVRFNUM SqlType(BIGINT), Default(None) */
    val kycipvrfnum: Rep[Option[Long]] = column[Option[Long]]("KYCIPVRFNUM", O.Default(None))
    /** Database column KYCKRARFNUM SqlType(BIGINT), Default(None) */
    val kyckrarfnum: Rep[Option[Long]] = column[Option[Long]]("KYCKRARFNUM", O.Default(None))
    /** Database column KYCUBDUPLOADEDBY SqlType(BIGINT), Default(None) */
    val kycubduploadedby: Rep[Option[Long]] = column[Option[Long]]("KYCUBDUPLOADEDBY", O.Default(None))
    /** Database column KYCID SqlType(CHAR), Length(16,false), Default(None) */
    val kycid: Rep[Option[String]] = column[Option[String]]("KYCID", O.Length(16,varying=false), O.Default(None))
    /** Database column KYCSTATUS SqlType(CHAR), Length(2,false) */
    val kycstatus: Rep[String] = column[String]("KYCSTATUS", O.Length(2,varying=false))
    /** Database column KYCOTHERFIELD SqlType(VARCHAR), Length(128,true), Default(None) */
    val kycotherfield: Rep[Option[String]] = column[Option[String]]("KYCOTHERFIELD", O.Length(128,varying=true), O.Default(None))
    /** Database column KYCTYPE SqlType(CHAR), Length(16,false), Default(None) */
    val kyctype: Rep[Option[String]] = column[Option[String]]("KYCTYPE", O.Length(16,varying=false), O.Default(None))
    /** Database column KYCREMARK SqlType(VARCHAR), Length(256,true), Default(None) */
    val kycremark: Rep[Option[String]] = column[Option[String]]("KYCREMARK", O.Length(256,varying=true), O.Default(None))
    /** Database column KYCDMTPHOTO SqlType(BIGINT), Default(None) */
    val kycdmtphoto: Rep[Option[Long]] = column[Option[Long]]("KYCDMTPHOTO", O.Default(None))
    /** Database column KYCDMTSIGNATURE SqlType(BIGINT), Default(None) */
    val kycdmtsignature: Rep[Option[Long]] = column[Option[Long]]("KYCDMTSIGNATURE", O.Default(None))
    /** Database column KYCIDVERIFICATION SqlType(CHAR), Length(2,false), Default(UP) */
    val kycidverification: Rep[String] = column[String]("KYCIDVERIFICATION", O.Length(2,varying=false), O.Default("UP"))
    /** Database column KYCPHOTOVERIFICATION SqlType(CHAR), Length(2,false), Default(UP) */
    val kycphotoverification: Rep[String] = column[String]("KYCPHOTOVERIFICATION", O.Length(2,varying=false), O.Default("UP"))
    /** Database column KYCSIGNVERIFICATION SqlType(CHAR), Length(2,false), Default(UP) */
    val kycsignverification: Rep[String] = column[String]("KYCSIGNVERIFICATION", O.Length(2,varying=false), O.Default("UP"))





    /** Foreign key referencing Fcamt (database name FK_FCKYC_FCAMT) */
    lazy val fcamtFk = foreignKey("FK_FCKYC_FCAMT", kycamtrfnum, Fcamt)(r => Rep.Some(r.id), onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Fcdmt (database name FK_FCKYC_FCDMT) */
    lazy val fcdmtFk2 = foreignKey("FK_FCKYC_FCDMT", kycdmtrfnum, Fcdmt)(r => Rep.Some(r.id), onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Fcdmt (database name FK_FCKYC_FCDMT_02) */
    lazy val fcdmtFk3 = foreignKey("FK_FCKYC_FCDMT_02", kycdmtphoto, Fcdmt)(r => Rep.Some(r.id), onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Fcdmt (database name FK_FCKYC_FCDMT_03) */
    lazy val fcdmtFk4 = foreignKey("FK_FCKYC_FCDMT_03", kycdmtsignature, Fcdmt)(r => Rep.Some(r.id), onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Fcipv (database name FK_FCKYC_FCIPV) */
    lazy val fcipvFk = foreignKey("FK_FCKYC_FCIPV", kycipvrfnum, Fcipv)(r => Rep.Some(r.id), onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Fckra (database name FK_FCKYC_FCKRA) */
    lazy val fckraFk = foreignKey("FK_FCKYC_FCKRA", kyckrarfnum, Fckra)(r => Rep.Some(r.id), onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Fcubd (database name FK_FCKYC_FCUBD) */
    lazy val fcubdFk = foreignKey("FK_FCKYC_FCUBD", kycubdrfnum, Fcubd)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table Fckyc */
  lazy val Fckyc = new TableQuery(tag => new Fckyc(tag))

  /** Entity class storing rows of table Fclpsa
   *  @param lpsarfnum Database column LPSARFNUM SqlType(BIGINT), AutoInc, PrimaryKey
   *  @param lpsapstrfnum Database column LPSAPSTRFNUM SqlType(BIGINT), Default(None)
   *  @param lpsasmtrfnum Database column LPSASMTRFNUM SqlType(BIGINT), Default(None)
   *  @param lpsasequenceno Database column LPSASEQUENCENO SqlType(FLOAT)
   *  @param lpsainvestmentmode Database column LPSAINVESTMENTMODE SqlType(CHAR), Length(2,false), Default(None)
   *  @param lpsaweightage Database column LPSAWEIGHTAGE SqlType(FLOAT), Default(None)
   *  @param lpsasoptrfnum Database column LPSASOPTRFNUM SqlType(BIGINT)
   *  @param createdate 
   *  @param modifydate 
   *  @param createdby 
   *  @param lastmodifiedby  */
  case class FclpsaRow(id: Long, lpsapstrfnum: Option[Long] = None, lpsasmtrfnum: Option[Long] = None, lpsasequenceno: Float, lpsainvestmentmode: Option[String] = None, lpsaweightage: Option[Float] = None, lpsasoptrfnum: Long, createdate: Option[java.sql.Timestamp] = None, modifydate: java.sql.Timestamp, createdby: String, lastmodifiedby: String) extends BaseEntity 
  class FclpsaRowWrapper(id: Option[Long], lpsapstrfnum: Option[Long] = None, lpsasmtrfnum: Option[Long] = None, lpsasequenceno: Float, lpsainvestmentmode: Option[String] = None, lpsaweightage: Option[Float] = None, lpsasoptrfnum: Long) {
    def get(userName: String): FclpsaRow = {
      FclpsaRow(this.id.getOrElse(0), this.lpsapstrfnum, this.lpsasmtrfnum, this.lpsasequenceno, this.lpsainvestmentmode, this.lpsaweightage, this.lpsasoptrfnum, Some(DateTimeUtils.getCurrentTimeStamp), DateTimeUtils.getCurrentTimeStamp, userName, userName)
  	}
  }
  /** GetResult implicit for fetching FclpsaRow objects using plain SQL queries */
  implicit def GetResultFclpsaRow(implicit e0: GR[Long], e1: GR[Option[Long]], e2: GR[Float], e3: GR[Option[String]], e4: GR[Option[Float]], e5: GR[Option[java.sql.Timestamp]], e6: GR[java.sql.Timestamp], e7: GR[String]): GR[FclpsaRow] = GR{
    prs => import prs._
    FclpsaRow.tupled((<<[Long], <<?[Long], <<?[Long], <<[Float], <<?[String], <<?[Float], <<[Long], <<?[java.sql.Timestamp], <<[java.sql.Timestamp], <<[String], <<[String]))
  }
  /** Table description of table FCLPSA. Objects of this class serve as prototypes for rows in queries. */
  class Fclpsa(_tableTag: Tag) extends BaseTable[FclpsaRow](_tableTag, "FCLPSA") {
    def * = (id, lpsapstrfnum, lpsasmtrfnum, lpsasequenceno, lpsainvestmentmode, lpsaweightage, lpsasoptrfnum, createdate, modifydate, createdby, lastmodifiedby) <> (FclpsaRow.tupled, FclpsaRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), lpsapstrfnum, lpsasmtrfnum, Rep.Some(lpsasequenceno), lpsainvestmentmode, lpsaweightage, Rep.Some(lpsasoptrfnum), createdate, Rep.Some(modifydate), Rep.Some(createdby), Rep.Some(lastmodifiedby)).shaped.<>({r=>import r._; _1.map(_=> FclpsaRow.tupled((_1.get, _2, _3, _4.get, _5, _6, _7.get, _8, _9.get, _10.get, _11.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column LPSARFNUM SqlType(BIGINT), AutoInc, PrimaryKey */
    override val id: Rep[Long] = column[Long]("LPSARFNUM", O.AutoInc, O.PrimaryKey)
    /** Database column LPSAPSTRFNUM SqlType(BIGINT), Default(None) */
    val lpsapstrfnum: Rep[Option[Long]] = column[Option[Long]]("LPSAPSTRFNUM", O.Default(None))
    /** Database column LPSASMTRFNUM SqlType(BIGINT), Default(None) */
    val lpsasmtrfnum: Rep[Option[Long]] = column[Option[Long]]("LPSASMTRFNUM", O.Default(None))
    /** Database column LPSASEQUENCENO SqlType(FLOAT) */
    val lpsasequenceno: Rep[Float] = column[Float]("LPSASEQUENCENO")
    /** Database column LPSAINVESTMENTMODE SqlType(CHAR), Length(2,false), Default(None) */
    val lpsainvestmentmode: Rep[Option[String]] = column[Option[String]]("LPSAINVESTMENTMODE", O.Length(2,varying=false), O.Default(None))
    /** Database column LPSAWEIGHTAGE SqlType(FLOAT), Default(None) */
    val lpsaweightage: Rep[Option[Float]] = column[Option[Float]]("LPSAWEIGHTAGE", O.Default(None))
    /** Database column LPSASOPTRFNUM SqlType(BIGINT) */
    val lpsasoptrfnum: Rep[Long] = column[Long]("LPSASOPTRFNUM")





    /** Foreign key referencing Fcpst (database name FK_FCLPSA_FCPST) */
    lazy val fcpstFk = foreignKey("FK_FCLPSA_FCPST", lpsapstrfnum, Fcpst)(r => Rep.Some(r.id), onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Fcsopt (database name FK_FCLPSA_FCSOPT) */
    lazy val fcsoptFk = foreignKey("FK_FCLPSA_FCSOPT", lpsasoptrfnum, Fcsopt)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table Fclpsa */
  lazy val Fclpsa = new TableQuery(tag => new Fclpsa(tag))

  /** Entity class storing rows of table Fcmdt
   *  @param mdtrfnum Database column MDTRFNUM SqlType(BIGINT), AutoInc, PrimaryKey
   *  @param mdtstatus Database column MDTSTATUS SqlType(VARCHAR), Length(32,true) */
  case class FcmdtRow(id: Long, mdtstatus: String) extends BaseEntity 
  class FcmdtRowWrapper(id: Option[Long], mdtstatus: String) {
    def get(userName: String): FcmdtRow = {
      FcmdtRow(this.id.getOrElse(0), this.mdtstatus)
  	}
  }
  /** GetResult implicit for fetching FcmdtRow objects using plain SQL queries */
  implicit def GetResultFcmdtRow(implicit e0: GR[Long], e1: GR[String]): GR[FcmdtRow] = GR{
    prs => import prs._
    FcmdtRow.tupled((<<[Long], <<[String]))
  }
  /** Table description of table FCMDT. Objects of this class serve as prototypes for rows in queries. */
  class Fcmdt(_tableTag: Tag) extends BaseTable[FcmdtRow](_tableTag, "FCMDT") {
    def * = (id, mdtstatus) <> (FcmdtRow.tupled, FcmdtRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(mdtstatus)).shaped.<>({r=>import r._; _1.map(_=> FcmdtRow.tupled((_1.get, _2.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column MDTRFNUM SqlType(BIGINT), AutoInc, PrimaryKey */
    override val id: Rep[Long] = column[Long]("MDTRFNUM", O.AutoInc, O.PrimaryKey)
    /** Database column MDTSTATUS SqlType(VARCHAR), Length(32,true) */
    val mdtstatus: Rep[String] = column[String]("MDTSTATUS", O.Length(32,varying=true))
  }
  /** Collection-like TableQuery object for table Fcmdt */
  lazy val Fcmdt = new TableQuery(tag => new Fcmdt(tag))

  /** Entity class storing rows of table Fcmmt
   *  @param mmtrfnum Database column MMTRFNUM SqlType(BIGINT), AutoInc, PrimaryKey
   *  @param mmtamount Database column MMTAMOUNT SqlType(DOUBLE)
   *  @param mmtmandatetype Database column MMTMANDATETYPE SqlType(CHAR), Length(8,false), Default(None)
   *  @param mmtbuarfnum Database column MMTBUARFNUM SqlType(BIGINT)
   *  @param mmtdmtrfnum Database column MMTDMTRFNUM SqlType(BIGINT), Default(None)
   *  @param mmtumrn Database column MMTUMRN SqlType(CHAR), Length(16,false), Default(None)
   *  @param mmtdate Database column MMTDATE SqlType(TIMESTAMP), Default(None)
   *  @param mmtactiontype Database column MMTACTIONTYPE SqlType(CHAR), Length(12,false), Default(None)
   *  @param mmtfrequency Database column MMTFREQUENCY SqlType(CHAR), Length(20,false), Default(None)
   *  @param mmtdebittype Database column MMTDEBITTYPE SqlType(CHAR), Length(10,false), Default(None)
   *  @param mmtfromdate Database column MMTFROMDATE SqlType(TIMESTAMP), Default(None)
   *  @param mmttodate Database column MMTTODATE SqlType(TIMESTAMP), Default(None)
   *  @param mmtisuntilcancelled Database column MMTISUNTILCANCELLED SqlType(CHAR), Length(2,false), Default(None)
   *  @param mmtsponsorbankcode Database column MMTSPONSORBANKCODE SqlType(VARCHAR), Length(32,true), Default(None)
   *  @param mmtutilitycode Database column MMTUTILITYCODE SqlType(VARCHAR), Length(32,true), Default(None)
   *  @param mmtmandatestatus Database column MMTMANDATESTATUS SqlType(CHAR), Length(16,false), Default(None)
   *  @param mmtdeducteename Database column MMTDEDUCTEENAME SqlType(VARCHAR), Length(128,true)
   *  @param mmtexternalid Database column MMTEXTERNALID SqlType(CHAR), Length(64,false), Default(None)
   *  @param createdate 
   *  @param modifydate 
   *  @param createdby 
   *  @param lastmodifiedby  */
  case class FcmmtRow(id: Long, mmtamount: Double, mmtmandatetype: Option[String] = None, mmtbuarfnum: Long, mmtdmtrfnum: Option[Long] = None, mmtumrn: Option[String] = None, mmtdate: Option[java.sql.Timestamp] = None, mmtactiontype: Option[String] = None, mmtfrequency: Option[String] = None, mmtdebittype: Option[String] = None, mmtfromdate: Option[java.sql.Timestamp] = None, mmttodate: Option[java.sql.Timestamp] = None, mmtisuntilcancelled: Option[String] = None, mmtsponsorbankcode: Option[String] = None, mmtutilitycode: Option[String] = None, mmtmandatestatus: Option[String] = None, mmtdeducteename: String, mmtexternalid: Option[String] = None, createdate: Option[java.sql.Timestamp] = None, modifydate: java.sql.Timestamp, createdby: String, lastmodifiedby: String) extends BaseEntity 
  class FcmmtRowWrapper(id: Option[Long], mmtamount: Double, mmtmandatetype: Option[String] = None, mmtbuarfnum: Long, mmtdmtrfnum: Option[Long] = None, mmtumrn: Option[String] = None, mmtdate: Option[java.sql.Timestamp] = None, mmtactiontype: Option[String] = None, mmtfrequency: Option[String] = None, mmtdebittype: Option[String] = None, mmtfromdate: Option[java.sql.Timestamp] = None, mmttodate: Option[java.sql.Timestamp] = None, mmtisuntilcancelled: Option[String] = None, mmtsponsorbankcode: Option[String] = None, mmtutilitycode: Option[String] = None, mmtmandatestatus: Option[String] = None, mmtdeducteename: String, mmtexternalid: Option[String] = None) {
    def get(userName: String): FcmmtRow = {
      FcmmtRow(this.id.getOrElse(0), this.mmtamount, this.mmtmandatetype, this.mmtbuarfnum, this.mmtdmtrfnum, this.mmtumrn, this.mmtdate, this.mmtactiontype, this.mmtfrequency, this.mmtdebittype, this.mmtfromdate, this.mmttodate, this.mmtisuntilcancelled, this.mmtsponsorbankcode, this.mmtutilitycode, this.mmtmandatestatus, this.mmtdeducteename, this.mmtexternalid, Some(DateTimeUtils.getCurrentTimeStamp), DateTimeUtils.getCurrentTimeStamp, userName, userName)
  	}
  }
  /** GetResult implicit for fetching FcmmtRow objects using plain SQL queries */
  implicit def GetResultFcmmtRow(implicit e0: GR[Long], e1: GR[Double], e2: GR[Option[String]], e3: GR[Option[Long]], e4: GR[Option[java.sql.Timestamp]], e5: GR[String], e6: GR[java.sql.Timestamp]): GR[FcmmtRow] = GR{
    prs => import prs._
    FcmmtRow.tupled((<<[Long], <<[Double], <<?[String], <<[Long], <<?[Long], <<?[String], <<?[java.sql.Timestamp], <<?[String], <<?[String], <<?[String], <<?[java.sql.Timestamp], <<?[java.sql.Timestamp], <<?[String], <<?[String], <<?[String], <<?[String], <<[String], <<?[String], <<?[java.sql.Timestamp], <<[java.sql.Timestamp], <<[String], <<[String]))
  }
  /** Table description of table FCMMT. Objects of this class serve as prototypes for rows in queries. */
  class Fcmmt(_tableTag: Tag) extends BaseTable[FcmmtRow](_tableTag, "FCMMT") {
    def * = (id, mmtamount, mmtmandatetype, mmtbuarfnum, mmtdmtrfnum, mmtumrn, mmtdate, mmtactiontype, mmtfrequency, mmtdebittype, mmtfromdate, mmttodate, mmtisuntilcancelled, mmtsponsorbankcode, mmtutilitycode, mmtmandatestatus, mmtdeducteename, mmtexternalid, createdate, modifydate, createdby, lastmodifiedby) <> (FcmmtRow.tupled, FcmmtRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(mmtamount), mmtmandatetype, Rep.Some(mmtbuarfnum), mmtdmtrfnum, mmtumrn, mmtdate, mmtactiontype, mmtfrequency, mmtdebittype, mmtfromdate, mmttodate, mmtisuntilcancelled, mmtsponsorbankcode, mmtutilitycode, mmtmandatestatus, Rep.Some(mmtdeducteename), mmtexternalid, createdate, Rep.Some(modifydate), Rep.Some(createdby), Rep.Some(lastmodifiedby)).shaped.<>({r=>import r._; _1.map(_=> FcmmtRow.tupled((_1.get, _2.get, _3, _4.get, _5, _6, _7, _8, _9, _10, _11, _12, _13, _14, _15, _16, _17.get, _18, _19, _20.get, _21.get, _22.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column MMTRFNUM SqlType(BIGINT), AutoInc, PrimaryKey */
    override val id: Rep[Long] = column[Long]("MMTRFNUM", O.AutoInc, O.PrimaryKey)
    /** Database column MMTAMOUNT SqlType(DOUBLE) */
    val mmtamount: Rep[Double] = column[Double]("MMTAMOUNT")
    /** Database column MMTMANDATETYPE SqlType(CHAR), Length(8,false), Default(None) */
    val mmtmandatetype: Rep[Option[String]] = column[Option[String]]("MMTMANDATETYPE", O.Length(8,varying=false), O.Default(None))
    /** Database column MMTBUARFNUM SqlType(BIGINT) */
    val mmtbuarfnum: Rep[Long] = column[Long]("MMTBUARFNUM")
    /** Database column MMTDMTRFNUM SqlType(BIGINT), Default(None) */
    val mmtdmtrfnum: Rep[Option[Long]] = column[Option[Long]]("MMTDMTRFNUM", O.Default(None))
    /** Database column MMTUMRN SqlType(CHAR), Length(16,false), Default(None) */
    val mmtumrn: Rep[Option[String]] = column[Option[String]]("MMTUMRN", O.Length(16,varying=false), O.Default(None))
    /** Database column MMTDATE SqlType(TIMESTAMP), Default(None) */
    val mmtdate: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("MMTDATE", O.Default(None))
    /** Database column MMTACTIONTYPE SqlType(CHAR), Length(12,false), Default(None) */
    val mmtactiontype: Rep[Option[String]] = column[Option[String]]("MMTACTIONTYPE", O.Length(12,varying=false), O.Default(None))
    /** Database column MMTFREQUENCY SqlType(CHAR), Length(20,false), Default(None) */
    val mmtfrequency: Rep[Option[String]] = column[Option[String]]("MMTFREQUENCY", O.Length(20,varying=false), O.Default(None))
    /** Database column MMTDEBITTYPE SqlType(CHAR), Length(10,false), Default(None) */
    val mmtdebittype: Rep[Option[String]] = column[Option[String]]("MMTDEBITTYPE", O.Length(10,varying=false), O.Default(None))
    /** Database column MMTFROMDATE SqlType(TIMESTAMP), Default(None) */
    val mmtfromdate: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("MMTFROMDATE", O.Default(None))
    /** Database column MMTTODATE SqlType(TIMESTAMP), Default(None) */
    val mmttodate: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("MMTTODATE", O.Default(None))
    /** Database column MMTISUNTILCANCELLED SqlType(CHAR), Length(2,false), Default(None) */
    val mmtisuntilcancelled: Rep[Option[String]] = column[Option[String]]("MMTISUNTILCANCELLED", O.Length(2,varying=false), O.Default(None))
    /** Database column MMTSPONSORBANKCODE SqlType(VARCHAR), Length(32,true), Default(None) */
    val mmtsponsorbankcode: Rep[Option[String]] = column[Option[String]]("MMTSPONSORBANKCODE", O.Length(32,varying=true), O.Default(None))
    /** Database column MMTUTILITYCODE SqlType(VARCHAR), Length(32,true), Default(None) */
    val mmtutilitycode: Rep[Option[String]] = column[Option[String]]("MMTUTILITYCODE", O.Length(32,varying=true), O.Default(None))
    /** Database column MMTMANDATESTATUS SqlType(CHAR), Length(16,false), Default(None) */
    val mmtmandatestatus: Rep[Option[String]] = column[Option[String]]("MMTMANDATESTATUS", O.Length(16,varying=false), O.Default(None))
    /** Database column MMTDEDUCTEENAME SqlType(VARCHAR), Length(128,true) */
    val mmtdeducteename: Rep[String] = column[String]("MMTDEDUCTEENAME", O.Length(128,varying=true))
    /** Database column MMTEXTERNALID SqlType(CHAR), Length(64,false), Default(None) */
    val mmtexternalid: Rep[Option[String]] = column[Option[String]]("MMTEXTERNALID", O.Length(64,varying=false), O.Default(None))





    /** Foreign key referencing Fcbua (database name FK_FCMMT_FCBUA) */
    lazy val fcbuaFk = foreignKey("FK_FCMMT_FCBUA", mmtbuarfnum, Fcbua)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Fcdmt (database name FK_FCMMT_FCDMT) */
    lazy val fcdmtFk = foreignKey("FK_FCMMT_FCDMT", mmtdmtrfnum, Fcdmt)(r => Rep.Some(r.id), onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table Fcmmt */
  lazy val Fcmmt = new TableQuery(tag => new Fcmmt(tag))

  /** Entity class storing rows of table Fcmmtl
   *  @param mmtlrfnum Database column MMTLRFNUM SqlType(BIGINT), AutoInc, PrimaryKey
   *  @param mmtlmmtrfnum Database column MMTLMMTRFNUM SqlType(BIGINT)
   *  @param mmtlsotrfnum Database column MMTLSOTRFNUM SqlType(BIGINT), Default(None)
   *  @param mmtlsotamount Database column MMTLSOTAMOUNT SqlType(DOUBLE), Default(None)
   *  @param createdate 
   *  @param modifydate 
   *  @param createdby 
   *  @param lastmodifiedby  */
  case class FcmmtlRow(id: Long, mmtlmmtrfnum: Long, mmtlsotrfnum: Option[Long] = None, mmtlsotamount: Option[Double] = None, createdate: Option[java.sql.Timestamp] = None, modifydate: java.sql.Timestamp, createdby: String, lastmodifiedby: String) extends BaseEntity 
  class FcmmtlRowWrapper(id: Option[Long], mmtlmmtrfnum: Long, mmtlsotrfnum: Option[Long] = None, mmtlsotamount: Option[Double] = None) {
    def get(userName: String): FcmmtlRow = {
      FcmmtlRow(this.id.getOrElse(0), this.mmtlmmtrfnum, this.mmtlsotrfnum, this.mmtlsotamount, Some(DateTimeUtils.getCurrentTimeStamp), DateTimeUtils.getCurrentTimeStamp, userName, userName)
  	}
  }
  /** GetResult implicit for fetching FcmmtlRow objects using plain SQL queries */
  implicit def GetResultFcmmtlRow(implicit e0: GR[Long], e1: GR[Option[Long]], e2: GR[Option[Double]], e3: GR[Option[java.sql.Timestamp]], e4: GR[java.sql.Timestamp], e5: GR[String]): GR[FcmmtlRow] = GR{
    prs => import prs._
    FcmmtlRow.tupled((<<[Long], <<[Long], <<?[Long], <<?[Double], <<?[java.sql.Timestamp], <<[java.sql.Timestamp], <<[String], <<[String]))
  }
  /** Table description of table FCMMTL. Objects of this class serve as prototypes for rows in queries. */
  class Fcmmtl(_tableTag: Tag) extends BaseTable[FcmmtlRow](_tableTag, "FCMMTL") {
    def * = (id, mmtlmmtrfnum, mmtlsotrfnum, mmtlsotamount, createdate, modifydate, createdby, lastmodifiedby) <> (FcmmtlRow.tupled, FcmmtlRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(mmtlmmtrfnum), mmtlsotrfnum, mmtlsotamount, createdate, Rep.Some(modifydate), Rep.Some(createdby), Rep.Some(lastmodifiedby)).shaped.<>({r=>import r._; _1.map(_=> FcmmtlRow.tupled((_1.get, _2.get, _3, _4, _5, _6.get, _7.get, _8.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column MMTLRFNUM SqlType(BIGINT), AutoInc, PrimaryKey */
    override val id: Rep[Long] = column[Long]("MMTLRFNUM", O.AutoInc, O.PrimaryKey)
    /** Database column MMTLMMTRFNUM SqlType(BIGINT) */
    val mmtlmmtrfnum: Rep[Long] = column[Long]("MMTLMMTRFNUM")
    /** Database column MMTLSOTRFNUM SqlType(BIGINT), Default(None) */
    val mmtlsotrfnum: Rep[Option[Long]] = column[Option[Long]]("MMTLSOTRFNUM", O.Default(None))
    /** Database column MMTLSOTAMOUNT SqlType(DOUBLE), Default(None) */
    val mmtlsotamount: Rep[Option[Double]] = column[Option[Double]]("MMTLSOTAMOUNT", O.Default(None))





    /** Foreign key referencing Fcmmt (database name FK_FCMMTL_FCMMT) */
    lazy val fcmmtFk = foreignKey("FK_FCMMTL_FCMMT", mmtlmmtrfnum, Fcmmt)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Fcsot (database name FK_FCMMTL_FCSOT) */
    lazy val fcsotFk = foreignKey("FK_FCMMTL_FCSOT", mmtlsotrfnum, Fcsot)(r => Rep.Some(r.id), onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table Fcmmtl */
  lazy val Fcmmtl = new TableQuery(tag => new Fcmmtl(tag))

  /** Entity class storing rows of table Fcndt
   *  @param ndtrfnum Database column NDTRFNUM SqlType(BIGINT), AutoInc, PrimaryKey
   *  @param ndtnomineename Database column NDTNOMINEENAME SqlType(VARCHAR), Length(64,true), Default(None)
   *  @param ndtcndrelationshiprfnum Database column NDTCNDRELATIONSHIPRFNUM SqlType(BIGINT), Default(None)
   *  @param ndtdob Database column NDTDOB SqlType(DATE), Default(None)
   *  @param ndtamtaddressrfnum Database column NDTAMTADDRESSRFNUM SqlType(BIGINT), Default(None)
   *  @param ndtubdrfnum Database column NDTUBDRFNUM SqlType(BIGINT)
   *  @param createdate 
   *  @param modifydate 
   *  @param createdby 
   *  @param lastmodifiedby  */
  case class FcndtRow(id: Long, ndtnomineename: Option[String] = None, ndtcndrelationshiprfnum: Option[Long] = None, ndtdob: Option[java.sql.Date] = None, ndtamtaddressrfnum: Option[Long] = None, ndtubdrfnum: Long, createdate: Option[java.sql.Timestamp] = None, modifydate: java.sql.Timestamp, createdby: String, lastmodifiedby: String) extends BaseEntity 
  class FcndtRowWrapper(id: Option[Long], ndtnomineename: Option[String] = None, ndtcndrelationshiprfnum: Option[Long] = None, ndtdob: Option[java.sql.Date] = None, ndtamtaddressrfnum: Option[Long] = None, ndtubdrfnum: Long) {
    def get(userName: String): FcndtRow = {
      FcndtRow(this.id.getOrElse(0), this.ndtnomineename, this.ndtcndrelationshiprfnum, this.ndtdob, this.ndtamtaddressrfnum, this.ndtubdrfnum, Some(DateTimeUtils.getCurrentTimeStamp), DateTimeUtils.getCurrentTimeStamp, userName, userName)
  	}
  }
  /** GetResult implicit for fetching FcndtRow objects using plain SQL queries */
  implicit def GetResultFcndtRow(implicit e0: GR[Long], e1: GR[Option[String]], e2: GR[Option[Long]], e3: GR[Option[java.sql.Date]], e4: GR[Option[java.sql.Timestamp]], e5: GR[java.sql.Timestamp], e6: GR[String]): GR[FcndtRow] = GR{
    prs => import prs._
    FcndtRow.tupled((<<[Long], <<?[String], <<?[Long], <<?[java.sql.Date], <<?[Long], <<[Long], <<?[java.sql.Timestamp], <<[java.sql.Timestamp], <<[String], <<[String]))
  }
  /** Table description of table FCNDT. Objects of this class serve as prototypes for rows in queries. */
  class Fcndt(_tableTag: Tag) extends BaseTable[FcndtRow](_tableTag, "FCNDT") {
    def * = (id, ndtnomineename, ndtcndrelationshiprfnum, ndtdob, ndtamtaddressrfnum, ndtubdrfnum, createdate, modifydate, createdby, lastmodifiedby) <> (FcndtRow.tupled, FcndtRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), ndtnomineename, ndtcndrelationshiprfnum, ndtdob, ndtamtaddressrfnum, Rep.Some(ndtubdrfnum), createdate, Rep.Some(modifydate), Rep.Some(createdby), Rep.Some(lastmodifiedby)).shaped.<>({r=>import r._; _1.map(_=> FcndtRow.tupled((_1.get, _2, _3, _4, _5, _6.get, _7, _8.get, _9.get, _10.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column NDTRFNUM SqlType(BIGINT), AutoInc, PrimaryKey */
    override val id: Rep[Long] = column[Long]("NDTRFNUM", O.AutoInc, O.PrimaryKey)
    /** Database column NDTNOMINEENAME SqlType(VARCHAR), Length(64,true), Default(None) */
    val ndtnomineename: Rep[Option[String]] = column[Option[String]]("NDTNOMINEENAME", O.Length(64,varying=true), O.Default(None))
    /** Database column NDTCNDRELATIONSHIPRFNUM SqlType(BIGINT), Default(None) */
    val ndtcndrelationshiprfnum: Rep[Option[Long]] = column[Option[Long]]("NDTCNDRELATIONSHIPRFNUM", O.Default(None))
    /** Database column NDTDOB SqlType(DATE), Default(None) */
    val ndtdob: Rep[Option[java.sql.Date]] = column[Option[java.sql.Date]]("NDTDOB", O.Default(None))
    /** Database column NDTAMTADDRESSRFNUM SqlType(BIGINT), Default(None) */
    val ndtamtaddressrfnum: Rep[Option[Long]] = column[Option[Long]]("NDTAMTADDRESSRFNUM", O.Default(None))
    /** Database column NDTUBDRFNUM SqlType(BIGINT) */
    val ndtubdrfnum: Rep[Long] = column[Long]("NDTUBDRFNUM")





    /** Foreign key referencing Fcamt (database name FK_FCNDT_FCAMT) */
    lazy val fcamtFk = foreignKey("FK_FCNDT_FCAMT", ndtamtaddressrfnum, Fcamt)(r => Rep.Some(r.id), onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Fccnd (database name FK_FCNDT_FCCND) */
    lazy val fccndFk = foreignKey("FK_FCNDT_FCCND", ndtcndrelationshiprfnum, Fccnd)(r => Rep.Some(r.id), onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Fcubd (database name FK_FCNDT_FCUBD) */
    lazy val fcubdFk = foreignKey("FK_FCNDT_FCUBD", ndtubdrfnum, Fcubd)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table Fcndt */
  lazy val Fcndt = new TableQuery(tag => new Fcndt(tag))

  /** Entity class storing rows of table Fcoaf
   *  @param oafrfnum Database column OAFRFNUM SqlType(BIGINT), AutoInc, PrimaryKey
   *  @param oafamtrfnum Database column OAFAMTRFNUM SqlType(BIGINT)
   *  @param oafcountry Database column OAFCOUNTRY SqlType(VARCHAR), Length(256,true), Default(None)
   *  @param oafstate Database column OAFSTATE SqlType(VARCHAR), Length(256,true), Default(None)
   *  @param oafdistrict Database column OAFDISTRICT SqlType(VARCHAR), Length(256,true), Default(None)
   *  @param oafcity Database column OAFCITY SqlType(VARCHAR), Length(256,true), Default(None)
   *  @param oafpin Database column OAFPIN SqlType(VARCHAR), Length(256,true), Default(None)
   *  @param oafregion Database column OAFREGION SqlType(VARCHAR), Length(256,true), Default(None) */
  case class FcoafRow(id: Long, oafamtrfnum: Long, oafcountry: Option[String] = None, oafstate: Option[String] = None, oafdistrict: Option[String] = None, oafcity: Option[String] = None, oafpin: Option[String] = None, oafregion: Option[String] = None) extends BaseEntity 
  class FcoafRowWrapper(id: Option[Long], oafamtrfnum: Long, oafcountry: Option[String] = None, oafstate: Option[String] = None, oafdistrict: Option[String] = None, oafcity: Option[String] = None, oafpin: Option[String] = None, oafregion: Option[String] = None) {
    def get(userName: String): FcoafRow = {
      FcoafRow(this.id.getOrElse(0), this.oafamtrfnum, this.oafcountry, this.oafstate, this.oafdistrict, this.oafcity, this.oafpin, this.oafregion)
  	}
  }
  /** GetResult implicit for fetching FcoafRow objects using plain SQL queries */
  implicit def GetResultFcoafRow(implicit e0: GR[Long], e1: GR[Option[String]]): GR[FcoafRow] = GR{
    prs => import prs._
    FcoafRow.tupled((<<[Long], <<[Long], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String]))
  }
  /** Table description of table FCOAF. Objects of this class serve as prototypes for rows in queries. */
  class Fcoaf(_tableTag: Tag) extends BaseTable[FcoafRow](_tableTag, "FCOAF") {
    def * = (id, oafamtrfnum, oafcountry, oafstate, oafdistrict, oafcity, oafpin, oafregion) <> (FcoafRow.tupled, FcoafRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(oafamtrfnum), oafcountry, oafstate, oafdistrict, oafcity, oafpin, oafregion).shaped.<>({r=>import r._; _1.map(_=> FcoafRow.tupled((_1.get, _2.get, _3, _4, _5, _6, _7, _8)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column OAFRFNUM SqlType(BIGINT), AutoInc, PrimaryKey */
    override val id: Rep[Long] = column[Long]("OAFRFNUM", O.AutoInc, O.PrimaryKey)
    /** Database column OAFAMTRFNUM SqlType(BIGINT) */
    val oafamtrfnum: Rep[Long] = column[Long]("OAFAMTRFNUM")
    /** Database column OAFCOUNTRY SqlType(VARCHAR), Length(256,true), Default(None) */
    val oafcountry: Rep[Option[String]] = column[Option[String]]("OAFCOUNTRY", O.Length(256,varying=true), O.Default(None))
    /** Database column OAFSTATE SqlType(VARCHAR), Length(256,true), Default(None) */
    val oafstate: Rep[Option[String]] = column[Option[String]]("OAFSTATE", O.Length(256,varying=true), O.Default(None))
    /** Database column OAFDISTRICT SqlType(VARCHAR), Length(256,true), Default(None) */
    val oafdistrict: Rep[Option[String]] = column[Option[String]]("OAFDISTRICT", O.Length(256,varying=true), O.Default(None))
    /** Database column OAFCITY SqlType(VARCHAR), Length(256,true), Default(None) */
    val oafcity: Rep[Option[String]] = column[Option[String]]("OAFCITY", O.Length(256,varying=true), O.Default(None))
    /** Database column OAFPIN SqlType(VARCHAR), Length(256,true), Default(None) */
    val oafpin: Rep[Option[String]] = column[Option[String]]("OAFPIN", O.Length(256,varying=true), O.Default(None))
    /** Database column OAFREGION SqlType(VARCHAR), Length(256,true), Default(None) */
    val oafregion: Rep[Option[String]] = column[Option[String]]("OAFREGION", O.Length(256,varying=true), O.Default(None))

    /** Foreign key referencing Fcamt (database name FK_FCOAF_FCAMT) */
    lazy val fcamtFk = foreignKey("FK_FCOAF_FCAMT", oafamtrfnum, Fcamt)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table Fcoaf */
  lazy val Fcoaf = new TableQuery(tag => new Fcoaf(tag))

  /** Entity class storing rows of table Fcoht
   *  @param ohtrfnum Database column OHTRFNUM SqlType(BIGINT), AutoInc, PrimaryKey
   *  @param ohtostmfromstaterfnum Database column OHTOSTMFROMSTATERFNUM SqlType(BIGINT)
   *  @param ohtostmtostaterfnum Database column OHTOSTMTOSTATERFNUM SqlType(BIGINT)
   *  @param ohtremark Database column OHTREMARK SqlType(VARCHAR), Length(512,true), Default(None)
   *  @param ohtomtrfnum Database column OHTOMTRFNUM SqlType(BIGINT)
   *  @param ohtdateofstatechange Database column OHTDATEOFSTATECHANGE SqlType(TIMESTAMP), Default(None)
   *  @param createdate 
   *  @param modifydate 
   *  @param createdby 
   *  @param lastmodifiedby  */
  case class FcohtRow(id: Long, ohtostmfromstaterfnum: Long, ohtostmtostaterfnum: Long, ohtremark: Option[String] = None, ohtomtrfnum: Long, ohtdateofstatechange: Option[java.sql.Timestamp] = None, createdate: Option[java.sql.Timestamp] = None, modifydate: java.sql.Timestamp, createdby: String, lastmodifiedby: String) extends BaseEntity 
  class FcohtRowWrapper(id: Option[Long], ohtostmfromstaterfnum: Long, ohtostmtostaterfnum: Long, ohtremark: Option[String] = None, ohtomtrfnum: Long, ohtdateofstatechange: Option[java.sql.Timestamp] = None) {
    def get(userName: String): FcohtRow = {
      FcohtRow(this.id.getOrElse(0), this.ohtostmfromstaterfnum, this.ohtostmtostaterfnum, this.ohtremark, this.ohtomtrfnum, this.ohtdateofstatechange, Some(DateTimeUtils.getCurrentTimeStamp), DateTimeUtils.getCurrentTimeStamp, userName, userName)
  	}
  }
  /** GetResult implicit for fetching FcohtRow objects using plain SQL queries */
  implicit def GetResultFcohtRow(implicit e0: GR[Long], e1: GR[Option[String]], e2: GR[Option[java.sql.Timestamp]], e3: GR[java.sql.Timestamp], e4: GR[String]): GR[FcohtRow] = GR{
    prs => import prs._
    FcohtRow.tupled((<<[Long], <<[Long], <<[Long], <<?[String], <<[Long], <<?[java.sql.Timestamp], <<?[java.sql.Timestamp], <<[java.sql.Timestamp], <<[String], <<[String]))
  }
  /** Table description of table FCOHT. Objects of this class serve as prototypes for rows in queries. */
  class Fcoht(_tableTag: Tag) extends BaseTable[FcohtRow](_tableTag, "FCOHT") {
    def * = (id, ohtostmfromstaterfnum, ohtostmtostaterfnum, ohtremark, ohtomtrfnum, ohtdateofstatechange, createdate, modifydate, createdby, lastmodifiedby) <> (FcohtRow.tupled, FcohtRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(ohtostmfromstaterfnum), Rep.Some(ohtostmtostaterfnum), ohtremark, Rep.Some(ohtomtrfnum), ohtdateofstatechange, createdate, Rep.Some(modifydate), Rep.Some(createdby), Rep.Some(lastmodifiedby)).shaped.<>({r=>import r._; _1.map(_=> FcohtRow.tupled((_1.get, _2.get, _3.get, _4, _5.get, _6, _7, _8.get, _9.get, _10.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column OHTRFNUM SqlType(BIGINT), AutoInc, PrimaryKey */
    override val id: Rep[Long] = column[Long]("OHTRFNUM", O.AutoInc, O.PrimaryKey)
    /** Database column OHTOSTMFROMSTATERFNUM SqlType(BIGINT) */
    val ohtostmfromstaterfnum: Rep[Long] = column[Long]("OHTOSTMFROMSTATERFNUM")
    /** Database column OHTOSTMTOSTATERFNUM SqlType(BIGINT) */
    val ohtostmtostaterfnum: Rep[Long] = column[Long]("OHTOSTMTOSTATERFNUM")
    /** Database column OHTREMARK SqlType(VARCHAR), Length(512,true), Default(None) */
    val ohtremark: Rep[Option[String]] = column[Option[String]]("OHTREMARK", O.Length(512,varying=true), O.Default(None))
    /** Database column OHTOMTRFNUM SqlType(BIGINT) */
    val ohtomtrfnum: Rep[Long] = column[Long]("OHTOMTRFNUM")
    /** Database column OHTDATEOFSTATECHANGE SqlType(TIMESTAMP), Default(None) */
    val ohtdateofstatechange: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("OHTDATEOFSTATECHANGE", O.Default(None))





    /** Foreign key referencing Fcomt (database name FK_FCOHT_FCOMT) */
    lazy val fcomtFk = foreignKey("FK_FCOHT_FCOMT", ohtomtrfnum, Fcomt)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Fcostm (database name FK_FCOHT_FCOSTM) */
    lazy val fcostmFk2 = foreignKey("FK_FCOHT_FCOSTM", ohtostmtostaterfnum, Fcostm)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Fcostm (database name FK_FCOHT_FCOSTM_02) */
    lazy val fcostmFk3 = foreignKey("FK_FCOHT_FCOSTM_02", ohtostmfromstaterfnum, Fcostm)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table Fcoht */
  lazy val Fcoht = new TableQuery(tag => new Fcoht(tag))

  /** Entity class storing rows of table Fcolt
   *  @param oltrfnum Database column OLTRFNUM SqlType(BIGINT), AutoInc, PrimaryKey */
  case class FcoltRow(id: Long) extends BaseEntity 
  class FcoltRowWrapper(id: Option[Long]) {
    def get(userName: String): FcoltRow = {
      FcoltRow(this.id.getOrElse(0))
  	}
  }
  /** GetResult implicit for fetching FcoltRow objects using plain SQL queries */
  implicit def GetResultFcoltRow(implicit e0: GR[Long]): GR[FcoltRow] = GR{
    prs => import prs._
    FcoltRow(<<[Long])
  }
  /** Table description of table FCOLT. Objects of this class serve as prototypes for rows in queries. */
  class Fcolt(_tableTag: Tag) extends BaseTable[FcoltRow](_tableTag, "FCOLT") {
    def * = id <> (FcoltRow, FcoltRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = Rep.Some(id).shaped.<>(r => r.map(_=> FcoltRow(r.get)), (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column OLTRFNUM SqlType(BIGINT), AutoInc, PrimaryKey */
    override val id: Rep[Long] = column[Long]("OLTRFNUM", O.AutoInc, O.PrimaryKey)
  }
  /** Collection-like TableQuery object for table Fcolt */
  lazy val Fcolt = new TableQuery(tag => new Fcolt(tag))

  /** Entity class storing rows of table Fcomt
   *  @param omtrfnum Database column OMTRFNUM SqlType(BIGINT), AutoInc, PrimaryKey
   *  @param omtbuysell Database column OMTBUYSELL SqlType(CHAR), Length(2,false)
   *  @param omtdptranscn Database column OMTDPTRANSCN SqlType(CHAR), Length(2,false)
   *  @param omtremark Database column OMTREMARK SqlType(VARCHAR), Length(256,true), Default(None)
   *  @param omtrefnum Database column OMTREFNUM SqlType(VARCHAR), Length(50,true), Default(None)
   *  @param omtipadd Database column OMTIPADD SqlType(CHAR), Length(20,false), Default(None)
   *  @param omtorderdevice Database column OMTORDERDEVICE SqlType(CHAR), Length(2,false), Default(None)
   *  @param omtostmstaterfnum Database column OMTOSTMSTATERFNUM SqlType(BIGINT)
   *  @param omtubdrfnum Database column OMTUBDRFNUM SqlType(BIGINT)
   *  @param omtsnapshotpath Database column OMTSNAPSHOTPATH SqlType(VARCHAR), Length(1024,true), Default(None)
   *  @param omttotalamount Database column OMTTOTALAMOUNT SqlType(DOUBLE)
   *  @param createdate 
   *  @param modifydate 
   *  @param createdby 
   *  @param lastmodifiedby  */
  case class FcomtRow(id: Long, omtbuysell: String, omtdptranscn: String, omtremark: Option[String] = None, omtrefnum: Option[String] = None, omtipadd: Option[String] = None, omtorderdevice: Option[String] = None, omtostmstaterfnum: Long, omtubdrfnum: Long, omtsnapshotpath: Option[String] = None, omttotalamount: Double, createdate: Option[java.sql.Timestamp] = None, modifydate: java.sql.Timestamp, createdby: String, lastmodifiedby: String) extends BaseEntity 
  class FcomtRowWrapper(id: Option[Long], omtbuysell: String, omtdptranscn: String, omtremark: Option[String] = None, omtrefnum: Option[String] = None, omtipadd: Option[String] = None, omtorderdevice: Option[String] = None, omtostmstaterfnum: Long, omtubdrfnum: Long, omtsnapshotpath: Option[String] = None, omttotalamount: Double) {
    def get(userName: String): FcomtRow = {
      FcomtRow(this.id.getOrElse(0), this.omtbuysell, this.omtdptranscn, this.omtremark, this.omtrefnum, this.omtipadd, this.omtorderdevice, this.omtostmstaterfnum, this.omtubdrfnum, this.omtsnapshotpath, this.omttotalamount, Some(DateTimeUtils.getCurrentTimeStamp), DateTimeUtils.getCurrentTimeStamp, userName, userName)
  	}
  }
  /** GetResult implicit for fetching FcomtRow objects using plain SQL queries */
  implicit def GetResultFcomtRow(implicit e0: GR[Long], e1: GR[String], e2: GR[Option[String]], e3: GR[Double], e4: GR[Option[java.sql.Timestamp]], e5: GR[java.sql.Timestamp]): GR[FcomtRow] = GR{
    prs => import prs._
    FcomtRow.tupled((<<[Long], <<[String], <<[String], <<?[String], <<?[String], <<?[String], <<?[String], <<[Long], <<[Long], <<?[String], <<[Double], <<?[java.sql.Timestamp], <<[java.sql.Timestamp], <<[String], <<[String]))
  }
  /** Table description of table FCOMT. Objects of this class serve as prototypes for rows in queries. */
  class Fcomt(_tableTag: Tag) extends BaseTable[FcomtRow](_tableTag, "FCOMT") {
    def * = (id, omtbuysell, omtdptranscn, omtremark, omtrefnum, omtipadd, omtorderdevice, omtostmstaterfnum, omtubdrfnum, omtsnapshotpath, omttotalamount, createdate, modifydate, createdby, lastmodifiedby) <> (FcomtRow.tupled, FcomtRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(omtbuysell), Rep.Some(omtdptranscn), omtremark, omtrefnum, omtipadd, omtorderdevice, Rep.Some(omtostmstaterfnum), Rep.Some(omtubdrfnum), omtsnapshotpath, Rep.Some(omttotalamount), createdate, Rep.Some(modifydate), Rep.Some(createdby), Rep.Some(lastmodifiedby)).shaped.<>({r=>import r._; _1.map(_=> FcomtRow.tupled((_1.get, _2.get, _3.get, _4, _5, _6, _7, _8.get, _9.get, _10, _11.get, _12, _13.get, _14.get, _15.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column OMTRFNUM SqlType(BIGINT), AutoInc, PrimaryKey */
    override val id: Rep[Long] = column[Long]("OMTRFNUM", O.AutoInc, O.PrimaryKey)
    /** Database column OMTBUYSELL SqlType(CHAR), Length(2,false) */
    val omtbuysell: Rep[String] = column[String]("OMTBUYSELL", O.Length(2,varying=false))
    /** Database column OMTDPTRANSCN SqlType(CHAR), Length(2,false) */
    val omtdptranscn: Rep[String] = column[String]("OMTDPTRANSCN", O.Length(2,varying=false))
    /** Database column OMTREMARK SqlType(VARCHAR), Length(256,true), Default(None) */
    val omtremark: Rep[Option[String]] = column[Option[String]]("OMTREMARK", O.Length(256,varying=true), O.Default(None))
    /** Database column OMTREFNUM SqlType(VARCHAR), Length(50,true), Default(None) */
    val omtrefnum: Rep[Option[String]] = column[Option[String]]("OMTREFNUM", O.Length(50,varying=true), O.Default(None))
    /** Database column OMTIPADD SqlType(CHAR), Length(20,false), Default(None) */
    val omtipadd: Rep[Option[String]] = column[Option[String]]("OMTIPADD", O.Length(20,varying=false), O.Default(None))
    /** Database column OMTORDERDEVICE SqlType(CHAR), Length(2,false), Default(None) */
    val omtorderdevice: Rep[Option[String]] = column[Option[String]]("OMTORDERDEVICE", O.Length(2,varying=false), O.Default(None))
    /** Database column OMTOSTMSTATERFNUM SqlType(BIGINT) */
    val omtostmstaterfnum: Rep[Long] = column[Long]("OMTOSTMSTATERFNUM")
    /** Database column OMTUBDRFNUM SqlType(BIGINT) */
    val omtubdrfnum: Rep[Long] = column[Long]("OMTUBDRFNUM")
    /** Database column OMTSNAPSHOTPATH SqlType(VARCHAR), Length(1024,true), Default(None) */
    val omtsnapshotpath: Rep[Option[String]] = column[Option[String]]("OMTSNAPSHOTPATH", O.Length(1024,varying=true), O.Default(None))
    /** Database column OMTTOTALAMOUNT SqlType(DOUBLE) */
    val omttotalamount: Rep[Double] = column[Double]("OMTTOTALAMOUNT")





    /** Foreign key referencing Fcostm (database name FK_FCOMT_FCOSTM) */
    lazy val fcostmFk = foreignKey("FK_FCOMT_FCOSTM", omtostmstaterfnum, Fcostm)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Fcubd (database name FK_FCOMT_FCUBD) */
    lazy val fcubdFk = foreignKey("FK_FCOMT_FCUBD", omtubdrfnum, Fcubd)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table Fcomt */
  lazy val Fcomt = new TableQuery(tag => new Fcomt(tag))

  /** Entity class storing rows of table Fcopd
   *  @param opdrfnum Database column OPDRFNUM SqlType(BIGINT), AutoInc, PrimaryKey
   *  @param opdbankname Database column OPDBANKNAME SqlType(CHAR), Length(128,false), Default(None)
   *  @param opdpaymentstatus Database column OPDPAYMENTSTATUS SqlType(CHAR), Length(16,false)
   *  @param opdpaymenttime Database column OPDPAYMENTTIME SqlType(TIMESTAMP), Default(None)
   *  @param opdinternalrefnum Database column OPDINTERNALREFNUM SqlType(CHAR), Length(16,false), Default(None)
   *  @param opdpaymentid Database column OPDPAYMENTID SqlType(CHAR), Length(16,false), Default(None)
   *  @param opdsotrfnum Database column OPDSOTRFNUM SqlType(BIGINT)
   *  @param createdate 
   *  @param modifydate 
   *  @param createdby 
   *  @param lastmodifiedby  */
  case class FcopdRow(id: Long, opdbankname: Option[String] = None, opdpaymentstatus: String, opdpaymenttime: Option[java.sql.Timestamp] = None, opdinternalrefnum: Option[String] = None, opdpaymentid: Option[String] = None, opdsotrfnum: Long, createdate: Option[java.sql.Timestamp] = None, modifydate: java.sql.Timestamp, createdby: String, lastmodifiedby: String) extends BaseEntity 
  class FcopdRowWrapper(id: Option[Long], opdbankname: Option[String] = None, opdpaymentstatus: String, opdpaymenttime: Option[java.sql.Timestamp] = None, opdinternalrefnum: Option[String] = None, opdpaymentid: Option[String] = None, opdsotrfnum: Long) {
    def get(userName: String): FcopdRow = {
      FcopdRow(this.id.getOrElse(0), this.opdbankname, this.opdpaymentstatus, this.opdpaymenttime, this.opdinternalrefnum, this.opdpaymentid, this.opdsotrfnum, Some(DateTimeUtils.getCurrentTimeStamp), DateTimeUtils.getCurrentTimeStamp, userName, userName)
  	}
  }
  /** GetResult implicit for fetching FcopdRow objects using plain SQL queries */
  implicit def GetResultFcopdRow(implicit e0: GR[Long], e1: GR[Option[String]], e2: GR[String], e3: GR[Option[java.sql.Timestamp]], e4: GR[java.sql.Timestamp]): GR[FcopdRow] = GR{
    prs => import prs._
    FcopdRow.tupled((<<[Long], <<?[String], <<[String], <<?[java.sql.Timestamp], <<?[String], <<?[String], <<[Long], <<?[java.sql.Timestamp], <<[java.sql.Timestamp], <<[String], <<[String]))
  }
  /** Table description of table FCOPD. Objects of this class serve as prototypes for rows in queries. */
  class Fcopd(_tableTag: Tag) extends BaseTable[FcopdRow](_tableTag, "FCOPD") {
    def * = (id, opdbankname, opdpaymentstatus, opdpaymenttime, opdinternalrefnum, opdpaymentid, opdsotrfnum, createdate, modifydate, createdby, lastmodifiedby) <> (FcopdRow.tupled, FcopdRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), opdbankname, Rep.Some(opdpaymentstatus), opdpaymenttime, opdinternalrefnum, opdpaymentid, Rep.Some(opdsotrfnum), createdate, Rep.Some(modifydate), Rep.Some(createdby), Rep.Some(lastmodifiedby)).shaped.<>({r=>import r._; _1.map(_=> FcopdRow.tupled((_1.get, _2, _3.get, _4, _5, _6, _7.get, _8, _9.get, _10.get, _11.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column OPDRFNUM SqlType(BIGINT), AutoInc, PrimaryKey */
    override val id: Rep[Long] = column[Long]("OPDRFNUM", O.AutoInc, O.PrimaryKey)
    /** Database column OPDBANKNAME SqlType(CHAR), Length(128,false), Default(None) */
    val opdbankname: Rep[Option[String]] = column[Option[String]]("OPDBANKNAME", O.Length(128,varying=false), O.Default(None))
    /** Database column OPDPAYMENTSTATUS SqlType(CHAR), Length(16,false) */
    val opdpaymentstatus: Rep[String] = column[String]("OPDPAYMENTSTATUS", O.Length(16,varying=false))
    /** Database column OPDPAYMENTTIME SqlType(TIMESTAMP), Default(None) */
    val opdpaymenttime: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("OPDPAYMENTTIME", O.Default(None))
    /** Database column OPDINTERNALREFNUM SqlType(CHAR), Length(16,false), Default(None) */
    val opdinternalrefnum: Rep[Option[String]] = column[Option[String]]("OPDINTERNALREFNUM", O.Length(16,varying=false), O.Default(None))
    /** Database column OPDPAYMENTID SqlType(CHAR), Length(16,false), Default(None) */
    val opdpaymentid: Rep[Option[String]] = column[Option[String]]("OPDPAYMENTID", O.Length(16,varying=false), O.Default(None))
    /** Database column OPDSOTRFNUM SqlType(BIGINT) */
    val opdsotrfnum: Rep[Long] = column[Long]("OPDSOTRFNUM")





    /** Foreign key referencing Fcsot (database name FK_FCOPD_FCSOT) */
    lazy val fcsotFk = foreignKey("FK_FCOPD_FCSOT", opdsotrfnum, Fcsot)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table Fcopd */
  lazy val Fcopd = new TableQuery(tag => new Fcopd(tag))

  /** Entity class storing rows of table Fcosht
   *  @param oshtrfnum Database column OSHTRFNUM SqlType(BIGINT), AutoInc, PrimaryKey
   *  @param oshtostfromrfnum Database column OSHTOSTFROMRFNUM SqlType(BIGINT)
   *  @param oshtostmtorfnum Database column OSHTOSTMTORFNUM SqlType(BIGINT)
   *  @param oshtdatestatechange Database column OSHTDATESTATECHANGE SqlType(TIMESTAMP), Default(None)
   *  @param oshtremark Database column OSHTREMARK SqlType(VARCHAR), Length(256,true), Default(None)
   *  @param oshtsotrfnum Database column OSHTSOTRFNUM SqlType(BIGINT)
   *  @param createdate 
   *  @param modifydate 
   *  @param createdby 
   *  @param lastmodifiedby  */
  case class FcoshtRow(id: Long, oshtostfromrfnum: Long, oshtostmtorfnum: Long, oshtdatestatechange: Option[java.sql.Timestamp] = None, oshtremark: Option[String] = None, oshtsotrfnum: Long, createdate: Option[java.sql.Timestamp] = None, modifydate: java.sql.Timestamp, createdby: String, lastmodifiedby: String) extends BaseEntity 
  class FcoshtRowWrapper(id: Option[Long], oshtostfromrfnum: Long, oshtostmtorfnum: Long, oshtdatestatechange: Option[java.sql.Timestamp] = None, oshtremark: Option[String] = None, oshtsotrfnum: Long) {
    def get(userName: String): FcoshtRow = {
      FcoshtRow(this.id.getOrElse(0), this.oshtostfromrfnum, this.oshtostmtorfnum, this.oshtdatestatechange, this.oshtremark, this.oshtsotrfnum, Some(DateTimeUtils.getCurrentTimeStamp), DateTimeUtils.getCurrentTimeStamp, userName, userName)
  	}
  }
  /** GetResult implicit for fetching FcoshtRow objects using plain SQL queries */
  implicit def GetResultFcoshtRow(implicit e0: GR[Long], e1: GR[Option[java.sql.Timestamp]], e2: GR[Option[String]], e3: GR[java.sql.Timestamp], e4: GR[String]): GR[FcoshtRow] = GR{
    prs => import prs._
    FcoshtRow.tupled((<<[Long], <<[Long], <<[Long], <<?[java.sql.Timestamp], <<?[String], <<[Long], <<?[java.sql.Timestamp], <<[java.sql.Timestamp], <<[String], <<[String]))
  }
  /** Table description of table FCOSHT. Objects of this class serve as prototypes for rows in queries. */
  class Fcosht(_tableTag: Tag) extends BaseTable[FcoshtRow](_tableTag, "FCOSHT") {
    def * = (id, oshtostfromrfnum, oshtostmtorfnum, oshtdatestatechange, oshtremark, oshtsotrfnum, createdate, modifydate, createdby, lastmodifiedby) <> (FcoshtRow.tupled, FcoshtRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(oshtostfromrfnum), Rep.Some(oshtostmtorfnum), oshtdatestatechange, oshtremark, Rep.Some(oshtsotrfnum), createdate, Rep.Some(modifydate), Rep.Some(createdby), Rep.Some(lastmodifiedby)).shaped.<>({r=>import r._; _1.map(_=> FcoshtRow.tupled((_1.get, _2.get, _3.get, _4, _5, _6.get, _7, _8.get, _9.get, _10.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column OSHTRFNUM SqlType(BIGINT), AutoInc, PrimaryKey */
    override val id: Rep[Long] = column[Long]("OSHTRFNUM", O.AutoInc, O.PrimaryKey)
    /** Database column OSHTOSTFROMRFNUM SqlType(BIGINT) */
    val oshtostfromrfnum: Rep[Long] = column[Long]("OSHTOSTFROMRFNUM")
    /** Database column OSHTOSTMTORFNUM SqlType(BIGINT) */
    val oshtostmtorfnum: Rep[Long] = column[Long]("OSHTOSTMTORFNUM")
    /** Database column OSHTDATESTATECHANGE SqlType(TIMESTAMP), Default(None) */
    val oshtdatestatechange: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("OSHTDATESTATECHANGE", O.Default(None))
    /** Database column OSHTREMARK SqlType(VARCHAR), Length(256,true), Default(None) */
    val oshtremark: Rep[Option[String]] = column[Option[String]]("OSHTREMARK", O.Length(256,varying=true), O.Default(None))
    /** Database column OSHTSOTRFNUM SqlType(BIGINT) */
    val oshtsotrfnum: Rep[Long] = column[Long]("OSHTSOTRFNUM")





    /** Foreign key referencing Fcostm (database name FK_FCOSHT_FCOSTM) */
    lazy val fcostmFk1 = foreignKey("FK_FCOSHT_FCOSTM", oshtostmtorfnum, Fcostm)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Fcostm (database name FK_FCOSHT_FCOSTM_02) */
    lazy val fcostmFk2 = foreignKey("FK_FCOSHT_FCOSTM_02", oshtostfromrfnum, Fcostm)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Fcsot (database name FK_FCOSHT_FCSOT) */
    lazy val fcsotFk = foreignKey("FK_FCOSHT_FCSOT", oshtsotrfnum, Fcsot)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table Fcosht */
  lazy val Fcosht = new TableQuery(tag => new Fcosht(tag))

  /** Entity class storing rows of table Fcostm
   *  @param ostmrfnum Database column OSTMRFNUM SqlType(BIGINT), AutoInc, PrimaryKey
   *  @param ostmname Database column OSTMNAME SqlType(VARCHAR), Length(64,true)
   *  @param ostmactive Database column OSTMACTIVE SqlType(CHAR), Length(2,false)
   *  @param ostmdescrip Database column OSTMDESCRIP SqlType(VARCHAR), Length(512,true), Default(None)
   *  @param ostmdisplayname Database column OSTMDISPLAYNAME SqlType(VARCHAR), Length(64,true)
   *  @param ostmtooltip Database column OSTMTOOLTIP SqlType(VARCHAR), Length(2048,true), Default(None)
   *  @param createdate 
   *  @param modifydate 
   *  @param createdby 
   *  @param lastmodifiedby  */
  case class FcostmRow(id: Long, ostmname: String, ostmactive: String, ostmdescrip: Option[String] = None, ostmdisplayname: String, ostmtooltip: Option[String] = None, createdate: Option[java.sql.Timestamp] = None, modifydate: java.sql.Timestamp, createdby: String, lastmodifiedby: String) extends BaseEntity 
  class FcostmRowWrapper(id: Option[Long], ostmname: String, ostmactive: String, ostmdescrip: Option[String] = None, ostmdisplayname: String, ostmtooltip: Option[String] = None) {
    def get(userName: String): FcostmRow = {
      FcostmRow(this.id.getOrElse(0), this.ostmname, this.ostmactive, this.ostmdescrip, this.ostmdisplayname, this.ostmtooltip, Some(DateTimeUtils.getCurrentTimeStamp), DateTimeUtils.getCurrentTimeStamp, userName, userName)
  	}
  }
  /** GetResult implicit for fetching FcostmRow objects using plain SQL queries */
  implicit def GetResultFcostmRow(implicit e0: GR[Long], e1: GR[String], e2: GR[Option[String]], e3: GR[Option[java.sql.Timestamp]], e4: GR[java.sql.Timestamp]): GR[FcostmRow] = GR{
    prs => import prs._
    FcostmRow.tupled((<<[Long], <<[String], <<[String], <<?[String], <<[String], <<?[String], <<?[java.sql.Timestamp], <<[java.sql.Timestamp], <<[String], <<[String]))
  }
  /** Table description of table FCOSTM. Objects of this class serve as prototypes for rows in queries. */
  class Fcostm(_tableTag: Tag) extends BaseTable[FcostmRow](_tableTag, "FCOSTM") {
    def * = (id, ostmname, ostmactive, ostmdescrip, ostmdisplayname, ostmtooltip, createdate, modifydate, createdby, lastmodifiedby) <> (FcostmRow.tupled, FcostmRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(ostmname), Rep.Some(ostmactive), ostmdescrip, Rep.Some(ostmdisplayname), ostmtooltip, createdate, Rep.Some(modifydate), Rep.Some(createdby), Rep.Some(lastmodifiedby)).shaped.<>({r=>import r._; _1.map(_=> FcostmRow.tupled((_1.get, _2.get, _3.get, _4, _5.get, _6, _7, _8.get, _9.get, _10.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column OSTMRFNUM SqlType(BIGINT), AutoInc, PrimaryKey */
    override val id: Rep[Long] = column[Long]("OSTMRFNUM", O.AutoInc, O.PrimaryKey)
    /** Database column OSTMNAME SqlType(VARCHAR), Length(64,true) */
    val ostmname: Rep[String] = column[String]("OSTMNAME", O.Length(64,varying=true))
    /** Database column OSTMACTIVE SqlType(CHAR), Length(2,false) */
    val ostmactive: Rep[String] = column[String]("OSTMACTIVE", O.Length(2,varying=false))
    /** Database column OSTMDESCRIP SqlType(VARCHAR), Length(512,true), Default(None) */
    val ostmdescrip: Rep[Option[String]] = column[Option[String]]("OSTMDESCRIP", O.Length(512,varying=true), O.Default(None))
    /** Database column OSTMDISPLAYNAME SqlType(VARCHAR), Length(64,true) */
    val ostmdisplayname: Rep[String] = column[String]("OSTMDISPLAYNAME", O.Length(64,varying=true))
    /** Database column OSTMTOOLTIP SqlType(VARCHAR), Length(2048,true), Default(None) */
    val ostmtooltip: Rep[Option[String]] = column[Option[String]]("OSTMTOOLTIP", O.Length(2048,varying=true), O.Default(None))
  }
  /** Collection-like TableQuery object for table Fcostm */
  lazy val Fcostm = new TableQuery(tag => new Fcostm(tag))

  /** Entity class storing rows of table Fcotpt
   *  @param otptrfnum Database column OTPTRFNUM SqlType(BIGINT), AutoInc, PrimaryKey
   *  @param otptmobileno Database column OTPTMOBILENO SqlType(CHAR), Length(14,false)
   *  @param otptotp Database column OTPTOTP SqlType(CHAR), Length(10,false)
   *  @param otpreqtime Database column OTPREQTIME SqlType(TIMESTAMP), Default(None)
   *  @param otpvaliditytime Database column OTPVALIDITYTIME SqlType(TIMESTAMP), Default(None)
   *  @param otpstatus Database column OTPSTATUS SqlType(CHAR), Length(10,false), Default(None)
   *  @param otpmessageid Database column OTPMESSAGEID SqlType(CHAR), Length(64,false), Default(None)
   *  @param otpgatewayid Database column OTPGATEWAYID SqlType(CHAR), Length(2,false)
   *  @param createdate 
   *  @param modifydate 
   *  @param createdby 
   *  @param lastmodifiedby  */
  case class FcotptRow(id: Long, otptmobileno: String, otptotp: String, otpreqtime: Option[java.sql.Timestamp] = None, otpvaliditytime: Option[java.sql.Timestamp] = None, otpstatus: Option[String] = None, otpmessageid: Option[String] = None, otpgatewayid: String, createdate: Option[java.sql.Timestamp] = None, modifydate: java.sql.Timestamp, createdby: String, lastmodifiedby: String) extends BaseEntity 
  class FcotptRowWrapper(id: Option[Long], otptmobileno: String, otptotp: String, otpreqtime: Option[java.sql.Timestamp] = None, otpvaliditytime: Option[java.sql.Timestamp] = None, otpstatus: Option[String] = None, otpmessageid: Option[String] = None, otpgatewayid: String) {
    def get(userName: String): FcotptRow = {
      FcotptRow(this.id.getOrElse(0), this.otptmobileno, this.otptotp, this.otpreqtime, this.otpvaliditytime, this.otpstatus, this.otpmessageid, this.otpgatewayid, Some(DateTimeUtils.getCurrentTimeStamp), DateTimeUtils.getCurrentTimeStamp, userName, userName)
  	}
  }
  /** GetResult implicit for fetching FcotptRow objects using plain SQL queries */
  implicit def GetResultFcotptRow(implicit e0: GR[Long], e1: GR[String], e2: GR[Option[java.sql.Timestamp]], e3: GR[Option[String]], e4: GR[java.sql.Timestamp]): GR[FcotptRow] = GR{
    prs => import prs._
    FcotptRow.tupled((<<[Long], <<[String], <<[String], <<?[java.sql.Timestamp], <<?[java.sql.Timestamp], <<?[String], <<?[String], <<[String], <<?[java.sql.Timestamp], <<[java.sql.Timestamp], <<[String], <<[String]))
  }
  /** Table description of table FCOTPT. Objects of this class serve as prototypes for rows in queries. */
  class Fcotpt(_tableTag: Tag) extends BaseTable[FcotptRow](_tableTag, "FCOTPT") {
    def * = (id, otptmobileno, otptotp, otpreqtime, otpvaliditytime, otpstatus, otpmessageid, otpgatewayid, createdate, modifydate, createdby, lastmodifiedby) <> (FcotptRow.tupled, FcotptRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(otptmobileno), Rep.Some(otptotp), otpreqtime, otpvaliditytime, otpstatus, otpmessageid, Rep.Some(otpgatewayid), createdate, Rep.Some(modifydate), Rep.Some(createdby), Rep.Some(lastmodifiedby)).shaped.<>({r=>import r._; _1.map(_=> FcotptRow.tupled((_1.get, _2.get, _3.get, _4, _5, _6, _7, _8.get, _9, _10.get, _11.get, _12.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column OTPTRFNUM SqlType(BIGINT), AutoInc, PrimaryKey */
    override val id: Rep[Long] = column[Long]("OTPTRFNUM", O.AutoInc, O.PrimaryKey)
    /** Database column OTPTMOBILENO SqlType(CHAR), Length(14,false) */
    val otptmobileno: Rep[String] = column[String]("OTPTMOBILENO", O.Length(14,varying=false))
    /** Database column OTPTOTP SqlType(CHAR), Length(10,false) */
    val otptotp: Rep[String] = column[String]("OTPTOTP", O.Length(10,varying=false))
    /** Database column OTPREQTIME SqlType(TIMESTAMP), Default(None) */
    val otpreqtime: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("OTPREQTIME", O.Default(None))
    /** Database column OTPVALIDITYTIME SqlType(TIMESTAMP), Default(None) */
    val otpvaliditytime: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("OTPVALIDITYTIME", O.Default(None))
    /** Database column OTPSTATUS SqlType(CHAR), Length(10,false), Default(None) */
    val otpstatus: Rep[Option[String]] = column[Option[String]]("OTPSTATUS", O.Length(10,varying=false), O.Default(None))
    /** Database column OTPMESSAGEID SqlType(CHAR), Length(64,false), Default(None) */
    val otpmessageid: Rep[Option[String]] = column[Option[String]]("OTPMESSAGEID", O.Length(64,varying=false), O.Default(None))
    /** Database column OTPGATEWAYID SqlType(CHAR), Length(2,false) */
    val otpgatewayid: Rep[String] = column[String]("OTPGATEWAYID", O.Length(2,varying=false))
  }
  /** Collection-like TableQuery object for table Fcotpt */
  lazy val Fcotpt = new TableQuery(tag => new Fcotpt(tag))

  /** Entity class storing rows of table Fcpass
   *  @param passrfnum Database column PASSRFNUM SqlType(BIGINT), AutoInc, PrimaryKey
   *  @param passcode Database column PASSCODE SqlType(CHAR), Length(20,false)
   *  @param passkey Database column PASSKEY SqlType(VARCHAR), Length(256,true)
   *  @param passexpirydate Database column PASSEXPIRYDATE SqlType(TIMESTAMP), Default(None)
   *  @param passwordpasskey Database column PASSWORDPASSKEY SqlType(VARCHAR), Length(20,true)
   *  @param createdate 
   *  @param modifydate 
   *  @param createdby 
   *  @param lastmodifiedby  */
  case class FcpassRow(id: Long, passcode: String, passkey: String, passexpirydate: Option[java.sql.Timestamp] = None, passwordpasskey: String, createdate: Option[java.sql.Timestamp] = None, modifydate: java.sql.Timestamp, createdby: String, lastmodifiedby: String) extends BaseEntity 
  class FcpassRowWrapper(id: Option[Long], passcode: String, passkey: String, passexpirydate: Option[java.sql.Timestamp] = None, passwordpasskey: String) {
    def get(userName: String): FcpassRow = {
      FcpassRow(this.id.getOrElse(0), this.passcode, this.passkey, this.passexpirydate, this.passwordpasskey, Some(DateTimeUtils.getCurrentTimeStamp), DateTimeUtils.getCurrentTimeStamp, userName, userName)
  	}
  }
  /** GetResult implicit for fetching FcpassRow objects using plain SQL queries */
  implicit def GetResultFcpassRow(implicit e0: GR[Long], e1: GR[String], e2: GR[Option[java.sql.Timestamp]], e3: GR[java.sql.Timestamp]): GR[FcpassRow] = GR{
    prs => import prs._
    FcpassRow.tupled((<<[Long], <<[String], <<[String], <<?[java.sql.Timestamp], <<[String], <<?[java.sql.Timestamp], <<[java.sql.Timestamp], <<[String], <<[String]))
  }
  /** Table description of table FCPASS. Objects of this class serve as prototypes for rows in queries. */
  class Fcpass(_tableTag: Tag) extends BaseTable[FcpassRow](_tableTag, "FCPASS") {
    def * = (id, passcode, passkey, passexpirydate, passwordpasskey, createdate, modifydate, createdby, lastmodifiedby) <> (FcpassRow.tupled, FcpassRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(passcode), Rep.Some(passkey), passexpirydate, Rep.Some(passwordpasskey), createdate, Rep.Some(modifydate), Rep.Some(createdby), Rep.Some(lastmodifiedby)).shaped.<>({r=>import r._; _1.map(_=> FcpassRow.tupled((_1.get, _2.get, _3.get, _4, _5.get, _6, _7.get, _8.get, _9.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column PASSRFNUM SqlType(BIGINT), AutoInc, PrimaryKey */
    override val id: Rep[Long] = column[Long]("PASSRFNUM", O.AutoInc, O.PrimaryKey)
    /** Database column PASSCODE SqlType(CHAR), Length(20,false) */
    val passcode: Rep[String] = column[String]("PASSCODE", O.Length(20,varying=false))
    /** Database column PASSKEY SqlType(VARCHAR), Length(256,true) */
    val passkey: Rep[String] = column[String]("PASSKEY", O.Length(256,varying=true))
    /** Database column PASSEXPIRYDATE SqlType(TIMESTAMP), Default(None) */
    val passexpirydate: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("PASSEXPIRYDATE", O.Default(None))
    /** Database column PASSWORDPASSKEY SqlType(VARCHAR), Length(20,true) */
    val passwordpasskey: Rep[String] = column[String]("PASSWORDPASSKEY", O.Length(20,varying=true))
  }
  /** Collection-like TableQuery object for table Fcpass */
  lazy val Fcpass = new TableQuery(tag => new Fcpass(tag))

  /** Entity class storing rows of table Fcppa
   *  @param pparfnum Database column PPARFNUM SqlType(BIGINT), AutoInc, PrimaryKey
   *  @param ppadate Database column PPADATE SqlType(DATE)
   *  @param ppaprmtrfnum Database column PPAPRMTRFNUM SqlType(BIGINT)
   *  @param ppadsarfnum Database column PPADSARFNUM SqlType(BIGINT)
   *  @param createdate 
   *  @param modifydate 
   *  @param createdby 
   *  @param lastmodifiedby  */
  case class FcppaRow(id: Long, ppadate: java.sql.Date, ppaprmtrfnum: Long, ppadsarfnum: Long, createdate: Option[java.sql.Timestamp] = None, modifydate: java.sql.Timestamp, createdby: String, lastmodifiedby: String) extends BaseEntity 
  class FcppaRowWrapper(id: Option[Long], ppadate: java.sql.Date, ppaprmtrfnum: Long, ppadsarfnum: Long) {
    def get(userName: String): FcppaRow = {
      FcppaRow(this.id.getOrElse(0), this.ppadate, this.ppaprmtrfnum, this.ppadsarfnum, Some(DateTimeUtils.getCurrentTimeStamp), DateTimeUtils.getCurrentTimeStamp, userName, userName)
  	}
  }
  /** GetResult implicit for fetching FcppaRow objects using plain SQL queries */
  implicit def GetResultFcppaRow(implicit e0: GR[Long], e1: GR[java.sql.Date], e2: GR[Option[java.sql.Timestamp]], e3: GR[java.sql.Timestamp], e4: GR[String]): GR[FcppaRow] = GR{
    prs => import prs._
    FcppaRow.tupled((<<[Long], <<[java.sql.Date], <<[Long], <<[Long], <<?[java.sql.Timestamp], <<[java.sql.Timestamp], <<[String], <<[String]))
  }
  /** Table description of table FCPPA. Objects of this class serve as prototypes for rows in queries. */
  class Fcppa(_tableTag: Tag) extends BaseTable[FcppaRow](_tableTag, "FCPPA") {
    def * = (id, ppadate, ppaprmtrfnum, ppadsarfnum, createdate, modifydate, createdby, lastmodifiedby) <> (FcppaRow.tupled, FcppaRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(ppadate), Rep.Some(ppaprmtrfnum), Rep.Some(ppadsarfnum), createdate, Rep.Some(modifydate), Rep.Some(createdby), Rep.Some(lastmodifiedby)).shaped.<>({r=>import r._; _1.map(_=> FcppaRow.tupled((_1.get, _2.get, _3.get, _4.get, _5, _6.get, _7.get, _8.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column PPARFNUM SqlType(BIGINT), AutoInc, PrimaryKey */
    override val id: Rep[Long] = column[Long]("PPARFNUM", O.AutoInc, O.PrimaryKey)
    /** Database column PPADATE SqlType(DATE) */
    val ppadate: Rep[java.sql.Date] = column[java.sql.Date]("PPADATE")
    /** Database column PPAPRMTRFNUM SqlType(BIGINT) */
    val ppaprmtrfnum: Rep[Long] = column[Long]("PPAPRMTRFNUM")
    /** Database column PPADSARFNUM SqlType(BIGINT) */
    val ppadsarfnum: Rep[Long] = column[Long]("PPADSARFNUM")





    /** Foreign key referencing Fcdsa (database name FK_FCPPA_FCDSA) */
    lazy val fcdsaFk = foreignKey("FK_FCPPA_FCDSA", ppadsarfnum, Fcdsa)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Fcprmt (database name FK_FCPPA_FCPRMT) */
    lazy val fcprmtFk = foreignKey("FK_FCPPA_FCPRMT", ppaprmtrfnum, Fcprmt)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)

    /** Uniqueness Index over (ppadate,ppadsarfnum) (database name PPA_PPADSA_PPADATE_UNQ) */
    val index1 = index("PPA_PPADSA_PPADATE_UNQ", (ppadate, ppadsarfnum), unique=true)
  }
  /** Collection-like TableQuery object for table Fcppa */
  lazy val Fcppa = new TableQuery(tag => new Fcppa(tag))

  /** Entity class storing rows of table Fcprmt
   *  @param prmtrfnum Database column PRMTRFNUM SqlType(BIGINT), AutoInc, PrimaryKey
   *  @param prmtdate Database column PRMTDATE SqlType(DATE)
   *  @param prmtopenprice Database column PRMTOPENPRICE SqlType(FLOAT), Default(None)
   *  @param prmtcloseprice Database column PRMTCLOSEPRICE SqlType(FLOAT), Default(None)
   *  @param prmthigh Database column PRMTHIGH SqlType(FLOAT), Default(None)
   *  @param prmtlow Database column PRMTLOW SqlType(FLOAT), Default(None)
   *  @param prmtpricechangevalue Database column PRMTPRICECHANGEVALUE SqlType(DOUBLE), Default(None)
   *  @param prmtchangepercent Database column PRMTCHANGEPERCENT SqlType(DOUBLE), Default(None)
   *  @param createdate 
   *  @param modifydate 
   *  @param createdby 
   *  @param lastmodifiedby  */
  case class FcprmtRow(id: Long, prmtdate: java.sql.Date, prmtopenprice: Option[Float] = None, prmtcloseprice: Option[Float] = None, prmthigh: Option[Float] = None, prmtlow: Option[Float] = None, prmtpricechangevalue: Option[Double] = None, prmtchangepercent: Option[Double] = None, createdate: Option[java.sql.Timestamp] = None, modifydate: java.sql.Timestamp, createdby: String, lastmodifiedby: String) extends BaseEntity 
  class FcprmtRowWrapper(id: Option[Long], prmtdate: java.sql.Date, prmtopenprice: Option[Float] = None, prmtcloseprice: Option[Float] = None, prmthigh: Option[Float] = None, prmtlow: Option[Float] = None, prmtpricechangevalue: Option[Double] = None, prmtchangepercent: Option[Double] = None) {
    def get(userName: String): FcprmtRow = {
      FcprmtRow(this.id.getOrElse(0), this.prmtdate, this.prmtopenprice, this.prmtcloseprice, this.prmthigh, this.prmtlow, this.prmtpricechangevalue, this.prmtchangepercent, Some(DateTimeUtils.getCurrentTimeStamp), DateTimeUtils.getCurrentTimeStamp, userName, userName)
  	}
  }
  /** GetResult implicit for fetching FcprmtRow objects using plain SQL queries */
  implicit def GetResultFcprmtRow(implicit e0: GR[Long], e1: GR[java.sql.Date], e2: GR[Option[Float]], e3: GR[Option[Double]], e4: GR[Option[java.sql.Timestamp]], e5: GR[java.sql.Timestamp], e6: GR[String]): GR[FcprmtRow] = GR{
    prs => import prs._
    FcprmtRow.tupled((<<[Long], <<[java.sql.Date], <<?[Float], <<?[Float], <<?[Float], <<?[Float], <<?[Double], <<?[Double], <<?[java.sql.Timestamp], <<[java.sql.Timestamp], <<[String], <<[String]))
  }
  /** Table description of table FCPRMT. Objects of this class serve as prototypes for rows in queries. */
  class Fcprmt(_tableTag: Tag) extends BaseTable[FcprmtRow](_tableTag, "FCPRMT") {
    def * = (id, prmtdate, prmtopenprice, prmtcloseprice, prmthigh, prmtlow, prmtpricechangevalue, prmtchangepercent, createdate, modifydate, createdby, lastmodifiedby) <> (FcprmtRow.tupled, FcprmtRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(prmtdate), prmtopenprice, prmtcloseprice, prmthigh, prmtlow, prmtpricechangevalue, prmtchangepercent, createdate, Rep.Some(modifydate), Rep.Some(createdby), Rep.Some(lastmodifiedby)).shaped.<>({r=>import r._; _1.map(_=> FcprmtRow.tupled((_1.get, _2.get, _3, _4, _5, _6, _7, _8, _9, _10.get, _11.get, _12.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column PRMTRFNUM SqlType(BIGINT), AutoInc, PrimaryKey */
    override val id: Rep[Long] = column[Long]("PRMTRFNUM", O.AutoInc, O.PrimaryKey)
    /** Database column PRMTDATE SqlType(DATE) */
    val prmtdate: Rep[java.sql.Date] = column[java.sql.Date]("PRMTDATE")
    /** Database column PRMTOPENPRICE SqlType(FLOAT), Default(None) */
    val prmtopenprice: Rep[Option[Float]] = column[Option[Float]]("PRMTOPENPRICE", O.Default(None))
    /** Database column PRMTCLOSEPRICE SqlType(FLOAT), Default(None) */
    val prmtcloseprice: Rep[Option[Float]] = column[Option[Float]]("PRMTCLOSEPRICE", O.Default(None))
    /** Database column PRMTHIGH SqlType(FLOAT), Default(None) */
    val prmthigh: Rep[Option[Float]] = column[Option[Float]]("PRMTHIGH", O.Default(None))
    /** Database column PRMTLOW SqlType(FLOAT), Default(None) */
    val prmtlow: Rep[Option[Float]] = column[Option[Float]]("PRMTLOW", O.Default(None))
    /** Database column PRMTPRICECHANGEVALUE SqlType(DOUBLE), Default(None) */
    val prmtpricechangevalue: Rep[Option[Double]] = column[Option[Double]]("PRMTPRICECHANGEVALUE", O.Default(None))
    /** Database column PRMTCHANGEPERCENT SqlType(DOUBLE), Default(None) */
    val prmtchangepercent: Rep[Option[Double]] = column[Option[Double]]("PRMTCHANGEPERCENT", O.Default(None))
  }
  /** Collection-like TableQuery object for table Fcprmt */
  lazy val Fcprmt = new TableQuery(tag => new Fcprmt(tag))

  /** Entity class storing rows of table Fcpst
   *  @param pstrfnum Database column PSTRFNUM SqlType(BIGINT), AutoInc, PrimaryKey
   *  @param pstproductname Database column PSTPRODUCTNAME SqlType(CHAR), Length(32,false)
   *  @param pstproductdesc Database column PSTPRODUCTDESC SqlType(VARCHAR), Length(128,true), Default(None)
   *  @param pstproductsolactive Database column PSTPRODUCTSOLACTIVE SqlType(CHAR), Length(2,false)
   *  @param createdate 
   *  @param modifydate 
   *  @param createdby 
   *  @param lastmodifiedby  */
  case class FcpstRow(id: Long, pstproductname: String, pstproductdesc: Option[String] = None, pstproductsolactive: String, createdate: Option[java.sql.Timestamp] = None, modifydate: java.sql.Timestamp, createdby: String, lastmodifiedby: String) extends BaseEntity 
  class FcpstRowWrapper(id: Option[Long], pstproductname: String, pstproductdesc: Option[String] = None, pstproductsolactive: String) {
    def get(userName: String): FcpstRow = {
      FcpstRow(this.id.getOrElse(0), this.pstproductname, this.pstproductdesc, this.pstproductsolactive, Some(DateTimeUtils.getCurrentTimeStamp), DateTimeUtils.getCurrentTimeStamp, userName, userName)
  	}
  }
  /** GetResult implicit for fetching FcpstRow objects using plain SQL queries */
  implicit def GetResultFcpstRow(implicit e0: GR[Long], e1: GR[String], e2: GR[Option[String]], e3: GR[Option[java.sql.Timestamp]], e4: GR[java.sql.Timestamp]): GR[FcpstRow] = GR{
    prs => import prs._
    FcpstRow.tupled((<<[Long], <<[String], <<?[String], <<[String], <<?[java.sql.Timestamp], <<[java.sql.Timestamp], <<[String], <<[String]))
  }
  /** Table description of table FCPST. Objects of this class serve as prototypes for rows in queries. */
  class Fcpst(_tableTag: Tag) extends BaseTable[FcpstRow](_tableTag, "FCPST") {
    def * = (id, pstproductname, pstproductdesc, pstproductsolactive, createdate, modifydate, createdby, lastmodifiedby) <> (FcpstRow.tupled, FcpstRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(pstproductname), pstproductdesc, Rep.Some(pstproductsolactive), createdate, Rep.Some(modifydate), Rep.Some(createdby), Rep.Some(lastmodifiedby)).shaped.<>({r=>import r._; _1.map(_=> FcpstRow.tupled((_1.get, _2.get, _3, _4.get, _5, _6.get, _7.get, _8.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column PSTRFNUM SqlType(BIGINT), AutoInc, PrimaryKey */
    override val id: Rep[Long] = column[Long]("PSTRFNUM", O.AutoInc, O.PrimaryKey)
    /** Database column PSTPRODUCTNAME SqlType(CHAR), Length(32,false) */
    val pstproductname: Rep[String] = column[String]("PSTPRODUCTNAME", O.Length(32,varying=false))
    /** Database column PSTPRODUCTDESC SqlType(VARCHAR), Length(128,true), Default(None) */
    val pstproductdesc: Rep[Option[String]] = column[Option[String]]("PSTPRODUCTDESC", O.Length(128,varying=true), O.Default(None))
    /** Database column PSTPRODUCTSOLACTIVE SqlType(CHAR), Length(2,false) */
    val pstproductsolactive: Rep[String] = column[String]("PSTPRODUCTSOLACTIVE", O.Length(2,varying=false))
  }
  /** Collection-like TableQuery object for table Fcpst */
  lazy val Fcpst = new TableQuery(tag => new Fcpst(tag))

  /** Entity class storing rows of table Fcqkey
   *  @param qkeyrfnum Database column QKEYRFNUM SqlType(BIGINT), AutoInc, PrimaryKey
   *  @param qkeyfrom Database column QKEYFROM SqlType(DOUBLE), Default(None)
   *  @param qkeyto Database column QKEYTO SqlType(DOUBLE), Default(None)
   *  @param qkeyvalue Database column QKEYVALUE SqlType(DOUBLE), Default(None)
   *  @param qketqstrfnum Database column QKETQSTRFNUM SqlType(BIGINT)
   *  @param createdate 
   *  @param modifydate 
   *  @param createdby 
   *  @param lastmodifiedby  */
  case class FcqkeyRow(id: Long, qkeyfrom: Option[Double] = None, qkeyto: Option[Double] = None, qkeyvalue: Option[Double] = None, qketqstrfnum: Long, createdate: Option[java.sql.Timestamp] = None, modifydate: java.sql.Timestamp, createdby: String, lastmodifiedby: String) extends BaseEntity 
  class FcqkeyRowWrapper(id: Option[Long], qkeyfrom: Option[Double] = None, qkeyto: Option[Double] = None, qkeyvalue: Option[Double] = None, qketqstrfnum: Long) {
    def get(userName: String): FcqkeyRow = {
      FcqkeyRow(this.id.getOrElse(0), this.qkeyfrom, this.qkeyto, this.qkeyvalue, this.qketqstrfnum, Some(DateTimeUtils.getCurrentTimeStamp), DateTimeUtils.getCurrentTimeStamp, userName, userName)
  	}
  }
  /** GetResult implicit for fetching FcqkeyRow objects using plain SQL queries */
  implicit def GetResultFcqkeyRow(implicit e0: GR[Long], e1: GR[Option[Double]], e2: GR[Option[java.sql.Timestamp]], e3: GR[java.sql.Timestamp], e4: GR[String]): GR[FcqkeyRow] = GR{
    prs => import prs._
    FcqkeyRow.tupled((<<[Long], <<?[Double], <<?[Double], <<?[Double], <<[Long], <<?[java.sql.Timestamp], <<[java.sql.Timestamp], <<[String], <<[String]))
  }
  /** Table description of table FCQKEY. Objects of this class serve as prototypes for rows in queries. */
  class Fcqkey(_tableTag: Tag) extends BaseTable[FcqkeyRow](_tableTag, "FCQKEY") {
    def * = (id, qkeyfrom, qkeyto, qkeyvalue, qketqstrfnum, createdate, modifydate, createdby, lastmodifiedby) <> (FcqkeyRow.tupled, FcqkeyRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), qkeyfrom, qkeyto, qkeyvalue, Rep.Some(qketqstrfnum), createdate, Rep.Some(modifydate), Rep.Some(createdby), Rep.Some(lastmodifiedby)).shaped.<>({r=>import r._; _1.map(_=> FcqkeyRow.tupled((_1.get, _2, _3, _4, _5.get, _6, _7.get, _8.get, _9.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column QKEYRFNUM SqlType(BIGINT), AutoInc, PrimaryKey */
    override val id: Rep[Long] = column[Long]("QKEYRFNUM", O.AutoInc, O.PrimaryKey)
    /** Database column QKEYFROM SqlType(DOUBLE), Default(None) */
    val qkeyfrom: Rep[Option[Double]] = column[Option[Double]]("QKEYFROM", O.Default(None))
    /** Database column QKEYTO SqlType(DOUBLE), Default(None) */
    val qkeyto: Rep[Option[Double]] = column[Option[Double]]("QKEYTO", O.Default(None))
    /** Database column QKEYVALUE SqlType(DOUBLE), Default(None) */
    val qkeyvalue: Rep[Option[Double]] = column[Option[Double]]("QKEYVALUE", O.Default(None))
    /** Database column QKETQSTRFNUM SqlType(BIGINT) */
    val qketqstrfnum: Rep[Long] = column[Long]("QKETQSTRFNUM")





    /** Foreign key referencing Fcqst (database name FK_FCQKEY_FCQST) */
    lazy val fcqstFk = foreignKey("FK_FCQKEY_FCQST", qketqstrfnum, Fcqst)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table Fcqkey */
  lazy val Fcqkey = new TableQuery(tag => new Fcqkey(tag))

  /** Entity class storing rows of table Fcqmt
   *  @param qmtrfnum Database column QMTRFNUM SqlType(BIGINT), AutoInc, PrimaryKey
   *  @param qmtquestion Database column QMTQUESTION SqlType(VARCHAR), Length(512,true)
   *  @param qmtqstrfnum Database column QMTQSTRFNUM SqlType(BIGINT)
   *  @param qmtactive Database column QMTACTIVE SqlType(CHAR), Length(2,false)
   *  @param createdate 
   *  @param modifydate 
   *  @param createdby 
   *  @param lastmodifiedby  */
  case class FcqmtRow(id: Long, qmtquestion: String, qmtqstrfnum: Long, qmtactive: String, createdate: Option[java.sql.Timestamp] = None, modifydate: java.sql.Timestamp, createdby: String, lastmodifiedby: String) extends BaseEntity 
  class FcqmtRowWrapper(id: Option[Long], qmtquestion: String, qmtqstrfnum: Long, qmtactive: String) {
    def get(userName: String): FcqmtRow = {
      FcqmtRow(this.id.getOrElse(0), this.qmtquestion, this.qmtqstrfnum, this.qmtactive, Some(DateTimeUtils.getCurrentTimeStamp), DateTimeUtils.getCurrentTimeStamp, userName, userName)
  	}
  }
  /** GetResult implicit for fetching FcqmtRow objects using plain SQL queries */
  implicit def GetResultFcqmtRow(implicit e0: GR[Long], e1: GR[String], e2: GR[Option[java.sql.Timestamp]], e3: GR[java.sql.Timestamp]): GR[FcqmtRow] = GR{
    prs => import prs._
    FcqmtRow.tupled((<<[Long], <<[String], <<[Long], <<[String], <<?[java.sql.Timestamp], <<[java.sql.Timestamp], <<[String], <<[String]))
  }
  /** Table description of table FCQMT. Objects of this class serve as prototypes for rows in queries. */
  class Fcqmt(_tableTag: Tag) extends BaseTable[FcqmtRow](_tableTag, "FCQMT") {
    def * = (id, qmtquestion, qmtqstrfnum, qmtactive, createdate, modifydate, createdby, lastmodifiedby) <> (FcqmtRow.tupled, FcqmtRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(qmtquestion), Rep.Some(qmtqstrfnum), Rep.Some(qmtactive), createdate, Rep.Some(modifydate), Rep.Some(createdby), Rep.Some(lastmodifiedby)).shaped.<>({r=>import r._; _1.map(_=> FcqmtRow.tupled((_1.get, _2.get, _3.get, _4.get, _5, _6.get, _7.get, _8.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column QMTRFNUM SqlType(BIGINT), AutoInc, PrimaryKey */
    override val id: Rep[Long] = column[Long]("QMTRFNUM", O.AutoInc, O.PrimaryKey)
    /** Database column QMTQUESTION SqlType(VARCHAR), Length(512,true) */
    val qmtquestion: Rep[String] = column[String]("QMTQUESTION", O.Length(512,varying=true))
    /** Database column QMTQSTRFNUM SqlType(BIGINT) */
    val qmtqstrfnum: Rep[Long] = column[Long]("QMTQSTRFNUM")
    /** Database column QMTACTIVE SqlType(CHAR), Length(2,false) */
    val qmtactive: Rep[String] = column[String]("QMTACTIVE", O.Length(2,varying=false))





    /** Foreign key referencing Fcqst (database name FK_FCQMT_FCQST) */
    lazy val fcqstFk = foreignKey("FK_FCQMT_FCQST", qmtqstrfnum, Fcqst)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table Fcqmt */
  lazy val Fcqmt = new TableQuery(tag => new Fcqmt(tag))

  /** Entity class storing rows of table Fcqst
   *  @param qstrfnum Database column QSTRFNUM SqlType(BIGINT), AutoInc, PrimaryKey
   *  @param qstname Database column QSTNAME SqlType(CHAR), Length(64,false), Default(None)
   *  @param qstdescription Database column QSTDESCRIPTION SqlType(VARCHAR), Length(256,true), Default(None)
   *  @param qstactive Database column QSTACTIVE SqlType(CHAR), Length(2,false), Default(None)
   *  @param qstcategory Database column QSTCATEGORY SqlType(CHAR), Length(32,false), Default(None)
   *  @param createdate 
   *  @param modifydate 
   *  @param createdby 
   *  @param lastmodifiedby  */
  case class FcqstRow(id: Long, qstname: Option[String] = None, qstdescription: Option[String] = None, qstactive: Option[String] = None, qstcategory: Option[String] = None, createdate: Option[java.sql.Timestamp] = None, modifydate: java.sql.Timestamp, createdby: String, lastmodifiedby: String) extends BaseEntity 
  class FcqstRowWrapper(id: Option[Long], qstname: Option[String] = None, qstdescription: Option[String] = None, qstactive: Option[String] = None, qstcategory: Option[String] = None) {
    def get(userName: String): FcqstRow = {
      FcqstRow(this.id.getOrElse(0), this.qstname, this.qstdescription, this.qstactive, this.qstcategory, Some(DateTimeUtils.getCurrentTimeStamp), DateTimeUtils.getCurrentTimeStamp, userName, userName)
  	}
  }
  /** GetResult implicit for fetching FcqstRow objects using plain SQL queries */
  implicit def GetResultFcqstRow(implicit e0: GR[Long], e1: GR[Option[String]], e2: GR[Option[java.sql.Timestamp]], e3: GR[java.sql.Timestamp], e4: GR[String]): GR[FcqstRow] = GR{
    prs => import prs._
    FcqstRow.tupled((<<[Long], <<?[String], <<?[String], <<?[String], <<?[String], <<?[java.sql.Timestamp], <<[java.sql.Timestamp], <<[String], <<[String]))
  }
  /** Table description of table FCQST. Objects of this class serve as prototypes for rows in queries. */
  class Fcqst(_tableTag: Tag) extends BaseTable[FcqstRow](_tableTag, "FCQST") {
    def * = (id, qstname, qstdescription, qstactive, qstcategory, createdate, modifydate, createdby, lastmodifiedby) <> (FcqstRow.tupled, FcqstRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), qstname, qstdescription, qstactive, qstcategory, createdate, Rep.Some(modifydate), Rep.Some(createdby), Rep.Some(lastmodifiedby)).shaped.<>({r=>import r._; _1.map(_=> FcqstRow.tupled((_1.get, _2, _3, _4, _5, _6, _7.get, _8.get, _9.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column QSTRFNUM SqlType(BIGINT), AutoInc, PrimaryKey */
    override val id: Rep[Long] = column[Long]("QSTRFNUM", O.AutoInc, O.PrimaryKey)
    /** Database column QSTNAME SqlType(CHAR), Length(64,false), Default(None) */
    val qstname: Rep[Option[String]] = column[Option[String]]("QSTNAME", O.Length(64,varying=false), O.Default(None))
    /** Database column QSTDESCRIPTION SqlType(VARCHAR), Length(256,true), Default(None) */
    val qstdescription: Rep[Option[String]] = column[Option[String]]("QSTDESCRIPTION", O.Length(256,varying=true), O.Default(None))
    /** Database column QSTACTIVE SqlType(CHAR), Length(2,false), Default(None) */
    val qstactive: Rep[Option[String]] = column[Option[String]]("QSTACTIVE", O.Length(2,varying=false), O.Default(None))
    /** Database column QSTCATEGORY SqlType(CHAR), Length(32,false), Default(None) */
    val qstcategory: Rep[Option[String]] = column[Option[String]]("QSTCATEGORY", O.Length(32,varying=false), O.Default(None))
  }
  /** Collection-like TableQuery object for table Fcqst */
  lazy val Fcqst = new TableQuery(tag => new Fcqst(tag))

  /** Entity class storing rows of table Fcrag
   *  @param ragrfnum Database column RAGRFNUM SqlType(BIGINT), AutoInc, PrimaryKey
   *  @param ragagencyname Database column RAGAGENCYNAME SqlType(VARCHAR), Length(64,true)
   *  @param ragagencycode Database column RAGAGENCYCODE SqlType(VARCHAR), Length(16,true)
   *  @param ragdescp Database column RAGDESCP SqlType(VARCHAR), Length(256,true), Default(None)
   *  @param createdate 
   *  @param modifydate 
   *  @param createdby 
   *  @param lastmodifiedby  */
  case class FcragRow(id: Long, ragagencyname: String, ragagencycode: String, ragdescp: Option[String] = None, createdate: Option[java.sql.Timestamp] = None, modifydate: java.sql.Timestamp, createdby: String, lastmodifiedby: String) extends BaseEntity 
  class FcragRowWrapper(id: Option[Long], ragagencyname: String, ragagencycode: String, ragdescp: Option[String] = None) {
    def get(userName: String): FcragRow = {
      FcragRow(this.id.getOrElse(0), this.ragagencyname, this.ragagencycode, this.ragdescp, Some(DateTimeUtils.getCurrentTimeStamp), DateTimeUtils.getCurrentTimeStamp, userName, userName)
  	}
  }
  /** GetResult implicit for fetching FcragRow objects using plain SQL queries */
  implicit def GetResultFcragRow(implicit e0: GR[Long], e1: GR[String], e2: GR[Option[String]], e3: GR[Option[java.sql.Timestamp]], e4: GR[java.sql.Timestamp]): GR[FcragRow] = GR{
    prs => import prs._
    FcragRow.tupled((<<[Long], <<[String], <<[String], <<?[String], <<?[java.sql.Timestamp], <<[java.sql.Timestamp], <<[String], <<[String]))
  }
  /** Table description of table FCRAG. Objects of this class serve as prototypes for rows in queries. */
  class Fcrag(_tableTag: Tag) extends BaseTable[FcragRow](_tableTag, "FCRAG") {
    def * = (id, ragagencyname, ragagencycode, ragdescp, createdate, modifydate, createdby, lastmodifiedby) <> (FcragRow.tupled, FcragRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(ragagencyname), Rep.Some(ragagencycode), ragdescp, createdate, Rep.Some(modifydate), Rep.Some(createdby), Rep.Some(lastmodifiedby)).shaped.<>({r=>import r._; _1.map(_=> FcragRow.tupled((_1.get, _2.get, _3.get, _4, _5, _6.get, _7.get, _8.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column RAGRFNUM SqlType(BIGINT), AutoInc, PrimaryKey */
    override val id: Rep[Long] = column[Long]("RAGRFNUM", O.AutoInc, O.PrimaryKey)
    /** Database column RAGAGENCYNAME SqlType(VARCHAR), Length(64,true) */
    val ragagencyname: Rep[String] = column[String]("RAGAGENCYNAME", O.Length(64,varying=true))
    /** Database column RAGAGENCYCODE SqlType(VARCHAR), Length(16,true) */
    val ragagencycode: Rep[String] = column[String]("RAGAGENCYCODE", O.Length(16,varying=true))
    /** Database column RAGDESCP SqlType(VARCHAR), Length(256,true), Default(None) */
    val ragdescp: Rep[Option[String]] = column[Option[String]]("RAGDESCP", O.Length(256,varying=true), O.Default(None))
  }
  /** Collection-like TableQuery object for table Fcrag */
  lazy val Fcrag = new TableQuery(tag => new Fcrag(tag))

  /** Entity class storing rows of table Fcramt
   *  @param ramtrfnum Database column RAMTRFNUM SqlType(BIGINT), AutoInc, PrimaryKey
   *  @param ramtaumincr Database column RAMTAUMINCR SqlType(DOUBLE)
   *  @param ramtstddeviation Database column RAMTSTDDEVIATION SqlType(FLOAT), Default(None)
   *  @param ramtalpha Database column RAMTALPHA SqlType(FLOAT), Default(None)
   *  @param ramtbeta Database column RAMTBETA SqlType(FLOAT), Default(None)
   *  @param ramtrsquared Database column RAMTRSQUARED SqlType(FLOAT), Default(None)
   *  @param ramttrackingerror Database column RAMTTRACKINGERROR SqlType(FLOAT), Default(None)
   *  @param ramtsharpe Database column RAMTSHARPE SqlType(FLOAT), Default(None)
   *  @param ramtinformation Database column RAMTINFORMATION SqlType(FLOAT), Default(None)
   *  @param ramtexpense Database column RAMTEXPENSE SqlType(FLOAT), Default(None)
   *  @param ramtmaturity Database column RAMTMATURITY SqlType(FLOAT), Default(None)
   *  @param ramtyield Database column RAMTYIELD SqlType(FLOAT), Default(None)
   *  @param ramtduration Database column RAMTDURATION SqlType(FLOAT), Default(None)
   *  @param ramtasofdate Database column RAMTASOFDATE SqlType(DATE), Default(None)
   *  @param ramtyieldtomaturity Database column RAMTYIELDTOMATURITY SqlType(DOUBLE), Default(None)
   *  @param ramtmodifiedduration Database column RAMTMODIFIEDDURATION SqlType(DOUBLE), Default(None)
   *  @param createdate 
   *  @param modifydate 
   *  @param createdby 
   *  @param lastmodifiedby  */
  case class FcramtRow(id: Long, ramtaumincr: Double, ramtstddeviation: Option[Float] = None, ramtalpha: Option[Float] = None, ramtbeta: Option[Float] = None, ramtrsquared: Option[Float] = None, ramttrackingerror: Option[Float] = None, ramtsharpe: Option[Float] = None, ramtinformation: Option[Float] = None, ramtexpense: Option[Float] = None, ramtmaturity: Option[Float] = None, ramtyield: Option[Float] = None, ramtduration: Option[Float] = None, ramtasofdate: Option[java.sql.Date] = None, ramtyieldtomaturity: Option[Double] = None, ramtmodifiedduration: Option[Double] = None, createdate: Option[java.sql.Timestamp] = None, modifydate: java.sql.Timestamp, createdby: String, lastmodifiedby: String) extends BaseEntity 
  class FcramtRowWrapper(id: Option[Long], ramtaumincr: Double, ramtstddeviation: Option[Float] = None, ramtalpha: Option[Float] = None, ramtbeta: Option[Float] = None, ramtrsquared: Option[Float] = None, ramttrackingerror: Option[Float] = None, ramtsharpe: Option[Float] = None, ramtinformation: Option[Float] = None, ramtexpense: Option[Float] = None, ramtmaturity: Option[Float] = None, ramtyield: Option[Float] = None, ramtduration: Option[Float] = None, ramtasofdate: Option[java.sql.Date] = None, ramtyieldtomaturity: Option[Double] = None, ramtmodifiedduration: Option[Double] = None) {
    def get(userName: String): FcramtRow = {
      FcramtRow(this.id.getOrElse(0), this.ramtaumincr, this.ramtstddeviation, this.ramtalpha, this.ramtbeta, this.ramtrsquared, this.ramttrackingerror, this.ramtsharpe, this.ramtinformation, this.ramtexpense, this.ramtmaturity, this.ramtyield, this.ramtduration, this.ramtasofdate, this.ramtyieldtomaturity, this.ramtmodifiedduration, Some(DateTimeUtils.getCurrentTimeStamp), DateTimeUtils.getCurrentTimeStamp, userName, userName)
  	}
  }
  /** GetResult implicit for fetching FcramtRow objects using plain SQL queries */
  implicit def GetResultFcramtRow(implicit e0: GR[Long], e1: GR[Double], e2: GR[Option[Float]], e3: GR[Option[java.sql.Date]], e4: GR[Option[Double]], e5: GR[Option[java.sql.Timestamp]], e6: GR[java.sql.Timestamp], e7: GR[String]): GR[FcramtRow] = GR{
    prs => import prs._
    FcramtRow.tupled((<<[Long], <<[Double], <<?[Float], <<?[Float], <<?[Float], <<?[Float], <<?[Float], <<?[Float], <<?[Float], <<?[Float], <<?[Float], <<?[Float], <<?[Float], <<?[java.sql.Date], <<?[Double], <<?[Double], <<?[java.sql.Timestamp], <<[java.sql.Timestamp], <<[String], <<[String]))
  }
  /** Table description of table FCRAMT. Objects of this class serve as prototypes for rows in queries. */
  class Fcramt(_tableTag: Tag) extends BaseTable[FcramtRow](_tableTag, "FCRAMT") {
    def * = (id, ramtaumincr, ramtstddeviation, ramtalpha, ramtbeta, ramtrsquared, ramttrackingerror, ramtsharpe, ramtinformation, ramtexpense, ramtmaturity, ramtyield, ramtduration, ramtasofdate, ramtyieldtomaturity, ramtmodifiedduration, createdate, modifydate, createdby, lastmodifiedby) <> (FcramtRow.tupled, FcramtRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(ramtaumincr), ramtstddeviation, ramtalpha, ramtbeta, ramtrsquared, ramttrackingerror, ramtsharpe, ramtinformation, ramtexpense, ramtmaturity, ramtyield, ramtduration, ramtasofdate, ramtyieldtomaturity, ramtmodifiedduration, createdate, Rep.Some(modifydate), Rep.Some(createdby), Rep.Some(lastmodifiedby)).shaped.<>({r=>import r._; _1.map(_=> FcramtRow.tupled((_1.get, _2.get, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13, _14, _15, _16, _17, _18.get, _19.get, _20.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column RAMTRFNUM SqlType(BIGINT), AutoInc, PrimaryKey */
    override val id: Rep[Long] = column[Long]("RAMTRFNUM", O.AutoInc, O.PrimaryKey)
    /** Database column RAMTAUMINCR SqlType(DOUBLE) */
    val ramtaumincr: Rep[Double] = column[Double]("RAMTAUMINCR")
    /** Database column RAMTSTDDEVIATION SqlType(FLOAT), Default(None) */
    val ramtstddeviation: Rep[Option[Float]] = column[Option[Float]]("RAMTSTDDEVIATION", O.Default(None))
    /** Database column RAMTALPHA SqlType(FLOAT), Default(None) */
    val ramtalpha: Rep[Option[Float]] = column[Option[Float]]("RAMTALPHA", O.Default(None))
    /** Database column RAMTBETA SqlType(FLOAT), Default(None) */
    val ramtbeta: Rep[Option[Float]] = column[Option[Float]]("RAMTBETA", O.Default(None))
    /** Database column RAMTRSQUARED SqlType(FLOAT), Default(None) */
    val ramtrsquared: Rep[Option[Float]] = column[Option[Float]]("RAMTRSQUARED", O.Default(None))
    /** Database column RAMTTRACKINGERROR SqlType(FLOAT), Default(None) */
    val ramttrackingerror: Rep[Option[Float]] = column[Option[Float]]("RAMTTRACKINGERROR", O.Default(None))
    /** Database column RAMTSHARPE SqlType(FLOAT), Default(None) */
    val ramtsharpe: Rep[Option[Float]] = column[Option[Float]]("RAMTSHARPE", O.Default(None))
    /** Database column RAMTINFORMATION SqlType(FLOAT), Default(None) */
    val ramtinformation: Rep[Option[Float]] = column[Option[Float]]("RAMTINFORMATION", O.Default(None))
    /** Database column RAMTEXPENSE SqlType(FLOAT), Default(None) */
    val ramtexpense: Rep[Option[Float]] = column[Option[Float]]("RAMTEXPENSE", O.Default(None))
    /** Database column RAMTMATURITY SqlType(FLOAT), Default(None) */
    val ramtmaturity: Rep[Option[Float]] = column[Option[Float]]("RAMTMATURITY", O.Default(None))
    /** Database column RAMTYIELD SqlType(FLOAT), Default(None) */
    val ramtyield: Rep[Option[Float]] = column[Option[Float]]("RAMTYIELD", O.Default(None))
    /** Database column RAMTDURATION SqlType(FLOAT), Default(None) */
    val ramtduration: Rep[Option[Float]] = column[Option[Float]]("RAMTDURATION", O.Default(None))
    /** Database column RAMTASOFDATE SqlType(DATE), Default(None) */
    val ramtasofdate: Rep[Option[java.sql.Date]] = column[Option[java.sql.Date]]("RAMTASOFDATE", O.Default(None))
    /** Database column RAMTYIELDTOMATURITY SqlType(DOUBLE), Default(None) */
    val ramtyieldtomaturity: Rep[Option[Double]] = column[Option[Double]]("RAMTYIELDTOMATURITY", O.Default(None))
    /** Database column RAMTMODIFIEDDURATION SqlType(DOUBLE), Default(None) */
    val ramtmodifiedduration: Rep[Option[Double]] = column[Option[Double]]("RAMTMODIFIEDDURATION", O.Default(None))
  }
  /** Collection-like TableQuery object for table Fcramt */
  lazy val Fcramt = new TableQuery(tag => new Fcramt(tag))

  /** Entity class storing rows of table Fcrbt
   *  @param rbtrfnum Database column RBTRFNUM SqlType(BIGINT), AutoInc, PrimaryKey
   *  @param rbtbranchname Database column RBTBRANCHNAME SqlType(VARCHAR), Length(128,true), Default(None)
   *  @param rbtrtarfnum Database column RBTRTARFNUM SqlType(BIGINT)
   *  @param rbtamtaddressrfnum Database column RBTAMTADDRESSRFNUM SqlType(BIGINT)
   *  @param rbtopentime Database column RBTOPENTIME SqlType(TIMESTAMP), Default(None)
   *  @param rbtclosetime Database column RBTCLOSETIME SqlType(TIMESTAMP), Default(None)
   *  @param rbtcontactperson Database column RBTCONTACTPERSON SqlType(VARCHAR), Length(128,true), Default(None)
   *  @param createdate 
   *  @param modifydate 
   *  @param createdby 
   *  @param lastmodifiedby  */
  case class FcrbtRow(id: Long, rbtbranchname: Option[String] = None, rbtrtarfnum: Long, rbtamtaddressrfnum: Long, rbtopentime: Option[java.sql.Timestamp] = None, rbtclosetime: Option[java.sql.Timestamp] = None, rbtcontactperson: Option[String] = None, createdate: Option[java.sql.Timestamp] = None, modifydate: java.sql.Timestamp, createdby: String, lastmodifiedby: String) extends BaseEntity 
  class FcrbtRowWrapper(id: Option[Long], rbtbranchname: Option[String] = None, rbtrtarfnum: Long, rbtamtaddressrfnum: Long, rbtopentime: Option[java.sql.Timestamp] = None, rbtclosetime: Option[java.sql.Timestamp] = None, rbtcontactperson: Option[String] = None) {
    def get(userName: String): FcrbtRow = {
      FcrbtRow(this.id.getOrElse(0), this.rbtbranchname, this.rbtrtarfnum, this.rbtamtaddressrfnum, this.rbtopentime, this.rbtclosetime, this.rbtcontactperson, Some(DateTimeUtils.getCurrentTimeStamp), DateTimeUtils.getCurrentTimeStamp, userName, userName)
  	}
  }
  /** GetResult implicit for fetching FcrbtRow objects using plain SQL queries */
  implicit def GetResultFcrbtRow(implicit e0: GR[Long], e1: GR[Option[String]], e2: GR[Option[java.sql.Timestamp]], e3: GR[java.sql.Timestamp], e4: GR[String]): GR[FcrbtRow] = GR{
    prs => import prs._
    FcrbtRow.tupled((<<[Long], <<?[String], <<[Long], <<[Long], <<?[java.sql.Timestamp], <<?[java.sql.Timestamp], <<?[String], <<?[java.sql.Timestamp], <<[java.sql.Timestamp], <<[String], <<[String]))
  }
  /** Table description of table FCRBT. Objects of this class serve as prototypes for rows in queries. */
  class Fcrbt(_tableTag: Tag) extends BaseTable[FcrbtRow](_tableTag, "FCRBT") {
    def * = (id, rbtbranchname, rbtrtarfnum, rbtamtaddressrfnum, rbtopentime, rbtclosetime, rbtcontactperson, createdate, modifydate, createdby, lastmodifiedby) <> (FcrbtRow.tupled, FcrbtRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), rbtbranchname, Rep.Some(rbtrtarfnum), Rep.Some(rbtamtaddressrfnum), rbtopentime, rbtclosetime, rbtcontactperson, createdate, Rep.Some(modifydate), Rep.Some(createdby), Rep.Some(lastmodifiedby)).shaped.<>({r=>import r._; _1.map(_=> FcrbtRow.tupled((_1.get, _2, _3.get, _4.get, _5, _6, _7, _8, _9.get, _10.get, _11.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column RBTRFNUM SqlType(BIGINT), AutoInc, PrimaryKey */
    override val id: Rep[Long] = column[Long]("RBTRFNUM", O.AutoInc, O.PrimaryKey)
    /** Database column RBTBRANCHNAME SqlType(VARCHAR), Length(128,true), Default(None) */
    val rbtbranchname: Rep[Option[String]] = column[Option[String]]("RBTBRANCHNAME", O.Length(128,varying=true), O.Default(None))
    /** Database column RBTRTARFNUM SqlType(BIGINT) */
    val rbtrtarfnum: Rep[Long] = column[Long]("RBTRTARFNUM")
    /** Database column RBTAMTADDRESSRFNUM SqlType(BIGINT) */
    val rbtamtaddressrfnum: Rep[Long] = column[Long]("RBTAMTADDRESSRFNUM")
    /** Database column RBTOPENTIME SqlType(TIMESTAMP), Default(None) */
    val rbtopentime: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("RBTOPENTIME", O.Default(None))
    /** Database column RBTCLOSETIME SqlType(TIMESTAMP), Default(None) */
    val rbtclosetime: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("RBTCLOSETIME", O.Default(None))
    /** Database column RBTCONTACTPERSON SqlType(VARCHAR), Length(128,true), Default(None) */
    val rbtcontactperson: Rep[Option[String]] = column[Option[String]]("RBTCONTACTPERSON", O.Length(128,varying=true), O.Default(None))





    /** Foreign key referencing Fcamt (database name FK_FCRBT_FCAMT) */
    lazy val fcamtFk = foreignKey("FK_FCRBT_FCAMT", rbtamtaddressrfnum, Fcamt)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Fcrta (database name FK_FCRBT_FCRTA) */
    lazy val fcrtaFk = foreignKey("FK_FCRBT_FCRTA", rbtrtarfnum, Fcrta)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table Fcrbt */
  lazy val Fcrbt = new TableQuery(tag => new Fcrbt(tag))

  /** Entity class storing rows of table Fcremt
   *  @param remtrfnum Database column REMTRFNUM SqlType(BIGINT), AutoInc, PrimaryKey
   *  @param remtperiodunit Database column REMTPERIODUNIT SqlType(CHAR), Length(2,false)
   *  @param remtperiodvalue Database column REMTPERIODVALUE SqlType(INT)
   *  @param remtreturn Database column REMTRETURN SqlType(FLOAT), Default(None)
   *  @param remtreturnasofdate Database column REMTRETURNASOFDATE SqlType(DATE), Default(None)
   *  @param createdate 
   *  @param modifydate 
   *  @param createdby 
   *  @param lastmodifiedby  */
  case class FcremtRow(id: Long, remtperiodunit: String, remtperiodvalue: Int, remtreturn: Option[Float] = None, remtreturnasofdate: Option[java.sql.Date] = None, createdate: Option[java.sql.Timestamp] = None, modifydate: java.sql.Timestamp, createdby: String, lastmodifiedby: String) extends BaseEntity 
  class FcremtRowWrapper(id: Option[Long], remtperiodunit: String, remtperiodvalue: Int, remtreturn: Option[Float] = None, remtreturnasofdate: Option[java.sql.Date] = None) {
    def get(userName: String): FcremtRow = {
      FcremtRow(this.id.getOrElse(0), this.remtperiodunit, this.remtperiodvalue, this.remtreturn, this.remtreturnasofdate, Some(DateTimeUtils.getCurrentTimeStamp), DateTimeUtils.getCurrentTimeStamp, userName, userName)
  	}
  }
  /** GetResult implicit for fetching FcremtRow objects using plain SQL queries */
  implicit def GetResultFcremtRow(implicit e0: GR[Long], e1: GR[String], e2: GR[Int], e3: GR[Option[Float]], e4: GR[Option[java.sql.Date]], e5: GR[Option[java.sql.Timestamp]], e6: GR[java.sql.Timestamp]): GR[FcremtRow] = GR{
    prs => import prs._
    FcremtRow.tupled((<<[Long], <<[String], <<[Int], <<?[Float], <<?[java.sql.Date], <<?[java.sql.Timestamp], <<[java.sql.Timestamp], <<[String], <<[String]))
  }
  /** Table description of table FCREMT. Objects of this class serve as prototypes for rows in queries. */
  class Fcremt(_tableTag: Tag) extends BaseTable[FcremtRow](_tableTag, "FCREMT") {
    def * = (id, remtperiodunit, remtperiodvalue, remtreturn, remtreturnasofdate, createdate, modifydate, createdby, lastmodifiedby) <> (FcremtRow.tupled, FcremtRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(remtperiodunit), Rep.Some(remtperiodvalue), remtreturn, remtreturnasofdate, createdate, Rep.Some(modifydate), Rep.Some(createdby), Rep.Some(lastmodifiedby)).shaped.<>({r=>import r._; _1.map(_=> FcremtRow.tupled((_1.get, _2.get, _3.get, _4, _5, _6, _7.get, _8.get, _9.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column REMTRFNUM SqlType(BIGINT), AutoInc, PrimaryKey */
    override val id: Rep[Long] = column[Long]("REMTRFNUM", O.AutoInc, O.PrimaryKey)
    /** Database column REMTPERIODUNIT SqlType(CHAR), Length(2,false) */
    val remtperiodunit: Rep[String] = column[String]("REMTPERIODUNIT", O.Length(2,varying=false))
    /** Database column REMTPERIODVALUE SqlType(INT) */
    val remtperiodvalue: Rep[Int] = column[Int]("REMTPERIODVALUE")
    /** Database column REMTRETURN SqlType(FLOAT), Default(None) */
    val remtreturn: Rep[Option[Float]] = column[Option[Float]]("REMTRETURN", O.Default(None))
    /** Database column REMTRETURNASOFDATE SqlType(DATE), Default(None) */
    val remtreturnasofdate: Rep[Option[java.sql.Date]] = column[Option[java.sql.Date]]("REMTRETURNASOFDATE", O.Default(None))
  }
  /** Collection-like TableQuery object for table Fcremt */
  lazy val Fcremt = new TableQuery(tag => new Fcremt(tag))

  /** Entity class storing rows of table Fcrfl
   *  @param rflrfnum Database column RFLRFNUM SqlType(BIGINT), AutoInc, PrimaryKey
   *  @param rflrtaname Database column RFLRTANAME SqlType(VARCHAR), Length(64,true)
   *  @param rflfolioname Database column RFLFOLIONAME SqlType(VARCHAR), Length(32,true), Default(None)
   *  @param rflfomtfolionorfnum Database column RFLFOMTFOLIONORFNUM SqlType(BIGINT)
   *  @param rflordertype Database column RFLORDERTYPE SqlType(CHAR), Length(2,false), Default(None)
   *  @param rflorderquantity Database column RFLORDERQUANTITY SqlType(DOUBLE), Default(None)
   *  @param rflorderid Database column RFLORDERID SqlType(VARCHAR), Length(16,true), Default(None)
   *  @param orderdate Database column ORDERDATE SqlType(DATE) */
  case class FcrflRow(id: Long, rflrtaname: String, rflfolioname: Option[String] = None, rflfomtfolionorfnum: Long, rflordertype: Option[String] = None, rflorderquantity: Option[Double] = None, rflorderid: Option[String] = None, orderdate: java.sql.Date) extends BaseEntity 
  class FcrflRowWrapper(id: Option[Long], rflrtaname: String, rflfolioname: Option[String] = None, rflfomtfolionorfnum: Long, rflordertype: Option[String] = None, rflorderquantity: Option[Double] = None, rflorderid: Option[String] = None, orderdate: java.sql.Date) {
    def get(userName: String): FcrflRow = {
      FcrflRow(this.id.getOrElse(0), this.rflrtaname, this.rflfolioname, this.rflfomtfolionorfnum, this.rflordertype, this.rflorderquantity, this.rflorderid, this.orderdate)
  	}
  }
  /** GetResult implicit for fetching FcrflRow objects using plain SQL queries */
  implicit def GetResultFcrflRow(implicit e0: GR[Long], e1: GR[String], e2: GR[Option[String]], e3: GR[Option[Double]], e4: GR[java.sql.Date]): GR[FcrflRow] = GR{
    prs => import prs._
    FcrflRow.tupled((<<[Long], <<[String], <<?[String], <<[Long], <<?[String], <<?[Double], <<?[String], <<[java.sql.Date]))
  }
  /** Table description of table FCRFL. Objects of this class serve as prototypes for rows in queries. */
  class Fcrfl(_tableTag: Tag) extends BaseTable[FcrflRow](_tableTag, "FCRFL") {
    def * = (id, rflrtaname, rflfolioname, rflfomtfolionorfnum, rflordertype, rflorderquantity, rflorderid, orderdate) <> (FcrflRow.tupled, FcrflRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(rflrtaname), rflfolioname, Rep.Some(rflfomtfolionorfnum), rflordertype, rflorderquantity, rflorderid, Rep.Some(orderdate)).shaped.<>({r=>import r._; _1.map(_=> FcrflRow.tupled((_1.get, _2.get, _3, _4.get, _5, _6, _7, _8.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column RFLRFNUM SqlType(BIGINT), AutoInc, PrimaryKey */
    override val id: Rep[Long] = column[Long]("RFLRFNUM", O.AutoInc, O.PrimaryKey)
    /** Database column RFLRTANAME SqlType(VARCHAR), Length(64,true) */
    val rflrtaname: Rep[String] = column[String]("RFLRTANAME", O.Length(64,varying=true))
    /** Database column RFLFOLIONAME SqlType(VARCHAR), Length(32,true), Default(None) */
    val rflfolioname: Rep[Option[String]] = column[Option[String]]("RFLFOLIONAME", O.Length(32,varying=true), O.Default(None))
    /** Database column RFLFOMTFOLIONORFNUM SqlType(BIGINT) */
    val rflfomtfolionorfnum: Rep[Long] = column[Long]("RFLFOMTFOLIONORFNUM")
    /** Database column RFLORDERTYPE SqlType(CHAR), Length(2,false), Default(None) */
    val rflordertype: Rep[Option[String]] = column[Option[String]]("RFLORDERTYPE", O.Length(2,varying=false), O.Default(None))
    /** Database column RFLORDERQUANTITY SqlType(DOUBLE), Default(None) */
    val rflorderquantity: Rep[Option[Double]] = column[Option[Double]]("RFLORDERQUANTITY", O.Default(None))
    /** Database column RFLORDERID SqlType(VARCHAR), Length(16,true), Default(None) */
    val rflorderid: Rep[Option[String]] = column[Option[String]]("RFLORDERID", O.Length(16,varying=true), O.Default(None))
    /** Database column ORDERDATE SqlType(DATE) */
    val orderdate: Rep[java.sql.Date] = column[java.sql.Date]("ORDERDATE")

    /** Uniqueness Index over (rflfomtfolionorfnum) (database name RFL_FOLIONO_UNQ) */
    val index1 = index("RFL_FOLIONO_UNQ", rflfomtfolionorfnum, unique=true)
  }
  /** Collection-like TableQuery object for table Fcrfl */
  lazy val Fcrfl = new TableQuery(tag => new Fcrfl(tag))

  /** Entity class storing rows of table Fcrlt
   *  @param rltrfnum Database column RLTRFNUM SqlType(BIGINT), AutoInc, PrimaryKey
   *  @param rltratdate Database column RLTRATDATE SqlType(TIMESTAMP), Default(None)
   *  @param rltratrfnum Database column RLTRATRFNUM SqlType(BIGINT)
   *  @param rltratingchangereason Database column RLTRATINGCHANGEREASON SqlType(VARCHAR), Length(128,true), Default(None)
   *  @param rltlastrating Database column RLTLASTRATING SqlType(VARCHAR), Length(50,true), Default(None)
   *  @param rltratingchanged Database column RLTRATINGCHANGED SqlType(VARCHAR), Length(50,true), Default(None)
   *  @param createdate 
   *  @param modifydate 
   *  @param createdby 
   *  @param lastmodifiedby  */
  case class FcrltRow(id: Long, rltratdate: Option[java.sql.Timestamp] = None, rltratrfnum: Long, rltratingchangereason: Option[String] = None, rltlastrating: Option[String] = None, rltratingchanged: Option[String] = None, createdate: Option[java.sql.Timestamp] = None, modifydate: java.sql.Timestamp, createdby: String, lastmodifiedby: String) extends BaseEntity 
  class FcrltRowWrapper(id: Option[Long], rltratdate: Option[java.sql.Timestamp] = None, rltratrfnum: Long, rltratingchangereason: Option[String] = None, rltlastrating: Option[String] = None, rltratingchanged: Option[String] = None) {
    def get(userName: String): FcrltRow = {
      FcrltRow(this.id.getOrElse(0), this.rltratdate, this.rltratrfnum, this.rltratingchangereason, this.rltlastrating, this.rltratingchanged, Some(DateTimeUtils.getCurrentTimeStamp), DateTimeUtils.getCurrentTimeStamp, userName, userName)
  	}
  }
  /** GetResult implicit for fetching FcrltRow objects using plain SQL queries */
  implicit def GetResultFcrltRow(implicit e0: GR[Long], e1: GR[Option[java.sql.Timestamp]], e2: GR[Option[String]], e3: GR[java.sql.Timestamp], e4: GR[String]): GR[FcrltRow] = GR{
    prs => import prs._
    FcrltRow.tupled((<<[Long], <<?[java.sql.Timestamp], <<[Long], <<?[String], <<?[String], <<?[String], <<?[java.sql.Timestamp], <<[java.sql.Timestamp], <<[String], <<[String]))
  }
  /** Table description of table FCRLT. Objects of this class serve as prototypes for rows in queries. */
  class Fcrlt(_tableTag: Tag) extends BaseTable[FcrltRow](_tableTag, "FCRLT") {
    def * = (id, rltratdate, rltratrfnum, rltratingchangereason, rltlastrating, rltratingchanged, createdate, modifydate, createdby, lastmodifiedby) <> (FcrltRow.tupled, FcrltRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), rltratdate, Rep.Some(rltratrfnum), rltratingchangereason, rltlastrating, rltratingchanged, createdate, Rep.Some(modifydate), Rep.Some(createdby), Rep.Some(lastmodifiedby)).shaped.<>({r=>import r._; _1.map(_=> FcrltRow.tupled((_1.get, _2, _3.get, _4, _5, _6, _7, _8.get, _9.get, _10.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column RLTRFNUM SqlType(BIGINT), AutoInc, PrimaryKey */
    override val id: Rep[Long] = column[Long]("RLTRFNUM", O.AutoInc, O.PrimaryKey)
    /** Database column RLTRATDATE SqlType(TIMESTAMP), Default(None) */
    val rltratdate: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("RLTRATDATE", O.Default(None))
    /** Database column RLTRATRFNUM SqlType(BIGINT) */
    val rltratrfnum: Rep[Long] = column[Long]("RLTRATRFNUM")
    /** Database column RLTRATINGCHANGEREASON SqlType(VARCHAR), Length(128,true), Default(None) */
    val rltratingchangereason: Rep[Option[String]] = column[Option[String]]("RLTRATINGCHANGEREASON", O.Length(128,varying=true), O.Default(None))
    /** Database column RLTLASTRATING SqlType(VARCHAR), Length(50,true), Default(None) */
    val rltlastrating: Rep[Option[String]] = column[Option[String]]("RLTLASTRATING", O.Length(50,varying=true), O.Default(None))
    /** Database column RLTRATINGCHANGED SqlType(VARCHAR), Length(50,true), Default(None) */
    val rltratingchanged: Rep[Option[String]] = column[Option[String]]("RLTRATINGCHANGED", O.Length(50,varying=true), O.Default(None))





    /** Foreign key referencing Fcfrt (database name FK_FCRLT_FCRAT) */
    lazy val fcfrtFk = foreignKey("FK_FCRLT_FCRAT", rltratrfnum, Fcfrt)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table Fcrlt */
  lazy val Fcrlt = new TableQuery(tag => new Fcrlt(tag))

  /** Entity class storing rows of table Fcrmt
   *  @param rmtrfnum Database column RMTRFNUM SqlType(BIGINT), AutoInc, PrimaryKey
   *  @param rmtcndrolename Database column RMTCNDROLENAME SqlType(BIGINT)
   *  @param rmtroleid Database column RMTROLEID SqlType(CHAR), Length(15,false)
   *  @param rmtactive Database column RMTACTIVE SqlType(CHAR), Length(2,false)
   *  @param rmtroledescp Database column RMTROLEDESCP SqlType(VARCHAR), Length(128,true), Default(None) */
  case class FcrmtRow(id: Long, rmtcndrolename: Long, rmtroleid: String, rmtactive: String, rmtroledescp: Option[String] = None) extends BaseEntity 
  class FcrmtRowWrapper(id: Option[Long], rmtcndrolename: Long, rmtroleid: String, rmtactive: String, rmtroledescp: Option[String] = None) {
    def get(userName: String): FcrmtRow = {
      FcrmtRow(this.id.getOrElse(0), this.rmtcndrolename, this.rmtroleid, this.rmtactive, this.rmtroledescp)
  	}
  }
  /** GetResult implicit for fetching FcrmtRow objects using plain SQL queries */
  implicit def GetResultFcrmtRow(implicit e0: GR[Long], e1: GR[String], e2: GR[Option[String]]): GR[FcrmtRow] = GR{
    prs => import prs._
    FcrmtRow.tupled((<<[Long], <<[Long], <<[String], <<[String], <<?[String]))
  }
  /** Table description of table FCRMT. Objects of this class serve as prototypes for rows in queries. */
  class Fcrmt(_tableTag: Tag) extends BaseTable[FcrmtRow](_tableTag, "FCRMT") {
    def * = (id, rmtcndrolename, rmtroleid, rmtactive, rmtroledescp) <> (FcrmtRow.tupled, FcrmtRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(rmtcndrolename), Rep.Some(rmtroleid), Rep.Some(rmtactive), rmtroledescp).shaped.<>({r=>import r._; _1.map(_=> FcrmtRow.tupled((_1.get, _2.get, _3.get, _4.get, _5)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column RMTRFNUM SqlType(BIGINT), AutoInc, PrimaryKey */
    override val id: Rep[Long] = column[Long]("RMTRFNUM", O.AutoInc, O.PrimaryKey)
    /** Database column RMTCNDROLENAME SqlType(BIGINT) */
    val rmtcndrolename: Rep[Long] = column[Long]("RMTCNDROLENAME")
    /** Database column RMTROLEID SqlType(CHAR), Length(15,false) */
    val rmtroleid: Rep[String] = column[String]("RMTROLEID", O.Length(15,varying=false))
    /** Database column RMTACTIVE SqlType(CHAR), Length(2,false) */
    val rmtactive: Rep[String] = column[String]("RMTACTIVE", O.Length(2,varying=false))
    /** Database column RMTROLEDESCP SqlType(VARCHAR), Length(128,true), Default(None) */
    val rmtroledescp: Rep[Option[String]] = column[Option[String]]("RMTROLEDESCP", O.Length(128,varying=true), O.Default(None))
  }
  /** Collection-like TableQuery object for table Fcrmt */
  lazy val Fcrmt = new TableQuery(tag => new Fcrmt(tag))

  /** Entity class storing rows of table Fcrta
   *  @param rtarfnum Database column RTARFNUM SqlType(BIGINT), AutoInc, PrimaryKey
   *  @param rtaname Database column RTANAME SqlType(CHAR), Length(16,false)
   *  @param rtacode Database column RTACODE SqlType(CHAR), Length(10,false)
   *  @param rtacntctperson Database column RTACNTCTPERSON SqlType(VARCHAR), Length(64,true)
   *  @param rtaactive Database column RTAACTIVE SqlType(CHAR), Length(2,false)
   *  @param rtadescription Database column RTADESCRIPTION SqlType(VARCHAR), Length(256,true), Default(None)
   *  @param createdate 
   *  @param modifydate 
   *  @param createdby 
   *  @param lastmodifiedby  */
  case class FcrtaRow(id: Long, rtaname: String, rtacode: String, rtacntctperson: String, rtaactive: String, rtadescription: Option[String] = None, createdate: Option[java.sql.Timestamp] = None, modifydate: java.sql.Timestamp, createdby: String, lastmodifiedby: String) extends BaseEntity 
  class FcrtaRowWrapper(id: Option[Long], rtaname: String, rtacode: String, rtacntctperson: String, rtaactive: String, rtadescription: Option[String] = None) {
    def get(userName: String): FcrtaRow = {
      FcrtaRow(this.id.getOrElse(0), this.rtaname, this.rtacode, this.rtacntctperson, this.rtaactive, this.rtadescription, Some(DateTimeUtils.getCurrentTimeStamp), DateTimeUtils.getCurrentTimeStamp, userName, userName)
  	}
  }
  /** GetResult implicit for fetching FcrtaRow objects using plain SQL queries */
  implicit def GetResultFcrtaRow(implicit e0: GR[Long], e1: GR[String], e2: GR[Option[String]], e3: GR[Option[java.sql.Timestamp]], e4: GR[java.sql.Timestamp]): GR[FcrtaRow] = GR{
    prs => import prs._
    FcrtaRow.tupled((<<[Long], <<[String], <<[String], <<[String], <<[String], <<?[String], <<?[java.sql.Timestamp], <<[java.sql.Timestamp], <<[String], <<[String]))
  }
  /** Table description of table FCRTA. Objects of this class serve as prototypes for rows in queries. */
  class Fcrta(_tableTag: Tag) extends BaseTable[FcrtaRow](_tableTag, "FCRTA") {
    def * = (id, rtaname, rtacode, rtacntctperson, rtaactive, rtadescription, createdate, modifydate, createdby, lastmodifiedby) <> (FcrtaRow.tupled, FcrtaRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(rtaname), Rep.Some(rtacode), Rep.Some(rtacntctperson), Rep.Some(rtaactive), rtadescription, createdate, Rep.Some(modifydate), Rep.Some(createdby), Rep.Some(lastmodifiedby)).shaped.<>({r=>import r._; _1.map(_=> FcrtaRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6, _7, _8.get, _9.get, _10.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column RTARFNUM SqlType(BIGINT), AutoInc, PrimaryKey */
    override val id: Rep[Long] = column[Long]("RTARFNUM", O.AutoInc, O.PrimaryKey)
    /** Database column RTANAME SqlType(CHAR), Length(16,false) */
    val rtaname: Rep[String] = column[String]("RTANAME", O.Length(16,varying=false))
    /** Database column RTACODE SqlType(CHAR), Length(10,false) */
    val rtacode: Rep[String] = column[String]("RTACODE", O.Length(10,varying=false))
    /** Database column RTACNTCTPERSON SqlType(VARCHAR), Length(64,true) */
    val rtacntctperson: Rep[String] = column[String]("RTACNTCTPERSON", O.Length(64,varying=true))
    /** Database column RTAACTIVE SqlType(CHAR), Length(2,false) */
    val rtaactive: Rep[String] = column[String]("RTAACTIVE", O.Length(2,varying=false))
    /** Database column RTADESCRIPTION SqlType(VARCHAR), Length(256,true), Default(None) */
    val rtadescription: Rep[Option[String]] = column[Option[String]]("RTADESCRIPTION", O.Length(256,varying=true), O.Default(None))
  }
  /** Collection-like TableQuery object for table Fcrta */
  lazy val Fcrta = new TableQuery(tag => new Fcrta(tag))

  /** Entity class storing rows of table Fcsaa
   *  @param saarfnum Database column SAARFNUM SqlType(BIGINT), PrimaryKey
   *  @param saabondnet Database column SAABONDNET SqlType(FLOAT), Default(None)
   *  @param saaequitynet Database column SAAEQUITYNET SqlType(FLOAT), Default(None)
   *  @param saacashnet Database column SAACASHNET SqlType(FLOAT), Default(None)
   *  @param saaothernet Database column SAAOTHERNET SqlType(FLOAT), Default(None)
   *  @param saaasofdate Database column SAAASOFDATE SqlType(DATE), Default(None)
   *  @param saadsarfnum Database column SAADSARFNUM SqlType(BIGINT)
   *  @param saaprefstocknet Database column SAAPREFSTOCKNET SqlType(FLOAT), Default(None)
   *  @param createdate 
   *  @param modifydate 
   *  @param createdby 
   *  @param lastmodifiedby  */
  case class FcsaaRow(id: Long, saabondnet: Option[Float] = None, saaequitynet: Option[Float] = None, saacashnet: Option[Float] = None, saaothernet: Option[Float] = None, saaasofdate: Option[java.sql.Date] = None, saadsarfnum: Long, saaprefstocknet: Option[Float] = None, createdate: Option[java.sql.Timestamp] = None, modifydate: java.sql.Timestamp, createdby: String, lastmodifiedby: String) extends BaseEntity 
  class FcsaaRowWrapper(id: Long, saabondnet: Option[Float] = None, saaequitynet: Option[Float] = None, saacashnet: Option[Float] = None, saaothernet: Option[Float] = None, saaasofdate: Option[java.sql.Date] = None, saadsarfnum: Long, saaprefstocknet: Option[Float] = None) {
    def get(userName: String): FcsaaRow = {
      FcsaaRow(this.id, this.saabondnet, this.saaequitynet, this.saacashnet, this.saaothernet, this.saaasofdate, this.saadsarfnum, this.saaprefstocknet, Some(DateTimeUtils.getCurrentTimeStamp), DateTimeUtils.getCurrentTimeStamp, userName, userName)
  	}
  }
  /** GetResult implicit for fetching FcsaaRow objects using plain SQL queries */
  implicit def GetResultFcsaaRow(implicit e0: GR[Long], e1: GR[Option[Float]], e2: GR[Option[java.sql.Date]], e3: GR[Option[java.sql.Timestamp]], e4: GR[java.sql.Timestamp], e5: GR[String]): GR[FcsaaRow] = GR{
    prs => import prs._
    FcsaaRow.tupled((<<[Long], <<?[Float], <<?[Float], <<?[Float], <<?[Float], <<?[java.sql.Date], <<[Long], <<?[Float], <<?[java.sql.Timestamp], <<[java.sql.Timestamp], <<[String], <<[String]))
  }
  /** Table description of table FCSAA. Objects of this class serve as prototypes for rows in queries. */
  class Fcsaa(_tableTag: Tag) extends BaseTable[FcsaaRow](_tableTag, "FCSAA") {
    def * = (id, saabondnet, saaequitynet, saacashnet, saaothernet, saaasofdate, saadsarfnum, saaprefstocknet, createdate, modifydate, createdby, lastmodifiedby) <> (FcsaaRow.tupled, FcsaaRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), saabondnet, saaequitynet, saacashnet, saaothernet, saaasofdate, Rep.Some(saadsarfnum), saaprefstocknet, createdate, Rep.Some(modifydate), Rep.Some(createdby), Rep.Some(lastmodifiedby)).shaped.<>({r=>import r._; _1.map(_=> FcsaaRow.tupled((_1.get, _2, _3, _4, _5, _6, _7.get, _8, _9, _10.get, _11.get, _12.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column SAARFNUM SqlType(BIGINT), PrimaryKey */
    override val id: Rep[Long] = column[Long]("SAARFNUM", O.PrimaryKey)
    /** Database column SAABONDNET SqlType(FLOAT), Default(None) */
    val saabondnet: Rep[Option[Float]] = column[Option[Float]]("SAABONDNET", O.Default(None))
    /** Database column SAAEQUITYNET SqlType(FLOAT), Default(None) */
    val saaequitynet: Rep[Option[Float]] = column[Option[Float]]("SAAEQUITYNET", O.Default(None))
    /** Database column SAACASHNET SqlType(FLOAT), Default(None) */
    val saacashnet: Rep[Option[Float]] = column[Option[Float]]("SAACASHNET", O.Default(None))
    /** Database column SAAOTHERNET SqlType(FLOAT), Default(None) */
    val saaothernet: Rep[Option[Float]] = column[Option[Float]]("SAAOTHERNET", O.Default(None))
    /** Database column SAAASOFDATE SqlType(DATE), Default(None) */
    val saaasofdate: Rep[Option[java.sql.Date]] = column[Option[java.sql.Date]]("SAAASOFDATE", O.Default(None))
    /** Database column SAADSARFNUM SqlType(BIGINT) */
    val saadsarfnum: Rep[Long] = column[Long]("SAADSARFNUM")
    /** Database column SAAPREFSTOCKNET SqlType(FLOAT), Default(None) */
    val saaprefstocknet: Rep[Option[Float]] = column[Option[Float]]("SAAPREFSTOCKNET", O.Default(None))





    /** Foreign key referencing Fcdsa (database name FK_FCSAA_FCDSA) */
    lazy val fcdsaFk = foreignKey("FK_FCSAA_FCDSA", saadsarfnum, Fcdsa)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table Fcsaa */
  lazy val Fcsaa = new TableQuery(tag => new Fcsaa(tag))

  /** Entity class storing rows of table Fcscq
   *  @param scqrfnum Database column SCQRFNUM SqlType(BIGINT), AutoInc, PrimaryKey
   *  @param scqcreditqualityname Database column SCQCREDITQUALITYNAME SqlType(CHAR), Length(16,false)
   *  @param scqcreditvalue Database column SCQCREDITVALUE SqlType(FLOAT)
   *  @param scqdsarfnum Database column SCQDSARFNUM SqlType(BIGINT)
   *  @param scqcreditqualitydate Database column SCQCREDITQUALITYDATE SqlType(DATE), Default(None)
   *  @param scqasofdate Database column SCQASOFDATE SqlType(DATE)
   *  @param createdate 
   *  @param modifydate 
   *  @param createdby 
   *  @param lastmodifiedby  */
  case class FcscqRow(id: Long, scqcreditqualityname: String, scqcreditvalue: Float, scqdsarfnum: Long, scqcreditqualitydate: Option[java.sql.Date] = None, scqasofdate: java.sql.Date, createdate: Option[java.sql.Timestamp] = None, modifydate: java.sql.Timestamp, createdby: String, lastmodifiedby: String) extends BaseEntity 
  class FcscqRowWrapper(id: Option[Long], scqcreditqualityname: String, scqcreditvalue: Float, scqdsarfnum: Long, scqcreditqualitydate: Option[java.sql.Date] = None, scqasofdate: java.sql.Date) {
    def get(userName: String): FcscqRow = {
      FcscqRow(this.id.getOrElse(0), this.scqcreditqualityname, this.scqcreditvalue, this.scqdsarfnum, this.scqcreditqualitydate, this.scqasofdate, Some(DateTimeUtils.getCurrentTimeStamp), DateTimeUtils.getCurrentTimeStamp, userName, userName)
  	}
  }
  /** GetResult implicit for fetching FcscqRow objects using plain SQL queries */
  implicit def GetResultFcscqRow(implicit e0: GR[Long], e1: GR[String], e2: GR[Float], e3: GR[Option[java.sql.Date]], e4: GR[java.sql.Date], e5: GR[Option[java.sql.Timestamp]], e6: GR[java.sql.Timestamp]): GR[FcscqRow] = GR{
    prs => import prs._
    FcscqRow.tupled((<<[Long], <<[String], <<[Float], <<[Long], <<?[java.sql.Date], <<[java.sql.Date], <<?[java.sql.Timestamp], <<[java.sql.Timestamp], <<[String], <<[String]))
  }
  /** Table description of table FCSCQ. Objects of this class serve as prototypes for rows in queries. */
  class Fcscq(_tableTag: Tag) extends BaseTable[FcscqRow](_tableTag, "FCSCQ") {
    def * = (id, scqcreditqualityname, scqcreditvalue, scqdsarfnum, scqcreditqualitydate, scqasofdate, createdate, modifydate, createdby, lastmodifiedby) <> (FcscqRow.tupled, FcscqRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(scqcreditqualityname), Rep.Some(scqcreditvalue), Rep.Some(scqdsarfnum), scqcreditqualitydate, Rep.Some(scqasofdate), createdate, Rep.Some(modifydate), Rep.Some(createdby), Rep.Some(lastmodifiedby)).shaped.<>({r=>import r._; _1.map(_=> FcscqRow.tupled((_1.get, _2.get, _3.get, _4.get, _5, _6.get, _7, _8.get, _9.get, _10.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column SCQRFNUM SqlType(BIGINT), AutoInc, PrimaryKey */
    override val id: Rep[Long] = column[Long]("SCQRFNUM", O.AutoInc, O.PrimaryKey)
    /** Database column SCQCREDITQUALITYNAME SqlType(CHAR), Length(16,false) */
    val scqcreditqualityname: Rep[String] = column[String]("SCQCREDITQUALITYNAME", O.Length(16,varying=false))
    /** Database column SCQCREDITVALUE SqlType(FLOAT) */
    val scqcreditvalue: Rep[Float] = column[Float]("SCQCREDITVALUE")
    /** Database column SCQDSARFNUM SqlType(BIGINT) */
    val scqdsarfnum: Rep[Long] = column[Long]("SCQDSARFNUM")
    /** Database column SCQCREDITQUALITYDATE SqlType(DATE), Default(None) */
    val scqcreditqualitydate: Rep[Option[java.sql.Date]] = column[Option[java.sql.Date]]("SCQCREDITQUALITYDATE", O.Default(None))
    /** Database column SCQASOFDATE SqlType(DATE) */
    val scqasofdate: Rep[java.sql.Date] = column[java.sql.Date]("SCQASOFDATE")





    /** Foreign key referencing Fcdsa (database name FK_FCSCQ_FCDSA) */
    lazy val fcdsaFk = foreignKey("FK_FCSCQ_FCDSA", scqdsarfnum, Fcdsa)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table Fcscq */
  lazy val Fcscq = new TableQuery(tag => new Fcscq(tag))

  /** Entity class storing rows of table Fcscra
   *  @param scrarfnum Database column SCRARFNUM SqlType(BIGINT), AutoInc, PrimaryKey
   *  @param scradsarfnum Database column SCRADSARFNUM SqlType(BIGINT)
   *  @param scracyrrfnum Database column SCRACYRRFNUM SqlType(BIGINT)
   *  @param createdate 
   *  @param modifydate 
   *  @param createdby 
   *  @param lastmodifiedby  */
  case class FcscraRow(id: Long, scradsarfnum: Long, scracyrrfnum: Long, createdate: Option[java.sql.Timestamp] = None, modifydate: java.sql.Timestamp, createdby: String, lastmodifiedby: String) extends BaseEntity 
  class FcscraRowWrapper(id: Option[Long], scradsarfnum: Long, scracyrrfnum: Long) {
    def get(userName: String): FcscraRow = {
      FcscraRow(this.id.getOrElse(0), this.scradsarfnum, this.scracyrrfnum, Some(DateTimeUtils.getCurrentTimeStamp), DateTimeUtils.getCurrentTimeStamp, userName, userName)
  	}
  }
  /** GetResult implicit for fetching FcscraRow objects using plain SQL queries */
  implicit def GetResultFcscraRow(implicit e0: GR[Long], e1: GR[Option[java.sql.Timestamp]], e2: GR[java.sql.Timestamp], e3: GR[String]): GR[FcscraRow] = GR{
    prs => import prs._
    FcscraRow.tupled((<<[Long], <<[Long], <<[Long], <<?[java.sql.Timestamp], <<[java.sql.Timestamp], <<[String], <<[String]))
  }
  /** Table description of table FCSCRA. Objects of this class serve as prototypes for rows in queries. */
  class Fcscra(_tableTag: Tag) extends BaseTable[FcscraRow](_tableTag, "FCSCRA") {
    def * = (id, scradsarfnum, scracyrrfnum, createdate, modifydate, createdby, lastmodifiedby) <> (FcscraRow.tupled, FcscraRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(scradsarfnum), Rep.Some(scracyrrfnum), createdate, Rep.Some(modifydate), Rep.Some(createdby), Rep.Some(lastmodifiedby)).shaped.<>({r=>import r._; _1.map(_=> FcscraRow.tupled((_1.get, _2.get, _3.get, _4, _5.get, _6.get, _7.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column SCRARFNUM SqlType(BIGINT), AutoInc, PrimaryKey */
    override val id: Rep[Long] = column[Long]("SCRARFNUM", O.AutoInc, O.PrimaryKey)
    /** Database column SCRADSARFNUM SqlType(BIGINT) */
    val scradsarfnum: Rep[Long] = column[Long]("SCRADSARFNUM")
    /** Database column SCRACYRRFNUM SqlType(BIGINT) */
    val scracyrrfnum: Rep[Long] = column[Long]("SCRACYRRFNUM")





    /** Foreign key referencing Fccyr (database name FK_FCSCRA_FCCYR) */
    lazy val fccyrFk = foreignKey("FK_FCSCRA_FCCYR", scracyrrfnum, Fccyr)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Fcdsa (database name FK_FCSCRA_FCDSA) */
    lazy val fcdsaFk = foreignKey("FK_FCSCRA_FCDSA", scradsarfnum, Fcdsa)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table Fcscra */
  lazy val Fcscra = new TableQuery(tag => new Fcscra(tag))

  /** Entity class storing rows of table Fcsec
   *  @param secrfnum Database column SECRFNUM SqlType(BIGINT), AutoInc, PrimaryKey
   *  @param secsecname Database column SECSECNAME SqlType(VARCHAR), Length(128,true)
   *  @param secdisname Database column SECDISNAME SqlType(VARCHAR), Length(128,true), Default(None)
   *  @param seccndsectorrfnum Database column SECCNDSECTORRFNUM SqlType(BIGINT)
   *  @param secholdingtype Database column SECHOLDINGTYPE SqlType(CHAR), Length(2,false), Default(None)
   *  @param seccode1 Database column SECCODE1 SqlType(VARCHAR), Length(32,true), Default(None)
   *  @param secmaturity Database column SECMATURITY SqlType(DATE), Default(None)
   *  @param secsecurityisin Database column SECSECURITYISIN SqlType(VARCHAR), Length(16,true), Default(None)
   *  @param seccreditrating Database column SECCREDITRATING SqlType(VARCHAR), Length(64,true), Default(None)
   *  @param seccoupon Database column SECCOUPON SqlType(FLOAT), Default(None)
   *  @param secpbratio Database column SECPBRATIO SqlType(FLOAT), Default(None)
   *  @param secdividendyield Database column SECDIVIDENDYIELD SqlType(FLOAT), Default(None)
   *  @param secsectorialpe Database column SECSECTORIALPE SqlType(FLOAT), Default(None)
   *  @param secperatio Database column SECPERATIO SqlType(FLOAT), Default(None)
   *  @param createdate 
   *  @param modifydate 
   *  @param createdby 
   *  @param lastmodifiedby  */
  case class FcsecRow(id: Long, secsecname: String, secdisname: Option[String] = None, seccndsectorrfnum: Long, secholdingtype: Option[String] = None, seccode1: Option[String] = None, secmaturity: Option[java.sql.Date] = None, secsecurityisin: Option[String] = None, seccreditrating: Option[String] = None, seccoupon: Option[Float] = None, secpbratio: Option[Float] = None, secdividendyield: Option[Float] = None, secsectorialpe: Option[Float] = None, secperatio: Option[Float] = None, createdate: Option[java.sql.Timestamp] = None, modifydate: java.sql.Timestamp, createdby: String, lastmodifiedby: String) extends BaseEntity 
  class FcsecRowWrapper(id: Option[Long], secsecname: String, secdisname: Option[String] = None, seccndsectorrfnum: Long, secholdingtype: Option[String] = None, seccode1: Option[String] = None, secmaturity: Option[java.sql.Date] = None, secsecurityisin: Option[String] = None, seccreditrating: Option[String] = None, seccoupon: Option[Float] = None, secpbratio: Option[Float] = None, secdividendyield: Option[Float] = None, secsectorialpe: Option[Float] = None, secperatio: Option[Float] = None) {
    def get(userName: String): FcsecRow = {
      FcsecRow(this.id.getOrElse(0), this.secsecname, this.secdisname, this.seccndsectorrfnum, this.secholdingtype, this.seccode1, this.secmaturity, this.secsecurityisin, this.seccreditrating, this.seccoupon, this.secpbratio, this.secdividendyield, this.secsectorialpe, this.secperatio, Some(DateTimeUtils.getCurrentTimeStamp), DateTimeUtils.getCurrentTimeStamp, userName, userName)
  	}
  }
  /** GetResult implicit for fetching FcsecRow objects using plain SQL queries */
  implicit def GetResultFcsecRow(implicit e0: GR[Long], e1: GR[String], e2: GR[Option[String]], e3: GR[Option[java.sql.Date]], e4: GR[Option[Float]], e5: GR[Option[java.sql.Timestamp]], e6: GR[java.sql.Timestamp]): GR[FcsecRow] = GR{
    prs => import prs._
    FcsecRow.tupled((<<[Long], <<[String], <<?[String], <<[Long], <<?[String], <<?[String], <<?[java.sql.Date], <<?[String], <<?[String], <<?[Float], <<?[Float], <<?[Float], <<?[Float], <<?[Float], <<?[java.sql.Timestamp], <<[java.sql.Timestamp], <<[String], <<[String]))
  }
  /** Table description of table FCSEC. Objects of this class serve as prototypes for rows in queries. */
  class Fcsec(_tableTag: Tag) extends BaseTable[FcsecRow](_tableTag, "FCSEC") {
    def * = (id, secsecname, secdisname, seccndsectorrfnum, secholdingtype, seccode1, secmaturity, secsecurityisin, seccreditrating, seccoupon, secpbratio, secdividendyield, secsectorialpe, secperatio, createdate, modifydate, createdby, lastmodifiedby) <> (FcsecRow.tupled, FcsecRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(secsecname), secdisname, Rep.Some(seccndsectorrfnum), secholdingtype, seccode1, secmaturity, secsecurityisin, seccreditrating, seccoupon, secpbratio, secdividendyield, secsectorialpe, secperatio, createdate, Rep.Some(modifydate), Rep.Some(createdby), Rep.Some(lastmodifiedby)).shaped.<>({r=>import r._; _1.map(_=> FcsecRow.tupled((_1.get, _2.get, _3, _4.get, _5, _6, _7, _8, _9, _10, _11, _12, _13, _14, _15, _16.get, _17.get, _18.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column SECRFNUM SqlType(BIGINT), AutoInc, PrimaryKey */
    override val id: Rep[Long] = column[Long]("SECRFNUM", O.AutoInc, O.PrimaryKey)
    /** Database column SECSECNAME SqlType(VARCHAR), Length(128,true) */
    val secsecname: Rep[String] = column[String]("SECSECNAME", O.Length(128,varying=true))
    /** Database column SECDISNAME SqlType(VARCHAR), Length(128,true), Default(None) */
    val secdisname: Rep[Option[String]] = column[Option[String]]("SECDISNAME", O.Length(128,varying=true), O.Default(None))
    /** Database column SECCNDSECTORRFNUM SqlType(BIGINT) */
    val seccndsectorrfnum: Rep[Long] = column[Long]("SECCNDSECTORRFNUM")
    /** Database column SECHOLDINGTYPE SqlType(CHAR), Length(2,false), Default(None) */
    val secholdingtype: Rep[Option[String]] = column[Option[String]]("SECHOLDINGTYPE", O.Length(2,varying=false), O.Default(None))
    /** Database column SECCODE1 SqlType(VARCHAR), Length(32,true), Default(None) */
    val seccode1: Rep[Option[String]] = column[Option[String]]("SECCODE1", O.Length(32,varying=true), O.Default(None))
    /** Database column SECMATURITY SqlType(DATE), Default(None) */
    val secmaturity: Rep[Option[java.sql.Date]] = column[Option[java.sql.Date]]("SECMATURITY", O.Default(None))
    /** Database column SECSECURITYISIN SqlType(VARCHAR), Length(16,true), Default(None) */
    val secsecurityisin: Rep[Option[String]] = column[Option[String]]("SECSECURITYISIN", O.Length(16,varying=true), O.Default(None))
    /** Database column SECCREDITRATING SqlType(VARCHAR), Length(64,true), Default(None) */
    val seccreditrating: Rep[Option[String]] = column[Option[String]]("SECCREDITRATING", O.Length(64,varying=true), O.Default(None))
    /** Database column SECCOUPON SqlType(FLOAT), Default(None) */
    val seccoupon: Rep[Option[Float]] = column[Option[Float]]("SECCOUPON", O.Default(None))
    /** Database column SECPBRATIO SqlType(FLOAT), Default(None) */
    val secpbratio: Rep[Option[Float]] = column[Option[Float]]("SECPBRATIO", O.Default(None))
    /** Database column SECDIVIDENDYIELD SqlType(FLOAT), Default(None) */
    val secdividendyield: Rep[Option[Float]] = column[Option[Float]]("SECDIVIDENDYIELD", O.Default(None))
    /** Database column SECSECTORIALPE SqlType(FLOAT), Default(None) */
    val secsectorialpe: Rep[Option[Float]] = column[Option[Float]]("SECSECTORIALPE", O.Default(None))
    /** Database column SECPERATIO SqlType(FLOAT), Default(None) */
    val secperatio: Rep[Option[Float]] = column[Option[Float]]("SECPERATIO", O.Default(None))





    /** Foreign key referencing Fccnd (database name FK_FCSEC_FCCND_02) */
    lazy val fccndFk = foreignKey("FK_FCSEC_FCCND_02", seccndsectorrfnum, Fccnd)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table Fcsec */
  lazy val Fcsec = new TableQuery(tag => new Fcsec(tag))

  /** Entity class storing rows of table Fcset
   *  @param setrfnum Database column SETRFNUM SqlType(BIGINT), AutoInc, PrimaryKey
   *  @param setrolechange Database column SETROLECHANGE SqlType(VARCHAR), Length(64,true), Default(None)
   *  @param setrolechangedate Database column SETROLECHANGEDATE SqlType(DATE), Default(None)
   *  @param setschemeupdate Database column SETSCHEMEUPDATE SqlType(VARCHAR), Length(1024,true), Default(None)
   *  @param setschemeupdatedate Database column SETSCHEMEUPDATEDATE SqlType(DATE), Default(None)
   *  @param setschemename Database column SETSCHEMENAME SqlType(VARCHAR), Length(128,true)
   *  @param setsmtrfnum Database column SETSMTRFNUM SqlType(BIGINT)
   *  @param createdate 
   *  @param modifydate 
   *  @param createdby 
   *  @param lastmodifiedby  */
  case class FcsetRow(id: Long, setrolechange: Option[String] = None, setrolechangedate: Option[java.sql.Date] = None, setschemeupdate: Option[String] = None, setschemeupdatedate: Option[java.sql.Date] = None, setschemename: String, setsmtrfnum: Long, createdate: Option[java.sql.Timestamp] = None, modifydate: java.sql.Timestamp, createdby: String, lastmodifiedby: String) extends BaseEntity 
  class FcsetRowWrapper(id: Option[Long], setrolechange: Option[String] = None, setrolechangedate: Option[java.sql.Date] = None, setschemeupdate: Option[String] = None, setschemeupdatedate: Option[java.sql.Date] = None, setschemename: String, setsmtrfnum: Long) {
    def get(userName: String): FcsetRow = {
      FcsetRow(this.id.getOrElse(0), this.setrolechange, this.setrolechangedate, this.setschemeupdate, this.setschemeupdatedate, this.setschemename, this.setsmtrfnum, Some(DateTimeUtils.getCurrentTimeStamp), DateTimeUtils.getCurrentTimeStamp, userName, userName)
  	}
  }
  /** GetResult implicit for fetching FcsetRow objects using plain SQL queries */
  implicit def GetResultFcsetRow(implicit e0: GR[Long], e1: GR[Option[String]], e2: GR[Option[java.sql.Date]], e3: GR[String], e4: GR[Option[java.sql.Timestamp]], e5: GR[java.sql.Timestamp]): GR[FcsetRow] = GR{
    prs => import prs._
    FcsetRow.tupled((<<[Long], <<?[String], <<?[java.sql.Date], <<?[String], <<?[java.sql.Date], <<[String], <<[Long], <<?[java.sql.Timestamp], <<[java.sql.Timestamp], <<[String], <<[String]))
  }
  /** Table description of table FCSET. Objects of this class serve as prototypes for rows in queries. */
  class Fcset(_tableTag: Tag) extends BaseTable[FcsetRow](_tableTag, "FCSET") {
    def * = (id, setrolechange, setrolechangedate, setschemeupdate, setschemeupdatedate, setschemename, setsmtrfnum, createdate, modifydate, createdby, lastmodifiedby) <> (FcsetRow.tupled, FcsetRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), setrolechange, setrolechangedate, setschemeupdate, setschemeupdatedate, Rep.Some(setschemename), Rep.Some(setsmtrfnum), createdate, Rep.Some(modifydate), Rep.Some(createdby), Rep.Some(lastmodifiedby)).shaped.<>({r=>import r._; _1.map(_=> FcsetRow.tupled((_1.get, _2, _3, _4, _5, _6.get, _7.get, _8, _9.get, _10.get, _11.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column SETRFNUM SqlType(BIGINT), AutoInc, PrimaryKey */
    override val id: Rep[Long] = column[Long]("SETRFNUM", O.AutoInc, O.PrimaryKey)
    /** Database column SETROLECHANGE SqlType(VARCHAR), Length(64,true), Default(None) */
    val setrolechange: Rep[Option[String]] = column[Option[String]]("SETROLECHANGE", O.Length(64,varying=true), O.Default(None))
    /** Database column SETROLECHANGEDATE SqlType(DATE), Default(None) */
    val setrolechangedate: Rep[Option[java.sql.Date]] = column[Option[java.sql.Date]]("SETROLECHANGEDATE", O.Default(None))
    /** Database column SETSCHEMEUPDATE SqlType(VARCHAR), Length(1024,true), Default(None) */
    val setschemeupdate: Rep[Option[String]] = column[Option[String]]("SETSCHEMEUPDATE", O.Length(1024,varying=true), O.Default(None))
    /** Database column SETSCHEMEUPDATEDATE SqlType(DATE), Default(None) */
    val setschemeupdatedate: Rep[Option[java.sql.Date]] = column[Option[java.sql.Date]]("SETSCHEMEUPDATEDATE", O.Default(None))
    /** Database column SETSCHEMENAME SqlType(VARCHAR), Length(128,true) */
    val setschemename: Rep[String] = column[String]("SETSCHEMENAME", O.Length(128,varying=true))
    /** Database column SETSMTRFNUM SqlType(BIGINT) */
    val setsmtrfnum: Rep[Long] = column[Long]("SETSMTRFNUM")





    /** Foreign key referencing Fcsmt (database name FK_FCSET_FCSMT) */
    lazy val fcsmtFk = foreignKey("FK_FCSET_FCSMT", setsmtrfnum, Fcsmt)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table Fcset */
  lazy val Fcset = new TableQuery(tag => new Fcset(tag))

  /** Entity class storing rows of table Fcsft
   *  @param sftsoptrfnum Database column SFTSOPTRFNUM SqlType(BIGINT), PrimaryKey
   *  @param sftsipflag Database column SFTSIPFLAG SqlType(CHAR), Length(2,false)
   *  @param sftstpflag Database column SFTSTPFLAG SqlType(CHAR), Length(2,false)
   *  @param sftswpflag Database column SFTSWPFLAG SqlType(CHAR), Length(2,false)
   *  @param sftswitchflag Database column SFTSWITCHFLAG SqlType(CHAR), Length(2,false)
   *  @param sftlockinperiodflag Database column SFTLOCKINPERIODFLAG SqlType(CHAR), Length(2,false)
   *  @param sftlockinperiodindays Database column SFTLOCKINPERIODINDAYS SqlType(INT), Default(None)
   *  @param sftterminationdate Database column SFTTERMINATIONDATE SqlType(DATE), Default(None)
   *  @param sftexitloadflag Database column SFTEXITLOADFLAG SqlType(CHAR), Length(2,false)
   *  @param createdate 
   *  @param modifydate 
   *  @param createdby 
   *  @param lastmodifiedby  */
  case class FcsftRow(id: Long, sftsipflag: String, sftstpflag: String, sftswpflag: String, sftswitchflag: String, sftlockinperiodflag: String, sftlockinperiodindays: Option[Int] = None, sftterminationdate: Option[java.sql.Date] = None, sftexitloadflag: String, createdate: Option[java.sql.Timestamp] = None, modifydate: java.sql.Timestamp, createdby: String, lastmodifiedby: String) extends BaseEntity 
  class FcsftRowWrapper(id: Long, sftsipflag: String, sftstpflag: String, sftswpflag: String, sftswitchflag: String, sftlockinperiodflag: String, sftlockinperiodindays: Option[Int] = None, sftterminationdate: Option[java.sql.Date] = None, sftexitloadflag: String) {
    def get(userName: String): FcsftRow = {
      FcsftRow(this.id, this.sftsipflag, this.sftstpflag, this.sftswpflag, this.sftswitchflag, this.sftlockinperiodflag, this.sftlockinperiodindays, this.sftterminationdate, this.sftexitloadflag, Some(DateTimeUtils.getCurrentTimeStamp), DateTimeUtils.getCurrentTimeStamp, userName, userName)
  	}
  }
  /** GetResult implicit for fetching FcsftRow objects using plain SQL queries */
  implicit def GetResultFcsftRow(implicit e0: GR[Long], e1: GR[String], e2: GR[Option[Int]], e3: GR[Option[java.sql.Date]], e4: GR[Option[java.sql.Timestamp]], e5: GR[java.sql.Timestamp]): GR[FcsftRow] = GR{
    prs => import prs._
    FcsftRow.tupled((<<[Long], <<[String], <<[String], <<[String], <<[String], <<[String], <<?[Int], <<?[java.sql.Date], <<[String], <<?[java.sql.Timestamp], <<[java.sql.Timestamp], <<[String], <<[String]))
  }
  /** Table description of table FCSFT. Objects of this class serve as prototypes for rows in queries. */
  class Fcsft(_tableTag: Tag) extends BaseTable[FcsftRow](_tableTag, "FCSFT") {
    def * = (id, sftsipflag, sftstpflag, sftswpflag, sftswitchflag, sftlockinperiodflag, sftlockinperiodindays, sftterminationdate, sftexitloadflag, createdate, modifydate, createdby, lastmodifiedby) <> (FcsftRow.tupled, FcsftRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(sftsipflag), Rep.Some(sftstpflag), Rep.Some(sftswpflag), Rep.Some(sftswitchflag), Rep.Some(sftlockinperiodflag), sftlockinperiodindays, sftterminationdate, Rep.Some(sftexitloadflag), createdate, Rep.Some(modifydate), Rep.Some(createdby), Rep.Some(lastmodifiedby)).shaped.<>({r=>import r._; _1.map(_=> FcsftRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get, _7, _8, _9.get, _10, _11.get, _12.get, _13.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column SFTSOPTRFNUM SqlType(BIGINT), PrimaryKey */
    override val id: Rep[Long] = column[Long]("SFTSOPTRFNUM", O.PrimaryKey)
    /** Database column SFTSIPFLAG SqlType(CHAR), Length(2,false) */
    val sftsipflag: Rep[String] = column[String]("SFTSIPFLAG", O.Length(2,varying=false))
    /** Database column SFTSTPFLAG SqlType(CHAR), Length(2,false) */
    val sftstpflag: Rep[String] = column[String]("SFTSTPFLAG", O.Length(2,varying=false))
    /** Database column SFTSWPFLAG SqlType(CHAR), Length(2,false) */
    val sftswpflag: Rep[String] = column[String]("SFTSWPFLAG", O.Length(2,varying=false))
    /** Database column SFTSWITCHFLAG SqlType(CHAR), Length(2,false) */
    val sftswitchflag: Rep[String] = column[String]("SFTSWITCHFLAG", O.Length(2,varying=false))
    /** Database column SFTLOCKINPERIODFLAG SqlType(CHAR), Length(2,false) */
    val sftlockinperiodflag: Rep[String] = column[String]("SFTLOCKINPERIODFLAG", O.Length(2,varying=false))
    /** Database column SFTLOCKINPERIODINDAYS SqlType(INT), Default(None) */
    val sftlockinperiodindays: Rep[Option[Int]] = column[Option[Int]]("SFTLOCKINPERIODINDAYS", O.Default(None))
    /** Database column SFTTERMINATIONDATE SqlType(DATE), Default(None) */
    val sftterminationdate: Rep[Option[java.sql.Date]] = column[Option[java.sql.Date]]("SFTTERMINATIONDATE", O.Default(None))
    /** Database column SFTEXITLOADFLAG SqlType(CHAR), Length(2,false) */
    val sftexitloadflag: Rep[String] = column[String]("SFTEXITLOADFLAG", O.Length(2,varying=false))





    /** Foreign key referencing Fcsopt (database name FK_FCSFT_FCSOPT) */
    lazy val fcsoptFk = foreignKey("FK_FCSFT_FCSOPT", id, Fcsopt)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table Fcsft */
  lazy val Fcsft = new TableQuery(tag => new Fcsft(tag))

  /** Entity class storing rows of table Fcsia
   *  @param siarfnum Database column SIARFNUM SqlType(BIGINT), PrimaryKey
   *  @param siasmtrfnum Database column SIASMTRFNUM SqlType(BIGINT)
   *  @param siaimtrfnum Database column SIAIMTRFNUM SqlType(BIGINT)
   *  @param siatxntype Database column SIATXNTYPE SqlType(CHAR), Length(2,false)
   *  @param siaextfield Database column SIAEXTFIELD SqlType(VARCHAR), Length(64,true), Default(None)
   *  @param createdate 
   *  @param modifydate 
   *  @param createdby 
   *  @param lastmodifiedby  */
  case class FcsiaRow(id: Long, siasmtrfnum: Long, siaimtrfnum: Long, siatxntype: String, siaextfield: Option[String] = None, createdate: Option[java.sql.Timestamp] = None, modifydate: java.sql.Timestamp, createdby: String, lastmodifiedby: String) extends BaseEntity 
  class FcsiaRowWrapper(id: Long, siasmtrfnum: Long, siaimtrfnum: Long, siatxntype: String, siaextfield: Option[String] = None) {
    def get(userName: String): FcsiaRow = {
      FcsiaRow(this.id, this.siasmtrfnum, this.siaimtrfnum, this.siatxntype, this.siaextfield, Some(DateTimeUtils.getCurrentTimeStamp), DateTimeUtils.getCurrentTimeStamp, userName, userName)
  	}
  }
  /** GetResult implicit for fetching FcsiaRow objects using plain SQL queries */
  implicit def GetResultFcsiaRow(implicit e0: GR[Long], e1: GR[String], e2: GR[Option[String]], e3: GR[Option[java.sql.Timestamp]], e4: GR[java.sql.Timestamp]): GR[FcsiaRow] = GR{
    prs => import prs._
    FcsiaRow.tupled((<<[Long], <<[Long], <<[Long], <<[String], <<?[String], <<?[java.sql.Timestamp], <<[java.sql.Timestamp], <<[String], <<[String]))
  }
  /** Table description of table FCSIA. Objects of this class serve as prototypes for rows in queries. */
  class Fcsia(_tableTag: Tag) extends BaseTable[FcsiaRow](_tableTag, "FCSIA") {
    def * = (id, siasmtrfnum, siaimtrfnum, siatxntype, siaextfield, createdate, modifydate, createdby, lastmodifiedby) <> (FcsiaRow.tupled, FcsiaRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(siasmtrfnum), Rep.Some(siaimtrfnum), Rep.Some(siatxntype), siaextfield, createdate, Rep.Some(modifydate), Rep.Some(createdby), Rep.Some(lastmodifiedby)).shaped.<>({r=>import r._; _1.map(_=> FcsiaRow.tupled((_1.get, _2.get, _3.get, _4.get, _5, _6, _7.get, _8.get, _9.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column SIARFNUM SqlType(BIGINT), PrimaryKey */
    override val id: Rep[Long] = column[Long]("SIARFNUM", O.PrimaryKey)
    /** Database column SIASMTRFNUM SqlType(BIGINT) */
    val siasmtrfnum: Rep[Long] = column[Long]("SIASMTRFNUM")
    /** Database column SIAIMTRFNUM SqlType(BIGINT) */
    val siaimtrfnum: Rep[Long] = column[Long]("SIAIMTRFNUM")
    /** Database column SIATXNTYPE SqlType(CHAR), Length(2,false) */
    val siatxntype: Rep[String] = column[String]("SIATXNTYPE", O.Length(2,varying=false))
    /** Database column SIAEXTFIELD SqlType(VARCHAR), Length(64,true), Default(None) */
    val siaextfield: Rep[Option[String]] = column[Option[String]]("SIAEXTFIELD", O.Length(64,varying=true), O.Default(None))





    /** Foreign key referencing Fcimt (database name FK_FCSIA_FCIMT) */
    lazy val fcimtFk = foreignKey("FK_FCSIA_FCIMT", siaimtrfnum, Fcimt)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Fcsmt (database name FK_FCSIA_FCSMT) */
    lazy val fcsmtFk = foreignKey("FK_FCSIA_FCSMT", siasmtrfnum, Fcsmt)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table Fcsia */
  lazy val Fcsia = new TableQuery(tag => new Fcsia(tag))

  /** Entity class storing rows of table Fcsidt
   *  @param sidtsmtrfnum Database column SIDTSMTRFNUM SqlType(BIGINT), PrimaryKey
   *  @param sidttrustees Database column SIDTTRUSTEES SqlType(VARCHAR), Length(1024,true)
   *  @param sidtcustodian Database column SIDTCUSTODIAN SqlType(VARCHAR), Length(256,true)
   *  @param sidtbriefinfo Database column SIDTBRIEFINFO SqlType(VARCHAR), Length(1024,true), Default(None)
   *  @param sidtbankdetails Database column SIDTBANKDETAILS SqlType(VARCHAR), Length(2048,true), Default(None)
   *  @param createdate 
   *  @param modifydate 
   *  @param createdby 
   *  @param lastmodifiedby  */
  case class FcsidtRow(id: Long, sidttrustees: String, sidtcustodian: String, sidtbriefinfo: Option[String] = None, sidtbankdetails: Option[String] = None, createdate: Option[java.sql.Timestamp] = None, modifydate: java.sql.Timestamp, createdby: String, lastmodifiedby: String) extends BaseEntity 
  class FcsidtRowWrapper(id: Long, sidttrustees: String, sidtcustodian: String, sidtbriefinfo: Option[String] = None, sidtbankdetails: Option[String] = None) {
    def get(userName: String): FcsidtRow = {
      FcsidtRow(this.id, this.sidttrustees, this.sidtcustodian, this.sidtbriefinfo, this.sidtbankdetails, Some(DateTimeUtils.getCurrentTimeStamp), DateTimeUtils.getCurrentTimeStamp, userName, userName)
  	}
  }
  /** GetResult implicit for fetching FcsidtRow objects using plain SQL queries */
  implicit def GetResultFcsidtRow(implicit e0: GR[Long], e1: GR[String], e2: GR[Option[String]], e3: GR[Option[java.sql.Timestamp]], e4: GR[java.sql.Timestamp]): GR[FcsidtRow] = GR{
    prs => import prs._
    FcsidtRow.tupled((<<[Long], <<[String], <<[String], <<?[String], <<?[String], <<?[java.sql.Timestamp], <<[java.sql.Timestamp], <<[String], <<[String]))
  }
  /** Table description of table FCSIDT. Objects of this class serve as prototypes for rows in queries. */
  class Fcsidt(_tableTag: Tag) extends BaseTable[FcsidtRow](_tableTag, "FCSIDT") {
    def * = (id, sidttrustees, sidtcustodian, sidtbriefinfo, sidtbankdetails, createdate, modifydate, createdby, lastmodifiedby) <> (FcsidtRow.tupled, FcsidtRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(sidttrustees), Rep.Some(sidtcustodian), sidtbriefinfo, sidtbankdetails, createdate, Rep.Some(modifydate), Rep.Some(createdby), Rep.Some(lastmodifiedby)).shaped.<>({r=>import r._; _1.map(_=> FcsidtRow.tupled((_1.get, _2.get, _3.get, _4, _5, _6, _7.get, _8.get, _9.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column SIDTSMTRFNUM SqlType(BIGINT), PrimaryKey */
    override val id: Rep[Long] = column[Long]("SIDTSMTRFNUM", O.PrimaryKey)
    /** Database column SIDTTRUSTEES SqlType(VARCHAR), Length(1024,true) */
    val sidttrustees: Rep[String] = column[String]("SIDTTRUSTEES", O.Length(1024,varying=true))
    /** Database column SIDTCUSTODIAN SqlType(VARCHAR), Length(256,true) */
    val sidtcustodian: Rep[String] = column[String]("SIDTCUSTODIAN", O.Length(256,varying=true))
    /** Database column SIDTBRIEFINFO SqlType(VARCHAR), Length(1024,true), Default(None) */
    val sidtbriefinfo: Rep[Option[String]] = column[Option[String]]("SIDTBRIEFINFO", O.Length(1024,varying=true), O.Default(None))
    /** Database column SIDTBANKDETAILS SqlType(VARCHAR), Length(2048,true), Default(None) */
    val sidtbankdetails: Rep[Option[String]] = column[Option[String]]("SIDTBANKDETAILS", O.Length(2048,varying=true), O.Default(None))





    /** Foreign key referencing Fcsmt (database name FK_FCSIDT_FCSMT) */
    lazy val fcsmtFk = foreignKey("FK_FCSIDT_FCSMT", id, Fcsmt)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table Fcsidt */
  lazy val Fcsidt = new TableQuery(tag => new Fcsidt(tag))

  /** Entity class storing rows of table Fcsip
   *  @param siprfnum Database column SIPRFNUM SqlType(BIGINT), AutoInc, PrimaryKey
   *  @param sipstartdate Database column SIPSTARTDATE SqlType(TIMESTAMP), Default(None)
   *  @param sipenddate Database column SIPENDDATE SqlType(TIMESTAMP), Default(None)
   *  @param sipinstallmentamount Database column SIPINSTALLMENTAMOUNT SqlType(DOUBLE)
   *  @param sipfrequency Database column SIPFREQUENCY SqlType(CHAR), Length(2,false)
   *  @param sipnoofinstallments Database column SIPNOOFINSTALLMENTS SqlType(INT)
   *  @param sipstatus Database column SIPSTATUS SqlType(CHAR), Length(16,false)
   *  @param sipexternalid Database column SIPEXTERNALID SqlType(VARCHAR), Length(16,true), Default(None)
   *  @param sipdeductionday Database column SIPDEDUCTIONDAY SqlType(INT)
   *  @param sipsotrfnum Database column SIPSOTRFNUM SqlType(BIGINT)
   *  @param sipfomtrfnum Database column SIPFOMTRFNUM SqlType(BIGINT)
   *  @param createdate 
   *  @param modifydate 
   *  @param createdby 
   *  @param lastmodifiedby  */
  case class FcsipRow(id: Long, sipstartdate: Option[java.sql.Timestamp] = None, sipenddate: Option[java.sql.Timestamp] = None, sipinstallmentamount: Double, sipfrequency: String, sipnoofinstallments: Int, sipstatus: String, sipexternalid: Option[String] = None, sipdeductionday: Int, sipsotrfnum: Long, sipfomtrfnum: Long, createdate: Option[java.sql.Timestamp] = None, modifydate: java.sql.Timestamp, createdby: String, lastmodifiedby: String) extends BaseEntity 
  class FcsipRowWrapper(id: Option[Long], sipstartdate: Option[java.sql.Timestamp] = None, sipenddate: Option[java.sql.Timestamp] = None, sipinstallmentamount: Double, sipfrequency: String, sipnoofinstallments: Int, sipstatus: String, sipexternalid: Option[String] = None, sipdeductionday: Int, sipsotrfnum: Long, sipfomtrfnum: Long) {
    def get(userName: String): FcsipRow = {
      FcsipRow(this.id.getOrElse(0), this.sipstartdate, this.sipenddate, this.sipinstallmentamount, this.sipfrequency, this.sipnoofinstallments, this.sipstatus, this.sipexternalid, this.sipdeductionday, this.sipsotrfnum, this.sipfomtrfnum, Some(DateTimeUtils.getCurrentTimeStamp), DateTimeUtils.getCurrentTimeStamp, userName, userName)
  	}
  }
  /** GetResult implicit for fetching FcsipRow objects using plain SQL queries */
  implicit def GetResultFcsipRow(implicit e0: GR[Long], e1: GR[Option[java.sql.Timestamp]], e2: GR[Double], e3: GR[String], e4: GR[Int], e5: GR[Option[String]], e6: GR[java.sql.Timestamp]): GR[FcsipRow] = GR{
    prs => import prs._
    FcsipRow.tupled((<<[Long], <<?[java.sql.Timestamp], <<?[java.sql.Timestamp], <<[Double], <<[String], <<[Int], <<[String], <<?[String], <<[Int], <<[Long], <<[Long], <<?[java.sql.Timestamp], <<[java.sql.Timestamp], <<[String], <<[String]))
  }
  /** Table description of table FCSIP. Objects of this class serve as prototypes for rows in queries. */
  class Fcsip(_tableTag: Tag) extends BaseTable[FcsipRow](_tableTag, "FCSIP") {
    def * = (id, sipstartdate, sipenddate, sipinstallmentamount, sipfrequency, sipnoofinstallments, sipstatus, sipexternalid, sipdeductionday, sipsotrfnum, sipfomtrfnum, createdate, modifydate, createdby, lastmodifiedby) <> (FcsipRow.tupled, FcsipRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), sipstartdate, sipenddate, Rep.Some(sipinstallmentamount), Rep.Some(sipfrequency), Rep.Some(sipnoofinstallments), Rep.Some(sipstatus), sipexternalid, Rep.Some(sipdeductionday), Rep.Some(sipsotrfnum), Rep.Some(sipfomtrfnum), createdate, Rep.Some(modifydate), Rep.Some(createdby), Rep.Some(lastmodifiedby)).shaped.<>({r=>import r._; _1.map(_=> FcsipRow.tupled((_1.get, _2, _3, _4.get, _5.get, _6.get, _7.get, _8, _9.get, _10.get, _11.get, _12, _13.get, _14.get, _15.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column SIPRFNUM SqlType(BIGINT), AutoInc, PrimaryKey */
    override val id: Rep[Long] = column[Long]("SIPRFNUM", O.AutoInc, O.PrimaryKey)
    /** Database column SIPSTARTDATE SqlType(TIMESTAMP), Default(None) */
    val sipstartdate: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("SIPSTARTDATE", O.Default(None))
    /** Database column SIPENDDATE SqlType(TIMESTAMP), Default(None) */
    val sipenddate: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("SIPENDDATE", O.Default(None))
    /** Database column SIPINSTALLMENTAMOUNT SqlType(DOUBLE) */
    val sipinstallmentamount: Rep[Double] = column[Double]("SIPINSTALLMENTAMOUNT")
    /** Database column SIPFREQUENCY SqlType(CHAR), Length(2,false) */
    val sipfrequency: Rep[String] = column[String]("SIPFREQUENCY", O.Length(2,varying=false))
    /** Database column SIPNOOFINSTALLMENTS SqlType(INT) */
    val sipnoofinstallments: Rep[Int] = column[Int]("SIPNOOFINSTALLMENTS")
    /** Database column SIPSTATUS SqlType(CHAR), Length(16,false) */
    val sipstatus: Rep[String] = column[String]("SIPSTATUS", O.Length(16,varying=false))
    /** Database column SIPEXTERNALID SqlType(VARCHAR), Length(16,true), Default(None) */
    val sipexternalid: Rep[Option[String]] = column[Option[String]]("SIPEXTERNALID", O.Length(16,varying=true), O.Default(None))
    /** Database column SIPDEDUCTIONDAY SqlType(INT) */
    val sipdeductionday: Rep[Int] = column[Int]("SIPDEDUCTIONDAY")
    /** Database column SIPSOTRFNUM SqlType(BIGINT) */
    val sipsotrfnum: Rep[Long] = column[Long]("SIPSOTRFNUM")
    /** Database column SIPFOMTRFNUM SqlType(BIGINT) */
    val sipfomtrfnum: Rep[Long] = column[Long]("SIPFOMTRFNUM")





    /** Foreign key referencing Fcfomt (database name FK_FCSIP_FCFOMT) */
    lazy val fcfomtFk = foreignKey("FK_FCSIP_FCFOMT", sipfomtrfnum, Fcfomt)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Fcsot (database name FK_FCSIP_FCSOT) */
    lazy val fcsotFk = foreignKey("FK_FCSIP_FCSOT", sipsotrfnum, Fcsot)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table Fcsip */
  lazy val Fcsip = new TableQuery(tag => new Fcsip(tag))

  /** Entity class storing rows of table Fcsips
   *  @param sipsrfnum Database column SIPSRFNUM SqlType(BIGINT), AutoInc, PrimaryKey
   *  @param sipsschedule Database column SIPSSCHEDULE SqlType(DATE)
   *  @param sipamount Database column SIPAMOUNT SqlType(DOUBLE), Default(None)
   *  @param sipssiprfnum Database column SIPSSIPRFNUM SqlType(BIGINT)
   *  @param createdate 
   *  @param modifydate 
   *  @param createdby 
   *  @param lastmodifiedby  */
  case class FcsipsRow(id: Long, sipsschedule: java.sql.Date, sipamount: Option[Double] = None, sipssiprfnum: Long, createdate: Option[java.sql.Timestamp] = None, modifydate: java.sql.Timestamp, createdby: String, lastmodifiedby: String) extends BaseEntity 
  class FcsipsRowWrapper(id: Option[Long], sipsschedule: java.sql.Date, sipamount: Option[Double] = None, sipssiprfnum: Long) {
    def get(userName: String): FcsipsRow = {
      FcsipsRow(this.id.getOrElse(0), this.sipsschedule, this.sipamount, this.sipssiprfnum, Some(DateTimeUtils.getCurrentTimeStamp), DateTimeUtils.getCurrentTimeStamp, userName, userName)
  	}
  }
  /** GetResult implicit for fetching FcsipsRow objects using plain SQL queries */
  implicit def GetResultFcsipsRow(implicit e0: GR[Long], e1: GR[java.sql.Date], e2: GR[Option[Double]], e3: GR[Option[java.sql.Timestamp]], e4: GR[java.sql.Timestamp], e5: GR[String]): GR[FcsipsRow] = GR{
    prs => import prs._
    FcsipsRow.tupled((<<[Long], <<[java.sql.Date], <<?[Double], <<[Long], <<?[java.sql.Timestamp], <<[java.sql.Timestamp], <<[String], <<[String]))
  }
  /** Table description of table FCSIPS. Objects of this class serve as prototypes for rows in queries. */
  class Fcsips(_tableTag: Tag) extends BaseTable[FcsipsRow](_tableTag, "FCSIPS") {
    def * = (id, sipsschedule, sipamount, sipssiprfnum, createdate, modifydate, createdby, lastmodifiedby) <> (FcsipsRow.tupled, FcsipsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(sipsschedule), sipamount, Rep.Some(sipssiprfnum), createdate, Rep.Some(modifydate), Rep.Some(createdby), Rep.Some(lastmodifiedby)).shaped.<>({r=>import r._; _1.map(_=> FcsipsRow.tupled((_1.get, _2.get, _3, _4.get, _5, _6.get, _7.get, _8.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column SIPSRFNUM SqlType(BIGINT), AutoInc, PrimaryKey */
    override val id: Rep[Long] = column[Long]("SIPSRFNUM", O.AutoInc, O.PrimaryKey)
    /** Database column SIPSSCHEDULE SqlType(DATE) */
    val sipsschedule: Rep[java.sql.Date] = column[java.sql.Date]("SIPSSCHEDULE")
    /** Database column SIPAMOUNT SqlType(DOUBLE), Default(None) */
    val sipamount: Rep[Option[Double]] = column[Option[Double]]("SIPAMOUNT", O.Default(None))
    /** Database column SIPSSIPRFNUM SqlType(BIGINT) */
    val sipssiprfnum: Rep[Long] = column[Long]("SIPSSIPRFNUM")





    /** Foreign key referencing Fcsip (database name FK_FCSIPS_FCSIP) */
    lazy val fcsipFk = foreignKey("FK_FCSIPS_FCSIP", sipssiprfnum, Fcsip)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table Fcsips */
  lazy val Fcsips = new TableQuery(tag => new Fcsips(tag))

  /** Entity class storing rows of table Fcsit
   *  @param sitrfnum Database column SITRFNUM SqlType(BIGINT), AutoInc, PrimaryKey
   *  @param sitschemename Database column SITSCHEMENAME SqlType(VARCHAR), Length(128,true)
   *  @param sitfundmanager1join Database column SITFUNDMANAGER1JOIN SqlType(TIMESTAMP), Default(None)
   *  @param sitfundmanager1 Database column SITFUNDMANAGER1 SqlType(VARCHAR), Length(128,true), Default(None)
   *  @param sitfundmanager3 Database column SITFUNDMANAGER3 SqlType(VARCHAR), Length(128,true), Default(None)
   *  @param sitfundmanager3join Database column SITFUNDMANAGER3JOIN SqlType(TIMESTAMP), Default(None)
   *  @param sitfundmanager2 Database column SITFUNDMANAGER2 SqlType(VARCHAR), Length(128,true), Default(None)
   *  @param sitfundmanager2join Database column SITFUNDMANAGER2JOIN SqlType(TIMESTAMP), Default(None)
   *  @param sitsmtrfnum Database column SITSMTRFNUM SqlType(BIGINT)
   *  @param sitfundtrust Database column SITFUNDTRUST SqlType(VARCHAR), Length(256,true), Default(None)
   *  @param sittrustees Database column SITTRUSTEES SqlType(VARCHAR), Length(512,true), Default(None)
   *  @param createdate 
   *  @param modifydate 
   *  @param createdby 
   *  @param lastmodifiedby  */
  case class FcsitRow(id: Long, sitschemename: String, sitfundmanager1join: Option[java.sql.Timestamp] = None, sitfundmanager1: Option[String] = None, sitfundmanager3: Option[String] = None, sitfundmanager3join: Option[java.sql.Timestamp] = None, sitfundmanager2: Option[String] = None, sitfundmanager2join: Option[java.sql.Timestamp] = None, sitsmtrfnum: Long, sitfundtrust: Option[String] = None, sittrustees: Option[String] = None, createdate: Option[java.sql.Timestamp] = None, modifydate: java.sql.Timestamp, createdby: String, lastmodifiedby: String) extends BaseEntity 
  class FcsitRowWrapper(id: Option[Long], sitschemename: String, sitfundmanager1join: Option[java.sql.Timestamp] = None, sitfundmanager1: Option[String] = None, sitfundmanager3: Option[String] = None, sitfundmanager3join: Option[java.sql.Timestamp] = None, sitfundmanager2: Option[String] = None, sitfundmanager2join: Option[java.sql.Timestamp] = None, sitsmtrfnum: Long, sitfundtrust: Option[String] = None, sittrustees: Option[String] = None) {
    def get(userName: String): FcsitRow = {
      FcsitRow(this.id.getOrElse(0), this.sitschemename, this.sitfundmanager1join, this.sitfundmanager1, this.sitfundmanager3, this.sitfundmanager3join, this.sitfundmanager2, this.sitfundmanager2join, this.sitsmtrfnum, this.sitfundtrust, this.sittrustees, Some(DateTimeUtils.getCurrentTimeStamp), DateTimeUtils.getCurrentTimeStamp, userName, userName)
  	}
  }
  /** GetResult implicit for fetching FcsitRow objects using plain SQL queries */
  implicit def GetResultFcsitRow(implicit e0: GR[Long], e1: GR[String], e2: GR[Option[java.sql.Timestamp]], e3: GR[Option[String]], e4: GR[java.sql.Timestamp]): GR[FcsitRow] = GR{
    prs => import prs._
    FcsitRow.tupled((<<[Long], <<[String], <<?[java.sql.Timestamp], <<?[String], <<?[String], <<?[java.sql.Timestamp], <<?[String], <<?[java.sql.Timestamp], <<[Long], <<?[String], <<?[String], <<?[java.sql.Timestamp], <<[java.sql.Timestamp], <<[String], <<[String]))
  }
  /** Table description of table FCSIT. Objects of this class serve as prototypes for rows in queries. */
  class Fcsit(_tableTag: Tag) extends BaseTable[FcsitRow](_tableTag, "FCSIT") {
    def * = (id, sitschemename, sitfundmanager1join, sitfundmanager1, sitfundmanager3, sitfundmanager3join, sitfundmanager2, sitfundmanager2join, sitsmtrfnum, sitfundtrust, sittrustees, createdate, modifydate, createdby, lastmodifiedby) <> (FcsitRow.tupled, FcsitRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(sitschemename), sitfundmanager1join, sitfundmanager1, sitfundmanager3, sitfundmanager3join, sitfundmanager2, sitfundmanager2join, Rep.Some(sitsmtrfnum), sitfundtrust, sittrustees, createdate, Rep.Some(modifydate), Rep.Some(createdby), Rep.Some(lastmodifiedby)).shaped.<>({r=>import r._; _1.map(_=> FcsitRow.tupled((_1.get, _2.get, _3, _4, _5, _6, _7, _8, _9.get, _10, _11, _12, _13.get, _14.get, _15.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column SITRFNUM SqlType(BIGINT), AutoInc, PrimaryKey */
    override val id: Rep[Long] = column[Long]("SITRFNUM", O.AutoInc, O.PrimaryKey)
    /** Database column SITSCHEMENAME SqlType(VARCHAR), Length(128,true) */
    val sitschemename: Rep[String] = column[String]("SITSCHEMENAME", O.Length(128,varying=true))
    /** Database column SITFUNDMANAGER1JOIN SqlType(TIMESTAMP), Default(None) */
    val sitfundmanager1join: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("SITFUNDMANAGER1JOIN", O.Default(None))
    /** Database column SITFUNDMANAGER1 SqlType(VARCHAR), Length(128,true), Default(None) */
    val sitfundmanager1: Rep[Option[String]] = column[Option[String]]("SITFUNDMANAGER1", O.Length(128,varying=true), O.Default(None))
    /** Database column SITFUNDMANAGER3 SqlType(VARCHAR), Length(128,true), Default(None) */
    val sitfundmanager3: Rep[Option[String]] = column[Option[String]]("SITFUNDMANAGER3", O.Length(128,varying=true), O.Default(None))
    /** Database column SITFUNDMANAGER3JOIN SqlType(TIMESTAMP), Default(None) */
    val sitfundmanager3join: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("SITFUNDMANAGER3JOIN", O.Default(None))
    /** Database column SITFUNDMANAGER2 SqlType(VARCHAR), Length(128,true), Default(None) */
    val sitfundmanager2: Rep[Option[String]] = column[Option[String]]("SITFUNDMANAGER2", O.Length(128,varying=true), O.Default(None))
    /** Database column SITFUNDMANAGER2JOIN SqlType(TIMESTAMP), Default(None) */
    val sitfundmanager2join: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("SITFUNDMANAGER2JOIN", O.Default(None))
    /** Database column SITSMTRFNUM SqlType(BIGINT) */
    val sitsmtrfnum: Rep[Long] = column[Long]("SITSMTRFNUM")
    /** Database column SITFUNDTRUST SqlType(VARCHAR), Length(256,true), Default(None) */
    val sitfundtrust: Rep[Option[String]] = column[Option[String]]("SITFUNDTRUST", O.Length(256,varying=true), O.Default(None))
    /** Database column SITTRUSTEES SqlType(VARCHAR), Length(512,true), Default(None) */
    val sittrustees: Rep[Option[String]] = column[Option[String]]("SITTRUSTEES", O.Length(512,varying=true), O.Default(None))





    /** Foreign key referencing Fcsmt (database name FK_FCSIT_FCSMT_02) */
    lazy val fcsmtFk = foreignKey("FK_FCSIT_FCSMT_02", sitsmtrfnum, Fcsmt)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table Fcsit */
  lazy val Fcsit = new TableQuery(tag => new Fcsit(tag))

  /** Entity class storing rows of table Fcslmt
   *  @param slmtrfnum Database column SLMTRFNUM SqlType(BIGINT), AutoInc, PrimaryKey
   *  @param slmtfrom Database column SLMTFROM SqlType(DOUBLE), Default(None)
   *  @param slmtto Database column SLMTTO SqlType(DOUBLE), Default(None)
   *  @param slmtslabname Database column SLMTSLABNAME SqlType(VARCHAR), Length(64,true), Default(None)
   *  @param slmtslabtype Database column SLMTSLABTYPE SqlType(CHAR), Length(8,false)
   *  @param slmtslabactive Database column SLMTSLABACTIVE SqlType(CHAR), Length(2,false), Default(None)
   *  @param slmtdescption Database column SLMTDESCPTION SqlType(VARCHAR), Length(256,true), Default(None)
   *  @param slmtcomtrfnum Database column SLMTCOMTRFNUM SqlType(BIGINT), Default(None)
   *  @param createdate 
   *  @param modifydate 
   *  @param createdby 
   *  @param lastmodifiedby  */
  case class FcslmtRow(id: Long, slmtfrom: Option[Double] = None, slmtto: Option[Double] = None, slmtslabname: Option[String] = None, slmtslabtype: String, slmtslabactive: Option[String] = None, slmtdescption: Option[String] = None, slmtcomtrfnum: Option[Long] = None, createdate: Option[java.sql.Timestamp] = None, modifydate: java.sql.Timestamp, createdby: String, lastmodifiedby: String) extends BaseEntity 
  class FcslmtRowWrapper(id: Option[Long], slmtfrom: Option[Double] = None, slmtto: Option[Double] = None, slmtslabname: Option[String] = None, slmtslabtype: String, slmtslabactive: Option[String] = None, slmtdescption: Option[String] = None, slmtcomtrfnum: Option[Long] = None) {
    def get(userName: String): FcslmtRow = {
      FcslmtRow(this.id.getOrElse(0), this.slmtfrom, this.slmtto, this.slmtslabname, this.slmtslabtype, this.slmtslabactive, this.slmtdescption, this.slmtcomtrfnum, Some(DateTimeUtils.getCurrentTimeStamp), DateTimeUtils.getCurrentTimeStamp, userName, userName)
  	}
  }
  /** GetResult implicit for fetching FcslmtRow objects using plain SQL queries */
  implicit def GetResultFcslmtRow(implicit e0: GR[Long], e1: GR[Option[Double]], e2: GR[Option[String]], e3: GR[String], e4: GR[Option[Long]], e5: GR[Option[java.sql.Timestamp]], e6: GR[java.sql.Timestamp]): GR[FcslmtRow] = GR{
    prs => import prs._
    FcslmtRow.tupled((<<[Long], <<?[Double], <<?[Double], <<?[String], <<[String], <<?[String], <<?[String], <<?[Long], <<?[java.sql.Timestamp], <<[java.sql.Timestamp], <<[String], <<[String]))
  }
  /** Table description of table FCSLMT. Objects of this class serve as prototypes for rows in queries. */
  class Fcslmt(_tableTag: Tag) extends BaseTable[FcslmtRow](_tableTag, "FCSLMT") {
    def * = (id, slmtfrom, slmtto, slmtslabname, slmtslabtype, slmtslabactive, slmtdescption, slmtcomtrfnum, createdate, modifydate, createdby, lastmodifiedby) <> (FcslmtRow.tupled, FcslmtRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), slmtfrom, slmtto, slmtslabname, Rep.Some(slmtslabtype), slmtslabactive, slmtdescption, slmtcomtrfnum, createdate, Rep.Some(modifydate), Rep.Some(createdby), Rep.Some(lastmodifiedby)).shaped.<>({r=>import r._; _1.map(_=> FcslmtRow.tupled((_1.get, _2, _3, _4, _5.get, _6, _7, _8, _9, _10.get, _11.get, _12.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column SLMTRFNUM SqlType(BIGINT), AutoInc, PrimaryKey */
    override val id: Rep[Long] = column[Long]("SLMTRFNUM", O.AutoInc, O.PrimaryKey)
    /** Database column SLMTFROM SqlType(DOUBLE), Default(None) */
    val slmtfrom: Rep[Option[Double]] = column[Option[Double]]("SLMTFROM", O.Default(None))
    /** Database column SLMTTO SqlType(DOUBLE), Default(None) */
    val slmtto: Rep[Option[Double]] = column[Option[Double]]("SLMTTO", O.Default(None))
    /** Database column SLMTSLABNAME SqlType(VARCHAR), Length(64,true), Default(None) */
    val slmtslabname: Rep[Option[String]] = column[Option[String]]("SLMTSLABNAME", O.Length(64,varying=true), O.Default(None))
    /** Database column SLMTSLABTYPE SqlType(CHAR), Length(8,false) */
    val slmtslabtype: Rep[String] = column[String]("SLMTSLABTYPE", O.Length(8,varying=false))
    /** Database column SLMTSLABACTIVE SqlType(CHAR), Length(2,false), Default(None) */
    val slmtslabactive: Rep[Option[String]] = column[Option[String]]("SLMTSLABACTIVE", O.Length(2,varying=false), O.Default(None))
    /** Database column SLMTDESCPTION SqlType(VARCHAR), Length(256,true), Default(None) */
    val slmtdescption: Rep[Option[String]] = column[Option[String]]("SLMTDESCPTION", O.Length(256,varying=true), O.Default(None))
    /** Database column SLMTCOMTRFNUM SqlType(BIGINT), Default(None) */
    val slmtcomtrfnum: Rep[Option[Long]] = column[Option[Long]]("SLMTCOMTRFNUM", O.Default(None))





    /** Foreign key referencing Fccomt (database name FK_FCSLMT_FCCOMT) */
    lazy val fccomtFk = foreignKey("FK_FCSLMT_FCCOMT", slmtcomtrfnum, Fccomt)(r => Rep.Some(r.id), onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table Fcslmt */
  lazy val Fcslmt = new TableQuery(tag => new Fcslmt(tag))

  /** Entity class storing rows of table Fcsmt
   *  @param smtrfnum Database column SMTRFNUM SqlType(BIGINT), AutoInc, PrimaryKey
   *  @param smtamctrfnum Database column SMTAMCTRFNUM SqlType(BIGINT)
   *  @param smtstdname Database column SMTSTDNAME SqlType(VARCHAR), Length(256,true)
   *  @param smtdisplayname Database column SMTDISPLAYNAME SqlType(VARCHAR), Length(128,true)
   *  @param smtrtacoderfnum Database column SMTRTACODERFNUM SqlType(BIGINT)
   *  @param smtmstarid Database column SMTMSTARID SqlType(CHAR), Length(16,false), Default(None)
   *  @param smtisin Database column SMTISIN SqlType(CHAR), Length(16,false), Default(None)
   *  @param smtunitallotmentperiod Database column SMTUNITALLOTMENTPERIOD SqlType(BIGINT), Default(None)
   *  @param smtfacevalue Database column SMTFACEVALUE SqlType(DOUBLE), Default(None)
   *  @param smtminlumpsum Database column SMTMINLUMPSUM SqlType(INT)
   *  @param smtminadditional Database column SMTMINADDITIONAL SqlType(INT)
   *  @param smtctmtrfnum Database column SMTCTMTRFNUM SqlType(BIGINT)
   *  @param smtfincashrisk Database column SMTFINCASHRISK SqlType(CHAR), Length(2,false), Default(None)
   *  @param smtsebirisk Database column SMTSEBIRISK SqlType(CHAR), Length(2,false), Default(None)
   *  @param smtfunddescription Database column SMTFUNDDESCRIPTION SqlType(VARCHAR), Length(1024,true), Default(None)
   *  @param smtschemeactive Database column SMTSCHEMEACTIVE SqlType(CHAR), Length(2,false)
   *  @param createdate 
   *  @param modifydate 
   *  @param createdby 
   *  @param lastmodifiedby  */
  case class FcsmtRow(id: Long, smtamctrfnum: Long, smtstdname: String, smtdisplayname: String, smtrtacoderfnum: Long, smtmstarid: Option[String] = None, smtisin: Option[String] = None, smtunitallotmentperiod: Option[Long] = None, smtfacevalue: Option[Double] = None, smtminlumpsum: Int, smtminadditional: Int, smtctmtrfnum: Long, smtfincashrisk: Option[String] = None, smtsebirisk: Option[String] = None, smtfunddescription: Option[String] = None, smtschemeactive: String, createdate: Option[java.sql.Timestamp] = None, modifydate: java.sql.Timestamp, createdby: String, lastmodifiedby: String) extends BaseEntity 
  class FcsmtRowWrapper(id: Option[Long], smtamctrfnum: Long, smtstdname: String, smtdisplayname: String, smtrtacoderfnum: Long, smtmstarid: Option[String] = None, smtisin: Option[String] = None, smtunitallotmentperiod: Option[Long] = None, smtfacevalue: Option[Double] = None, smtminlumpsum: Int, smtminadditional: Int, smtctmtrfnum: Long, smtfincashrisk: Option[String] = None, smtsebirisk: Option[String] = None, smtfunddescription: Option[String] = None, smtschemeactive: String) {
    def get(userName: String): FcsmtRow = {
      FcsmtRow(this.id.getOrElse(0), this.smtamctrfnum, this.smtstdname, this.smtdisplayname, this.smtrtacoderfnum, this.smtmstarid, this.smtisin, this.smtunitallotmentperiod, this.smtfacevalue, this.smtminlumpsum, this.smtminadditional, this.smtctmtrfnum, this.smtfincashrisk, this.smtsebirisk, this.smtfunddescription, this.smtschemeactive, Some(DateTimeUtils.getCurrentTimeStamp), DateTimeUtils.getCurrentTimeStamp, userName, userName)
  	}
  }
  /** GetResult implicit for fetching FcsmtRow objects using plain SQL queries */
  implicit def GetResultFcsmtRow(implicit e0: GR[Long], e1: GR[String], e2: GR[Option[String]], e3: GR[Option[Long]], e4: GR[Option[Double]], e5: GR[Int], e6: GR[Option[java.sql.Timestamp]], e7: GR[java.sql.Timestamp]): GR[FcsmtRow] = GR{
    prs => import prs._
    FcsmtRow.tupled((<<[Long], <<[Long], <<[String], <<[String], <<[Long], <<?[String], <<?[String], <<?[Long], <<?[Double], <<[Int], <<[Int], <<[Long], <<?[String], <<?[String], <<?[String], <<[String], <<?[java.sql.Timestamp], <<[java.sql.Timestamp], <<[String], <<[String]))
  }
  /** Table description of table FCSMT. Objects of this class serve as prototypes for rows in queries. */
  class Fcsmt(_tableTag: Tag) extends BaseTable[FcsmtRow](_tableTag, "FCSMT") {
    def * = (id, smtamctrfnum, smtstdname, smtdisplayname, smtrtacoderfnum, smtmstarid, smtisin, smtunitallotmentperiod, smtfacevalue, smtminlumpsum, smtminadditional, smtctmtrfnum, smtfincashrisk, smtsebirisk, smtfunddescription, smtschemeactive, createdate, modifydate, createdby, lastmodifiedby) <> (FcsmtRow.tupled, FcsmtRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(smtamctrfnum), Rep.Some(smtstdname), Rep.Some(smtdisplayname), Rep.Some(smtrtacoderfnum), smtmstarid, smtisin, smtunitallotmentperiod, smtfacevalue, Rep.Some(smtminlumpsum), Rep.Some(smtminadditional), Rep.Some(smtctmtrfnum), smtfincashrisk, smtsebirisk, smtfunddescription, Rep.Some(smtschemeactive), createdate, Rep.Some(modifydate), Rep.Some(createdby), Rep.Some(lastmodifiedby)).shaped.<>({r=>import r._; _1.map(_=> FcsmtRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6, _7, _8, _9, _10.get, _11.get, _12.get, _13, _14, _15, _16.get, _17, _18.get, _19.get, _20.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column SMTRFNUM SqlType(BIGINT), AutoInc, PrimaryKey */
    override val id: Rep[Long] = column[Long]("SMTRFNUM", O.AutoInc, O.PrimaryKey)
    /** Database column SMTAMCTRFNUM SqlType(BIGINT) */
    val smtamctrfnum: Rep[Long] = column[Long]("SMTAMCTRFNUM")
    /** Database column SMTSTDNAME SqlType(VARCHAR), Length(256,true) */
    val smtstdname: Rep[String] = column[String]("SMTSTDNAME", O.Length(256,varying=true))
    /** Database column SMTDISPLAYNAME SqlType(VARCHAR), Length(128,true) */
    val smtdisplayname: Rep[String] = column[String]("SMTDISPLAYNAME", O.Length(128,varying=true))
    /** Database column SMTRTACODERFNUM SqlType(BIGINT) */
    val smtrtacoderfnum: Rep[Long] = column[Long]("SMTRTACODERFNUM")
    /** Database column SMTMSTARID SqlType(CHAR), Length(16,false), Default(None) */
    val smtmstarid: Rep[Option[String]] = column[Option[String]]("SMTMSTARID", O.Length(16,varying=false), O.Default(None))
    /** Database column SMTISIN SqlType(CHAR), Length(16,false), Default(None) */
    val smtisin: Rep[Option[String]] = column[Option[String]]("SMTISIN", O.Length(16,varying=false), O.Default(None))
    /** Database column SMTUNITALLOTMENTPERIOD SqlType(BIGINT), Default(None) */
    val smtunitallotmentperiod: Rep[Option[Long]] = column[Option[Long]]("SMTUNITALLOTMENTPERIOD", O.Default(None))
    /** Database column SMTFACEVALUE SqlType(DOUBLE), Default(None) */
    val smtfacevalue: Rep[Option[Double]] = column[Option[Double]]("SMTFACEVALUE", O.Default(None))
    /** Database column SMTMINLUMPSUM SqlType(INT) */
    val smtminlumpsum: Rep[Int] = column[Int]("SMTMINLUMPSUM")
    /** Database column SMTMINADDITIONAL SqlType(INT) */
    val smtminadditional: Rep[Int] = column[Int]("SMTMINADDITIONAL")
    /** Database column SMTCTMTRFNUM SqlType(BIGINT) */
    val smtctmtrfnum: Rep[Long] = column[Long]("SMTCTMTRFNUM")
    /** Database column SMTFINCASHRISK SqlType(CHAR), Length(2,false), Default(None) */
    val smtfincashrisk: Rep[Option[String]] = column[Option[String]]("SMTFINCASHRISK", O.Length(2,varying=false), O.Default(None))
    /** Database column SMTSEBIRISK SqlType(CHAR), Length(2,false), Default(None) */
    val smtsebirisk: Rep[Option[String]] = column[Option[String]]("SMTSEBIRISK", O.Length(2,varying=false), O.Default(None))
    /** Database column SMTFUNDDESCRIPTION SqlType(VARCHAR), Length(1024,true), Default(None) */
    val smtfunddescription: Rep[Option[String]] = column[Option[String]]("SMTFUNDDESCRIPTION", O.Length(1024,varying=true), O.Default(None))
    /** Database column SMTSCHEMEACTIVE SqlType(CHAR), Length(2,false) */
    val smtschemeactive: Rep[String] = column[String]("SMTSCHEMEACTIVE", O.Length(2,varying=false))





    /** Foreign key referencing Fcamct (database name FK_FCSMT_FCAMCT) */
    lazy val fcamctFk = foreignKey("FK_FCSMT_FCAMCT", smtamctrfnum, Fcamct)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Fcctmt (database name FK_FCSMT_FCCTMT) */
    lazy val fcctmtFk = foreignKey("FK_FCSMT_FCCTMT", smtctmtrfnum, Fcctmt)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Fcrta (database name FK_FCSMT_FCRTA) */
    lazy val fcrtaFk = foreignKey("FK_FCSMT_FCRTA", smtrtacoderfnum, Fcrta)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table Fcsmt */
  lazy val Fcsmt = new TableQuery(tag => new Fcsmt(tag))

  /** Entity class storing rows of table Fcsoct
   *  @param soctrfnum Database column SOCTRFNUM SqlType(BIGINT), AutoInc, PrimaryKey
   *  @param soctkey Database column SOCTKEY SqlType(VARCHAR), Length(256,true)
   *  @param soctvalue Database column SOCTVALUE SqlType(VARCHAR), Length(256,true)
   *  @param soctsotrfnum Database column SOCTSOTRFNUM SqlType(BIGINT)
   *  @param createdate 
   *  @param modifydate 
   *  @param createdby 
   *  @param lastmodifiedby  */
  case class FcsoctRow(id: Long, soctkey: String, soctvalue: String, soctsotrfnum: Long, createdate: Option[java.sql.Timestamp] = None, modifydate: java.sql.Timestamp, createdby: String, lastmodifiedby: String) extends BaseEntity 
  class FcsoctRowWrapper(id: Option[Long], soctkey: String, soctvalue: String, soctsotrfnum: Long) {
    def get(userName: String): FcsoctRow = {
      FcsoctRow(this.id.getOrElse(0), this.soctkey, this.soctvalue, this.soctsotrfnum, Some(DateTimeUtils.getCurrentTimeStamp), DateTimeUtils.getCurrentTimeStamp, userName, userName)
  	}
  }
  /** GetResult implicit for fetching FcsoctRow objects using plain SQL queries */
  implicit def GetResultFcsoctRow(implicit e0: GR[Long], e1: GR[String], e2: GR[Option[java.sql.Timestamp]], e3: GR[java.sql.Timestamp]): GR[FcsoctRow] = GR{
    prs => import prs._
    FcsoctRow.tupled((<<[Long], <<[String], <<[String], <<[Long], <<?[java.sql.Timestamp], <<[java.sql.Timestamp], <<[String], <<[String]))
  }
  /** Table description of table FCSOCT. Objects of this class serve as prototypes for rows in queries. */
  class Fcsoct(_tableTag: Tag) extends BaseTable[FcsoctRow](_tableTag, "FCSOCT") {
    def * = (id, soctkey, soctvalue, soctsotrfnum, createdate, modifydate, createdby, lastmodifiedby) <> (FcsoctRow.tupled, FcsoctRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(soctkey), Rep.Some(soctvalue), Rep.Some(soctsotrfnum), createdate, Rep.Some(modifydate), Rep.Some(createdby), Rep.Some(lastmodifiedby)).shaped.<>({r=>import r._; _1.map(_=> FcsoctRow.tupled((_1.get, _2.get, _3.get, _4.get, _5, _6.get, _7.get, _8.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column SOCTRFNUM SqlType(BIGINT), AutoInc, PrimaryKey */
    override val id: Rep[Long] = column[Long]("SOCTRFNUM", O.AutoInc, O.PrimaryKey)
    /** Database column SOCTKEY SqlType(VARCHAR), Length(256,true) */
    val soctkey: Rep[String] = column[String]("SOCTKEY", O.Length(256,varying=true))
    /** Database column SOCTVALUE SqlType(VARCHAR), Length(256,true) */
    val soctvalue: Rep[String] = column[String]("SOCTVALUE", O.Length(256,varying=true))
    /** Database column SOCTSOTRFNUM SqlType(BIGINT) */
    val soctsotrfnum: Rep[Long] = column[Long]("SOCTSOTRFNUM")





    /** Foreign key referencing Fcsot (database name FK_FCSOCT_FCSOT) */
    lazy val fcsotFk = foreignKey("FK_FCSOCT_FCSOT", soctsotrfnum, Fcsot)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table Fcsoct */
  lazy val Fcsoct = new TableQuery(tag => new Fcsoct(tag))

  /** Entity class storing rows of table Fcsoel
   *  @param soelrfnum Database column SOELRFNUM SqlType(BIGINT), AutoInc, PrimaryKey
   *  @param soeldsarfnum Database column SOELDSARFNUM SqlType(BIGINT)
   *  @param soelunit Database column SOELUNIT SqlType(VARCHAR), Length(32,true)
   *  @param soelbreakpointunit Database column SOELBREAKPOINTUNIT SqlType(VARCHAR), Length(16,true)
   *  @param soellowbreakpoint Database column SOELLOWBREAKPOINT SqlType(INT)
   *  @param soelhighbreakpoint Database column SOELHIGHBREAKPOINT SqlType(INT), Default(None)
   *  @param soelvalue Database column SOELVALUE SqlType(DOUBLE)
   *  @param soelsequence Database column SOELSEQUENCE SqlType(DOUBLE)
   *  @param createdate 
   *  @param modifydate 
   *  @param createdby 
   *  @param lastmodifiedby  */
  case class FcsoelRow(id: Long, soeldsarfnum: Long, soelunit: String, soelbreakpointunit: String, soellowbreakpoint: Int, soelhighbreakpoint: Option[Int] = None, soelvalue: Double, soelsequence: Double, createdate: Option[java.sql.Timestamp] = None, modifydate: java.sql.Timestamp, createdby: String, lastmodifiedby: String) extends BaseEntity 
  class FcsoelRowWrapper(id: Option[Long], soeldsarfnum: Long, soelunit: String, soelbreakpointunit: String, soellowbreakpoint: Int, soelhighbreakpoint: Option[Int] = None, soelvalue: Double, soelsequence: Double) {
    def get(userName: String): FcsoelRow = {
      FcsoelRow(this.id.getOrElse(0), this.soeldsarfnum, this.soelunit, this.soelbreakpointunit, this.soellowbreakpoint, this.soelhighbreakpoint, this.soelvalue, this.soelsequence, Some(DateTimeUtils.getCurrentTimeStamp), DateTimeUtils.getCurrentTimeStamp, userName, userName)
  	}
  }
  /** GetResult implicit for fetching FcsoelRow objects using plain SQL queries */
  implicit def GetResultFcsoelRow(implicit e0: GR[Long], e1: GR[String], e2: GR[Int], e3: GR[Option[Int]], e4: GR[Double], e5: GR[Option[java.sql.Timestamp]], e6: GR[java.sql.Timestamp]): GR[FcsoelRow] = GR{
    prs => import prs._
    FcsoelRow.tupled((<<[Long], <<[Long], <<[String], <<[String], <<[Int], <<?[Int], <<[Double], <<[Double], <<?[java.sql.Timestamp], <<[java.sql.Timestamp], <<[String], <<[String]))
  }
  /** Table description of table FCSOEL. Objects of this class serve as prototypes for rows in queries. */
  class Fcsoel(_tableTag: Tag) extends BaseTable[FcsoelRow](_tableTag, "FCSOEL") {
    def * = (id, soeldsarfnum, soelunit, soelbreakpointunit, soellowbreakpoint, soelhighbreakpoint, soelvalue, soelsequence, createdate, modifydate, createdby, lastmodifiedby) <> (FcsoelRow.tupled, FcsoelRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(soeldsarfnum), Rep.Some(soelunit), Rep.Some(soelbreakpointunit), Rep.Some(soellowbreakpoint), soelhighbreakpoint, Rep.Some(soelvalue), Rep.Some(soelsequence), createdate, Rep.Some(modifydate), Rep.Some(createdby), Rep.Some(lastmodifiedby)).shaped.<>({r=>import r._; _1.map(_=> FcsoelRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6, _7.get, _8.get, _9, _10.get, _11.get, _12.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column SOELRFNUM SqlType(BIGINT), AutoInc, PrimaryKey */
    override val id: Rep[Long] = column[Long]("SOELRFNUM", O.AutoInc, O.PrimaryKey)
    /** Database column SOELDSARFNUM SqlType(BIGINT) */
    val soeldsarfnum: Rep[Long] = column[Long]("SOELDSARFNUM")
    /** Database column SOELUNIT SqlType(VARCHAR), Length(32,true) */
    val soelunit: Rep[String] = column[String]("SOELUNIT", O.Length(32,varying=true))
    /** Database column SOELBREAKPOINTUNIT SqlType(VARCHAR), Length(16,true) */
    val soelbreakpointunit: Rep[String] = column[String]("SOELBREAKPOINTUNIT", O.Length(16,varying=true))
    /** Database column SOELLOWBREAKPOINT SqlType(INT) */
    val soellowbreakpoint: Rep[Int] = column[Int]("SOELLOWBREAKPOINT")
    /** Database column SOELHIGHBREAKPOINT SqlType(INT), Default(None) */
    val soelhighbreakpoint: Rep[Option[Int]] = column[Option[Int]]("SOELHIGHBREAKPOINT", O.Default(None))
    /** Database column SOELVALUE SqlType(DOUBLE) */
    val soelvalue: Rep[Double] = column[Double]("SOELVALUE")
    /** Database column SOELSEQUENCE SqlType(DOUBLE) */
    val soelsequence: Rep[Double] = column[Double]("SOELSEQUENCE")





    /** Foreign key referencing Fcdsa (database name FK_FCSOEL_FCDSA) */
    lazy val fcdsaFk = foreignKey("FK_FCSOEL_FCDSA", soeldsarfnum, Fcdsa)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table Fcsoel */
  lazy val Fcsoel = new TableQuery(tag => new Fcsoel(tag))

  /** Entity class storing rows of table Fcsoit
   *  @param soitsotrfnum Database column SOITSOTRFNUM SqlType(BIGINT), PrimaryKey
   *  @param soitscheme Database column SOITSCHEME SqlType(VARCHAR), Length(512,true)
   *  @param soitplanname Database column SOITPLANNAME SqlType(VARCHAR), Length(128,true)
   *  @param soitdescription Database column SOITDESCRIPTION SqlType(VARCHAR), Length(1024,true), Default(None)
   *  @param createdate 
   *  @param modifydate 
   *  @param createdby 
   *  @param lastmodifiedby  */
  case class FcsoitRow(id: Long, soitscheme: String, soitplanname: String, soitdescription: Option[String] = None, createdate: Option[java.sql.Timestamp] = None, modifydate: java.sql.Timestamp, createdby: String, lastmodifiedby: String) extends BaseEntity 
  class FcsoitRowWrapper(id: Long, soitscheme: String, soitplanname: String, soitdescription: Option[String] = None) {
    def get(userName: String): FcsoitRow = {
      FcsoitRow(this.id, this.soitscheme, this.soitplanname, this.soitdescription, Some(DateTimeUtils.getCurrentTimeStamp), DateTimeUtils.getCurrentTimeStamp, userName, userName)
  	}
  }
  /** GetResult implicit for fetching FcsoitRow objects using plain SQL queries */
  implicit def GetResultFcsoitRow(implicit e0: GR[Long], e1: GR[String], e2: GR[Option[String]], e3: GR[Option[java.sql.Timestamp]], e4: GR[java.sql.Timestamp]): GR[FcsoitRow] = GR{
    prs => import prs._
    FcsoitRow.tupled((<<[Long], <<[String], <<[String], <<?[String], <<?[java.sql.Timestamp], <<[java.sql.Timestamp], <<[String], <<[String]))
  }
  /** Table description of table FCSOIT. Objects of this class serve as prototypes for rows in queries. */
  class Fcsoit(_tableTag: Tag) extends BaseTable[FcsoitRow](_tableTag, "FCSOIT") {
    def * = (id, soitscheme, soitplanname, soitdescription, createdate, modifydate, createdby, lastmodifiedby) <> (FcsoitRow.tupled, FcsoitRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(soitscheme), Rep.Some(soitplanname), soitdescription, createdate, Rep.Some(modifydate), Rep.Some(createdby), Rep.Some(lastmodifiedby)).shaped.<>({r=>import r._; _1.map(_=> FcsoitRow.tupled((_1.get, _2.get, _3.get, _4, _5, _6.get, _7.get, _8.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column SOITSOTRFNUM SqlType(BIGINT), PrimaryKey */
    override val id: Rep[Long] = column[Long]("SOITSOTRFNUM", O.PrimaryKey)
    /** Database column SOITSCHEME SqlType(VARCHAR), Length(512,true) */
    val soitscheme: Rep[String] = column[String]("SOITSCHEME", O.Length(512,varying=true))
    /** Database column SOITPLANNAME SqlType(VARCHAR), Length(128,true) */
    val soitplanname: Rep[String] = column[String]("SOITPLANNAME", O.Length(128,varying=true))
    /** Database column SOITDESCRIPTION SqlType(VARCHAR), Length(1024,true), Default(None) */
    val soitdescription: Rep[Option[String]] = column[Option[String]]("SOITDESCRIPTION", O.Length(1024,varying=true), O.Default(None))





    /** Foreign key referencing Fcsot (database name FK_FCSOIT_FCSOT) */
    lazy val fcsotFk = foreignKey("FK_FCSOIT_FCSOT", id, Fcsot)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table Fcsoit */
  lazy val Fcsoit = new TableQuery(tag => new Fcsoit(tag))

  /** Entity class storing rows of table Fcsopt
   *  @param soptrfnum Database column SOPTRFNUM SqlType(BIGINT), AutoInc, PrimaryKey
   *  @param soptsmtrfnum Database column SOPTSMTRFNUM SqlType(BIGINT)
   *  @param soptlegalname Database column SOPTLEGALNAME SqlType(VARCHAR), Length(128,true)
   *  @param soptschemeplan Database column SOPTSCHEMEPLAN SqlType(CHAR), Length(2,false)
   *  @param soptdivioptiontype Database column SOPTDIVIOPTIONTYPE SqlType(CHAR), Length(2,false)
   *  @param soptdividendfrqn Database column SOPTDIVIDENDFRQN SqlType(CHAR), Length(2,false)
   *  @param soptschemeisin Database column SOPTSCHEMEISIN SqlType(VARCHAR), Length(16,true), Default(None)
   *  @param soptrtaschemecode Database column SOPTRTASCHEMECODE SqlType(CHAR), Length(16,false)
   *  @param soptinceptiondate Database column SOPTINCEPTIONDATE SqlType(DATE), Default(None)
   *  @param soptisdefault Database column SOPTISDEFAULT SqlType(CHAR), Length(2,false)
   *  @param soptstructure Database column SOPTSTRUCTURE SqlType(CHAR), Length(2,false)
   *  @param soptplantype Database column SOPTPLANTYPE SqlType(CHAR), Length(32,false)
   *  @param soptisactive Database column SOPTISACTIVE SqlType(CHAR), Length(2,false), Default(Y)
   *  @param soptrtacode Database column SOPTRTACODE SqlType(CHAR), Length(16,false), Default(None)
   *  @param soptschemecode Database column SOPTSCHEMECODE SqlType(CHAR), Length(16,false), Default(None)
   *  @param soptplancode Database column SOPTPLANCODE SqlType(CHAR), Length(16,false), Default(None)
   *  @param soptoptioncode Database column SOPTOPTIONCODE SqlType(CHAR), Length(16,false), Default(None)
   *  @param soptamficode Database column SOPTAMFICODE SqlType(VARCHAR), Length(32,true), Default(None)
   *  @param createdate 
   *  @param modifydate 
   *  @param createdby 
   *  @param lastmodifiedby  */
  case class FcsoptRow(id: Long, soptsmtrfnum: Long, soptlegalname: String, soptschemeplan: String, soptdivioptiontype: String, soptdividendfrqn: String, soptschemeisin: Option[String] = None, soptrtaschemecode: String, soptinceptiondate: Option[java.sql.Date] = None, soptisdefault: String, soptstructure: String, soptplantype: String, soptisactive: String = "Y", soptrtacode: Option[String] = None, soptschemecode: Option[String] = None, soptplancode: Option[String] = None, soptoptioncode: Option[String] = None, soptamficode: Option[String] = None, createdate: Option[java.sql.Timestamp] = None, modifydate: java.sql.Timestamp, createdby: String, lastmodifiedby: String) extends BaseEntity 
  class FcsoptRowWrapper(id: Option[Long], soptsmtrfnum: Long, soptlegalname: String, soptschemeplan: String, soptdivioptiontype: String, soptdividendfrqn: String, soptschemeisin: Option[String] = None, soptrtaschemecode: String, soptinceptiondate: Option[java.sql.Date] = None, soptisdefault: String, soptstructure: String, soptplantype: String, soptisactive: String = "Y", soptrtacode: Option[String] = None, soptschemecode: Option[String] = None, soptplancode: Option[String] = None, soptoptioncode: Option[String] = None, soptamficode: Option[String] = None) {
    def get(userName: String): FcsoptRow = {
      FcsoptRow(this.id.getOrElse(0), this.soptsmtrfnum, this.soptlegalname, this.soptschemeplan, this.soptdivioptiontype, this.soptdividendfrqn, this.soptschemeisin, this.soptrtaschemecode, this.soptinceptiondate, this.soptisdefault, this.soptstructure, this.soptplantype, this.soptisactive, this.soptrtacode, this.soptschemecode, this.soptplancode, this.soptoptioncode, this.soptamficode, Some(DateTimeUtils.getCurrentTimeStamp), DateTimeUtils.getCurrentTimeStamp, userName, userName)
  	}
  }
  /** GetResult implicit for fetching FcsoptRow objects using plain SQL queries */
  implicit def GetResultFcsoptRow(implicit e0: GR[Long], e1: GR[String], e2: GR[Option[String]], e3: GR[Option[java.sql.Date]], e4: GR[Option[java.sql.Timestamp]], e5: GR[java.sql.Timestamp]): GR[FcsoptRow] = GR{
    prs => import prs._
    FcsoptRow.tupled((<<[Long], <<[Long], <<[String], <<[String], <<[String], <<[String], <<?[String], <<[String], <<?[java.sql.Date], <<[String], <<[String], <<[String], <<[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[java.sql.Timestamp], <<[java.sql.Timestamp], <<[String], <<[String]))
  }
  /** Table description of table FCSOPT. Objects of this class serve as prototypes for rows in queries. */
  class Fcsopt(_tableTag: Tag) extends BaseTable[FcsoptRow](_tableTag, "FCSOPT") {
    def * = (id, soptsmtrfnum, soptlegalname, soptschemeplan, soptdivioptiontype, soptdividendfrqn, soptschemeisin, soptrtaschemecode, soptinceptiondate, soptisdefault, soptstructure, soptplantype, soptisactive, soptrtacode, soptschemecode, soptplancode, soptoptioncode, soptamficode, createdate, modifydate, createdby, lastmodifiedby) <> (FcsoptRow.tupled, FcsoptRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(soptsmtrfnum), Rep.Some(soptlegalname), Rep.Some(soptschemeplan), Rep.Some(soptdivioptiontype), Rep.Some(soptdividendfrqn), soptschemeisin, Rep.Some(soptrtaschemecode), soptinceptiondate, Rep.Some(soptisdefault), Rep.Some(soptstructure), Rep.Some(soptplantype), Rep.Some(soptisactive), soptrtacode, soptschemecode, soptplancode, soptoptioncode, soptamficode, createdate, Rep.Some(modifydate), Rep.Some(createdby), Rep.Some(lastmodifiedby)).shaped.<>({r=>import r._; _1.map(_=> FcsoptRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get, _7, _8.get, _9, _10.get, _11.get, _12.get, _13.get, _14, _15, _16, _17, _18, _19, _20.get, _21.get, _22.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column SOPTRFNUM SqlType(BIGINT), AutoInc, PrimaryKey */
    override val id: Rep[Long] = column[Long]("SOPTRFNUM", O.AutoInc, O.PrimaryKey)
    /** Database column SOPTSMTRFNUM SqlType(BIGINT) */
    val soptsmtrfnum: Rep[Long] = column[Long]("SOPTSMTRFNUM")
    /** Database column SOPTLEGALNAME SqlType(VARCHAR), Length(128,true) */
    val soptlegalname: Rep[String] = column[String]("SOPTLEGALNAME", O.Length(128,varying=true))
    /** Database column SOPTSCHEMEPLAN SqlType(CHAR), Length(2,false) */
    val soptschemeplan: Rep[String] = column[String]("SOPTSCHEMEPLAN", O.Length(2,varying=false))
    /** Database column SOPTDIVIOPTIONTYPE SqlType(CHAR), Length(2,false) */
    val soptdivioptiontype: Rep[String] = column[String]("SOPTDIVIOPTIONTYPE", O.Length(2,varying=false))
    /** Database column SOPTDIVIDENDFRQN SqlType(CHAR), Length(2,false) */
    val soptdividendfrqn: Rep[String] = column[String]("SOPTDIVIDENDFRQN", O.Length(2,varying=false))
    /** Database column SOPTSCHEMEISIN SqlType(VARCHAR), Length(16,true), Default(None) */
    val soptschemeisin: Rep[Option[String]] = column[Option[String]]("SOPTSCHEMEISIN", O.Length(16,varying=true), O.Default(None))
    /** Database column SOPTRTASCHEMECODE SqlType(CHAR), Length(16,false) */
    val soptrtaschemecode: Rep[String] = column[String]("SOPTRTASCHEMECODE", O.Length(16,varying=false))
    /** Database column SOPTINCEPTIONDATE SqlType(DATE), Default(None) */
    val soptinceptiondate: Rep[Option[java.sql.Date]] = column[Option[java.sql.Date]]("SOPTINCEPTIONDATE", O.Default(None))
    /** Database column SOPTISDEFAULT SqlType(CHAR), Length(2,false) */
    val soptisdefault: Rep[String] = column[String]("SOPTISDEFAULT", O.Length(2,varying=false))
    /** Database column SOPTSTRUCTURE SqlType(CHAR), Length(2,false) */
    val soptstructure: Rep[String] = column[String]("SOPTSTRUCTURE", O.Length(2,varying=false))
    /** Database column SOPTPLANTYPE SqlType(CHAR), Length(32,false) */
    val soptplantype: Rep[String] = column[String]("SOPTPLANTYPE", O.Length(32,varying=false))
    /** Database column SOPTISACTIVE SqlType(CHAR), Length(2,false), Default(Y) */
    val soptisactive: Rep[String] = column[String]("SOPTISACTIVE", O.Length(2,varying=false), O.Default("Y"))
    /** Database column SOPTRTACODE SqlType(CHAR), Length(16,false), Default(None) */
    val soptrtacode: Rep[Option[String]] = column[Option[String]]("SOPTRTACODE", O.Length(16,varying=false), O.Default(None))
    /** Database column SOPTSCHEMECODE SqlType(CHAR), Length(16,false), Default(None) */
    val soptschemecode: Rep[Option[String]] = column[Option[String]]("SOPTSCHEMECODE", O.Length(16,varying=false), O.Default(None))
    /** Database column SOPTPLANCODE SqlType(CHAR), Length(16,false), Default(None) */
    val soptplancode: Rep[Option[String]] = column[Option[String]]("SOPTPLANCODE", O.Length(16,varying=false), O.Default(None))
    /** Database column SOPTOPTIONCODE SqlType(CHAR), Length(16,false), Default(None) */
    val soptoptioncode: Rep[Option[String]] = column[Option[String]]("SOPTOPTIONCODE", O.Length(16,varying=false), O.Default(None))
    /** Database column SOPTAMFICODE SqlType(VARCHAR), Length(32,true), Default(None) */
    val soptamficode: Rep[Option[String]] = column[Option[String]]("SOPTAMFICODE", O.Length(32,varying=true), O.Default(None))





    /** Foreign key referencing Fcsmt (database name FK_FCSOPT_FCSMT) */
    lazy val fcsmtFk = foreignKey("FK_FCSOPT_FCSMT", soptsmtrfnum, Fcsmt)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)

    /** Uniqueness Index over (soptschemeplan,soptdivioptiontype,soptdividendfrqn,soptsmtrfnum,soptplantype) (database name SOPT_COMBO_UNQ) */
    val index1 = index("SOPT_COMBO_UNQ", (soptschemeplan, soptdivioptiontype, soptdividendfrqn, soptsmtrfnum, soptplantype), unique=true)
  }
  /** Collection-like TableQuery object for table Fcsopt */
  lazy val Fcsopt = new TableQuery(tag => new Fcsopt(tag))

  /** Entity class storing rows of table Fcsot
   *  @param sotrfnum Database column SOTRFNUM SqlType(BIGINT), AutoInc, PrimaryKey
   *  @param sotpaymentmode Database column SOTPAYMENTMODE SqlType(CHAR), Length(3,false)
   *  @param sottype Database column SOTTYPE SqlType(CHAR), Length(2,false)
   *  @param sotostmstaterfnum Database column SOTOSTMSTATERFNUM SqlType(BIGINT)
   *  @param sotsequence Database column SOTSEQUENCE SqlType(FLOAT)
   *  @param sottrnsctionid1 Database column SOTTRNSCTIONID1 SqlType(CHAR), Length(16,false), Default(None)
   *  @param sottrnsctionid2 Database column SOTTRNSCTIONID2 SqlType(CHAR), Length(16,false), Default(None)
   *  @param sotomtrfnum Database column SOTOMTRFNUM SqlType(BIGINT)
   *  @param sotsoptrfnum Database column SOTSOPTRFNUM SqlType(BIGINT)
   *  @param sottranscnmode Database column SOTTRANSCNMODE SqlType(CHAR), Length(3,false)
   *  @param sotorderquantity Database column SOTORDERQUANTITY SqlType(DOUBLE), Default(None)
   *  @param sotorderamount Database column SOTORDERAMOUNT SqlType(DOUBLE)
   *  @param sotinvestmentmode Database column SOTINVESTMENTMODE SqlType(CHAR), Length(2,false)
   *  @param sotsipdayofmonth Database column SOTSIPDAYOFMONTH SqlType(INT), Default(None)
   *  @param sotbuyselltype Database column SOTBUYSELLTYPE SqlType(CHAR), Length(2,false)
   *  @param sotubdrfnum Database column SOTUBDRFNUM SqlType(BIGINT)
   *  @param sotsipfrequency Database column SOTSIPFREQUENCY SqlType(CHAR), Length(2,false), Default(None)
   *  @param sotsipinstallments Database column SOTSIPINSTALLMENTS SqlType(INT), Default(None)
   *  @param createdate 
   *  @param modifydate 
   *  @param createdby 
   *  @param lastmodifiedby  */
  case class FcsotRow(id: Long, sotpaymentmode: String, sottype: String, sotostmstaterfnum: Long, sotsequence: Float, sottrnsctionid1: Option[String] = None, sottrnsctionid2: Option[String] = None, sotomtrfnum: Long, sotsoptrfnum: Long, sottranscnmode: String, sotorderquantity: Option[Double] = None, sotorderamount: Double, sotinvestmentmode: String, sotsipdayofmonth: Option[Int] = None, sotbuyselltype: String, sotubdrfnum: Long, sotsipfrequency: Option[String] = None, sotsipinstallments: Option[Int] = None, createdate: Option[java.sql.Timestamp] = None, modifydate: java.sql.Timestamp, createdby: String, lastmodifiedby: String) extends BaseEntity 
  class FcsotRowWrapper(id: Option[Long], sotpaymentmode: String, sottype: String, sotostmstaterfnum: Long, sotsequence: Float, sottrnsctionid1: Option[String] = None, sottrnsctionid2: Option[String] = None, sotomtrfnum: Long, sotsoptrfnum: Long, sottranscnmode: String, sotorderquantity: Option[Double] = None, sotorderamount: Double, sotinvestmentmode: String, sotsipdayofmonth: Option[Int] = None, sotbuyselltype: String, sotubdrfnum: Long, sotsipfrequency: Option[String] = None, sotsipinstallments: Option[Int] = None) {
    def get(userName: String): FcsotRow = {
      FcsotRow(this.id.getOrElse(0), this.sotpaymentmode, this.sottype, this.sotostmstaterfnum, this.sotsequence, this.sottrnsctionid1, this.sottrnsctionid2, this.sotomtrfnum, this.sotsoptrfnum, this.sottranscnmode, this.sotorderquantity, this.sotorderamount, this.sotinvestmentmode, this.sotsipdayofmonth, this.sotbuyselltype, this.sotubdrfnum, this.sotsipfrequency, this.sotsipinstallments, Some(DateTimeUtils.getCurrentTimeStamp), DateTimeUtils.getCurrentTimeStamp, userName, userName)
  	}
  }
  /** GetResult implicit for fetching FcsotRow objects using plain SQL queries */
  implicit def GetResultFcsotRow(implicit e0: GR[Long], e1: GR[String], e2: GR[Float], e3: GR[Option[String]], e4: GR[Option[Double]], e5: GR[Double], e6: GR[Option[Int]], e7: GR[Option[java.sql.Timestamp]], e8: GR[java.sql.Timestamp]): GR[FcsotRow] = GR{
    prs => import prs._
    FcsotRow.tupled((<<[Long], <<[String], <<[String], <<[Long], <<[Float], <<?[String], <<?[String], <<[Long], <<[Long], <<[String], <<?[Double], <<[Double], <<[String], <<?[Int], <<[String], <<[Long], <<?[String], <<?[Int], <<?[java.sql.Timestamp], <<[java.sql.Timestamp], <<[String], <<[String]))
  }
  /** Table description of table FCSOT. Objects of this class serve as prototypes for rows in queries. */
  class Fcsot(_tableTag: Tag) extends BaseTable[FcsotRow](_tableTag, "FCSOT") {
    def * = (id, sotpaymentmode, sottype, sotostmstaterfnum, sotsequence, sottrnsctionid1, sottrnsctionid2, sotomtrfnum, sotsoptrfnum, sottranscnmode, sotorderquantity, sotorderamount, sotinvestmentmode, sotsipdayofmonth, sotbuyselltype, sotubdrfnum, sotsipfrequency, sotsipinstallments, createdate, modifydate, createdby, lastmodifiedby) <> (FcsotRow.tupled, FcsotRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(sotpaymentmode), Rep.Some(sottype), Rep.Some(sotostmstaterfnum), Rep.Some(sotsequence), sottrnsctionid1, sottrnsctionid2, Rep.Some(sotomtrfnum), Rep.Some(sotsoptrfnum), Rep.Some(sottranscnmode), sotorderquantity, Rep.Some(sotorderamount), Rep.Some(sotinvestmentmode), sotsipdayofmonth, Rep.Some(sotbuyselltype), Rep.Some(sotubdrfnum), sotsipfrequency, sotsipinstallments, createdate, Rep.Some(modifydate), Rep.Some(createdby), Rep.Some(lastmodifiedby)).shaped.<>({r=>import r._; _1.map(_=> FcsotRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6, _7, _8.get, _9.get, _10.get, _11, _12.get, _13.get, _14, _15.get, _16.get, _17, _18, _19, _20.get, _21.get, _22.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column SOTRFNUM SqlType(BIGINT), AutoInc, PrimaryKey */
    override val id: Rep[Long] = column[Long]("SOTRFNUM", O.AutoInc, O.PrimaryKey)
    /** Database column SOTPAYMENTMODE SqlType(CHAR), Length(3,false) */
    val sotpaymentmode: Rep[String] = column[String]("SOTPAYMENTMODE", O.Length(3,varying=false))
    /** Database column SOTTYPE SqlType(CHAR), Length(2,false) */
    val sottype: Rep[String] = column[String]("SOTTYPE", O.Length(2,varying=false))
    /** Database column SOTOSTMSTATERFNUM SqlType(BIGINT) */
    val sotostmstaterfnum: Rep[Long] = column[Long]("SOTOSTMSTATERFNUM")
    /** Database column SOTSEQUENCE SqlType(FLOAT) */
    val sotsequence: Rep[Float] = column[Float]("SOTSEQUENCE")
    /** Database column SOTTRNSCTIONID1 SqlType(CHAR), Length(16,false), Default(None) */
    val sottrnsctionid1: Rep[Option[String]] = column[Option[String]]("SOTTRNSCTIONID1", O.Length(16,varying=false), O.Default(None))
    /** Database column SOTTRNSCTIONID2 SqlType(CHAR), Length(16,false), Default(None) */
    val sottrnsctionid2: Rep[Option[String]] = column[Option[String]]("SOTTRNSCTIONID2", O.Length(16,varying=false), O.Default(None))
    /** Database column SOTOMTRFNUM SqlType(BIGINT) */
    val sotomtrfnum: Rep[Long] = column[Long]("SOTOMTRFNUM")
    /** Database column SOTSOPTRFNUM SqlType(BIGINT) */
    val sotsoptrfnum: Rep[Long] = column[Long]("SOTSOPTRFNUM")
    /** Database column SOTTRANSCNMODE SqlType(CHAR), Length(3,false) */
    val sottranscnmode: Rep[String] = column[String]("SOTTRANSCNMODE", O.Length(3,varying=false))
    /** Database column SOTORDERQUANTITY SqlType(DOUBLE), Default(None) */
    val sotorderquantity: Rep[Option[Double]] = column[Option[Double]]("SOTORDERQUANTITY", O.Default(None))
    /** Database column SOTORDERAMOUNT SqlType(DOUBLE) */
    val sotorderamount: Rep[Double] = column[Double]("SOTORDERAMOUNT")
    /** Database column SOTINVESTMENTMODE SqlType(CHAR), Length(2,false) */
    val sotinvestmentmode: Rep[String] = column[String]("SOTINVESTMENTMODE", O.Length(2,varying=false))
    /** Database column SOTSIPDAYOFMONTH SqlType(INT), Default(None) */
    val sotsipdayofmonth: Rep[Option[Int]] = column[Option[Int]]("SOTSIPDAYOFMONTH", O.Default(None))
    /** Database column SOTBUYSELLTYPE SqlType(CHAR), Length(2,false) */
    val sotbuyselltype: Rep[String] = column[String]("SOTBUYSELLTYPE", O.Length(2,varying=false))
    /** Database column SOTUBDRFNUM SqlType(BIGINT) */
    val sotubdrfnum: Rep[Long] = column[Long]("SOTUBDRFNUM")
    /** Database column SOTSIPFREQUENCY SqlType(CHAR), Length(2,false), Default(None) */
    val sotsipfrequency: Rep[Option[String]] = column[Option[String]]("SOTSIPFREQUENCY", O.Length(2,varying=false), O.Default(None))
    /** Database column SOTSIPINSTALLMENTS SqlType(INT), Default(None) */
    val sotsipinstallments: Rep[Option[Int]] = column[Option[Int]]("SOTSIPINSTALLMENTS", O.Default(None))





    /** Foreign key referencing Fcomt (database name FK_FCSOT_FCOMT) */
    lazy val fcomtFk = foreignKey("FK_FCSOT_FCOMT", sotomtrfnum, Fcomt)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Fcostm (database name FK_FCSOT_FCOSTM) */
    lazy val fcostmFk = foreignKey("FK_FCSOT_FCOSTM", sotostmstaterfnum, Fcostm)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Fcsopt (database name FK_FCSOT_FCSOPT) */
    lazy val fcsoptFk = foreignKey("FK_FCSOT_FCSOPT", sotsoptrfnum, Fcsopt)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Fcubd (database name FK_FCSOT_FCUBD) */
    lazy val fcubdFk = foreignKey("FK_FCSOT_FCUBD", sotubdrfnum, Fcubd)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table Fcsot */
  lazy val Fcsot = new TableQuery(tag => new Fcsot(tag))

  /** Entity class storing rows of table Fcspst
   *  @param spstrfnum Database column SPSTRFNUM SqlType(BIGINT), AutoInc, PrimaryKey
   *  @param spstsecurityunits Database column SPSTSECURITYUNITS SqlType(DOUBLE), Default(None)
   *  @param spstsecurityaction Database column SPSTSECURITYACTION SqlType(CHAR), Length(2,false), Default(None)
   *  @param spstsecurityprice Database column SPSTSECURITYPRICE SqlType(DOUBLE), Default(None)
   *  @param spstsecrfnum Database column SPSTSECRFNUM SqlType(BIGINT)
   *  @param createdate 
   *  @param modifydate 
   *  @param createdby 
   *  @param lastmodifiedby 
   *  @param spstdsarfnum Database column SPSTDSARFNUM SqlType(BIGINT) */
  case class FcspstRow(id: Long, spstsecurityunits: Option[Double] = None, spstsecurityaction: Option[String] = None, spstsecurityprice: Option[Double] = None, spstsecrfnum: Long, createdate: Option[java.sql.Timestamp] = None, modifydate: java.sql.Timestamp, createdby: String, lastmodifiedby: String, spstdsarfnum: Long) extends BaseEntity 
  class FcspstRowWrapper(id: Option[Long], spstsecurityunits: Option[Double] = None, spstsecurityaction: Option[String] = None, spstsecurityprice: Option[Double] = None, spstsecrfnum: Long, spstdsarfnum: Long) {
    def get(userName: String): FcspstRow = {
      FcspstRow(this.id.getOrElse(0), this.spstsecurityunits, this.spstsecurityaction, this.spstsecurityprice, this.spstsecrfnum, Some(DateTimeUtils.getCurrentTimeStamp), DateTimeUtils.getCurrentTimeStamp, userName, userName, this.spstdsarfnum)
  	}
  }
  /** GetResult implicit for fetching FcspstRow objects using plain SQL queries */
  implicit def GetResultFcspstRow(implicit e0: GR[Long], e1: GR[Option[Double]], e2: GR[Option[String]], e3: GR[Option[java.sql.Timestamp]], e4: GR[java.sql.Timestamp], e5: GR[String]): GR[FcspstRow] = GR{
    prs => import prs._
    FcspstRow.tupled((<<[Long], <<?[Double], <<?[String], <<?[Double], <<[Long], <<?[java.sql.Timestamp], <<[java.sql.Timestamp], <<[String], <<[String], <<[Long]))
  }
  /** Table description of table FCSPST. Objects of this class serve as prototypes for rows in queries. */
  class Fcspst(_tableTag: Tag) extends BaseTable[FcspstRow](_tableTag, "FCSPST") {
    def * = (id, spstsecurityunits, spstsecurityaction, spstsecurityprice, spstsecrfnum, createdate, modifydate, createdby, lastmodifiedby, spstdsarfnum) <> (FcspstRow.tupled, FcspstRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), spstsecurityunits, spstsecurityaction, spstsecurityprice, Rep.Some(spstsecrfnum), createdate, Rep.Some(modifydate), Rep.Some(createdby), Rep.Some(lastmodifiedby), Rep.Some(spstdsarfnum)).shaped.<>({r=>import r._; _1.map(_=> FcspstRow.tupled((_1.get, _2, _3, _4, _5.get, _6, _7.get, _8.get, _9.get, _10.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column SPSTRFNUM SqlType(BIGINT), AutoInc, PrimaryKey */
    override val id: Rep[Long] = column[Long]("SPSTRFNUM", O.AutoInc, O.PrimaryKey)
    /** Database column SPSTSECURITYUNITS SqlType(DOUBLE), Default(None) */
    val spstsecurityunits: Rep[Option[Double]] = column[Option[Double]]("SPSTSECURITYUNITS", O.Default(None))
    /** Database column SPSTSECURITYACTION SqlType(CHAR), Length(2,false), Default(None) */
    val spstsecurityaction: Rep[Option[String]] = column[Option[String]]("SPSTSECURITYACTION", O.Length(2,varying=false), O.Default(None))
    /** Database column SPSTSECURITYPRICE SqlType(DOUBLE), Default(None) */
    val spstsecurityprice: Rep[Option[Double]] = column[Option[Double]]("SPSTSECURITYPRICE", O.Default(None))
    /** Database column SPSTSECRFNUM SqlType(BIGINT) */
    val spstsecrfnum: Rep[Long] = column[Long]("SPSTSECRFNUM")




    /** Database column SPSTDSARFNUM SqlType(BIGINT) */
    val spstdsarfnum: Rep[Long] = column[Long]("SPSTDSARFNUM")

    /** Foreign key referencing Fcdsa (database name FK_FCSPST_FCDSA) */
    lazy val fcdsaFk = foreignKey("FK_FCSPST_FCDSA", spstdsarfnum, Fcdsa)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Fcsec (database name FK_FCPOST_FCSEC) */
    lazy val fcsecFk = foreignKey("FK_FCPOST_FCSEC", spstsecrfnum, Fcsec)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table Fcspst */
  lazy val Fcspst = new TableQuery(tag => new Fcspst(tag))

  /** Entity class storing rows of table Fcsra
   *  @param srarfnum Database column SRARFNUM SqlType(BIGINT), AutoInc, PrimaryKey
   *  @param sradate Database column SRADATE SqlType(DATE)
   *  @param sradsarfnum Database column SRADSARFNUM SqlType(BIGINT)
   *  @param sraremtrfnum Database column SRAREMTRFNUM SqlType(BIGINT)
   *  @param sraperiodvalue Database column SRAPERIODVALUE SqlType(INT)
   *  @param sraperiodunit Database column SRAPERIODUNIT SqlType(CHAR), Length(2,false)
   *  @param createdate 
   *  @param modifydate 
   *  @param createdby 
   *  @param lastmodifiedby  */
  case class FcsraRow(id: Long, sradate: java.sql.Date, sradsarfnum: Long, sraremtrfnum: Long, sraperiodvalue: Int, sraperiodunit: String, createdate: Option[java.sql.Timestamp] = None, modifydate: java.sql.Timestamp, createdby: String, lastmodifiedby: String) extends BaseEntity 
  class FcsraRowWrapper(id: Option[Long], sradate: java.sql.Date, sradsarfnum: Long, sraremtrfnum: Long, sraperiodvalue: Int, sraperiodunit: String) {
    def get(userName: String): FcsraRow = {
      FcsraRow(this.id.getOrElse(0), this.sradate, this.sradsarfnum, this.sraremtrfnum, this.sraperiodvalue, this.sraperiodunit, Some(DateTimeUtils.getCurrentTimeStamp), DateTimeUtils.getCurrentTimeStamp, userName, userName)
  	}
  }
  /** GetResult implicit for fetching FcsraRow objects using plain SQL queries */
  implicit def GetResultFcsraRow(implicit e0: GR[Long], e1: GR[java.sql.Date], e2: GR[Int], e3: GR[String], e4: GR[Option[java.sql.Timestamp]], e5: GR[java.sql.Timestamp]): GR[FcsraRow] = GR{
    prs => import prs._
    FcsraRow.tupled((<<[Long], <<[java.sql.Date], <<[Long], <<[Long], <<[Int], <<[String], <<?[java.sql.Timestamp], <<[java.sql.Timestamp], <<[String], <<[String]))
  }
  /** Table description of table FCSRA. Objects of this class serve as prototypes for rows in queries. */
  class Fcsra(_tableTag: Tag) extends BaseTable[FcsraRow](_tableTag, "FCSRA") {
    def * = (id, sradate, sradsarfnum, sraremtrfnum, sraperiodvalue, sraperiodunit, createdate, modifydate, createdby, lastmodifiedby) <> (FcsraRow.tupled, FcsraRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(sradate), Rep.Some(sradsarfnum), Rep.Some(sraremtrfnum), Rep.Some(sraperiodvalue), Rep.Some(sraperiodunit), createdate, Rep.Some(modifydate), Rep.Some(createdby), Rep.Some(lastmodifiedby)).shaped.<>({r=>import r._; _1.map(_=> FcsraRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get, _7, _8.get, _9.get, _10.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column SRARFNUM SqlType(BIGINT), AutoInc, PrimaryKey */
    override val id: Rep[Long] = column[Long]("SRARFNUM", O.AutoInc, O.PrimaryKey)
    /** Database column SRADATE SqlType(DATE) */
    val sradate: Rep[java.sql.Date] = column[java.sql.Date]("SRADATE")
    /** Database column SRADSARFNUM SqlType(BIGINT) */
    val sradsarfnum: Rep[Long] = column[Long]("SRADSARFNUM")
    /** Database column SRAREMTRFNUM SqlType(BIGINT) */
    val sraremtrfnum: Rep[Long] = column[Long]("SRAREMTRFNUM")
    /** Database column SRAPERIODVALUE SqlType(INT) */
    val sraperiodvalue: Rep[Int] = column[Int]("SRAPERIODVALUE")
    /** Database column SRAPERIODUNIT SqlType(CHAR), Length(2,false) */
    val sraperiodunit: Rep[String] = column[String]("SRAPERIODUNIT", O.Length(2,varying=false))





    /** Foreign key referencing Fcdsa (database name FK_FCSRA_FCDSA) */
    lazy val fcdsaFk = foreignKey("FK_FCSRA_FCDSA", sradsarfnum, Fcdsa)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Fcremt (database name FK_FCSRA_FCREMT) */
    lazy val fcremtFk = foreignKey("FK_FCSRA_FCREMT", sraremtrfnum, Fcremt)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)

    /** Uniqueness Index over (sradate,sradsarfnum,sraperiodvalue,sraperiodunit) (database name SRA_SRADSA_SRADATE_UNQ) */
    val index1 = index("SRA_SRADSA_SRADATE_UNQ", (sradate, sradsarfnum, sraperiodvalue, sraperiodunit), unique=true)
  }
  /** Collection-like TableQuery object for table Fcsra */
  lazy val Fcsra = new TableQuery(tag => new Fcsra(tag))

  /** Entity class storing rows of table Fcsraa
   *  @param sraarfnum Database column SRAARFNUM SqlType(BIGINT), AutoInc, PrimaryKey
   *  @param sraadsarfnum Database column SRAADSARFNUM SqlType(BIGINT)
   *  @param sraaramtrfnum Database column SRAARAMTRFNUM SqlType(BIGINT)
   *  @param sraadate Database column SRAADATE SqlType(DATE)
   *  @param createdate 
   *  @param modifydate 
   *  @param createdby 
   *  @param lastmodifiedby  */
  case class FcsraaRow(id: Long, sraadsarfnum: Long, sraaramtrfnum: Long, sraadate: java.sql.Date, createdate: Option[java.sql.Timestamp] = None, modifydate: java.sql.Timestamp, createdby: String, lastmodifiedby: String) extends BaseEntity 
  class FcsraaRowWrapper(id: Option[Long], sraadsarfnum: Long, sraaramtrfnum: Long, sraadate: java.sql.Date) {
    def get(userName: String): FcsraaRow = {
      FcsraaRow(this.id.getOrElse(0), this.sraadsarfnum, this.sraaramtrfnum, this.sraadate, Some(DateTimeUtils.getCurrentTimeStamp), DateTimeUtils.getCurrentTimeStamp, userName, userName)
  	}
  }
  /** GetResult implicit for fetching FcsraaRow objects using plain SQL queries */
  implicit def GetResultFcsraaRow(implicit e0: GR[Long], e1: GR[java.sql.Date], e2: GR[Option[java.sql.Timestamp]], e3: GR[java.sql.Timestamp], e4: GR[String]): GR[FcsraaRow] = GR{
    prs => import prs._
    FcsraaRow.tupled((<<[Long], <<[Long], <<[Long], <<[java.sql.Date], <<?[java.sql.Timestamp], <<[java.sql.Timestamp], <<[String], <<[String]))
  }
  /** Table description of table FCSRAA. Objects of this class serve as prototypes for rows in queries. */
  class Fcsraa(_tableTag: Tag) extends BaseTable[FcsraaRow](_tableTag, "FCSRAA") {
    def * = (id, sraadsarfnum, sraaramtrfnum, sraadate, createdate, modifydate, createdby, lastmodifiedby) <> (FcsraaRow.tupled, FcsraaRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(sraadsarfnum), Rep.Some(sraaramtrfnum), Rep.Some(sraadate), createdate, Rep.Some(modifydate), Rep.Some(createdby), Rep.Some(lastmodifiedby)).shaped.<>({r=>import r._; _1.map(_=> FcsraaRow.tupled((_1.get, _2.get, _3.get, _4.get, _5, _6.get, _7.get, _8.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column SRAARFNUM SqlType(BIGINT), AutoInc, PrimaryKey */
    override val id: Rep[Long] = column[Long]("SRAARFNUM", O.AutoInc, O.PrimaryKey)
    /** Database column SRAADSARFNUM SqlType(BIGINT) */
    val sraadsarfnum: Rep[Long] = column[Long]("SRAADSARFNUM")
    /** Database column SRAARAMTRFNUM SqlType(BIGINT) */
    val sraaramtrfnum: Rep[Long] = column[Long]("SRAARAMTRFNUM")
    /** Database column SRAADATE SqlType(DATE) */
    val sraadate: Rep[java.sql.Date] = column[java.sql.Date]("SRAADATE")





    /** Foreign key referencing Fcdsa (database name FK_FCSRAA_FCDSA) */
    lazy val fcdsaFk = foreignKey("FK_FCSRAA_FCDSA", sraadsarfnum, Fcdsa)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Fcramt (database name FK_FCSRAA_FCRAMT) */
    lazy val fcramtFk = foreignKey("FK_FCSRAA_FCRAMT", sraaramtrfnum, Fcramt)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)

    /** Uniqueness Index over (sraadsarfnum,sraadate) (database name SRAA_SRAADATE_SRAADSA_UNQ) */
    val index1 = index("SRAA_SRAADATE_SRAADSA_UNQ", (sraadsarfnum, sraadate), unique=true)
  }
  /** Collection-like TableQuery object for table Fcsraa */
  lazy val Fcsraa = new TableQuery(tag => new Fcsraa(tag))

  /** Entity class storing rows of table Fcssh
   *  @param sshrfnum Database column SSHRFNUM SqlType(BIGINT), AutoInc, PrimaryKey
   *  @param sshdsarfnum Database column SSHDSARFNUM SqlType(BIGINT)
   *  @param sshcategory Database column SSHCATEGORY SqlType(VARCHAR), Length(16,true)
   *  @param sshvalue Database column SSHVALUE SqlType(FLOAT)
   *  @param sshcndsectorrfnum Database column SSHCNDSECTORRFNUM SqlType(BIGINT)
   *  @param createdate 
   *  @param modifydate 
   *  @param createdby 
   *  @param lastmodifiedby  */
  case class FcsshRow(id: Long, sshdsarfnum: Long, sshcategory: String, sshvalue: Float, sshcndsectorrfnum: Long, createdate: Option[java.sql.Timestamp] = None, modifydate: java.sql.Timestamp, createdby: String, lastmodifiedby: String) extends BaseEntity 
  class FcsshRowWrapper(id: Option[Long], sshdsarfnum: Long, sshcategory: String, sshvalue: Float, sshcndsectorrfnum: Long) {
    def get(userName: String): FcsshRow = {
      FcsshRow(this.id.getOrElse(0), this.sshdsarfnum, this.sshcategory, this.sshvalue, this.sshcndsectorrfnum, Some(DateTimeUtils.getCurrentTimeStamp), DateTimeUtils.getCurrentTimeStamp, userName, userName)
  	}
  }
  /** GetResult implicit for fetching FcsshRow objects using plain SQL queries */
  implicit def GetResultFcsshRow(implicit e0: GR[Long], e1: GR[String], e2: GR[Float], e3: GR[Option[java.sql.Timestamp]], e4: GR[java.sql.Timestamp]): GR[FcsshRow] = GR{
    prs => import prs._
    FcsshRow.tupled((<<[Long], <<[Long], <<[String], <<[Float], <<[Long], <<?[java.sql.Timestamp], <<[java.sql.Timestamp], <<[String], <<[String]))
  }
  /** Table description of table FCSSH. Objects of this class serve as prototypes for rows in queries. */
  class Fcssh(_tableTag: Tag) extends BaseTable[FcsshRow](_tableTag, "FCSSH") {
    def * = (id, sshdsarfnum, sshcategory, sshvalue, sshcndsectorrfnum, createdate, modifydate, createdby, lastmodifiedby) <> (FcsshRow.tupled, FcsshRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(sshdsarfnum), Rep.Some(sshcategory), Rep.Some(sshvalue), Rep.Some(sshcndsectorrfnum), createdate, Rep.Some(modifydate), Rep.Some(createdby), Rep.Some(lastmodifiedby)).shaped.<>({r=>import r._; _1.map(_=> FcsshRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6, _7.get, _8.get, _9.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column SSHRFNUM SqlType(BIGINT), AutoInc, PrimaryKey */
    override val id: Rep[Long] = column[Long]("SSHRFNUM", O.AutoInc, O.PrimaryKey)
    /** Database column SSHDSARFNUM SqlType(BIGINT) */
    val sshdsarfnum: Rep[Long] = column[Long]("SSHDSARFNUM")
    /** Database column SSHCATEGORY SqlType(VARCHAR), Length(16,true) */
    val sshcategory: Rep[String] = column[String]("SSHCATEGORY", O.Length(16,varying=true))
    /** Database column SSHVALUE SqlType(FLOAT) */
    val sshvalue: Rep[Float] = column[Float]("SSHVALUE")
    /** Database column SSHCNDSECTORRFNUM SqlType(BIGINT) */
    val sshcndsectorrfnum: Rep[Long] = column[Long]("SSHCNDSECTORRFNUM")





    /** Foreign key referencing Fccnd (database name FK_FCSSH_FCCND) */
    lazy val fccndFk = foreignKey("FK_FCSSH_FCCND", sshcndsectorrfnum, Fccnd)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Fcdsa (database name FK_FCSSH_FCDSA) */
    lazy val fcdsaFk = foreignKey("FK_FCSSH_FCDSA", sshdsarfnum, Fcdsa)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Fcsopt (database name FK_FCSSH_FCSOPT) */
    lazy val fcsoptFk = foreignKey("FK_FCSSH_FCSOPT", sshdsarfnum, Fcsopt)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table Fcssh */
  lazy val Fcssh = new TableQuery(tag => new Fcssh(tag))

  /** Entity class storing rows of table Fcsst
   *  @param sstrfnum Database column SSTRFNUM SqlType(BIGINT), AutoInc, PrimaryKey
   *  @param sstsiprfnum Database column SSTSIPRFNUM SqlType(BIGINT)
   *  @param sstcreditamount Database column SSTCREDITAMOUNT SqlType(DOUBLE)
   *  @param sstcreditdate Database column SSTCREDITDATE SqlType(DATE)
   *  @param createdate 
   *  @param modifydate 
   *  @param createdby 
   *  @param lastmodifiedby  */
  case class FcsstRow(id: Long, sstsiprfnum: Long, sstcreditamount: Double, sstcreditdate: java.sql.Date, createdate: Option[java.sql.Timestamp] = None, modifydate: java.sql.Timestamp, createdby: String, lastmodifiedby: String) extends BaseEntity 
  class FcsstRowWrapper(id: Option[Long], sstsiprfnum: Long, sstcreditamount: Double, sstcreditdate: java.sql.Date) {
    def get(userName: String): FcsstRow = {
      FcsstRow(this.id.getOrElse(0), this.sstsiprfnum, this.sstcreditamount, this.sstcreditdate, Some(DateTimeUtils.getCurrentTimeStamp), DateTimeUtils.getCurrentTimeStamp, userName, userName)
  	}
  }
  /** GetResult implicit for fetching FcsstRow objects using plain SQL queries */
  implicit def GetResultFcsstRow(implicit e0: GR[Long], e1: GR[Double], e2: GR[java.sql.Date], e3: GR[Option[java.sql.Timestamp]], e4: GR[java.sql.Timestamp], e5: GR[String]): GR[FcsstRow] = GR{
    prs => import prs._
    FcsstRow.tupled((<<[Long], <<[Long], <<[Double], <<[java.sql.Date], <<?[java.sql.Timestamp], <<[java.sql.Timestamp], <<[String], <<[String]))
  }
  /** Table description of table FCSST. Objects of this class serve as prototypes for rows in queries. */
  class Fcsst(_tableTag: Tag) extends BaseTable[FcsstRow](_tableTag, "FCSST") {
    def * = (id, sstsiprfnum, sstcreditamount, sstcreditdate, createdate, modifydate, createdby, lastmodifiedby) <> (FcsstRow.tupled, FcsstRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(sstsiprfnum), Rep.Some(sstcreditamount), Rep.Some(sstcreditdate), createdate, Rep.Some(modifydate), Rep.Some(createdby), Rep.Some(lastmodifiedby)).shaped.<>({r=>import r._; _1.map(_=> FcsstRow.tupled((_1.get, _2.get, _3.get, _4.get, _5, _6.get, _7.get, _8.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column SSTRFNUM SqlType(BIGINT), AutoInc, PrimaryKey */
    override val id: Rep[Long] = column[Long]("SSTRFNUM", O.AutoInc, O.PrimaryKey)
    /** Database column SSTSIPRFNUM SqlType(BIGINT) */
    val sstsiprfnum: Rep[Long] = column[Long]("SSTSIPRFNUM")
    /** Database column SSTCREDITAMOUNT SqlType(DOUBLE) */
    val sstcreditamount: Rep[Double] = column[Double]("SSTCREDITAMOUNT")
    /** Database column SSTCREDITDATE SqlType(DATE) */
    val sstcreditdate: Rep[java.sql.Date] = column[java.sql.Date]("SSTCREDITDATE")





    /** Foreign key referencing Fcsip (database name FK_FCSST_FCSIP) */
    lazy val fcsipFk = foreignKey("FK_FCSST_FCSIP", sstsiprfnum, Fcsip)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table Fcsst */
  lazy val Fcsst = new TableQuery(tag => new Fcsst(tag))

  /** Entity class storing rows of table Fcstt
   *  @param sttrfnum Database column STTRFNUM SqlType(BIGINT), AutoInc, PrimaryKey
   *  @param sttsharevalue Database column STTSHAREVALUE SqlType(DOUBLE), Default(None)
   *  @param sttshareofaum Database column STTSHAREOFAUM SqlType(FLOAT), Default(None)
   *  @param sttdsarfnum Database column STTDSARFNUM SqlType(BIGINT)
   *  @param sttsharequantity Database column STTSHAREQUANTITY SqlType(FLOAT)
   *  @param sttsecrfnum Database column STTSECRFNUM SqlType(BIGINT)
   *  @param createdate 
   *  @param modifydate 
   *  @param createdby 
   *  @param lastmodifiedby  */
  case class FcsttRow(id: Long, sttsharevalue: Option[Double] = None, sttshareofaum: Option[Float] = None, sttdsarfnum: Long, sttsharequantity: Float, sttsecrfnum: Long, createdate: Option[java.sql.Timestamp] = None, modifydate: java.sql.Timestamp, createdby: String, lastmodifiedby: String) extends BaseEntity 
  class FcsttRowWrapper(id: Option[Long], sttsharevalue: Option[Double] = None, sttshareofaum: Option[Float] = None, sttdsarfnum: Long, sttsharequantity: Float, sttsecrfnum: Long) {
    def get(userName: String): FcsttRow = {
      FcsttRow(this.id.getOrElse(0), this.sttsharevalue, this.sttshareofaum, this.sttdsarfnum, this.sttsharequantity, this.sttsecrfnum, Some(DateTimeUtils.getCurrentTimeStamp), DateTimeUtils.getCurrentTimeStamp, userName, userName)
  	}
  }
  /** GetResult implicit for fetching FcsttRow objects using plain SQL queries */
  implicit def GetResultFcsttRow(implicit e0: GR[Long], e1: GR[Option[Double]], e2: GR[Option[Float]], e3: GR[Float], e4: GR[Option[java.sql.Timestamp]], e5: GR[java.sql.Timestamp], e6: GR[String]): GR[FcsttRow] = GR{
    prs => import prs._
    FcsttRow.tupled((<<[Long], <<?[Double], <<?[Float], <<[Long], <<[Float], <<[Long], <<?[java.sql.Timestamp], <<[java.sql.Timestamp], <<[String], <<[String]))
  }
  /** Table description of table FCSTT. Objects of this class serve as prototypes for rows in queries. */
  class Fcstt(_tableTag: Tag) extends BaseTable[FcsttRow](_tableTag, "FCSTT") {
    def * = (id, sttsharevalue, sttshareofaum, sttdsarfnum, sttsharequantity, sttsecrfnum, createdate, modifydate, createdby, lastmodifiedby) <> (FcsttRow.tupled, FcsttRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), sttsharevalue, sttshareofaum, Rep.Some(sttdsarfnum), Rep.Some(sttsharequantity), Rep.Some(sttsecrfnum), createdate, Rep.Some(modifydate), Rep.Some(createdby), Rep.Some(lastmodifiedby)).shaped.<>({r=>import r._; _1.map(_=> FcsttRow.tupled((_1.get, _2, _3, _4.get, _5.get, _6.get, _7, _8.get, _9.get, _10.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column STTRFNUM SqlType(BIGINT), AutoInc, PrimaryKey */
    override val id: Rep[Long] = column[Long]("STTRFNUM", O.AutoInc, O.PrimaryKey)
    /** Database column STTSHAREVALUE SqlType(DOUBLE), Default(None) */
    val sttsharevalue: Rep[Option[Double]] = column[Option[Double]]("STTSHAREVALUE", O.Default(None))
    /** Database column STTSHAREOFAUM SqlType(FLOAT), Default(None) */
    val sttshareofaum: Rep[Option[Float]] = column[Option[Float]]("STTSHAREOFAUM", O.Default(None))
    /** Database column STTDSARFNUM SqlType(BIGINT) */
    val sttdsarfnum: Rep[Long] = column[Long]("STTDSARFNUM")
    /** Database column STTSHAREQUANTITY SqlType(FLOAT) */
    val sttsharequantity: Rep[Float] = column[Float]("STTSHAREQUANTITY")
    /** Database column STTSECRFNUM SqlType(BIGINT) */
    val sttsecrfnum: Rep[Long] = column[Long]("STTSECRFNUM")





    /** Foreign key referencing Fcdsa (database name FK_FCSTT_FCDSA) */
    lazy val fcdsaFk = foreignKey("FK_FCSTT_FCDSA", sttdsarfnum, Fcdsa)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Fcsec (database name FK_FCSTT_FCSEC) */
    lazy val fcsecFk = foreignKey("FK_FCSTT_FCSEC", sttsecrfnum, Fcsec)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table Fcstt */
  lazy val Fcstt = new TableQuery(tag => new Fcstt(tag))

  /** Entity class storing rows of table Fcsttl
   *  @param sttlrfnum Database column STTLRFNUM SqlType(BIGINT), AutoInc, PrimaryKey
   *  @param sttlexternalid1 Database column STTLEXTERNALID1 SqlType(VARCHAR), Length(32,true), Default(None)
   *  @param sttlexternalid2 Database column STTLEXTERNALID2 SqlType(VARCHAR), Length(32,true), Default(None)
   *  @param sttlsettlementtype Database column STTLSETTLEMENTTYPE SqlType(CHAR), Length(10,false)
   *  @param sttlpayindate Database column STTLPAYINDATE SqlType(DATE)
   *  @param sttlpayoutdate Database column STTLPAYOUTDATE SqlType(DATE)
   *  @param sttlsecuritypayin Database column STTLSECURITYPAYIN SqlType(DATE)
   *  @param sttlsecuritypayout Database column STTLSECURITYPAYOUT SqlType(DATE)
   *  @param sttltradedate Database column STTLTRADEDATE SqlType(DATE)
   *  @param sttlsettlemententity Database column STTLSETTLEMENTENTITY SqlType(VARCHAR), Length(16,true)
   *  @param createdate 
   *  @param modifydate 
   *  @param createdby 
   *  @param lastmodifiedby  */
  case class FcsttlRow(id: Long, sttlexternalid1: Option[String] = None, sttlexternalid2: Option[String] = None, sttlsettlementtype: String, sttlpayindate: java.sql.Date, sttlpayoutdate: java.sql.Date, sttlsecuritypayin: java.sql.Date, sttlsecuritypayout: java.sql.Date, sttltradedate: java.sql.Date, sttlsettlemententity: String, createdate: Option[java.sql.Timestamp] = None, modifydate: java.sql.Timestamp, createdby: String, lastmodifiedby: String) extends BaseEntity 
  class FcsttlRowWrapper(id: Option[Long], sttlexternalid1: Option[String] = None, sttlexternalid2: Option[String] = None, sttlsettlementtype: String, sttlpayindate: java.sql.Date, sttlpayoutdate: java.sql.Date, sttlsecuritypayin: java.sql.Date, sttlsecuritypayout: java.sql.Date, sttltradedate: java.sql.Date, sttlsettlemententity: String) {
    def get(userName: String): FcsttlRow = {
      FcsttlRow(this.id.getOrElse(0), this.sttlexternalid1, this.sttlexternalid2, this.sttlsettlementtype, this.sttlpayindate, this.sttlpayoutdate, this.sttlsecuritypayin, this.sttlsecuritypayout, this.sttltradedate, this.sttlsettlemententity, Some(DateTimeUtils.getCurrentTimeStamp), DateTimeUtils.getCurrentTimeStamp, userName, userName)
  	}
  }
  /** GetResult implicit for fetching FcsttlRow objects using plain SQL queries */
  implicit def GetResultFcsttlRow(implicit e0: GR[Long], e1: GR[Option[String]], e2: GR[String], e3: GR[java.sql.Date], e4: GR[Option[java.sql.Timestamp]], e5: GR[java.sql.Timestamp]): GR[FcsttlRow] = GR{
    prs => import prs._
    FcsttlRow.tupled((<<[Long], <<?[String], <<?[String], <<[String], <<[java.sql.Date], <<[java.sql.Date], <<[java.sql.Date], <<[java.sql.Date], <<[java.sql.Date], <<[String], <<?[java.sql.Timestamp], <<[java.sql.Timestamp], <<[String], <<[String]))
  }
  /** Table description of table FCSTTL. Objects of this class serve as prototypes for rows in queries. */
  class Fcsttl(_tableTag: Tag) extends BaseTable[FcsttlRow](_tableTag, "FCSTTL") {
    def * = (id, sttlexternalid1, sttlexternalid2, sttlsettlementtype, sttlpayindate, sttlpayoutdate, sttlsecuritypayin, sttlsecuritypayout, sttltradedate, sttlsettlemententity, createdate, modifydate, createdby, lastmodifiedby) <> (FcsttlRow.tupled, FcsttlRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), sttlexternalid1, sttlexternalid2, Rep.Some(sttlsettlementtype), Rep.Some(sttlpayindate), Rep.Some(sttlpayoutdate), Rep.Some(sttlsecuritypayin), Rep.Some(sttlsecuritypayout), Rep.Some(sttltradedate), Rep.Some(sttlsettlemententity), createdate, Rep.Some(modifydate), Rep.Some(createdby), Rep.Some(lastmodifiedby)).shaped.<>({r=>import r._; _1.map(_=> FcsttlRow.tupled((_1.get, _2, _3, _4.get, _5.get, _6.get, _7.get, _8.get, _9.get, _10.get, _11, _12.get, _13.get, _14.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column STTLRFNUM SqlType(BIGINT), AutoInc, PrimaryKey */
    override val id: Rep[Long] = column[Long]("STTLRFNUM", O.AutoInc, O.PrimaryKey)
    /** Database column STTLEXTERNALID1 SqlType(VARCHAR), Length(32,true), Default(None) */
    val sttlexternalid1: Rep[Option[String]] = column[Option[String]]("STTLEXTERNALID1", O.Length(32,varying=true), O.Default(None))
    /** Database column STTLEXTERNALID2 SqlType(VARCHAR), Length(32,true), Default(None) */
    val sttlexternalid2: Rep[Option[String]] = column[Option[String]]("STTLEXTERNALID2", O.Length(32,varying=true), O.Default(None))
    /** Database column STTLSETTLEMENTTYPE SqlType(CHAR), Length(10,false) */
    val sttlsettlementtype: Rep[String] = column[String]("STTLSETTLEMENTTYPE", O.Length(10,varying=false))
    /** Database column STTLPAYINDATE SqlType(DATE) */
    val sttlpayindate: Rep[java.sql.Date] = column[java.sql.Date]("STTLPAYINDATE")
    /** Database column STTLPAYOUTDATE SqlType(DATE) */
    val sttlpayoutdate: Rep[java.sql.Date] = column[java.sql.Date]("STTLPAYOUTDATE")
    /** Database column STTLSECURITYPAYIN SqlType(DATE) */
    val sttlsecuritypayin: Rep[java.sql.Date] = column[java.sql.Date]("STTLSECURITYPAYIN")
    /** Database column STTLSECURITYPAYOUT SqlType(DATE) */
    val sttlsecuritypayout: Rep[java.sql.Date] = column[java.sql.Date]("STTLSECURITYPAYOUT")
    /** Database column STTLTRADEDATE SqlType(DATE) */
    val sttltradedate: Rep[java.sql.Date] = column[java.sql.Date]("STTLTRADEDATE")
    /** Database column STTLSETTLEMENTENTITY SqlType(VARCHAR), Length(16,true) */
    val sttlsettlemententity: Rep[String] = column[String]("STTLSETTLEMENTENTITY", O.Length(16,varying=true))
  }
  /** Collection-like TableQuery object for table Fcsttl */
  lazy val Fcsttl = new TableQuery(tag => new Fcsttl(tag))

  /** Entity class storing rows of table Fctlt
   *  @param tltrfnum Database column TLTRFNUM SqlType(BIGINT), AutoInc, PrimaryKey */
  case class FctltRow(id: Long) extends BaseEntity 
  class FctltRowWrapper(id: Option[Long]) {
    def get(userName: String): FctltRow = {
      FctltRow(this.id.getOrElse(0))
  	}
  }
  /** GetResult implicit for fetching FctltRow objects using plain SQL queries */
  implicit def GetResultFctltRow(implicit e0: GR[Long]): GR[FctltRow] = GR{
    prs => import prs._
    FctltRow(<<[Long])
  }
  /** Table description of table FCTLT. Objects of this class serve as prototypes for rows in queries. */
  class Fctlt(_tableTag: Tag) extends BaseTable[FctltRow](_tableTag, "FCTLT") {
    def * = id <> (FctltRow, FctltRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = Rep.Some(id).shaped.<>(r => r.map(_=> FctltRow(r.get)), (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column TLTRFNUM SqlType(BIGINT), AutoInc, PrimaryKey */
    override val id: Rep[Long] = column[Long]("TLTRFNUM", O.AutoInc, O.PrimaryKey)
  }
  /** Collection-like TableQuery object for table Fctlt */
  lazy val Fctlt = new TableQuery(tag => new Fctlt(tag))

  /** Entity class storing rows of table Fcuaa
   *  @param uaarfnum Database column UAARFNUM SqlType(BIGINT), AutoInc, PrimaryKey
   *  @param uaaubdrfnum Database column UAAUBDRFNUM SqlType(BIGINT)
   *  @param uaaamtrfnum Database column UAAAMTRFNUM SqlType(BIGINT)
   *  @param uaacndaddresstype Database column UAACNDADDRESSTYPE SqlType(BIGINT)
   *  @param uaacndcontactaddress Database column UAACNDCONTACTADDRESS SqlType(BIGINT)
   *  @param uaadmtrfnum Database column UAADMTRFNUM SqlType(BIGINT), Default(None)
   *  @param uaaipvrfnum Database column UAAIPVRFNUM SqlType(BIGINT), Default(None)
   *  @param uaacndbrthcntryrfnum Database column UAACNDBRTHCNTRYRFNUM SqlType(BIGINT), Default(None)
   *  @param uaaregion Database column UAAREGION SqlType(CHAR), Length(2,false), Default(None)
   *  @param uaadocstatus Database column UAADOCSTATUS SqlType(CHAR), Length(2,false), Default(UP)
   *  @param createdate 
   *  @param modifydate 
   *  @param createdby 
   *  @param lastmodifiedby  */
  case class FcuaaRow(id: Long, uaaubdrfnum: Long, uaaamtrfnum: Long, uaacndaddresstype: Long, uaacndcontactaddress: Long, uaadmtrfnum: Option[Long] = None, uaaipvrfnum: Option[Long] = None, uaacndbrthcntryrfnum: Option[Long] = None, uaaregion: Option[String] = None, uaadocstatus: String = "UP", createdate: Option[java.sql.Timestamp] = None, modifydate: java.sql.Timestamp, createdby: String, lastmodifiedby: String) extends BaseEntity 
  class FcuaaRowWrapper(id: Option[Long], uaaubdrfnum: Long, uaaamtrfnum: Long, uaacndaddresstype: Long, uaacndcontactaddress: Long, uaadmtrfnum: Option[Long] = None, uaaipvrfnum: Option[Long] = None, uaacndbrthcntryrfnum: Option[Long] = None, uaaregion: Option[String] = None, uaadocstatus: String = "UP") {
    def get(userName: String): FcuaaRow = {
      FcuaaRow(this.id.getOrElse(0), this.uaaubdrfnum, this.uaaamtrfnum, this.uaacndaddresstype, this.uaacndcontactaddress, this.uaadmtrfnum, this.uaaipvrfnum, this.uaacndbrthcntryrfnum, this.uaaregion, this.uaadocstatus, Some(DateTimeUtils.getCurrentTimeStamp), DateTimeUtils.getCurrentTimeStamp, userName, userName)
  	}
  }
  /** GetResult implicit for fetching FcuaaRow objects using plain SQL queries */
  implicit def GetResultFcuaaRow(implicit e0: GR[Long], e1: GR[Option[Long]], e2: GR[Option[String]], e3: GR[String], e4: GR[Option[java.sql.Timestamp]], e5: GR[java.sql.Timestamp]): GR[FcuaaRow] = GR{
    prs => import prs._
    FcuaaRow.tupled((<<[Long], <<[Long], <<[Long], <<[Long], <<[Long], <<?[Long], <<?[Long], <<?[Long], <<?[String], <<[String], <<?[java.sql.Timestamp], <<[java.sql.Timestamp], <<[String], <<[String]))
  }
  /** Table description of table FCUAA. Objects of this class serve as prototypes for rows in queries. */
  class Fcuaa(_tableTag: Tag) extends BaseTable[FcuaaRow](_tableTag, "FCUAA") {
    def * = (id, uaaubdrfnum, uaaamtrfnum, uaacndaddresstype, uaacndcontactaddress, uaadmtrfnum, uaaipvrfnum, uaacndbrthcntryrfnum, uaaregion, uaadocstatus, createdate, modifydate, createdby, lastmodifiedby) <> (FcuaaRow.tupled, FcuaaRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(uaaubdrfnum), Rep.Some(uaaamtrfnum), Rep.Some(uaacndaddresstype), Rep.Some(uaacndcontactaddress), uaadmtrfnum, uaaipvrfnum, uaacndbrthcntryrfnum, uaaregion, Rep.Some(uaadocstatus), createdate, Rep.Some(modifydate), Rep.Some(createdby), Rep.Some(lastmodifiedby)).shaped.<>({r=>import r._; _1.map(_=> FcuaaRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6, _7, _8, _9, _10.get, _11, _12.get, _13.get, _14.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column UAARFNUM SqlType(BIGINT), AutoInc, PrimaryKey */
    override val id: Rep[Long] = column[Long]("UAARFNUM", O.AutoInc, O.PrimaryKey)
    /** Database column UAAUBDRFNUM SqlType(BIGINT) */
    val uaaubdrfnum: Rep[Long] = column[Long]("UAAUBDRFNUM")
    /** Database column UAAAMTRFNUM SqlType(BIGINT) */
    val uaaamtrfnum: Rep[Long] = column[Long]("UAAAMTRFNUM")
    /** Database column UAACNDADDRESSTYPE SqlType(BIGINT) */
    val uaacndaddresstype: Rep[Long] = column[Long]("UAACNDADDRESSTYPE")
    /** Database column UAACNDCONTACTADDRESS SqlType(BIGINT) */
    val uaacndcontactaddress: Rep[Long] = column[Long]("UAACNDCONTACTADDRESS")
    /** Database column UAADMTRFNUM SqlType(BIGINT), Default(None) */
    val uaadmtrfnum: Rep[Option[Long]] = column[Option[Long]]("UAADMTRFNUM", O.Default(None))
    /** Database column UAAIPVRFNUM SqlType(BIGINT), Default(None) */
    val uaaipvrfnum: Rep[Option[Long]] = column[Option[Long]]("UAAIPVRFNUM", O.Default(None))
    /** Database column UAACNDBRTHCNTRYRFNUM SqlType(BIGINT), Default(None) */
    val uaacndbrthcntryrfnum: Rep[Option[Long]] = column[Option[Long]]("UAACNDBRTHCNTRYRFNUM", O.Default(None))
    /** Database column UAAREGION SqlType(CHAR), Length(2,false), Default(None) */
    val uaaregion: Rep[Option[String]] = column[Option[String]]("UAAREGION", O.Length(2,varying=false), O.Default(None))
    /** Database column UAADOCSTATUS SqlType(CHAR), Length(2,false), Default(UP) */
    val uaadocstatus: Rep[String] = column[String]("UAADOCSTATUS", O.Length(2,varying=false), O.Default("UP"))





    /** Foreign key referencing Fcamt (database name FK_FCUAA_FCAMT) */
    lazy val fcamtFk = foreignKey("FK_FCUAA_FCAMT", uaaamtrfnum, Fcamt)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Fccnd (database name FK_FCUAA_FCCND) */
    lazy val fccndFk2 = foreignKey("FK_FCUAA_FCCND", uaacndaddresstype, Fccnd)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Fccnd (database name FK_FCUAA_FCCND_02) */
    lazy val fccndFk3 = foreignKey("FK_FCUAA_FCCND_02", uaacndbrthcntryrfnum, Fccnd)(r => Rep.Some(r.id), onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Fccnd (database name FK_FCUAA_FCCND_03) */
    lazy val fccndFk4 = foreignKey("FK_FCUAA_FCCND_03", uaacndcontactaddress, Fccnd)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Fcdmt (database name FK_FCUAA_FCDMT) */
    lazy val fcdmtFk = foreignKey("FK_FCUAA_FCDMT", uaadmtrfnum, Fcdmt)(r => Rep.Some(r.id), onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Fcipv (database name FK_FCUAA_FCIPV) */
    lazy val fcipvFk = foreignKey("FK_FCUAA_FCIPV", uaaipvrfnum, Fcipv)(r => Rep.Some(r.id), onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Fcubd (database name FK_FCUAA_FCUBD) */
    lazy val fcubdFk = foreignKey("FK_FCUAA_FCUBD", uaaubdrfnum, Fcubd)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table Fcuaa */
  lazy val Fcuaa = new TableQuery(tag => new Fcuaa(tag))

  /** Entity class storing rows of table Fcuact
   *  @param uactrfnum Database column UACTRFNUM SqlType(BIGINT), AutoInc, PrimaryKey
   *  @param uactcode Database column UACTCODE SqlType(VARCHAR), Length(64,true)
   *  @param uactexpirydate Database column UACTEXPIRYDATE SqlType(TIMESTAMP), Default(None)
   *  @param uactubdrfnum Database column UACTUBDRFNUM SqlType(BIGINT)
   *  @param uactisused Database column UACTISUSED SqlType(CHAR), Length(2,false)
   *  @param createdate 
   *  @param modifydate 
   *  @param createdby 
   *  @param lastmodifiedby  */
  case class FcuactRow(id: Long, uactcode: String, uactexpirydate: Option[java.sql.Timestamp] = None, uactubdrfnum: Long, uactisused: String, createdate: Option[java.sql.Timestamp] = None, modifydate: java.sql.Timestamp, createdby: String, lastmodifiedby: String) extends BaseEntity 
  class FcuactRowWrapper(id: Option[Long], uactcode: String, uactexpirydate: Option[java.sql.Timestamp] = None, uactubdrfnum: Long, uactisused: String) {
    def get(userName: String): FcuactRow = {
      FcuactRow(this.id.getOrElse(0), this.uactcode, this.uactexpirydate, this.uactubdrfnum, this.uactisused, Some(DateTimeUtils.getCurrentTimeStamp), DateTimeUtils.getCurrentTimeStamp, userName, userName)
  	}
  }
  /** GetResult implicit for fetching FcuactRow objects using plain SQL queries */
  implicit def GetResultFcuactRow(implicit e0: GR[Long], e1: GR[String], e2: GR[Option[java.sql.Timestamp]], e3: GR[java.sql.Timestamp]): GR[FcuactRow] = GR{
    prs => import prs._
    FcuactRow.tupled((<<[Long], <<[String], <<?[java.sql.Timestamp], <<[Long], <<[String], <<?[java.sql.Timestamp], <<[java.sql.Timestamp], <<[String], <<[String]))
  }
  /** Table description of table FCUACT. Objects of this class serve as prototypes for rows in queries. */
  class Fcuact(_tableTag: Tag) extends BaseTable[FcuactRow](_tableTag, "FCUACT") {
    def * = (id, uactcode, uactexpirydate, uactubdrfnum, uactisused, createdate, modifydate, createdby, lastmodifiedby) <> (FcuactRow.tupled, FcuactRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(uactcode), uactexpirydate, Rep.Some(uactubdrfnum), Rep.Some(uactisused), createdate, Rep.Some(modifydate), Rep.Some(createdby), Rep.Some(lastmodifiedby)).shaped.<>({r=>import r._; _1.map(_=> FcuactRow.tupled((_1.get, _2.get, _3, _4.get, _5.get, _6, _7.get, _8.get, _9.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column UACTRFNUM SqlType(BIGINT), AutoInc, PrimaryKey */
    override val id: Rep[Long] = column[Long]("UACTRFNUM", O.AutoInc, O.PrimaryKey)
    /** Database column UACTCODE SqlType(VARCHAR), Length(64,true) */
    val uactcode: Rep[String] = column[String]("UACTCODE", O.Length(64,varying=true))
    /** Database column UACTEXPIRYDATE SqlType(TIMESTAMP), Default(None) */
    val uactexpirydate: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("UACTEXPIRYDATE", O.Default(None))
    /** Database column UACTUBDRFNUM SqlType(BIGINT) */
    val uactubdrfnum: Rep[Long] = column[Long]("UACTUBDRFNUM")
    /** Database column UACTISUSED SqlType(CHAR), Length(2,false) */
    val uactisused: Rep[String] = column[String]("UACTISUSED", O.Length(2,varying=false))





    /** Foreign key referencing Fcubd (database name FK_FCUACT_FCUBD) */
    lazy val fcubdFk = foreignKey("FK_FCUACT_FCUBD", uactubdrfnum, Fcubd)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table Fcuact */
  lazy val Fcuact = new TableQuery(tag => new Fcuact(tag))

  /** Entity class storing rows of table Fcubd
   *  @param ubdrfnum Database column UBDRFNUM SqlType(BIGINT), AutoInc, PrimaryKey
   *  @param ubdfirstname Database column UBDFIRSTNAME SqlType(VARCHAR), Length(64,true), Default(None)
   *  @param ubdmiddlename Database column UBDMIDDLENAME SqlType(VARCHAR), Length(64,true), Default(None)
   *  @param ubdlastname Database column UBDLASTNAME SqlType(VARCHAR), Length(64,true), Default(None)
   *  @param ubdpan Database column UBDPAN SqlType(CHAR), Length(10,false), Default(None)
   *  @param ubdmobileno Database column UBDMOBILENO SqlType(CHAR), Length(18,false), Default(None)
   *  @param ubdemailid Database column UBDEMAILID SqlType(CHAR), Length(50,false)
   *  @param ubdteleno Database column UBDTELENO SqlType(VARCHAR), Length(20,true), Default(None)
   *  @param ubdfaxno Database column UBDFAXNO SqlType(VARCHAR), Length(20,true), Default(None)
   *  @param ubdpanname Database column UBDPANNAME SqlType(VARCHAR), Length(128,true), Default(None)
   *  @param ubddob Database column UBDDOB SqlType(DATE), Default(None)
   *  @param ubdcndnationalityrfnum Database column UBDCNDNATIONALITYRFNUM SqlType(BIGINT), Default(None)
   *  @param ubdgender Database column UBDGENDER SqlType(CHAR), Length(2,false), Default(None)
   *  @param ubdcndoccupationrfnum Database column UBDCNDOCCUPATIONRFNUM SqlType(BIGINT), Default(None)
   *  @param ubdtype Database column UBDTYPE SqlType(CHAR), Length(3,false), Default(None)
   *  @param ubdcndmaritalstatusrfnum Database column UBDCNDMARITALSTATUSRFNUM SqlType(BIGINT), Default(None)
   *  @param ubdcndtaxstatusrfnum Database column UBDCNDTAXSTATUSRFNUM SqlType(BIGINT), Default(None)
   *  @param ubdsalutation Database column UBDSALUTATION SqlType(CHAR), Length(5,false), Default(None)
   *  @param createdate 
   *  @param modifydate 
   *  @param createdby 
   *  @param lastmodifiedby  */
  case class FcubdRow(id: Long, ubdfirstname: Option[String] = None, ubdmiddlename: Option[String] = None, ubdlastname: Option[String] = None, ubdpan: Option[String] = None, ubdmobileno: Option[String] = None, ubdemailid: String, ubdteleno: Option[String] = None, ubdfaxno: Option[String] = None, ubdpanname: Option[String] = None, ubddob: Option[java.sql.Date] = None, ubdcndnationalityrfnum: Option[Long] = None, ubdgender: Option[String] = None, ubdcndoccupationrfnum: Option[Long] = None, ubdtype: Option[String] = None, ubdcndmaritalstatusrfnum: Option[Long] = None, ubdcndtaxstatusrfnum: Option[Long] = None, ubdsalutation: Option[String] = None, createdate: Option[java.sql.Timestamp] = None, modifydate: java.sql.Timestamp, createdby: String, lastmodifiedby: String) extends BaseEntity 
  class FcubdRowWrapper(id: Option[Long], ubdfirstname: Option[String] = None, ubdmiddlename: Option[String] = None, ubdlastname: Option[String] = None, ubdpan: Option[String] = None, ubdmobileno: Option[String] = None, ubdemailid: String, ubdteleno: Option[String] = None, ubdfaxno: Option[String] = None, ubdpanname: Option[String] = None, ubddob: Option[java.sql.Date] = None, ubdcndnationalityrfnum: Option[Long] = None, ubdgender: Option[String] = None, ubdcndoccupationrfnum: Option[Long] = None, ubdtype: Option[String] = None, ubdcndmaritalstatusrfnum: Option[Long] = None, ubdcndtaxstatusrfnum: Option[Long] = None, ubdsalutation: Option[String] = None) {
    def get(userName: String): FcubdRow = {
      FcubdRow(this.id.getOrElse(0), this.ubdfirstname, this.ubdmiddlename, this.ubdlastname, this.ubdpan, this.ubdmobileno, this.ubdemailid, this.ubdteleno, this.ubdfaxno, this.ubdpanname, this.ubddob, this.ubdcndnationalityrfnum, this.ubdgender, this.ubdcndoccupationrfnum, this.ubdtype, this.ubdcndmaritalstatusrfnum, this.ubdcndtaxstatusrfnum, this.ubdsalutation, Some(DateTimeUtils.getCurrentTimeStamp), DateTimeUtils.getCurrentTimeStamp, userName, userName)
  	}
  }
  /** GetResult implicit for fetching FcubdRow objects using plain SQL queries */
  implicit def GetResultFcubdRow(implicit e0: GR[Long], e1: GR[Option[String]], e2: GR[String], e3: GR[Option[java.sql.Date]], e4: GR[Option[Long]], e5: GR[Option[java.sql.Timestamp]], e6: GR[java.sql.Timestamp]): GR[FcubdRow] = GR{
    prs => import prs._
    FcubdRow.tupled((<<[Long], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<[String], <<?[String], <<?[String], <<?[String], <<?[java.sql.Date], <<?[Long], <<?[String], <<?[Long], <<?[String], <<?[Long], <<?[Long], <<?[String], <<?[java.sql.Timestamp], <<[java.sql.Timestamp], <<[String], <<[String]))
  }
  /** Table description of table FCUBD. Objects of this class serve as prototypes for rows in queries. */
  class Fcubd(_tableTag: Tag) extends BaseTable[FcubdRow](_tableTag, "FCUBD") {
    def * = (id, ubdfirstname, ubdmiddlename, ubdlastname, ubdpan, ubdmobileno, ubdemailid, ubdteleno, ubdfaxno, ubdpanname, ubddob, ubdcndnationalityrfnum, ubdgender, ubdcndoccupationrfnum, ubdtype, ubdcndmaritalstatusrfnum, ubdcndtaxstatusrfnum, ubdsalutation, createdate, modifydate, createdby, lastmodifiedby) <> (FcubdRow.tupled, FcubdRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), ubdfirstname, ubdmiddlename, ubdlastname, ubdpan, ubdmobileno, Rep.Some(ubdemailid), ubdteleno, ubdfaxno, ubdpanname, ubddob, ubdcndnationalityrfnum, ubdgender, ubdcndoccupationrfnum, ubdtype, ubdcndmaritalstatusrfnum, ubdcndtaxstatusrfnum, ubdsalutation, createdate, Rep.Some(modifydate), Rep.Some(createdby), Rep.Some(lastmodifiedby)).shaped.<>({r=>import r._; _1.map(_=> FcubdRow.tupled((_1.get, _2, _3, _4, _5, _6, _7.get, _8, _9, _10, _11, _12, _13, _14, _15, _16, _17, _18, _19, _20.get, _21.get, _22.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column UBDRFNUM SqlType(BIGINT), AutoInc, PrimaryKey */
    override val id: Rep[Long] = column[Long]("UBDRFNUM", O.AutoInc, O.PrimaryKey)
    /** Database column UBDFIRSTNAME SqlType(VARCHAR), Length(64,true), Default(None) */
    val ubdfirstname: Rep[Option[String]] = column[Option[String]]("UBDFIRSTNAME", O.Length(64,varying=true), O.Default(None))
    /** Database column UBDMIDDLENAME SqlType(VARCHAR), Length(64,true), Default(None) */
    val ubdmiddlename: Rep[Option[String]] = column[Option[String]]("UBDMIDDLENAME", O.Length(64,varying=true), O.Default(None))
    /** Database column UBDLASTNAME SqlType(VARCHAR), Length(64,true), Default(None) */
    val ubdlastname: Rep[Option[String]] = column[Option[String]]("UBDLASTNAME", O.Length(64,varying=true), O.Default(None))
    /** Database column UBDPAN SqlType(CHAR), Length(10,false), Default(None) */
    val ubdpan: Rep[Option[String]] = column[Option[String]]("UBDPAN", O.Length(10,varying=false), O.Default(None))
    /** Database column UBDMOBILENO SqlType(CHAR), Length(18,false), Default(None) */
    val ubdmobileno: Rep[Option[String]] = column[Option[String]]("UBDMOBILENO", O.Length(18,varying=false), O.Default(None))
    /** Database column UBDEMAILID SqlType(CHAR), Length(50,false) */
    val ubdemailid: Rep[String] = column[String]("UBDEMAILID", O.Length(50,varying=false))
    /** Database column UBDTELENO SqlType(VARCHAR), Length(20,true), Default(None) */
    val ubdteleno: Rep[Option[String]] = column[Option[String]]("UBDTELENO", O.Length(20,varying=true), O.Default(None))
    /** Database column UBDFAXNO SqlType(VARCHAR), Length(20,true), Default(None) */
    val ubdfaxno: Rep[Option[String]] = column[Option[String]]("UBDFAXNO", O.Length(20,varying=true), O.Default(None))
    /** Database column UBDPANNAME SqlType(VARCHAR), Length(128,true), Default(None) */
    val ubdpanname: Rep[Option[String]] = column[Option[String]]("UBDPANNAME", O.Length(128,varying=true), O.Default(None))
    /** Database column UBDDOB SqlType(DATE), Default(None) */
    val ubddob: Rep[Option[java.sql.Date]] = column[Option[java.sql.Date]]("UBDDOB", O.Default(None))
    /** Database column UBDCNDNATIONALITYRFNUM SqlType(BIGINT), Default(None) */
    val ubdcndnationalityrfnum: Rep[Option[Long]] = column[Option[Long]]("UBDCNDNATIONALITYRFNUM", O.Default(None))
    /** Database column UBDGENDER SqlType(CHAR), Length(2,false), Default(None) */
    val ubdgender: Rep[Option[String]] = column[Option[String]]("UBDGENDER", O.Length(2,varying=false), O.Default(None))
    /** Database column UBDCNDOCCUPATIONRFNUM SqlType(BIGINT), Default(None) */
    val ubdcndoccupationrfnum: Rep[Option[Long]] = column[Option[Long]]("UBDCNDOCCUPATIONRFNUM", O.Default(None))
    /** Database column UBDTYPE SqlType(CHAR), Length(3,false), Default(None) */
    val ubdtype: Rep[Option[String]] = column[Option[String]]("UBDTYPE", O.Length(3,varying=false), O.Default(None))
    /** Database column UBDCNDMARITALSTATUSRFNUM SqlType(BIGINT), Default(None) */
    val ubdcndmaritalstatusrfnum: Rep[Option[Long]] = column[Option[Long]]("UBDCNDMARITALSTATUSRFNUM", O.Default(None))
    /** Database column UBDCNDTAXSTATUSRFNUM SqlType(BIGINT), Default(None) */
    val ubdcndtaxstatusrfnum: Rep[Option[Long]] = column[Option[Long]]("UBDCNDTAXSTATUSRFNUM", O.Default(None))
    /** Database column UBDSALUTATION SqlType(CHAR), Length(5,false), Default(None) */
    val ubdsalutation: Rep[Option[String]] = column[Option[String]]("UBDSALUTATION", O.Length(5,varying=false), O.Default(None))





    /** Foreign key referencing Fccnd (database name FK_FCUBD_FCCND) */
    lazy val fccndFk1 = foreignKey("FK_FCUBD_FCCND", ubdcndnationalityrfnum, Fccnd)(r => Rep.Some(r.id), onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Fccnd (database name FK_FCUBD_FCCND_02) */
    lazy val fccndFk2 = foreignKey("FK_FCUBD_FCCND_02", ubdcndoccupationrfnum, Fccnd)(r => Rep.Some(r.id), onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Fccnd (database name FK_FCUBD_FCCND_03) */
    lazy val fccndFk3 = foreignKey("FK_FCUBD_FCCND_03", ubdcndmaritalstatusrfnum, Fccnd)(r => Rep.Some(r.id), onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Fccnd (database name FK_FCUBD_FCCND_04) */
    lazy val fccndFk4 = foreignKey("FK_FCUBD_FCCND_04", ubdcndtaxstatusrfnum, Fccnd)(r => Rep.Some(r.id), onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)

    /** Uniqueness Index over (ubdpan) (database name UBD_PAN_UNIQUE) */
    val index1 = index("UBD_PAN_UNIQUE", ubdpan, unique=true)
  }
  /** Collection-like TableQuery object for table Fcubd */
  lazy val Fcubd = new TableQuery(tag => new Fcubd(tag))

  /** Entity class storing rows of table Fcuft
   *  @param uftrfnum Database column UFTRFNUM SqlType(BIGINT), AutoInc, PrimaryKey
   *  @param uftfomtrfnum Database column UFTFOMTRFNUM SqlType(BIGINT), Default(None)
   *  @param uftubdrfnum Database column UFTUBDRFNUM SqlType(BIGINT)
   *  @param createdate 
   *  @param modifydate 
   *  @param createdby 
   *  @param lastmodifiedby 
   *  @param uftsotrfnum Database column UFTSOTRFNUM SqlType(BIGINT), Default(None) */
  case class FcuftRow(id: Long, uftfomtrfnum: Option[Long] = None, uftubdrfnum: Long, createdate: Option[java.sql.Timestamp] = None, modifydate: java.sql.Timestamp, createdby: String, lastmodifiedby: String, uftsotrfnum: Option[Long] = None) extends BaseEntity 
  class FcuftRowWrapper(id: Option[Long], uftfomtrfnum: Option[Long] = None, uftubdrfnum: Long, uftsotrfnum: Option[Long] = None) {
    def get(userName: String): FcuftRow = {
      FcuftRow(this.id.getOrElse(0), this.uftfomtrfnum, this.uftubdrfnum, Some(DateTimeUtils.getCurrentTimeStamp), DateTimeUtils.getCurrentTimeStamp, userName, userName, this.uftsotrfnum)
  	}
  }
  /** GetResult implicit for fetching FcuftRow objects using plain SQL queries */
  implicit def GetResultFcuftRow(implicit e0: GR[Long], e1: GR[Option[Long]], e2: GR[Option[java.sql.Timestamp]], e3: GR[java.sql.Timestamp], e4: GR[String]): GR[FcuftRow] = GR{
    prs => import prs._
    FcuftRow.tupled((<<[Long], <<?[Long], <<[Long], <<?[java.sql.Timestamp], <<[java.sql.Timestamp], <<[String], <<[String], <<?[Long]))
  }
  /** Table description of table FCUFT. Objects of this class serve as prototypes for rows in queries. */
  class Fcuft(_tableTag: Tag) extends BaseTable[FcuftRow](_tableTag, "FCUFT") {
    def * = (id, uftfomtrfnum, uftubdrfnum, createdate, modifydate, createdby, lastmodifiedby, uftsotrfnum) <> (FcuftRow.tupled, FcuftRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), uftfomtrfnum, Rep.Some(uftubdrfnum), createdate, Rep.Some(modifydate), Rep.Some(createdby), Rep.Some(lastmodifiedby), uftsotrfnum).shaped.<>({r=>import r._; _1.map(_=> FcuftRow.tupled((_1.get, _2, _3.get, _4, _5.get, _6.get, _7.get, _8)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column UFTRFNUM SqlType(BIGINT), AutoInc, PrimaryKey */
    override val id: Rep[Long] = column[Long]("UFTRFNUM", O.AutoInc, O.PrimaryKey)
    /** Database column UFTFOMTRFNUM SqlType(BIGINT), Default(None) */
    val uftfomtrfnum: Rep[Option[Long]] = column[Option[Long]]("UFTFOMTRFNUM", O.Default(None))
    /** Database column UFTUBDRFNUM SqlType(BIGINT) */
    val uftubdrfnum: Rep[Long] = column[Long]("UFTUBDRFNUM")




    /** Database column UFTSOTRFNUM SqlType(BIGINT), Default(None) */
    val uftsotrfnum: Rep[Option[Long]] = column[Option[Long]]("UFTSOTRFNUM", O.Default(None))

    /** Foreign key referencing Fcfomt (database name FK_FCUFT_FCFOMT) */
    lazy val fcfomtFk = foreignKey("FK_FCUFT_FCFOMT", uftfomtrfnum, Fcfomt)(r => Rep.Some(r.id), onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Fcsot (database name FK_FCUFT_FCSOT) */
    lazy val fcsotFk = foreignKey("FK_FCUFT_FCSOT", uftsotrfnum, Fcsot)(r => Rep.Some(r.id), onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Fcubd (database name FK_FCUFT_FCUBD) */
    lazy val fcubdFk = foreignKey("FK_FCUFT_FCUBD", uftubdrfnum, Fcubd)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table Fcuft */
  lazy val Fcuft = new TableQuery(tag => new Fcuft(tag))

  /** Entity class storing rows of table Fcull
   *  @param ullrfnum Database column ULLRFNUM SqlType(BIGINT), AutoInc, PrimaryKey
   *  @param ullultrfnum Database column ULLULTRFNUM SqlType(BIGINT)
   *  @param ulllogintime Database column ULLLOGINTIME SqlType(TIMESTAMP), Default(None)
   *  @param ullloginip Database column ULLLOGINIP SqlType(VARCHAR), Length(64,true)
   *  @param ulldevice Database column ULLDEVICE SqlType(CHAR), Length(2,false), Default(None)
   *  @param ullbrowsing Database column ULLBROWSING SqlType(CHAR), Length(2,false), Default(None)
   *  @param ullissuccessful Database column ULLISSUCCESSFUL SqlType(CHAR), Length(2,false)
   *  @param createdate 
   *  @param modifydate 
   *  @param createdby 
   *  @param lastmodifiedby  */
  case class FcullRow(id: Long, ullultrfnum: Long, ulllogintime: Option[java.sql.Timestamp] = None, ullloginip: String, ulldevice: Option[String] = None, ullbrowsing: Option[String] = None, ullissuccessful: String, createdate: Option[java.sql.Timestamp] = None, modifydate: java.sql.Timestamp, createdby: String, lastmodifiedby: String) extends BaseEntity 
  class FcullRowWrapper(id: Option[Long], ullultrfnum: Long, ulllogintime: Option[java.sql.Timestamp] = None, ullloginip: String, ulldevice: Option[String] = None, ullbrowsing: Option[String] = None, ullissuccessful: String) {
    def get(userName: String): FcullRow = {
      FcullRow(this.id.getOrElse(0), this.ullultrfnum, this.ulllogintime, this.ullloginip, this.ulldevice, this.ullbrowsing, this.ullissuccessful, Some(DateTimeUtils.getCurrentTimeStamp), DateTimeUtils.getCurrentTimeStamp, userName, userName)
  	}
  }
  /** GetResult implicit for fetching FcullRow objects using plain SQL queries */
  implicit def GetResultFcullRow(implicit e0: GR[Long], e1: GR[Option[java.sql.Timestamp]], e2: GR[String], e3: GR[Option[String]], e4: GR[java.sql.Timestamp]): GR[FcullRow] = GR{
    prs => import prs._
    FcullRow.tupled((<<[Long], <<[Long], <<?[java.sql.Timestamp], <<[String], <<?[String], <<?[String], <<[String], <<?[java.sql.Timestamp], <<[java.sql.Timestamp], <<[String], <<[String]))
  }
  /** Table description of table FCULL. Objects of this class serve as prototypes for rows in queries. */
  class Fcull(_tableTag: Tag) extends BaseTable[FcullRow](_tableTag, "FCULL") {
    def * = (id, ullultrfnum, ulllogintime, ullloginip, ulldevice, ullbrowsing, ullissuccessful, createdate, modifydate, createdby, lastmodifiedby) <> (FcullRow.tupled, FcullRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(ullultrfnum), ulllogintime, Rep.Some(ullloginip), ulldevice, ullbrowsing, Rep.Some(ullissuccessful), createdate, Rep.Some(modifydate), Rep.Some(createdby), Rep.Some(lastmodifiedby)).shaped.<>({r=>import r._; _1.map(_=> FcullRow.tupled((_1.get, _2.get, _3, _4.get, _5, _6, _7.get, _8, _9.get, _10.get, _11.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column ULLRFNUM SqlType(BIGINT), AutoInc, PrimaryKey */
    override val id: Rep[Long] = column[Long]("ULLRFNUM", O.AutoInc, O.PrimaryKey)
    /** Database column ULLULTRFNUM SqlType(BIGINT) */
    val ullultrfnum: Rep[Long] = column[Long]("ULLULTRFNUM")
    /** Database column ULLLOGINTIME SqlType(TIMESTAMP), Default(None) */
    val ulllogintime: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("ULLLOGINTIME", O.Default(None))
    /** Database column ULLLOGINIP SqlType(VARCHAR), Length(64,true) */
    val ullloginip: Rep[String] = column[String]("ULLLOGINIP", O.Length(64,varying=true))
    /** Database column ULLDEVICE SqlType(CHAR), Length(2,false), Default(None) */
    val ulldevice: Rep[Option[String]] = column[Option[String]]("ULLDEVICE", O.Length(2,varying=false), O.Default(None))
    /** Database column ULLBROWSING SqlType(CHAR), Length(2,false), Default(None) */
    val ullbrowsing: Rep[Option[String]] = column[Option[String]]("ULLBROWSING", O.Length(2,varying=false), O.Default(None))
    /** Database column ULLISSUCCESSFUL SqlType(CHAR), Length(2,false) */
    val ullissuccessful: Rep[String] = column[String]("ULLISSUCCESSFUL", O.Length(2,varying=false))





    /** Foreign key referencing Fcult (database name FK_FCULL_FCULT) */
    lazy val fcultFk = foreignKey("FK_FCULL_FCULT", ullultrfnum, Fcult)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table Fcull */
  lazy val Fcull = new TableQuery(tag => new Fcull(tag))

  /** Entity class storing rows of table Fcult
   *  @param ultrfnum Database column ULTRFNUM SqlType(BIGINT), AutoInc, PrimaryKey
   *  @param ultubdrfnum Database column ULTUBDRFNUM SqlType(BIGINT)
   *  @param ultusername Database column ULTUSERNAME SqlType(CHAR), Length(64,false)
   *  @param ultpassword Database column ULTPASSWORD SqlType(VARCHAR), Length(128,true)
   *  @param ultlastlogin Database column ULTLASTLOGIN SqlType(TIMESTAMP), Default(None)
   *  @param ultloginstatus Database column ULTLOGINSTATUS SqlType(CHAR), Length(2,false)
   *  @param ultemail Database column ULTEMAIL SqlType(VARCHAR), Length(128,true), Default(None)
   *  @param ultattempts Database column ULTATTEMPTS SqlType(INT), Default(None)
   *  @param createdate 
   *  @param modifydate 
   *  @param createdby 
   *  @param lastmodifiedby  */
  case class FcultRow(id: Long, ultubdrfnum: Long, ultusername: String, ultpassword: String, ultlastlogin: Option[java.sql.Timestamp] = None, ultloginstatus: String, ultemail: Option[String] = None, ultattempts: Option[Int] = None, createdate: Option[java.sql.Timestamp] = None, modifydate: java.sql.Timestamp, createdby: String, lastmodifiedby: String) extends BaseEntity 
  class FcultRowWrapper(id: Option[Long], ultubdrfnum: Long, ultusername: String, ultpassword: String, ultlastlogin: Option[java.sql.Timestamp] = None, ultloginstatus: String, ultemail: Option[String] = None, ultattempts: Option[Int] = None) {
    def get(userName: String): FcultRow = {
      FcultRow(this.id.getOrElse(0), this.ultubdrfnum, this.ultusername, this.ultpassword, this.ultlastlogin, this.ultloginstatus, this.ultemail, this.ultattempts, Some(DateTimeUtils.getCurrentTimeStamp), DateTimeUtils.getCurrentTimeStamp, userName, userName)
  	}
  }
  /** GetResult implicit for fetching FcultRow objects using plain SQL queries */
  implicit def GetResultFcultRow(implicit e0: GR[Long], e1: GR[String], e2: GR[Option[java.sql.Timestamp]], e3: GR[Option[String]], e4: GR[Option[Int]], e5: GR[java.sql.Timestamp]): GR[FcultRow] = GR{
    prs => import prs._
    FcultRow.tupled((<<[Long], <<[Long], <<[String], <<[String], <<?[java.sql.Timestamp], <<[String], <<?[String], <<?[Int], <<?[java.sql.Timestamp], <<[java.sql.Timestamp], <<[String], <<[String]))
  }
  /** Table description of table FCULT. Objects of this class serve as prototypes for rows in queries. */
  class Fcult(_tableTag: Tag) extends BaseTable[FcultRow](_tableTag, "FCULT") {
    def * = (id, ultubdrfnum, ultusername, ultpassword, ultlastlogin, ultloginstatus, ultemail, ultattempts, createdate, modifydate, createdby, lastmodifiedby) <> (FcultRow.tupled, FcultRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(ultubdrfnum), Rep.Some(ultusername), Rep.Some(ultpassword), ultlastlogin, Rep.Some(ultloginstatus), ultemail, ultattempts, createdate, Rep.Some(modifydate), Rep.Some(createdby), Rep.Some(lastmodifiedby)).shaped.<>({r=>import r._; _1.map(_=> FcultRow.tupled((_1.get, _2.get, _3.get, _4.get, _5, _6.get, _7, _8, _9, _10.get, _11.get, _12.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column ULTRFNUM SqlType(BIGINT), AutoInc, PrimaryKey */
    override val id: Rep[Long] = column[Long]("ULTRFNUM", O.AutoInc, O.PrimaryKey)
    /** Database column ULTUBDRFNUM SqlType(BIGINT) */
    val ultubdrfnum: Rep[Long] = column[Long]("ULTUBDRFNUM")
    /** Database column ULTUSERNAME SqlType(CHAR), Length(64,false) */
    val ultusername: Rep[String] = column[String]("ULTUSERNAME", O.Length(64,varying=false))
    /** Database column ULTPASSWORD SqlType(VARCHAR), Length(128,true) */
    val ultpassword: Rep[String] = column[String]("ULTPASSWORD", O.Length(128,varying=true))
    /** Database column ULTLASTLOGIN SqlType(TIMESTAMP), Default(None) */
    val ultlastlogin: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("ULTLASTLOGIN", O.Default(None))
    /** Database column ULTLOGINSTATUS SqlType(CHAR), Length(2,false) */
    val ultloginstatus: Rep[String] = column[String]("ULTLOGINSTATUS", O.Length(2,varying=false))
    /** Database column ULTEMAIL SqlType(VARCHAR), Length(128,true), Default(None) */
    val ultemail: Rep[Option[String]] = column[Option[String]]("ULTEMAIL", O.Length(128,varying=true), O.Default(None))
    /** Database column ULTATTEMPTS SqlType(INT), Default(None) */
    val ultattempts: Rep[Option[Int]] = column[Option[Int]]("ULTATTEMPTS", O.Default(None))





    /** Foreign key referencing Fcubd (database name FK_FCULT_FCUBD) */
    lazy val fcubdFk = foreignKey("FK_FCULT_FCUBD", ultubdrfnum, Fcubd)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)

    /** Uniqueness Index over (ultusername) (database name UNIQUE_USERNAME) */
    val index1 = index("UNIQUE_USERNAME", ultusername, unique=true)
  }
  /** Collection-like TableQuery object for table Fcult */
  lazy val Fcult = new TableQuery(tag => new Fcult(tag))

  /** Entity class storing rows of table Fcuoa
   *  @param uoarfnum Database column UOARFNUM SqlType(BIGINT), AutoInc, PrimaryKey
   *  @param uoaubdrfnum Database column UOAUBDRFNUM SqlType(BIGINT)
   *  @param uoapurpose Database column UOAPURPOSE SqlType(CHAR), Length(2,false)
   *  @param uoaotptrfnum Database column UOAOTPTRFNUM SqlType(BIGINT)
   *  @param createdate 
   *  @param modifydate 
   *  @param createdby 
   *  @param lastmodifiedby  */
  case class FcuoaRow(id: Long, uoaubdrfnum: Long, uoapurpose: String, uoaotptrfnum: Long, createdate: Option[java.sql.Timestamp] = None, modifydate: java.sql.Timestamp, createdby: String, lastmodifiedby: String) extends BaseEntity 
  class FcuoaRowWrapper(id: Option[Long], uoaubdrfnum: Long, uoapurpose: String, uoaotptrfnum: Long) {
    def get(userName: String): FcuoaRow = {
      FcuoaRow(this.id.getOrElse(0), this.uoaubdrfnum, this.uoapurpose, this.uoaotptrfnum, Some(DateTimeUtils.getCurrentTimeStamp), DateTimeUtils.getCurrentTimeStamp, userName, userName)
  	}
  }
  /** GetResult implicit for fetching FcuoaRow objects using plain SQL queries */
  implicit def GetResultFcuoaRow(implicit e0: GR[Long], e1: GR[String], e2: GR[Option[java.sql.Timestamp]], e3: GR[java.sql.Timestamp]): GR[FcuoaRow] = GR{
    prs => import prs._
    FcuoaRow.tupled((<<[Long], <<[Long], <<[String], <<[Long], <<?[java.sql.Timestamp], <<[java.sql.Timestamp], <<[String], <<[String]))
  }
  /** Table description of table FCUOA. Objects of this class serve as prototypes for rows in queries. */
  class Fcuoa(_tableTag: Tag) extends BaseTable[FcuoaRow](_tableTag, "FCUOA") {
    def * = (id, uoaubdrfnum, uoapurpose, uoaotptrfnum, createdate, modifydate, createdby, lastmodifiedby) <> (FcuoaRow.tupled, FcuoaRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(uoaubdrfnum), Rep.Some(uoapurpose), Rep.Some(uoaotptrfnum), createdate, Rep.Some(modifydate), Rep.Some(createdby), Rep.Some(lastmodifiedby)).shaped.<>({r=>import r._; _1.map(_=> FcuoaRow.tupled((_1.get, _2.get, _3.get, _4.get, _5, _6.get, _7.get, _8.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column UOARFNUM SqlType(BIGINT), AutoInc, PrimaryKey */
    override val id: Rep[Long] = column[Long]("UOARFNUM", O.AutoInc, O.PrimaryKey)
    /** Database column UOAUBDRFNUM SqlType(BIGINT) */
    val uoaubdrfnum: Rep[Long] = column[Long]("UOAUBDRFNUM")
    /** Database column UOAPURPOSE SqlType(CHAR), Length(2,false) */
    val uoapurpose: Rep[String] = column[String]("UOAPURPOSE", O.Length(2,varying=false))
    /** Database column UOAOTPTRFNUM SqlType(BIGINT) */
    val uoaotptrfnum: Rep[Long] = column[Long]("UOAOTPTRFNUM")





    /** Foreign key referencing Fcotpt (database name FK_FCUOA_FCOTPT) */
    lazy val fcotptFk = foreignKey("FK_FCUOA_FCOTPT", uoaotptrfnum, Fcotpt)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Fcubd (database name FK_FCUOA_FCUBD) */
    lazy val fcubdFk = foreignKey("FK_FCUOA_FCUBD", uoaubdrfnum, Fcubd)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table Fcuoa */
  lazy val Fcuoa = new TableQuery(tag => new Fcuoa(tag))

  /** Entity class storing rows of table Fcupd
   *  @param updrfnum Database column UPDRFNUM SqlType(BIGINT), AutoInc, PrimaryKey
   *  @param updctc Database column UPDCTC SqlType(CHAR), Length(12,false), Default(None)
   *  @param updfathername Database column UPDFATHERNAME SqlType(VARCHAR), Length(64,true), Default(None)
   *  @param updmothername Database column UPDMOTHERNAME SqlType(VARCHAR), Length(128,true), Default(None)
   *  @param updspousename Database column UPDSPOUSENAME SqlType(VARCHAR), Length(64,true), Default(None)
   *  @param updgardianname Database column UPDGARDIANNAME SqlType(VARCHAR), Length(64,true), Default(None)
   *  @param updcndrltionshprfnum Database column UPDCNDRLTIONSHPRFNUM SqlType(BIGINT), Default(None)
   *  @param updubdrfnum Database column UPDUBDRFNUM SqlType(BIGINT)
   *  @param updemployer Database column UPDEMPLOYER SqlType(VARCHAR), Length(64,true), Default(None)
   *  @param upddesignation Database column UPDDESIGNATION SqlType(VARCHAR), Length(64,true), Default(None)
   *  @param createdate 
   *  @param modifydate 
   *  @param createdby 
   *  @param lastmodifiedby  */
  case class FcupdRow(id: Long, updctc: Option[String] = None, updfathername: Option[String] = None, updmothername: Option[String] = None, updspousename: Option[String] = None, updgardianname: Option[String] = None, updcndrltionshprfnum: Option[Long] = None, updubdrfnum: Long, updemployer: Option[String] = None, upddesignation: Option[String] = None, createdate: Option[java.sql.Timestamp] = None, modifydate: java.sql.Timestamp, createdby: String, lastmodifiedby: String) extends BaseEntity 
  class FcupdRowWrapper(id: Option[Long], updctc: Option[String] = None, updfathername: Option[String] = None, updmothername: Option[String] = None, updspousename: Option[String] = None, updgardianname: Option[String] = None, updcndrltionshprfnum: Option[Long] = None, updubdrfnum: Long, updemployer: Option[String] = None, upddesignation: Option[String] = None) {
    def get(userName: String): FcupdRow = {
      FcupdRow(this.id.getOrElse(0), this.updctc, this.updfathername, this.updmothername, this.updspousename, this.updgardianname, this.updcndrltionshprfnum, this.updubdrfnum, this.updemployer, this.upddesignation, Some(DateTimeUtils.getCurrentTimeStamp), DateTimeUtils.getCurrentTimeStamp, userName, userName)
  	}
  }
  /** GetResult implicit for fetching FcupdRow objects using plain SQL queries */
  implicit def GetResultFcupdRow(implicit e0: GR[Long], e1: GR[Option[String]], e2: GR[Option[Long]], e3: GR[Option[java.sql.Timestamp]], e4: GR[java.sql.Timestamp], e5: GR[String]): GR[FcupdRow] = GR{
    prs => import prs._
    FcupdRow.tupled((<<[Long], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[Long], <<[Long], <<?[String], <<?[String], <<?[java.sql.Timestamp], <<[java.sql.Timestamp], <<[String], <<[String]))
  }
  /** Table description of table FCUPD. Objects of this class serve as prototypes for rows in queries. */
  class Fcupd(_tableTag: Tag) extends BaseTable[FcupdRow](_tableTag, "FCUPD") {
    def * = (id, updctc, updfathername, updmothername, updspousename, updgardianname, updcndrltionshprfnum, updubdrfnum, updemployer, upddesignation, createdate, modifydate, createdby, lastmodifiedby) <> (FcupdRow.tupled, FcupdRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), updctc, updfathername, updmothername, updspousename, updgardianname, updcndrltionshprfnum, Rep.Some(updubdrfnum), updemployer, upddesignation, createdate, Rep.Some(modifydate), Rep.Some(createdby), Rep.Some(lastmodifiedby)).shaped.<>({r=>import r._; _1.map(_=> FcupdRow.tupled((_1.get, _2, _3, _4, _5, _6, _7, _8.get, _9, _10, _11, _12.get, _13.get, _14.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column UPDRFNUM SqlType(BIGINT), AutoInc, PrimaryKey */
    override val id: Rep[Long] = column[Long]("UPDRFNUM", O.AutoInc, O.PrimaryKey)
    /** Database column UPDCTC SqlType(CHAR), Length(12,false), Default(None) */
    val updctc: Rep[Option[String]] = column[Option[String]]("UPDCTC", O.Length(12,varying=false), O.Default(None))
    /** Database column UPDFATHERNAME SqlType(VARCHAR), Length(64,true), Default(None) */
    val updfathername: Rep[Option[String]] = column[Option[String]]("UPDFATHERNAME", O.Length(64,varying=true), O.Default(None))
    /** Database column UPDMOTHERNAME SqlType(VARCHAR), Length(128,true), Default(None) */
    val updmothername: Rep[Option[String]] = column[Option[String]]("UPDMOTHERNAME", O.Length(128,varying=true), O.Default(None))
    /** Database column UPDSPOUSENAME SqlType(VARCHAR), Length(64,true), Default(None) */
    val updspousename: Rep[Option[String]] = column[Option[String]]("UPDSPOUSENAME", O.Length(64,varying=true), O.Default(None))
    /** Database column UPDGARDIANNAME SqlType(VARCHAR), Length(64,true), Default(None) */
    val updgardianname: Rep[Option[String]] = column[Option[String]]("UPDGARDIANNAME", O.Length(64,varying=true), O.Default(None))
    /** Database column UPDCNDRLTIONSHPRFNUM SqlType(BIGINT), Default(None) */
    val updcndrltionshprfnum: Rep[Option[Long]] = column[Option[Long]]("UPDCNDRLTIONSHPRFNUM", O.Default(None))
    /** Database column UPDUBDRFNUM SqlType(BIGINT) */
    val updubdrfnum: Rep[Long] = column[Long]("UPDUBDRFNUM")
    /** Database column UPDEMPLOYER SqlType(VARCHAR), Length(64,true), Default(None) */
    val updemployer: Rep[Option[String]] = column[Option[String]]("UPDEMPLOYER", O.Length(64,varying=true), O.Default(None))
    /** Database column UPDDESIGNATION SqlType(VARCHAR), Length(64,true), Default(None) */
    val upddesignation: Rep[Option[String]] = column[Option[String]]("UPDDESIGNATION", O.Length(64,varying=true), O.Default(None))





    /** Foreign key referencing Fccnd (database name FK_FCUPD_FCCND) */
    lazy val fccndFk = foreignKey("FK_FCUPD_FCCND", updcndrltionshprfnum, Fccnd)(r => Rep.Some(r.id), onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Fcubd (database name FK_FCUPD_FCUBD) */
    lazy val fcubdFk = foreignKey("FK_FCUPD_FCUBD", updubdrfnum, Fcubd)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table Fcupd */
  lazy val Fcupd = new TableQuery(tag => new Fcupd(tag))

  /** Entity class storing rows of table Fcupt
   *  @param uptrfnum Database column UPTRFNUM SqlType(BIGINT), AutoInc, PrimaryKey
   *  @param uptubdrfnum Database column UPTUBDRFNUM SqlType(BIGINT)
   *  @param uptdisable Database column UPTDISABLE SqlType(CHAR), Length(2,false), Default(None)
   *  @param uptitemtype Database column UPTITEMTYPE SqlType(CHAR), Length(2,false), Default(None)
   *  @param createdate 
   *  @param modifydate 
   *  @param createdby 
   *  @param lastmodifiedby  */
  case class FcuptRow(id: Long, uptubdrfnum: Long, uptdisable: Option[String] = None, uptitemtype: Option[String] = None, createdate: Option[java.sql.Timestamp] = None, modifydate: java.sql.Timestamp, createdby: String, lastmodifiedby: String) extends BaseEntity 
  class FcuptRowWrapper(id: Option[Long], uptubdrfnum: Long, uptdisable: Option[String] = None, uptitemtype: Option[String] = None) {
    def get(userName: String): FcuptRow = {
      FcuptRow(this.id.getOrElse(0), this.uptubdrfnum, this.uptdisable, this.uptitemtype, Some(DateTimeUtils.getCurrentTimeStamp), DateTimeUtils.getCurrentTimeStamp, userName, userName)
  	}
  }
  /** GetResult implicit for fetching FcuptRow objects using plain SQL queries */
  implicit def GetResultFcuptRow(implicit e0: GR[Long], e1: GR[Option[String]], e2: GR[Option[java.sql.Timestamp]], e3: GR[java.sql.Timestamp], e4: GR[String]): GR[FcuptRow] = GR{
    prs => import prs._
    FcuptRow.tupled((<<[Long], <<[Long], <<?[String], <<?[String], <<?[java.sql.Timestamp], <<[java.sql.Timestamp], <<[String], <<[String]))
  }
  /** Table description of table FCUPT. Objects of this class serve as prototypes for rows in queries. */
  class Fcupt(_tableTag: Tag) extends BaseTable[FcuptRow](_tableTag, "FCUPT") {
    def * = (id, uptubdrfnum, uptdisable, uptitemtype, createdate, modifydate, createdby, lastmodifiedby) <> (FcuptRow.tupled, FcuptRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(uptubdrfnum), uptdisable, uptitemtype, createdate, Rep.Some(modifydate), Rep.Some(createdby), Rep.Some(lastmodifiedby)).shaped.<>({r=>import r._; _1.map(_=> FcuptRow.tupled((_1.get, _2.get, _3, _4, _5, _6.get, _7.get, _8.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column UPTRFNUM SqlType(BIGINT), AutoInc, PrimaryKey */
    override val id: Rep[Long] = column[Long]("UPTRFNUM", O.AutoInc, O.PrimaryKey)
    /** Database column UPTUBDRFNUM SqlType(BIGINT) */
    val uptubdrfnum: Rep[Long] = column[Long]("UPTUBDRFNUM")
    /** Database column UPTDISABLE SqlType(CHAR), Length(2,false), Default(None) */
    val uptdisable: Rep[Option[String]] = column[Option[String]]("UPTDISABLE", O.Length(2,varying=false), O.Default(None))
    /** Database column UPTITEMTYPE SqlType(CHAR), Length(2,false), Default(None) */
    val uptitemtype: Rep[Option[String]] = column[Option[String]]("UPTITEMTYPE", O.Length(2,varying=false), O.Default(None))





    /** Foreign key referencing Fcubd (database name FK_FCUPT_FCUBD) */
    lazy val fcubdFk = foreignKey("FK_FCUPT_FCUBD", uptubdrfnum, Fcubd)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table Fcupt */
  lazy val Fcupt = new TableQuery(tag => new Fcupt(tag))

  /** Entity class storing rows of table Fcurp
   *  @param urprfnum Database column URPRFNUM SqlType(BIGINT), AutoInc, PrimaryKey
   *  @param urpubdrfnum Database column URPUBDRFNUM SqlType(BIGINT)
   *  @param urpqmtrfnum Database column URPQMTRFNUM SqlType(BIGINT)
   *  @param urpanswer Database column URPANSWER SqlType(CHAR), Length(32,false)
   *  @param urpmark Database column URPMARK SqlType(DOUBLE)
   *  @param createdate 
   *  @param modifydate 
   *  @param createdby 
   *  @param lastmodifiedby  */
  case class FcurpRow(id: Long, urpubdrfnum: Long, urpqmtrfnum: Long, urpanswer: String, urpmark: Double, createdate: Option[java.sql.Timestamp] = None, modifydate: java.sql.Timestamp, createdby: String, lastmodifiedby: String) extends BaseEntity 
  class FcurpRowWrapper(id: Option[Long], urpubdrfnum: Long, urpqmtrfnum: Long, urpanswer: String, urpmark: Double) {
    def get(userName: String): FcurpRow = {
      FcurpRow(this.id.getOrElse(0), this.urpubdrfnum, this.urpqmtrfnum, this.urpanswer, this.urpmark, Some(DateTimeUtils.getCurrentTimeStamp), DateTimeUtils.getCurrentTimeStamp, userName, userName)
  	}
  }
  /** GetResult implicit for fetching FcurpRow objects using plain SQL queries */
  implicit def GetResultFcurpRow(implicit e0: GR[Long], e1: GR[String], e2: GR[Double], e3: GR[Option[java.sql.Timestamp]], e4: GR[java.sql.Timestamp]): GR[FcurpRow] = GR{
    prs => import prs._
    FcurpRow.tupled((<<[Long], <<[Long], <<[Long], <<[String], <<[Double], <<?[java.sql.Timestamp], <<[java.sql.Timestamp], <<[String], <<[String]))
  }
  /** Table description of table FCURP. Objects of this class serve as prototypes for rows in queries. */
  class Fcurp(_tableTag: Tag) extends BaseTable[FcurpRow](_tableTag, "FCURP") {
    def * = (id, urpubdrfnum, urpqmtrfnum, urpanswer, urpmark, createdate, modifydate, createdby, lastmodifiedby) <> (FcurpRow.tupled, FcurpRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(urpubdrfnum), Rep.Some(urpqmtrfnum), Rep.Some(urpanswer), Rep.Some(urpmark), createdate, Rep.Some(modifydate), Rep.Some(createdby), Rep.Some(lastmodifiedby)).shaped.<>({r=>import r._; _1.map(_=> FcurpRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6, _7.get, _8.get, _9.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column URPRFNUM SqlType(BIGINT), AutoInc, PrimaryKey */
    override val id: Rep[Long] = column[Long]("URPRFNUM", O.AutoInc, O.PrimaryKey)
    /** Database column URPUBDRFNUM SqlType(BIGINT) */
    val urpubdrfnum: Rep[Long] = column[Long]("URPUBDRFNUM")
    /** Database column URPQMTRFNUM SqlType(BIGINT) */
    val urpqmtrfnum: Rep[Long] = column[Long]("URPQMTRFNUM")
    /** Database column URPANSWER SqlType(CHAR), Length(32,false) */
    val urpanswer: Rep[String] = column[String]("URPANSWER", O.Length(32,varying=false))
    /** Database column URPMARK SqlType(DOUBLE) */
    val urpmark: Rep[Double] = column[Double]("URPMARK")





    /** Foreign key referencing Fcqmt (database name FK_FCURP_FCQMT) */
    lazy val fcqmtFk = foreignKey("FK_FCURP_FCQMT", urpqmtrfnum, Fcqmt)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Fcubd (database name FK_FCURP_FCUBD) */
    lazy val fcubdFk = foreignKey("FK_FCURP_FCUBD", urpubdrfnum, Fcubd)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table Fcurp */
  lazy val Fcurp = new TableQuery(tag => new Fcurp(tag))

  /** Entity class storing rows of table Fcvlog
   *  @param vlogrfnum Database column VLOGRFNUM SqlType(BIGINT), AutoInc, PrimaryKey
   *  @param vlogconnect Database column VLOGCONNECT SqlType(CHAR), Length(2,false)
   *  @param vlogdatetime Database column VLOGDATETIME SqlType(TIMESTAMP), Default(None)
   *  @param vlogpositionlong Database column VLOGPOSITIONLONG SqlType(DECIMAL), Default(None)
   *  @param vlogpositionlatt Database column VLOGPOSITIONLATT SqlType(DECIMAL), Default(None)
   *  @param vlogcallingdetails Database column VLOGCALLINGDETAILS SqlType(VARCHAR), Length(50,true), Default(None)
   *  @param vlogstatus Database column VLOGSTATUS SqlType(CHAR), Length(2,false)
   *  @param vlogipvrfnum Database column VLOGIPVRFNUM SqlType(BIGINT)
   *  @param vlogamtaddressrfnum Database column VLOGAMTADDRESSRFNUM SqlType(BIGINT)
   *  @param vlogubdipvpersonrfnum Database column VLOGUBDIPVPERSONRFNUM SqlType(BIGINT)
   *  @param vlogvideopath Database column VLOGVIDEOPATH SqlType(VARCHAR), Length(264,true), Default(None)
   *  @param vlogcomment Database column VLOGCOMMENT SqlType(VARCHAR), Length(264,true), Default(None)
   *  @param createdate 
   *  @param modifydate 
   *  @param createdby 
   *  @param lastmodifiedby  */
  case class FcvlogRow(id: Long, vlogconnect: String, vlogdatetime: Option[java.sql.Timestamp] = None, vlogpositionlong: Option[scala.math.BigDecimal] = None, vlogpositionlatt: Option[scala.math.BigDecimal] = None, vlogcallingdetails: Option[String] = None, vlogstatus: String, vlogipvrfnum: Long, vlogamtaddressrfnum: Long, vlogubdipvpersonrfnum: Long, vlogvideopath: Option[String] = None, vlogcomment: Option[String] = None, createdate: Option[java.sql.Timestamp] = None, modifydate: java.sql.Timestamp, createdby: String, lastmodifiedby: String) extends BaseEntity 
  class FcvlogRowWrapper(id: Option[Long], vlogconnect: String, vlogdatetime: Option[java.sql.Timestamp] = None, vlogpositionlong: Option[scala.math.BigDecimal] = None, vlogpositionlatt: Option[scala.math.BigDecimal] = None, vlogcallingdetails: Option[String] = None, vlogstatus: String, vlogipvrfnum: Long, vlogamtaddressrfnum: Long, vlogubdipvpersonrfnum: Long, vlogvideopath: Option[String] = None, vlogcomment: Option[String] = None) {
    def get(userName: String): FcvlogRow = {
      FcvlogRow(this.id.getOrElse(0), this.vlogconnect, this.vlogdatetime, this.vlogpositionlong, this.vlogpositionlatt, this.vlogcallingdetails, this.vlogstatus, this.vlogipvrfnum, this.vlogamtaddressrfnum, this.vlogubdipvpersonrfnum, this.vlogvideopath, this.vlogcomment, Some(DateTimeUtils.getCurrentTimeStamp), DateTimeUtils.getCurrentTimeStamp, userName, userName)
  	}
  }
  /** GetResult implicit for fetching FcvlogRow objects using plain SQL queries */
  implicit def GetResultFcvlogRow(implicit e0: GR[Long], e1: GR[String], e2: GR[Option[java.sql.Timestamp]], e3: GR[Option[scala.math.BigDecimal]], e4: GR[Option[String]], e5: GR[java.sql.Timestamp]): GR[FcvlogRow] = GR{
    prs => import prs._
    FcvlogRow.tupled((<<[Long], <<[String], <<?[java.sql.Timestamp], <<?[scala.math.BigDecimal], <<?[scala.math.BigDecimal], <<?[String], <<[String], <<[Long], <<[Long], <<[Long], <<?[String], <<?[String], <<?[java.sql.Timestamp], <<[java.sql.Timestamp], <<[String], <<[String]))
  }
  /** Table description of table FCVLOG. Objects of this class serve as prototypes for rows in queries. */
  class Fcvlog(_tableTag: Tag) extends BaseTable[FcvlogRow](_tableTag, "FCVLOG") {
    def * = (id, vlogconnect, vlogdatetime, vlogpositionlong, vlogpositionlatt, vlogcallingdetails, vlogstatus, vlogipvrfnum, vlogamtaddressrfnum, vlogubdipvpersonrfnum, vlogvideopath, vlogcomment, createdate, modifydate, createdby, lastmodifiedby) <> (FcvlogRow.tupled, FcvlogRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(vlogconnect), vlogdatetime, vlogpositionlong, vlogpositionlatt, vlogcallingdetails, Rep.Some(vlogstatus), Rep.Some(vlogipvrfnum), Rep.Some(vlogamtaddressrfnum), Rep.Some(vlogubdipvpersonrfnum), vlogvideopath, vlogcomment, createdate, Rep.Some(modifydate), Rep.Some(createdby), Rep.Some(lastmodifiedby)).shaped.<>({r=>import r._; _1.map(_=> FcvlogRow.tupled((_1.get, _2.get, _3, _4, _5, _6, _7.get, _8.get, _9.get, _10.get, _11, _12, _13, _14.get, _15.get, _16.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column VLOGRFNUM SqlType(BIGINT), AutoInc, PrimaryKey */
    override val id: Rep[Long] = column[Long]("VLOGRFNUM", O.AutoInc, O.PrimaryKey)
    /** Database column VLOGCONNECT SqlType(CHAR), Length(2,false) */
    val vlogconnect: Rep[String] = column[String]("VLOGCONNECT", O.Length(2,varying=false))
    /** Database column VLOGDATETIME SqlType(TIMESTAMP), Default(None) */
    val vlogdatetime: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("VLOGDATETIME", O.Default(None))
    /** Database column VLOGPOSITIONLONG SqlType(DECIMAL), Default(None) */
    val vlogpositionlong: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("VLOGPOSITIONLONG", O.Default(None))
    /** Database column VLOGPOSITIONLATT SqlType(DECIMAL), Default(None) */
    val vlogpositionlatt: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("VLOGPOSITIONLATT", O.Default(None))
    /** Database column VLOGCALLINGDETAILS SqlType(VARCHAR), Length(50,true), Default(None) */
    val vlogcallingdetails: Rep[Option[String]] = column[Option[String]]("VLOGCALLINGDETAILS", O.Length(50,varying=true), O.Default(None))
    /** Database column VLOGSTATUS SqlType(CHAR), Length(2,false) */
    val vlogstatus: Rep[String] = column[String]("VLOGSTATUS", O.Length(2,varying=false))
    /** Database column VLOGIPVRFNUM SqlType(BIGINT) */
    val vlogipvrfnum: Rep[Long] = column[Long]("VLOGIPVRFNUM")
    /** Database column VLOGAMTADDRESSRFNUM SqlType(BIGINT) */
    val vlogamtaddressrfnum: Rep[Long] = column[Long]("VLOGAMTADDRESSRFNUM")
    /** Database column VLOGUBDIPVPERSONRFNUM SqlType(BIGINT) */
    val vlogubdipvpersonrfnum: Rep[Long] = column[Long]("VLOGUBDIPVPERSONRFNUM")
    /** Database column VLOGVIDEOPATH SqlType(VARCHAR), Length(264,true), Default(None) */
    val vlogvideopath: Rep[Option[String]] = column[Option[String]]("VLOGVIDEOPATH", O.Length(264,varying=true), O.Default(None))
    /** Database column VLOGCOMMENT SqlType(VARCHAR), Length(264,true), Default(None) */
    val vlogcomment: Rep[Option[String]] = column[Option[String]]("VLOGCOMMENT", O.Length(264,varying=true), O.Default(None))





    /** Foreign key referencing Fcamt (database name FK_FCVLOG_FCAMT) */
    lazy val fcamtFk = foreignKey("FK_FCVLOG_FCAMT", vlogamtaddressrfnum, Fcamt)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Fcipv (database name FK_FCVLOG_FCIPV) */
    lazy val fcipvFk = foreignKey("FK_FCVLOG_FCIPV", vlogipvrfnum, Fcipv)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Fcubd (database name FK_FCVLOG_FCUBD) */
    lazy val fcubdFk = foreignKey("FK_FCVLOG_FCUBD", vlogubdipvpersonrfnum, Fcubd)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table Fcvlog */
  lazy val Fcvlog = new TableQuery(tag => new Fcvlog(tag))

  /** Entity class storing rows of table Fcxlt
   *  @param xltrfnum Database column XLTRFNUM SqlType(BIGINT), AutoInc, PrimaryKey
   *  @param xltisrequest Database column XLTISREQUEST SqlType(CHAR), Length(2,false)
   *  @param xltxml Database column XLTXML SqlType(TEXT), Default(None)
   *  @param xltimtrfnum Database column XLTIMTRFNUM SqlType(BIGINT)
   *  @param xltintgratid Database column XLTINTGRATID SqlType(VARCHAR), Length(16,true), Default(None)
   *  @param createdate 
   *  @param modifydate 
   *  @param createdby 
   *  @param lastmodifiedby  */
  case class FcxltRow(id: Long, xltisrequest: String, xltxml: Option[String] = None, xltimtrfnum: Long, xltintgratid: Option[String] = None, createdate: Option[java.sql.Timestamp] = None, modifydate: java.sql.Timestamp, createdby: String, lastmodifiedby: String) extends BaseEntity 
  class FcxltRowWrapper(id: Option[Long], xltisrequest: String, xltxml: Option[String] = None, xltimtrfnum: Long, xltintgratid: Option[String] = None) {
    def get(userName: String): FcxltRow = {
      FcxltRow(this.id.getOrElse(0), this.xltisrequest, this.xltxml, this.xltimtrfnum, this.xltintgratid, Some(DateTimeUtils.getCurrentTimeStamp), DateTimeUtils.getCurrentTimeStamp, userName, userName)
  	}
  }
  /** GetResult implicit for fetching FcxltRow objects using plain SQL queries */
  implicit def GetResultFcxltRow(implicit e0: GR[Long], e1: GR[String], e2: GR[Option[String]], e3: GR[Option[java.sql.Timestamp]], e4: GR[java.sql.Timestamp]): GR[FcxltRow] = GR{
    prs => import prs._
    FcxltRow.tupled((<<[Long], <<[String], <<?[String], <<[Long], <<?[String], <<?[java.sql.Timestamp], <<[java.sql.Timestamp], <<[String], <<[String]))
  }
  /** Table description of table FCXLT. Objects of this class serve as prototypes for rows in queries. */
  class Fcxlt(_tableTag: Tag) extends BaseTable[FcxltRow](_tableTag, "FCXLT") {
    def * = (id, xltisrequest, xltxml, xltimtrfnum, xltintgratid, createdate, modifydate, createdby, lastmodifiedby) <> (FcxltRow.tupled, FcxltRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(xltisrequest), xltxml, Rep.Some(xltimtrfnum), xltintgratid, createdate, Rep.Some(modifydate), Rep.Some(createdby), Rep.Some(lastmodifiedby)).shaped.<>({r=>import r._; _1.map(_=> FcxltRow.tupled((_1.get, _2.get, _3, _4.get, _5, _6, _7.get, _8.get, _9.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column XLTRFNUM SqlType(BIGINT), AutoInc, PrimaryKey */
    override val id: Rep[Long] = column[Long]("XLTRFNUM", O.AutoInc, O.PrimaryKey)
    /** Database column XLTISREQUEST SqlType(CHAR), Length(2,false) */
    val xltisrequest: Rep[String] = column[String]("XLTISREQUEST", O.Length(2,varying=false))
    /** Database column XLTXML SqlType(TEXT), Default(None) */
    val xltxml: Rep[Option[String]] = column[Option[String]]("XLTXML", O.Default(None))
    /** Database column XLTIMTRFNUM SqlType(BIGINT) */
    val xltimtrfnum: Rep[Long] = column[Long]("XLTIMTRFNUM")
    /** Database column XLTINTGRATID SqlType(VARCHAR), Length(16,true), Default(None) */
    val xltintgratid: Rep[Option[String]] = column[Option[String]]("XLTINTGRATID", O.Length(16,varying=true), O.Default(None))





    /** Foreign key referencing Fcimt (database name FK_FCXLT_FCIMT) */
    lazy val fcimtFk = foreignKey("FK_FCXLT_FCIMT", xltimtrfnum, Fcimt)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table Fcxlt */
  lazy val Fcxlt = new TableQuery(tag => new Fcxlt(tag))
}
