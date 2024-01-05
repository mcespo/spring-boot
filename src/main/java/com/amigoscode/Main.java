package com.amigoscode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @GetMapping("/")
    public GreetResponse greet() {
        return new GreetResponse("hello child!", List.of("PHP", "HTML", "CSS", "Javascript"), new Person("Marvin", 29, 3000_0));
    }

    record Person(
            String name,
            int age,
            double savings

    ){}

    record GreetResponse(
            String greet,
            List<String> favProgrammingLanguages,
            Person person
    ){}

    // manually create greetresponse
//    class GreetResponse {
//        private final String greet;
//        GreetResponse(String greet) {
//            this.greet = greet;
//        }
//
//        public String getGreet() {
//            return greet;
//        }
//    }
}
