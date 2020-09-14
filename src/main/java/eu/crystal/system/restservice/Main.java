package eu.crystal.system.restservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
https://spring.io/guides/gs/rest-service/#scratch


Build the JAR file  : mvn clean package
run the JAR         : java -jar target/MavenHelloWorldRESTful-1.0-SNAPSHOT.jar

Terminal: mvn spring-boot:run

Browser :
http://localhost:8080/greeting
Result  : {"id":1,"content":"Hello, World!"}

http://localhost:8080/greeting?name=User
Result  : {"id":2,"content":"Hello, User!"}

*/

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}
