name := "scala-benchs"

version := "0.1"

scalaVersion := "2.13.5"

idePackagePrefix := Some("io.github.oybek")

libraryDependencies ++= Seq(
  "com.storm-enroute" %% "scalameter" % "0.20" % Test
)
