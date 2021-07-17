package com.comparator;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class StudentRegister {

	public static void main(String[] args) {

		Predicate<Integer> checkAgeIsGreaterThan50 = (x) -> x > 50 ? true
				: false;

		Predicate<Integer> checkAgeIsGreaterThan70 = (x) -> x > 70 ? true
				: false;

		checkAgeIsGreaterThan50.test(Integer.valueOf(10));

		checkAgeIsGreaterThan50.or(checkAgeIsGreaterThan70)
				.test(Integer.valueOf(10));

		Function<Integer, String> convertNumber = (x) -> x.toString();
		Function<String, Integer> check = (x) -> x.equals("40") ? 20 : 30;
		convertNumber.compose(check).apply("40");

		Consumer<String> consumerEx = (x) -> {
			System.out.println(x);
		};

		Supplier<String> supplyEx = () -> "someValue";

	}

	public Optional<Student> getRollNoOfPerson(List<Student> students) {
		for (Student student : students) {
			if (student.getRollNo() == 200) {
				return Optional.of(student);
			}
		}
		return Optional.empty();
	}

	public void processStudents() {
		List<Student> students = new ArrayList<>();
		Student student1 = Student.builder().withRollNo(100).withName("Daphne")
				.build();
		students.add(student1);

		Optional<Student> studentFound = getRollNoOfPerson(students);
//		if (studentFound.isPresent()) {
//			Student student = studentFound.get();
//		}

		studentFound.orElse(Student.builder().withName("Thomp").build());

		studentFound.orElseThrow(RuntimeException::new);

		studentFound.orElseGet(() -> Student.builder().build());

		Optional<Integer> myOptInt = Optional.of(Integer.valueOf(10));

		OptionalInt myNumber = OptionalInt.of(10);
	}

}
