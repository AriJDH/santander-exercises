package com.santander.dh;

public class Main {
    public static void main(String[] args) {
        Persona personaVacio = new Persona();
        Persona personaAlgunosParametros = new Persona("Alexis", "39628561", 25);
        Persona personaTodosParametros = new Persona("Alexis", "39628561", 25, 70, 168);
        Persona personaConFallas = new Persona("Alexis", 25); // La creación del objeto falla porque se estan omitiendo parametros requeridos en el constructor de Persona

    }
}
