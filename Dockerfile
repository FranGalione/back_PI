FROM amazoncorretto:17-alpine-jdk
MAINTAINER fgalione
COPY target/proint-0.0.1-SNAPSHOT.jar fgback.jar
ENTRYPOINT ["java","-jar","/fgback.jar"]
 
