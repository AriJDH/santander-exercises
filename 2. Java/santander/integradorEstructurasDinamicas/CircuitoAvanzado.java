package com.santander.practicaListas.integradorEstructurasDinamicas;

public class CircuitoAvanzado extends Circuito {


    public CircuitoAvanzado() {
        super();
        super.setPrecioMayores(2800);

    }

    @Override
    double precioCircuito(Persona persona) {
        return  super.getprecioMayores();
        }


    @Override
    public void inscribirParticipante(Persona persona) {
        if(persona.esMayor()){
            super.inscribirParticipante(persona);
            super.sumarRecaudado(precioCircuito(persona));
            System.out.println("el precio del circuito para:  " + persona.getApellido() +" es de : " + precioCircuito(persona));

        }else{
            System.out.println(persona.getNombre() +  " Para registrarte en nivel avanzado necesitas ser mayor a 18");
        }
    }


}
