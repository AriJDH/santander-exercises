package clases.estudiantes;

import clases.general.Cursos;
import clases.interfaz.Estudio;

import java.util.List;

public class EstudianteTecnico extends Estudiante implements Estudio {


    public EstudianteTecnico(int legajo, String nombre, String fechaNacimiento, int edad, List<Cursos> cursos) {
        super(legajo, nombre, fechaNacimiento, edad, cursos);
    }

    @Override
    public void participar() {
        System.out.println("Estoy aprendiendo a ser de soporte tecnico!");
    }
}
