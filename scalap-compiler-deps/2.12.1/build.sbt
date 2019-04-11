import sbt.Keys._

scalaVersion := "2.12.1"

publishMavenStyle := true
publishArtifact := true
publishArtifact in Test := true
publishArtifact in (Compile, packageDoc) := true
publishArtifact in (Test, packageDoc) := true
pomIncludeRepository := { _ => false }
publishTo := {
    val nexus = "https://oss.sonatype.org/"
    Some("releases" at nexus + "service/local/staging/deploy/maven2")
}
licenses := Seq("Apache 2.0" -> url("https://www.apache.org/licenses/LICENSE-2.0"))
homepage := Some(url("https://github.com/twitter/finatra"))
autoAPIMappings := true
apiURL := Some(url("https://twitter.github.io/finatra/docs/"))
pomExtra := (
<scm>
  <url>git://github.com/twitter/finatra.git</url>
  <connection>scm:git://github.com/twitter/finatra.git</connection>
</scm>
<developers>
  <developer>
    <id>twitter</id>
    <name>Twitter Inc.</name>
    <url>https://www.twitter.com/</url>
  </developer>
</developers>
)

lazy val root = (project in file(".")).
  settings(
    libraryDependencies ++= Seq(
      "org.scala-lang" % "scala-reflect" % "2.12.1"
    ),
    version := "2.0.0",
    resolvers ++= Seq(),
    organization := "com.twitter.finatra",
    moduleName := "finatra-scalap-compiler-deps")
