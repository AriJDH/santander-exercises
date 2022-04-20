package ResolucionesEjerciciosPOO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Excepciones3 {
    public static void main(String[] args) throws Exception {
        Excepciones3 excep3 = new Excepciones3();
        excep3.leerArchivo("archivo.txt");
        System.out.println("Mensaje final.");
    }
    public void leerArchivo(String nombreArchivo) throws Exception {
        String texto = null;

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(nombreArchivo));

        while((texto = bufferedReader.readLine()) != null) {
            System.out.println(texto);
        }
        bufferedReader.close();
        } catch(FileNotFoundException e) {
            System.out.println("No se puede encontrar el archivo especificado.");
        } catch(IOException e) {
            System.out.println("Error al leer el archivo especificado.");
        }
    }
}
