FROM openjdk:latest

ADD build/libs/webapp-0.1.jar webapp.jar

ENTRYPOINT ["java", "-jar", "webapp.jar"]

EXPOSE 8080