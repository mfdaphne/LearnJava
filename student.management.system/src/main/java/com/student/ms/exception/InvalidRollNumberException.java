package com.student.ms.exception;

public class InvalidRollNumberException extends Exception {

	private static final long serialVersionUID = 1L;

	public InvalidRollNumberException(long rollNo) {
		super("Roll no. " + rollNo + " already exists");
	}
}
