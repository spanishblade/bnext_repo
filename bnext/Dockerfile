FROM openjdk:8
EXPOSE 8080
#RUN mkdir -p /app/
#ADD build/libs/bnext-0.0.1-SNAPSHOT.jar /app/bnext-0.0.1-SNAPSHOT.jar

ADD build/libs/bnext-0.0.1-SNAPSHOT.jar /dockerfolder/bnext-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/dockerfolder/bnext-0.0.1-SNAPSHOT.jar"]