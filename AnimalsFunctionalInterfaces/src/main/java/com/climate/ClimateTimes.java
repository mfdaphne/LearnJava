package com.climate;

public enum ClimateTimes {

	SUMMER("Coconut") {
		@Override
		public void getTimings() {
			System.out.println("9-20:00");

		}
	},
	WINTER("grapes") {
		@Override
		public void getTimings() {
			System.out.println("9:00 - 15:00");

		}
	},
	AUTUMN("pineapple") {
		@Override
		public void getTimings() {
			// TODO Auto-generated method stub

		}
	},
	SPRING("strawberry") {
		@Override
		public void getTimings() {
			// TODO Auto-generated method stub

		}
	};

	private String fruit;

	private ClimateTimes(String fruit) {
		this.fruit = fruit;
	}

	public abstract void getTimings();

}
