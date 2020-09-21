FROM openjdk:14-alpine
COPY target/*.jar app.jar
ENTRYPOINT ["java", "-Dcom.sun.management.jmxremote", "-Xmx128m", "-jar","app.jar"]
EXPOSE 8091
