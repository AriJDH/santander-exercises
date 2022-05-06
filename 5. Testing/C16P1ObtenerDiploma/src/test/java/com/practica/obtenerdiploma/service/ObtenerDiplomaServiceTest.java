package com.practica.obtenerdiploma.service;

import com.practica.obtenerdiploma.model.StudentDTO;
import com.practica.obtenerdiploma.model.SubjectDTO;
import com.practica.obtenerdiploma.repository.StudentDAO;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class ObtenerDiplomaServiceTest {

    @Mock
    private StudentDAO studentDAO;

    @InjectMocks
    private ObtenerDiplomaService obtenerDiplomaService;

    @Nested
    class WhenStudentHasTwoSubjectsWithAverageHigherThanNine{
        private StudentDTO studentDTOObtained;
        private List<SubjectDTO> subjects;
        private double expectedAverage;

        private Double calculateAverage(List<SubjectDTO> subjects){
            Double avg = 0D;
            for (SubjectDTO subject: subjects) {
                avg += subject.getScore();
            }
            return (avg / subjects.size());
        }

        @BeforeEach
        void setUp(){
            //obtenerDiplomaService = new ObtenerDiplomaService();
            SubjectDTO studentSubjectDto = new SubjectDTO("Matematica", 9D);
            SubjectDTO studentSubjectDto2 = new SubjectDTO("Matematica", 10D);

            subjects = new ArrayList<>();
            subjects.add(studentSubjectDto);
            subjects.add(studentSubjectDto2);

            expectedAverage = calculateAverage(subjects);

            studentDTOObtained = new StudentDTO(1L, "Juan", null, null, subjects);

        }

        @Test
        void shouldCalculateAverage() {
            // Arrange
            when(studentDAO.findById(studentDTOObtained.getId())).thenReturn(studentDTOObtained);

            // Act
            StudentDTO studentDTOObtained = obtenerDiplomaService.analyzeScores(this.studentDTOObtained.getId());

            // Assert
            assertEquals(expectedAverage, studentDTOObtained.getAverageScore());

        }

        @Test
        void shouldSetMessageWithFelicitaciones(){
            // Arrange
            when(studentDAO.findById(studentDTOObtained.getId())).thenReturn(studentDTOObtained);
            String expectedMessage = "El alumno " + studentDTOObtained.getStudentName() + " ha obtenido un promedio de " +
                    new DecimalFormat("#.##").format(expectedAverage) + ". Felicitaciones!";

            // Act
            StudentDTO studentDTOObtained = obtenerDiplomaService.analyzeScores(this.studentDTOObtained.getId());

            // Assert
            assertEquals(expectedMessage, studentDTOObtained.getMessage());

        }

        /*
        @Nested
        class WhenStudentHasThreeSubjectsWithAverageLowerThanNine{

            void setUp(){
                SubjectDTO studentSubjectDto = new SubjectDTO("Matematica", 10D);
                subjects.add(studentSubjectDto);
            }
        }*/

    }





}