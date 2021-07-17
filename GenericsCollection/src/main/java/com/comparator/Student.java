package com.comparator;

public class Student {

	private int rollNo;

	private String name;

	private String city;

	private Student(Builder builder) {
		this.rollNo = builder.rollNo;
		this.name = builder.name;
		this.city = builder.city;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public static Builder builder() {
		return new Builder();
	}

	public static final class Builder {
		private int rollNo;
		private String name;
		private String city;

		private Builder() {
		}

		public Builder withRollNo(int _rollNo) {
			this.rollNo = _rollNo;
			return this;
		}

		public Builder withName(String _name) {
			this.name = _name;
			return this;
		}

		public Builder withCity(String _city) {
			this.city = _city;
			return this;
		}

		public Student build() {
			return new Student(this);
		}
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", city=" + city
				+ "]";
	}

}
