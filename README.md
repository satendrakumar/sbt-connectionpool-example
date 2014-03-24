<pre>

To Run

Install SBT 0.13, available from http://www.scala-sbt.org/release/docs/Getting-Started/Setup.html

Make sure sbt is in your PATH.

postgres installation (If you already have postgres database then no need to install)=> 

$ sudo apt-get install postgresql 

for create database and table => 

sky@Sky:~$ sudo -u postgres psql postgres
[sudo] password for sky: 
psql (9.1.12)
Type "help" for help.

postgres=# create database testdb;
CREATE DATABASE
postgres=# \c testdb;
You are now connected to database "testdb1" as user "postgres".
testdb=# create table emp(id varchar(10),name varchar(30), dept varchar(10));
CREATE TABLE
testdb=# 


You then need to clone this project

git clone https://github.com/satendrakumar06/sbtprojectwithconnectionpooling.git

Change into the sbtprojectwithconnectionpooling folder.

Run the code example using SBT

sky@Sky:~/knols_sessions/sbtprojectwithconnectionpooling$ sbt run
Loading /home/sky/scalatool/sbt-0.13/bin/sbt-launch-lib.bash
[info] Loading project definition from /home/sky/knols_sessions/sbtprojectwithconnectionpooling/project
[info] Set current project to sbtprojectwithconnectionpooling (in build file:/home/sky/knols_sessions/sbtprojectwithconnectionpooling/)
[info] Compiling 1 Scala source to /home/sky/knols_sessions/sbtprojectwithconnectionpooling/target/scala-2.10/classes...
[info] Running com.knol.app.ConnectionPoolTest
15:38:15.956 [run-main] WARN com.jolbox.bonecp.BoneCP - Thread close connection monitoring has been enabled. This will negatively impact on your performance. Only enable this option for debugging purposes!
15:38:16.088 [run-main] DEBUG com.jolbox.bonecp.StatementHandle - select * from emp
(1212,sk,r&amp;d)
(1213,ak,r&amp;d)
(1214,dk,testing)
15:38:16.111 [BoneCP-pool-watch-thread] DEBUG com.jolbox.bonecp.PoolWatchThread - Terminating pool watch thread
15:38:16.111 [BoneCP-pool-watch-thread] DEBUG com.jolbox.bonecp.PoolWatchThread - Terminating pool watch thread
15:38:16.112 [BoneCP-pool-watch-thread] DEBUG com.jolbox.bonecp.PoolWatchThread - Terminating pool watch thread
15:38:16.111 [BoneCP-pool-watch-thread] DEBUG com.jolbox.bonecp.PoolWatchThread - Terminating pool watch thread
</pre>
