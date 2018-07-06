// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/jcosta/eclipse-workspace/playtce/conf/routes
// @DATE:Fri Jul 06 11:57:04 GMT-03:00 2018

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseHomeController HomeController = new controllers.ReverseHomeController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReversePessoaController PessoaController = new controllers.ReversePessoaController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseHomeController HomeController = new controllers.javascript.ReverseHomeController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReversePessoaController PessoaController = new controllers.javascript.ReversePessoaController(RoutesPrefix.byNamePrefix());
  }

}
