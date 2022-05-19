package com.jpa.school.repository;

import com.jpa.school.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface StudentsRepository extends JpaRepository<Student, Integer> {

    List<Student> findStudentByNameEquals(String name);

    List<Student> findStudentByDisabledIsTrue();

    // TODO: findStudentByAgeLessOrEqualsThan(Integer age)
    // TODO: findStudentByAgeGreaterOrEqualsThan(Integer age)

}
