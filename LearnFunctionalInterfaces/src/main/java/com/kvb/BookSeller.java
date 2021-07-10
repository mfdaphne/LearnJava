package com.kvb;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.LongSupplier;
import java.util.function.ObjIntConsumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToDoubleFunction;
import java.util.function.UnaryOperator;

public class BookSeller {

	private String name;

	public String getName() {
		return this.name;
	}

	public void bookSellersLibrary() {
		SchoolLibrary schoolLibrary = () -> {
			System.out.println("This is sellers Library");
		};

		book1(schoolLibrary);

		SchoolLibrary schoolLibrary2 = () -> {
			System.out.println("This is buyers Library");

		};
		book1(schoolLibrary2);

	}

	public void book1(SchoolLibrary schoolLibrary) {
		schoolLibrary.getBook();
	}

	public static void main(String[] args) {
		BookSeller bookSeller = new BookSeller();
		bookSeller.bookSellersLibrary();

		Predicate<BookSeller> pre = (bs) -> {
			if (bs.getName().equals("Daphne")) {
				return true;
			}
			return false;
		};

		pre.test(bookSeller);
	}

	public void functionCheck() {
		Function<Integer, Book> funct = (a) -> {
			Book book = Book.builder().withSerialNo(a).build();
			return book;
		};

		funct.apply(2);

		IntFunction<Book> intFunc = (a) -> {
			Book book = Book.builder().withSerialNo(a).build();
			return book;
		};

		intFunc.apply(Integer.valueOf(2));

		Predicate<Integer> checkEven = (a) -> {
			if (a % 2 == 0) {
				return true;
			}
			return false;
		};

		IntPredicate checkOdd = (a) -> {
			if (a % 2 == 0) {
				return true;
			}
			return false;
		};

		Function<Integer, Boolean> checkEvenF = (a) -> {
			if (a % 2 == 0) {
				return Boolean.TRUE;
			}
			return Boolean.FALSE;
		};

		BiFunction<Integer, Book, Boolean> checkBiF = (a, book) -> {
			return true;
		};
	}

	public void checkIntFI() {

		ToDoubleFunction<Book> checkSerialNo = (book) -> {
			if (book.getSerialNo() < 100) {
				return 100;
			}
			return -1;
		};

	}

	BiPredicate<List<Book>, Integer> compareTwoNumbers = (books, b) -> {

		for (Book book : books) {
			if (book.getSerialNo() < b) {
				return true;
			}
		}
		return false;
	};

	UnaryOperator<Book> processMyBook = (name) -> {
		Book b = Book.builder().build();
		return b;
	};

	BinaryOperator<Integer> someOp = (a, b) -> {
		return 3;
	};

	Supplier<Book> supplyBooks = () -> {
		Book b = Book.builder().build();
		return b;
	};

	LongSupplier getBookId = () -> {
		return 23435645655l;
	};

	Consumer<Book> consumeBooks = (book) -> {
		System.out.println("hfjdsghjkh");
	};

	BiConsumer<Book, Integer> processBooks = (book, a) -> {
		System.out.println(a);
	};

	ObjIntConsumer<Book> processBooks2 = (book, a) -> {
		System.out.println(a);
	};

}
