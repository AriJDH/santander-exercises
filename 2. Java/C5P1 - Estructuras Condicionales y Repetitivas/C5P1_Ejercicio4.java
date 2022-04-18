import java.util.Scanner;

public class C5P1_Ejercicio4 {
    public static void main(String[] args) {

        final int cantSuscriptores = 5;

        Scanner teclado = new Scanner(System.in);

        int suscriptoTodos = 0;
        int suscriptosSolo_A = 0;
        int suscriptosA_C = 0;
        int suscriptosA_B = 0;
        int suscriptosB_C = 0;



        for(int i= 1; i<= cantSuscriptores;i++){
            System.out.println("Suscriptor n°: " + i);
            String respuesta = "";
            System.out.println("¿Se encuentra suscripto a todos los diarios? (si/no)");
            respuesta = teclado.next();
            if(respuesta.equals("si")){
                suscriptoTodos+=1;
                suscriptosA_B+=1;
                suscriptosA_C+=1;
                suscriptosB_C+=1;
            }
            else{
                System.out.println("¿Se encuentra suscripto sólo al diario A? (si/no)");
                respuesta = teclado.next();
                if (respuesta.equals("si"))
                    suscriptosSolo_A+=1;
                else{
                    System.out.println("¿Se encuentra suscripto al diario A y C? (si/no)");
                    respuesta = teclado.next();
                    if (respuesta.equals("si"))
                        suscriptosA_C+=1;
                    System.out.println("¿Se encuentra suscripto al diario A y B? (si/no)");
                    respuesta = teclado.next();
                    if (respuesta.equals("si"))
                        suscriptosA_B+=1;
                    System.out.println("¿Se encuentra suscripto al diario B y C? (si/no)");
                    respuesta = teclado.next();
                    if (respuesta.equals("si"))
                        suscriptosB_C+=1;
                }
            }

        }

        System.out.println("Cantidad de suscriptores a los 3 diarios: " + suscriptoTodos);
        System.out.println("Cantidad de suscriptores a A y C: " + suscriptosA_C);
        System.out.println("Cantidad de suscriptores a A y B: " + suscriptosA_B);
        System.out.println("Cantidad de suscriptores a B y C: " + suscriptosB_C);
        System.out.println("Cantidad de suscriptores sólo al diario A: " + suscriptosSolo_A);








    }
}
