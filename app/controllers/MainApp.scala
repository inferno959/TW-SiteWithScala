package controllers

import play.api.mvc.{Request,Action,Controller}

object MainController extends Controller {
	def index = Action {
		Ok(views.html.index("Malcolm Thirus Home Page"))
	}
}