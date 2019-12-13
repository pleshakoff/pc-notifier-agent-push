FROM openjdk:8u181-jre-slim
COPY /build/libs/pc-notifier-agent-push.jar pc-notifier-agent-push.jar
ENTRYPOINT ["java",  "-jar","/pc-notifier-agent-push.jar"]
