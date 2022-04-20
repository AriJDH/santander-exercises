package ResolucionesEjerciciosPOO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exceptions {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("algun texto");
        } catch (FileNotFoundException e) {
            System.out.println("El archivo no fue encontrado.");
            //e.printStackTrace();
        }
    }
}
