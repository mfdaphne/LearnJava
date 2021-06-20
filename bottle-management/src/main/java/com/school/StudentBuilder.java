package com.school;

import java.time.LocalDate;

public class StudentBuilder {

	private String firstName;

	private String lastName;

	private LocalDate dob;

	private long rollNo;

	private String remarks;

	private int age;

	private boolean danceClub;

	private boolean disciplined;

	public StudentBuilder withFirstName(String _firstName) {
		this.firstName = _firstName;
		return this;
	}

	public StudentBuilder withLastName(String _LastName) {
		this.lastName = _LastName;
		return this;
	}

	public StudentBuilder withDob(LocalDate _dob) {
		this.dob = _dob;
		return this;
	}

	public StudentBuilder withRollNo(long _rollNo) {
		this.rollNo = _rollNo;
		return this;
	}

	public Student builder() {
		Student student = new Student();
		student.setFirstName(firstName);
		student.setLastName(lastName);
		student.setDob(dob);
		student.getRemarks();
		student.setRollNo(rollNo);

		return student;
	}

}
