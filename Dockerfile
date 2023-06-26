FROM amazoncorretto:17-alpine-jdk
MAINTAINER IND
COPY target/Logistics-0.0.1-SNAPSHOT.jar ind-app.jar
ENTRYPOINT ["java", "-jar", "/ind-app.jar"]
EXPOSE 8080