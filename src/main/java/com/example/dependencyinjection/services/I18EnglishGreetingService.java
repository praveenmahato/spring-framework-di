package com.example.dependencyinjection.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("EN")
@Service("i18nGreetingService")
public class I18EnglishGreetingService implements GreetingService{
    @Override
    public String getGreeting() {
        return "Hello world-- In English";
    }
}
