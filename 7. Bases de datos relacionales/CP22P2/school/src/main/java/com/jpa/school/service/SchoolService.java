package com.jpa.school.service;

import com.jpa.school.dto.StudentDTO;
import com.jpa.school.dto.response.StudentResponseDTO;
import com.jpa.school.entity.Student;
import com.jpa.school.repository.StudentsRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class SchoolService {

    @Autowired
    StudentsRepository studentsRepository;
    ModelMapper modelMapper = new ModelMapper();

    public boolean addStudent(StudentDTO studentDTO){
        Student student = modelMapper.map(studentDTO, Student.class);

        student =  this.studentsRepository.save(student);

        if(student.getId() != null) return true; else return false;
    }

    public List<StudentResponseDTO> findAllStudents(){
        List<Student> studentList = studentsRepository.findAll();
        return studentList.stream().map(student ->
                modelMapper.map(student, StudentResponseDTO.class)).collect(Collectors.toList());
    }


    public StudentResponseDTO findOneStudent(Integer idStudent) {
        /*Optional<Student> student = studentsRepository.findById(idStudent);

        if(student.isEmpty()){
            throw new RuntimeException();
        }

        return modelMapper.map(student, StudentResponseDTO.class);
        */

        //alternativa
        Student student = studentsRepository.findById(idStudent).orElseThrow(RuntimeException::new);
        return modelMapper.map(student, StudentResponseDTO.class);
    }
}
