package com.santander.ejerciciosArrays;

public class PracticaIntegradora {
    public static void main(String[] args) {
        String ciudades [] = {"Londres","Madrid","Nueva York","Buenos Aires","Asuncion","Sao Pablo","Lima","Santiago de Chile","Lisboa","Tokio"};
        int arrTemp [][] = {{-2,33},{-3,32},{-8,27},{4,37},{6,42},{5,43},{0,39},{-7,26},{-1,31},{-10,35}};
        int indiceDelMayor = 0;
        int indiceDelMenor = 0;
        for (int i = 0; i < arrTemp.length; i++) {
            if(arrTemp[i][1]>arrTemp[indiceDelMayor][1]){
                indiceDelMayor=i;
            }
        }
        for (int i = 0; i < arrTemp.length; i++) {
            if(arrTemp[i][0]<arrTemp[indiceDelMenor][0]){
                indiceDelMenor=i;
            }
        }
        System.out.println("La ciudad de mayor temperatura es: "+ciudades[indiceDelMayor]);
        System.out.println("La ciudad de menor temperatura es: "+ciudades[indiceDelMenor]);
    }
}
