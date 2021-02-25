package com.example.dependencyinjection.config;

import com.example.dependencyinjection.services.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Configuration
public class GreetingServiceConfig {

    @Bean
    public GreetingServiceFactory greetingServiceFactory(GreetingRepository greetingRepository){
        return new GreetingServiceFactory(greetingRepository);
    }

    @Bean
    @Primary
    public GreetingService primaryGreetingService(GreetingRepository greetingRepository){
        return new PrimaryGreetingService(greetingRepository);
    }

    @Bean
    @Profile("de")
    public GreetingService primaryGermanGreetingService(GreetingRepository greetingRepository){
        return new PrimaryGermanGreetingService(greetingRepository);
    }

    @Bean
    @Profile({"ES","default"})
    public GreetingService inSpanishGreetingService(GreetingRepository greetingRepository){
        return new INSpanishGreetingService(greetingRepository);
    }
}
