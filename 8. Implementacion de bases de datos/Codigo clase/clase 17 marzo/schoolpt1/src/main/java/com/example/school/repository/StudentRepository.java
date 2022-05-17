package com.example.school.repository;

import com.example.school.entity.Course;
import com.example.school.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {
}
