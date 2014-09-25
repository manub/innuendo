package net.manub.innuendo

import org.scalatest.{FlatSpec, Matchers}
import spray.http.ContentTypes
import spray.testkit.ScalatestRouteTest

class AdminServiceSpec extends FlatSpec with Matchers with InnuendoService with ScalatestRouteTest {

  override def actorRefFactory = system

  "GET /__admin/stubs" should "return a list of empty stubs" in {
    Get("/__admin/stubs") ~> route ~> check {
      contentType shouldBe ContentTypes.`application/json`
      responseAs[String] shouldBe "[]"
    }
  }

}
