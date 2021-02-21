package com.example.dependencyinjection.controllers;

import com.example.dependencyinjection.services.GreetingService;
import com.example.dependencyinjection.services.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {

    private GreetingService greetingService;

    @Autowired
    public void setGreetingService(GreetingService greetingService){
        this.greetingService = new GreetingServiceImpl();
    }

    public String getGreeting(){
        return greetingService.getGreeting();
    }
}
