seq(webSettings :_*)

scalaVersion := "2.8.1"

libraryDependencies ++= Seq(
    "net.liftweb" %% "lift-webkit" % "2.4-M1" % "compile",
    "net.liftweb" %% "lift-widgets" % "2.4-M1" % "compile",
    "net.liftweb" %% "lift-wizard" % "2.4-M1" % "compile",
    "net.liftweb" %% "lift-textile" % "2.4-M1" % "compile",
    "net.liftweb" %% "lift-mapper" % "2.4-M1" % "compile",
    "org.mortbay.jetty" % "jetty" % "6.1.22" % "container",
    "junit" % "junit" % "4.5" % "test",
    "ch.qos.logback" % "logback-classic" % "0.9.26",
    "org.scala-tools.testing" %% "specs" % "1.6.6" % "test",
    "com.h2database" % "h2" % "1.2.138"
)
