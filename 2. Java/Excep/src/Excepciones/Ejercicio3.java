package Excepciones;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio3 {

    public void leerArchivo(String nombreArchivo) {

        String texto = null;

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(nombreArchivo));
            while((texto = bufferedReader.readLine()) != null) {
                System.out.println(texto);
            }
            bufferedReader.close();
        }catch(FileNotFoundException e){
            System.out.println("No se puede encontrar el archivo especificado");
        }catch (IOException e){
            System.out.println("Error al lee el archivo especificado");
        }


    }

}
