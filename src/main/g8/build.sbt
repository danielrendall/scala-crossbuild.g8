lazy val scala211 = "2.11.12"
lazy val scala212 = "2.12.15"
lazy val scala213 = "2.13.6"
lazy val supportedScalaVersions = List(scala213, scala212, scala211)

import Dependencies._

Global / onChangedBuildSource := ReloadOnSourceChanges

ThisBuild / scalaVersion     := scala213
ThisBuild / organization     := "uk.co.danielrendall"
ThisBuild / organizationName := "$name;format="Camel"$"

githubOwner := "danielrendall"
githubRepository := "$name;format="Camel"$"
githubTokenSource := TokenSource.Environment("GITHUB_TOKEN")
releaseCrossBuild := true

lazy val root = (project in file("."))
  .settings(
    name := "$name;format="normalize"$",
    crossScalaVersions := supportedScalaVersions,
    libraryDependencies ++= Seq(
      specs2 % Test
    )
  )
