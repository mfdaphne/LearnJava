package com.grocery;

public class GroceryFromIndia implements Grocery {

	@Override
	public boolean checkGroceryIsGreen(String vegetable) {
		if (vegetable.equals("Cabbage")) {
			return true;
		}
		return false;
	}

}
