package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springrest.springrest.entities.Course;

@Service   // provides implementation 
public class CourseServiceimpl implements CourseService {
	
	List<Course>list;
	public CourseServiceimpl()
	{
		list = new ArrayList<>();
		list.add(new Course(145,"Java Core Course","This contains basics of java"));
		list.add(new Course(4343,"Spring Boot Course","creating rest api using spring boot"));
		
	}
	@Override
	public List<Course> getCourses() {
	
		return list;
	}
	@Override
	public Course addCourse(Course course) {
		list.add(course);
		return course;
	}
	
	
	

}
