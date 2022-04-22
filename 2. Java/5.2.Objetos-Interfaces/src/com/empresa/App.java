package com.empresa;

import com.empresa.dao.PersonaDaoImpl;
import com.empresa.modelo.Persona;

import java.util.List;

public class App {
    public static void main(String[] args) {

        //
        //
        // int numero = (int) Math.floor(Math.random() * 10);
        //
        // simulador de tiro al blanco
        // objetos, herencia, polimorfismo, abstractas, interfaces
        //
        // soldado, tanque, .....
        // cantidad de aciertos por diez disparos
        // metodo puntaje segun aciertos
        //
        // excpeciones
        //




        // cargar datos
        PersonaDaoImpl personaDao = new PersonaDaoImpl();
        List<Persona> personas = personaDao.listar();



    }
}
