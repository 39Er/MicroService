#!/usr/bin/env bash

#export JAVA_HOME=/opt/soft/openjdk1.8.0
#export CLASSPATH=.:$JAVA_HOME/jre/lib:$JAVA_HOME/lib:$JAVA_HOME/lib/tools.jar
#export PATH=$JAVA_HOME/bin:$PATH

java -server -Dspring.profiles.active=$1 -jar ./build/libs/MicroService-0.1.0-SNAPSHOT.jar > ./jms.out 2>&1 &
