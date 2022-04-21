package com.santander.sistema;

public class Persona {
    private int dni;
    private String nombre;
    private int edad;

    public Persona(int dni, String nombre, int edad) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
    }

    public int getDni() {return dni;}
    public String getNombre() {return nombre;}
    public int getEdad() {return edad;}

    public void setDni(int dni) {this.dni = dni;}
    public void setNombre(String nombre) {this.nombre = nombre;}
    public void setEdad(int edad) {this.edad = edad;}

    public void mostrarInfo() {System.out.println(dni +" "+nombre +" "+edad);}

    public String toString() {
        return "Persona {" + "dni=" + getDni()+
                ", nombre=" +getNombre()+ "}";
    }
}
