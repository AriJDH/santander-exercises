package com.santander.bootcamp;

import com.santander.bootcamp.modelos.Autor;
import com.santander.bootcamp.modelos.Libro;
import com.santander.bootcamp.modelos.Persona;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

    Persona persona1 = new Persona();
    Persona persona2 = new Persona("Carlos", 29, "42041");
    Persona persona3 = new Persona("Lucas", 33,"20203", 65,1.75);

    persona3.calcularIMC();
    persona3.esMayorDeEdad();

// Persona persona4 = new Persona("Juan", 40); NO es posible.
    }
}
