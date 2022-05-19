package com.example.sorteo.controller;

import com.example.sorteo.dto.RequestAlumnoDto;
import com.example.sorteo.dto.ResponseAlumnoDto;
import com.example.sorteo.dto.ResponseDto;
import com.example.sorteo.entity.Alumno;
import com.example.sorteo.service.AlumnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Controller
public class AlumnoController {

    @Autowired
    AlumnoService alumnoService;

    @PostMapping("/students")
    public ResponseEntity<ResponseDto> addStudent(@RequestBody RequestAlumnoDto alumnoDto) {
        return ResponseEntity.status(201).body(alumnoService.addStudent(alumnoDto));
    }

    @GetMapping("/students/")
    public ResponseEntity<List<ResponseAlumnoDto>> listarAlumnos(){
        return ResponseEntity.ok().body(alumnoService.listarAlumnos());
    }

}
