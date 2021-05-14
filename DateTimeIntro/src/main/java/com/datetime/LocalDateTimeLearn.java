package com.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class LocalDateTimeLearn {

	public void learnLocalDate() {
		LocalDate localDate = LocalDate.now();
		System.out.println(localDate);
		
		LocalDate localDate1 = LocalDate.of(2021, Month.MAY, 23);
		System.out.println(localDate1);
		
		localDate1.plusDays(3).plusWeeks(4).minusYears(2);
		
	}
	
	public void learnLocalTime() {
		LocalTime localTime1 = LocalTime.now();
		System.out.println(localTime1);
	}
	
	public void learnLocalDateTime() {
		LocalDateTime localTime1 = LocalDateTime.now();
		System.out.println(localTime1);
	}
	
	public void learnPeriod() {
		Period daysPeriod = Period.ofDays(5).ofMonths(4);
		
		LocalDate localDate1 = LocalDate.of(2021, Month.MAY, 23);
		
		localDate1 = localDate1.plus(daysPeriod);
	}
	
	public void learnFormatting() {
		LocalDateTime myDateTime = LocalDateTime.of(2021, Month.AUGUST,2,14,20);
		FormatStyle format = FormatStyle.MEDIUM;
		DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDateTime(format);
		
		System.out.println(myDateTime.format(formatter));
	}
	
	public void zonedDateTime() {
		LocalDate date = LocalDate.of(2021, Month.MAY, 23);
		LocalTime time = LocalTime.of(12, 40, 30);
		
		ZonedDateTime zonedDateTime = ZonedDateTime.of(date,time,ZoneId.systemDefault());
		FormatStyle format = FormatStyle.LONG;
		
		DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDateTime(format);
		
		System.out.println(zonedDateTime.format(formatter));
	}
	
	public void learnPattern() {
		LocalDateTime myDateTime = LocalDateTime.of(2021, Month.AUGUST,2,14,20);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/YYYY--- HH:mm:ss");
		
		System.out.println(myDateTime.format(formatter));
	}

}
