package com.school.library;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SchoolLibrary {

	public static void main(String[] args) {
		List<Book> books = new ArrayList<>();

		Book book1 = Book.builder().withSerialNo(Integer.valueOf(22))
				.withName("Harry Potter").withGenre("Kids").build();

		Book book2 = Book.builder().withSerialNo(Integer.valueOf(100))
				.withName("ABCD").withGenre("Kids").build();

		Book book3 = Book.builder().withSerialNo(Integer.valueOf(1))
				.withName("Chemistry").withGenre("Romance").build();

		Book book4 = Book.builder().withSerialNo(Integer.valueOf(2))
				.withName("Java").withGenre("Education").build();

		books.add(book1);
		books.add(book2);
		books.add(book3);
		books.add(book4);

		System.out.println("Before Sort");
		System.out.println(books);

		Collections.sort(books);
		System.out.println("-------------------------------------");
		System.out.println("After Sort");
		System.out.println(books);

	}

}
