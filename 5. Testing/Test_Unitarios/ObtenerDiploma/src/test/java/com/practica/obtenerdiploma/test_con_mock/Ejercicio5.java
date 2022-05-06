package com.practica.obtenerdiploma.test_con_mock;

import com.practica.obtenerdiploma.TestUtilsGenerator;
import com.practica.obtenerdiploma.controller.StudentController;
import com.practica.obtenerdiploma.model.StudentDTO;
import com.practica.obtenerdiploma.repository.IStudentDAO;
import com.practica.obtenerdiploma.service.IStudentService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class Ejercicio5 {

    @Mock
    IStudentService studentService;

    @InjectMocks
    StudentController studentController;


    @Test
    void registerStudent() {
        StudentDTO studentDTO= TestUtilsGenerator.getStudentWith3Subjects("Pepito");
        studentController.registerStudent(studentDTO);
        verify(studentService,atLeastOnce()).create(studentDTO);
    }

    @Test
    void getStudent() {
        StudentDTO studentDTOMock= TestUtilsGenerator.getStudentWith3Subjects("Pepito");
        StudentDTO studentDTOEsperado= TestUtilsGenerator.getStudentWith3Subjects("Pepito");

        when(studentService.read(1L)).thenReturn(studentDTOMock);
        StudentDTO studentDTORespuesta=studentController.getStudent(1L);

        assertTrue(studentDTOEsperado.equals(studentDTORespuesta));

    }

    @Test
    void modifyStudent() {
        StudentDTO studentDTO= TestUtilsGenerator.getStudentWith3Subjects("Pepito");
        studentController.modifyStudent(studentDTO);
        verify(studentService,atLeastOnce()).create(studentDTO);
    }

    @Test
    void removeStudent() {
        StudentDTO studentDTO= TestUtilsGenerator.getStudentWith3Subjects("Pepito");
        studentController.removeStudent(1L);
        verify(studentService,atLeastOnce()).delete(1L);
    }

    @Test
    void listStudents() {
        // DB
        Set<StudentDTO> listaMock=TestUtilsGenerator.getStudentSet();
        //Lista esperada que espera los datos de la DB
        Set<StudentDTO> listaEsperada=TestUtilsGenerator.getStudentSet();
        listaEsperada.addAll(listaMock);

        when(studentService.getAll()).thenReturn(listaMock);
        Set<StudentDTO> listaRecibida=studentService.getAll();


        assertTrue(listaEsperada.equals(listaRecibida));
    }
}