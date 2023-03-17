package com.example.demo.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Fortune {
//    inject properties for: instructor.name and team.name
    @Value("${instructor.name}")
    private String instructorName;
    @Value("${team.name}")
    private  String teamName;
@GetMapping("/teaminfo")
    public String getTeamInfo(){
        return  "Instructor: "+instructorName+" teame: "+teamName;
    }

    @GetMapping("/")
    public String sayHello(){
        return "Hello";
    }
    @GetMapping("/workout")
    public String workout(){
        return "hard 5k";
    }
    @GetMapping("/fortune")
    public String fortune(){
        return "Today is your lucky day";
    }
}
