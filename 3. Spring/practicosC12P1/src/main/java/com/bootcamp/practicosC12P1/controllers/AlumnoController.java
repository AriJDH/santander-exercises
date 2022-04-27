package com.bootcamp.practicosC12P1.controllers;

import com.bootcamp.practicosC12P1.models.Alumno;
import com.bootcamp.practicosC12P1.models.Diploma;
import com.bootcamp.practicosC12P1.services.AlumnoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AlumnoController {

    AlumnoService service = new AlumnoService();

    @GetMapping(path = "getAlumno/{nombre}")
    public Alumno getAlumno(@PathVariable String nombre){
        return service.getAlumno(nombre);
    }

    @PostMapping(path = "addAlumno")
    public void addAlumno(@RequestBody Alumno alumno){
        service.addAlumno(alumno);
    }

    @GetMapping(path = "getAlumnos")
    public List<Alumno> getAlumnos(){
        return service.getAlumnos();
    }

    @GetMapping(path = "calcularPromedio/{nombre}")
    public double getPromedioAlumno(@PathVariable String nombre){
        return service.calcularPromedio(service.getAlumno(nombre));
    }

    @GetMapping(path = "verDiploma/{nombre}")
    public Diploma getDiplomaByAlumno(@PathVariable String nombre){
        return service.getDiploma(service.getAlumno(nombre));
    }


}
