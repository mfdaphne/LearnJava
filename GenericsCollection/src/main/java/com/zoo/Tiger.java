package com.zoo;

public class Tiger extends Animals {

	private boolean swim;

	public boolean isSwim() {
		return swim;
	}

	public void setSwim(boolean swim) {
		this.swim = swim;
	}

	public String getAnimalType() {
		return "Tiger";
	}

	public int getFoodQuantity() {
		return 20;
	}
}
