package com.learn.collection;

public class Experiment {

	public String evaluateValue(int n) {
		return n > 5 ? "Big" : "Small";
	}

	public void evaluateWhileLoop(int n) {

		while (n > 10) {
			System.out.println("Print this");
		}

	}

	public void evaluateDoWhile(int n) {

		do {
			System.out.println("Inside Do while loop");
		} while (n > 10);

	}

	public void enhancedForLoop() {

		int[] x = { 2, 4, 5, 7 };

		myLabel: for (int i = 0; i < x.length; i++) {
			System.out.println(x[i]);

		}

		for (int i : x) {
			System.out.println(i);
		}

		String[] cities = { "Cologne", "Düsseldorf" };

		for (String city : cities) {
			System.out.println(city);
		}

	}

	public <optionalLabel> void nestedLoops() {

		int[] x, y[];

		int[] age = { 20, 21, 30, 45, 55 };

		int multiDim[][] = new int[2][3];

		multiDim[0][0] = 1;
		multiDim[0][1] = 2;
		multiDim[0][2] = 3;
		multiDim[1][0] = 4;
		multiDim[1][1] = 5;
		multiDim[1][2] = 10;

		int[][] boxes = { { 1, 2, 3 }, { 4, 5, 10 } };

		for (int[] box : boxes) {

			for (int value : box) {
				System.out.println(value);

			}
		}

	}

	public void learnOptionalLabels() {

		String[][] names = { { "fox", "wolf" }, { "lion" }, { "tiger" } };

		externalLoop: for (String[] name : names) {

			internalLoop: for (String value : name) {

				if (value.equals("fox")) {
					break externalLoop;
				}

				if (value.equals("lion")) {
					continue internalLoop;
				}

				System.out.println("Reached here");
			}

		}
	}

	public void learnContinue() {

		int[][] buildings = { { 4, 5, 6, 7 }, { 29, 12, 22, 55 } };

		ext: for (int[] building : buildings) {
			intr: for (int value : building) {

				if (value < 10) {
					System.out.println(value);
					continue intr;
				}

				System.out.println("Ext - " + value);

			}
		}

	}

	public static void main(String[] args) {

		Experiment exp = new Experiment();
		exp.learnContinue();
	}
}
