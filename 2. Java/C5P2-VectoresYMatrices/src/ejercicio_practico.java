public class ejercicio_practico {
    public static void main(String[] args) {
        String ciudades[] = {"Londres","Madrid","Nueva York","Buenos Aires","Asunción","Sao Paulo","Lima","Santiago de Chile","Lisboa","Tokio"};
        int temperaturas[][] = {{-2,33},{-3,32},{-8,27},{4,37},{6,42},{5,43},{0,39},{-7,26},{-1,31},{-10,35}};

        int [] minimos = new int[temperaturas.length];
        int [] maximos = new int[temperaturas.length];
        int minimo = minimos[1], maximo = 0;
        String ciudad_max = "", ciudad_min = "";

        //divido en dos arrays: minimos y maximos
        for (int i=0; i < ciudades.length; i++) {
            minimos[i] = temperaturas[i][0];
            maximos[i] = temperaturas[i][1];
        }
        //calculo el maximo y el minimo de esos arrays
        for (int j=0; j < minimos.length; j++) {
            if (minimos[j] < minimo) {
                minimo = minimos[j];
                ciudad_min = ciudades[j];
            }
            if (maximos[j] > maximo) {
                maximo = maximos[j];
                ciudad_max = ciudades[j];
            }
        }
        System.out.println("La ciudad " + ciudad_min + " tiene la temperatura mínima de: " + minimo);
        System.out.println("La ciudad " + ciudad_max + " tiene la temperatura máxima de: " + maximo);
    }
}
