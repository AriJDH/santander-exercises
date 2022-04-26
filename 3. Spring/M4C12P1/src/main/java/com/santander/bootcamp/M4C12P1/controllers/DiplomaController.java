package com.santander.bootcamp.M4C12P1.controllers;

import com.santander.bootcamp.M4C12P1.DTO.DiplomaDTO;
import com.santander.bootcamp.M4C12P1.models.Alumno;
import com.santander.bootcamp.M4C12P1.services.DiplomaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DiplomaController {

    private final DiplomaService service = new DiplomaService();

    @PostMapping("/obtenerDiploma")
    public ResponseEntity<DiplomaDTO> obtenerDiploma(@RequestBody Alumno alumno) {
        return new ResponseEntity<>(service.obtenerDiploma(alumno), HttpStatus.OK);
    }
}
