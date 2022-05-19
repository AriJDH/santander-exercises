package com.bootcamp.HibernateProject.repository;

import com.bootcamp.HibernateProject.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepo extends JpaRepository<Course, Integer> {



}
