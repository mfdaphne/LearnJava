package com.climate;

public enum Climate {

	SUMMER("Coconut") {

		@Override
		public void getDetails() {
			System.out.println("Summer details");
		}

	},

	WINTER("grapes"),

	AUTUMN("pineapple"),

	SPRING("strawberry");

	private String fruit;

	private Climate(String fruit) {
		this.fruit = fruit;
	}

	public String getFruit() {
		return fruit;
	}

	public void getDetails() {
		System.out.println("Default Details");
	}

}
