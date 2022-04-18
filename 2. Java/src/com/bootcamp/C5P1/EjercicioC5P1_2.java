package com.bootcamp.C5P1;

import java.util.Scanner;

public class EjercicioC5P1_2 {
    private final float RANGO_SUELDO_BAJO = 20000f;
    private final float RANGO_SUELDO_ALTO = 45000f;
    private final float MULTIPLICADOR_SUELDO_BAJO = 0.20f;
    private final float MULTIPLICADOR_SUELDO_MEDIO = 0.10f;
    private final float MULTIPLICADOR_SUELDO_ALTO = 0.05f;

    public void ejecutar() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el dni del empleado: ");
        String dni_empleado = teclado.next();

        System.out.println("Ingrese el sueldo del empleado: ");

        float sueldo = teclado.nextFloat();
        float multiplicador_aumento = 0;
        if (sueldo <= RANGO_SUELDO_BAJO){
            multiplicador_aumento = MULTIPLICADOR_SUELDO_BAJO;
        } else if (sueldo > RANGO_SUELDO_BAJO && sueldo < RANGO_SUELDO_ALTO){
            multiplicador_aumento = MULTIPLICADOR_SUELDO_MEDIO;
        } else {
            multiplicador_aumento = MULTIPLICADOR_SUELDO_ALTO;
        }

        System.out.println("Empleado con dni \"" + dni_empleado + "\" debe recibir un aumento del \"" + multiplicador_aumento * 100 + "\"%");
    }
}
