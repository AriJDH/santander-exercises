package com.example.sorteo.controller;

import com.example.sorteo.dto.StudentDTO;
import com.example.sorteo.dto.SuccessDTO;
import com.example.sorteo.service.StudentDrawService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentDrawController {

    @Autowired
    private StudentDrawService studentDrawService;

    @PostMapping("/students")
    public ResponseEntity<SuccessDTO> addStudent(@RequestBody StudentDTO studentDTO){
        SuccessDTO successDTO = studentDrawService.addStudent(studentDTO);
        return ResponseEntity.ok().body(successDTO);
    }
}
