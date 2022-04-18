package com;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sueldo = new Scanner(System.in);
        System.out.println("Ingresar DNI del empleado: ");
        int dni = sueldo.nextInt();
        System.out.println("Ingresar el sueldo actual del empleado: ");
        int sueldoEmpleado = sueldo.nextInt();
        float aumento;
        float actualizacionSueldo = 0;
        if(sueldoEmpleado <= 20000){
            aumento = 0.2f;
            actualizacionSueldo = sueldoEmpleado*(1+aumento);

        }else if(sueldoEmpleado > 20000 && sueldoEmpleado <= 45000){
            aumento = 0.1f;
            actualizacionSueldo = sueldoEmpleado*(1+aumento);

        }else if(sueldoEmpleado > 45000){
            aumento = 0.05f;
            actualizacionSueldo = sueldoEmpleado*(1+aumento);

        }else{
            System.out.println("Tenes que ingresar un numero entero para el sueldo");
        }
        System.out.println("El sueldo actualizado del empleado con DNI: " + dni + " es de $" + actualizacionSueldo);

    }

}
