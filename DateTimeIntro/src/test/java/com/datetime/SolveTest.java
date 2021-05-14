package com.datetime;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class SolveTest {

	Solve solve = new Solve();
	
	@Test
	public void shouldReturnTrueWhenEven() {
		assertTrue(solve.checkEvenOdd(20));	
	}
	
	@Test
	public void shouldReturnFalseWhenOdd() {
		assertFalse(solve.checkEvenOdd(21));	
	}
	
	@Test
	public void shouldReturnYayWhenLionIsFound() {
		List<String> animals = Arrays.asList("tiger","buffalo","lion");
		String result = solve.checkLion(animals);
		
		assertEquals("Yay", result);
	}
	
	@Test
	public void shouldReturnOopsWhenLionIsNotFound() {
		List<String> animals = Arrays.asList("tiger","buffalo");
		assertEquals("Oops", solve.checkLion(animals));
	}
	
	@Test
	public void shouldAdd5DaysAnd2Weeks() {
		LocalDate myDate = LocalDate.of(2021, Month.JANUARY, 1);
		LocalDate result = solve.addDates(myDate);
		
		LocalDate expected = LocalDate.of(2021, Month.JANUARY, 20);
		assertEquals(expected, result);
		
		assertEquals(Month.JANUARY, result.getMonth());
		assertEquals(2021, result.getYear());
		assertEquals(20, result.getDayOfMonth());
	}
	
	@Test
	public void shouldRemove2Hours() {
		LocalTime myTime = LocalTime.of(22, 30);
		LocalTime result = solve.remove2Hours(myTime);
		
		LocalTime expected = LocalTime.of(20, 30);
		assertEquals(expected, result);
	}
}
