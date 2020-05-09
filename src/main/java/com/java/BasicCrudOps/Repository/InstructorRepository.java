package com.java.BasicCrudOps.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.BasicCrudOps.Entity.Instructor;

public interface InstructorRepository extends JpaRepository<Instructor, String> {

}
