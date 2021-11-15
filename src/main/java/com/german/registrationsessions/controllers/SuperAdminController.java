package com.german.registrationsessions.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/super-admin")
public class SuperAdminController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello SUPER ADMIN";
    }

}
