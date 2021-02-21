package com.example.dependencyinjection.services;

import org.springframework.stereotype.Service;

@Service
public class SetterGreetingService implements GreetingService {
    @Override
    public String getGreeting() {
        return "Hello There Folks !! -- Using setter";
    }
}
