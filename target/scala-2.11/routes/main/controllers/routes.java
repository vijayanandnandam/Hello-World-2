
// @GENERATOR:play-routes-compiler
// @SOURCE:D:/workspace/fincash-backend/conf/user.routes
// @DATE:Thu Apr 20 15:53:39 IST 2017

package controllers;

import user.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseLoginController LoginController = new controllers.ReverseLoginController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseKYCController KYCController = new controllers.ReverseKYCController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseUserController UserController = new controllers.ReverseUserController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseLoginController LoginController = new controllers.javascript.ReverseLoginController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseKYCController KYCController = new controllers.javascript.ReverseKYCController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseUserController UserController = new controllers.javascript.ReverseUserController(RoutesPrefix.byNamePrefix());
  }

}
