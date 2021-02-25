package com.example.dependencyinjection;

import com.example.dependencyinjection.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyInjectionApplication {

	public static void main(String[] args) {

		ApplicationContext ctxt = SpringApplication.run(DependencyInjectionApplication.class, args);

	/*	I18Controller i18Controller = (I18Controller) ctxt.getBean("i18Controller") ;
		System.out.println(i18Controller.sayHello());*/

		System.out.println("============================= Primary bean");
		MyController controller = (MyController) ctxt.getBean("myController");

		//String greeting = controller.sayHello();

		//System.out.println(greeting);

		System.out.println(controller.sayGreeting());



		System.out.println("==============================Property");

		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctxt.getBean("propertyInjectedController") ;
		System.out.println(propertyInjectedController.sayGreeting());

		System.out.println("===============================Setter");
		SetterInjectedController setterInjectedController = (SetterInjectedController) ctxt.getBean("setterInjectedController");

		System.out.println(setterInjectedController.getGreeting());

		System.out.println("==================================Constructor");
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctxt.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());

	}

}
