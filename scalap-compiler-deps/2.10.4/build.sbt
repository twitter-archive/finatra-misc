import sbt.Keys._

scalaVersion := "2.10.4"

lazy val root = (project in file(".")).
  settings(
    libraryDependencies ++= Seq(
      "org.scala-lang" % "scala-reflect" % "2.10.4"
    ),
    version := "2.0.0",
    resolvers ++= Seq(),
    publishMavenStyle := true,
    publishTo := Some(Resolver.file("file", new File("/Users/scosenza/workspace/finatra"))),
    licenses := Seq("Apache 2.0" -> url("http://www.apache.org/licenses/LICENSE-2.0")),
    homepage := Some(url("https://github.com/twitter/finatra")),
    organization := "com.twitter.finatra",
    moduleName := "finatra-scalap-compiler-deps")