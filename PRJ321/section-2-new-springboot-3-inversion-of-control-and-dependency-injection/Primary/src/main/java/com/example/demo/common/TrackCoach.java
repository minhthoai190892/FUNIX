package com.example.demo.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * 1.define the dependency interface and class
 * @implNote @Component annotation marks the class as a Spring bean
 */
@Component
@Primary
public class TrackCoach implements  Coach{
    @Override
    public String getDailyWorkout() {
        return "Run hard 5k";
    }
}
