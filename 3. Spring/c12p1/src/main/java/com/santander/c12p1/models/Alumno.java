package com.santander.c12p1.models;

import com.santander.c12p1.DTO.DiplomaDTO;

import java.util.ArrayList;

public class Alumno {

    String nombre;
    ArrayList<Asignatura> asignaturas = new ArrayList<>();
    String mensaje;

    public Alumno(String nombre, ArrayList<Asignatura> asignaturas) {
        this.nombre = nombre;
        this.asignaturas = asignaturas;
        this.mensaje = "Felicidades, ....";
    }

    public double calcularPromedio() {
        double total = 0;
        for (int i = 0; i < asignaturas.size() ; i++) {
            total += asignaturas.get(i).getNota();
        }

        System.out.println(total);
        return total / asignaturas.size();
    }

    public DiplomaDTO generarDiploma(Boolean felicitaciones){

        DiplomaDTO diploma = new DiplomaDTO(nombre, calcularPromedio(), mensaje, felicitaciones);
        return diploma;
    }
    

}
