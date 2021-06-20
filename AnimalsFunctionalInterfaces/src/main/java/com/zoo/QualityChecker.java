package com.zoo;

public class QualityChecker implements IQualityOfAnimal {

	@Override
	public boolean canSwim(Animal animal) {

		if (animal.getName().equals("Lion")) {
			return animal.isSwim();
		}

		return false;
	}

	@Override
	public boolean canAnimalHop(Animal animal) {
		return animal.isHop();
	}

}
