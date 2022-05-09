package com.practica.obtenerdiploma.service;

import com.practica.obtenerdiploma.model.StudentDTO;
import com.practica.obtenerdiploma.model.SubjectDTO;
import com.practica.obtenerdiploma.repository.StudentDAO;
import com.practica.obtenerdiploma.repository.StudentRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class StudentServiceTest {

    @Mock
    StudentDAO studentDAO;
    @Mock
    StudentRepository studentRepository;

    @InjectMocks
    StudentService studentService;

    private ArrayList<SubjectDTO> subjects;
    private StudentDTO studentDTO;

    @BeforeEach
    void setUp(){
        SubjectDTO studentSubjectDto = new SubjectDTO("Matematica", 7D);
        subjects = new ArrayList<>();
        subjects.add(studentSubjectDto);
        studentDTO = new StudentDTO(3L, "Juan",null,7D, subjects);
    }

    @Test
    void shouldSaveANewStudent() {
        studentService.create(studentDTO);
        Long falseId = 123123123L;
        when(studentDAO.findById(falseId)).thenReturn(studentDTO);
        assertEquals(studentDTO, studentService.read(falseId));
    }

    //TODO: solo delega los metodos al DAO y eso ya esta testeado, ademas el DAO es atributo privado del Service
    @Test
    @Disabled
    void read() {
    }

    @Test
    @Disabled
    void update() {
    }

    @Test
    @Disabled
    void delete() {
    }

    @Test
    @Disabled
    void getAll() {
    }
}