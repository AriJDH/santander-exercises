package com.practica.obtenerdiploma.controller;

import com.practica.obtenerdiploma.model.StudentDTO;
import com.practica.obtenerdiploma.service.IStudentService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class StudentControllerTest {

    @Mock
    IStudentService iStudentService;

    @InjectMocks
    StudentController studentController;


    //public StudentDTO getStudent(@PathVariable Long id) {return this.studentService.read(id);}

    @Test
    void getStudentTest(){
        StudentDTO studentDTO = new StudentDTO();

        when(iStudentService.read(2L)).thenReturn(studentDTO);

        StudentDTO studentDTO1 = iStudentService.read(2L);

        assertEquals(studentDTO1,studentDTO);

    }

    //public Set<StudentDTO> listStudents() {
    @Test
    void listStudeAAAAAAAAAAAAAAAAAAAAAAAAAntsTest() {
        StudentDTO studentDTO = new StudentDTO();
        StudentDTO studentDTO1 = new StudentDTO();

        Set<StudentDTO> listStudents = new HashSet<>();

        listStudents.add(studentDTO);
        listStudents.add(studentDTO1);


        when(iStudentService.getAll()).thenReturn(listStudents);
        Set<StudentDTO> studentDTOObtenido = studentController.listStudents();

        verify(iStudentService,atLeastOnce()).getAll();

        assertEquals(studentDTOObtenido,listStudents);

    }
}