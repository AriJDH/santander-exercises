package com.santander;

import com.santander.modelos.*;

public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona("Leonardo","12345679");
        Estudiante estudiante = new Estudiante("Juan","38998262",94048);
        EstudianteTecnico estudianteTecnico = new EstudianteTecnico("Juan","36998262",98456);
        Tutor tutor = new Tutor("Carlos","36893756",65389);

        tutor.clases_de_matematicas();
        estudianteTecnico.reparacion_pc();

        Profesor profesor = new Profesor("Alejandro","34567");

        profesor.clases_de_matematicas();

        SoporteTecnico soporteTecnico = new SoporteTecnico("Manuel","87543");
        soporteTecnico.reparacion_pc();

        PersonalDeMantenimiento personalDeMantenimiento = new PersonalDeMantenimiento("Rebeca","67345");
    }
}
