package com.practica.obtenerdiploma.service;

import com.practica.obtenerdiploma.model.StudentDTO;
import com.practica.obtenerdiploma.model.SubjectDTO;
import com.practica.obtenerdiploma.repository.IStudentDAO;
import com.practica.obtenerdiploma.repository.StudentDAO;
import org.assertj.core.api.AbstractBigDecimalAssert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)

class ObtenerDiplomaServiceTest {


    @Mock
    IStudentDAO iStudentDAO;

    @InjectMocks
    ObtenerDiplomaService obtenerDiplomaService;

    @Test
    void analizeScores(){

        // arrange
        StudentDTO studentDTO= new StudentDTO();
        studentDTO.setId(2L);
        SubjectDTO subjectDTO = new SubjectDTO("matematica",1.0);
        SubjectDTO subject2DTO = new SubjectDTO("matematic",10.0);

        List<SubjectDTO> subjectDTOList = new ArrayList<>();
        subjectDTOList.add(subjectDTO);
        subjectDTOList.add(subject2DTO);

        studentDTO.setSubjects(subjectDTOList);

        when(iStudentDAO.findById(2L)).thenReturn(studentDTO);
        //act
        StudentDTO studentDTOObtenido =obtenerDiplomaService.analyzeScores(studentDTO.getId());

        //assert
        //verify(iStudentDAO,atLeast(1)).findById(2L);
        assertEquals(studentDTO,studentDTOObtenido);
        assertFalse(studentDTOObtenido.getMessage().contains("Felicitaciones!"));
        assertEquals(studentDTOObtenido.getAverageScore(),5.5);

    }
    @Test
    void analizeScoresHonores(){

        // arrange
        StudentDTO studentDTO= new StudentDTO();
        studentDTO.setId(2L);
        SubjectDTO subjectDTO = new SubjectDTO("matematica",10.0);
        SubjectDTO subject2DTO = new SubjectDTO("matematic",10.0);

        List<SubjectDTO> subjectDTOList = new ArrayList<>();
        subjectDTOList.add(subjectDTO);
        subjectDTOList.add(subject2DTO);

        studentDTO.setSubjects(subjectDTOList);

        when(iStudentDAO.findById(2L)).thenReturn(studentDTO);
        //act
        StudentDTO studentDTOObtenido =obtenerDiplomaService.analyzeScores(studentDTO.getId());

        //assert
        //verify(iStudentDAO,atLeast(1)).findById(2L);
        assertEquals(studentDTO,studentDTOObtenido);
        assertTrue(studentDTOObtenido.getMessage().contains("Felicitaciones!"));
        assertEquals(studentDTOObtenido.getAverageScore(),10);

    }

}