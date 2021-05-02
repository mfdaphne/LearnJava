package com.learn.collection;

public class LearnAboutString {

	void nameConcatenation() {

		String lion = "lioNNessa";

		String b = "tiger";

		String c = b;

		lion.concat(b);

		System.out.println(lion.indexOf("io"));

		System.out.println(lion.indexOf('a'));

		System.out.println(lion.indexOf('o', 1));

		System.out.println(lion.toLowerCase());

		System.out.println("Substring " + lion.substring(3));

		System.out.println("Substring 2 " + lion.substring(1, 4));

		System.out.println("Starts with " + lion.startsWith("l"));

		System.out.println("Ends with " + lion.endsWith("a"));

	}

	public void checkMyString(String value) {

		if (value.contains("lion")) {
			System.out.println("YAYY !!");
		}

		String tiger = "  Im a   tiger 678676  ";

		String trimmedTiger = tiger.trim().replace('t', 'T').replace("Im a", "You are").replaceAll("\\d+", "-");

		// Method Chaining

	}

	public static void main(String[] args) {
		LearnAboutString learn = new LearnAboutString();
		learn.nameConcatenation();
	}

}
