package com.learn.collection;

public class LearnForEach {

	public void justAMethod() {

		int[] weights = { 10, 20, 30, 66, 9 };

		for (int i = 0; i < weights.length - 1; i++) {

			System.out.println(weights[i] + "- next element is " + weights[i + 1]);

		}

		int sum = 0;

		mainLabel: for (int weight : weights) {
			sum = +weight;

			if (sum > 30) {
				break mainLabel;
			}

		}

		System.out.println(sum);

	}

	public static void main(String[] args) {
		LearnForEach le = new LearnForEach();
		le.justAMethod();

	}

}
