package com.practica.obtenerdiploma.controller;

import com.practica.obtenerdiploma.model.StudentDTO;
import com.practica.obtenerdiploma.model.SubjectDTO;
import com.practica.obtenerdiploma.service.StudentService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class StudentControllerTest {

    @Mock
    StudentService studentService;

    @InjectMocks
    StudentController studentController;

    private StudentDTO studentDTO;
    private List<SubjectDTO> subjects;

    @BeforeEach
    void setUp(){
        SubjectDTO studentSubjectDto = new SubjectDTO("Matematica", 7D);
        subjects = new ArrayList<>();
        subjects.add(studentSubjectDto);
        studentDTO = new StudentDTO(3L, "Juan",null,7D, subjects);
    }

    @Test
    //TODO: se puede testear el controller sin usar MVC? es decir testear los metodos como con cualquier otra capa?
    void shouldRegisterAStudent() {
        studentController.registerStudent(studentDTO);
    }

    @Test
    void getStudent() {
    }

    @Test
    void modifyStudent() {
    }

    @Test
    void removeStudent() {
    }

    @Test
    void listStudents() {
    }
}