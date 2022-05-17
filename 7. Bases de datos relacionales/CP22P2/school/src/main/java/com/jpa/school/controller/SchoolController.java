package com.jpa.school.controller;

import com.jpa.school.dto.StudentDTO;
import com.jpa.school.dto.SuccessDTO;
import com.jpa.school.dto.response.StudentResponseDTO;
import com.jpa.school.service.SchoolService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.net.http.HttpResponse;
import java.util.List;

@RestController
public class SchoolController {

    @Autowired
    SchoolService schoolService;

    @PostMapping("/student")
    public ResponseEntity<SuccessDTO> addStudent(@RequestBody StudentDTO student){
        if(this.schoolService.addStudent(student)){
            return ResponseEntity.ok()
                    .body(new SuccessDTO("Se ha creado el alumno", HttpStatus.CREATED.value()));
        }
        else
            throw new RuntimeException();
    }

    @GetMapping("/student")
    public ResponseEntity<List<StudentResponseDTO>> listStudents(){
        return ResponseEntity.ok().body(schoolService.findAllStudents());
    }

    public void getStudentById(){

    }

    public void deleteStudent(){

    }
}
