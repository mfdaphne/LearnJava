package com.student.ms.model;

import java.util.ArrayList;
import java.util.List;

public class StudentDatabase {

	private static List<Student> students = new ArrayList<>();

	private static List<Mark> marks = new ArrayList<>();

	public static List<Student> getStudents() {
		return students;
	}

	public static List<Mark> getMarks() {
		return marks;
	}

}
