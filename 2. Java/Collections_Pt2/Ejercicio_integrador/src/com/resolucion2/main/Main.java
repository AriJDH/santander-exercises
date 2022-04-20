package com.resolucion2.main;

import com.resolucion2.clases.Participante;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresar cantidad de participantes");
        int cantParticipantes = scanner.nextInt();

        List<Participante> listaDeParticipantesCircuitoChico = new LinkedList<Participante>();
        List<Participante> listaDeParticipantesCircuitoMediano = new LinkedList<Participante>();
        List<Participante> listaDeParticipantesCircuitoGrande = new LinkedList<Participante>();

        int dni, edad, celular, numeroEmergencia, categoria, grupoSanguineoDecision, grupoSanguineoRh;
        String nombre, apellido, grupoSanguineo;

        double montoTotal = 0, montoCircuitoChico = 0, montoCircuitoMediano = 0, montoCircuitoGrande = 0;

        System.out.println("----INGRESO DE PARTICIPANTES----");
        for (int i = 0; i < cantParticipantes; i++) {
            System.out.println("Ingrese dni");
            dni = scanner.nextInt();
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
            Participante participante = new Participante(dni, nombre, apellido, edad, celular, numeroEmergencia, grupoSanguineo, i + 1, categoria);
            switch (categoria) {
                case 0:
                    listaDeParticipantesCircuitoChico.add(participante);
                    break;
                case 1:
                    listaDeParticipantesCircuitoMediano.add(participante);
                    break;
                case 2:
                    listaDeParticipantesCircuitoGrande.add(participante);
                    break;
                default:
                    break;
            }
        }
        System.out.println("------------------------------------------");
        System.out.println("----MOSTRANDO PARTICIPANTES DEL CIRCUITO CHICO----");
        for (Participante participanteAux : listaDeParticipantesCircuitoChico) {
            System.out.println(participanteAux.toString());

        }
        System.out.println("------------------------------------------");
        System.out.println("----MOSTRANDO PARTICIPANTES DEL CIRCUITO MEDIANO----");
        for (Participante participanteAux : listaDeParticipantesCircuitoMediano) {
            System.out.println(participanteAux.toString());
        }
        System.out.println("------------------------------------------");
        System.out.println("----MOSTRANDO PARTICIPANTES DEL CIRCUITO GRANDE----");
        for (Participante participanteAux : listaDeParticipantesCircuitoGrande) {
            System.out.println(participanteAux.toString());
        }
        System.out.println("------------------------------------------");
        System.out.println("----DESINSCRIBIR PARTICIPANTE----");
        System.out.println("QUE CIRCUITO QUIERE DESINSCRIBIR ?");
        int fletarCircuitoTeclado = scanner.nextInt();
        int fletarTeclado;
        while (fletarCircuitoTeclado < 0 || fletarCircuitoTeclado > 2) {
            System.out.println("QUE CIRCUITO QUIERE DESINSCRIBIR ?");
            fletarCircuitoTeclado = scanner.nextInt();
        }
        boolean encontro = false;
        switch (fletarCircuitoTeclado) {
            case 0:
                for (Participante participanteAux : listaDeParticipantesCircuitoChico) {
                    System.out.println("NUMERO DE PARTICIPANTE: " + participanteAux.getNumeroParticipante());
                }
                while (!encontro) {
                    System.out.println("A CUAL QUIERE ELIMINAR");
                    fletarTeclado = scanner.nextInt();

                    for (Participante participanteAux : listaDeParticipantesCircuitoChico) {
                        if (participanteAux.getNumeroParticipante() == fletarTeclado) {
                            listaDeParticipantesCircuitoChico.remove(participanteAux);
                            encontro = true;
                        }
                    }
                }
                break;
            case 1:
                for (Participante participanteAux : listaDeParticipantesCircuitoMediano) {
                    System.out.println("NUMERO DE PARTICIPANTE: " + participanteAux.getNumeroParticipante());
                }
                while (!encontro) {
                    System.out.println("A CUAL QUIERE ELIMINAR");
                    fletarTeclado = scanner.nextInt();

                    for (Participante participanteAux : listaDeParticipantesCircuitoMediano) {
                        if (participanteAux.getNumeroParticipante() == fletarTeclado) {
                            listaDeParticipantesCircuitoMediano.remove(participanteAux);
                            encontro = true;
                        }
                    }
                }
                break;
            case 2:
                for (Participante participanteAux : listaDeParticipantesCircuitoGrande) {
                    System.out.println("NUMERO DE PARTICIPANTE: " + participanteAux.getNumeroParticipante());
                }
                while (!encontro) {
                    System.out.println("A CUAL QUIERE ELIMINAR");
                    fletarTeclado = scanner.nextInt();
                    for (Participante participanteAux : listaDeParticipantesCircuitoGrande) {
                        if (participanteAux.getNumeroParticipante() == fletarTeclado) {
                            listaDeParticipantesCircuitoGrande.remove(participanteAux);
                            encontro = true;
                        }
                    }
                }
                break;
        }

        System.out.println("------------------------------------------");
        System.out.println("----MOSTRANDO PARTICIPANTES DEL CIRCUITO CHICO----");
        for (Participante participanteAux : listaDeParticipantesCircuitoChico) {
            System.out.println(participanteAux.toString());

        }
        System.out.println("------------------------------------------");
        System.out.println("----MOSTRANDO PARTICIPANTES DEL CIRCUITO MEDIANO----");
        for (Participante participanteAux : listaDeParticipantesCircuitoMediano) {
            System.out.println(participanteAux.toString());
        }
        System.out.println("------------------------------------------");
        System.out.println("----MOSTRANDO PARTICIPANTES DEL CIRCUITO GRANDE----");
        for (Participante participanteAux : listaDeParticipantesCircuitoGrande) {
            System.out.println(participanteAux.toString());
        }
        System.out.println("------------------------------------------");
        System.out.println("----CALCULO DEL MONTO TOTAL RECAUDADO DE LA INSCRIPCION CIRCUITO CHICO----");
        for (Participante participanteAux : listaDeParticipantesCircuitoChico) {
            if (participanteAux.getEdad() < 18) {
                montoCircuitoChico = montoCircuitoChico + 1300;
            } else {
                montoCircuitoChico = montoCircuitoChico + 1500;
            }
        }


        System.out.println("MONTO TOTAL RECAUDADO DE LA INSCRIPCION CIRCUITO CHICO $" + montoCircuitoChico);
        System.out.println("----CALCULO DEL MONTO TOTAL RECAUDADO DE LA INSCRIPCION CIRCUITO MEDIO----");
        for (Participante participanteAux : listaDeParticipantesCircuitoMediano) {
            if (participanteAux.getEdad() < 18) {
                montoCircuitoMediano = montoCircuitoMediano + 2000;
            } else {
                montoCircuitoMediano = montoCircuitoMediano + 2300;
            }
        }
        System.out.println("MONTO TOTAL RECAUDADO DE LA INSCRIPCION CIRCUITO MEDIO $" + montoCircuitoMediano);
        System.out.println("----CALCULO DEL MONTO TOTAL RECAUDADO DE LA INSCRIPCION CIRCUITO AVANZADO----");
        for (Participante participanteAux : listaDeParticipantesCircuitoGrande) {
            montoCircuitoGrande = montoCircuitoGrande + 2800;
        }
        System.out.println("MONTO TOTAL RECAUDADO DE LA INSCRIPCION CIRCUITO GRANDE $" + montoCircuitoGrande);
        System.out.println("------------------------------------------");
        montoTotal = montoCircuitoChico + montoCircuitoMediano + montoCircuitoGrande;
        System.out.println("MONTO TOTAL RECAUDADO $" + (montoTotal));

    }
}
