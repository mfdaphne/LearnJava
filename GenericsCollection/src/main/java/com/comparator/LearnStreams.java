package com.comparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.TreeSet;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class LearnStreams {

	private void instantiatingStreams() {
		List<String> names = Arrays.asList("Daphne", "John", "Celc");

		Stream<String> namesString = Stream.of("Daphne", "John", "Celc");

		Stream<Double> noGenerator = Stream.generate(Math::random);
		Stream<String> strGenerator = Stream.generate(() -> "name");

		Stream<Integer> iter = Stream.iterate(2, (x) -> {
			return x * x;
		});

	}

	public void terminalOperations() {
		Stream<String> namesString = Stream.of("Daphne", "John", "Celc");

		Comparator<String> compareNames = (a, b) -> a.length() - b.length();
		namesString.min(compareNames);
		namesString.max(compareNames);

		Optional<String> foundName = namesString.findFirst();

		Predicate<String> startingWithD = (x) -> x.startsWith("D");
		boolean allMatch = namesString.allMatch(startingWithD);

		namesString.forEach(System.out::println);

		Optional<String> reduce = namesString.reduce((a, b) -> a + "_" + b);

		TreeSet<String> collect = namesString
				.collect(Collectors.toCollection(TreeSet::new));
	}

	public void intermediateOperations(Stream<String> namesStream) {
		Predicate<String> startingWithD = (x) -> x.startsWith("D");

		List<String> collect = namesStream.filter(startingWithD).limit(10)
				.skip(10).collect(Collectors.toList());

		Stream<String> distinct = namesStream.distinct();

		Function<String, Student> student = (x) -> Student.builder().withName(x)
				.build();

		namesStream.map(student).forEach(System.out::println);

	}

	public void flatMappingItems() {
		List<String> studentList1 = Arrays.asList(null);
		List<String> studentList2 = Arrays.asList(null);

		Stream<List<String>> students = Stream.of(studentList1, studentList2);
		students.flatMap(x -> x.stream()).forEach(System.out::println);

		Stream<List<List<String>>> multiList = Stream
				.of(Arrays.asList(studentList2));

		Stream<List<String>> flatMap = multiList.flatMap(x -> x.stream());

	}

	private void checkNames(String name) {
		if (name.length() > 10) {
			name = name + "ok";
		}
	}

	private List<String> peekingIn(Stream<String> namesStream) {
		Predicate<String> checkLength = (x) -> x.length() > 5 ? true : false;

		List<String> namesWithLengthMore5 = namesStream.filter(checkLength)
				.peek((x) -> checkNames(x)).collect(Collectors.toList());

		return namesWithLengthMore5;

	}

	private void primitiveStream() {
		IntStream str = IntStream.of(20, 30, 49, 100);
		DoubleStream asDoubleStream = str.asDoubleStream();

		IntStream range = IntStream.rangeClosed(1, 50);
	}

	private void summarizingStats() {
		IntStream str = IntStream.of(20, 30, 49, 100);
		OptionalInt min = str.min();
		OptionalInt max = str.max();

		IntSummaryStatistics stats = str.summaryStatistics();

	}

	// Cat, lion, dog
	private void collectGroup(Stream<String> names) {
		Map<Integer, List<String>> groupByLength = names
				.collect(Collectors.groupingBy(String::length));

		Map<Boolean, List<String>> collect = names.collect(
				Collectors.partitioningBy(x -> x.length() > 5 ? true : false));

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
