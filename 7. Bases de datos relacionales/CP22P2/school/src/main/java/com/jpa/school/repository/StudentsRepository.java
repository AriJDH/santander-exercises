package com.jpa.school.repository;

import com.jpa.school.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface StudentsRepository extends JpaRepository<Student, Integer> {
    //find<entity>by<atrribute>And<attribute>Equals
    //Optional<Student> findStudentByNameAndAgeEquals(String name);

    // e.g. quiero buscar a todos los borrados logicos
    // TODO: findStudentByDisabled(Boolean disabled)
    // List<Student> findStudentByNameEquals(String name)

    //find<entity>by<atrribute>Equals
    List<Student> findStudentByNameEquals(String name);

    List<Student> findStudentByDisabledIsTrue();


}
