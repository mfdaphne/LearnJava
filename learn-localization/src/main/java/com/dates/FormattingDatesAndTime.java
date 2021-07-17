package com.dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class FormattingDatesAndTime {

	public static void localDateTimeFormatting() {
		LocalDate date = LocalDate.now();

		LocalTime time = LocalTime.of(10, 50, 34, 89);

		LocalDateTime dateTime = LocalDateTime.of(date, time);

//		System.out.println(dateTime.format(DateTimeFormatter.ISO_TIME));

		DateTimeFormatter formatter = DateTimeFormatter
				.ofPattern("dd/MM/YYYY hh:mm");

		System.out.println(dateTime.format(formatter));

	}

	public static void main(String[] args) {
		localDateTimeFormatting();
	}
}
