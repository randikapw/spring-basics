package com.randika.spring.basics.springin5steps;

import org.springframework.stereotype.Component;

//Implements interface to loose coupling.
@Component  // To tell Springboot to consider this class is as bean
public class BubbleSortAlgorithm implements SortAlgorithm {
	public int[] sort(int[] arrayToSort) {
		//Logic for sort using bubble sort
		//Then return the sorted array
		return arrayToSort;
	}
}
