package EjerciciosJava;

public class estructurasDeControlYArreglos {
    public static void main(String[] args) {
        String ciudades[] = {"Londres", "Madrid", "Nueva York", "Buenos Aires", "Asuncion", "Sao Paulo", "Lima", "Santiago deChile", "Lisboa", "Tokio"};
        int temperaturas[][] = {{-2, 33}, {-3, 32}, {-8, 27}, {4, 37}, {6, 42}, {5, 43}, {0, 39}, {-7, 26}, {-1, 31}, {-10, 35}};
        int maxima = temperaturas[0][1], minima= temperaturas[0][0], posicionMax=0, posicionMin=0;

            for (int x = 0; x < 10; x++) {
                if(maxima<temperaturas[x][1]) {
                    maxima = temperaturas[x][1];
                    posicionMax = x;
                }
                if(minima>temperaturas[x][0]) {
                    minima = temperaturas[x][0];
                    posicionMin = x;
                }
            }
        System.out.printf("La minima es: " + minima + " en " + ciudades[posicionMin] + "\n");
        System.out.printf("La maxima es: " + maxima + " en " + ciudades[posicionMax] + "\n");

    }
}
