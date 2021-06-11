package com.student.ms.service;

import java.util.List;

import com.student.ms.exception.MarksNotCalculatedException;
import com.student.ms.exception.StudentNotFoundException;
import com.student.ms.model.Mark;
import com.student.ms.model.PrimaryStudent;
import com.student.ms.model.SecondaryStudent;
import com.student.ms.model.Student;
import com.student.ms.model.StudentDatabase;
import com.student.ms.port.ICalculateScores;

public class CalculateScoresService implements ICalculateScores {

	private List<Student> students = StudentDatabase.getStudents();

	private List<Mark> marks = StudentDatabase.getMarks();

	@Override
	public void saveTotalMarks(Student student)
			throws StudentNotFoundException {

		float totalMarks = 0.0f;
		checkStudentIsPresent(student.getRollNo());

		if (student instanceof PrimaryStudent) {

			PrimaryStudent primaryStudent = (PrimaryStudent) student;

			totalMarks = primaryStudent.getEnglish()
					+ primaryStudent.getMathematics()
					+ primaryStudent.getScience() + primaryStudent.getSocial();

		} else if (student instanceof SecondaryStudent) {

			SecondaryStudent secondaryStudent = (SecondaryStudent) student;

			totalMarks = secondaryStudent.getMathematics()
					+ secondaryStudent.getBiology()
					+ secondaryStudent.getPhysics()
					+ secondaryStudent.getChemistry();
		}

		marks.add(new Mark(student.getRollNo(), totalMarks));

	}

	@Override
	public float getPercentageOfStudent(long rollNo)
			throws MarksNotCalculatedException, StudentNotFoundException {
		float percentage = 0.0f;

		checkStudentIsPresent(rollNo);

		Mark markOfStudent = checkStudentMarkIsProcessed(rollNo);
		percentage = 100 * (markOfStudent.getTotalScore() / 400);
		return percentage;
	}

	private Student checkStudentIsPresent(long rollNo)
			throws StudentNotFoundException {

		for (Student stu : students) {
			if (stu.getRollNo() == rollNo) {
				return stu;
			}
		}

		throw new StudentNotFoundException();

	}

	private Mark checkStudentMarkIsProcessed(long rollNo)
			throws MarksNotCalculatedException {
		for (Mark mark : marks) {
			if (mark.getRollNo() == rollNo) {
				return mark;
			}
		}
		throw new MarksNotCalculatedException();

	}

}
