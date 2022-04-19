package com.santander;

import com.santander.colecciones.Prenda;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class EjercicioGrupalCarreraDeLaSelva {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        List<Participante> circuitoChico = new LinkedList<>();
        List<Participante> circuitoMedio = new LinkedList<>();
        List<Participante> circuitoAvanzado = new LinkedList<>();
        int contador = 0;
        
    }

    public static int Inscribir(Participante particip, List<Participante> circuito) {
        circuito.add(particip);
        return particip.getNroInscripto();
    }

    public static void Desinscribir(int nroInscripto, List<Participante> c, List<Participante> m, List<Participante> a) {

    }

    public static double DeterminarMonto(Participante particip, int circuito) {
        final double[][] precios = {{1300, 1500},{2000, 2300},{-1, 2800}};
        int indiceEdad = 0;
        if(particip.getEdad() >= 18) {
            indiceEdad = 1;
        }
        return precios[circuito][indiceEdad];
    }

    public static void recaudacionTotal(List<Participante> c, List<Participante> m, List<Participante> a) {
        double acumuladorChico = 0;
        double acumuladorMediano = 0;
        double acumuladorAvanzado = 0;
        final int CHICO = 0;
        final int MEDIO = 1;
        final int AVANZADO = 2;
        for(Participante participante : c) {
            acumuladorChico += DeterminarMonto(participante, CHICO);
        }
        for(Participante participante : m) {
            acumuladorMediano += DeterminarMonto(participante, MEDIO);
        }
        for(Participante participante : a) {
            acumuladorAvanzado += DeterminarMonto(participante, AVANZADO);
        }
        System.out.printf("El circuito chico recaudó: $%.2f\n", acumuladorChico);
        System.out.printf("El circuito mediano recaudó: $%.2f\n", acumuladorMediano);
        System.out.printf("El circuito avanzado recaudó: $%.2f\n", acumuladorAvanzado);
        System.out.printf("El total recaudado es de: $%.2f\n", acumuladorChico+acumuladorAvanzado+acumuladorMediano);
    }

}

class Participante {
    //Atributos de la clase
    private int dni;
    private String nombre;
    private String apellido;
    private int edad;
    private int celular;
    private int numEmergencia;
    private String grupoSanquineo;
    private int nroInscripto;

    //Constructor
    public Participante(int dni, String nombre, String apellido, int edad, int celular, int numEmergencia, String grupoSanquineo) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.celular = celular;
        this.numEmergencia = numEmergencia;
        this.grupoSanquineo = grupoSanquineo;
    }

    public int getNroInscripto() {
        return nroInscripto;
    }

    public int getEdad() {
        return edad;
    }
    //Constructor con el mismo nombre de la clase

    //Métodos de la clase

}
