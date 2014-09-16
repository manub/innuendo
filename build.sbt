name := "innuendo"

version := "0.1-SNAPSHOT"

scalaVersion := "2.11.2"

resolvers += "spray repo" at "http://repo.spray.io"

val sprayVersion = "1.3.1"
val akkaVersion = "2.3.5"

libraryDependencies ++= Seq(
  "io.spray" %% "spray-can" % sprayVersion,
  "io.spray" %% "spray-routing" % sprayVersion,
  "com.typesafe.akka" %% "akka-actor" % akkaVersion,
  "io.spray" %% "spray-testkit" % sprayVersion % "test",
  "org.scalatest" %% "scalatest" % "2.2.2" % "test"
)