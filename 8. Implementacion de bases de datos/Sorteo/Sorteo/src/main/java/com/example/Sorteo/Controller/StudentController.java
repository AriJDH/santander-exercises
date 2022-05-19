package com.example.Sorteo.Controller;

import com.example.Sorteo.Dtos.StudentDto;
import com.example.Sorteo.Dtos.StudentResponseDto;
import com.example.Sorteo.Dtos.SuccessDto;
import com.example.Sorteo.Models.Student;
import com.example.Sorteo.Services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class StudentController {
    @Autowired
    StudentService studentService;

    @GetMapping("/students")
    public ResponseEntity<List<StudentResponseDto>> getStudents() {
        return ResponseEntity.ok().body(studentService.getStudents());
    }
    @PostMapping("/students")
    public ResponseEntity<SuccessDto> addStudent(@RequestBody StudentDto studentDto){
        if(this.studentService.addStudent(studentDto)){
            return ResponseEntity.ok()
                    .body(new SuccessDto("Se ha creado el estudiante", HttpStatus.CREATED.value()));

        }
        else
            throw new RuntimeException();
    }

}
