package com.school.club;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FootballTeam {

	public static void main(String[] args) {
		List<Player> players = new ArrayList<>();
		Player player1 = Player.builder().withAge(55).withName("Sachin")
				.withRanking(2).build();
		Player player2 = Player.builder().withAge(34).withName("Virat")
				.withRanking(10).build();

		players.add(player1);
		players.add(player2);

		players.add(Player.builder().withAge(22).withName("Rahul")
				.withRanking(23).build());
		players.add(Player.builder().withAge(18).withName("Sehwag")
				.withRanking(15).build());

		System.out.println("Before Sort");
		System.out.println(players);

		System.out.println("-------------------");
		System.out.println("Sort By Name");

		Comparator<Player> compareByName = (a, b) -> a.getName()
				.compareTo(b.getName());
		Collections.sort(players, compareByName);
		System.out.println(players);

		System.out.println("-------------------");
		System.out.println("Sort By Age Ascending");
		Comparator<Player> compareByAge = (a, b) -> a.getAge() - b.getAge();
		Collections.sort(players, compareByAge);
		System.out.println(players);

		System.out.println("-------------------");
		System.out.println("Sort By Age Descending");
		Comparator<Player> compareByAgeDesc = (a, b) -> b.getAge() - a.getAge();
		Collections.sort(players, compareByAgeDesc);
		System.out.println(players);

		System.out.println("-------------------");
		System.out.println("Sort By Ranking");
		Comparator<Player> compareByRank = (a, b) -> a.getRanking()
				- b.getRanking();
		Collections.sort(players, compareByRank);
		System.out.println(players);
	}
}
