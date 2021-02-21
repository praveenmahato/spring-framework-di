package com.example.dependencyinjection.controllers;

import com.example.dependencyinjection.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConstructorInjectedControllerTest {

    ConstructorInjectedController constructorInjectedController;

    @BeforeEach
    void setUp() {
        constructorInjectedController = new ConstructorInjectedController(new GreetingServiceImpl());
    }

    @Test
    void getGreeting() {
        System.out.println(constructorInjectedController.getGreeting());
    }

    @Test
    void testGreeting(){
        System.out.println("Not using Before each method of test case");
        constructorInjectedController = new ConstructorInjectedController(new GreetingServiceImpl());
        System.out.println(constructorInjectedController.getGreeting());
    }
}