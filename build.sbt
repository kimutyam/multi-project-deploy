

lazy val commonSettings = Seq(
  name := "multi-project-deploy",
  version := "0.1",
  scalaVersion := "2.13.2"
)

lazy val angel: Project = project.in(file("angel")).settings(commonSettings)

lazy val devil: Project = project.in(file("devil")).settings(commonSettings)

