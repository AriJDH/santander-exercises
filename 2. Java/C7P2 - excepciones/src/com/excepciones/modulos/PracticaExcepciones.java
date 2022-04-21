package com.excepciones.modulos;

import com.sun.jdi.connect.IllegalConnectorArgumentsException;

public class PracticaExcepciones {
    public static void main(String[] args) {

        int a = 0;
        int b = 300;

        /*try {
            int c = b / a;
        }
        catch (Exception e) {
            System.out.println("Se ha producido un error.");
        }*/

        try {
            int c = b/a;

            throw new IllegalArgumentException("No se puede dividir por 0");
        }
        catch (IllegalArgumentException e){
            e.printStackTrace();
        }


        System.out.println("EL programa ha finalizado");
    }


}
