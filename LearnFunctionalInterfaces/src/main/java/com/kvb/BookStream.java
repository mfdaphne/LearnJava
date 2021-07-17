package com.kvb;

import java.util.IntSummaryStatistics;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class BookStream {

	public static void main(String[] args) {
		Stream<String> books = Stream.of("book1", "book2", "book3");
		Stream<String> map = books.map((a) -> a + "some");
		map.forEach(System.out::println);

		Book book1 = Book.builder().withName("book1").withGenre("Fiction")
				.withSerialNo(101).build();
		Book book2 = Book.builder().withName("book2").withGenre("Romance")
				.withSerialNo(100).build();
		Book book3 = Book.builder().withName("book3").withGenre("Literature")
				.withSerialNo(102).build();

		Stream<Book> booksStream = Stream.of(book1, book2, book3);
		booksStream.map(b -> {
			Book a = b;
			a.setName(b.getName() + " some");
			return a;
		}).forEach(System.out::println);

		Optional<Double> some = Optional.of(23.3);

		Stream.generate(() -> 222).filter(a -> a == 222).limit(2).sorted()
				.forEach(System.out::println);

		Stream.iterate(1, x -> x + 3);

		IntStream st = IntStream.of(1, 2, 3, 4);

		IntSummaryStatistics sum = st.summaryStatistics();
	}
}
