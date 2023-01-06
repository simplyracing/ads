FROM openjdk:17-alpine

WORKDIR /app
COPY ./target/ads.jar /app

EXPOSE 8080

CMD ["java", "-jar", "ads.jar"]
