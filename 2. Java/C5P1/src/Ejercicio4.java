import java.util.Scanner;

public class Ejercicio4 {
        public static void main(String[] args) {
                int personas = 1;
                int estadisticaDiariosA = 0;
                int estadisticaDiariosAyC= 0;
                int estadisticaDiariosAyB = 0;
                int estadisticaDiariosByC= 0;
                int estadisticaDiariosAByC= 0;
                int diarioA, diarioB, diarioC;

                Scanner scanner = new Scanner(System.in);


                while (personas <= 50) {
                        System.out.println("Cliente numero:" + personas);
                        System.out.println("¿Se encuentra suscripto a DIARIO A? 1- si 2- no");
                        diarioA = scanner.nextInt();
                        System.out.println("Se encuentra suscripto a DIARIO B? 1- si 2- no");
                        diarioB = scanner.nextInt();
                        System.out.println("Se encuentra suscripto a DIARIO C? 1- si 2- no");
                        diarioC = scanner.nextInt();

                        if (diarioA == 1 && diarioB == 2 && diarioC == 2) {
                                estadisticaDiariosA++;

                        }
                        if (diarioA == 1 && diarioC == 1){
                                estadisticaDiariosAyC++;
                        }
                        if (diarioA ==1 && diarioB == 1) {
                                estadisticaDiariosAyB++;

                        }
                        if (diarioB == 1 && diarioC == 1){
                                estadisticaDiariosByC++;
                        }
                        if (diarioA == 1 && diarioB == 1 && diarioC ==1){
                                estadisticaDiariosAByC++;
                        }
                        personas++;

                }
                System.out.println("-Resumen suscripciones de los diarios-");
                System.out.println("Cantidad de suscripciones solo al diario A:" + estadisticaDiariosA);
                System.out.println("Cantidad de suscripciones al diario A y al diario C:" + estadisticaDiariosAyC);
                System.out.println("Cantidad de suscripciones al diario A y al diario B:" + estadisticaDiariosAyB);
                System.out.println("Cantidad de suscripciones al diario B y al diario C:" + estadisticaDiariosByC);
                System.out.println("Cantidad de suscripciones a todos los diarios:" + estadisticaDiariosAByC);
        }
}