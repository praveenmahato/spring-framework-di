package com.example.dependencyinjection.controllers;

import com.example.dependencyinjection.services.GreetingService;

public class PropertyInjectedController {

    public GreetingService greetingService;

    public String sayGreeting(){
        return greetingService.getGreeting();
    }
}
