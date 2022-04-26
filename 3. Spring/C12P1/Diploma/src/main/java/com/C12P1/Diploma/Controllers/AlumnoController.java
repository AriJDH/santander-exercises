package com.C12P1.Diploma.Controllers;

import com.C12P1.Diploma.Modelo.Alumno;
import com.C12P1.Diploma.Servicio.AlumnoServicio;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public class AlumnoController {
    AlumnoServicio alumnoServicio = new AlumnoServicio();

    @GetMapping(path="/getDiploma/{alumno}")
    public String getDiploma(@PathVariable Alumno alumno){
    return alumnoServicio.MensajeAlumno(alumno) + alumnoServicio.PromedioAlumno(alumno);
}
}
