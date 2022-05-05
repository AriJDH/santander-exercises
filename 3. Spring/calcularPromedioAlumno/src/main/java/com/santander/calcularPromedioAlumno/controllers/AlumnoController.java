package com.santander.calcularPromedioAlumno.controllers;

import com.santander.calcularPromedioAlumno.dto.AlumnoDTO;
import com.santander.calcularPromedioAlumno.dto.DiplomaDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.santander.calcularPromedioAlumno.services.ServiceAlumno;

@RestController
public class AlumnoController {

    @Autowired
    ServiceAlumno alumnoService;


    @GetMapping("/diploma")
    public ResponseEntity<DiplomaDTO> obtenerDiploma(@RequestBody AlumnoDTO alumno){
        System.out.println(alumno);
        return new ResponseEntity<>(alumnoService.obtenerDiploma(alumno), HttpStatus.OK);
    }

    @GetMapping("/hola")
    public String hola(){
        return "holaaaa";
    }
}
