package com;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class FormattingNumbers {

	public static void formatSomeNumbers(Locale locale) {
		float k = 2.324f;
		NumberFormat numbFormatter = NumberFormat.getCurrencyInstance(locale);
		System.out.println(numbFormatter.format(k));

	}

	public static void parseBack() throws ParseException {
		String eu = "56,32435";
		NumberFormat numbFormatter = NumberFormat.getInstance(Locale.GERMANY);
		System.out.println(numbFormatter.parse(eu));
	}

	public static void main(String[] args) throws ParseException {
//		Locale de = Locale.GERMANY;
//		formatSomeNumbers(de);
//
//		Locale fr = Locale.CANADA_FRENCH;
//		formatSomeNumbers(fr);
//
//		Locale en = Locale.US;
//		formatSomeNumbers(en);

		parseBack();

	}

}
