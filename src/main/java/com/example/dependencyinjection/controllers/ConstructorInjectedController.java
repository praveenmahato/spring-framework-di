package com.example.dependencyinjection.controllers;

import com.example.dependencyinjection.services.GreetingService;
import com.example.dependencyinjection.services.GreetingServiceImpl;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {

    private final GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = new GreetingServiceImpl();
    }

    public String getGreeting(){
        return greetingService.getGreeting();
    }
}
