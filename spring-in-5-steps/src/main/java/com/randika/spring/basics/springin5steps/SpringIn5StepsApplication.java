package com.randika.spring.basics.springin5steps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class SpringIn5StepsApplication {
	
	// The things we tell to spring fw to handle dependencies.
	// What are the Beans? (@Component)
	// What are the Dependencies of a Beans? (@Autowired)
	// Where to search for a bean (no need to do any thing if all the beans are defined under the package (or subpackages) of @SpringBootApplication class)

	public static void main(String[] args) {
		// Binary search algorithm for understand converting form tight to loose coupling.
		
		// Create Spring Application Context (Which contains all the beans)
		ApplicationContext appContext = SpringApplication.run(SpringIn5StepsApplication.class, args);
		// getBean from app context
		BinarySearchImpl binarySearch = appContext.getBean(BinarySearchImpl.class);
		int result = binarySearch.binarySearch(new int[]{12, 4, 6}, 23);
		System.out.println("Searching of value 23 is resulted the index of " + result);
	}

}
