val scala3Version = "3.2.2"

lazy val root = project
  .in(file("."))
  .settings(
    name := "cats-effect-tutorial",
    version := "3.4.10",

    scalaVersion := scala3Version,

    libraryDependencies += "org.scalameta" %% "munit" % "0.7.29" % Test,
    libraryDependencies += "org.typelevel" %% "cats-effect" % "3.4.10" withSources() withJavadoc(),

    scalacOptions ++= Seq(
      "-feature",
      "-deprecation",
      "-unchecked",
      "-language:postfixOps"
    )
  )
