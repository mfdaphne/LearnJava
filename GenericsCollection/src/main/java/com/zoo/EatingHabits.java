package com.zoo;

public interface EatingHabits<T extends Animals> {

	void getBreakfast(T t);

	T getAnimalType(T t);
}
