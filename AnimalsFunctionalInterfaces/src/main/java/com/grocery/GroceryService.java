package com.grocery;

public class GroceryService {

	private Grocery groceryFromIndia = (String veg) -> {
		if (veg.equals("Cabbage")) {
			return true;
		}
		return false;
	};

	private Grocery groceryFromGermany = (String veg) -> {
		if (veg.equals("Green Cabbage")) {
			return true;
		}
		return false;
	};

	public void validateGrocery(String vegetable, Grocery grocery) {
		grocery.checkGroceryIsGreen(vegetable);
	}

	public void checkCountry() {
		validateGrocery("Cabbage", groceryFromGermany);
		validateGrocery("Red Cabbage", groceryFromIndia);
	}
}
