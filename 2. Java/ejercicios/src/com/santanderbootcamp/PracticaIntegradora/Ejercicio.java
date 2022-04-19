package com.santanderbootcamp.PracticaIntegradora;

import jdk.dynalink.beans.StaticClass;

import javax.swing.plaf.ComponentInputMapUIResource;
import java.util.*;

class Participante {
    String dni;
    String nombre;
    String apellido;
    int edad;
    String celular;
    String nroEmergencia;
    String grupoSanguineo;
    int nroParticipante = -1;

    String categoriaInscripta = "";

    Participante(String dni, String nombre, String apellido, int edad, String celular, String nroEmergencia, String grupoSanguineo) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.celular = celular;
        this.nroEmergencia = nroEmergencia;
        this.grupoSanguineo = grupoSanguineo;
    }
}

class Carrera {
    HashMap<String, HashMap<String, Double>> circuitos = new HashMap<>();
    HashMap<Integer, Double> circuitosMayores18 = new HashMap<>();
    List<Participante> participantes = new LinkedList<Participante>();
    int ultimoParticipanteNro = -1;

    public void agregarCircuito(String nombre) {
        HashMap<String, Double> precios = new HashMap<>();
        circuitos.put(nombre, precios);
    }

    public void establecerPrecioMenor18(String nombre, double precio) {
        if(circuitos.containsKey(nombre)) {
            circuitos.get(nombre).put("precioMenor18", precio);
        }
        else {
            System.out.println("El circuito no se encuentra.");
        }
    }

    public void establecerPrecioMayor18(String nombre, double precio) {
        if(circuitos.containsKey(nombre)) {
            circuitos.get(nombre).put("precioMayor18", precio);
        }
        else {
            System.out.println("El circuito no se encuentra.");
        }
    }

    private boolean existeCategoriaParaParticipante(Participante participante, String categoria) {
        boolean condicion1 = participante.edad < 18 && circuitos.get(categoria).containsKey("precioMenor18");
        boolean condicion2 = participante.edad >= 18 && circuitos.get(categoria).containsKey("precioMayor18");
        return condicion1 || condicion2;
    }
    public void inscribirParticipante(Participante participante, String categoria) {
        if (participantes.contains(participante)) {
            System.out.println("El participante ya se encuentra inscripto con el número " + participante.nroParticipante);
        }
        else {
            if(circuitos.containsKey(categoria) && existeCategoriaParaParticipante(participante, categoria)) {
                participantes.add(participante);
                participante.nroParticipante = ++ultimoParticipanteNro;
                participante.categoriaInscripta = categoria;
                System.out.println("Se inscribió al participante y su número es " + participante.nroParticipante);
            }
            else {
                System.out.println("La categoría no existe o el participante no se puede inscribir a la misma.");
            }
        }
    }

    public void desinscribirParticipante(Participante participante) {
        if (participantes.contains(participante)) {
            participantes.remove(participante);
            System.out.println("El participante se desinscribió");
        }
        else {
            System.out.println("El participante no se encuentra inscripto.");
        }
    }

    public void mostrarDatosCategoria(String categoria) {
        for(Participante participante: participantes) {
            if (participante.categoriaInscripta == categoria) {
                System.out.println();
                System.out.println("Participante número " + participante.nroParticipante + ": ");
                System.out.println("---->DNI: " + participante.dni);
                System.out.println("---->Apellido y nombre: " + participante.apellido + ", " + participante.nombre);
                System.out.println("---->Edad: " + participante.edad);
                System.out.println("---->Celular: " + participante.celular);
                System.out.println("---->Número de emergencia:" + participante.nroEmergencia);
                System.out.println("---->Grupo sanguíneo: " + participante.grupoSanguineo);
            }
        }
    }

    public double montoAbonadoAlInscribirse(Participante participante, String categoria) {
        return (participante.edad >= 18) ? circuitos.get(categoria).get("precioMayor18") : circuitos.get(categoria).get("precioMenor18");
    }

    public double calcularTotalAbonadoPorCategoria(String categoria) {
        double totalCategoria = 0;
        for(Participante participante: participantes) {
            if (participante.categoriaInscripta == categoria) {
                totalCategoria += montoAbonadoAlInscribirse(participante, participante.categoriaInscripta);
            }
        }
        return totalCategoria;
    }

    public void mostrarAbonadoCategoriasYTotal() {
        double total = 0;
        double totalCategoria = 0;
        for(Map.Entry<String, HashMap<String, Double>> circuito: circuitos.entrySet()) {
            totalCategoria = calcularTotalAbonadoPorCategoria(circuito.getKey());
            System.out.println("Lo recaudado en la categoría '" + circuito.getKey() + "' es: " + totalCategoria);
            total += totalCategoria;
        }
        System.out.println("El total recaudado es: " + total);
    }
}


public class Ejercicio {

    public static void main(String[] args) {
        Carrera carrera = new Carrera();

        carrera.agregarCircuito("Circuito Chico");
        carrera.establecerPrecioMenor18("Circuito Chico", 1300);
        carrera.establecerPrecioMayor18("Circuito Chico", 1500);

        carrera.agregarCircuito("Circuito Medio");
        carrera.establecerPrecioMenor18("Circuito Medio", 2000);
        carrera.establecerPrecioMayor18("Circuito Medio", 2300);

        carrera.agregarCircuito("Circuito Avanzado");
        carrera.establecerPrecioMayor18("Circuito Avanzado", 2800);

        Participante participante = new Participante("31231784","Pablo","Huerta", 22,"1159174129","1159174129","A+");
        Participante participante1 = new Participante("45040422","Javier","Huerta",  14,"1159174129","1159174129","A+");
        Participante participante2 = new Participante("29547247","Marta","Amarilla", 17,"1159174129","1159174129","A+");
        Participante participante3 = new Participante("53297599","Pablo","Pedro", 28,"1159174129","1159174129","A+");
        Participante participante4 = new Participante("59347461","Martin","Arroyo", 19,"1159174129","1159174129","A+");

        carrera.inscribirParticipante(participante,"Circuito Chico");
        carrera.inscribirParticipante(participante1,"Circuito Chico");
        carrera.inscribirParticipante(participante2,"Circuito Medio");
        carrera.inscribirParticipante(participante3,"Circuito Medio");
        carrera.inscribirParticipante(participante4,"Circuito Avanzado");

        System.out.println("Participantes inscriptos a la categoria 1:");
        carrera.mostrarDatosCategoria("Circuito Chico");
        System.out.println();

        System.out.println("El monto que abono el participante 0 fue: " + carrera.montoAbonadoAlInscribirse(participante,"Circuito Chico"));
        System.out.println();

        carrera.mostrarAbonadoCategoriasYTotal();
    }
}
