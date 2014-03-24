
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

Change into the slickdemo folder.

Run the code example using SBT

$ sbt run
