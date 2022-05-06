package com.practica.obtenerdiploma.service;

import com.practica.obtenerdiploma.model.StudentDTO;
import com.practica.obtenerdiploma.model.SubjectDTO;
import com.practica.obtenerdiploma.repository.StudentDAO;
import org.junit.jupiter.api.BeforeEach;
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
    private List<SubjectDTO> subjects;
    private StudentDTO studentDTOExpected;

    @Mock
    private StudentDAO studentDAO;

    @InjectMocks
    private ObtenerDiplomaService obtenerDiplomaService;

    @BeforeEach
    void setUp(){
        //OJO: pisas el mock al crear una nueva instancia
        //obtenerDiplomaService = new ObtenerDiplomaService();
        SubjectDTO studentSubjectDto = new SubjectDTO("Matematica", 6D);
        SubjectDTO studentSubjectDto2 = new SubjectDTO("Matematica", 10D);

        subjects = new ArrayList<>();
        subjects.add(studentSubjectDto);
        subjects.add(studentSubjectDto2);
        studentDTOExpected = new StudentDTO(1L, "Juan", null, null, subjects);

    }

    @Test
    void shouldCalculateAverage() {
        // Arrange
        double expectedAverage = 0;
        for (SubjectDTO subject: subjects) {
            expectedAverage += subject.getScore();
        }
        expectedAverage = expectedAverage / subjects.size();

        when(studentDAO.findById(studentDTOExpected.getId())).thenReturn(studentDTOExpected);

        // Act
        StudentDTO studentDTOObtained = obtenerDiplomaService.analyzeScores(studentDTOExpected.getId());

        // Assert
        assertEquals(expectedAverage, studentDTOObtained.getAverageScore());

    }
}