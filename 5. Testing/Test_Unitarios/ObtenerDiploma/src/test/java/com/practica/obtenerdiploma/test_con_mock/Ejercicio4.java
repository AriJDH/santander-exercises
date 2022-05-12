package com.practica.obtenerdiploma.test_con_mock;

import com.practica.obtenerdiploma.TestUtilsGenerator;
import com.practica.obtenerdiploma.controller.ObtenerDiplomaController;
import com.practica.obtenerdiploma.model.StudentDTO;
import com.practica.obtenerdiploma.service.IObtenerDiplomaService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class Ejercicio4 {

    @Mock
    IObtenerDiplomaService obtenerDiplomaService;

    @InjectMocks
    ObtenerDiplomaController obtenerDiplomaController;

    @BeforeEach
    void setUp() {
        TestUtilsGenerator.emptyUsersFile();
    }

    @Test
    void analyzeScores() {
        StudentDTO studentDTOEsperado= TestUtilsGenerator.getStudentWith3SubjectsAverageOver9("Pepito");
        studentDTOEsperado.setAverageScore(9.00);
        studentDTOEsperado.setMessage("El alumno Martin ha obtenido un promedio de 9. Felicitaciones!");


        StudentDTO studentDTOMock= TestUtilsGenerator.getStudentWith3SubjectsAverageOver9("Pepito");
        studentDTOMock.setAverageScore(9.00);
        studentDTOMock.setMessage("El alumno Martin ha obtenido un promedio de 9. Felicitaciones!");


        when(obtenerDiplomaService.analyzeScores(any())).thenReturn(studentDTOMock);
        StudentDTO studentDTORespuesta=obtenerDiplomaController.analyzeScores(1L);

        assertTrue(studentDTOEsperado.equals(studentDTORespuesta));

    }
}