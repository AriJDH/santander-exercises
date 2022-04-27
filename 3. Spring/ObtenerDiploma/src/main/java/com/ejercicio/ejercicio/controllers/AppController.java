package com.ejercicio.ejercicio.controllers;

import com.ejercicio.ejercicio.models.Alumno;
import com.ejercicio.ejercicio.models.Diploma;
import com.ejercicio.ejercicio.services.GenerarDiplomaService;
import org.springframework.web.bind.annotation.*;

@RestController
public class AppController {
    GenerarDiplomaService generarDiplomaService = new GenerarDiplomaService();
   // AlumnoService alumnoService = new AlumnoService();

    @GetMapping("/getalumno")
    public Alumno getalumno(){
        return generarDiplomaService.getAlumno();
    }

    @PostMapping("/postalumno")
    public void postalumno(@RequestBody Alumno alumno) {
        generarDiplomaService.postAlumno(alumno);
    }

    @GetMapping("/getdiploma")
    public Diploma getdiploma(){
        return generarDiplomaService.getDiploma();
    }

}
