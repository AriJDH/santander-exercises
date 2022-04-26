package com.santander.bootcamp.M4C12P1.services;

import com.santander.bootcamp.M4C12P1.DTO.DiplomaDTO;
import com.santander.bootcamp.M4C12P1.models.Alumno;

public class DiplomaService {

    public DiplomaDTO obtenerDiploma(Alumno alumno) {
        return new DiplomaDTO(alumno, "Diploma del curso");
    }
}
