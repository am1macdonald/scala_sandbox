val scala3Version = "3.2.2"

lazy val root = project
  .in(file("."))
  .settings(
    name := "cats_effect_00",
    version := "0.1.0-SNAPSHOT",

    scalaVersion := scala3Version,

    libraryDependencies += "org.scalameta" %% "munit" % "0.7.29" % Test,
    libraryDependencies += "org.typelevel" %% "cats-effect" % "3.4.10",
    libraryDependencies += "org.typelevel" %% "munit-cats-effect-3" % "1.0.6" % Test

  )
