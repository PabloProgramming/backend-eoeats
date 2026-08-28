FROM maven:3.9-eclipse-temurin-17 AS build
WORKDIR /app
COPY pom.xml .
RUN mvn dependency:go-offline -B
COPY src ./src
RUN mvn clean package -DskipTests -B

FROM eclipse-temurin:17-jre-jammy
WORKDIR /app
COPY --from=build /app/target/eoeats-0.0.1-SNAPSHOT.jar app.jar
COPY start.sh start.sh
RUN chmod +x start.sh
EXPOSE 8080
CMD ["./start.sh"]
