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
        Set<StudentDTO> students = new HashSet<>();
        students.add(studentDTO);

        studentDAO.save(studentDTO);
        assertTrue(studentDAO.exists(studentDTO));

        Set<StudentDTO> studentsObtained = studentRepository.findAll();

        assertEquals(students.size(), studentsObtained.size());

        for (int i=0; i<students.size(); ++i) {
            // students[i].getID == studentsObtained[i].getId
        }
    }

}