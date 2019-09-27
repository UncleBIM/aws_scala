name := "aws_scala"
version := "0.1"
scalaVersion := "2.13.1"

libraryDependencies ++= Seq(
  "com.amazonaws" % "aws-lambda-java-events" % "2.2.6",
  "com.amazonaws" % "aws-lambda-java-core" % "1.2.0"
)

assemblyJarName in assembly := "aws_scala.jar"



