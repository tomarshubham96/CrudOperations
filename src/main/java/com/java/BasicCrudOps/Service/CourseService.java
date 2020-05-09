package com.java.BasicCrudOps.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.BasicCrudOps.Entity.Course;
import com.java.BasicCrudOps.Repository.CourseRepository;

@Service
public class CourseService {
	
	@Autowired
	private CourseRepository courseRepository;
	 
	
	public List<Course> getAllCoursesService(){		
		List courses = new ArrayList<>();
		
		courseRepository.findAll().forEach(courses::add);
		
		return courses;
	}
	
	public Course getCourseService(String courseId) {
		
	    return courseRepository.findById(courseId).get();
	}

	public void addCourseService(Course course) {
		courseRepository.save(course);
	}

	public void updateCourseService(String courseId, Course course) {
		courseRepository.save(course);
	}

	public void deleteCourseService(String courseId) {
		courseRepository.deleteById(courseId);
		
	}

}