package com.practica.obtenerdiploma.controller;

import com.practica.obtenerdiploma.model.StudentDTO;
import com.practica.obtenerdiploma.service.ObtenerDiplomaService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ObtenerDiplomaControllerTest {

    @Mock
    ObtenerDiplomaService obtenerDiplomaService;

    @InjectMocks
    ObtenerDiplomaController obtenerDiplomaController;

    @Test
    void analyzeScores(){
        StudentDTO studentDTO = new StudentDTO();
        studentDTO.setId(1L);
        studentDTO.setStudentName("Pedro");

        when(obtenerDiplomaService.analyzeScores(studentDTO.getId())).thenReturn(studentDTO);

        StudentDTO studentDTOObtenido = obtenerDiplomaController.analyzeScores(studentDTO.getId());

        assertEquals(studentDTO.getId(), studentDTOObtenido.getId());
        assertEquals(studentDTO.getStudentName(), studentDTOObtenido.getStudentName());

    }
}
