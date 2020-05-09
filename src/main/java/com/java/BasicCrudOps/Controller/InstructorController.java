package com.java.BasicCrudOps.Controller;

import java.util.List;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.java.BasicCrudOps.Entity.Instructor;
import com.java.BasicCrudOps.Service.InstructorService;

@RestController
public class InstructorController {
	
	@Autowired
	private InstructorService instructorService;

	@RequestMapping("/instructors")
	public List<Instructor> getAllInstructors() {
		return instructorService.getAllInstructorsService();
	}
	
	@RequestMapping("/instructors/{instructorId}")
	public Instructor getInstructor(@PathVariable("instructorId") String instructorId) {
		return instructorService.getInstructorService(instructorId);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/instructors")
	public void addInstructor(@RequestBody Instructor instructor) {
		instructorService.addInstructorService(instructor);
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/instructors/{instructorId}")
	public void updateInstructor(@PathVariable("instructorId") String instructorId, @RequestBody Instructor instructor) {
		instructorService.updateInstructorService(instructorId,instructor);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/instructors/{instructorId}")
	public void deleteInstructor(@PathVariable String instructorId) {
		instructorService.deleteInstructorService(instructorId);
	}
	
}