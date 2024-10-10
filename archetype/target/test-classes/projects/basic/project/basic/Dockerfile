FROM openjdk:17-jdk-slim

LABEL maintainer="com.demo.main" version="v1.0.0"

ENV TZ=Africa/Nairobi

EXPOSE 8080

COPY target/*.jar /opt/app.jar

WORKDIR /opt

ENTRYPOINT exec java $JAVA_OPTS -jar app.jar
