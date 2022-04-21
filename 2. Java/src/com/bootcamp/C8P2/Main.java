package com.bootcamp.C8P2;

import com.bootcamp.C8P2.modelo.Estudiante;
import com.bootcamp.C8P2.modelo.EstudianteTecnico;
import com.bootcamp.C8P2.modelo.Persona;
import com.bootcamp.C8P2.modelo.Tutor;

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

    }
}
