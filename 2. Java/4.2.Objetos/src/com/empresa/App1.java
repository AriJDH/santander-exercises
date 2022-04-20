package com.empresa;

import com.empresa.modelos.Biblioteca;
import com.empresa.servicios.BibliotecaService;

public class App1 {

    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca();

        try {
            BibliotecaService.promedioCantidadHojasLibros(biblioteca);
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("El programa termina ok");

    }

}
