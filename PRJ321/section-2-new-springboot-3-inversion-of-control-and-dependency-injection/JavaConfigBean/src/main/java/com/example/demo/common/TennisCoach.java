package com.example.demo.common;

import org.springframework.stereotype.Component;

/**
 * 1.define the dependency interface and class
 * @implNote @Component annotation marks the class as a Spring bean
 */
@Component
public class TennisCoach implements  Coach{
    public TennisCoach() {
        System.out.println("in constructor: "+getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }
}
