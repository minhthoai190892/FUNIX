package com.example.demo.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

/**
 * 1.define the dependency interface and class
 * @implNote @Component annotation marks the class as a Spring bean
 */
@Component
public class CrickCoach implements  Coach{
    public CrickCoach() {
        System.out.println("in constructor: "+getClass().getSimpleName());
    }
//define  initial method
    @PostConstruct
public void doMyStartupStuff(){
    System.out.println("Insiad doMyStartupStuff"+getClass().getSimpleName());
}
//    define destroy method
@PreDestroy
public void doMyCleanupStuff(){
    System.out.println("Insiad doMyCleanupStuff"+getClass().getSimpleName());
}
    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes";
    }
}
