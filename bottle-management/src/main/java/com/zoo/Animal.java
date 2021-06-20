package com.zoo;

import java.util.ArrayList;
import java.util.List;

public class Animal {

	private String species;

	private List<String> foods;

	public Animal(String species, List<String> foods) throws Exception {
		this.species = species;
		if (foods == null) {
			throw new Exception("Food shouldnt be empty");
		}
		this.foods = new ArrayList<>(foods);
	}

	public String getSpecies() {
		return species;
	}

	public int getFoodSize() {
		return foods.size();
	}

	public String getFood(int index) {
		return foods.get(index);
	}

}
