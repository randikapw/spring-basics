package com.randika.spring.basics.springin5steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringIn5StepsApplication {

	public static void main(String[] args) {
		// Binary search algorithm for understand tight coupling.
		BinarySearchImpl binarySearch = new BinarySearchImpl();
		int result = binarySearch.binarySearch(new int[]{12, 4, 6}, 23);
		System.out.println("Searching of value 23 is resulted the index of " + result);
		SpringApplication.run(SpringIn5StepsApplication.class, args);
	}

}
