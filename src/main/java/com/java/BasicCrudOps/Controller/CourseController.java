package com.java.BasicCrudOps.Controller;

import java.util.List;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.java.BasicCrudOps.Entity.Course;
import com.java.BasicCrudOps.Service.CourseService;

@RestController
public class CourseController {
	
	@Autowired
	private CourseService courseService;

	@RequestMapping("/courses")
	public List<Course> getAllCourses() {
		return courseService.getAllCoursesService();
	}
	
	@RequestMapping("/courses/{courseId}")
	public Course getCourse(@PathVariable("courseId") String courseId) {
		return courseService.getCourseService(courseId);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/courses")
	public void addCourse(@RequestBody Course course) {
		courseService.addCourseService(course);
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/courses/{courseId}")
	public void updateCourse(@PathVariable("courseId") String courseId, @RequestBody Course course) {
		courseService.updateCourseService(courseId,course);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/courses/{courseId}")
	public void deleteCourse(@PathVariable String courseId) {
		courseService.deleteCourseService(courseId);
	}
	
}