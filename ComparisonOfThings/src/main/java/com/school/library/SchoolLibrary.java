package com.school.library;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class SchoolLibrary {

	public static int compareBySerialNo(Book b1, Book b2) {
		return b1.getSerialNo() - b2.getSerialNo();
	}

	public String printSerialNo() {
		System.out.println("1234");
		return "ABC";
	}

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

		SchoolLibrary schoolLibrary = new SchoolLibrary();

		Comparator<Book> compareBySerialNo1 = (b1, b2) -> {
			return schoolLibrary.compareBySerialNo(b1, b2);
		};

		Comparator<Book> comparaBySeNo = SchoolLibrary::compareBySerialNo;

		Collections.sort(books, comparaBySeNo);

	}

	public void bringBook(List<Book> books) {
		Predicate<Book> serialNoCondition = (book) -> {
			if (book.getSerialNo() < 100) {
				return true;
			}
			return false;
		};

		books.removeIf(serialNoCondition);

		UnaryOperator<Book> bookGenre = (book) -> {
			book.setGenre("Tamil Literature");
			return book;
		};

		books.replaceAll(bookGenre);

		books.forEach(System.out::println);
	}

	public void mappingBooks(Map<String, Book> books) {

		Book book1 = Book.builder().withGenre("Romance").build();
		books.put("A001", book1);

	}

}
