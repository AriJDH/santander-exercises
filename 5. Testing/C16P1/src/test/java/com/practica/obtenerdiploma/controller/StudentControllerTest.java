package com.practica.obtenerdiploma.controller;

import com.practica.obtenerdiploma.model.StudentDTO;
import com.practica.obtenerdiploma.service.IStudentService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.ResponseEntity;

import java.util.HashSet;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class StudentControllerTest {
    @Mock
    IStudentService studentService;

    @InjectMocks
    StudentController studentController;

    @Test
    void registerStudent() {
        // Arrange
        ResponseEntity<?> expected = ResponseEntity.ok(null);
        StudentDTO studentDTO = new StudentDTO();

        // Act
        ResponseEntity<?> obtained = studentController.registerStudent(studentDTO);

        // Assert
        verify(studentService, atLeastOnce()).create(studentDTO);
        assertEquals(expected, obtained);
    }

    @Test
    void modifyStudent() {
        // Arrange
        ResponseEntity<?> expected = ResponseEntity.ok(null);
        StudentDTO studentDTO = new StudentDTO();

        // Act
        ResponseEntity<?> obtained = studentController.modifyStudent(studentDTO);

        // Assert
        verify(studentService, atLeastOnce()).update(studentDTO);
        assertEquals(expected, obtained);
    }

    @Test
    void getStudent() {
        // Arrange
        StudentDTO studentDTO = new StudentDTO();
        studentDTO.setStudentName("Jaime");
        when(studentService.read(2L)).thenReturn(studentDTO);

        // Act
        StudentDTO studentDTOObtenido = studentController.getStudent(2L);

        // Assert
        assertEquals(studentDTO, studentDTOObtenido);
    }

    @Test
    void removeStudent() {
        // Arrange
        ResponseEntity<?> expected = ResponseEntity.ok(null);

        // Act
        ResponseEntity<?> obtained = studentController.removeStudent(2L);

        // Assert
        verify(studentService, atLeastOnce()).delete(2L);
        assertEquals(expected, obtained);
    }

    @Test
    void listStudents() {
        // Arrange
        Set<StudentDTO> expected = new HashSet<>() {{add(new StudentDTO());}};
        Set<StudentDTO> notExpected = new HashSet<>();
        when(studentService.getAll()).thenReturn(expected);

        // Act
        Set obtained = studentController.listStudents();

        assertEquals(expected, obtained);
        assertNotEquals(notExpected, obtained);
    }
}