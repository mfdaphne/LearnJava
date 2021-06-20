package com.student.ms;

import com.student.ms.service.CalculateScoresService;
import com.student.ms.service.ProcessStudentService;
import com.student.ms.service.UserInput;

public class StudentServerStarter extends Object {

	public static void main(String[] args) {
		CalculateScoresService scoresService = new CalculateScoresService();

		ProcessStudentService processStudent = new ProcessStudentService(
				scoresService);

		UserInput userInput = new UserInput(processStudent);

		userInput.initializeStudentMangtSystem();

	}

}
