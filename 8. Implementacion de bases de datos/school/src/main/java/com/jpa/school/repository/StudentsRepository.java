package com.jpa.school.repository;

import com.jpa.school.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface StudentsRepository extends JpaRepository<Student, Integer> {
    //List<Student> findStudentByNameAndAgeEquals(String name, Integer age);
    // TODO: FindStudentByDisabledEquals(Boolean disabled)
    List<Student> findStudentByNameEquals(String name);

    //List<Student> findByDisable();
    List<Student> findStudentByDisabledIsTrue();

    // TODO: findStudentByAgeLessOrEqualsThan(Integer age)
    // TODO: findStudentByAgeGreaterOrEqualsThan(Integer age)
}
