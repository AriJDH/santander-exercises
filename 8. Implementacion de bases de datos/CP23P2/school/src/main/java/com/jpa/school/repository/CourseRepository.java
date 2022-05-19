package com.jpa.school.repository;

import com.jpa.school.entity.Course;
import com.jpa.school.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

@Repository
public interface CourseRepository extends JpaRepository<Course, Integer> {

    Course findCourseByStudentEquals(Student student);
}
