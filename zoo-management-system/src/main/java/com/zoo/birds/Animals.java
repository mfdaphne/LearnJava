package com.zoo.birds;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Animals {

	public static final int QUANTITY = 100;

	static {
	}

	public void processZoo() {
		String[] animals = new String[3];
		animals[0] = "Lion";
		animals[1] = "Tiger";
		animals[2] = "Leopard";

		String[] foods = { "chicken", "mutton" };

		String[] anim_2 = { "Lion", "Tiger" };

		for (int i = 0; i < animals.length; i++) {
			System.out.println(animals[i]);

		}

		outerAnimal: for (String ani : animals) {
			System.out.println(ani);

			innerFood: for (String food : foods) {
				if (food.equals("chicken")) {
					break;
				}
				System.out.println(food);
			}
		}

		int i = 0;

		while (i < animals.length) {
			System.out.println(animals[i]);

			i++;
		}

	}

	public void checkIfNumberIsEven(int no) {
		if (no % 2 == 0) {
			System.out.println("Its even number");
		} else {
			System.out.println("Its odd");
		}

	}

	public void animalSwitch(int i) {

		switch (i) {
		case 1:
			System.out.println("condition is 1");
			break;
		case 2:
			System.out.println("Condition is 2");
			break;
		case 3:
			System.out.println("Condition is 3");
			break;
		default:
			System.out.println("default execution");
			break;

		}

	}

	public void castingOfObjects() {

		float i = 10.3f;
		float j = 20.4f;

		int k = (int) (i + j);

		String str = String.valueOf(k);

		String str2 = "10";

		String str3 = str + str2; // 3010

		String name = "daphne";
		name = name.toUpperCase();

		StringBuilder strBuilder = new StringBuilder();
		strBuilder.append("Lion is sleeping");
		strBuilder.charAt(3);
		strBuilder.indexOf("n");
		strBuilder.substring(0, 5);

		String s = strBuilder.toString();
	}

	public void nestedLoop() {
		int[][] set = { { 3, 2 }, { 5, 6, 7 }, { 1, 33, 44, 55, 66, 55 } };

		int i = set[0][0];

	}

	public void arrayListConcepts() {

		int[] nos = { 2, 5, 8, 9, 100, 4 };
		Arrays.sort(nos);

		List<String> animals = new ArrayList<>();
		animals.add("Lion");
		animals.add("Tiger");

		List<Integer> ages = new ArrayList<>();
		ages.add(2);
		ages.add(5);
		ages.add(10);
		ages.add(1);
		ages.add(100);

		Collections.sort(ages);

		ages.remove(1);

		List<Float> foods = new ArrayList<>();

		float f = 4.4f;

		Float ff = Float.valueOf(4.4f);
		Integer ii = Integer.valueOf(400);

	}

	public static int addTwoNumbers(int a, int b) {
		int c = a + b;
		return c;
	}

}
