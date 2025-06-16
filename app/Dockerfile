# Usa una imagen base de Maven con Java 17
FROM maven:3.9.4-eclipse-temurin-17 AS build

# Crea el directorio de trabajo
WORKDIR /app

# Copia el proyecto al contenedor
COPY . .

# Construye el proyecto (sin tests si quieres más rápido)
RUN mvn clean package -DskipTests

# -------------------------------
# Imagen final: JDK ligero con el JAR generado
FROM eclipse-temurin:17-jdk

# Directorio de trabajo
WORKDIR /app

# Copia el JAR desde la etapa anterior
COPY --from=build /app/target/*.jar app.jar

# Puerto que se va a exponer
EXPOSE 8080

# Comando que ejecuta la aplicación
ENTRYPOINT ["java", "-jar", "app.jar"]
