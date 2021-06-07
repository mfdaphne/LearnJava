package com.student.ms.model;

public class Mark {

	private long rollNo;

	private float totalScore;

	public Mark(long rollNo, float totalScore) {
		this.rollNo = rollNo;
		this.totalScore = totalScore;
	}

	public long getRollNo() {
		return rollNo;
	}

	public void setRollNo(long rollNo) {
		this.rollNo = rollNo;
	}

	public float getTotalScore() {
		return totalScore;
	}

	public void setTotalScore(float totalScore) {
		this.totalScore = totalScore;
	}

}
