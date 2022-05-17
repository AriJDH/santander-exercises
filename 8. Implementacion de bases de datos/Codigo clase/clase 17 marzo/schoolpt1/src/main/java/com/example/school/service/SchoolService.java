package com.example.school.service;

import com.example.school.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SchoolService {

    @Autowired
    StudentRepository studentRepository;

    public void findAllStudents(){
        studentRepository.findAll();
    }
}
