FROM eclipse-temurin:17-jdk-alpine

WORKDIR /app

RUN apk update && apk add --no-cache bash

COPY . .

RUN ./mvnw -B -ntp dependency:go-offline
RUN ./mvnw clean package -DskipTests

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "target/mydockersample-0.0.1-SNAPSHOT.jar"]
