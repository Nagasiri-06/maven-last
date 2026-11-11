# Step 1: Use lightweight JRE 17 base image
FROM eclipse-temurin:17-jre-alpine

# Step 2: Set working directory inside container
WORKDIR /app

# Step 3: Copy compiled JAR from host target directory into container
COPY target/maven-last-0.0.1-SNAPSHOT.jar app.jar

# Step 4: Run the Java application
ENTRYPOINT ["java", "-jar", "app.jar"]