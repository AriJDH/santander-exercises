package com.practica.obtenerdiploma.repository;

import com.practica.obtenerdiploma.model.StudentDTO;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class StudentRepositoryTest {

    StudentRepository studentRepository;
    StudentDAO studentDAO;
    @BeforeEach
    void setUp() {
        studentRepository = new StudentRepository();
        studentDAO = new StudentDAO();
    }

    @Test
    void findAll() {

        StudentDTO studentDTO = new StudentDTO();
        studentDTO.setId(1L);
        Set<StudentDTO> students = new HashSet<>();
        students.add(studentDTO);

        studentDAO.save(studentDTO);
        assertTrue(studentDAO.exists(studentDTO));

        Set<StudentDTO> studentsObtained = studentRepository.findAll();

        assertEquals(students.size(), studentsObtained.size());

        assertEquals(students.toString(), studentsObtained.toString());

        StudentDTO s1 = new StudentDTO();
        StudentDTO s2 = new StudentDTO();

        Set<StudentDTO> set1 = new HashSet<>();
        Set<StudentDTO> set2 = new HashSet<>();
        set1.add(s1);
        set2.add(s2);

        System.out.println(s1.equals(s2));

        System.out.println(set1.equals(set2));

    }
}