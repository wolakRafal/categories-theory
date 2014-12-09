name := "categories-theory"

version := "1.0"

libraryDependencies += "org.scalatest" % "scalatest_2.11" % "2.2.1" % "test"

libraryDependencies ++= Seq(
  "org.specs2" %% "specs2-core" % "2.4.14" % "test"
)

libraryDependencies += "org.scalacheck" %% "scalacheck" % "1.12.1" % "test"