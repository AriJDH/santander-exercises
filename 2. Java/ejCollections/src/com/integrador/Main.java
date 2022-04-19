package com.integrador;

public class Main {
    public static void main(String[] args) {
        Participante p1 = new Participante("Juan", "4223323", "232321", "213321", "negativo", 20);
        Participante p2 = new Participante("Juan2", "12", "232321", "213321", "negativo", 50);
        Participante p3 = new Participante("Juan3", "1213123", "232321", "213321", "negativo", 10);
        Carrera evento = new Carrera();
        evento.inscribirChico(p1);
        evento.inscribirChico(p2);
        evento.inscribirAvanzado(p3);
        evento.quienesSonChico();
        System.out.println(evento.montoChico());
        evento.quienesSonChico();
        System.out.println(evento.montoChico());
        evento.quienesSonGrande();
        System.out.println(evento.totalAcum());
        System.out.println(evento.montoAvanzado());
    }
}
