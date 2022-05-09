package com.C12P1.Diploma.Controllers;

import com.C12P1.Diploma.Modelo.Alumno;
import com.C12P1.Diploma.Servicio.AlumnoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlumnoController {

    @Autowired
    AlumnoServicio alumnoServicio;


    @GetMapping(path="/getDiploma/{nombreAlumno}")
    public String getDiploma(@PathVariable String nombreAlumno){
    return  alumnoServicio.Promedio(nombreAlumno);
}
}
