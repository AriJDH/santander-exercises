package com.santander.c12p1.controller;


import com.santander.c12p1.DTO.DiplomaDTO;
import com.santander.c12p1.models.Alumno;
import com.santander.c12p1.services.DiplomaService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Diploma {

    @PostMapping
    public DiplomaDTO generarDiploma(@RequestBody Alumno alumno){

        DiplomaService diplomaService = new DiplomaService(alumno);
        return diplomaService.generarDiploma();
    }
}
