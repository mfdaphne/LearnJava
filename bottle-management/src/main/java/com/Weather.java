package com;

import java.time.LocalDate;

public enum Weather {

	SUNNY(LocalDate.of(2021, 6, 2), 35.5f) {
		@Override
		public void currentWeather() {
			System.out.println("ITS SUNNY");
		}
	},

	SNOWY(LocalDate.of(2021, 12, 3), -0.5f),

	RAINY(LocalDate.of(2021, 3, 17), 20f),

	WINDY(LocalDate.of(2021, 10, 23), 14.5f);

	private LocalDate dateOfWeather;
	private float temperature;

	private Weather(LocalDate date, float temp) {
		this.dateOfWeather = date;
		this.temperature = temp;
	}

	public LocalDate getDateOfWeather() {
		return dateOfWeather;
	}

	public float getTemperature() {
		return temperature;
	}

	public void currentWeather() {
		System.out.println("Weather is Good");
	}
}
