// See README.md for license details.

ThisBuild / scalaVersion := "2.12.13"
ThisBuild / version := "0.1.0"
ThisBuild / organization := "com.github.kaduv"

val chiselVersion = "3.5.1"

lazy val root = (project in file("."))
  .settings(
    name := "SPI",
    libraryDependencies ++= Seq(
      "edu.berkeley.cs" %% "chisel3" % chiselVersion,
      "edu.berkeley.cs" %% "chiseltest" % "0.5.1" % "test"
    ),
    scalacOptions ++= Seq(
      "-language:reflectiveCalls",
      "-deprecation",
      "-feature",
      "-Xcheckinit",
      "-P:chiselplugin:genBundleElements"
    ),
    addCompilerPlugin(
      "edu.berkeley.cs" % "chisel3-plugin" % chiselVersion cross CrossVersion.full
    )
  )
