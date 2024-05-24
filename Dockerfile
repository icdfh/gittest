# Используем базовый образ OpenJDK 21
FROM openjdk:21

# Определяем аргумент JAR_FILE, который указывает на путь к JAR-файлу
ARG JAR_FILE=target/*.jar

# Копируем JAR-файл в образ
COPY ${JAR_FILE} app.jar

# Устанавливаем точку входа для контейнера
ENTRYPOINT ["java", "-jar", "/app.jar"]