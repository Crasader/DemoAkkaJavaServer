name := """DemoAkkaJavaServer"""

version := "1.1"

scalaVersion := "2.11.6"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-remote" % "2.3.11"
)

fork in run := true