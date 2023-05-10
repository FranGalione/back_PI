FROM   amazoncorretto:11-alpine-jdk
MAINTAINER fgalione
COPY target/proint-0.0.1-SNAPSHOT.jar  francode.jar
ENTRYPOINT ["java","-jar","/francode.jar"] 
