FROM eclipse-temurin:17-jdk-focal

COPY api/*.jar app.jar

ENTRYPOINT ["java","-jar","app.jar"]


