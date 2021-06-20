package com.zoo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Zoo {

	public Animal lionProcessor() throws Exception {
		Animal lion = new Animal("Lion", Arrays.asList("chicken", "mutton"));
		return lion;
	}

	public static void main(String[] args) throws Exception {
		Zoo zoo = new Zoo();
		Animal lion = zoo.lionProcessor();

		List<String> foods = new ArrayList<>();

		for (int i = 0; i < lion.getFoodSize(); i++) {
			foods.add(lion.getFood(i));
		}

		foods.add("beef");

		Animal tiger = new Animal("Tiger", foods);

	}
}
