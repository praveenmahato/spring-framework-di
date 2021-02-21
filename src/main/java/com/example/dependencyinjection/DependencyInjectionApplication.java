package com.example.dependencyinjection;

import com.example.dependencyinjection.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyInjectionApplication {

	public static void main(String[] args) {

		ApplicationContext ctxt = SpringApplication.run(DependencyInjectionApplication.class, args);

		MyController controller = (MyController) ctxt.getBean("myController");

		String greeting = controller.sayHello();

		System.out.println(greeting);

	}

}
