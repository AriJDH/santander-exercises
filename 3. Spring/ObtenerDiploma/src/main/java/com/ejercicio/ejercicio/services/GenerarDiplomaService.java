package com.ejercicio.ejercicio.services;

import com.ejercicio.ejercicio.models.Alumno;
import com.ejercicio.ejercicio.models.Diploma;
import com.ejercicio.ejercicio.models.Materias;
import com.ejercicio.ejercicio.repository.AlumnoRepository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class GenerarDiplomaService {
    AlumnoRepository alumnoRepository = new AlumnoRepository();
    public Diploma getDiploma() {
        //Resta logica de promedio y creacion del diploma
        //se devuelve un diploma a forma de testeo pero falta logica
        Diploma diploma = new Diploma();
        diploma.setAlumno("Her");
        diploma.setMensaje("Aprobado");
        diploma.setPromedio(10);

        return diploma;
    }



}
