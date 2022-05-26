package com.santander.sorteo.controller;

import com.santander.sorteo.dto.request.AlumnoResquestDTO;
import com.santander.sorteo.dto.response.AlumnoResponseDTO;
import com.santander.sorteo.dto.response.SuccessDTO;
import com.santander.sorteo.entity.Alumno;
import com.santander.sorteo.repository.IAlumnoRepository;
import com.santander.sorteo.service.AlumnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AlumnoController {
    @Autowired
    AlumnoService alumnoService;

    @PostMapping("/students")
    public ResponseEntity<SuccessDTO> newStudents (@RequestBody AlumnoResquestDTO alumnoResquestDTO) {
        return ResponseEntity.status(201).body(alumnoService.newStudents(alumnoResquestDTO));
    }

    @GetMapping("/students/")
    public ResponseEntity<List<AlumnoResponseDTO>> getStudents () {
        List<AlumnoResponseDTO> listStudents = alumnoService.getStudents();
        return new ResponseEntity<>(listStudents, HttpStatus.OK);
    }

    @GetMapping("/students/draw")
    public ResponseEntity<List<AlumnoResponseDTO>> drawStudents () {
        return new ResponseEntity<>(alumnoService.drawStudents(), HttpStatus.OK);
    }
}
