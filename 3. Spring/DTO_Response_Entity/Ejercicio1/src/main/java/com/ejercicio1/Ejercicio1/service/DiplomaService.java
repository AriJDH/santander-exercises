package com.ejercicio1.Ejercicio1.service;

import com.ejercicio1.Ejercicio1.dto.AlumnoDTO;
import com.ejercicio1.Ejercicio1.dto.DiplomaDTO;

public class DiplomaService {

    public DiplomaDTO devolverDiploma(AlumnoDTO alumno){
        double promedio=0;
        int contAux=0;
        for (Integer nota :
                alumno.getNotas().values()) {
            promedio=promedio+nota;
            contAux++;
        }
        DiplomaDTO diploma = new DiplomaDTO((promedio/contAux),alumno.getNombre());
        if(diploma.getPromedio()>9){
            diploma.setMensaje(diploma.getMensaje()+ " Felicitaciones!");
        }
        return diploma;

    }
}
