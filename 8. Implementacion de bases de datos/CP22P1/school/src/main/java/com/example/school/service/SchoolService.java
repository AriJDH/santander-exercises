package com.example.school.service;

import com.example.school.repository.StudentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SchoolService {

    @Autowired
    StudentsRepository studentsRepository;

    public void findAllStudents(){
        studentsRepository.findAll();
    }
}
