package com.student.ms.model;

public class PrimaryStudent extends Student {

	private float science;

	private float mathematics;

	private float social;

	private float english;

	private Dance dance;

	public PrimaryStudent() {
	}

	public Dance getDance() {
		return dance;
	}

	public void setDance(Dance dance) {
		this.dance = dance;
	}

	public float getScience() {
		return science;
	}

	public void setScience(float science) {
		this.science = science;
	}

	public float getMathematics() {
		return mathematics;
	}

	public void setMathematics(float mathematics) {
		this.mathematics = mathematics;
	}

	public float getSocial() {
		return social;
	}

	public void setSocial(float social) {
		this.social = social;
	}

	public float getEnglish() {
		return english;
	}

	public void setEnglish(float english) {
		this.english = english;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Float.floatToIntBits(english);
		result = prime * result + Float.floatToIntBits(mathematics);
		result = prime * result + Float.floatToIntBits(science);
		result = prime * result + Float.floatToIntBits(social);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		PrimaryStudent other = (PrimaryStudent) obj;
		if (Float.floatToIntBits(english) != Float
				.floatToIntBits(other.english)) {
			return false;
		}
		if (Float.floatToIntBits(mathematics) != Float
				.floatToIntBits(other.mathematics)) {
			return false;
		}
		if (Float.floatToIntBits(science) != Float
				.floatToIntBits(other.science)) {
			return false;
		}
		if (Float.floatToIntBits(social) != Float
				.floatToIntBits(other.social)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return null;
	}
}
