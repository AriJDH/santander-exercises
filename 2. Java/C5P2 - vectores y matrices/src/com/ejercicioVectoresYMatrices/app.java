package com.ejercicioVectoresYMatrices;

public class app {
    public static void main(String[] args) {

        String paises[] = {"Londres", "Madrid", "Nueva York", "Buenos Aires", "Asunción", "São Paulo", "Lima", "Santiago de Chile", "Lisboa", "Tokio"};
        int temp[][] = {{-2, 33}, {-3, 32}, {-8, 27}, {4, 37}, {6, 42}, {5, 43}, {0, 39}, {-7, 26}, {-1, 31}, {-10, 35}};

        int tempMin = 0, tempMax = 0;
        String paisTempMin = "", paisTempMax = "";

        for (int x = 0; x < paises.length; x++) {
            for (int y = 0; y < temp[x].length; y++) {
                if (temp[x][y] < tempMin) { tempMin = temp[x][y]; paisTempMin = paises[x]; }
                else if (temp[x][y] > tempMax) { tempMax = temp[x][y]; paisTempMax = paises[x]; }
            }
        }

        System.out.println("El pais que tuvo mayor temperatura es " + paisTempMax + " con " +tempMax + "°");
        System.out.println("El pais que tuvo menor temperatura es " + paisTempMin + " con " +tempMin + "°");

    }
}
