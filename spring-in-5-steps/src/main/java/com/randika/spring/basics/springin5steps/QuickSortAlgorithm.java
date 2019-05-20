package com.randika.spring.basics.springin5steps;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//Implements interface to loose coupling.
@Component // To tell Springboot to consider this class is as bean
@Primary // Make the default type (here QuickSortAlgorithem as default) for auto wired if,
		 //there are multiple components of same type (here SortAlgorithm type.).
public class QuickSortAlgorithm implements SortAlgorithm{
	public int[] sort(int[] arrayToSort) {
		//Logic for sort using Quick sort
		//Then return the sorted array
		return arrayToSort;
	}
}
