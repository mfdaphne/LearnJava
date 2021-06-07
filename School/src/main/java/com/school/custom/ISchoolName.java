package com.school.custom;

public interface ISchoolName {

	public default void getSchoolName() {
		System.out.println("Some school");
	}
}
