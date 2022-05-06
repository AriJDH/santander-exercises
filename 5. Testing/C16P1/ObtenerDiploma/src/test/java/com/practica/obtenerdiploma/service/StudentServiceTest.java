package com.practica.obtenerdiploma.service;

import com.practica.obtenerdiploma.model.StudentDTO;
import com.practica.obtenerdiploma.repository.IStudentDAO;
import com.practica.obtenerdiploma.repository.IStudentRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class StudentServiceTest {

    @Mock
    IStudentDAO iStudentDAO;
    @Mock
    IStudentRepository iStudentRepository;

    @InjectMocks
    StudentService studentService;

    @Test
    void createTest(){
        StudentDTO studentDTO = new StudentDTO();


        iStudentDAO.save(studentDTO);


        verify(iStudentDAO,times(1)).save(studentDTO);
    }

    @Test
    @DisplayName("Carlos s")
    void readTest(){
        StudentDTO studentDTO = new StudentDTO();
        when(iStudentDAO.findById(2L)).thenReturn(studentDTO);

        StudentDTO studentDTO1 = studentService.read(2L);

        verify(iStudentDAO, atLeastOnce()).findById(2L);

        assertEquals(studentDTO1, studentDTO);

    }
}