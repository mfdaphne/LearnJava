package com;

public class WeatherDisplay {

	public static void main(String[] args) {
		for (Weather weather : Weather.values()) {
			System.out.println(weather.name() + " - " + weather.ordinal()
					+ " - " + weather.getDateOfWeather() + " - "
					+ weather.getTemperature());
			weather.currentWeather();
		}

	}
}
