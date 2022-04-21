package com.bootcamp.C8P2.practica;

import com.bootcamp.C8P2.practica.modelo.*;

public class Main {
    public static void main(String[] args) {
        // miembrosDelPersonal,Estudiantes,Profesores,
        // PersonalDeMantenimiento,Tutores,PersonalDeSoporteTecnico
        // estduiantes tecnicos
        Persona persona = new Persona("Juan","38998262");
        Estudiante estudiante = new Estudiante("Juan","38998262","99535");
        EstudianteTecnico estudianteTecnico = new EstudianteTecnico("Juan","36998262","87657");
        Tutor tutor = new Tutor("Carlos","36893756","81920");

        tutor.dar_clases();
        estudianteTecnico.dar_servicio_tecnico();

        Profesor profesor = new Profesor("Carlos","36893756","81920");

        profesor.dar_clases();

        PersonalSoporteTecnico personalSoporteTecnico = new PersonalSoporteTecnico("Carlos","36893756","81920");
        personalSoporteTecnico.dar_servicio_tecnico();

        PersonalMantenimiento personalMantenimiento = new PersonalMantenimiento("Carlos","36893756","81920");


    }
}
