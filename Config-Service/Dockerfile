# Utiliser une image Java de base
FROM openjdk:17-jdk-slim

# Spécifier le fichier JAR à copier dans le conteneur
ARG JAR_FILE=target/Config-Service-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar

# Spécifier le port exposé (celui du `server.port` dans votre application)
EXPOSE 8888

# Démarrer l'application
ENTRYPOINT ["java", "-jar", "/app.jar"]
