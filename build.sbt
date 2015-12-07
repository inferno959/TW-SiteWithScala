val thisVersion = "0.0.1"

// These next lines are used to tell heroku how to run your app
/* val procfileWeb = "target/universal/stage/bin/malcolmthirusherokusite -Dhttp.port=$PORT -DapplyEvolutions.default=true"
  -Ddb.default.driver=org.postgresql.Driver -Ddb.default.url=$DATABASE_URL */

lazy val root = (project in file(".")).
	enablePlugins(PlayScala).
	settings(
		name := "timewasterzSite",
		version := thisVersion,
		organization := "timewasterz",
		fork in run := true,
		cleanFiles <+= baseDirectory { _ / "RUNNING_PID" },
		libraryDependencies ++= Seq(
				"pircbot" % "pircbot" % "1.5.0")
		// These lines are used in deploying straight to heraku using activator
		// I set it so that adding "-Dest=prod" deploys to the production app but not adding -Dest pushes to dev
		/*, herokuAppName in Compile := Map(
			"dev" -> "desolate-reaches-5474",
			"prod"->"arcane-reef-5637"
			).getOrElse(sys.props("est"),"desolate-reaches-5474"),
		herokuJdkVersion in Compile := "1.8",
		// I don't actually remember what this bit does, but I think its important... I'll look into it
		herokuProcessTypes in Compile := Map(
				"web" -> procfileWeb
			)*/	
	)