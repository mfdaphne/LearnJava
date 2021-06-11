package com.student.ms.service;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.student.ms.exception.MarksNotCalculatedException;
import com.student.ms.exception.StudentNotFoundException;
import com.student.ms.model.Mark;
import com.student.ms.model.PrimaryStudent;
import com.student.ms.model.SecondaryStudent;
import com.student.ms.model.Student;
import com.student.ms.model.StudentDatabase;

public class CalculateScoresServiceTest {

	private CalculateScoresService calculateScoresService;

	private PrimaryStudent primaryStudent;

	private SecondaryStudent secondaryStudent;

	public CalculateScoresServiceTest() {
		calculateScoresService = new CalculateScoresService();

		primaryStudent = createPrimaryStudent("firstName", "lastName", 12001);
		secondaryStudent = createSecondaryStudent("firstName1", "lastName1",
				12002);
	}

	@Before
	public void initialize() {
		List<Student> students = StudentDatabase.getStudents();
		students.add(primaryStudent);
		students.add(secondaryStudent);

		List<Mark> marks = StudentDatabase.getMarks();
		marks.clear();

	}

	@Test
	public void testSaveTotalMarks_primaryStudent()
			throws StudentNotFoundException {

		calculateScoresService.saveTotalMarks(primaryStudent);

		List<Mark> marks = StudentDatabase.getMarks();
		assertEquals(1, marks.size());
		float expected = 78 + 99 + 56 + 50;
		assertEquals(expected, marks.get(0).getTotalScore(), 0.0001);

	}

	@Test
	public void testSaveTotalMarks_secondaryStudent()
			throws StudentNotFoundException {

		calculateScoresService.saveTotalMarks(secondaryStudent);

		List<Mark> marks = StudentDatabase.getMarks();
		assertEquals(1, marks.size());
		float expected = 78 + 99 + 56 + 50;
		assertEquals(expected, marks.get(0).getTotalScore(), 0.0001);

	}

	@Test(expected = StudentNotFoundException.class)
	public void shouldThrowStudentNotFoundException_WhenRollNoNotPresent()
			throws StudentNotFoundException {

		secondaryStudent = createSecondaryStudent("firstName1", "lastName1",
				12);

		calculateScoresService.saveTotalMarks(secondaryStudent);
	}

	@Test
	public void testGetPercentageOfStudent_WhenBothStudentAndMarksAreProcessed()
			throws StudentNotFoundException, MarksNotCalculatedException {
		calculateScoresService.saveTotalMarks(primaryStudent);

		float percentageOfStudent = calculateScoresService
				.getPercentageOfStudent(12001);

		assertEquals(70.75, percentageOfStudent, 0.0001);
	}

	@Test(expected = StudentNotFoundException.class)
	public void shouldThrowStudentNotFoundException_WhenEnquiredRollNoNotFound()
			throws StudentNotFoundException, MarksNotCalculatedException {

		calculateScoresService.getPercentageOfStudent(12003);

	}

	@Test(expected = MarksNotCalculatedException.class)
	public void shouldThrowMarksNotCalculatedException_WhenMarksNotProcessedBeforeEnquiringPercentage()
			throws StudentNotFoundException, MarksNotCalculatedException {

		calculateScoresService.getPercentageOfStudent(12001);

	}

	private PrimaryStudent createPrimaryStudent(String firstName,
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

	private SecondaryStudent createSecondaryStudent(String firstName,
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
