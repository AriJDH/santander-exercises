package com.POO;
import com.POO.modulos.Persona;
import java.util.*;

public class App {
    public static void main(String[] args) {

        Persona p1 = new Persona();
        Persona p2 = new Persona("Fernando", 23, "40392438");
        Persona p3 = new Persona("Julia", 32, "38936420", 66, 1.73);

        //Persona p4 = new Persona("Franco", 28); ----->   no hay constructor que tome datos de esta forma

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());

        int i = p3.calcularIMC();
        if (i == - 1) { System.out.println(p3.getNombre() + " tiene bajo peso"); }
        else if (i == 0) { System.out.println(p3.getNombre() + " tiene un peso normal"); }
        else { System.out.println(p3.getNombre() + "tiene sobrepeso"); }
        if (p3.mayorEdad()) { System.out.println("Es mayor de edad"); }
        else { System.out.println("Es menor de edad"); }


    }

}
