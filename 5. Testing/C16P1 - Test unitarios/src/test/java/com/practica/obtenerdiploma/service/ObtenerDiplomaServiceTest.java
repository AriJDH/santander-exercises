package com.practica.obtenerdiploma.service;

import com.practica.obtenerdiploma.model.StudentDTO;
import com.practica.obtenerdiploma.model.SubjectDTO;
import com.practica.obtenerdiploma.repository.StudentDAO;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
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
        private StudentDTO studentDTOObtainedDouble;
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
            SubjectDTO studentSubjectDto = new SubjectDTO("Matematica", 9D);
            SubjectDTO studentSubjectDto2 = new SubjectDTO("Matematica", 10D);

            subjects = new ArrayList<>();
            subjects.add(studentSubjectDto);
            subjects.add(studentSubjectDto2);

            expectedAverage = calculateAverage(subjects);

            studentDTOObtainedDouble = new StudentDTO(1L, "Juan", null, null, subjects);

            when(studentDAO.findById(studentDTOObtainedDouble.getId())).thenReturn(studentDTOObtainedDouble);

        }

        @Test
        void shouldCalculateAverage() {
            // Arrange

            // Act
            StudentDTO studentDTOObtained = obtenerDiplomaService.analyzeScores(studentDTOObtainedDouble.getId());

            // Assert
            assertEquals(expectedAverage, studentDTOObtained.getAverageScore());

        }

        @Test
        void shouldSetMessageWithFelicitaciones(){
            // Arrange
            String expectedMessage = "El alumno " + studentDTOObtainedDouble.getStudentName() + " ha obtenido un promedio de " +
                    new DecimalFormat("#.##").format(expectedAverage) + ". Felicitaciones!";

            // Act
            StudentDTO studentDTOObtained = obtenerDiplomaService.analyzeScores(this.studentDTOObtainedDouble.getId());

            // Assert
            assertEquals(expectedMessage, studentDTOObtained.getMessage());

        }

        @Nested
        class WhenStudentHasThreeSubjectsWithAverageLowerThanNine{

            @BeforeEach
            void setUp(){
                SubjectDTO studentSubjectDto = new SubjectDTO("Matematica", 1D);
                subjects.add(studentSubjectDto);
                expectedAverage = calculateAverage(subjects);
            }

            @Test
            void shouldSetMessageWithPuedesMejorar(){
                String expectedMessage = "El alumno " + studentDTOObtainedDouble.getStudentName() + " ha obtenido un promedio de " +
                        new DecimalFormat("#.##").format(expectedAverage) + ". Puedes mejorar.";

                // Act
                StudentDTO studentDTOObtained = obtenerDiplomaService.analyzeScores(studentDTOObtainedDouble.getId());

                // Assert
                assertEquals(expectedMessage, studentDTOObtained.getMessage());

            }
        }

    }





}