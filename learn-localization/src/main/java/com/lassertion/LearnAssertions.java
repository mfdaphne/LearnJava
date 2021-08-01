package com.lassertion;

public class LearnAssertions {

	private static int addTwoNumbers(int a, int b) {
		if (a < 0 || b < 0) {
			throw new NumberFormatException();
		}

		int c = a + b;
		assert c < 10 : "Number is tooooo large";
		return c;
	}

	public static void main(String[] args) {
		System.out.println(addTwoNumbers(3, 22));
	}

}
