package com.example.dependencyinjection.services;

import org.springframework.stereotype.Component;

@Component
public class GreetingRespositoryImpl implements GreetingRepository{
    @Override
    public String getEnglishGreeting() {
        return "Hello- Primary Greeting Service";
    }

    @Override
    public String getSpanishGreeting() {
        return "Servicio de Saludo Primario";
    }

    @Override
    public String getGermanGreeting() {

        return "Primärer Grußdienst";

    }
}
