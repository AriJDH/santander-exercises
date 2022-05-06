package com.practica.obtenerdiploma.controller;

import com.practica.obtenerdiploma.model.StudentDTO;
import com.practica.obtenerdiploma.service.StudentService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashSet;
import java.util.Set;

import static org.mockito.Mockito.*;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class StudentControllerTest {

    @Mock
    StudentService studentService;

    @InjectMocks
    StudentController studentController;

    @Test
    void registerStudent() {

        StudentDTO studentDTO = new StudentDTO();
        studentDTO.setId(1L);
        studentDTO.setStudentName("Juan");

        studentController.registerStudent(studentDTO);

        verify(studentService, atLeastOnce()).create(studentDTO);

    }

    @Test
    void getStudent() {

        StudentDTO studentDTO = new StudentDTO();
        studentDTO.setId(1L);
        studentDTO.setStudentName("Juan");

        when(studentService.read(studentDTO.getId())).thenReturn(studentDTO);

        StudentDTO studentDTOObtained = studentController.getStudent(studentDTO.getId());

        assertEquals(studentDTO, studentDTOObtained);
    }

    @Test
    void modifyStudent() {

        StudentDTO studentDTO = new StudentDTO();
        studentDTO.setId(1L);
        studentDTO.setStudentName("Juan");

        studentController.modifyStudent(studentDTO);

        verify(studentService, atLeastOnce()).update(studentDTO);

    }

    @Test
    void removeStudent() {

        StudentDTO studentDTO = new StudentDTO();
        studentDTO.setId(1L);
        studentDTO.setStudentName("Juan");

        studentController.removeStudent(studentDTO.getId());

        verify(studentService, atLeastOnce()).delete(studentDTO.getId());

    }

    @Test
    void listStudents() {

        Set<StudentDTO> studentDTOS = new HashSet<>();
        studentDTOS.add(new StudentDTO());

        when(studentService.getAll()).thenReturn(studentDTOS);

        Set<StudentDTO> studentDTOSObtained = studentController.listStudents();

        assertEquals(studentDTOS, studentDTOSObtained);

    }
}