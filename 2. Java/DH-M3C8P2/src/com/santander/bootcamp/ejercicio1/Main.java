package com.santander.bootcamp.ejercicio1;

import com.santander.bootcamp.ejercicio1.models.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println();

        List<Estudiante> estudiantes = new ArrayList<>();
        estudiantes.add(new Estudiante("Gonzalo", "Aguirre", "000", "AAA"));
        estudiantes.add(new EstudianteTecnico("Julian", "Lastuvka", "111", "BBB"));
        estudiantes.add(new Tutor("Matias", "Romero", "222", "CCC"));

        for (Estudiante e: estudiantes) {
            e.asistir();
        }

        ((EstudianteTecnico) estudiantes.get(1)).arreglar();
        ((Tutor) estudiantes.get(2)).educar();

        List<Personal> personal = new ArrayList<>();
        personal.add(new PersonalMantenimiento("Juan", "Rodriguez", "333", "DDD"));
        personal.add(new PersonalSoporteTecnico("Maria", "Vonka", "444", "EEE"));
        personal.add(new Profesor("Laura", "Kalous", "555", "FFF"));

        for (Personal p: personal) {
            p.trabajar();
        }

        ((PersonalSoporteTecnico) personal.get(1)).arreglar();
        ((Profesor) personal.get(2)).educar();
    }
}
