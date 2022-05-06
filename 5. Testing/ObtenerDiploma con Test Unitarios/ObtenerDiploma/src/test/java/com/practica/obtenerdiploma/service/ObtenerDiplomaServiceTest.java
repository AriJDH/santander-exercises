package com.practica.obtenerdiploma.service;


import com.practica.obtenerdiploma.model.StudentDTO;
import com.practica.obtenerdiploma.model.SubjectDTO;
import com.practica.obtenerdiploma.repository.StudentDAO;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ObtenerDiplomaServiceTest {

    @Mock
    StudentDAO studentDAO;

    @InjectMocks
    ObtenerDiplomaService obtenerDiplomaService;

    @Test
    void analyzeScores(){
        SubjectDTO subjectDTO = new SubjectDTO("Mate", 5.0);
        SubjectDTO subjectDTO2 = new SubjectDTO("Geo", 9.0);
        List<SubjectDTO> subjects = new ArrayList<>();
        subjects.add(subjectDTO);
        subjects.add(subjectDTO2);

        StudentDTO studentDTO = new StudentDTO();
        studentDTO.setId(1l);
        studentDTO.setStudentName("Pedro");
        studentDTO.setSubjects(subjects);

        when(studentDAO.findById(studentDTO.getId())).thenReturn(studentDTO);

        obtenerDiplomaService.analyzeScores(studentDTO.getId());

        assertEquals(7.0, studentDTO.getAverageScore());
    }


    @Test
    void analyzeScoresHonorMessage(){
        SubjectDTO subjectDTO = new SubjectDTO("Mate", 10.0);
        SubjectDTO subjectDTO2 = new SubjectDTO("Geo", 9.0);
        List<SubjectDTO> subjects = new ArrayList<>();
        subjects.add(subjectDTO);
        subjects.add(subjectDTO2);

        StudentDTO studentDTO = new StudentDTO();
        studentDTO.setId(1l);
        studentDTO.setStudentName("Pedro");
        studentDTO.setSubjects(subjects);

        when(studentDAO.findById(studentDTO.getId())).thenReturn(studentDTO);

        obtenerDiplomaService.analyzeScores(studentDTO.getId());

        assertEquals("El alumno ha obtenido", studentDTO.getMessage());
    }
    }

