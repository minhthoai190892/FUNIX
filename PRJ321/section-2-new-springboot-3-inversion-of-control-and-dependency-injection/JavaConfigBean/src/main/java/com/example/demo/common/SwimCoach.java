package com.example.demo.common;

public class SwimCoach implements Coach{
    public SwimCoach() {
        System.out.println("In constructor: "+getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Swim 1k meters as a warm up";
    }
}
