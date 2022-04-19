package com.santander.practicaListas.integradorEstructurasDinamicas;

public class CircuitoChico extends Circuito {

    private final double precioMenores = 1300;

public CircuitoChico(){
    super();
    super.setPrecioMayores(1500);
}

    @Override
    double precioCircuito(Persona persona) {
    double precio;
        if(persona.esMayor()){
            precio = super.getprecioMayores();

        }else{
            precio = precioMenores;
        }
        System.out.println("el precio para " + persona.getNombre() +" es de " + precio);
        super.sumarRecaudado(precio);
        return precio;
    }


}
