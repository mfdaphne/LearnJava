package com.learn.collection;

import java.util.Arrays;

public class ArraySortingAndSearch {

	public void processWeights(int[] weights) {

		Arrays.sort(weights);

		int binarySearch = Arrays.binarySearch(weights, 1);

		System.out.println(binarySearch);

	}

	public static void main(String[] args) {

		ArraySortingAndSearch sortAndSearch = new ArraySortingAndSearch();

		int[] weights = { 4, 2, 90, 66, 23, 12 };
		sortAndSearch.processWeights(weights);
	}

}
