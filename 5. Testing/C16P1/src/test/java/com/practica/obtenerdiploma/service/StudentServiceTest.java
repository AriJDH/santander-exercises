package com.practica.obtenerdiploma.service;

import com.practica.obtenerdiploma.model.StudentDTO;
import com.practica.obtenerdiploma.repository.IStudentDAO;
import com.practica.obtenerdiploma.repository.IStudentRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;


import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class StudentServiceTest {
    @Mock
    IStudentDAO studentDAO;
    @Mock
    IStudentRepository studentRepository;

    @InjectMocks
    StudentService studentService;

    @Test
    void create() {
        // Arrange
        StudentDTO studentDTO = new StudentDTO();

        // Act
        studentService.create(studentDTO);

        // Assert
        verify(studentDAO, atLeastOnce()).save(studentDTO);
    }

    @Test
    void update() {
        // Arrange
        StudentDTO studentDTO = new StudentDTO();

        // Act
        studentService.update(studentDTO);

        // Assert
        verify(studentDAO, atLeastOnce()).save(studentDTO);
    }

    @Test
    void read() {
        // Arrange
        StudentDTO studentDTO = new StudentDTO();
        studentDTO.setStudentName("Jaime");
        when(studentDAO.findById(2L)).thenReturn(studentDTO);

        // Act
        StudentDTO studentDTOObtenido = studentService.read(2L);

        // Assert
        assertEquals(studentDTO, studentDTOObtenido);
    }

    @Test
    void delete() {
        // Arrange
        when(studentDAO.delete(2L)).thenReturn(true);

        // Act
        // Assert
        verify(studentDAO, atLeastOnce()).delete(2L);
    }

    @Test
    void getAll() {
        // Arrange
        Set<StudentDTO> expected = new HashSet<>() {{add(new StudentDTO());}};
        Set<StudentDTO> notExpected = new HashSet<>();
        when(studentRepository.findAll()).thenReturn(expected);

        // Act
        Set obtained = studentService.getAll();

        assertEquals(expected, obtained);
        assertNotEquals(notExpected, obtained);
    }
}