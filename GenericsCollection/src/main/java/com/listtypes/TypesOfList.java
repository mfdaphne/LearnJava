package com.listtypes;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TypesOfList {

	public static void main(String[] args) {
		List<String> animals = new ArrayList<>();

		List<String> linkedAnimals = new LinkedList<>();
		linkedAnimals.add("Lion");

		Queue<String> dequeAnimals = new ArrayDeque<>();
		dequeAnimals.add("Lion");
		String nextElement = dequeAnimals.element();

		for (String animal : linkedAnimals) {

		}

	}
}
