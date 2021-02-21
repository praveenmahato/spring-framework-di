package com.example.dependencyinjection.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class PrimaryGreetingService implements GreetingService{

    public String sayHello(){
        System.out.println("Hello world");
        return "Hello Folks --- Primary service say Hello";
    }

    @Override
    public String getGreeting() {
        return "Hello Folks --- Primary service";
    }
}
