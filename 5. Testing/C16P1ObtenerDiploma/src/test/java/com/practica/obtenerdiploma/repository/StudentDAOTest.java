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
    private StudentDTO studentDtoExpected;

    @BeforeEach
    void setUp(){
        studentDAO = new StudentDAO();

        // Arrange
        studentSubjectDto = new SubjectDTO("Matematica", 7D);
        subjects = new ArrayList<>();
        subjects.add(studentSubjectDto);
        studentDtoExpected = new StudentDTO(3L, "Juan",null,7D, subjects);
    }

    @Test
    void shouldReturnAStudentById() {
        studentDAO.save(studentDtoExpected);
        StudentDTO studentObtained = studentDAO.findById(3L);
        assertEquals(studentObtained, studentDtoExpected);
    }

    @Test
    void shouldSaveAStudent() {
        //Arrange

        //TODO: el save deberia devolver el objeto con su nuevo id de manera de poder saber que id se le asigno
        studentDAO.save(studentDtoExpected);
        StudentDTO studentObtained = studentDAO.findById(3L);

        //TODO: JUNIT puede ver atributos privados?
        //studentDAO.students.includes
        //assertEquals(studentObtained.getId(), studentToSaveDto.getId());
        //assertEquals(studentObtained.getStudentName(), studentToSaveDto.getStudentName());
        assertEquals(studentObtained, studentDtoExpected);
    }

    @Test
    void shouldReturnTrueIfStudentsExists() {
        // Act
        studentDAO.save(studentDtoExpected);

        // Assert
        assertTrue(studentDAO.exists(studentDtoExpected));
    }

    @Test
    void shouldDeleteAStudent() {
        // Arrange
        studentDAO.save(studentDtoExpected);

        // Act
        // TODO: capaz estaria bueno que devuelva el objeto que se elimino para poder devolver los datos de QUE se elimino y no solo un true
        studentDAO.delete(3L);

        // Assert
        assertFalse(studentDAO.exists(studentDtoExpected));
    }

    @Test
    void shouldUpdateAStudent(){
        // Arrange

        //Actualizo solo el nombre
        StudentDTO updateStudentDto = new StudentDTO(studentDtoExpected.getId(), "Juan Carlos Update",null,7D, subjects);
        studentDAO.save(studentDtoExpected);

        // Act
        studentDAO.save(updateStudentDto);
        StudentDTO studentDtoObtained = studentDAO.findById(updateStudentDto.getId());

        // Assert
        assertEquals(studentDtoObtained.getStudentName(), updateStudentDto.getStudentName());

    }


}