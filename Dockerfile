FROM openjdk:18-alpine
COPY ./out/production/EXERCISE/ /tmp
WORKDIR /tmp
ENTRYPOINT ["java","Main"]