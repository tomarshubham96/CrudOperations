package com.java.BasicCrudOps.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.BasicCrudOps.Entity.Instructor;
import com.java.BasicCrudOps.Repository.InstructorRepository;

@Service
public class InstructorService {
	
	@Autowired
	private InstructorRepository instructorRepository;
	 
	
	public List<Instructor> getAllInstructorsService(){		
		List instructors = new ArrayList<>();
		
		instructorRepository.findAll().forEach(instructors::add);
		
		return instructors;
	}
	
	public Instructor getInstructorService(String instructorId) {
		
	    return instructorRepository.findById(instructorId).get();
	}

	public void addInstructorService(Instructor instructor) {
		instructorRepository.save(instructor);
	}

	public void updateInstructorService(String instructorId, Instructor instructor) {
		instructorRepository.save(instructor);
	}

	public void deleteInstructorService(String instructorId) {
		instructorRepository.deleteById(instructorId);
		
	}

}