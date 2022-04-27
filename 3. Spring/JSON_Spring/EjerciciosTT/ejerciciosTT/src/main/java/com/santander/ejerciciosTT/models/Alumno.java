package com.santander.ejerciciosTT.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
@AllArgsConstructor
public class Alumno {
    private String nombre;
    private HashMap<String, Integer> materiasAprobadas;

    /*
    public Alumno(String nombre, List<Map.Entry<String, Integer>> materiasAprobadas){
        this.nombre = nombre;
        this.materiasAprobadas = new HashMap<>();

        for(Map.Entry<String, Integer> materiaAprobada : materiasAprobadas){
            this.materiasAprobadas.put(materiaAprobada.getKey(), materiaAprobada.getValue());
        }
    }
     */
}
