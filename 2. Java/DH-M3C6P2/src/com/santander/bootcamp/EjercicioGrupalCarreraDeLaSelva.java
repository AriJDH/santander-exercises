package com.santander.bootcamp;

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

        Participante p00 = new Participante(0, "Gonzalo", "Aguirre", 28, 0, 0, "0+");
        Participante p01 = new Participante(1, "Leandro", "de Rivas", 22, 12345, 987, "A+");
        Participante p02= new Participante(2,"Zapallo","Zapallin",32,313,341,"AB+");
        Participante p03 = new Participante(265, "Julian", "Lastuvka", 12, 105, 911, "nc");
        Participante p04 = new Participante(3, "Adolfo", "Aguirre", 29, 0, 0, "0+");
        contador = inscribir(p00, circuitoChico, contador);
        contador = inscribir(p01, circuitoChico, contador);
        contador = inscribir(p02, circuitoChico, contador);
        contador = inscribir(p03, circuitoChico, contador);
        contador = inscribir(p04, circuitoChico, contador);
        recaudacionTotal(circuitoChico, circuitoMedio, circuitoAvanzado);
        System.out.println(desinscribir(p00.getNroInscripto(), circuitoAvanzado, circuitoChico, circuitoMedio));
        recaudacionTotal(circuitoChico, circuitoMedio, circuitoAvanzado);
        /*
        int dni;
        String nombre;
        String apellido;
        int edad;
        int celular;
        int numeroEmergencia;
        int grupoSanguineoDecision;
        String grupoSanguineo;
        int grupoSanguineoRh;
        int categoria;
        System.out.println("Ingrese dni (ingrese -1 para salir)");
        dni = teclado.nextInt();
        while (dni != -1) {
            System.out.println("Ingrese nombre");
            nombre = teclado.next();
            System.out.println("Ingrese apellido");
            apellido = teclado.next();
            System.out.println("Ingrese edad");
            edad = teclado.nextInt();
            System.out.println("Ingrese celular");
            celular = teclado.nextInt();
            System.out.println("Ingrese numero de emergencia");
            numeroEmergencia = teclado.nextInt();
            System.out.println("Que grupo sanguineo sos? A(1), B(2), AB(3), O (4)");
            grupoSanguineoDecision = teclado.nextInt();
            switch (grupoSanguineoDecision) {
                case 1:
                    grupoSanguineo = "A";
                    break;
                case 2:
                    grupoSanguineo = "B";
                    break;
                case 3:
                    grupoSanguineo = "AB";
                    break;
                case 4:
                    grupoSanguineo = "O";
                    break;
                default:
                    grupoSanguineo = "No valido";
                    break;
            }
            System.out.println("Negativo (0) o positivo (1)?");
            grupoSanguineoRh = teclado.nextInt();
            switch (grupoSanguineoRh) {
                case 0:
                    grupoSanguineo = grupoSanguineo.concat("-");
                    break;
                case 1:
                    grupoSanguineo = grupoSanguineo.concat("+");
                    break;
            }
            if (edad >= 18) {
                System.out.println("Que categoria de circuito ingresara el participante? Chico (0) Mediano (1) o Avanzado(2)");
                categoria = teclado.nextInt();
                while (categoria > 2 || categoria < 0) {
                    System.out.println("Que categoria de circuito ingresara el participante? Chico (0) Mediano (1) o Avanzado(2)");
                    categoria = teclado.nextInt();
                }
            } else {
                System.out.println("Que categoria de circuito ingresara el participante? Chico (0) Mediano (1)");
                categoria = teclado.nextInt();
                while (categoria >= 2 || categoria < 0) {
                    System.out.println("Que categoria de circuito ingresara el participante? Chico (0) Mediano (1)");
                    categoria = teclado.nextInt();
                }
            }
            List<Participante> circuitoElegido = circuitoChico;
            switch(categoria) {
                case 0 :
                    circuitoElegido = circuitoChico;
                    break;
                case 1 :
                    circuitoElegido = circuitoMedio;
                    break;
                case 2 :
                    circuitoElegido = circuitoAvanzado;
                    break;
            }
            contador = inscribir(new Participante(dni,nombre,apellido,edad,celular,numeroEmergencia,grupoSanguineo), circuitoElegido, contador);

            System.out.println("Ingrese dni (ingrese -1 para salir)");
            dni = teclado.nextInt();
        }
        recaudacionTotal(circuitoChico, circuitoMedio, circuitoAvanzado);
         */
    }
    public static int inscribir(Participante particip, List<Participante> circuito, int contador) {
        particip.setNroInscripto(contador);
        circuito.add(particip);
        return particip.getNroInscripto() + 1;
    }
    public static boolean desinscribir(int nroInscripto, List<Participante> c, List<Participante> m, List<Participante> a) {
        List<Participante> listaFinal = new LinkedList<>();
        listaFinal.addAll(c);
        listaFinal.addAll(m);
        listaFinal.addAll(a);
        for (Participante participante : listaFinal) {
            if (participante.getNroInscripto() == nroInscripto) {
                //return listaFinal.remove(participante);
                return c.remove(participante) || m.remove(participante) || a.remove(participante);
            }
        }
        return false;
    }
    public static double determinarMonto(Participante particip, int circuito) {
        final double[][] precios = {{1300, 1500}, {2000, 2300}, {-1, 2800}};
        int indiceEdad = 0;
        if (particip.getEdad() >= 18) {
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
        for (Participante participante : c) {
            acumuladorChico += determinarMonto(participante, CHICO);
        }
        for (Participante participante : m) {
            acumuladorMediano += determinarMonto(participante, MEDIO);
        }
        for (Participante participante : a) {
            acumuladorAvanzado += determinarMonto(participante, AVANZADO);
        }
        System.out.printf("El circuito chico recaudó: $%.2f\n", acumuladorChico);
        System.out.printf("El circuito mediano recaudó: $%.2f\n", acumuladorMediano);
        System.out.printf("El circuito avanzado recaudó: $%.2f\n", acumuladorAvanzado);
        System.out.printf("El total recaudado es de: $%.2f\n", acumuladorChico + acumuladorAvanzado + acumuladorMediano);
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

    public void setNroInscripto(int nroInscripto) {
        this.nroInscripto = nroInscripto;
    }

    public int getNroInscripto() {
        return nroInscripto;
    }

    public int getEdad() {
        return edad;
    }
}