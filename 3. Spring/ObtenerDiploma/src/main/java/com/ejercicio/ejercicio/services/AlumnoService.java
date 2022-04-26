package com.ejercicio.ejercicio.services;

import com.ejercicio.ejercicio.models.Alumno;
import com.ejercicio.ejercicio.repository.AlumnoRepository;

public class AlumnoService {
    AlumnoRepository alumnoRepository = new AlumnoRepository();
    public void postAlumno(Alumno alumno) {
        alumnoRepository.setAlumno(alumno);
    }

    public Alumno getAlumno() {
        return alumnoRepository.getAlumno();
    }
}
