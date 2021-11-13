package com.german.registrationsessions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;

@SpringBootApplication
public class RegistrationSessionsApplication {


    public static void main(String[] args) {
        SpringApplication.run(RegistrationSessionsApplication.class, args);
    }

}
