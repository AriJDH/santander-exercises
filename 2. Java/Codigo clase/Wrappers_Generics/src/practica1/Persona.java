package practica1;

import org.codehaus.groovy.runtime.StringGroovyMethods;

public class Persona implements DAO<String, Integer>//Comparable<
        {
    private String nombre;
    private String apellido;
    private int dni;

    //comparable se usa para hacer un sort de forma distinta

    public Persona(String nombre, String apellido,int dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni=dni;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }


    @Override
    public Integer mostrarKey(String sas) {
        return dni;
    }
}
