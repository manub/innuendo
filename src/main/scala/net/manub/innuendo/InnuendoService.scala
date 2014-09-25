package net.manub.innuendo

import akka.actor.Actor
import net.manub.innuendo.model.Stub
import spray.routing.HttpService

class InnuendoServiceActor extends Actor with InnuendoService {
  def actorRefFactory = context
  def receive = runRoute(route)
}

trait InnuendoService extends HttpService {

  val route = {

    import net.manub.innuendo.model.StubJsonProtocol._
    import spray.httpx.SprayJsonSupport._

    pathPrefix("__admin") {
      path("stubs") {
        get {
          ctx =>
            ctx.complete {
              List[Stub]()
            }
        }
      }
    } ~
      pathPrefix("") {
        get {
          complete {
            "I'm everywhere"
          }
        }
      }
  }

}
