package com.practica.obtenerdiploma.repository;

import com.practica.obtenerdiploma.model.StudentDTO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class StudentRepositoryTest {
    @Autowired
    StudentRepository studentRepository;

    @Test
    void findAll() {
        // Arrange

        // Act
        Set<StudentDTO> students = studentRepository.findAll();

        // Assert
        assertFalse(students.isEmpty());
        assertInstanceOf(StudentDTO.class, students.stream().findAny().orElse(null));
    }
}