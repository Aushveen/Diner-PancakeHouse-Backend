FROM eclipse-temurin:17
WORKDIR /home
COPY ./target/Diner-PancakeHouse-0.0.1-SNAPSHOT.jar diner.jar
ENTRYPOINT ["java", "-jar", "diner.jar"]