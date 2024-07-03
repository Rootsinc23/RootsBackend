# Base image for Java application
FROM openjdk:21.0.3

# Copy the Spring Boot application files
WORKDIR /newsletter
COPY target/*.jar newsletter.jar

# Expose the port where Spring Boot listens (typically 8080)
EXPOSE 8080

# Command to run the Spring Boot application
CMD ["java", "-jar", "newsletter.jar"]
