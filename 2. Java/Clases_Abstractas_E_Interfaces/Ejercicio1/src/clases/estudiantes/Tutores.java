package clases.estudiantes;

import clases.general.Cursos;
import clases.interfaz.Estudio;

import java.util.List;

public class Tutores extends Estudiante implements Estudio {
    public Tutores(int legajo, String nombre, String fechaNacimiento, int edad, List<Cursos> cursos) {
        super(legajo, nombre, fechaNacimiento, edad, cursos);
    }


    @Override
    public void participar() {
        System.out.println("Estoy ayudando a dar clases!");
    }
}
