package com.kloudblogs.services;

import com.kloudblogs.views.Student;

public interface IStudentService {
	
	com.kloudblogs.entities.Student createStudent(Student student);

	Student getStudent(Long id);

}
