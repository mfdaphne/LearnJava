package com.learn.collection;

import java.util.ArrayList;
import java.util.List;

public class LearnArrayList {

	public static final String SOME_WEATHER = "ANYTHING";

	public String normal = "";

	public void normalString() {
		String[] fruits = new String[4];
		fruits[0] = "mango";
		for (String fruit : fruits) {
			System.out.println(fruit);
		}

	}

	public void mySuperArrayList() {
		List<String> superFruits = new ArrayList<String>();
		superFruits.add("mango");
		superFruits.add("orange");
		superFruits.add("apple");

//		for (int i = 0; i < superFruits.size(); i++) {
//			System.out.println(superFruits.get(i));
//		}
		System.out.println("---------------------");
		for (String fruit : superFruits) {
			System.out.println(fruit);
		}

	}

	public static void main(String[] args) {
		LearnArrayList learnArrayList = new LearnArrayList();
		learnArrayList.normalString();

		learnArrayList.mySuperArrayList();

	}

}
