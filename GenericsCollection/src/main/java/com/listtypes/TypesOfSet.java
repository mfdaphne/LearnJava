package com.listtypes;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TypesOfSet {

	public static void main(String[] args) {
		Set<String> hashSetAnimals = new HashSet<>();
		hashSetAnimals.add("Lion");
		hashSetAnimals.add("Tiger");

		Set<String> treeSetAnimals = new TreeSet<>();
		treeSetAnimals.add("2Lion");
		treeSetAnimals.add("1Tiger");
		treeSetAnimals.add("10Panda");
	}
}
