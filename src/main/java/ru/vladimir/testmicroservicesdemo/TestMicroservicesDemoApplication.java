package ru.vladimir.testmicroservicesdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestMicroservicesDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestMicroservicesDemoApplication.class, args);
        System.out.println("some git test");
        System.out.println("new changes");
    }

}
