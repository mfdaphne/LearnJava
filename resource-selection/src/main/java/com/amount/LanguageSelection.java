package com.amount;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class LanguageSelection {

	public void getUserChoice() {
		try (Scanner scanner = new Scanner(System.in)) {
			boolean exit = false;
			while (!exit) {
				chooseCountry();
				int i = scanner.nextInt();
				Locale locale = getLanguageSpecificLocale(i);

				LocalizationOfThings loT = new LocalizationOfThings();
				ResourceBundle resource = loT.getResourceOf(locale);

				System.out
						.print(resource.getString("pleaseEnterAmount") + " : ");
				double amount = scanner.nextDouble();

				NumberFormat currencyFormatter = NumberFormat
						.getCurrencyInstance(locale);
				System.out.println(resource.getString("givenAmountIs") + " : "
						+ currencyFormatter.format(amount));

				System.out.println(resource.getString("exitMessage"));
				int k = scanner.nextInt();
				if (k == 0) {
					exit = true;
				}
				System.out.println("**************************");
				System.out.println();
			}

		}
	}

	private Locale getLanguageSpecificLocale(int i) {
		switch (i) {
		case 1:
			Locale de = new Locale("de", "DE");
			return de;
		case 2:
			Locale en = new Locale("en", "US");
			return en;
		case 3:
			Locale ta = new Locale("ta", "IN");
			return ta;
		case 4:
			Locale fr = new Locale("fr", "FR");
			return fr;
		default:
			Locale eng = new Locale("en", "US");
			return eng;
		}

	}

	private void chooseCountry() {
		System.out.print("1. Deutsch-GER\n" + "2. English-US\n"
				+ "3. Tamil-IND\n" + "4. French-FRA\n" + "Select country : ");
	}
}
