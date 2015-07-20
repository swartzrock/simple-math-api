organization := "oscon"
name := "mathapi"
version := "0.0.1-SNAPSHOT"
scalaVersion := "2.11.6"

resolvers += "Scalaz Bintray Repo" at "http://dl.bintray.com/scalaz/releases"

libraryDependencies ++= Seq(
  "org.http4s" %% "http4s-blazeserver" % "0.8.4",
  "org.http4s" %% "http4s-dsl"         % "0.8.4",
  "org.http4s" %% "http4s-argonaut"    % "0.8.4"
)
