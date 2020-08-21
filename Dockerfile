FROM openjdk:jdk-alpine

COPY target/jenkins-docker-0.0.1-SNAPSHOT.jar /deployments/

CMD java -jar /deployments/jenkins-docker-0.0.1-SNAPSHOT.jar