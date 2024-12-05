# Utiliser l'image de base officielle de OpenJDK
FROM openjdk:17-jdk-slim

# Définir l'emplacement du répertoire de travail dans le conteneur
WORKDIR /app

# Copier le fichier jar généré dans le conteneur
COPY target/Gateway-Service-0.0.1-SNAPSHOT.jar Gateway-Service-0.0.1-SNAPSHOT.jar

# Exposer le port sur lequel votre application Spring Boot va s'exécuter
EXPOSE 8888

# Définir la commande pour démarrer l'application Spring Boot
ENTRYPOINT ["java", "-jar", "Gateway-Service-0.0.1-SNAPSHOT.jar"]
