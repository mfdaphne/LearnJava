package com;

import com.zoo.Animal;
import com.zoo.AnimalType;

public class ZooStarter {

	public void doAccordingToAnimalType(AnimalType type) {

		switch (type) {

		case WILD:
			System.out.println("Wild");
			break;

		case DOMESTIC:
			System.out.println("Domestic");
			break;

		default:
			break;
		}
	}

	public static void main(String[] args) {
		Animal animal1 = new Animal("lion", 4, true);
		animal1.setAnimalType(AnimalType.WILD);

		Animal animal2 = new Animal("Tiger", 4, true);
		animal1.setAnimalType(AnimalType.WILD);

//		System.out.println("Are animals same ?? " + animal1.equals(animal2));

		System.out.println("Animal : " + animal1);

		System.out.println("Food animal Eats : "
				+ animal1.getAnimalType().getFoodAnimalEats());

		AnimalType.WILD.ordinal();

	}
}
