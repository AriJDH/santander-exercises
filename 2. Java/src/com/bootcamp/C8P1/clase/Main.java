package com.bootcamp.C8P1.clase;

import com.bootcamp.C8P1.clase.documentos.Factura;
import com.bootcamp.C8P1.clase.documentos.NotaDeCredito;
import com.bootcamp.C8P1.clase.documentos.NotaDeDebito;
import com.bootcamp.C8P1.clase.documentos.Remito;
import com.bootcamp.C8P1.clase.modelos.Empleado;
import com.bootcamp.C8P1.clase.modelos.Persona;

public class Main {
    public static void main(String[] args) {
        //ejercicio_personas();
        //ejercicio_practica();
        ejercicio_animales();
    }

    private static void ejercicio_animales() {
        Animal animal = new Animal();
        animal.hacer_sonido();

        Gato gato = new Gato();
        gato.hacer_sonido();

        gato.trepar();

        Animal gato_como_animal = new Gato();
        gato_como_animal.hacer_sonido();

        // NO puedo pq lo declare como ANimal
        //gato_como_animal.trepar();
    }

    private static void ejercicio_practica() {
        /*Consigna
        * Nota de credito
        * Nota de debito
        * Factura
        * Remito*/

        NotaDeCredito notaDeCredito = new NotaDeCredito();
        NotaDeDebito notaDeDebito = new NotaDeDebito();
        Factura factura = new Factura();
        Remito remito = new Remito();
    }

    private static void ejercicio_personas() {
        Empleado empleado = new Empleado("38998262","juan","alvarez","23/02/1995","A",2000, 123);

        System.out.println(empleado);
    }
}
