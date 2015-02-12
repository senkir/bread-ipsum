name := """bread-ipsum"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala, net.litola.SassPlugin)

scalaVersion := "2.11.1"

libraryDependencies ++= Seq(
  jdbc,
  anorm,
  cache,
  ws
)
libraryDependencies ++= Seq(
    // some of dependencies are defined by default, we insert two new dependencies directly after
    "org.hibernate" % "hibernate-entitymanager" % "3.6.9.Final",
    "mysql" % "mysql-connector-java" % "5.1.31"
)
// resolvers += "github snapshots" at "https://github.com/tototoshi/play-scalate"
// resolvers += "sonatype snapshots" at "https://oss.sonatype.org/content/repositories/snapshots/"

// libraryDependencies ++= Seq(
//     "com.github.tototoshi" %% "play-scalate" % "0.1.0-SNAPSHOT",
//       "org.scalatra.scalate" %% "scalate-core" % "1.7.0",
//         "org.scala-lang" % "scala-compiler" % scalaVersion.value
//       )

// unmanagedResourceDirectories in Compile += baseDirectory.value / "app" / "views"
