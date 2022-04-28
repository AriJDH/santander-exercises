package com.santander.C12P1EjercicioPractico.controller;

import com.santander.C12P1EjercicioPractico.dto.AlumnoDTO;
import com.santander.C12P1EjercicioPractico.dto.DiplomaDTO;
import com.santander.C12P1EjercicioPractico.servicios.DiplomaService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class Diploma {
    //Inicializo DiplomaServicio
    private final DiplomaService diplomaService;

    //Constructor
    public Diploma(DiplomaService diplomaService) {
        this.diplomaService = diplomaService;
    }

    @PostMapping("/calcular_promedio")
    public DiplomaDTO analizar_alumno(AlumnoDTO alumno){
        System.out.println("Esta todo ok");
        return diplomaService.analizar_alumno(alumno);
    }


}
