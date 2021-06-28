package com.zoo;

import java.util.Comparator;

public class Animals {

	private String animalName;

	private int age;

	public String getAnimalName() {
		return animalName;
	}

	public void setAnimalName(String animalName) {
		this.animalName = animalName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static int compareByAge(Animals a, Animals b) {
		return a.getAge() - b.getAge();
	}

	public Comparator<Animals> compareAge = (a, b) -> a.age - b.age;

}
