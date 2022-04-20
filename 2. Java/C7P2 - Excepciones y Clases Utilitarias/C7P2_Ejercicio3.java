package C7P2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class C7P2_Ejercicio3 {

    public static void main(String[] args) {

        leerArchivo("archivo");

    }

    public static void leerArchivo(String nombreArchivo)  {
        String texto = null;

        try{
            BufferedReader bufferedReader = new BufferedReader(new FileReader(nombreArchivo));
            while((texto = bufferedReader.readLine()) != null) {
                System.out.println(texto);
            }
            bufferedReader.close();
        }
        catch (FileNotFoundException e){
            System.out.println("No se puede encontrar el archivo especificado");
        }

        catch(IOException e2){
            System.out.println("Error al leer el archivo especificado");
        }

    }

}
