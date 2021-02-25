package com.example.dependencyinjection.services;


public class INSpanishGreetingService implements GreetingService{

    private final GreetingRepository greetingRepository;

    public INSpanishGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String getGreeting() {
        return greetingRepository.getSpanishGreeting();
    }
}
