package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ScopeMetadata;

/**
 * 1.define the dependency interface and class
 * 2.create demo rest controller
 * 3.create a constructor in your class for injections
 * 4.add @GetMapping for "/dailyworkout"
 *
 *
 */
@SpringBootApplication(
//
//        scanBasePackages = {"com.example.demo","com.example.util"}

)
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
