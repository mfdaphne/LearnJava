package com.zoo;

public class Lion extends Animals implements EatingHabits<Lion> {

	private boolean veg;

	public boolean isVeg() {
		return veg;
	}

	public void setVeg(boolean veg) {
		this.veg = veg;
	}

	public String getAnimalType() {
		return "Lion";
	}

	public int getFoodQuantity() {
		return 10;
	}

	@Override
	public void getBreakfast(Lion t) {
		// TODO Auto-generated method stub

	}

	@Override
	public Lion getAnimalType(Lion t) {
		// TODO Auto-generated method stub
		return null;
	}

}
