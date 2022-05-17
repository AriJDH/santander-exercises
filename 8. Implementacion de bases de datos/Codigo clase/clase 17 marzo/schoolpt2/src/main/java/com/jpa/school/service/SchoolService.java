package com.jpa.school.service;

import com.jpa.school.dto.StudentDTO;
import com.jpa.school.dto.SuccessDTO;
import com.jpa.school.dto.response.StudentResponseDTO;
import com.jpa.school.entity.Student;
import com.jpa.school.repository.StudentsRepository;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
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

        List<Student> studentList=studentsRepository.findAll();

        return studentList.stream().map(student -> modelMapper.map(student, StudentResponseDTO.class)).collect(Collectors.toList());
    }


    public StudentResponseDTO findStudentById(Integer idStudent) {
        //StudentResponseDTO studentResponseDTO= modelMapper.map(studentsRepository.findById(idStudent),StudentResponseDTO.class);

        /* 1era forma
        Optional<Student>studentResult= studentsRepository.findById(idStudent);
        if(studentResult.isEmpty()){
            throw new RuntimeException();
        }
        else
            return modelMapper.map(studentResult.get(),StudentResponseDTO.class);

         */
        //2da forma
        Student studentResult= studentsRepository.findById(idStudent).orElseThrow(()->{throw new RuntimeException();});
        return modelMapper.map(studentResult,StudentResponseDTO.class);
    }

    public SuccessDTO deleteStudent(Integer idStudent) {
        studentsRepository.deleteById(idStudent);
        Optional<Student> resultado= studentsRepository.findById(idStudent);
        if(resultado.isEmpty()){
            return new SuccessDTO("Se elimino el estudiante con id "+idStudent, HttpStatus.OK.value());
        }
        else
            throw new RuntimeException();
    }
}
