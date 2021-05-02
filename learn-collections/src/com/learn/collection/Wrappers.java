package com.learn.collection;

import java.util.ArrayList;
import java.util.List;

public class Wrappers {

	public static void main(String[] args) {

		List<Integer> climateList = new ArrayList<Integer>();
		climateList.add(2);

		int a = 20;
		Integer age = a;
		int convertedFromWrap = age.intValue();

		String height = "160";
		int h = Integer.parseInt(height);

		Double weight = Double.valueOf(2.2);

		List<Double> climateDouble = new ArrayList<Double>();

	}

}
