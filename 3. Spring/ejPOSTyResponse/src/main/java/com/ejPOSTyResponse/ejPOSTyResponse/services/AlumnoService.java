package com.ejPOSTyResponse.ejPOSTyResponse.services;

import com.ejPOSTyResponse.ejPOSTyResponse.dto.AlumnoDTO;
import com.ejPOSTyResponse.ejPOSTyResponse.dto.HabitacionDTO;

import java.util.OptionalDouble;

public class AlumnoService {

    public String mesajefor(AlumnoDTO a1) {
        String messageDiploma;
        messageDiploma = "Hola, " + a1.getNombre();
        Double prom = (a1.getMaterias().stream().mapToDouble(p -> p.getNota()).sum()) / (a1.getMaterias().size());
        if (prom > 9) {
            messageDiploma += ". Flacx, sos un genix..";
        }
        messageDiploma += ". Tu promedio es de " + prom;
        return (messageDiploma);
    }

}
