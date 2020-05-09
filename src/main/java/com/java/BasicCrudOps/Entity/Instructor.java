package com.java.BasicCrudOps.Entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Data

@Entity
public class Instructor {

	@Id
	@Column(nullable=false)
	private String instructorId;
	
	@Column
	@NotNull
	private String name;
	
	@Column
	private String emailId;	
	

	public Instructor() {
	}
	
	public Instructor(String instructorId, String name, String emailId) {
		
		this.instructorId = instructorId;
		this.name = name;
		this.emailId = emailId;
	}	
	
}
