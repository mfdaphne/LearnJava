package com.zoo;

import java.util.function.Predicate;

public class ZooMaintenance {

	public void checkMyAnimalCanSwim(Animal animal, IQualityOfAnimal quality) {

		quality.canSwim(animal);

	}

	public void checkMyAnimalCanHop(Animal animal, IQualityOfAnimal quality) {

		quality.canAnimalHop(animal);

	}

	public void checkAnimalUsingFI(Animal animal,
			Predicate<Animal> animalPredicate) {

		animalPredicate.test(animal);
	}

	public static void main(String[] args) {
		ZooMaintenance zoo = new ZooMaintenance();

		Animal lion = new Animal("Lion", true, false);
		IQualityOfAnimal quality = new QualityChecker();

		zoo.checkMyAnimalCanSwim(lion, quality);

		zoo.checkAnimalUsingFI(lion, (Animal a) -> {
			return a.isHop();
		});

		zoo.checkAnimalUsingFI(lion, a -> a.isSwim());
		zoo.checkAnimalUsingFI(lion, checkCanSwim());
	}

	private static Predicate<Animal> checkCanSwim() {
		return (a) -> {
			if (a.equals("lion")) {
				return true;
			}
			return a.isSwim();
		};
	}
}
