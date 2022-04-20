package com.resolucion;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int dni;
        double sueldo;
        System.out.println("Ingresar DNI \n");
        dni= scanner.nextInt();
        System.out.println("Ingresar sueldo \n");
        sueldo= scanner.nextDouble();
        while(sueldo<=0){
            System.out.println("Ingresar sueldo \n");
            sueldo= scanner.nextDouble();
        }
        double aumentoDelSueldo;
        if(sueldo<=20000.00){
            aumentoDelSueldo=sueldo*0.20;
        }
        else if(sueldo>20000.00 && sueldo<=45000){
            aumentoDelSueldo=sueldo*0.10;
        }
        else{
            aumentoDelSueldo= sueldo*0.05;
        }
        System.out.println("RESUMEN DEL EMPLEADO CON DNI "+ dni);
        System.out.println("El aumento correspondiente es de $"+aumentoDelSueldo+"\n");
        System.out.println("El salario con el aumento es de $"+(sueldo+aumentoDelSueldo));
    }
}
