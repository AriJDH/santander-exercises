package com.santanderbootacamp.Ejercicios.controllers;

import com.santanderbootacamp.Ejercicios.dto.AlumnoDto;
import com.santanderbootacamp.Ejercicios.services.DiplomaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ObtenerDiplomaController {
    DiplomaService diplomaService = new DiplomaService();

    @PostMapping("/alumnos/agregar")
    public ResponseEntity<String> agregarAlumno(@RequestBody AlumnoDto alumno) {
        if (diplomaService.agregarAlumno(alumno.getNombre(), alumno.getAsignaturas())) {
            return new ResponseEntity<>("Se agrego el alumno.", HttpStatus.OK);
        }
        return new ResponseEntity<>("Los datos ingresados son incorrectos.", HttpStatus.BAD_REQUEST);
    }

    @PostMapping("/alumnos/diploma")
    public String diplomaDe(@RequestBody AlumnoDto alumno) {
        try {
            return diplomaService.diplomaDe(alumno.getNombre());
        }
        catch (NullPointerException e) {
            return "";
        }
    }

    @PostMapping("/alumnos/listar")
    public List<String> getAlumnos() {
        return diplomaService.listarAlumnos();
    }
}
