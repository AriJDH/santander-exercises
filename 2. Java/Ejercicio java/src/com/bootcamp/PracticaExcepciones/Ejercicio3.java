package com.bootcamp.PracticaExcepciones;

import java.io.*;

public class Ejercicio3 {
    
    public void leerArchivo(String nombreArchivo) throws FileNotFoundException, IOException {
        String texto = null;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(nombreArchivo));
            while ((texto = bufferedReader.readLine()) != null) {
                System.out.println(texto);
                bufferedReader.close();
            }

            }catch(FileNotFoundException ex){
            System.out.println("No se puede encontrar el archivo especificado");
        }catch (IOException e){
            System.out.println("Error al leer el archivo especificado");
        }


    }
}
