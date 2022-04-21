package com.clasesYHerencias;

import com.clasesYHerencias.modelos.Empleado;

public class Main {
    public static void main(String[] args) {
        ejercicio_personas();
    }

    private static void ejercicio_personas() {
        Empleado empleado = new Empleado("11222333","pepe","romero","17/01/1997","O+",1000, 1);

        System.out.println(empleado);
    }
}
