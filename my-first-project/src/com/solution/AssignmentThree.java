package com.solution;

import java.util.Scanner;

public class AssignmentThree {

//	1. Find quotient and reminder of a number
	private void findQuotientAndReminder(int inputNo, int divisor) {
		System.out.println("Quotient : " + inputNo / divisor + ", Reminder : " + inputNo % divisor);
	}

//	2. Find duplicate characters in a string
	private void findDuplicateCharactersInString(String inputStr) {
		int sizeOfStr = inputStr.length();

		for (int i = 0; i < sizeOfStr; i++) {
			for (int j = i + 1; j < sizeOfStr; j++) {
				if (inputStr.charAt(i) == inputStr.charAt(j)) {
					System.out.print(inputStr.charAt(j) + " ");
					break;
				}
			}
		}
	}

//	3. Find occurrence of a character in a string
	private int findOccurenceOfCharacterInString(String inputStr, char charToFind) {

		int sizeOfStr = inputStr.length();

		int count = 0;

		for (int i = 0; i < sizeOfStr; i++) {
			if (inputStr.charAt(i) == charToFind) {
				count++;
			}

		}
		return count;
	}

//	4. Find sum of all numbers in n.
	private int findSumOfAllNumbers(int n) {
		int sum = 0;
		for (int i = 1; i < n + 1; i++) {
			sum = sum + i;
		}
		return sum;
	}

//	5. Find largest of 3 numbers
	private int findLargestOfGivenNumbers(int a, int b, int c) {
		if (a > b && a > c) {
			return a;
		} else if (b > c) {
			return b;
		}
		return c;
	}

//	6. Find smallest of 3 numbers
	private int findSmallestOfGivenNumbers(int a, int b, int c) {
		if (a < b && a < c) {
			return a;
		} else if (b < c) {
			return b;
		}
		return c;
	}

//	7. Write a program to get mark of students, and calculate percentage.
//	At the end Provide grade according to average Mark scored.
	private char findGradeFromMarks(int[] marks) {
		double sum = 0;
		for (int i = 0; i < marks.length; i++) {
			sum = sum + marks[i];
		}

		double percentage = (sum / (marks.length * 100)) * 100;
		if (percentage == 100) {
			return 'S';
		} else if (percentage >= 90 && percentage < 100) {
			return 'A';
		} else if (percentage >= 80 && percentage < 90) {
			return 'B';
		} else if (percentage >= 70 && percentage < 80) {
			return 'C';
		} else if (percentage >= 60 && percentage < 70) {
			return 'D';
		} else if (percentage >= 50 && percentage < 60) {
			return 'E';
		}
		return 'U';
	}

	private void assignmentThreeSwitch(int questionNo) {
		Scanner scan = new Scanner(System.in);

		switch (questionNo) {
		case 1:
			System.out.print("Enter input no. and divisor with same : ");
			int inputNo = scan.nextInt();
			int divisor = scan.nextInt();

			findQuotientAndReminder(inputNo, divisor);
			break;

		case 2:
			System.out.print("Enter string to find duplicate characters : ");
			findDuplicateCharactersInString(scan.next());
			break;

		case 3:
			System.out.print("Enter string to find Occurence of character : ");
			String inputStr = scan.next();
			System.out.print("Enter character to find in String : ");
			char charToFind = scan.next().charAt(0);
			int count = findOccurenceOfCharacterInString(inputStr, charToFind);
			System.out.println(charToFind + " - " + count);
			break;

		case 4:
			System.out.print("Enter number to find cumulative Sum : ");
			int n = scan.nextInt();
			int sum = findSumOfAllNumbers(n);
			System.out.println("Sum is : " + sum);
			break;

		case 5:
			System.out.print("Enter numbers to find largest of them: ");
			int largest = findLargestOfGivenNumbers(scan.nextInt(), scan.nextInt(), scan.nextInt());
			System.out.println("Largest is " + largest);
			break;

		case 6:
			System.out.print("Enter numbers to find smallest of them: ");
			int smallest = findSmallestOfGivenNumbers(scan.nextInt(), scan.nextInt(), scan.nextInt());
			System.out.println("Smallest is " + smallest);
			break;

		case 7:
			System.out.print("Enter subject marks out of 100 for 5 subjects : ");
			int[] subjectMarks = new int[5];
			for (int i = 0; i < 5; i++) {
				subjectMarks[i] = scan.nextInt();
			}
			char grade = findGradeFromMarks(subjectMarks);
			System.out.println("Grade is :" + grade);
			break;

		}

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		AssignmentThree assThree = new AssignmentThree();
		boolean shouldRepeat = true;

		while (shouldRepeat) {
			System.out.print("Enter question :");
			assThree.assignmentThreeSwitch(scan.nextInt());

			System.out.println();
			System.out.print("Do you want to continue ? Press 1 to continue, 2 to exit - ");
			int reply = scan.nextInt();
			if (reply == 2) {
				shouldRepeat = false;
			}

		}
		scan.close();
	}

}
