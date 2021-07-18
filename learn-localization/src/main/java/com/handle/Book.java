package com.handle;

public class Book implements AutoCloseable {

	public void searchBooks() {
		// TODO Auto-generated method stub

	}

	@Override
	public void close() throws IllegalArgumentException {
		System.out.println("Trying to close book");
		throw new IllegalArgumentException("Book cannot be closed");

	}
}
