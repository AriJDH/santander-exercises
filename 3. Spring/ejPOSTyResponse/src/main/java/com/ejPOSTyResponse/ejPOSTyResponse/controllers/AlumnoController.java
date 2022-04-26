package com.ejPOSTyResponse.ejPOSTyResponse.controllers;

import com.ejPOSTyResponse.ejPOSTyResponse.modelo.Alumno;
import com.ejPOSTyResponse.ejPOSTyResponse.services.AlumnoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.OptionalDouble;

@RestController
public class AlumnoController {
    private AlumnoService ser= new AlumnoService();
    @PostMapping("/alumnos")
    public ResponseEntity<String> addAlumno(@RequestBody Alumno a1){
        ser.addAlumno(a1);
        return new ResponseEntity<>("se agrego el registro exitosamente", HttpStatus.OK);
    }

    @GetMapping("/diploma/{alum}")
    public ResponseEntity<String> getDiploma(@PathVariable String alum){
        Double prom= ser.getPromedio(alum);
        String mensaje="";
        if (prom>9){
            mensaje="alto promedio perro";
        }else{
            mensaje="felicitaciones";
        }
        return new ResponseEntity<>("alumno: "+ alum + " tiene como promedio "+ prom +", " + mensaje , HttpStatus.OK);
    }
}
