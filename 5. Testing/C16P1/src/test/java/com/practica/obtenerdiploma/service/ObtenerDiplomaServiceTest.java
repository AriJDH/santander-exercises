package com.practica.obtenerdiploma.service;

import com.practica.obtenerdiploma.model.StudentDTO;
import com.practica.obtenerdiploma.model.SubjectDTO;
import com.practica.obtenerdiploma.repository.StudentDAO;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class ObtenerDiplomaServiceTest {

    @Mock
    StudentDAO studentDAO;

    @InjectMocks
    ObtenerDiplomaService obtenerDiplomaService;

    @Test
    void analyzeScoresWellCalculated() {

        SubjectDTO subjectDTO = new SubjectDTO("Matematica", 9.0);
        SubjectDTO subjectDTO1 = new SubjectDTO("Fisica", 8.0);
        List<SubjectDTO> subjects = new ArrayList<>();
        subjects.add(subjectDTO);
        subjects.add(subjectDTO1);

        StudentDTO studentDTO = new StudentDTO();
        studentDTO.setId(1L);
        studentDTO.setStudentName("Juan");
        studentDTO.setSubjects(subjects);

        when(studentDAO.findById(studentDTO.getId())).thenReturn(studentDTO);

        obtenerDiplomaService.analyzeScores(studentDTO.getId());

        assertEquals(8.5, studentDTO.getAverageScore());

    }

    @Test
    void analyzeScoresHonorMessage() {

        SubjectDTO subjectDTO = new SubjectDTO("Matematica", 9.0);
        SubjectDTO subjectDTO1 = new SubjectDTO("Fisica", 9.2);
        List<SubjectDTO> subjects = new ArrayList<>();
        subjects.add(subjectDTO);
        subjects.add(subjectDTO1);

        StudentDTO studentDTO = new StudentDTO();
        studentDTO.setId(1L);
        studentDTO.setStudentName("Juan");
        studentDTO.setSubjects(subjects);

        when(studentDAO.findById(studentDTO.getId())).thenReturn(studentDTO);

        obtenerDiplomaService.analyzeScores(studentDTO.getId());

        assertEquals("El alumno Juan ha obtenido un promedio de 9.1. Felicitaciones!", studentDTO.getMessage());

    }
}