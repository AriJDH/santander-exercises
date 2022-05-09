package com.practica.obtenerdiploma.repository;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentRepositoryTest {

    @Test
    @Disabled
    void findAllShouldNotReturnNull() {
        StudentRepository studentRepository = new StudentRepository();
        //TODO: SCOPE is not defined
        assertNotNull(studentRepository.findAll());
    }
}