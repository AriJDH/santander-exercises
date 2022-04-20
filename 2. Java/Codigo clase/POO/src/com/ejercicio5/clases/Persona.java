package com.ejercicio5.clases;

public class Persona {
    int dni;
    String nombre;

    public Persona() {
    }


    //EL TOSTRING HACE QUE CUANDO HAGAMOS PRINT DEL OBJ LLAME A ESTA FUNCION EN VEZ DE MOSTRAR EL PUNTERO
    @Override
    public String toString() {
        return "Persona{" +
                "dni=" + dni +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
