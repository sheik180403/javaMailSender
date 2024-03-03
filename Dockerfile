FROM openjdk:19-jdk
COPY target/JavaMailSender-0.0.1-SNAPSHOT.jar .
EXPOSE 8080
ENTRYPOINT [ "java","-jar","JavaMailSender-0.0.1-SNAPSHOT.jar" ]