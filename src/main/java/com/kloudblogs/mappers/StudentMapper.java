package com.kloudblogs.mappers;

import java.util.Objects;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.kloudblogs.views.Student;

@Component
public class StudentMapper {
	
	public com.kloudblogs.entities.Student mapViewToEntity(Student view) {
		com.kloudblogs.entities.Student entity = new com.kloudblogs.entities.Student();
		if(Objects.nonNull(view)) {
			BeanUtils.copyProperties(view, entity);
		}
		return entity;
	}

	public Student mapEntityToView(com.kloudblogs.entities.Student entity) {
		Student view = new Student();
		if(Objects.nonNull(entity)) {
			BeanUtils.copyProperties(entity, view);
		}
		return view;
	}

}
