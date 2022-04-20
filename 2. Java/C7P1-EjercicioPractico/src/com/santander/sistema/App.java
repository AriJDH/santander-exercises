package com.santander.sistema;

public class App {
    public static void main(String[] args) {
        Persona per1 = new Persona();
        Persona per2 = new Persona("Anggie",25,"94065255");
        Persona per3 = new Persona("Pamela",15,"45678233",45.3,1.50);
        //Persona per4 = new Persona("Leo",33);

        System.out.println("1- " +per1);
        System.out.println("2- " +per2);
        System.out.println("3- " +per3);

        int nivel_peso = per3.calcularIMC();
        mensaje_IMC(nivel_peso);

        boolean edad = per2.esMayorDeEdad();
        mensaje_edad(edad);

        edad = per3.esMayorDeEdad();
        mensaje_edad(edad);
    }

    private static void mensaje_edad(boolean edad) {
        if (edad) {
            System.out.println("Persona3 es mayor de edad");
        }
        else {
            System.out.println("Persona3 No es mayor de edad");
        }
    }

    private static void mensaje_IMC (int numero) {
        if (numero == -1) {
            System.out.println("La Persona tiene bajo peso");
        }
        else if (numero == 0){
            System.out.println("La Persona tiene peso saludable");
        }
        else {
            System.out.println("La Persona tiene sobrepeso");
        }
    }
}
