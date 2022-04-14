package com.santander.bootcamp;

import java.util.Scanner;

public class exercise4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el premio bruto: ");
        int prize = input.nextInt();
        double finalPrize = prize-prize/100*2.45;
        finalPrize = finalPrize-prize/100*15;
        finalPrize = finalPrize-prize/100*3;
        System.out.println("Premio final: $" + finalPrize);
    }
}

