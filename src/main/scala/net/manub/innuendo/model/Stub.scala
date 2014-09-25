package net.manub.innuendo.model

import spray.json.DefaultJsonProtocol

case class Stub(request: String, response: String)

object StubJsonProtocol extends DefaultJsonProtocol {
  implicit val stubFormat = jsonFormat2(Stub)
}