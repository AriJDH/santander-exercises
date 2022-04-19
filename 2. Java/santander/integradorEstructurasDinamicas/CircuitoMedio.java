package com.santander.practicaListas.integradorEstructurasDinamicas;

public class CircuitoMedio extends Circuito {

    private final double precioMenores = 2000;

    public CircuitoMedio() {
        super();
        super.setPrecioMayores(2300);
    }

    @Override
    double precioCircuito(Persona persona) {
        double precio;
        if (persona.esMayor()) {
            precio = super.getprecioMayores();

        } else {
            precio = precioMenores;
        }
        System.out.println("el precio para " + persona.getNombre() +" es de " + precio);
        super.sumarRecaudado(precio);
        return precio;
    }
}
