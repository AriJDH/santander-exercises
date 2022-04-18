package EjerciciosJava;

import java.util.Scanner;

public class estructuraDeControl4 {
    public static void main(String[] args) {
        int diarioA, diarioB, diarioC, todos=0, ac=0, ab=0, bc=0,soloA=0;
        Scanner teclado = new Scanner(System.in);
        for (int x = 0; x < 5; x++) {
            System.out.println("Persona: " + (x + 1) + " suscrita al diario A? (1 o 0)");
            diarioA = teclado.nextInt();
            System.out.println("Persona: " + (x + 1) + " suscrita al diario B? (1 o 0)");
            diarioB = teclado.nextInt();
            System.out.println("Persona: " + (x + 1) + " suscrita al diario C? (1 o 0)");
            diarioC = teclado.nextInt();

            if (diarioA == 1 && diarioB ==1 && diarioC == 1) {
                todos ++;
            }
            if (diarioA == 1 && diarioC == 1) {
                ac ++;
            }
            if (diarioA == 1 && diarioB == 1) {
                ab ++;
            }
            if (diarioB == 1 && diarioC == 1) {
                bc ++;
            }
            if (diarioA == 1 && diarioB == 0 && diarioC == 0) {
                soloA ++;
            }
        }
        System.out.println("Personas suscritas a todos: " + todos);
        System.out.println("Personas suscritas a los diarios A y C: " + ac);
        System.out.println("Personas suscritas a los diarios A y B: " + ab);
        System.out.println("Personas suscritas a los diarios B y C: " + bc);
        System.out.println("Personas suscritas solo al diario A: " + soloA);
    }
}
