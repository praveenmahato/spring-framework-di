package com.example.dependencyinjection.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;


public class PrimaryGreetingService implements GreetingService{

    private final GreetingRepository greetingRepository;

    public PrimaryGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    public String sayHello(){
        System.out.println("Hello world");
        return "Hello Folks --- Primary service say Hello";
    }

    @Override
    public String getGreeting() {
        return greetingRepository.getEnglishGreeting();
    }
}
