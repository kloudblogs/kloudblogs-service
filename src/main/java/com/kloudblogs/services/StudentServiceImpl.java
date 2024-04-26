package com.kloudblogs.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kloudblogs.mappers.StudentMapper;
import com.kloudblogs.repositories.StudentRepository;
import com.kloudblogs.views.Student;

@Service
public class StudentServiceImpl implements IStudentService{

	@Autowired
	private StudentRepository studentRepository;
	
	@Autowired
	private StudentMapper studentMapper;
	
	@Override
	public com.kloudblogs.entities.Student createStudent(Student student) {
		return studentRepository.save(studentMapper.mapViewToEntity(student));
		
	}

	@SuppressWarnings("deprecation")
	@Override
	public Student getStudent(Long id) {
		com.kloudblogs.entities.Student entity = studentRepository.getById(id);
		Student view = studentMapper.mapEntityToView(entity);
		return view;
	}

}
