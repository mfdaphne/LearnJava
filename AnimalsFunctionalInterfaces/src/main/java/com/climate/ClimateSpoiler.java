package com.climate;

public enum ClimateSpoiler {

	SUMMER("Coconut"), WINTER("grapes"), AUTUMN("pineapple"),
	SPRING("strawberry");

	private String fruit;

	private ClimateSpoiler(String fruit) {
		this.fruit = fruit;
	}

	public String getFruit() {
		return fruit;
	}

}
