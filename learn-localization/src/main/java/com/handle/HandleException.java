package com.handle;

import java.util.Scanner;

public class HandleException {

	public void playingInPark() {

		try (Scanner scan = new Scanner(System.in);
				Scanner scan1 = new Scanner(System.in)) {

			int a = scan.nextInt();
			letsWalk();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private void letsWalk() throws Exception {
		throw new Exception();

	}

	public static void suppressedBooks() {
		try (Book book = new Book()) {

			throw new IllegalArgumentException("Book is opened !!!! ");

		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());

			for (Throwable exc : e.getSuppressed()) {
				System.out.println(exc.getMessage());
			}
		}
	}

	public static void main(String[] args) {
		suppressedBooks();
	}

}
