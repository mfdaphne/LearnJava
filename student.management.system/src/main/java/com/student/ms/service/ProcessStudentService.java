package com.student.ms.service;

import java.util.List;

import com.student.ms.exception.InvalidMarkEnteredException;
import com.student.ms.exception.InvalidRollNumberException;
import com.student.ms.exception.RollNoNotFoundException;
import com.student.ms.exception.StudentAlreadyExistsException;
import com.student.ms.exception.StudentNotFoundException;
import com.student.ms.model.Mark;
import com.student.ms.model.PrimaryStudent;
import com.student.ms.model.SecondaryStudent;
import com.student.ms.model.Student;
import com.student.ms.model.StudentDatabase;
import com.student.ms.port.ICalculateScores;
import com.student.ms.port.IProcessStudent;

public class ProcessStudentService implements IProcessStudent {

	private ICalculateScores calculateScores;

	public ProcessStudentService(ICalculateScores calculateScores) {
		this.calculateScores = calculateScores;
	}

	@Override
	public void addStudent(Student student)
			throws StudentAlreadyExistsException, InvalidRollNumberException,
			InvalidMarkEnteredException, StudentNotFoundException {

		List<Student> students = StudentDatabase.getStudents();

		checkValidMarks(student);

		for (Student stu : students) {

			if (stu.getFirstName().equals(student.getFirstName())
					&& stu.getLastName().equals(student.getLastName())) {

				if (stu.getRollNo() == student.getRollNo()) {
					throw new StudentAlreadyExistsException(
							student.getRollNo());
				}

			} else if (stu.getRollNo() == student.getRollNo()) {
				throw new InvalidRollNumberException(student.getRollNo());
			}

		}
		students.add(student);
		calculateScores.saveTotalMarks(student);

	}

	private void checkValidMarks(Student student)
			throws InvalidMarkEnteredException {

		if (student instanceof PrimaryStudent) {

			PrimaryStudent primaryStudent = (PrimaryStudent) student;
			checkValidMarkOfPrimaryStudent(primaryStudent);

		} else if (student instanceof SecondaryStudent) {

			SecondaryStudent secondaryStudent = (SecondaryStudent) student;
			checkValidMarkOfSecondaryStudent(secondaryStudent);
		}

	}

	private void checkValidMarkOfSecondaryStudent(
			SecondaryStudent secondaryStudent)
			throws InvalidMarkEnteredException {

		if (!(isMarkValid(secondaryStudent.getBiology())
				&& isMarkValid(secondaryStudent.getPhysics())
				&& isMarkValid(secondaryStudent.getChemistry())
				&& isMarkValid(secondaryStudent.getMathematics()))) {

			throw new InvalidMarkEnteredException();

		}

	}

	private void checkValidMarkOfPrimaryStudent(PrimaryStudent primaryStudent)
			throws InvalidMarkEnteredException {

		if (!(isMarkValid(primaryStudent.getEnglish())
				&& isMarkValid(primaryStudent.getScience())
				&& isMarkValid(primaryStudent.getSocial())
				&& isMarkValid(primaryStudent.getMathematics()))) {

			throw new InvalidMarkEnteredException();

		}

	}

	private boolean isMarkValid(float mark) {
		if (mark > 100) {
			return false;
		}
		return true;
	}

	@Override
	public void removeStudent(long rollNo) throws RollNoNotFoundException {
		List<Student> students = StudentDatabase.getStudents();
		boolean studentFound = false;

		for (int i = 0; i < students.size(); i++) {
			if (students.get(i).getRollNo() == rollNo) {
				studentFound = true;
				students.remove(i);
			}
		}

		if (studentFound == false) {
			throw new RollNoNotFoundException(rollNo);
		}

		List<Mark> marks = StudentDatabase.getMarks();
		for (int i = 0; i < marks.size(); i++) {
			if (marks.get(i).getRollNo() == rollNo) {
				marks.remove(i);
			}
		}

	}

	@Override
	public List<Student> getAllStudents() {
		return StudentDatabase.getStudents();
	}

}
