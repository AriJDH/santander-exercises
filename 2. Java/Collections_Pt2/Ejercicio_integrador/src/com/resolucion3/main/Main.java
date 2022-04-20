package com.resolucion3.main;

import com.resolucion3.clases.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int contador = 0;
        int dni, edad, celular, numeroEmergencia, categoria, grupoSanguineoDecision, grupoSanguineoRh,nroParticipanteEliminar;
        String nombre, apellido, grupoSanguineo;
        Carrera carrera = new Carrera();
        /*
        System.out.println("----INGRESANDO PARTICIPANTES----");

        System.out.println("Ingrese dni (-1 para salir)");
        dni = scanner.nextInt();
        while (dni != -1) {
            System.out.println("Ingrese nombre");
            nombre = scanner.next();
            System.out.println("Ingrese apellido");
            apellido = scanner.next();
            System.out.println("Ingrese edad");
            edad = scanner.nextInt();
            System.out.println("Ingrese celular");
            celular = scanner.nextInt();
            System.out.println("Ingrese numero de emergencia");
            numeroEmergencia = scanner.nextInt();
            System.out.println("Que grupo sanguineo sos? A(1), B(2), AB(3), O (4)");
            grupoSanguineoDecision = scanner.nextInt();
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
            grupoSanguineoRh = scanner.nextInt();
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
                categoria = scanner.nextInt();
                while (categoria > 2 || categoria < 0) {
                    System.out.println("Que categoria de circuito ingresara el participante? Chico (0) Mediano (1) o Avanzado(2)");
                    categoria = scanner.nextInt();
                }
            } else {
                System.out.println("Que categoria de circuito ingresara el participante? Chico (0) Mediano (1)");
                categoria = scanner.nextInt();
                while (categoria >= 2 || categoria < 0) {
                    System.out.println("Que categoria de circuito ingresara el participante? Chico (0) Mediano (1)");
                    categoria = scanner.nextInt();
                }
            }
            Participante participante = new Participante(dni, nombre, apellido, edad, celular, numeroEmergencia, grupoSanguineo, contador);
            switch (categoria) {
                case 0:
                    carrera.addCircuitoChico(participante);
                    break;
                case 1:
                    carrera.addCircuitoMediano(participante);
                    break;
                case 2:
                    carrera.addCircuitoAvanzado(participante);
                    break;
                default:
                    break;
            }
            contador++;
            System.out.println("Ingrese dni (-1 para salir)");
            dni = scanner.nextInt();
        }

         */
        carrera.addCircuitoChico(new Participante(342342,"Juan","Pepino",12,4223244,43254545,"A+",0));
        carrera.addCircuitoChico(new Participante(6546464,"Carlitos","McCarlitos",22,76474643,866465464,"B-",1));
        carrera.addCircuitoMediano(new Participante(6565466,"Luisito","Comunica",32,767644332,545433,"AB+",2));
        carrera.addCircuitoAvanzado(new Participante(87999754,"Faustito","McFausto",25,878787651,87878732,"O-",3));
        System.out.println("----MOSTRANDO PARTICIPANTES----");
        System.out.println("QUE CATEGORIA QUIERE MOSTRAR? \t Chico (0) Mediano (1) o Avanzado(2)");
        categoria = scanner.nextInt();
        while (categoria >= 2 || categoria < 0) {
            System.out.println("Que categoria de circuito ingresara el participante? Chico (0) Mediano (1)");
            categoria = scanner.nextInt();
        }
        carrera.mostrarCircuito(categoria);
        System.out.println("------------------------------------------");
        System.out.println("----MOSTRANDO LOS MONTOS QUE DEBEN ABONAR LOS PARTICIPANTES----");
        carrera.mostrandoMontosPorParticipantes();
        System.out.println("------------------------------------------");
        System.out.println("----DESINSCRIBIENDO UN PARTICIPANTE----");
        System.out.println("INGRESE PARTICIPANTE A ELIMINAR");
        /*
        nroParticipanteEliminar=scanner.nextInt();
        carrera.eliminarParticipante(nroParticipanteEliminar);
         */
        carrera.eliminarParticipante(2);
        System.out.println("------------------------------------------");
        System.out.println("----MOSTRANDO LOS MONTOS QUE DEBEN ABONAR LOS PARTICIPANTES----");
        carrera.mostrandoMontosPorParticipantes();
        System.out.println("------------------------------------------");
        System.out.println("----CALCULANDO MONTO TOTAL RECAUDADO----");
        carrera.calcularMontoTotal();
        System.out.println("------------------------------------------");

    }

}

