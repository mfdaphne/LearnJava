package com.student.ms.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentDatabase {

	private static List<Student> students = new ArrayList<>();

	private static Map<Integer, Student> studentMaps = new HashMap<>();

	private static List<Mark> marks = new ArrayList<>();

	public static List<Student> getStudents() {
		return students;
	}

	public static List<Mark> getMarks() {
		return marks;
	}

}
