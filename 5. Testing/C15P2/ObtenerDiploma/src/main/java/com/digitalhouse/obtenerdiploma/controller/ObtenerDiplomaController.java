package com.digitalhouse.obtenerdiploma.controller;

import com.digitalhouse.obtenerdiploma.model.StudentDTO;
import com.digitalhouse.obtenerdiploma.service.IObtenerDiplomaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class ObtenerDiplomaController {

    @Autowired
    IObtenerDiplomaService service;

    @PostMapping("/analyzeScores")
    public StudentDTO analyzeScores(@Valid @RequestBody StudentDTO rq) {
        return service.analyzeScores(rq);
    }
}
