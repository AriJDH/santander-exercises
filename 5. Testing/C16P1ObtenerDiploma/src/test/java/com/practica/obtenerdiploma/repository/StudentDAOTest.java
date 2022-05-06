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

    @BeforeEach
    void setUp(){
        studentDAO = new StudentDAO();
    }

    @Test
    void save() {
        SubjectDTO studentSubjectDto = new SubjectDTO("Matematica", 7D);
        List<SubjectDTO> subjects = new ArrayList<>();
        subjects.add(studentSubjectDto);
        StudentDTO studentToSaveDto = new StudentDTO(3L, "Juan",null,7D, subjects);

        //TODO: el save deberia devolver el objeto con su nuevo id de manera de poder saber que id se le asigno
        studentDAO.save(studentToSaveDto);
        StudentDTO studentObtained = studentDAO.findById(3L);

        assertEquals(studentObtained.getId(), studentToSaveDto.getId());
        assertEquals(studentObtained.getStudentName(), studentToSaveDto.getStudentName());
    }

    @Test
    void delete() {
    }

    @Test
    void exists() {
    }

    @Test
    void findById() {
    }
}