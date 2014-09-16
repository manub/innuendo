package net.manub.innuendo

import akka.actor.Actor
import spray.routing.HttpService

class InnuendoServiceActor extends Actor with InnuendoService {

  def actorRefFactory = context
  def receive = runRoute(route)

}

trait InnuendoService extends HttpService {

  val route = {
    pathPrefix("") {
      get {
        complete {
          "I'm everywhere"
        }
      }
    }
  }

}
