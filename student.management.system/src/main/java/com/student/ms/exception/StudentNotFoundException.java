package com.student.ms.exception;

public class StudentNotFoundException extends Exception {

	private static final long serialVersionUID = 1L;

	public StudentNotFoundException() {
		super("Student not found.");
	}
}
