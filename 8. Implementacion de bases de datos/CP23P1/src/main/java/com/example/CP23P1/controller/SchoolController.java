package com.example.CP23P1.controller;

import com.example.CP23P1.dto.request.AlumnoCreateRequestDTO;
import com.example.CP23P1.dto.request.TemaCreateRequestDTO;
import com.example.CP23P1.dto.response.AlumnoResponseDTO;
import com.example.CP23P1.dto.response.AlumnoResponseDrawDTO;
import com.example.CP23P1.dto.response.SuccessDTO;
import com.example.CP23P1.dto.response.TemaResponseDTO;
import com.example.CP23P1.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SchoolController {

    @Autowired
    SchoolService schoolService;


    @PostMapping(value = "/students")
    public ResponseEntity<SuccessDTO> crearAlumno(@RequestBody AlumnoCreateRequestDTO alumnoCreateRequestDTO){
        return new ResponseEntity<SuccessDTO>(schoolService.crearAlumno(alumnoCreateRequestDTO), HttpStatus.CREATED);
    }
    @PostMapping(value = "/topics")
    public ResponseEntity<SuccessDTO> crearTema(@RequestBody TemaCreateRequestDTO temaCreateRequestDT){
        return new ResponseEntity<SuccessDTO>(schoolService.crearTema(temaCreateRequestDT), HttpStatus.CREATED);
    }

    @GetMapping(value = "/students/")
    public ResponseEntity<List<AlumnoResponseDTO>> mostrarAlumnos(){
        return new ResponseEntity<List<AlumnoResponseDTO>>(schoolService.mostarAlumnos(), HttpStatus.OK);
    }
    @GetMapping(value = "/topics/")
    public ResponseEntity<List<TemaResponseDTO>> mostrarTemas(){
        return new ResponseEntity<List<TemaResponseDTO>>(schoolService.mostrarTemas(), HttpStatus.OK);
    }

    @GetMapping(value = "/students/draw")
    public ResponseEntity<List<AlumnoResponseDrawDTO>> sortearAlumno(){
        return new ResponseEntity<List<AlumnoResponseDrawDTO>>(schoolService.sortearAlumnos(), HttpStatus.CREATED);
    }

}
