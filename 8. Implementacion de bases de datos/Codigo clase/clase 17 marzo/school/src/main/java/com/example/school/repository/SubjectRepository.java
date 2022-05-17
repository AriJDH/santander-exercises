package com.example.school.repository;

import com.example.school.entity.Course;
import com.example.school.entity.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubjectRepository extends JpaRepository<Subject,Integer> {
}
