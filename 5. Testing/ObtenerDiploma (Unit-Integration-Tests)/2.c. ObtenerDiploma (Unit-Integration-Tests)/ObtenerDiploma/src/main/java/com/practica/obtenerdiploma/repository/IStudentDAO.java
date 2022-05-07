package com.practica.obtenerdiploma.repository;

import com.practica.obtenerdiploma.model.StudentDTO;

public interface IStudentDAO {
    void save(StudentDTO stu);
    boolean delete(Long id);
    boolean exists(StudentDTO stu);
    StudentDTO findById(Long id);
}