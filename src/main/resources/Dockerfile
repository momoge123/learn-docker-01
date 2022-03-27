FROM java:8
VOLUME /tmp
ADD learn-docker-01.jar app.jar
RUN bash -c "touch /app.jar"
EXPOSE 6002
ENTRYPOINT [ "java", "-jar", "/app.jar" ]