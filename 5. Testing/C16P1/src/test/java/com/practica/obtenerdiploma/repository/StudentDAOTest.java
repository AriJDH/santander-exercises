package com.practica.obtenerdiploma.repository;

import com.practica.obtenerdiploma.model.StudentDTO;
import com.practica.obtenerdiploma.service.IStudentService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Set;
import java.util.function.Supplier;

import static org.junit.jupiter.api.Assertions.*;

class StudentDAOTest {

    StudentDAO studentDAO = new StudentDAO();

    @Test
    void saveAndExists() {
        // Arrange
        StudentDTO studentDTOGuardado = new StudentDTO();
        StudentDTO studentDTOSinGuardar = new StudentDTO();
        studentDTOGuardado.setStudentName("Rodrigo");
        studentDTOSinGuardar.setStudentName("Milton");

        // Act
        studentDAO.save(studentDTOGuardado);

        // Assert
        assertTrue(studentDAO.exists(studentDTOGuardado));
        assertFalse(studentDAO.exists(studentDTOSinGuardar));
    }

    @Test
    void findById() {
        // Arrange
        StudentDTO studentDTOGuardado = new StudentDTO();
        studentDTOGuardado.setStudentName("Marino");

        // Act
        studentDAO.save(studentDTOGuardado);
        StudentDTO studentDTOObtenido = studentDAO.findById(studentDTOGuardado.getId());

        // Assert
        assertEquals(studentDTOGuardado, studentDTOObtenido);
    }

    @Test
    void delete() {
        // Arrange
        StudentDTO studentDTOAGuardar = new StudentDTO();
        studentDAO.save(studentDTOAGuardar);

        // Act
        boolean fueBorrado = studentDAO.delete(studentDTOAGuardar.getId());

        // Assert
        assertTrue(fueBorrado);
        assertFalse(studentDAO.exists(studentDTOAGuardar));
    }
}