package com.santander.ejerciciosAbstractasPoli;

public class Profesores extends Personal{
    private String materia;

    public Profesores(String dni, String nombre, int legajo, String materia) {
        super(dni, nombre, legajo);
        this.materia = materia;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }
    public void retarAlumno(Estudiante estudiante){
        System.out.println(estudiante.getNombre()+" QUE ESTAS HACIENDO!!!!!");
    }
}
