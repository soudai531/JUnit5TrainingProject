package com.example.junit5trainingproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JUnit5TrainingProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(JUnit5TrainingProjectApplication.class, args).
                getBean(JUnit5TrainingProjectApplication.class).say();
    }

    public String say() {
        return "hello world";
    }
}
