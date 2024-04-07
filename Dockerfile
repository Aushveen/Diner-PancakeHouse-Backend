FROM eclipse-temurin:17
WORKDIR /home
COPY ./target/Diner-PancakeHouse-Merge-0.0.1-SNAPSHOT.jar dinermerge.jar
ENTRYPOINT ["java", "-jar", "dinermerge.jar"]