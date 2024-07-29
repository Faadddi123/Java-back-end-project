# Use the official Gradle image to build the application
FROM gradle:7.5.0-jdk11 AS build
COPY --chown=gradle:gradle . /home/gradle/project
WORKDIR /home/gradle/project
RUN gradle build -x test

# Use the official OpenJDK image to run the application
FROM openjdk:11-jre-slim
COPY --from=build /home/gradle/project/build/libs/*.jar /intern-management.jar
ENTRYPOINT ["java", "-jar", "/intern-management.jar"]
