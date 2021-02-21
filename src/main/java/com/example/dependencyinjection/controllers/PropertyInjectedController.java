package com.example.dependencyinjection.controllers;

import com.example.dependencyinjection.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Autowired
    public GreetingService greetingService;

    public String sayGreeting(){
        return greetingService.getGreeting();
    }
}
