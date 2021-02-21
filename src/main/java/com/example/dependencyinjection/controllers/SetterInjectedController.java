package com.example.dependencyinjection.controllers;

import com.example.dependencyinjection.services.GreetingService;
import com.example.dependencyinjection.services.ConstructorGreetingService;
import com.example.dependencyinjection.services.SetterGreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {

    private GreetingService greetingService;

    @Qualifier("setterGreetingService")
    @Autowired
    public void setGreetingService(GreetingService greetingService){
        this.greetingService = new SetterGreetingService();
    }

    public String getGreeting(){
        return greetingService.getGreeting();
    }
}
