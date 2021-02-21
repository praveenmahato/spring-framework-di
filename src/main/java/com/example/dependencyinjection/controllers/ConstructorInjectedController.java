package com.example.dependencyinjection.controllers;

import com.example.dependencyinjection.services.GreetingService;
import com.example.dependencyinjection.services.ConstructorGreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {

    private final GreetingService greetingService;

    public ConstructorInjectedController(@Qualifier("constructorGreetingService") GreetingService greetingService) {
        this.greetingService = new ConstructorGreetingService();
    }

    public String getGreeting(){
        return greetingService.getGreeting();
    }
}
