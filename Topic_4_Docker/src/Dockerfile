#Use the OpenJDK latest version as the base image
FROM openjdk

#Create a new app directory for my application files
RUN mkdir /app

#Copy the app files from host to image files
COPY . /app

#Set directory for executing future commands
WORKDIR /app

#Run Main class
CMD java Main