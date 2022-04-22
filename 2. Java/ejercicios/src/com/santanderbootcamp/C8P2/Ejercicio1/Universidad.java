package com.santanderbootcamp.C8P2.Ejercicio1;

import com.santanderbootcamp.C8P2.Ejercicio1.interfaces.*;
import com.santanderbootcamp.C8P2.Ejercicio1.modelos.*;

public class Universidad {
    public static void main(String[] args) {
        Profesor profeGit = new Profesor("14714376", "Cesar", "Elromano", "19670101", "ASF50", "20220101", 133000.0);
        Profesor profeJava = new Profesor("24247655", "Maria", "Correa", "19800101", "FJA21", "20200620", 144000.0);
        Profesor profeSpring = new Profesor("14293047", "Martin", "Feliz", "19701010", "POI11", "20190313", 155000.0);
        MiembroDelPersonal mantenimiento = new PersonalMantenimiento("32323511", "Jorge", "Perez", "19870130", "MFA31", "20171213", 120000.0);
        PersonalSoporteTecnico soporteTecnico = new PersonalSoporteTecnico("32131256", "Miguel", "Anteojos", "19850911", "UWW11", "20160513", 125000.0);

        Curso cursoGit = new Curso("Curso de Git", "A1", profeGit);
        Curso cursoJava = new Curso("Curso de Git", "A1", profeJava);
        Curso cursoSpring = new Curso("Curso de Git", "A1", profeSpring);

        Estudiante estudiante = new Estudiante("51234712","Daniela", "Martinez", "20051010");
        Estudiante estudianteTec = new EstudianteTecnico("42131232","Daniela", "Martinez", "20000510");
        Estudiante estudianteTutor = new Tutor("32421445","Daniela", "Martinez", "19920120");

        estudiante.inscribirCurso(cursoGit);
        estudianteTec.inscribirCurso(cursoJava);
        estudianteTutor.inscribirCurso(cursoSpring);

        Instructor sujetosInstructores[] = {(Instructor) estudianteTutor, profeGit,profeJava,profeSpring};

        for(Instructor sujeto: sujetosInstructores) {
            sujeto.enseniarA(estudiante);
        }

        Tecnico sujetosTecnicos[] = {(Tecnico) estudianteTec, soporteTecnico};

        for(Tecnico sujeto: sujetosTecnicos) {
            sujeto.atenderReclamo();
        }

        System.out.println(profeGit);
        System.out.println(estudiante);
        System.out.println(mantenimiento);
    }
}
