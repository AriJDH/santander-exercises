package PracticaException;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class App {

    public static void main(String[] args) {
        System.out.println("Antes de hacer la division");

        try {
            double division = 5 / 0;
        } catch (ArithmeticException exception) {
            System.out.println("Error en la division: " + exception.getMessage());
        } finally {
            System.out.println("Despues de hacer la division");
        }

    }
}
