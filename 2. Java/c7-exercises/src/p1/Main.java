package p1;

import p1.models.Persona;

public class Main {
    public static void main(String[] args) {
        Persona p1 = new Persona();
        Persona p2 = new Persona("Valentino", 22, "123");
        Persona p3 = new Persona("Valentino", 22, "123", 90, 1.90);

        System.out.println(p3);
        boolean b = p3.esMayorDeEdad();
        if (b) {
            System.out.println("La persona es mayor de edad");
        } else {
            System.out.println("La persona es menor de edad");
        }
        int imc = p3.calcularIMC();
        if(imc == -1) {
            System.out.println("Bajo peso");
        } else if (imc == 0) {
            System.out.println("Peso saludable");
        } else {
            System.out.println("Sobrepeso");
        }
    }
}
