package com.zoo;

public class AnonymousInnerClass {

	public void processWeatherConditions() {
		Weather weather = new Weather() {

			@Override
			public void getWeather() {
				System.out.println("Weather is Sunny");

			}

		};

		weather.getWeather();
	}

}
