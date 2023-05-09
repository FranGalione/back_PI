FROM   amazoncorretto:17-alpine-jdk
MAINTAINER FRANCODE
COPY target/proint-0.0.1-SNAPSHOT.jar  francode.jar
ENTRYPOINT ["java","-jar","/francode.jar"] 
