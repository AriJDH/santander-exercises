package bootcamp.dia20;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PracticaExcepciones {

    public static void main(String[] args) throws IOException {

        System.out.println("------Ejercicio 1-------");

        int a = 0, b = 300;
        try {
            // double division = b/a;
            mostrarMensaje("asd", null);
        } catch (IllegalArgumentException e) {
            System.out.println("Se ha producido un error. " + e.getMessage());
        } catch (Exception e){
            System.out.println("Se ha producido un error: " + e.getMessage());
        }
        System.out.println("Programa finalizado \n");

        System.out.println("------Ejercicio 2-------");

        String mensajeFinal = "Este es el ultimo mensaje";
        int[] numeros = new int[5];

        try {
            numeros[5] = 10;
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println(mensajeFinal);

        System.out.println("------Ejercicio 3-------");
        leerArchivo("asd");
        System.out.println("\n");

        System.out.println("------Ejercicio 4-------");

        System.out.println("El numero mayor es: " + Calculos.cualEsMayor(3, 5));
        System.out.println("El numero menor es: " + Calculos.cualEsMenor(2, 5));
        System.out.println("La potencia al cubo de 2 es: " + Calculos.potenciaDeUnNumero(2, 3));
        System.out.println("El coseno de 90 es: " + Calculos.cosenoDeUnAngulo(90));
        System.out.println("La raiz cuadrada de 4 es: " + Calculos.raizCuadradaDeUnNumero(4));
        System.out.println("El numero aleatorio es: " + Calculos.numeroAleatorio());
    }

    public static String mostrarMensaje(String cadena1, String cadena2){
        if (cadena1 == null || cadena2 == null){
            throw new IllegalArgumentException("Una de las cadenas es null");
        }else{
            return cadena1 + cadena2;
        }
    }

    public static void leerArchivo(String nombreArchivo) throws IOException {
        String texto = null;
        BufferedReader bufferedReader = null;

        try {
            bufferedReader = new BufferedReader(new FileReader(nombreArchivo));

            while((texto = bufferedReader.readLine()) != null) {
                System.out.println(texto);
            }
            bufferedReader.close();

        }catch (FileNotFoundException e){
            System.out.println("No se puede encontrar el archivo especificado");
        }catch (IOException e) {
            System.out.println("Error al leer el archivo especificado");
        }
    }

}