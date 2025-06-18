# Usa una imagen base con Java 17
FROM eclipse-temurin:17-jdk

# Crea un directorio para la app
WORKDIR /app

# Copia el .jar al contenedor
COPY target/admin-panel-0.0.1-SNAPSHOT.jar app.jar

# Expón el puerto usado por Spring Boot
EXPOSE 8080

# Ejecuta el .jar
ENTRYPOINT ["java", "-jar", "app.jar"]
