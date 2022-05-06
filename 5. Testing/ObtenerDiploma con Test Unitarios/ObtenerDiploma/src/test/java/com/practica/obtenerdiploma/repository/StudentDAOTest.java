package com.practica.obtenerdiploma.repository;

import com.practica.obtenerdiploma.exception.StudentNotFoundException;
import com.practica.obtenerdiploma.model.StudentDTO;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

public class StudentDAOTest {

    StudentDAO studentDAO;


    @Test
    void save(){
        StudentDTO studentDTOEsperado = new StudentDTO();
        studentDTOEsperado.setStudentName("Pedro");

        studentDAO.save(studentDTOEsperado);

        assertTrue(studentDAO.exists(studentDTOEsperado));
    }

    @Test
    void deleteCorrectCase(){
        StudentDTO studentDTO = new StudentDTO();
        studentDTO.setStudentName(("Pedro"));
        studentDTO.setId(2l);
        studentDAO.save(studentDTO);

        studentDAO.delete(studentDTO.getId());

        assertFalse(studentDAO.exists(studentDTO));

    }

    @Test
    void saveNullCse(){
        studentDAO.save(null);

       assertThrows(NullPointerException.class, ()-> studentDAO.save(null) );
    }

    @Test
    void deleteFoundStudent(){

        assertThrows(StudentNotFoundException.class, ()-> studentDAO.delete(1l));
    }


}
