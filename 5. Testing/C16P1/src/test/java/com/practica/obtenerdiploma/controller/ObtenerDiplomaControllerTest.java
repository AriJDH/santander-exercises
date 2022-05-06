package com.practica.obtenerdiploma.controller;

import com.practica.obtenerdiploma.model.StudentDTO;
import com.practica.obtenerdiploma.model.SubjectDTO;
import com.practica.obtenerdiploma.service.ObtenerDiplomaService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.*;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class ObtenerDiplomaControllerTest {

    @Mock
    ObtenerDiplomaService obtenerDiplomaService;

    @InjectMocks
    ObtenerDiplomaController obtenerDiplomaController;

    @Test
    void analyzeScores() {

        StudentDTO studentDTO = new StudentDTO();
        studentDTO.setId(1L);
        studentDTO.setStudentName("Juan");
        studentDTO.setAverageScore(8.5);

        when(obtenerDiplomaService.analyzeScores(studentDTO.getId())).thenReturn(studentDTO);

        StudentDTO studentDTOObtained = obtenerDiplomaController.analyzeScores(studentDTO.getId());

        assertEquals(studentDTO.getId(), studentDTOObtained.getId());
        assertEquals(studentDTO.getStudentName(), studentDTOObtained.getStudentName());
        assertEquals(8.5, studentDTOObtained.getAverageScore());

    }
}