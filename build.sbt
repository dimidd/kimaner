name := "recogito-plugin-ner-kima"

organization := "org.pelagios"

version := "0.1"

scalaVersion := "2.11.11"

// Do not append Scala versions to the generated artifacts
crossPaths := false

// This forbids including Scala related libraries into the dependency
autoScalaLibrary := false

/** Runtime dependencies **/
libraryDependencies ++= Seq(
  "org.pelagios" % "recogito-plugin-sdk" % "1.0" from "https://github.com/pelagios/recogito2-plugin-sdk/releases/download/v1.0/recogito-plugin-sdk-1.0.jar"
)

/** Test dependencies **/
libraryDependencies ++= Seq(
  "junit" % "junit" % "4.11" % Test,
  "com.novocode" % "junit-interface" % "0.11" % Test
        exclude("junit", "junit-dep")
)
