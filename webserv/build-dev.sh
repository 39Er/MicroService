#!/usr/bin/env bash

#export JAVA_HOME=/opt/soft/openjdk1.8.0
#export CLASSPATH=.:$JAVA_HOME/jre/lib:$JAVA_HOME/lib:$JAVA_HOME/lib/tools.jar
#export PATH=$JAVA_HOME/bin:$PATH

# 生成release
./gradlew clean
./gradlew build -x test
