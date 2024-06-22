FROM azul/zulu-openjdk-alpine:17.0.4.1-17.36.17-jre-headless
MAINTAINER asim manzoor
ARG ARTIFACT_ID
ARG ARTIFACT_VERSION

ENV ARTIFACT_ID ${ARTIFACT_ID}
ENV ARTIFACT_VERSION ${ARTIFACT_VERSION}

ADD ./target/${ARTIFACT_ID}-${ARTIFACT_VERSION}.jar demo-app.jar
ENTRYPOINT ["java","-jar","/demo-app.jar"]
