package com.student.ms.port;

import java.util.List;

import com.student.ms.exception.InvalidMarkEnteredException;
import com.student.ms.exception.InvalidRollNumberException;
import com.student.ms.exception.RollNoNotFoundException;
import com.student.ms.exception.StudentAlreadyExistsException;
import com.student.ms.exception.StudentNotFoundException;
import com.student.ms.model.Student;

public interface IProcessStudent {

	void addStudent(Student student)
			throws StudentAlreadyExistsException, InvalidRollNumberException,
			InvalidMarkEnteredException, StudentNotFoundException;

	void removeStudent(long rollNo) throws RollNoNotFoundException;

	List<Student> getAllStudents();
}
