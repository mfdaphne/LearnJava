package com.learn.collection;

import java.util.Scanner;

public class LearnStringBuilder {

	private String operator = "";

	private StringBuilder stringBuilder = new StringBuilder();

	public void buildMyPassage(String name) {

//		System.out.println("Length : " + stringBuilder.length());
//		System.out.println("Char At : " + stringBuilder.charAt(0));

		operator = stringBuilder.reverse().append(name).toString();
	}

	public String getOperator() {
		return operator;
	}

	public void compareString(String a, String b) {

		if (a.equals(b)) {

		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		LearnStringBuilder builder = new LearnStringBuilder();

		for (int i = 0; i < 2; i++) {
			System.out.print("Enter a String " + i + " - ");
			builder.buildMyPassage(scanner.next());

		}

		System.out.println("Appended String " + builder.getOperator());

		scanner.close();

	}

}
