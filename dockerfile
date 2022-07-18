FROM openjdk:16
COPY ./hello.main-1.0.jar /
CMD ["java","-cp","hello.main-1.0.jar","hello.HelloWorld"]

