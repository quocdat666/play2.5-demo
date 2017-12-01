name := "play2.5-demo"
organization := "Framgia"
version := "1.0-SNAPSHOT"
scalaVersion := "2.11.11"

lazy val root = (project in file(".")).enablePlugins(PlayJava, PlayEbean)

libraryDependencies ++= Seq(
  jdbc,
  filters,
  evolutions,
  javaJdbc % Test,
  "org.awaitility" % "awaitility" % "2.0.0" % Test,
  "org.assertj" % "assertj-core" % "3.6.2" % Test,
  "org.mockito" % "mockito-core" % "2.1.0" % Test,
  "mysql" % "mysql-connector-java" % "5.1.41",
  //"com.adrianhurt" %% "play-bootstrap" % "1.2-P25-B3",
  "org.webjars" % "bootstrap" % "3.3.7-1" exclude("org.webjars", "jquery"),
  "org.webjars" % "jquery" % "3.2.1",
  "org.webjars" % "font-awesome" % "4.7.0",
  "be.objectify" %% "deadbolt-java" % "2.5.6",
  "commons-beanutils" % "commons-beanutils" % "1.9.3"
)

testOptions in Test += Tests.Argument(TestFrameworks.JUnit, "-a", "-v")
