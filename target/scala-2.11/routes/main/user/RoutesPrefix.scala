
// @GENERATOR:play-routes-compiler
// @SOURCE:D:/workspace/fincash-backend/conf/user.routes
// @DATE:Thu Apr 20 15:53:39 IST 2017


package user {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
