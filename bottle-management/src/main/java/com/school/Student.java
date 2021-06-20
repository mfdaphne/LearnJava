package com.school;

import java.time.LocalDate;

public class Student {

	private String firstName;

	private String lastName;

	private LocalDate dob;

	private long rollNo;

	private String remarks;

	private int age;

	private boolean danceClub;

	private boolean disciplined;

	private Student(Builder builder) {
		this.firstName = builder.firstName;
		this.lastName = builder.lastName;
		this.dob = builder.dob;
		this.rollNo = builder.rollNo;
		this.remarks = builder.remarks;
		this.age = builder.age;
		this.danceClub = builder.danceClub;
		this.disciplined = builder.disciplined;
	}

	public Student() {
	}

	public Student(String firstName, String lastName, LocalDate dob,
			long rollNo, String remarks) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
		this.rollNo = rollNo;
		this.remarks = remarks;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public long getRollNo() {
		return rollNo;
	}

	public void setRollNo(long rollNo) {
		this.rollNo = rollNo;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public static Builder builder() {
		return new Builder();
	}

	public static final class Builder {
		private String firstName;
		private String lastName;
		private LocalDate dob;
		private long rollNo;
		private String remarks;
		private int age;
		private boolean danceClub;
		private boolean disciplined;

		private Builder() {
		}

		public Builder withFirstName(String _firstName) {
			this.firstName = _firstName;
			return this;
		}

		public Builder withLastName(String _lastName) {
			this.lastName = _lastName;
			return this;
		}

		public Builder withDob(LocalDate _dob) {
			this.dob = _dob;
			return this;
		}

		public Builder withRollNo(long _rollNo) {
			this.rollNo = _rollNo;
			return this;
		}

		public Builder withRemarks(String _remarks) {
			this.remarks = _remarks;
			return this;
		}

		public Builder withAge(int _age) {
			this.age = _age;
			return this;
		}

		public Builder withDanceClub(boolean _danceClub) {
			this.danceClub = _danceClub;
			return this;
		}

		public Builder withDisciplined(boolean _disciplined) {
			this.disciplined = _disciplined;
			return this;
		}

		public Student build() {
			return new Student(this);
		}
	}

}
