package com.learn.collection;

public class PalindromCheck {

	public static void main(String[] args) {

		String name = "radar";
		StringBuilder sb = new StringBuilder(name);
		sb.reverse();
		if (name.equals(sb.toString())) {
			System.out.println("Its a palindrome");
		} else {
			System.out.println("Not a palindrome");
		}

	}

}
