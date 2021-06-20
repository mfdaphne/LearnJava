package com.zoo;

public enum AnimalType {

	WILD("NonVeg", 100) {
		@Override
		public void getSwimmingSkills() {
			System.out.println("Can Swim");

		}
	},

	DOMESTIC("Veg", 20) {
		@Override
		public void getSwimmingSkills() {
			System.out.println("CANNOT SWIM");
		}
	},

	BIRDS("Seeds", 5) {

		@Override
		public void getWeather() {
			System.out.println("Its Sunny here");
		}

		@Override
		public void getSwimmingSkills() {
			System.out.println("Cannot Swim longer than 1m");
		}

	};

	private String foodAnimalsEat;

	private int lifeSpan;

	private AnimalType(String foodType, int lifeSpan) {
		this.foodAnimalsEat = foodType;
		this.lifeSpan = lifeSpan;
	}

	public String getFoodAnimalEats() {
		return foodAnimalsEat;
	}

	public int getLifeSpan() {
		return lifeSpan;
	}

	public void getWeather() {
		System.out.println("Its Raining everywhere");
	}

	public abstract void getSwimmingSkills();

}
