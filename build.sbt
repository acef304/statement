name := "Statement parser"

version := "0.0.1"

scalaVersion := "2.12.0"

oneJarSettings

mainClass := Some("org.acef304.Launcher")

libraryDependencies ++= Seq(
  "org.scalatest" % "scalatest_2.11" % "3.0.1" % "test",
  "org.sameersingh.scalaplot" % "scalaplot" % "0.0.4"
  //"ch.qos.logback" %  "logback-classic" % "1.1.6",
)
    
