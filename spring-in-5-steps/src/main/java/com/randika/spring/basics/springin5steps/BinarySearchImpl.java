package com.randika.spring.basics.springin5steps;

public class BinarySearchImpl {
	//Base steps require for binary search.
	//Sorting an array
	//Search the array
	//Return result
	
	// NOTE: this is a high level implementation of binary search (not a full implementation)
	// With the purpose of tight coupling and loose coupling.
	
	public int binarySearch(int[] numbers, int numberToSearch ) {
		//Sorting an array 
		// There are many algorithms that can be use to sort.
		// Right now this logic is tightly coupled with Bubble Sort.
		BubbleSortAlgorithm sortAlgo = new BubbleSortAlgorithm();
		int[] sortedNumbers = sortAlgo.sort(numbers);
		//Search the array
		//Return result
		return 3;
	}

}
