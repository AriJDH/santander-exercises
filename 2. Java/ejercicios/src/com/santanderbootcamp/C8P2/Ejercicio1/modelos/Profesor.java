package com.santanderbootcamp.ClasesAbstractasEInterfaces.Ejercicio1.modelos;

import com.santanderbootcamp.ClasesAbstractasEInterfaces.Ejercicio1.interfaces.Instructor;

import java.util.Map;

public class Profesor extends MiembroDelPersonal implements Instructor {

    public Profesor(String dni, String nombre, String apellido, String fechaNacimiento, String legajo, String fechaIncorporacion, double sueldo) {
        super(dni, nombre, apellido, fechaNacimiento, legajo, fechaIncorporacion, sueldo);
    }

    @Override
    public void enseniarA(Estudiante estudiante) {
        boolean profesorEnseniaEnCurso = false;
        for(Map.Entry<Curso, Nota> curso: estudiante.getCursoYNota().entrySet()) {
            if (curso.getKey().getProfesor() == this) {
                profesorEnseniaEnCurso = true;
            }
        }
        if(profesorEnseniaEnCurso) {
            System.out.println("El profesor le enseño a " + estudiante.getNombre() + " " + estudiante.getApellido());
        }
        else {
            System.out.println("El estudiante no se encuentra en el curso");
        }
    }
}
