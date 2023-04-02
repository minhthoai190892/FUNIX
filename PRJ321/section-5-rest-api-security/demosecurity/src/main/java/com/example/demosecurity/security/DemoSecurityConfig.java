package com.example.demosecurity.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class DemoSecurityConfig {
    @Bean
    public InMemoryUserDetailsManager inMemoryUserDetailsManager() {
        //create user in memory
        UserDetails john = User.builder().
                username("john").password("{noop}123").roles("EMPLOYEE").build();
        UserDetails mary = User.builder().
                username("mary").password("{noop}123").roles("EMPLOYEE", "MANAGER").build();
        UserDetails susan = User.builder().
                username("susan").password("{noop}123").roles("EMPLOYEE", "ADMIN").build();
        return new InMemoryUserDetailsManager(john, mary, susan);
    }
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception{
        httpSecurity.authorizeHttpRequests(configurer->configurer
                .requestMatchers(HttpMethod.GET,"/api/employees").hasRole("EMPLOYEE")
                .requestMatchers(HttpMethod.GET,"/api/employees/**").hasRole("EMPLOYEE")
                .requestMatchers(HttpMethod.POST,"/api/employees").hasRole("MANAGER")
                .requestMatchers(HttpMethod.PUT,"/api/employees").hasRole("MANAGER")
                .requestMatchers(HttpMethod.DELETE,"/api/employees/**").hasRole("ADMIN")
        );
        //use HTTP basic authentication
        httpSecurity.httpBasic();
        //disable csrf
        httpSecurity.csrf().disable();
        return httpSecurity.build();
    }
}
