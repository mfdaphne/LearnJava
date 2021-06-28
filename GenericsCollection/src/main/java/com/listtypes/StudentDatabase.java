package com.listtypes;

import java.util.HashMap;
import java.util.Map;

import com.zoo.Animals;
import com.zoo.Lion;

public class StudentDatabase {

	public static void main(String[] args) {
		Map<Integer, Animals> animalsDb = new HashMap<>();
		animalsDb.put(1, new Animals());

		animalsDb.put(2, new Lion());

		for (Integer key : animalsDb.keySet()) {
			animalsDb.get(key);
		}

	}
}
