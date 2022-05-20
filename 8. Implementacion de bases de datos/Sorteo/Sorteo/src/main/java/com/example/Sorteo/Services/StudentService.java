package com.example.Sorteo.Services;

import com.example.Sorteo.Dtos.StudentDto;
import com.example.Sorteo.Dtos.StudentResponseDto;
import com.example.Sorteo.Models.Student;
import com.example.Sorteo.Repository.IStudentRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
@Service
public class StudentService {

    @Autowired
    IStudentRepository iStudentRepository;
    ModelMapper modelMapper = new ModelMapper();


    public List<StudentDto> getStudents() {
        List<Student> studentList = iStudentRepository.findAll();
        return studentList.stream()
                .map(student ->
                        modelMapper.map(student, StudentDto.class)).collect(Collectors.toList());
    }
    public Boolean addStudent(StudentDto studentDto) {
        Student student = modelMapper.map(studentDto, Student.class);

        student =  this.iStudentRepository.save(student);

        if(student.getId() != null) return true; else return false;
    }

    public List<StudentResponseDto> getStudentsDraw() {
        List<Student> studentList = iStudentRepository.findAll();
        if (studentList.size()>=15) {
        List<Student> studentListDraw = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            studentListDraw.add(studentList.get(getRandomInt()));
        }

        return studentListDraw.stream()
                .map(student ->
                        modelMapper.map(student, StudentResponseDto.class)).collect(Collectors.toList());
        } else throw new RuntimeException();
    }
    public int getRandomInt() {
        return (int) Math.floor(Math.random() * 16);
    }


}
