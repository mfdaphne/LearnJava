package com.localization;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Set;

public class Localization {

	private void intro() {
		Locale current = Locale.getDefault();
		System.out.println(current);

		Locale india = new Locale("en", "IND");

	}

	private void callResourceBundle(Locale locale) {
		ResourceBundle resource = ResourceBundle.getBundle("Zoo", locale);
		System.out.println(resource.getString("hello"));
		System.out.println(resource.getString("howAreYou"));

	}

	private void readAllKeysResourceBundle(Locale locale) {
		ResourceBundle resource = ResourceBundle.getBundle("Zoo", locale);

		Set<String> keySet = resource.keySet();

		for (String key : keySet) {
			System.out.println(key + " : " + resource.getString(key));
		}

		keySet.stream().map(key -> resource.getString(key))
				.forEach(System.out::println);

	}

	public static void main(String[] args) {
		Localization l = new Localization();

		Locale india = new Locale("de", "IND");
//		l.callResourceBundle(india);

		l.readAllKeysResourceBundle(india);

	}
}
