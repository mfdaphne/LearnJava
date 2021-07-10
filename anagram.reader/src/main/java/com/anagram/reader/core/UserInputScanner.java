package com.anagram.reader.core;

import java.util.Scanner;

public class UserInputScanner {

	private static Scanner scanner;

	public static Scanner getScannerInstance() {
		if (scanner != null) {
			return scanner;
		}
		return new Scanner(System.in);
	}

	public static void closeScanner() {
		if (scanner != null) {
			scanner.close();
		}
	}
}
