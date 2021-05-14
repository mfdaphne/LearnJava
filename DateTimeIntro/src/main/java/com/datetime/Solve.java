package com.datetime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.util.List;

public class Solve {
	
	public boolean checkEvenOdd(int i) {
		return i%2 == 0? true: false;
	}
	
	
	public String checkLion(List<String> animals) {
		for (String animal : animals) {
			if(animal.equals("lion")) {
				return "Yay";
			}
		}
		return "Oops";
	}
	
	public LocalDate addDates(LocalDate myDate) {
		Period periodOf5DaysAnd2Weeks = Period.ofWeeks(2).plusDays(5);
		return myDate.plus(periodOf5DaysAnd2Weeks);
	}
	
	public LocalTime remove2Hours(LocalTime myTime) {
		Duration periodOf2Hours = Duration.ofHours(2);
		return myTime.minus(periodOf2Hours);
	}
	
	
}
