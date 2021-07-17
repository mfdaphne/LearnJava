package com.school.sports;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SportsClub {

	public static void main(String[] args) {
		List<Sport> sports = new ArrayList<>();
		sports.add(Sport.builder().withId(200).withName("Football").build());
		sports.add(Sport.builder().withId(2).withName("Basketball").build());
		sports.add(Sport.builder().withId(4).withName("Tennis").build());
		sports.add(Sport.builder().withId(1000).withName("Cricket").build());

		System.out.println("Before Sort : " + sports);

		Comparator<Sport> compareById = (a, b) -> a.getId() - b.getId();

		Collections.sort(sports, compareById);

		Comparator<Sport> compareByName = (a, b) -> a.getName()
				.compareTo(b.getName());
		Collections.sort(sports, compareByName);

	}
}
