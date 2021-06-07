package com.student.ms.port;

import com.student.ms.exception.MarksNotCalculatedException;
import com.student.ms.exception.StudentNotFoundException;
import com.student.ms.model.Student;

public interface ICalculateScores {

	void saveTotalMarks(Student student) throws StudentNotFoundException;

	float getPercentageOfStudent(long rollNo)
			throws StudentNotFoundException, MarksNotCalculatedException;
}
