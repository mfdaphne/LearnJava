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

		Comparator<Sport> compareById = new Comparator<>() {

			@Override
			public int compare(Sport sport1, Sport sport2) {
				return sport1.getId() - sport2.getId();
			}

		};

		Comparator<Sport> compareByIdFI = (sport1, sport2) -> {
			return sport1.getId() - sport2.getId();
		};

		Comparator<Sport> compareByNameFI = (sport1, sport2) -> sport1.getName()
				.compareTo(sport2.getName());

		System.out.println("Before Sort");
		System.out.println(sports);

		Collections.sort(sports, compareByNameFI);
		System.out.println("-------------------------------------");
		System.out.println("After Sort");
		System.out.println(sports);

	}
}
