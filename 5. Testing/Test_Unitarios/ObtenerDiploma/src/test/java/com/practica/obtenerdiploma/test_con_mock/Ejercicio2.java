package com.practica.obtenerdiploma.test_con_mock;

import com.practica.obtenerdiploma.TestUtilsGenerator;
import com.practica.obtenerdiploma.model.StudentDTO;
import com.practica.obtenerdiploma.repository.IStudentDAO;
import com.practica.obtenerdiploma.repository.StudentDAO;
import com.practica.obtenerdiploma.repository.StudentRepository;
import com.practica.obtenerdiploma.service.ObtenerDiplomaService;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class Ejercicio2 {

    @Mock
    private IStudentDAO studentDAO;

    @InjectMocks
    private ObtenerDiplomaService obtenerDiplomaService;





    @Test
    void avgCalculatorTest(){
        StudentDTO studentDTO = TestUtilsGenerator.getStudentWith3Subjects("Martin");
        when(studentDAO.findById(studentDTO.getId())).thenReturn(studentDTO);


        StudentDTO studentDTOResult=obtenerDiplomaService.analyzeScores(studentDTO.getId());

        assertEquals(6,studentDTOResult.getAverageScore());
    }

    @Test
    void avgCalculatorTestOutputInputSame(){
        StudentDTO studentDTOEnviado = TestUtilsGenerator.getStudentWith3Subjects("Martin");
        StudentDTO studentDTOEsperado = TestUtilsGenerator.getStudentWith3Subjects("Martin");
        when(studentDAO.findById(studentDTOEnviado.getId())).thenReturn(studentDTOEnviado);


        StudentDTO studentDTOResult=obtenerDiplomaService.analyzeScores(studentDTOEnviado.getId());

        assertNotSame(studentDTOEsperado,studentDTOResult);
    }

    @Test
    void leyendoDiplomaTest(){
        StudentDTO studentDTO = TestUtilsGenerator.getStudentWith3Subjects("Martin");
        when(studentDAO.findById(studentDTO.getId())).thenReturn(studentDTO);


        StudentDTO studentDTOResult=obtenerDiplomaService.analyzeScores(studentDTO.getId());

        assertEquals("El alumno Martin ha obtenido un promedio de 6. Puedes mejorar.",studentDTOResult.getMessage());

    }
    @Test
    void leyendoDiplomaWithHonoursTest(){
        StudentDTO studentDTO = TestUtilsGenerator.getStudentWith3SubjectsAverageOver9("Martin");
        when(studentDAO.findById(studentDTO.getId())).thenReturn(studentDTO);


        StudentDTO studentDTOResult=obtenerDiplomaService.analyzeScores(studentDTO.getId());

        assertEquals("El alumno Martin ha obtenido un promedio de 9. Felicitaciones!",studentDTOResult.getMessage());

    }
}
