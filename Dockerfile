# Usa Java 17
FROM eclipse-temurin:17-jdk

# Crea el directorio de la app
WORKDIR /app

# Copia el .jar generado
COPY target/admin-panel-0.0.1-SNAPSHOT.jar app.jar

# Expón el puerto que usa Spring Boot
EXPOSE 8080

# Ejecuta la app y permite inyectar variables de entorno
ENTRYPOINT ["java", "-jar", "app.jar"]
