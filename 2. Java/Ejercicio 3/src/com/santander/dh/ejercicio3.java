package com.santander.dh;
import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {

        int dailyCost = 2;
        int totalCost;
        String enteredDays = "";
        int enteredDaysNumber;
        Scanner requestDays = new Scanner (System.in);

        System.out.println("Ingrese la cantidad de días de su evento");
        enteredDays = requestDays.nextLine ();
        enteredDaysNumber = Integer.parseInt(enteredDays);
        totalCost = enteredDaysNumber * dailyCost;
        System.out.println("El costo por día es de " + dailyCost + " y sus días ingresados son " + enteredDaysNumber + ". El total por el evento será de " + totalCost);
    }
}
