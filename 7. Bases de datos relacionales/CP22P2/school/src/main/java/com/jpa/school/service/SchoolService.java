package com.jpa.school.service;

import com.jpa.school.dto.StudentDTO;
import com.jpa.school.dto.SuccessDTO;
import com.jpa.school.dto.response.StudentResponseDTO;
import com.jpa.school.entity.Student;
import com.jpa.school.repository.StudentsRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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

    public SuccessDTO deleteStudent(Integer idStudent) {
        // OJO: no verifica si existe al eliminarlo, si no existe recibo un error de sql
        // podria chequear antes si existe con un findbyId

        studentsRepository.deleteById(idStudent);

        Optional<Student> student = studentsRepository.findById(idStudent);

        if(student.isPresent()){
            throw new RuntimeException();
        }

        return new SuccessDTO("Se ha eliminado con exito el alumno", HttpStatus.OK.value());
    }

    public List<StudentResponseDTO> findByName(String name){
        List<Student> students = studentsRepository.findStudentByNameEquals(name);

        return students.stream().map(student ->
                modelMapper.map(student, StudentResponseDTO.class)).collect(Collectors.toList());

    }
}
