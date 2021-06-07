package com.student.ms.exception;

public class RollNoNotFoundException extends Exception {

	private static final long serialVersionUID = 1L;

	public RollNoNotFoundException(long rollNo) {
		super("Roll no. " + rollNo + " not found.");
	}

}
