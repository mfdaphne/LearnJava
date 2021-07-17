package com.localization;

import java.util.ListResourceBundle;
import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceLocalization_en extends ListResourceBundle {

	@Override
	protected Object[][] getContents() {

		return new Object[][] {
				{ ResourceKeys.HELLO.toString(), AnimalNames.LION.toString() },
				{ ResourceKeys.HOW_ARE_YOU.toString(), "How are you ?" } };
	}

	public static void main(String[] args) {

		Locale en = new Locale("en");
		ResourceBundle resource = ResourceBundle
				.getBundle("com.localization.ResourceLocalization", en);

		System.out.println(resource.getString(ResourceKeys.HELLO.toString()));
		System.out.println(
				resource.getString(ResourceKeys.HOW_ARE_YOU.toString()));
	}

}
