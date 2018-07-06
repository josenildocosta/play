name := """playtce"""
organization := "br.com.playtce"

version := "1.0-SNAPSHOT"


scalaVersion := "2.12.4"

libraryDependencies += guice
libraryDependencies += jdbc
libraryDependencies += "org.postgresql" % "postgresql" % "9.3-1102-jdbc4"
libraryDependencies ++= Seq(evolutions, jdbc)

lazy val root = (project in file(".")).enablePlugins(PlayJava, PlayEbean)
