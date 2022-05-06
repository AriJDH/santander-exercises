package com.practica.obtenerdiploma.test_con_mock;

import com.practica.obtenerdiploma.TestUtilsGenerator;
import com.practica.obtenerdiploma.model.StudentDTO;
import com.practica.obtenerdiploma.repository.IStudentDAO;
import com.practica.obtenerdiploma.repository.IStudentRepository;
import com.practica.obtenerdiploma.repository.StudentDAO;
import com.practica.obtenerdiploma.repository.StudentRepository;
import com.practica.obtenerdiploma.service.StudentService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class Ejercicio3 {

    @Mock
    IStudentDAO studentDAO;
    @Mock
    IStudentRepository studentRepository;

    @InjectMocks
    StudentService studentService;

    @BeforeEach
    void setUp() {
        TestUtilsGenerator.emptyUsersFile();
    }


    @Test
    void create() {
        StudentDTO studentDTOEnviado= TestUtilsGenerator.getStudentWith3Subjects("Pablo");
        studentService.create(studentDTOEnviado);
        verify(studentDAO,atLeastOnce()).save(studentDTOEnviado);
    }

    @Test
    void read() {
        StudentDTO studentDTOEnviado= TestUtilsGenerator.getStudentWith3Subjects("Pablo");
        StudentDTO studentDTOResultado;
        when(studentDAO.findById(studentDTOEnviado.getId())).thenReturn(studentDTOEnviado);
        studentDTOResultado=studentService.read(studentDTOEnviado.getId());
        assertEquals(studentDTOEnviado,studentDTOResultado);

    }

    @Test
    void update() {
        StudentDTO studentDTOEnviado= TestUtilsGenerator.getStudentWith3Subjects("Pablo");
        studentService.update(studentDTOEnviado);
        verify(studentDAO,atLeastOnce()).save(studentDTOEnviado);
    }

    @Test
    void delete() {
        StudentDTO studentDTOEnviado= TestUtilsGenerator.getStudentWith3Subjects("Pablo");
        studentService.delete(studentDTOEnviado.getId());
        verify(studentDAO,atLeastOnce()).delete(studentDTOEnviado.getId());
    }

    @Test
    void getAll() {
        // DB
        Set<StudentDTO> listaMock=TestUtilsGenerator.getStudentSet();
        //Lista esperada que espera los datos de la DB
        Set<StudentDTO> listaEsperada=TestUtilsGenerator.getStudentSet();

        when(studentRepository.findAll()).thenReturn(listaMock);
        Set<StudentDTO> listaRecibida=studentService.getAll();

        assertTrue(listaEsperada.equals(listaRecibida));
        /*

        verify(studentRepository,atLeastOnce()).findAll();
        assertIterableEquals(listaEsperada,listaRecibida);

         */


    }
}