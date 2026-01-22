FROM eclipse-temurin:21-jdk-jammy

WORKDIR /Spring-Boot-Mongodb-Containers-Communication-Example

# copy whatever jar is produced by Maven (avoid hard-coded demo.jar)
COPY target/*.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]