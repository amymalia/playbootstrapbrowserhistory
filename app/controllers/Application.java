package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.Index;
import views.html.ie;
import views.html.ff;
import views.html.chrome;

/**
 * Provides controllers for this application.
 */
public class Application extends Controller {

  /**
   * Returns the home page.
   * @return The resulting home page.
   */
  public static Result index() {
    return ok(Index.render("Welcome to the home page."));
  }

  /**
   * Returns the ie page.
   * @return The resulting ie page.
   */
  public static Result ie() {
    return ok(ie.render("Welcome to the home page."));
  }

  /**
   * Returns the ff page.
   * @return The resulting ff page.
   */
  public static Result ff() {
    return ok(ff.render("Welcome to the home page."));
  }

  /**
   * Returns the chrome page.
   * @return The resulting chrome page.
   */
  public static Result chrome() {
    return ok(chrome.render("Welcome to the home page."));
  }


}
