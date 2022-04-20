package com.Ejercicio2;

import java.io.*;

public class PracticaExcepciones {

    private int a = 0;
    private int b = 300;

    public PracticaExcepciones(){

    }

    public int calcularDivision(){
        int resultado;
        if(a == 0){
            throw new IllegalArgumentException("No se puede dividir por cero");
        }else{
            resultado = b/a;
        }
        return  resultado;
    }

    public void leerArchivo(String nombreArchivo) throws IOException {
        String texto = null;

        try {

            BufferedReader bufferedReader = new BufferedReader(new FileReader(nombreArchivo));
            while ((texto = bufferedReader.readLine()) != null) {
                System.out.println(texto);
            }
            bufferedReader.close();
        }catch (FileNotFoundException e) {
            System.out.println("No se puede encontrar el archivo especificado");
        } catch (IOException e){
            System.out.println("Error al leer el archivo especificado");
        }

    }


}



