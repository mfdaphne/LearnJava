package com.zoo;

import java.util.ArrayList;
import java.util.List;

public class Zoo<T extends Animals, U, K extends Animals>
		implements EatingHabits<K> {

	private List<T> animals = new ArrayList<>();

	public void processAnimals(T t) {
		animals.add(t);
	}

	public void processPlants(U u) {
		if (u instanceof String) {
			System.out.println(u);
		} else if (u instanceof Plants) {
			((Plants) u).showGreenery();
		}
	}

	public void printAnimals() {
		for (T t : animals) {
			System.out.println(t.getAnimalName());
		}
	}

	public static void main(String[] args) {

		Lion lion = new Lion();
		lion.setAge(20);
		lion.setVeg(false);
		lion.setAnimalName("LION");

		Plants plant = new Plants();

		Zoo<Lion, Plants, Tiger> lionsZoo = new Zoo<>();
		lionsZoo.processAnimals(lion);
		lionsZoo.printAnimals();
		lionsZoo.processPlants(plant);

		Tiger tiger = new Tiger();
		tiger.setSwim(true);

		Zoo<Tiger, String, Tiger> tigerZoo = new Zoo<>();
		tigerZoo.processAnimals(tiger);
		lionsZoo.printAnimals();
		tigerZoo.processPlants("Some plants");

	}

	@Override
	public void getBreakfast(K t) {
		// TODO Auto-generated method stub

	}

	@Override
	public K getAnimalType(K t) {
		// TODO Auto-generated method stub
		return null;
	}

}
