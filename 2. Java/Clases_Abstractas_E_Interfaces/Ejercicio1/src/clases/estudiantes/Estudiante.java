package clases.estudiantes;

import clases.general.Cursos;
import clases.general.Persona;
import clases.interfaz.Estudio;

import java.util.List;

public class Estudiante extends Persona implements Estudio {
    private List<Cursos>cursos;

    public Estudiante(int legajo, String nombre, String fechaNacimiento, int edad, List<Cursos> cursos) {
        super(legajo, nombre, fechaNacimiento, edad);
        this.cursos = cursos;
    }

    public List<Cursos> getCursos() {
        return cursos;
    }

    public void setCursos(List<Cursos> cursos) {
        this.cursos = cursos;
    }

    @Override
    public void participar() {
        System.out.println("Estoy estudiando!");
    }
}
