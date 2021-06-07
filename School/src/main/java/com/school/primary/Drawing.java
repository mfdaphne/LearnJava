package com.school.primary;

import com.school.SchoolCoordinator;

public class Drawing extends SchoolCoordinator implements IPrimary {

	@Override
	public char getGrade() {
		return 'S';
	}

	@Override
	public boolean isCoordinator() {
		return false;
	}

}