package com.example.dependencyinjection.controllers;

import com.example.dependencyinjection.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructorInjectedControllerTest {

    ConstructorInjectedController constructorInjectedController;

    @BeforeEach
    void setUp() {
        constructorInjectedController = new ConstructorInjectedController(new ConstructorGreetingService());
    }

    @Test
    void getGreeting() {
        System.out.println(constructorInjectedController.getGreeting());
    }

    @Test
    void testGreeting(){
        System.out.println("Not using Before each method of test case");
        constructorInjectedController = new ConstructorInjectedController(new ConstructorGreetingService());
        System.out.println(constructorInjectedController.getGreeting());
    }
}