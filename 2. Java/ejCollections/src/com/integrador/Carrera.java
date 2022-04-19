package com.integrador;

import java.util.ArrayList;

public class Carrera {
    ArrayList<Participante> circuitoChico, circuitoMedio, circuitoAvanzado;

    public Carrera() {
        this.circuitoChico = new ArrayList<Participante>();
        this.circuitoMedio = new ArrayList<Participante>();
        this.circuitoAvanzado = new ArrayList<Participante>();
    }

    public void inscribirChico(Participante p1) {
        if (!circuitoChico.contains(p1) && !circuitoMedio.contains(p1) && !circuitoAvanzado.contains(p1)) {
            circuitoChico.add(p1);
            p1.setNroInscripto(circuitoChico.size());
            if (p1.getEdad() > 18) {
                p1.setMonto(1500);
            } else {
                p1.setMonto(1300);
            }
        }
    }

    public void inscribirMedio(Participante p1) {
        if (!circuitoChico.contains(p1) && !circuitoMedio.contains(p1) && !circuitoAvanzado.contains(p1)) {
            circuitoMedio.add(p1);
            p1.setNroInscripto(circuitoMedio.size());
            if (p1.getEdad() > 18) {
                p1.setMonto(2300);
            } else {
                p1.setMonto(2000);
            }
        }
    }

    public void inscribirAvanzado(Participante p1) {
        if (!circuitoChico.contains(p1) && !circuitoMedio.contains(p1) && !circuitoAvanzado.contains(p1) && (p1.getEdad() >= 18)) {
            circuitoAvanzado.add(p1);
            p1.setNroInscripto(circuitoAvanzado.size());
            p1.setMonto(2800);
        }
    }

    public void desinscribir(Participante p1) {
        if (circuitoChico.contains(p1)) {
            circuitoChico.remove(p1);
        } else {
            if (circuitoMedio.contains(p1)) {
                circuitoMedio.remove(p1);
            } else {
                if (circuitoAvanzado.contains(p1)) {
                    circuitoAvanzado.remove(p1);
                }
            }
        }
    }

    public int montoChico() {
        int acum = 0;
        for (Participante p : circuitoChico) {
            acum = acum + p.getMonto();
        }
        return acum;
    }

    public int montoMedio() {
        int acum = 0;
        for (Participante p : circuitoMedio) {
            acum = acum + p.getMonto();
        }
        return acum;
    }

    public int montoAvanzado() {
        int acum = 0;
        for (Participante p : circuitoAvanzado) {
            acum = acum + p.getMonto();
        }
        return acum;
    }

    public int totalAcum() {
        return montoChico() + montoMedio() + montoAvanzado();
    }

    public void quienesSonChico() {
        for (Participante p : circuitoChico) {
            System.out.println(p);
        }
    }

    public void quienesSonMedio() {
        for (Participante p : circuitoMedio) {
            System.out.println(p);
        }
    }

    public void quienesSonGrande() {
        for (Participante p : circuitoAvanzado) {
            System.out.println(p);
        }
    }
}
