package com.java.BasicCrudOps.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.BasicCrudOps.Entity.Course;

public interface CourseRepository extends JpaRepository<Course, String> {

}
