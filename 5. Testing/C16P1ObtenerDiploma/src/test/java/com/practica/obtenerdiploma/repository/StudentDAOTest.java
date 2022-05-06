package com.practica.obtenerdiploma.repository;

import com.practica.obtenerdiploma.model.StudentDTO;
import com.practica.obtenerdiploma.model.SubjectDTO;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StudentDAOTest {

    private StudentDAO studentDAO;
    private SubjectDTO studentSubjectDto;
    private List<SubjectDTO> subjects;
    private StudentDTO studentDtoExcepted;

    @BeforeEach
    void setUp(){
        studentDAO = new StudentDAO();

        // Arrange
        studentSubjectDto = new SubjectDTO("Matematica", 7D);
        subjects = new ArrayList<>();
        subjects.add(studentSubjectDto);
        studentDtoExcepted = new StudentDTO(3L, "Juan",null,7D, subjects);
    }

    @Test
    void shouldSaveAStudent() {
        //Arrange

        //TODO: el save deberia devolver el objeto con su nuevo id de manera de poder saber que id se le asigno
        studentDAO.save(studentDtoExcepted);
        StudentDTO studentObtained = studentDAO.findById(3L);

        //TODO: JUNIT puede ver atributos privados?
        //studentDAO.students.includes
        //assertEquals(studentObtained.getId(), studentToSaveDto.getId());
        //assertEquals(studentObtained.getStudentName(), studentToSaveDto.getStudentName());
        assertEquals(studentObtained, studentDtoExcepted);
    }

    @Test
    void exists() {
    }

    @Test
    void shouldDeleteAStudent() {
        // Arrange
        studentDAO.save(studentDtoExcepted);

        // Act

        //TODO: capaz estaria bueno que devuelva el objeto que se elimino para poder devolver los datos de QUE se elimino y no solo un true
        studentDAO.delete(3L);

        // Assert
        assertFalse(studentDAO.exists(studentDtoExcepted));
    }



    @Test
    void findById() {
    }
}