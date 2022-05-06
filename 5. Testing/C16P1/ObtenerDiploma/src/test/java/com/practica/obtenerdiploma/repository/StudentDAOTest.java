package com.practica.obtenerdiploma.repository;

import com.practica.obtenerdiploma.model.StudentDTO;
import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class StudentDAOTest {

    StudentDAO studentDAO=new StudentDAO();
    @Test
    void savesDao() {

        //arrange
        StudentDTO studentDTO = new StudentDTO();

        studentDTO.setStudentName("aaaaaa");
        studentDTO.setSubjects(new ArrayList<>());
        studentDTO.setId(null);

        StudentDTO student2DTO = new StudentDTO();

        student2DTO.setStudentName("aaaaaa");
        student2DTO.setSubjects(new ArrayList<>());
        student2DTO.setId(null);


        //act
        studentDAO.save(studentDTO);

        //assert
        assertTrue(studentDAO.exists(studentDTO));

        assertFalse(studentDAO.exists(student2DTO));

    }
    @Test
    void buscarIDDao() {

        //arrange
        StudentDTO studentDTO = new StudentDTO();
        studentDTO.setStudentName("aaaaaa");
        studentDTO.setSubjects(new ArrayList<>());



        //act
        studentDAO.save(studentDTO);
        StudentDTO studentDtoObtenido = studentDAO.findById(studentDTO.getId());
        //assert
        assertEquals(studentDTO,studentDtoObtenido);
    }

    @Test
    void deleteDao() {

        //arrange
        StudentDTO studentDTO = new StudentDTO();

        studentDTO.setStudentName("aaaaaa");
        studentDTO.setSubjects(new ArrayList<>());
        studentDTO.setId(null);



        //act
        studentDAO.save(studentDTO);
        studentDAO.delete(studentDTO.getId());
        //assert
        assertFalse(studentDAO.exists(studentDTO));


    }







}