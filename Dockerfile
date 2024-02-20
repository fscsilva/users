FROM eclipse-temurin:17

LABEL mentainer="fscsilva0@gmail.com"

WORKDIR /app

COPY target/te-users-0.0.1-0.jar /app/te-users.jar

ENTRYPOINT ["java", "-jar", "te-users.jar"]