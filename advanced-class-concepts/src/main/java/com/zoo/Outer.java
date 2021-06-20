package com.zoo;

public class Outer {

	public void processZoo() {
		System.out.println("Processing Zoo");
	}

	private interface ZooAnimals {
		void getAnimals();
	}

	public class Inner implements ZooAnimals {
		private int count;

		public void processTiger() {
			System.out.println("Tiger is being processed");
		}

		@Override
		public void getAnimals() {
			// TODO Auto-generated method stub

		}
	}

	public void processInner() {
		Inner inner = new Inner();
		inner.processTiger();
	}

	public static void main(String[] args) {
		Outer outer = new Outer();
		Inner inner = outer.new Inner();
	}
}
