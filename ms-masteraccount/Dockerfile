# Use an official OpenJDK runtime as a parent image
FROM eclipse-temurin:17-jdk-alpine

# Set the working directory to /app
VOLUME /tmp

# Copy the application JAR file into the container at /app
COPY target/ms-masteraccount-*.jar app.jar

# Make port 8080 available to the world outside this container
EXPOSE 8081

# Run the application when the container launches
CMD ["java", "-jar", "app.jar"]
