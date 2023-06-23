FROM amazoncorretto:17-alpine-jdk
MAINTAINER LENS
COPY target/Logistics-0.0.1-SNAPSHOT.jar lens-app.jar
ENTRYPOINT ["java", "-jar", "/lens-app.jar"]
EXPOSE 8080