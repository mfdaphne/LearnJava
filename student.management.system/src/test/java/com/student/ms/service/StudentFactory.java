package com.student.ms.service;

import com.student.ms.model.PrimaryStudent;
import com.student.ms.model.SecondaryStudent;

public class StudentFactory {

	public static PrimaryStudent getPrimaryStudent(String firstName,
			String lastName, long rollNo) {
		PrimaryStudent student = new PrimaryStudent();
		student.setFirstName(firstName);
		student.setLastName(lastName);
		student.setRollNo(rollNo);
		student.setMathematics(78);
		student.setScience(99);
		student.setSocial(56);
		student.setEnglish(50);
		return student;
	}

	public static PrimaryStudent getPrimaryStudentDummy() {
		PrimaryStudent student = new PrimaryStudent();
		student.setFirstName("fsjhfjak");
		return student;
	}

	public static SecondaryStudent getSecondaryStudent(String firstName,
			String lastName, long rollNo) {
		SecondaryStudent student = new SecondaryStudent();
		student.setFirstName(firstName);
		student.setLastName(lastName);
		student.setRollNo(rollNo);
		student.setMathematics(78);
		student.setBiology(99);
		student.setPhysics(56);
		student.setChemistry(50);
		return student;
	}

}
