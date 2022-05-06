package com.practica.obtenerdiploma.controller;

import com.practica.obtenerdiploma.model.StudentDTO;
import com.practica.obtenerdiploma.service.IObtenerDiplomaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ObtenerDiplomaController {

    @Autowired
    IObtenerDiplomaService service;

    @GetMapping("/analyzeScores/{studentId}")
    public StudentDTO analyzeScores(@PathVariable Long studentId) {
        return service.analyzeScores(studentId);
    }
}
