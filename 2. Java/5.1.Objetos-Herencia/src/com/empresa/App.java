package com.empresa;

import com.empresa.modelos.*;

public class App {


    //
    // Consigna
    // Nota de credito -> nro saldo fecha vto remitente concepto asoc. factura
    // Nota de debito  -> nro similar
    // Factura  -> nro tipo fecha descripcion lista items cliente monto
    // Remito -> nro fecha destinatario desc. original
    // Recibo -> nro cliente duplicado
    //
    //
    //


    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.hacerSonido();

        Gato gato = new Gato();
        gato.hacerSonido();

        Animal animal1 = new Gato();
        animal1.hacerSonido();

        // DocumentoComercial docu = new Recibo();

        System.out.println(animal.
                );


        //Empleado empleado = new Empleado("22","Carlos","Gomez","20000101","RH","234",355);

        //System.out.println(empleado);




        /*
        Persona persona = new Persona();

        Persona persona1 = persona;

        if(persona.equals(persona1)) {
            System.out.println("son iguales");
        }

        System.out.println(persona.toString());

        System.out.println(persona.getClass().getSimpleName());
        */
    }

}
