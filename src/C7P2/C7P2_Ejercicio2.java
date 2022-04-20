package C7P2;

public class C7P2_Ejercicio2 {

    public static void main(String[] args) {

        //Mensaje final
        String mensajeFinal = "Este es el último mensaje";

        //Código que arroja excepción
        int[] numeros = new int[5];

        try{
            numeros[5] = 10;
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println(mensajeFinal);
        }



    }
}
