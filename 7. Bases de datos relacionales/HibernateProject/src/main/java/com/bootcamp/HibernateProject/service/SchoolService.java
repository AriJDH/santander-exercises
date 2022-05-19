package com.bootcamp.HibernateProject.service;

import com.bootcamp.HibernateProject.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SchoolService {

    @Autowired
    StudentRepo studentRepo;

    public void findAllStudents(){
        studentRepo.findAll();
    }
}
