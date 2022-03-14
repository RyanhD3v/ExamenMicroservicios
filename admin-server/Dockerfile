FROM java:8
EXPOSE 9301
ADD /target/groups-0.0.1-SNAPSHOT.jar server-admin.jar
ENTRYPOINT ["java","-jar","server-admin.jar"]