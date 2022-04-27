package com.santander.ejerciciosTT.service;

import com.santander.ejerciciosTT.models.Alumno;
import com.santander.ejerciciosTT.DTO.DiplomaDTO;

public class DiplomaService {

    public DiplomaDTO mostrarDiploma(Alumno alumno) {
        double promedio = 0;
        double contador = 0;
        for (Integer nota : alumno.getMateriasAprobadas().values()) {
            promedio += nota;
            contador++;
        }
        DiplomaDTO diploma = new DiplomaDTO(promedio/contador, alumno.getNombre());
        if(diploma.getPromedio() >= 9){
            diploma.setMensaje(diploma.getMensaje() + ". ¡¡Felicitaciones " + alumno.getNombre() + "!!");
        }
        return diploma;
    }
}
