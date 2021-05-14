package com.datetime;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingArraysAnsList {

	public void sortArrays() {
		int[] myNumbers = {3,5,1,89,23,67};
		Arrays.sort(myNumbers);
		
		for (int i : myNumbers) {
			System.out.println(i);
		}
	}
	
	public void sortList() {
		List<Integer> myNumbersList = new ArrayList<Integer>();
		myNumbersList.add(34);
		myNumbersList.add(100);
		myNumbersList.add(3);
		myNumbersList.add(44);
		
		Collections.sort(myNumbersList);
		
		for (Integer i : myNumbersList) {
			System.out.println(i);
		}
		
		List<Integer> someNums = Arrays.asList(2,3,5,45,77,2);
	}
}
