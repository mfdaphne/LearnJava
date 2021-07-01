package com.zoo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ZooOwner {

	public <T extends Animals> void getAnimal(T t) {
		t.getAnimalName();
	}

	public static void main(String[] args) {
		Lion lion = new Lion();
		lion.setAnimalName("LION");

		ZooOwner zooOwner = new ZooOwner();
		zooOwner.getAnimal(lion);

		List<? extends Animals> animalsExt = new ArrayList<>();

		List<? super EatingHabits<?>> anything = new ArrayList<>();
		anything.add(lion);

		Comparator<Animals> compareByAge = Animals::compareByAge;

	}
}
