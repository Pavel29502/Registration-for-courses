
FROM openjdk:17-jdk-slim
# Установка зависимостей
RUN apt-get update && apt-get install -y \
    wget \
    && rm -rf /var/lib/apt/lists/*

ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar

# Запуск приложения
ENTRYPOINT ["java","-jar","/app.jar"]

#
#2 версия
#FROM openjdk:17-jdk-slim
#
## Установка зависимостей
#RUN apt-get update && apt-get install -y \
#    wget \
#    && rm -rf /var/lib/apt/lists/*
#
## Установка рабочей директории
#WORKDIR /app
#
## Установка JAR-файла
#ARG JAR_FILE=build/libs/*.jar
#COPY ${JAR_FILE} app.jar
#
## Запуск приложения
#ENTRYPOINT ["java", "-jar", "app.jar"]





