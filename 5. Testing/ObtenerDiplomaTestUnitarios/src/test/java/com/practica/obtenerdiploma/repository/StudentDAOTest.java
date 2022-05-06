package com.practica.obtenerdiploma.repository;

import com.practica.obtenerdiploma.exception.StudentNotFoundException;
import com.practica.obtenerdiploma.model.StudentDTO;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

class StudentDAOTest {

    StudentDAO studentDAO;

    @BeforeEach
    void setUp() throws IOException {
        studentDAO = new StudentDAO();
    }


    @Test
    void saveCorrectCase() {

        StudentDTO studentDTOEsperado = new StudentDTO();
        studentDTOEsperado.setStudentName("Juan Perez");
        studentDTOEsperado.setId(1L);

        studentDAO.save(studentDTOEsperado);

        assertTrue(studentDAO.exists(studentDTOEsperado));

    }

    @Test
    void saveNullCase() {
        assertThrows(NullPointerException.class, () -> studentDAO.save(null));
    }

    @Test
    void deleteCorrectCase() {

        // Arrange
        StudentDTO studentDTO = new StudentDTO();
        studentDTO.setStudentName("Juan Perez");
        studentDTO.setId(2L);
        studentDAO.save(studentDTO);

        // Act
        studentDAO.delete(studentDTO.getId());

        // Assert
        assertFalse(studentDAO.exists(studentDTO));

    }

    @Test
    void deleteNotFoundStudent() {
        assertFalse(studentDAO.delete(6L));
    }

    @Test
    void existsCorrectCase() {

        // Arrange
        StudentDTO studentDTO = new StudentDTO();
        studentDTO.setStudentName("Juan Perez");
        studentDTO.setId(1L);
        studentDAO.save(studentDTO);

        // Act
        boolean result = studentDAO.exists(studentDTO);

        // Assert
        assertTrue(result);
    }

    @Test
    void existsInvalidCase() {
        StudentDTO studentDTO = new StudentDTO();
        studentDTO.setId(8L);

        boolean result = studentDAO.exists(studentDTO);

        assertFalse(result);
    }

    @Test
    void findByIdCorrectCase() {
        StudentDTO studentDTO = new StudentDTO();
        studentDTO.setId(1L);
        studentDAO.save(studentDTO);

        StudentDTO studentObtained = studentDAO.findById(1L);

        assertEquals(studentObtained, studentDTO);

    }

    @Test
    void findByIdInvalidCase() {

        assertThrows(StudentNotFoundException.class, () -> studentDAO.findById(10L));

    }
}