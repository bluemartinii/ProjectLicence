FROM openjdk:18
WORKDIR /app
ADD target/ProjectLicence-0.0.1-SNAPSHOT.jar ProjectLicence-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "ProjectLicence-0.0.1-SNAPSHOT.jar"]


