package com.zoo.animals;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DatesTimesConcept {

	public void datesss() {
		LocalDate currentDate = LocalDate.now();
		LocalDate birthdate = LocalDate.of(1991, Month.SEPTEMBER, 25);

		LocalTime time = LocalTime.now();
		DateTimeFormatter format = DateTimeFormatter.ofPattern("HH:mm:ss");
		System.out.println(time.format(format));

		LocalDateTime localDateTime = LocalDateTime.of(1991, 9, 25, 10, 45, 33);
		ZonedDateTime zdt = ZonedDateTime.of(localDateTime,
				ZoneId.of("Asia/Kolkatta"));

		Period everyYear = Period.ofYears(1);
		Period everyYearWeek = Period.of(1, 0, 5);
		currentDate.plus(everyYearWeek);

		Duration durationHours = Duration.ofHours(10);
		time.plus(durationHours);

	}

	public static void main(String[] args) {
		DatesTimesConcept dd = new DatesTimesConcept();
		dd.datesss();
	}
}
