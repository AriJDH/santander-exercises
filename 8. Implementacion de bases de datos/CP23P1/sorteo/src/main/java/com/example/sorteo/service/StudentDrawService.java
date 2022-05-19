package com.example.sorteo.service;

import com.example.sorteo.dto.StudentDTO;
import com.example.sorteo.dto.SuccessDTO;
import com.example.sorteo.model.Student;
import com.example.sorteo.repository.StudentRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class StudentDrawService {
    @Autowired
    StudentRepository studentRepository;
    ModelMapper modelMapper = new ModelMapper();

    public SuccessDTO addStudent(StudentDTO studentDTO){
        Student student = modelMapper.map(studentDTO, Student.class);
        student = studentRepository.save(student);

        if(student.getId() == null){
            throw new RuntimeException();
        }

        return new SuccessDTO("Se ha creado el estudiante con id, " + student.getId(),
                HttpStatus.CREATED.value());
    }
}
