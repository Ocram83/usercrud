[![Build Status](https://travis-ci.org/Ocram83/usercrud.svg?branch=master)](https://travis-ci.org/Ocram83/usercrud)

# User Crud

This repository contains an example CRUD application on a very basic user object.

The application features a back-end written in Java by mean of the Spring framework, and a front-end written in Angular7.

Front-end and Back-end communicate using the REST paradigm, exchanging JSON strings representing the user object.

The two application run separately, back-end is deployed on tomcat, front end uses node server.

## Back-end 

In order to run the back-end you need to have jdk >= 1.8 and maven installed on you local machine.
The application can be run with a single command thanks to Spring Boot! Just type 
```
./mvnw spring-boot:run 
```
from the root directory of your working copy of this repository and magics happens. The application will be available on the address 
```
http://localhost:8080/api/user
```
Documentation based on Openapi specs is generated during maven compile phase and is available in the directory ./generated.
Please note that a more complete version of the documentation will be also available on the address 
```
http://localhost:8080/swagger-ui.html 
```
once the application is running. Please note that an in-memory database is used and data will be persisted only until the server is up and running.

## Front-end

In order to run the front-end you need to have node >= 8 installed on your local machine.
To start the front-end enter the directory ./front-end/client/ and type 

```
npm install
```

to compile the application, then run
```
ng serve 
```
to run the application.
The application will expose on address 
```
http://localhost:4200/ 
```
a basic user interface that consumes REST servicies exposed by back-end.
