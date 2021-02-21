package com.example.dependencyinjection.services;

public class GreetingServiceImpl implements GreetingService {
    @Override
    public String getGreeting() {
        return "Hello There Folks !!";
    }
}
