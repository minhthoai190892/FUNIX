package com.example.demo.config;

import com.example.demo.common.Coach;
import com.example.demo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {
    // define a bean
    @Bean
    public Coach swimCoach(){
        return  new SwimCoach();
    }
}
