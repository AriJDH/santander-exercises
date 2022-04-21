package com.santander.bootcamp.ejercicio1.main;

import com.santander.bootcamp.ejercicio1.clases.*;

import java.util.Date;

public class App {

    public static void main(String[] args) {

        Date fecha = new Date(2022,01,22);

        Profesor profesor = new Profesor(001,"pepito",00001,fecha);
        profesor.dictarClases();

        Estudiante estudiante = new Estudiante(002,"pepita", 65461);
        estudiante.asistirAClases();

        Tutor tutor = new Tutor(003,"pepo", 7887);
        tutor.dictarClases();

        EstudianteTecnico estudianteTec = new EstudianteTecnico(004, "pepin", 564654);
        estudianteTec.darSoporte();

    }
}

