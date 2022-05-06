package com.practica.obtenerdiploma.service;

import com.practica.obtenerdiploma.model.StudentDTO;
import com.practica.obtenerdiploma.repository.StudentDAO;
import com.practica.obtenerdiploma.repository.StudentRepository;
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
class StudentServiceTest {

    @Mock
    StudentRepository studentRepository;

    @Mock
    StudentDAO studentDAO;

    @InjectMocks
    StudentService studentService;

    @Test
    void create() {
        StudentDTO studentDTO = new StudentDTO();
        studentDTO.setId(1L);
        studentDTO.setStudentName("Juan");

        studentService.create(studentDTO);

        verify(studentDAO, atLeastOnce()).save(studentDTO);
    }

    @Test
    void read() {

        StudentDTO studentDTO = new StudentDTO();
        studentDTO.setId(1L);
        studentDTO.setStudentName("Juan");

        studentService.read(studentDTO.getId());

        when(studentDAO.findById(studentDTO.getId())).thenReturn(studentDTO);

        StudentDTO studentDTOObtained = studentService.read(studentDTO.getId());

        assertEquals(studentDTO, studentDTOObtained);

    }

    @Test
    void update() {
        StudentDTO studentDTO = new StudentDTO();
        studentDTO.setId(1L);
        studentDTO.setStudentName("Juan");

        studentService.create(studentDTO);

        verify(studentDAO, atLeastOnce()).save(studentDTO);
    }

    @Test
    void delete() {
        StudentDTO studentDTO = new StudentDTO();
        studentDTO.setId(1L);
        studentDTO.setStudentName("Juan");

        studentService.delete(studentDTO.getId());

        verify(studentDAO, atLeastOnce()).delete(studentDTO.getId());
    }

    @Test
    void getAll() {

        Set<StudentDTO> studentDTOS = new HashSet<>();
        studentDTOS.add(new StudentDTO());

        when(studentRepository.findAll()).thenReturn(studentDTOS);

        Set<StudentDTO> studentDTOS1 = studentService.getAll();

        assertEquals(studentDTOS, studentDTOS1);

    }
}