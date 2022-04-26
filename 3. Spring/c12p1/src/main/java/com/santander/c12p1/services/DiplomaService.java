package com.santander.c12p1.services;

import com.santander.c12p1.DTO.DiplomaDTO;
import com.santander.c12p1.controller.Diploma;
import com.santander.c12p1.models.Alumno;
import com.santander.c12p1.models.Asignatura;

import java.util.ArrayList;


public class DiplomaService {

    Alumno alumno;

    public DiplomaService(Alumno alumno) {
        this.alumno = alumno;
    }

    public DiplomaDTO generarDiploma(){
        Boolean FELICITACIONES = false;

        if(alumno.calcularPromedio() > 9) {
            FELICITACIONES = true;
        }

        return alumno.generarDiploma(FELICITACIONES);

    }
}
