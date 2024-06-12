FROM azul/zulu-openjdk-alpine:17.0.4.1-17.36.17-jre-headless
MAINTAINER asim manzoor
ADD ./target/demo-app-*.jar demo-app.jar
ENTRYPOINT ["java","-jar","/demo-app.jar"]
