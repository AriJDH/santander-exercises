package com.practica.obtenerdiploma.repository;

import com.practica.obtenerdiploma.model.StudentDTO;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;


class StudentRepositoryTest {

    StudentRepository studentRepository=new StudentRepository();
    @Test
    void findAllTest(){
        // arrange
        //act
        List<StudentDTO> studentDTOSet = new ArrayList<>(studentRepository.findAll());
        //assert
        assertTrue(studentDTOSet.size() != 0,"La lista no está vacia");
    }

}