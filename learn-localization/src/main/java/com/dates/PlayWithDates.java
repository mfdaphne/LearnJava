package com.dates;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class PlayWithDates {

	public void checkCurrentDate() {
		LocalDate date = LocalDate.now();

		LocalTime time = LocalTime.of(10, 50, 34, 89);

		LocalDateTime dateTime = LocalDateTime.of(date, time);

		ZonedDateTime zonedDateTime = ZonedDateTime.of(dateTime,
				ZoneId.of("Europe/Paris"));

		Period weeks = Period.ofWeeks(2);
		Period days = Period.ofDays(5);

		LocalDate changedDate = date.plus(days).plus(weeks);

		Duration hours = Duration.ofMinutes(10);
		time.plus(hours);

	}

	public void oldJava() {
		Date date = new Date();
		System.out.println("Date : " + date);
		Calendar cal = new GregorianCalendar(2021, 2, 23);
		System.out.println("Cal : " + cal);

	}

	public void instantObjects() {
		Instant inst1 = Instant.now();
		long epochMilli = inst1.toEpochMilli();

		ZonedDateTime zdt = ZonedDateTime.ofInstant(inst1, ZoneId.of(""));

	}

	public static void main(String[] args) {
		PlayWithDates pl = new PlayWithDates();
		pl.oldJava();
	}
}
