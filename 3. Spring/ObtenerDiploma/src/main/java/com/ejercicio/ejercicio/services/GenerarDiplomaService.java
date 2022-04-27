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
    public void postAlumno(Alumno alumno) {
        alumnoRepository.setAlumno(alumno);
    }

    public Alumno getAlumno() {
        return alumnoRepository.getAlumno();
    }
    public Diploma getDiploma() {


        int acum = 0;
        int cant = 0;
        for (Materias materia : alumnoRepository.getAlumno().getMaterias()) {

            cant ++;
            acum += materia.getNota();
        }
        double promedio = acum / cant;
        String mensaje = "";
        if (promedio > 9) {
            mensaje = "Felicitaciones";
        }
        else {
            mensaje = "Se graduo";
        }
        Diploma diploma = new Diploma();
        diploma.setAlumno(alumnoRepository.getAlumno().getNombre().toString());
        diploma.setMensaje(mensaje);
        diploma.setPromedio(promedio);

        return diploma;
    }



}
