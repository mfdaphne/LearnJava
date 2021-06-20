package com.grocery;

import java.util.function.Predicate;

import com.zoo.Animal;

public class GroceryUsingPredicates {

	private Predicate<String> groceryFromIndia = (String veg) -> {
		if (veg.equals("Cabbage")) {
			return true;
		}
		return false;
	};

	private Predicate<String> groceryFromGermany = (String veg) -> {
		if (veg.equals("Green Cabbage")) {
			return true;
		}
		return false;
	};

	private Predicate<Animal> animalWild = (Animal animal) -> {
		if (animal.isHop()) {
			return false;
		}
		return true;
	};

	public void validateGrocery(String vegetable, Predicate<String> grocery) {
		grocery.test(vegetable);
	}

	public void checkCountry() {
		validateGrocery("Cabbage", groceryFromGermany);
		validateGrocery("Red Cabbage", groceryFromIndia);
	}
}
