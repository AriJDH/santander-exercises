package prueba1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {

        /*
        //Error checked: Cuando operamos con estas clases nos obligan a hacer un try catch
        try {
            FileInputStream archivo = new FileInputStream("asdasdad");
        } catch (FileNotFoundException e) {
            System.out.println("No se encontro el archivo");
        }

         */
        try {
            System.out.println(0/34);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("El programa termina ok");
    }
}
