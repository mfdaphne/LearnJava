package com.assignment;

import java.util.Arrays;
import java.util.List;

public class Society {

	public static void main(String[] args) {
		Housing house = new Housing();

		Pair<Integer, ConditionOfHouse> houseProp = new Pair<>(
				Integer.valueOf(12000), ConditionOfHouse.EXCELLENT);
		house.setHouse(houseProp);

		Committee committee = new Committee();
		Pair<String, List<Housing>> commProp = new Pair<>("President",
				Arrays.asList(house));
		committee.setCommittee(commProp);

	}

}
