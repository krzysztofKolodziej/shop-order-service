FROM openjdk:17-jdk-slim
COPY ./target/shop-order-service-0.0.1-SNAPSHOT.jar /app/shop-order-service.jar
WORKDIR /app
ENTRYPOINT ["java", "-jar", "shop-order-service.jar"]