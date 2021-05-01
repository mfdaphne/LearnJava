package com.solution;

import java.util.Scanner;

public class AssignmentTwo {

	private void solnOne() {
		System.out.println("Hello, World");
		System.out.println("Hello, Java");
	}

	private void solnTwo(int n) {

		if (n % 2 != 0) {
			System.out.println("WEIRD");

		} else if (n % 2 == 0) {

			if (n >= 10 && n <= 20) {
				System.out.println("NOT WEIRD");

			} else if (n >= 30 && n <= 100) {
				System.out.println("WEIRD");

			} else if (n > 100) {
				System.out.println("NOT WEIRD");
			}

		}

	}

	private void solnThreePrintMultiples(int multiplesNo) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(multiplesNo + " x " + i + " = " + multiplesNo * i);
		}

	}

	private void solnFourNameStraightPrint(String name) {
		for (int i = 0; i < name.length(); i++) {
			System.out.print(name.charAt(i));
		}

	}

	private void solnFiveNameReversePrint(String name) {
		for (int i = name.length() - 1; i >= 0; i--) {
			System.out.print(name.charAt(i));
		}
		System.out.println();

	}

	private void solnSixEvenOdd() {
		for (int i = 0; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.println(i + " - Even");
			} else {
				System.out.println(i + " - Odd");
			}
		}

	}

	private void solnSevenDivisibleCheck() {
		System.out.println("Numbers divisible by 3 : ");
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		System.out.println("Numbers divisible by 5 : ");
		for (int i = 1; i <= 100; i++) {
			if (i % 5 == 0) {
				System.out.print(i + " ");
			}
		}

		System.out.println();
		System.out.println("Numbers divisible by 3 and 5 : ");
		for (int i = 1; i <= 100; i++) {
			if (i % 5 == 0 && i % 3 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();

	}

	private void printPatternOne(int n) {

		for (int i = 0; i < n; i++) {

			for (int j = 0; j < n; j++) {
				System.out.print("* ");
			}

			System.out.println(" ");

		}
	}

	private void printPatternTwo(int n) {

		for (int i = 0; i < n; i++) {

			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}

			System.out.println("");
		}

	}

	private void printtPatternThree(int n) {
		for (int i = 0; i < n; i++) {

			for (int j = n - i; j >= 0; j--) {
				System.out.print(" ");
			}

			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	private void printPatternFour(int n) {

		for (int i = 0; i < n; i++) {
			for (int j = n - i; j > 1; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}

			System.out.println();
		}
	}

	private void printPatternFive(int n) {
		int count = 1;
		for (int i = 0; i < n; i++) {
			for (int j = n - i; j > 1; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print(count + " ");
			}
			count++;
			System.out.println();
		}

	}

	private void problemSolution(int problemNo) {

		Scanner scanner = new Scanner(System.in);

		switch (problemNo) {
		case 1:
			System.out.println("Solution-1");
			solnOne();
			break;
		case 2:
			System.out.println("---------------------------");
			System.out.println("Solution-2");
			System.out.print("Enter the no. to analyze : ");
			int oddEven = scanner.nextInt();
			solnTwo(oddEven);
			break;
		case 3:
			System.out.println("---------------------------");
			System.out.println("Solution-3");
			System.out.print("Enter the no. to print multiples : ");
			int multiplesNo = scanner.nextInt();
			solnThreePrintMultiples(multiplesNo);
			break;
		case 4:
			System.out.println("---------------------------");
			System.out.println("Solution-4");
			System.out.print("Enter name to print straight : ");
			String name = scanner.next();
			solnFourNameStraightPrint(name);
			break;
		case 5:
			System.out.println();
			System.out.println("Solution-5");
			System.out.print("Enter name to print straight : ");
			String name1 = scanner.next();
			solnFiveNameReversePrint(name1);
			break;
		case 6:
			System.out.println("---------------------------");
			System.out.println("Solution-6");
			solnSixEvenOdd();
			break;
		case 7:
			System.out.println("---------------------------");
			System.out.println("Solution-7");
			solnSevenDivisibleCheck();
			break;
		case 8:
			System.out.println("---------------------------");
			System.out.println("Solution-8");
			System.out.print("Please enter value of n for printing Patterns : ");
			int n = scanner.nextInt();

			printPatternOne(n);
			System.out.println("---------------------------");

			printPatternTwo(n);
			System.out.println("---------------------------");

			printtPatternThree(n);
			System.out.println("---------------------------");

			printPatternFour(n);
			System.out.println("---------------------------");

			printPatternFive(n);
			System.out.println("---------------------------");
			break;

		}
		scanner.close();
	}

	public static void main(String[] args) {
		AssignmentTwo assignTwo = new AssignmentTwo();

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter problem no: ");
		int problemNo = scan.nextInt();
		assignTwo.problemSolution(problemNo);

		scan.close();
	}

}
