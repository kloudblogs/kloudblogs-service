package com.kloudblogs.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kloudblogs.configs.AwsParamstoreConfigs;
import com.kloudblogs.services.IStudentService;
import com.kloudblogs.views.Student;

@RestController
@RequestMapping("api/students")
public class StudentController {

    private static final Logger logger = LoggerFactory.getLogger(StudentController.class);
    
    @Autowired
    private IStudentService studentService;
    
    @Autowired
    private AwsParamstoreConfigs configs;
	
	@PostMapping("/v1")
	public com.kloudblogs.entities.Student createStudent(@RequestBody Student student) {
		System.out.println(configs.getTest());
		logger.info("Received students details:: {}", student);
		return studentService.createStudent(student);
	}
	
	@GetMapping("/v1/{id}")
	public Student getStudent(@PathVariable Long id) {
		return studentService.getStudent(id);
	}
}
