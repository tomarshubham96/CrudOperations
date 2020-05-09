package com.java.BasicCrudOps.Entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Data

@Entity
public class Course {

	@Id
	@Column(nullable=false)
	private String courseId;
	
	@Column
	@NotNull
	private String name;
	
	@Column
	private String description;	
	

	public Course() {
	}
	
	public Course(String courseId, String name, String description) {
		
		this.courseId = courseId;
		this.name = name;
		this.description = description;
	}	
	
}