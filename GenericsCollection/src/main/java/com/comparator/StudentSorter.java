package com.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentSorter {

	public static void main(String[] args) {
		Student student1 = Student.builder().withRollNo(100).withName("Mary")
				.withCity("Chennai").build();
		Student student2 = Student.builder().withRollNo(101).withName("John")
				.withCity("Mumbai").build();
		Student student3 = Student.builder().withRollNo(102).withName("Peter")
				.withCity("Delhi").build();
		Student student4 = Student.builder().withRollNo(103).withName("Ria")
				.withCity("Bangalore").build();

		List<Student> students = new ArrayList<>();
		students.add(student1);
		students.add(student2);
		students.add(student3);
		students.add(student4);

		System.out.println("Before Sort");
		System.out.println(students);
		Comparator<Student> compareByRollNo = (a, b) -> a.getRollNo()
				- b.getRollNo();
		Collections.sort(students, compareByRollNo);

		System.out.println("After Sort by Roll No");
		System.out.println(students);

		Comparator<Student> compareByName = (a, b) -> a.getName()
				.compareTo(b.getName());
		Collections.sort(students, compareByName);

		System.out.println("After Sort by Name");
		System.out.println(students);
	}

}
