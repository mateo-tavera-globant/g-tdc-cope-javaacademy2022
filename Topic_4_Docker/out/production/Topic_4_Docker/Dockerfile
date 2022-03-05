
#Use the OpenJDK latest version as the base image
FROM openjdk:latest

#Create a new app directory for my application files
RUN mkdir /app

#Copy the app files from host to image files
COPY out/production/Topic_4_Docker/ /app

#Set directory for executing future commands
WORKDIR /app

#Run Main class
CMD java Main
