package com.datetime;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DateTimeWork {

	public void convertListToArray() {
		List<String> animals = new ArrayList<String>();
		animals.add("Lions");
		animals.add("Tiger");
		animals.add("Elephant");

		String[] normalAnimal = animals.toArray(String[]::new);
		
		for (String ani : normalAnimal) {
			System.out.println(ani);
		}

	}
	
	public void convertArrayToList() {
		String[] normalAnimal = {"Lions","Tiger","Elephant"};
		
		List<String> animals =  Arrays.asList(normalAnimal);
		
		for (String ani : animals) {
			System.out.println(ani);
		}
		
	}
	
	public static void main(String[] args) {
//		DateTimeWork dateTimeWork = new DateTimeWork();
//		dateTimeWork.convertArrayToList();
		
		SortingArraysAnsList sorter = new SortingArraysAnsList();
		sorter.sortList();
	}

}
