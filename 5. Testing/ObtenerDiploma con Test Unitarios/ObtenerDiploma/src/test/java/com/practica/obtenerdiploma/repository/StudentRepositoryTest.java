package com.practica.obtenerdiploma.repository;


import com.practica.obtenerdiploma.model.StudentDTO;
import org.junit.jupiter.api.Test;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class StudentRepositoryTest {

    IStudentRepository studentRepository;
    IStudentDAO studentDAO;

    @Test
    void findAll(){
        StudentDTO studentDTO = new StudentDTO();
        Set<StudentDTO> studentDTOSet = new HashSet<>();
        studentDTOSet.add(studentDTO);

        studentDAO.save(studentDTO);
        assertTrue(studentDAO.exists(studentDTO));

        Set<StudentDTO> studentObtenido = studentRepository.findAll();


    }

}
