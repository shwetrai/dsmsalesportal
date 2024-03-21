 FROM openjdk:17
 MAINTAINER ecosystem
 RUN mkdir /app
 WORKDIR /app
 COPY /target/dsmsalesportal-0.0.1-SNAPSHOT.jar dsmsalesportalapi.jar
 COPY /target/classes/application.properties application.properties
 CMD java -jar dsmsalesportalapi.jar
