package p2.ejercicio3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio3 {
    public void leerArchivo(String nombreArchivo) throws IOException {
        String texto = null;

        BufferedReader bufferedReader = new BufferedReader(new FileReader(nombreArchivo));

        while ((texto = bufferedReader.readLine()) != null) {
            System.out.println(texto);
        }
        bufferedReader.close();
    }
}
