package com.santanderbootcamp.ClasesAbstractasEInterfaces.Ejercicio1.modelos;

import java.util.HashMap;
import java.util.Map;

public class Estudiante extends Persona {
    protected HashMap<Curso, Nota> cursoYNota;

    public Estudiante(String dni, String nombre, String apellido, String fechaNacimiento) {
        super(dni, nombre, apellido, fechaNacimiento);
        this.cursoYNota = new HashMap<>();
    }

    public void inscribirCurso(Curso curso) {
        Nota nota = new Nota();
        cursoYNota.put(curso, nota);
    }

    public void desinscribirCurso(String nombre) {
        for(Map.Entry<Curso, Nota> curso: cursoYNota.entrySet()) {
            if (nombre.equals(curso.getKey().getNombre())) {
                cursoYNota.remove(curso.getKey());
            }
        }
    }

    public HashMap<Curso, Nota> getCursoYNota() {
        return cursoYNota;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "Curso y Notas=" + cursoYNota +
                "} " + super.toString();
    }
}
