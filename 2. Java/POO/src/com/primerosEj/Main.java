package com.primerosEj;

public class Main {
    public static void main(String[] args) {
        Persona p1= new Persona();
        Persona p2= new Persona("juan","32323",21,66,1.67);
        System.out.print("Su IMC dice: ");
        if (p2.calcularIMC()==-1){
            System.out.println("Bajo peso");
        }else{
            if (p2.calcularIMC()==0){
                System.out.println("Peso saludable");
            }else{
                System.out.println("Sobrepeso");
            }
        }
        if (p2.esMayor()){
            System.out.println("sos mayor ;)");
        }else{
            System.out.println("no sos mayor :(");
        }
        System.out.println(p2);
    }
}
