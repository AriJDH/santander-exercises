package com.auxiliar;
import com.sun.jdi.connect.AttachingConnector;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class app3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        HashMap<String, Integer> mapa = new HashMap<>();
        List<String> producto = new ArrayList<>();
        List<Integer> cantidades = new ArrayList<>();
        int x = 0, y = 0;
        char salir = ' ';

        do {
            System.out.print("Ingrese el producto: ");
            producto.add(input.next());
            System.out.print("Ingrese la cantidad: ");
            cantidades.add(input.nextInt());
            System.out.print("\nDesea Salir? (s/n) ");
            salir = input.next().charAt(0);
        } while (salir != 's');



    }
}
