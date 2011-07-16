// project name
name := "project-euler-scala"

// project version
version := "11"

logLevel := Level.Info

// version of Scala to compile with
scalaVersion := "2.9.0-1"

libraryDependencies ++= Seq(
  "junit" % "junit" % "4.8.2" % "test",
  "org.scala-tools.testing" %% "specs" % "1.6.8" % "test",
  "org.scalatest" % "scalatest_2.9.0" % "1.6.1" % "test"
)


scalacOptions += "-deprecation"

scalacOptions += "-optimise"

