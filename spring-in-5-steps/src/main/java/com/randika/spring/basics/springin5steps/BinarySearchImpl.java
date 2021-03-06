package com.randika.spring.basics.springin5steps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component  // To tell Springboot to consider this class is as bean
public class BinarySearchImpl {
	//Base steps require for binary search.
	//Sorting an array
	//Search the array
	//Return result
	
	// NOTE: this is a high level implementation of binary search (not a full implementation)
	// With the purpose of tight coupling and loose coupling.
	
	
	//Implement loose coupling.
	@Autowired // To tell springboot to auto create a bean.
	private SortAlgorithm sortAlgo; // In other words, SortAlgorithm is a dependency of this class
	
	public BinarySearchImpl(SortAlgorithm sortAlgo) {
		super();
		this.sortAlgo = sortAlgo;
	}



	public int binarySearch(int[] numbers, int numberToSearch ) {
		//Sorting an array 
		// There are many algorithms that can be use to sort.
		
		// Commented  tightly coupled with Bubble Sort.
		//BubbleSortAlgorithm sortAlgo = new BubbleSortAlgorithm();
		
		int[] sortedNumbers = sortAlgo.sort(numbers);
		System.out.println("Using sort algorithm: " + sortAlgo);
		//Search the array
		//Return result
		return 3;
	}

}
