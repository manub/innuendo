package net.manub.innuendo

import org.scalatest.{Matchers, FlatSpec}
import spray.testkit.ScalatestRouteTest

class EverywhereRouteSpec extends FlatSpec with Matchers with InnuendoService with ScalatestRouteTest {

  override def actorRefFactory = system

  "Innuendo service" should "return I'm everywhere for a GET /" in {
    Get() ~> route ~> check {
      responseAs[String] should be("I'm everywhere")
    }
  }

  it should "return I'm everywhere for a GET on a different path" in {
    Get() ~> route ~> check {
      responseAs[String] should be("I'm everywhere")
    }
  }

}
