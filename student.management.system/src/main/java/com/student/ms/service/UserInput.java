package com.student.ms.service;

import java.util.List;
import java.util.Scanner;

import com.student.ms.exception.InvalidMarkEnteredException;
import com.student.ms.exception.InvalidRollNumberException;
import com.student.ms.exception.RollNoNotFoundException;
import com.student.ms.exception.StudentAlreadyExistsException;
import com.student.ms.exception.StudentNotFoundException;
import com.student.ms.model.PrimaryStudent;
import com.student.ms.model.SecondaryStudent;
import com.student.ms.model.Student;
import com.student.ms.port.IProcessStudent;

public class UserInput {

	private IProcessStudent processStudent;

	private Scanner scanner = new Scanner(System.in);

	public UserInput(IProcessStudent processStudent) {
		this.processStudent = processStudent;
	}

	public void initializeStudentMangtSystem() {
		System.out.println("Welcome to LearnJava School !! ");

		boolean exit = true;

		while (exit) {
			System.out.println("---------------------------------");
			System.out.println("How can we help you ?\n"
					+ "1. View all Students\n" + "2. Register a new Student\n"
					+ "3. Remove a Student\n4.Exit");

			System.out.print("Choose an option : ");
			int option = scanner.nextInt();
			System.out.println("---------------------------------");

			if (option == 4) {
				exit = false;
			}
			goToOption(option);

		}

	}

	private void goToOption(int option) {

		switch (option) {
		case 1:
			System.out.println("View all Students");
			viewAllStudents();
			break;
		case 2:
			System.out.println("Register a new Student");
			getAndRegisterStudent();
			break;
		case 3:
			System.out.println("Remove a Student");
			removeStudent();
			break;
		default:
			break;
		}

	}

	private void removeStudent() {
		System.out.print("Enter Roll No to remove : ");
		int rollNo = scanner.nextInt();
		try {
			processStudent.removeStudent(rollNo);
		} catch (RollNoNotFoundException e) {
			System.out.println(e);
		}
	}

	private void getAndRegisterStudent() {
		System.out.println(
				"a. Primary\n" + "b. Secondary\n" + "Choose an option :");
		scanner.nextLine();
		String option = scanner.nextLine();
		switch (option) {
		case "a":
			registerPrimaryStudent();
			break;
		case "b":
			registerSecondaryStudent();
			break;
		default:
			break;

		}

	}

	private void registerSecondaryStudent() {
		System.out.println("****** Secondary Student Registration Form ******");
		SecondaryStudent secondaryStudent = new SecondaryStudent();
		System.out.print("Enter first name : ");
		secondaryStudent.setFirstName(scanner.nextLine());

		System.out.print("\nEnter Last name : ");
		secondaryStudent.setLastName(scanner.nextLine());

		System.out.print("\nEnter Roll No : ");
		secondaryStudent.setRollNo(scanner.nextLong());

		System.out.print("\nEnter Physics marks : ");
		secondaryStudent.setPhysics(scanner.nextFloat());

		System.out.print("\nEnter Biology marks : ");
		secondaryStudent.setBiology(scanner.nextFloat());

		System.out.print("\nEnter Maths marks : ");
		secondaryStudent.setMathematics(scanner.nextFloat());

		System.out.print("\nEnter Chemistry marks : ");
		secondaryStudent.setChemistry(scanner.nextFloat());

		try {
			processStudent.addStudent(secondaryStudent);
		} catch (StudentAlreadyExistsException | InvalidRollNumberException
				| InvalidMarkEnteredException | StudentNotFoundException e) {
			e.printStackTrace();
		}
	}

	private void registerPrimaryStudent() {
		System.out.println("****** Primary Student Registration Form ******");
		PrimaryStudent primaryStudent = new PrimaryStudent();
		System.out.print("Enter first name : ");
		primaryStudent.setFirstName(scanner.nextLine());

		System.out.print("\nEnter Last name : ");
		primaryStudent.setLastName(scanner.nextLine());

		System.out.print("\nEnter Roll No : ");
		primaryStudent.setRollNo(scanner.nextLong());

		System.out.print("\nEnter Science marks : ");
		primaryStudent.setScience(scanner.nextFloat());

		System.out.print("\nEnter English marks : ");
		primaryStudent.setEnglish(scanner.nextFloat());

		System.out.print("\nEnter Maths marks : ");
		primaryStudent.setMathematics(scanner.nextFloat());

		System.out.print("\nEnter Social marks : ");
		primaryStudent.setSocial(scanner.nextFloat());

		try {
			processStudent.addStudent(primaryStudent);
		} catch (StudentAlreadyExistsException | InvalidRollNumberException
				| InvalidMarkEnteredException | StudentNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}

	private void viewAllStudents() {
		List<Student> students = processStudent.getAllStudents();

		System.out.println(
				"S.No\tRollNo\tFirst Name\tLast Name\tTotal Marks\tPercentage");
		int count = 0;

		for (Student student : students) {
			System.out.println(++count + "\t" + student.getRollNo() + "\t"
					+ student.getFirstName() + "\t" + student.getLastName()
					+ "\t\t");
			System.out.println("---------------------------------");
		}
	}
}
