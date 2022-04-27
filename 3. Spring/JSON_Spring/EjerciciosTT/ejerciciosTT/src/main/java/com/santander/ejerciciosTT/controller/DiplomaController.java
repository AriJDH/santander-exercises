package com.santander.ejerciciosTT.controller;

import com.santander.ejerciciosTT.models.Alumno;
import com.santander.ejerciciosTT.service.DiplomaService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class DiplomaController {

    DiplomaService service = new DiplomaService();

    @PostMapping("/diploma")
    public String mostrarDiploma(@RequestBody Alumno alumno) {
        return service.mostrarDiploma(alumno).getMensaje();
    }
}
