FROM java:8
EXPOSE 8075
ADD /target/server-docker-1-0.0.1-SNAPSHOT.jar server-user.jar
ENTRYPOINT ["java","-jar","/server-user.jar"]
