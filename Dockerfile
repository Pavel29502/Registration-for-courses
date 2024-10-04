# FROM openjdk:17-jre-slim
FROM openjdk:17-jdk-slim
# Установка зависимостей
RUN apt-get update && apt-get install -y \
    wget \
    && rm -rf /var/lib/apt/lists/*

# Скачивание JAR-файла из репозитория
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar

# Запуск приложения
ENTRYPOINT ["java","-jar","/app.jar"]





