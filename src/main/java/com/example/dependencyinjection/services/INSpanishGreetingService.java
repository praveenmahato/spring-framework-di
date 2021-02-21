package com.example.dependencyinjection.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("ES")
@Service("i18nGreetingService")
public class INSpanishGreetingService implements GreetingService{
    @Override
    public String getGreeting() {
        return "Hello world !! --Spanish";
    }
}
