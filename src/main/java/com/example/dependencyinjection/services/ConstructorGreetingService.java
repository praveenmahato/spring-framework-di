package com.example.dependencyinjection.services;

import org.springframework.stereotype.Service;

@Service(value = "constructorGreetingService")
public class ConstructorGreetingService implements GreetingService {
    @Override
    public String getGreeting() {
        return "Hello There Folks !! -- Using constructor";
    }
}
