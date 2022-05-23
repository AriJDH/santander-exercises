package com.santander.sorteo.controller;

import com.santander.sorteo.dto.request.AlumnoResquestDTO;
import com.santander.sorteo.dto.response.SuccessDTO;
import com.santander.sorteo.service.AlumnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlumnoController {
    @Autowired
    AlumnoService alumnoService;

    @PostMapping("/students")
    public ResponseEntity<SuccessDTO> newStudent (@RequestBody AlumnoResquestDTO alumnoResquestDTO) {
        return ResponseEntity.status(201).body(alumnoService.newStudent(alumnoResquestDTO));
    }



}
