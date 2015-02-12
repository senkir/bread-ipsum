package controllers

import play.api._
import play.api.mvc._

object Application extends Controller {

  def index = Action {
    // Ok(Scalate.render("index.scaml", Map("message"->"hello"))
    Ok(views.html.index("Your new application is ready."))
  }

}
