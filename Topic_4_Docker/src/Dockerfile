FROM alpine:latest
ADD Main.class Main.class
RUN apk --update add openjdk8-jre
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "Main"]