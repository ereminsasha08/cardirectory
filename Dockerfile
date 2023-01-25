FROM openjdk:17
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} car_directory.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/car_directory.jar"]
