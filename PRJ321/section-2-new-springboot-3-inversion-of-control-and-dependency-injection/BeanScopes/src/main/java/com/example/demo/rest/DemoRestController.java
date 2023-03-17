package com.example.demo.rest;

import com.example.demo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 2.create demo restcontroller
 */
@RestController
public class DemoRestController {
    //define a private field for the dependency
    private Coach coach;
    private Coach coach2;
       // 3.create a constructor in your class for injections
//    @Autowired
//    public DemoRestController(@Qualifier("tennisCoach") Coach coach,@Qualifier("tennisCoach") Coach coach2) {
//        System.out.println("in constructor: "+getClass().getSimpleName());
//        this.coach = coach;
//    }


    public DemoRestController(@Qualifier("tennisCoach")Coach coach, @Qualifier("tennisCoach")Coach coach2) {
        this.coach = coach;
        this.coach2 = coach2;
    }

    @Autowired
    public void setCoach(@Qualifier("tennisCoach")Coach coach) {
        System.out.println("dependency of Setter method");
        this.coach = coach;
    }

    /**
     * 4.add @GetMapping for "/dailyworkout"
     *
     * @return
     */
    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        //static/a.jpg
        return coach.getDailyWorkout();
    }
    @GetMapping("/check")
    public String check(){
        return "comparing beans: coach == coach2: "+(coach==coach2);
    }
}
