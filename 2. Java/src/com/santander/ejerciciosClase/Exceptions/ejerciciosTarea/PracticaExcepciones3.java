package com.santander.ejercicioPOO.ejerciciosClase.Exceptions.ejerciciosTarea;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PracticaExcepciones3 {
    public PracticaExcepciones3(){

    }
    public void leerArchivo(String nombreArchivo) throws IOException {
        String texto = null;

        BufferedReader bufferedReader = new BufferedReader(new FileReader(nombreArchivo));

        while((texto = bufferedReader.readLine()) != null) {
            System.out.println(texto);
        }
        bufferedReader.close();
    }
    public static void main(String[] args) {
        try {
            PracticaExcepciones3 p1 = new PracticaExcepciones3();
            p1.leerArchivo("asd");
        } catch (FileNotFoundException e){
            System.out.println(e);
        } catch (IOException er) {
            er.printStackTrace();
        }
    }
}
