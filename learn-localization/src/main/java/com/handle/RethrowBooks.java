package com.handle;

import org.apache.commons.math3.exception.NumberIsTooLargeException;
import org.apache.commons.math3.exception.NumberIsTooSmallException;

public class RethrowBooks {

	public void readBooks(int i)
			throws NumberIsTooSmallException, NumberIsTooLargeException {
		if (i < 10) {
			throw new NumberIsTooSmallException(i, 10, false);
		} else {
			throw new NumberIsTooLargeException(i, 100, false);
		}
	}

	public static void main(String[] args) {
		RethrowBooks rb = new RethrowBooks();

		try {
			rb.readBooks(20);

		} catch (Exception e) {
			e.printStackTrace();

			throw e;
		}

	}

}
