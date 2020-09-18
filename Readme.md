# Maven
[Building a RESTful Web Service(https://spring.io/guides/gs/rest-service/#scratch)]

1.**Build the JAR file**  : mvn clean package

2.**run the JAR**        : java -jar target/MavenHelloWorldRESTful-1.0-SNAPSHOT.jar

3.**Terminal**: mvn spring-boot:run



## TEST

[http://localhost:8080/greeting]
```JSON
{"id":1,"content":"Hello, World!"}
```

[http://localhost:8080/greeting?name=User]
```JSON
{"id":2,"content":"Hello, User!"}
```