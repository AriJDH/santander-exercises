package clases.general;

import clases.empleados.Profesor;
import clases.estudiantes.Estudiante;
import clases.estudiantes.EstudianteTecnico;

import java.util.List;

public class Cursos {
    private int id;
    private String nombre;
    private Profesor profesor;
    private List<Estudiante> estudiantes;

    public Cursos(int id, String nombre, Profesor profesor, List<Estudiante> estudiantes) {
        this.id = id;
        this.nombre = nombre;
        this.profesor = profesor;
        this.estudiantes = estudiantes;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(List<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }
}
