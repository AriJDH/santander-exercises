package ResolucionesEjerciciosPOO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        Persona personaConstructorVacio = new Persona();
        Persona personaConstructorMedio = new Persona("Alfonso", 22, "42.457.893");
        Persona personaConstructorCompleto = new Persona("Leandro", 34, "30.572.123", 60, 1.76);
        // No se puede... Persona personaNombreYEdad = new Persona("Marcos", 41);
        switch (personaConstructorCompleto.calcularMC()) {
            case -1 :
                System.out.println("Usted tiene bajo peso");
                break;
            case 0 :
                System.out.println("Usted tiene un peso adecuado");
                break;
            case 1 :
                System.out.println("Usted tiene sobrepeso");
        }
        if (personaConstructorCompleto.esMayorDeEdad()) {
            System.out.println("Usted es mayor de edad");
        }
        else {
            System.out.println("Usted es menor de edad");
        }

    }
}
