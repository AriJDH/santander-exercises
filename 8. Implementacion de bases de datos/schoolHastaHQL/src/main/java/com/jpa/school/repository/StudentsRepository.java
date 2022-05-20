package com.jpa.school.repository;

import com.jpa.school.entity.Student;
import com.jpa.school.entity.classes.StudentReduced;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Repository
public interface StudentsRepository extends JpaRepository<Student, Integer> {

    List<Student> findStudentByNameEquals(String name);

    List<Student> findStudentByDisabledIsTrue();


    //HQL

    // HQL SIMPLE

    @Query("FROM Student stu WHERE stu.name = 'jean'")
    List<Student> findStudentByIdEquals3();

    // HQL con select

    @Query("SELECT stu.name, stu.dni FROM Student stu WHERE stu.name = 'Jean'")
    List<StudentReduced> findStudentNameAndStudentDniByName();

    @Query("SELECT new map(stu.name as nombre, stu.dni as dni) FROM Student stu WHERE stu.name = 'Jean'")
    List<Map<String,String>> findStudentNameAndStudentDniByNameConMapa();

    // HQL con param

    @Query("FROM Student stu WHERE stu.dateOfBirth = :date AND stu.name = :name")
    List<Student> findStudentByDateOfBirth(@Param("date") LocalDate dateOfBirth,
                                           @Param("name") String name);

    // HQL con funciones
    // MAX, MIN, SUM, AVG, COUNT
    @Query("SELECT AVG(stu.age) FROM Student stu")
    Integer calculateAverageOfAge();

    // HQL con mapas
    @Query("SELECT new map(AVG(stu.age) as average, SUM(stu.age) as suma, COUNT(*) as cuenta) FROM Student stu")
    Map<String, Integer> calculateAverageAndSumOfAge();


}
