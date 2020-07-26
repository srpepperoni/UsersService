FROM openjdk:8-jdk-alpine

WORKDIR app
COPY . .

RUN apk add maven
RUN mvn package -DskipTests

ENTRYPOINT ["java","-jar","/target/*.jar"]