FROM maven:3.6.3-openjdk-8-slim as builder
COPY /src /app/src
COPY /pom.xml /app/pom.xml
WORKDIR /app
RUN mvn clean package

FROM openjdk:8-jre-slim
RUN mkdir /app
WORKDIR /app
COPY --from=builder /app/target/spring-security-0.0.1-SNAPSHOT.jar spring-security.jar
CMD ["java", "-jar", "spring-security.jar"]