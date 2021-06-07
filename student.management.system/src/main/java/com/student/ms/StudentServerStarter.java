package com.student.ms;

import com.student.ms.service.CalculateScoresService;
import com.student.ms.service.ProcessStudentService;
import com.student.ms.service.UserInput;

public class StudentServerStarter {

	public static void main(String[] args) {
		CalculateScoresService scoresService = new CalculateScoresService();

		UserInput userInput = new UserInput(
				new ProcessStudentService(scoresService));
		userInput.initializeStudentMangtSystem();

	}

}
