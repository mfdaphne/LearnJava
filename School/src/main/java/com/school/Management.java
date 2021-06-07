package com.school;

import com.school.primary.Drawing;
import com.school.primary.IPrimary;
import com.school.primary.Mathematics;
import com.school.secondary.ISecondary;
import com.school.secondary.Physics;

public class Management {

	public void getGradeOfMathFromPrimary(IPrimary primary) {
		primary.getSchoolName();
		System.out.println("Grade is " + primary.getGrade());

	}

	public void getGradeOfMathFromSecondary(ISecondary secondary) {
		secondary.getSchoolName();
		System.out.println("Percentage is " + secondary.getPercentage());

	}

	public static void main(String[] args) {
		Management mngt = new Management();

		// IPrimary ---> Mathematics
		// IPrimary ---> Drawing
		IPrimary maths = new Mathematics();

		if (maths instanceof IPrimary) {
			mngt.getGradeOfMathFromPrimary(maths);
		}

		mngt.getGradeOfMathFromSecondary(new Physics());

		Drawing schoolCoordinator = (Drawing) new SchoolCoordinator();
		System.out.println(schoolCoordinator.isCoordinator());
		schoolCoordinator.nameOfCoordinator();

	}

}
