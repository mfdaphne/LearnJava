package com.student.ms.service;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

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

public class ProcessStudentServiceTest {

	private ProcessStudentService processStudentService;

	public ProcessStudentServiceTest() {
		CalculateScoresService calculateScoresService = new CalculateScoresService();
		processStudentService = new ProcessStudentService(
				calculateScoresService);
	}

	@Before
	public void initialSetup() {
		List<Student> students = StudentDatabase.getStudents();
		students.clear();

		List<Mark> marks = StudentDatabase.getMarks();
		marks.clear();

	}

	@Test
	public void testAddPrimaryStudent_shouldAdd_WhenAllAreCorrect() {

		PrimaryStudent student = createPrimaryStudent("firstName", "LastName",
				12001);

		try {
			processStudentService.addStudent(student);

		} catch (StudentAlreadyExistsException | InvalidRollNumberException
				| InvalidMarkEnteredException | StudentNotFoundException e) {
			e.printStackTrace();
		}

		List<Student> students = StudentDatabase.getStudents();
		assertEquals(1, students.size());
		assertEquals(12001, students.get(0).getRollNo());

		List<Mark> marks = StudentDatabase.getMarks();
		assertEquals(1, marks.size());

	}

	@Test
	public void testAddSecondaryStudent_shouldAdd_WhenAllAreCorrect() {

		SecondaryStudent student = createSecondaryStudent("firstName",
				"LastName", 12001);

		try {
			processStudentService.addStudent(student);

		} catch (StudentAlreadyExistsException | InvalidRollNumberException
				| InvalidMarkEnteredException | StudentNotFoundException e) {
			e.printStackTrace();
		}

		List<Student> students = StudentDatabase.getStudents();
		assertEquals(1, students.size());
		assertEquals(12001, students.get(0).getRollNo());

		List<Mark> marks = StudentDatabase.getMarks();
		assertEquals(1, marks.size());

	}

	@Test(expected = StudentAlreadyExistsException.class)
	public void shouldThrowStudentAlreadyExistsException_WhenSameNameAndSameRollNoPrimaryStudentExists()
			throws StudentAlreadyExistsException, InvalidRollNumberException,
			InvalidMarkEnteredException, StudentNotFoundException {

		PrimaryStudent student1 = createPrimaryStudent("firstName", "LastName",
				12002);

		PrimaryStudent student2 = createPrimaryStudent("firstName", "LastName",
				12002);

		processStudentService.addStudent(student1);
		processStudentService.addStudent(student2);

		List<Student> students = StudentDatabase.getStudents();
		assertEquals(1, students.size());

	}

	@Test(expected = InvalidRollNumberException.class)
	public void shouldThrowInvalidRollNumberException_WhenDiffNamesButSameRollNo_primary()
			throws StudentAlreadyExistsException, InvalidRollNumberException,
			InvalidMarkEnteredException, StudentNotFoundException {

		PrimaryStudent student1 = createPrimaryStudent("firstName", "LastName",
				12002);

		PrimaryStudent student2 = createPrimaryStudent("otherName", "LastName",
				12002);

		processStudentService.addStudent(student1);
		processStudentService.addStudent(student2);

		List<Student> students = StudentDatabase.getStudents();
		assertEquals(1, students.size());

	}

	@Test(expected = InvalidMarkEnteredException.class)
	public void shouldThrowInvalidMarkEnteredException_WhenMarkEnteredIsGreaterThan100_primary()
			throws StudentAlreadyExistsException, InvalidRollNumberException,
			InvalidMarkEnteredException, StudentNotFoundException {

		PrimaryStudent student1 = createPrimaryStudent("otherName", "LastName",
				12002);
		student1.setMathematics(104);

		processStudentService.addStudent(student1);

		List<Student> students = StudentDatabase.getStudents();
		assertEquals(1, students.size());

	}

	@Test(expected = StudentAlreadyExistsException.class)
	public void shouldThrowStudentAlreadyExistsException_WhenSameNameAndSameRollNoSecondaryStudentExists()
			throws StudentAlreadyExistsException, InvalidRollNumberException,
			InvalidMarkEnteredException, StudentNotFoundException {

		SecondaryStudent student1 = createSecondaryStudent("firstName",
				"LastName", 12002);

		SecondaryStudent student2 = createSecondaryStudent("firstName",
				"LastName", 12002);

		processStudentService.addStudent(student1);
		processStudentService.addStudent(student2);

		List<Student> students = StudentDatabase.getStudents();
		assertEquals(1, students.size());

	}

	@Test(expected = InvalidRollNumberException.class)
	public void shouldThrowInvalidRollNumberException_WhenDiffNamesButSameRollNo_Secondary()
			throws StudentAlreadyExistsException, InvalidRollNumberException,
			InvalidMarkEnteredException, StudentNotFoundException {

		SecondaryStudent student1 = createSecondaryStudent("firstName",
				"LastName", 12002);

		SecondaryStudent student2 = createSecondaryStudent("otherName",
				"LastName", 12002);

		processStudentService.addStudent(student1);
		processStudentService.addStudent(student2);

		List<Student> students = StudentDatabase.getStudents();
		assertEquals(1, students.size());

	}

	@Test(expected = InvalidMarkEnteredException.class)
	public void shouldThrowInvalidMarkEnteredException_WhenMarkEnteredIsGreaterThan100_Secondary()
			throws StudentAlreadyExistsException, InvalidRollNumberException,
			InvalidMarkEnteredException, StudentNotFoundException {

		SecondaryStudent student1 = createSecondaryStudent("otherName",
				"LastName", 12002);
		student1.setMathematics(104);

		processStudentService.addStudent(student1);

		List<Student> students = StudentDatabase.getStudents();
		assertEquals(1, students.size());

	}

	@Test
	public void shouldRemovePrimaryStudentAndMarks_WhenPresent() {
		PrimaryStudent student = createPrimaryStudent("firstName", "LastName",
				12001);

		try {
			processStudentService.addStudent(student);
			assertEquals(1, StudentDatabase.getStudents().size());
			assertEquals(1, StudentDatabase.getMarks().size());

			processStudentService.removeStudent(12001);

		} catch (RollNoNotFoundException | StudentAlreadyExistsException
				| InvalidRollNumberException | InvalidMarkEnteredException
				| StudentNotFoundException e) {

			e.printStackTrace();
		}

		assertEquals(0, StudentDatabase.getStudents().size());
		assertEquals(0, StudentDatabase.getMarks().size());

	}

	@Test(expected = RollNoNotFoundException.class)
	public void shouldThrowRollNoNotFoundException_WhenRollNoNotPresent()
			throws StudentAlreadyExistsException, InvalidRollNumberException,
			InvalidMarkEnteredException, StudentNotFoundException,
			RollNoNotFoundException {
		PrimaryStudent student = createPrimaryStudent("firstName", "LastName",
				12001);

		processStudentService.addStudent(student);
		assertEquals(1, StudentDatabase.getStudents().size());
		assertEquals(1, StudentDatabase.getMarks().size());

		processStudentService.removeStudent(12004);
		assertEquals(1, StudentDatabase.getStudents().size());
		assertEquals(1, StudentDatabase.getMarks().size());

	}

	@Test
	public void shouldReturnAllStudents()
			throws StudentAlreadyExistsException, InvalidRollNumberException,
			InvalidMarkEnteredException, StudentNotFoundException {

		PrimaryStudent student1 = createPrimaryStudent("firstName", "LastName",
				12001);
		PrimaryStudent student2 = createPrimaryStudent("firstName2", "LastName",
				12002);
		PrimaryStudent student3 = createPrimaryStudent("firstName3", "LastName",
				12003);

		processStudentService.addStudent(student1);
		processStudentService.addStudent(student2);
		processStudentService.addStudent(student3);

		assertEquals(3, StudentDatabase.getStudents().size());
		assertEquals(3, StudentDatabase.getMarks().size());

		List<Student> allStudents = processStudentService.getAllStudents();
		assertEquals(3, allStudents.size());

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
