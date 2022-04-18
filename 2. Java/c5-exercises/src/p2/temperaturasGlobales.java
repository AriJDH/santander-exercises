package p2;

public class temperaturasGlobales {
    public static void main(String[] args) {
        String ciudades[] = {"Londres", "Madrid", "Nueva York", "Buenos Aires", "Asunción", "San Pablo",
        "Lima", "Santiago de Chile", "Lisboa", "Tokio"};

        int temperaturas[][] = {{-2, 33}, {-3, 32}, {-8, 27}, {4, 37}, {6, 42}, {5, 43}, {0, 39}, {-7, 26},
            {-1, 31}, {-10, 35}};

        int min_temp = 1000, aux=0;
        for (int i=0; i<temperaturas.length; ++i) {
            for (int j=0; j<2; ++j) {
                if (temperaturas[i][j] < min_temp) {
                    min_temp = temperaturas[i][j];
                    aux = i;
                }
            }
        }

        System.out.println("La temperatura mínima fue: " + min_temp + "°C y ocurrió en " + ciudades[aux]);
    }
}
