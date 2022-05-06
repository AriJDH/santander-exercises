package com.practica.obtenerdiploma.repository;

import com.practica.obtenerdiploma.model.StudentDTO;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Set;


class StudentRepositoryTest {

    StudentRepository studentRepository=new StudentRepository();
    @Test
    void findAllTest(){
        // arrange
        //act
        Set<StudentDTO> studentDTOSet = studentRepository.findAll();
        //assert
        assertFalse(studentDTOSet.isEmpty(),"La lista no está vacia");
    }

}