FROM openjdk:8u111-jdk-alpine
EXPOSE 8080
VOLUME /tmp
ADD MakeMyPlan-0.0.1-SNAPSHOT.jar /makemyplan/MakeMyPlan.jar
RUN sh -c 'touch /makemyplan/MakeMyPlan.jar'
RUN addgroup vfgr
RUN adduser -s /bin/sh -G vfgr -D vfgrusr
USER vfgrusr
ENTRYPOINT exec java -Djava.security.egd=file:/dev/./urandom $JAVA_OPTS -jar ./makemyplan/MakeMyPlan.jar
