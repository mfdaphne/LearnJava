package com.school;

import java.time.LocalDate;

public class School {

	private void manageStudents() {
		Student student = new Student();
		student.setFirstName("Daphne");
		student.setLastName("xyz");
		student.setRollNo(123);

		Student student2 = new Student("Daphn", "xys", LocalDate.now(), 123,
				"good");

		Student student3 = new StudentBuilder().withFirstName("Daphne")
				.withLastName("Thomp").withDob(LocalDate.of(2000, 12, 23))
				.withRollNo(123).builder();

		Student student4 = Student.builder().withFirstName("Swetha")
				.withLastName("R").withDanceClub(true).withRemarks("Good")
				.build();

	}
}
