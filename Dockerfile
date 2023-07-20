FROM azul/zulu-openjdk-alpine:17-latest as builder

WORKDIR /app

COPY . .

RUN ./gradlew build


FROM azul/zulu-openjdk-alpine:17-latest as runner

ARG APP_VERSION=0.0.1-SNAPSHOT

WORKDIR /app

COPY --from=builder /app/build/libs/neo4jdata-${APP_VERSION}.jar /app/app.jar

EXPOSE 8080

CMD ["java", "-jar", "app.jar"]
