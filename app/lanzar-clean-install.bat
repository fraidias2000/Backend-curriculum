@echo off
REM === Configura la ruta a tu JDK 17 ===
set JAVA_HOME=C:\Program Files\Java\jdk-17
set PATH=%JAVA_HOME%\bin;%PATH%

echo Usando Java desde: %JAVA_HOME%
java -version

REM === Ejecuta el backend con Maven usando Java 17 ===
mvn clean install
