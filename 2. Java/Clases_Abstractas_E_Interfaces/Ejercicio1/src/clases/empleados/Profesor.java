package clases.empleados;

import clases.general.Cursos;
import clases.general.Empleado;

import java.util.List;

public class Profesor extends Empleado {
    private List<Cursos> cursos;

    public List<Cursos> getCursos() {
        return cursos;
    }

    public void setCursos(List<Cursos> cursos) {
        this.cursos = cursos;
    }

    public Profesor(int legajo, String nombre, String fechaNacimiento, int edad, double salario, List<Cursos> cursos) {
        super(legajo, nombre, fechaNacimiento, edad, salario);
        this.cursos = cursos;


    }

    @Override
    public void laburar() {
        System.out.println("Laburo como profesor!");
    }
}
