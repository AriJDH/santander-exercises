package com.practica.obtenerdiploma.service;

import com.practica.obtenerdiploma.model.StudentDTO;
import com.practica.obtenerdiploma.model.SubjectDTO;
import com.practica.obtenerdiploma.repository.IStudentDAO;
import com.practica.obtenerdiploma.repository.StudentDAO;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class ObtenerDiplomaServiceTest {
    @Mock
    IStudentDAO studentDAO;

    @InjectMocks
    ObtenerDiplomaService obtenerDiplomaService;

    @Test
    void analyzeScoresSinFelicitar() {
        // Arrange
        StudentDTO studentDTOAGuardar = new StudentDTO();
        StudentDTO studentDTO = new StudentDTO();
        SubjectDTO subjectDTO1 = new SubjectDTO("mate",10.0);
        SubjectDTO subjectDTO2 = new SubjectDTO("histo", 5.0);
        List<SubjectDTO> listaMaterias = new ArrayList<>();
        listaMaterias.add(subjectDTO1);
        listaMaterias.add(subjectDTO2);
        studentDTOAGuardar.setSubjects(listaMaterias);
        when(studentDAO.findById(2L)).thenReturn(studentDTOAGuardar);

        // Act
        StudentDTO studentDTODevuelto = obtenerDiplomaService.analyzeScores(2L);
        boolean contieneMensajeFelicitaciones = studentDTODevuelto.getMessage().contains(". Felicitaciones!");
        boolean contieneMensajePuedeMejorar = studentDTODevuelto.getMessage().contains(". Puedes mejorar.");

        // Assert
        assertEquals(studentDTOAGuardar, studentDTODevuelto);
        assertTrue(contieneMensajePuedeMejorar);
        assertFalse(contieneMensajeFelicitaciones);
    }

    @Test
    void analyzeScoresFelicitando() {
        // Arrange
        StudentDTO studentDTOAGuardar = new StudentDTO();
        SubjectDTO subjectDTO1 = new SubjectDTO("mate",10.0);
        SubjectDTO subjectDTO2 = new SubjectDTO("histo", 10.0);
        List<SubjectDTO> listaMaterias = new ArrayList<>();
        listaMaterias.add(subjectDTO1);
        listaMaterias.add(subjectDTO2);
        studentDTOAGuardar.setSubjects(listaMaterias);
        when(studentDAO.findById(2L)).thenReturn(studentDTOAGuardar);

        // Act
        StudentDTO studentDTODevuelto = obtenerDiplomaService.analyzeScores(2L);
        boolean contieneMensajeFelicitaciones = studentDTODevuelto.getMessage().contains(". Felicitaciones!");
        boolean contieneMensajePuedeMejorar = studentDTODevuelto.getMessage().contains(". Puedes mejorar.");

        // Assert
        assertEquals(studentDTOAGuardar, studentDTODevuelto);
        assertTrue(contieneMensajeFelicitaciones);
        assertFalse(contieneMensajePuedeMejorar);
    }
}