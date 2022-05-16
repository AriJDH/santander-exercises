package com.practica.obtenerdiploma.controller;

import com.practica.obtenerdiploma.model.StudentDTO;
import com.practica.obtenerdiploma.service.IObtenerDiplomaService;
import com.practica.obtenerdiploma.service.ObtenerDiplomaService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class ObtenerDiplomaControllerTest {
    @Mock
    IObtenerDiplomaService obtenerDiplomaService;

    @InjectMocks
    ObtenerDiplomaController obtenerDiplomaController;

    @Test
    void analyzeScores() {
        // Arrange
        StudentDTO expected = new StudentDTO();
        StudentDTO notExpected = new StudentDTO();
        expected.setStudentName("Marcos");
        notExpected.setStudentName("Antonio");
        when(obtenerDiplomaService.analyzeScores(2L)).thenReturn(expected);

        // Act
        StudentDTO obtained = obtenerDiplomaController.analyzeScores(2L);

        // Assert
        assertAll(
                () -> assertEquals(expected, obtained),
                () -> assertNotEquals(notExpected, obtained)
        );
    }
}