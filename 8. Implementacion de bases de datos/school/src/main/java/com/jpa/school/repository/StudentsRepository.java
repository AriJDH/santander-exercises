package com.jpa.school.repository;

import com.jpa.school.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentsRepository extends JpaRepository<Student, Integer> {
    //List<Student> findStudentByNameAndAgeEquals(String name, Integer age);
    // TODO: FindStudentByDisabledEquals(Boolean disabled)
    List<Student> findStudentByNameEquals(String name);

    //List<Student> findByDisable();
    List<Student> findStudentByDisabledIsTrue();

    // TODO: findStudentByAgeLessOrEqualsThan(Integer age)
    // TODO: findStudentByAgeGreaterOrEqualsThan(Integer age)

    //HQL
    //Soprta tanto HQL como SQL
    //@Query
    //List<Student> findStudentById();

    //HQL SIMPLE
    //Consulta simple hardcodeada
    //coincide con lo que esta dentro del objeto
    //@Query("FROM Student stu WHERE stu.id = 'jean' ")
    //List<Student> findStudentByIdEquals3();

    //HQL con select
    //@Query("SELECT stu.name, stu.dni FROM Studentn stu WHERE stu.name = 'Jean' ")
    //List<StudentReduced> findStudentNameAndStudentDniByName ();

    //@Query("SELECT new map(SELECT stu.name, stu.dni FROM Studentn stu WHERE stu.name = 'Jean' ")
    //List<StudentReduced> findStudentNameAndStudentDniByName ();



    //HQL con param
    //@Query("SELECT FROM Student stu WHERE stu.dateOfBirth = :date")
    //List<Student> findStudentByDateOfBirth(@Param("date") LocalDate dateOfBirth,
                                           //@Param("name") String name);
    //El método de arriba y abajo son equivalentes
    //List<Student> findStudentByDateOfBirthEqualsAndNameEquals(LocalDate date, String name);

    //HQL con funciones
    //MAX, MIN, SUM, AVG, COUNT
    //@Query("SELECT AVG(stu.age) FROM Student stu")
    //Integer calculateAverageOfAge();

    //HQL con mapas
    //@Query("SELECT new map(AVG(stu.age) as average, SUM(stu.age) as suma) FROM Student stu")
    //Map<String, Integer> calculateAverageAndSumOfAge();

}
