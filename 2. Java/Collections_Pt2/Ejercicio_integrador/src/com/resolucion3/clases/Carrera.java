package com.resolucion3.clases;

import java.util.LinkedList;
import java.util.List;

public class Carrera {
    List<Participante> participantes;
    List<Participante> circuitoChico;
    List<Participante> circuitoMediano;
    List<Participante> circuitoAvanzado;

    public Carrera() {
        circuitoChico = new LinkedList<>();
        circuitoMediano = new LinkedList<>();
        circuitoAvanzado = new LinkedList<>();
        participantes = new LinkedList<>();
    }

    public void addCircuitoChico(Participante participante) {
        circuitoChico.add(participante);
        participantes.add(participante);
    }

    public void addCircuitoMediano(Participante participante) {
        circuitoMediano.add(participante);
        participantes.add(participante);
    }

    public void addCircuitoAvanzado(Participante participante) {
        circuitoAvanzado.add(participante);
        participantes.add(participante);
    }

    public void addParticipantes(Participante participante) {
        participantes.add(participante);
    }

    public void eliminarCircuitoChico(Participante participante) {
        circuitoChico.remove(participante);
    }

    public void eliminarCircuitoMediano(Participante participante) {
        circuitoMediano.remove(participante);
    }

    public void eliminarCircuitoAvanzado(Participante participante) {
        circuitoAvanzado.remove(participante);
    }

    public boolean eliminarParticipante(int numeroParticipante) {
        for (Participante participante : participantes) {
            if (participante.getNumeroParticipante() == numeroParticipante) {
                eliminarCircuitoChico(participante);
                eliminarCircuitoMediano(participante);
                eliminarCircuitoAvanzado(participante);
                return true;
            }
        }
        return false;
    }

    public void mostrarCircuito(int categoria) {
        switch (categoria) {
            case 0:
                for (Participante participante : circuitoChico) {
                    System.out.println(participante.toString());
                }
                break;
            case 1:
                for (Participante participante : circuitoMediano) {
                    System.out.println(participante.toString());
                }
                break;
            case 2:
                for (Participante participante : circuitoAvanzado) {
                    System.out.println(participante.toString());
                }
                break;
        }
    }

    public void mostrandoMontosPorParticipantes() {
        for (Participante participante : circuitoChico) {
            if (participante.getEdad() < 18) {
                System.out.println("DNI : " + participante.getDni() + " Nombre: " + participante.getNombre() + "Apellido: " + participante.getApellido() + " Monto: $" + 1300);
            } else {
                System.out.println("DNI : " + participante.getDni() + " Nombre: " + participante.getNombre() + "Apellido: " + participante.getApellido() + " Monto: $" + 1500);
            }

        }
        for (Participante participante : circuitoMediano) {
            if (participante.getEdad() < 18) {
                System.out.println("DNI : " + participante.getDni() + " Nombre: " + participante.getNombre() + "Apellido: " + participante.getApellido() + " Monto: $" + 2000);
            } else {
                System.out.println("DNI : " + participante.getDni() + " Nombre: " + participante.getNombre() + "Apellido: " + participante.getApellido() + " Monto: $" + 2300);
            }

        }
        for (Participante participante : circuitoAvanzado) {

            System.out.println("DNI : " + participante.getDni() + " Nombre: " + participante.getNombre() + "Apellido: " + participante.getApellido() + " Monto: $" + 2800);

        }
    }

    public void calcularMontoTotal() {
        double montoChico = 0;
        double montoMedio = 0;
        double montoAvanzado = 0;
        for (Participante participante : circuitoChico) {
            if (participante.getEdad() < 18) {
                montoChico += 1300;
            } else {
                montoChico += 1500;
            }

        }
        for (Participante participante : circuitoMediano) {
            if (participante.getEdad() < 18) {
                montoMedio += 2000;
            } else {
                montoMedio += 2300;
            }

        }
        for (Participante participante : circuitoAvanzado) {
            montoAvanzado += 2800;

        }
        System.out.println("MONTO DE CIRCUITO CHICO: $"+montoChico);
        System.out.println("MONTO DE CIRCUITO MEDIO: $"+montoMedio);
        System.out.println("MONTO DE CIRCUITO AVANZADO: $"+montoAvanzado);
        System.out.println("MONTO TOTAL: $"+ (montoChico+montoAvanzado+montoMedio));
    }
}

