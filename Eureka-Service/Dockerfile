FROM openjdk:17-jdk-slim
ARG JAR_FILE=target/Eureka-Service-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} Eureka-Service-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/Eureka-Service-0.0.1-SNAPSHOT.jar"]
