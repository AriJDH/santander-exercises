package com.ejercicio1.Ejercicio1.controller;

import com.ejercicio1.Ejercicio1.dto.AlumnoDTO;
import com.ejercicio1.Ejercicio1.service.DiplomaService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DiplomaController {

    DiplomaService diplomaService = new DiplomaService();


    @PostMapping("/obtenerDiploma")
    public String devolverDiploma(@RequestBody AlumnoDTO alumno) {
        return diplomaService.devolverDiploma(alumno).mostrarMensaje();
    }
}