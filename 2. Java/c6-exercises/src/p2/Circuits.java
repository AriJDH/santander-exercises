package p2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Circuits {
    List<Participante> circuitoChico;
    List<Participante> circuitoMediano;
    List<Participante> circuitoAvanzado;
    int revenueCircuitoChico;
    int revenueCircuitoMedio;
    int revenueCircuitoAvanzado;

    public Circuits() {
        circuitoChico = new LinkedList<>();
        circuitoMediano = new LinkedList<>();
        circuitoAvanzado = new LinkedList<>();
        revenueCircuitoChico = 0;
        revenueCircuitoMedio = 0;
        revenueCircuitoAvanzado= 0;
    }

    public void addParticipant(int i, Participante p) {
        if (i == 1) {
            circuitoChico.add(p);
            revenueCircuitoChico += amountToPay(p);
        } else if (i == 2) {
            circuitoMediano.add(p);
            revenueCircuitoMedio += amountToPay(p);
        } else if (i == 3) {
            circuitoAvanzado.add(p);
            revenueCircuitoAvanzado += amountToPay(p);
        }
    }

    public void delParticipant(int dni) {
        for (Participante p: circuitoChico) {
            if (p.getDni() == dni) {
                circuitoChico.remove(p);
                return;
            }
        }

        for (Participante p: circuitoMediano) {
            if (p.getDni() == dni) {
                circuitoMediano.remove(p);
                return;
            }
        }

        for (Participante p: circuitoAvanzado) {
            if (p.getDni() == dni) {
                circuitoAvanzado.remove(p);
                return;
            }
        }
    }

    public int amountToPay(Participante p) {
        int circuit = p.getCircuit();
        int age = p.getAge();

        if (circuit == 1) {
            if (age < 18) {
                return 1300;
            } else {
                return 1500;
            }
        } else if (circuit == 2) {
            if (age < 18) {
                return 2000;
            } else {
                return 2300;
            }
        } else {
            return 2800;
        }
    }

    public void showParticipants(int circuit) {
        if (circuit == 1) {
            System.out.println("Participantes circuito chico: ");
            for (Participante p: circuitoChico) {
                System.out.println("Id: " + p.getId() + ". Nombre: " + p.getName());
            }
        } else if (circuit == 2) {
            System.out.println("Participantes circuito mediano: ");
            for (Participante p: circuitoMediano) {
                System.out.println("Id: " + p.getId() + ". Nombre: " + p.getName());
            }
        } else {
            System.out.println("Participantes circuito avanzado: ");
            for (Participante p: circuitoAvanzado) {
                System.out.println("Id: " + p.getId() + ". Nombre: " + p.getName());
            }
        }
    }

    public int getRevenue(int i) {
        int revenue = 0;
        if (i == 1) {
            revenue = revenueCircuitoChico;
        } else if (i == 2) {
            revenue = revenueCircuitoMedio;
        } else if (i == 3) {
            revenue = revenueCircuitoAvanzado;
        }
        return revenue;
    }

}
