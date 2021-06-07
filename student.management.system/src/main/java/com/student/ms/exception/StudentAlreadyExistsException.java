package com.student.ms.exception;

public class StudentAlreadyExistsException extends Exception {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	public StudentAlreadyExistsException(long rollNo) {
		super("Student with RollNo " + rollNo + " already exists.");
	}
}
