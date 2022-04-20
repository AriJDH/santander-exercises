package Excepciones;

public class Ejercicio2 {
    public static void main(String[] args) {

        int[] numeros = new int[5];
        //Mensaje final
        String mensajeFinal = "Este es el ultimo mensaje";

        //Código que arroja excepción
        try{
            numeros[5] = 10;
        }catch(Exception e){
            System.out.println("Rango fuera del array, error:------ " + e);
        }finally {
            System.out.println(mensajeFinal);
        }


    }
}
