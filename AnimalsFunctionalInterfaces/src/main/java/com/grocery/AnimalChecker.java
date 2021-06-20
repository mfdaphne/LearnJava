package com.grocery;

import com.zoo.Animal;

@FunctionalInterface
public interface AnimalChecker {

	boolean checkAnimals(Animal animal);
}
