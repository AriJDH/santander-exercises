package integradores.integradorExcepciones.ejercicioTres;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            leerArchivo("nombre archivo");
        } catch (FileNotFoundException e) {
            System.out.println("No se puede encontrar el archivo especificado");;
        }catch (IOException e){
            System.out.println("Error al leer el archivo especificado");
        }
    }

    public static void leerArchivo(String nombreArchivo) throws IOException,FileNotFoundException  {
        String texto = null;

        BufferedReader bufferedReader = new BufferedReader(new FileReader(nombreArchivo));

        while((texto = bufferedReader.readLine()) != null) {
            System.out.println(texto);
        }
        bufferedReader.close();
    }

}
