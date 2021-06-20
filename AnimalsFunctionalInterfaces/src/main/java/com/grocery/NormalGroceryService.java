package com.grocery;

public class NormalGroceryService {

	public void validateGrocery(String vegetable, Grocery grocery) {
		grocery.checkGroceryIsGreen(vegetable);
	}

	public void checkCountry() {
		validateGrocery("Cabbage", new GroceryFromGermany());
		validateGrocery("Red Cabbage", new GroceryFromIndia());
	}

}
