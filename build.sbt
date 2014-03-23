name := "sbtprojectwithconnectionpooling"

version := "1.0"


scalaVersion := "2.10.3"

organization := "Knoldus"

libraryDependencies ++= Seq(
	                       "ch.qos.logback" 		% 		"logback-classic" 	% 		"1.0.13",
                           "postgresql"          %    "postgresql"           %     "9.1-901.jdbc4",
                           "com.jolbox"               %         "bonecp"          % "0.8.0.RELEASE"
)    



