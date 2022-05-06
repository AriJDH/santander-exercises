package com.practica.obtenerdiploma.controller;


import com.practica.obtenerdiploma.model.StudentDTO;
import com.practica.obtenerdiploma.service.StudentService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class StudentControllerTest {

    @Mock
    StudentService studentService;

    @InjectMocks
    StudentController studentController;

    @Test
    void registerStudent(){
        StudentDTO studentDTO = new StudentDTO();
        studentDTO.setId(1L);
        studentDTO.setStudentName("Pedro");

        studentController.registerStudent(studentDTO);

        verify(studentService, atLeastOnce()).create(studentDTO);
    }

    @Test
    void modifyStudent(){
        StudentDTO studentDTO = new StudentDTO();
        studentDTO.setId(1L);
        studentDTO.setStudentName("Pedro");

        studentController.modifyStudent(studentDTO);

        verify(studentService, atLeastOnce()).update(studentDTO);


    }
    @Test
    void removeStudent(){

        StudentDTO studentDTO = new StudentDTO();

        studentDTO.setId(1L);
        studentDTO.setStudentName("Pedro");

        studentController.removeStudent(studentDTO.getId());

        verify(studentService, atLeastOnce()).delete(studentDTO.getId());

    }


}
