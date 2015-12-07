// Plugins are defined here
// Use the Play sbt plugin for Play projects
addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.3.10")

// This plugin adds forked run capabilities to Play projects which is needed for Activator.
addSbtPlugin("com.typesafe.play" % "sbt-fork-run-plugin" % "2.3.10")

// This plugin is required for Heroku
addSbtPlugin("com.heroku" % "sbt-heroku" % "0.5.1")

dependencyOverrides += "org.scala-sbt" % "sbt" % "0.13.9"