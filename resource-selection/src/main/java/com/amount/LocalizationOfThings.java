package com.amount;

import java.util.Locale;
import java.util.ResourceBundle;

public class LocalizationOfThings {

	public ResourceBundle getResourceOf(Locale locale) {
		ResourceBundle resource = ResourceBundle.getBundle("localization",
				locale);
		System.out.println(resource.getString("yourChosenLanguage"));
		return resource;

	}
}
