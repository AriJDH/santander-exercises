package com.resolucion.main;

import com.resolucion.clases.Persona;

public class Main {
    public static void main(String[] args) {

        boolean esMayorDeEdad;
        int imc;
        Persona persona1= new Persona();
        Persona persona2= new Persona("Pedro",20,"22123456");
        Persona persona3= new Persona("Martin",12,"76235886",70,1.76);
        esMayorDeEdad=persona3.mayorEdad();
        imc=persona3.calcularIMC();
        System.out.print(persona3.mostrarInformacion());
        if(esMayorDeEdad){
            System.out.print(" , es mayor de edad ");
        }
        else{
            System.out.print(" , es menor de edad ");
        }
        System.out.print(", Resultado del IMC: ");
        switch (imc){
            case -1:
                System.out.println("Bajo peso");
                break;
            case 0:
                System.out.println("Peso saludable");
                break;
            case 1:
                System.out.println("Sobrepeso");
                break;
        }
    }
}
