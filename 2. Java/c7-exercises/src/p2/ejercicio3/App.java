package p2.ejercicio3;

import java.io.FileNotFoundException;
import java.io.IOException;

public class App {
    public static void main(String[] args) {
        Ejercicio3 ej3 = new Ejercicio3();

        try {
            ej3.leerArchivo("sdfs");
        } catch (FileNotFoundException e) {
            System.out.println("No se puede encontrar el archivo especificado");
        } catch (IOException e) {
            System.out.println("Error al leer el archivo especificado");
        }
    }
}
