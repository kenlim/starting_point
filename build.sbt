seq(webSettings :_*)

scalaVersion := "2.8.1"

libraryDependencies ++= Seq(
    "net.liftweb" %% "lift-webkit" % "2.4-M1" % "compile",
    "net.liftweb" %% "lift-mapper" % "2.4-M1" % "compile",
    "org.eclipse.jetty" % "jetty-webapp" % "7.3.0.v20110203" % "jetty",
    "junit" % "junit" % "4.5" % "test",
    "ch.qos.logback" % "logback-classic" % "0.9.26",
    "org.scala-tools.testing" %% "specs" % "1.6.6" % "test",
    "com.h2database" % "h2" % "1.2.138"
)