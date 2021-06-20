package com.grocery;

public class GroceryFromGermany implements Grocery {

	@Override
	public boolean checkGroceryIsGreen(String vegetable) {
		if (vegetable.equals("Green Cabbage")) {
			return true;
		}
		return false;
	}

}
