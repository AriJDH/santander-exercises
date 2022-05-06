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
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
        ResponseEntity<?> responseEntityExpected = ResponseEntity.ok(null);
        assertEquals(responseEntityExpected, studentController.registerStudent(studentDTO));
    }

    @Test
    void shouldReturnAStudent() {
        Long falseId = 123123123L;
        when(studentService.read(falseId)).thenReturn(studentDTO);
        assertEquals(studentDTO, studentController.getStudent(falseId));
    }

    @Test
    void shouldModifyAStudent() {
        ResponseEntity<?> responseEntityExpected = ResponseEntity.ok(null);
        assertEquals(responseEntityExpected, studentController.modifyStudent(studentDTO));

    }

    @Test
    void shouldRemoveAStudent() {
        Long falseId = 123123123L;
        ResponseEntity<?> responseEntityExpected = ResponseEntity.ok(null);
        assertEquals(responseEntityExpected, studentController.removeStudent(falseId));
    }

    @Test
    void shouldReturnAListOfStudents() {
        Set<StudentDTO> studentDTOSetExpected = new HashSet<>();
        studentDTOSetExpected.add(studentDTO);
        when(studentService.getAll()).thenReturn(studentDTOSetExpected);
        Set<StudentDTO> studentDTOSet = studentController.listStudents();

        assertEquals(studentDTOSetExpected, studentDTOSet);
    }
}