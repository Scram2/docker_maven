# ok - for local build -> via mvn install -> docker build -t yourAppNameAndTag .
# for remout build - ?
FROM openjdk:11.0.15
# need to compile our .jar
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]