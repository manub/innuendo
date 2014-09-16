package net.manub.innuendo

import akka.actor.{ActorSystem, Props}
import akka.io.IO
import spray.can.Http

object RoutingApp extends App {

  implicit val system = ActorSystem("innuendo-actor-system")

  val service = system.actorOf(Props[InnuendoServiceActor], "innuendo-service")

  IO(Http) ! Http.Bind(service, "localhost", port = 8080)
}
