package com.Ejercicio2;

public class IncripcionCarrera {
    ParticipanteCarrera participanteCarrera;
    Tarifa tarifa;

    public IncripcionCarrera(){

    }

    public void inscripcionAlCircuito(ParticipanteCarrera participanteCarrera, Tarifa tarifa){
        this.participanteCarrera = participanteCarrera;
        this.tarifa = tarifa;
    }

   /* public void setMenores(Tarifa tarifa, ParticipanteCarrera participanteCarrera){
        if(participanteCarrera.getEdad() < 18){
            this.tarifa = tarifa.getMenores();
        }else{
            this.tarifa = tarifa.getMayores();
        }
    }*/

    public ParticipanteCarrera getParticipanteCarrera(){
        return this.participanteCarrera;
    }

    @Override
    public String toString() {
        return "IncripcionCarrera{" +
                "participanteCarrera=" + participanteCarrera +
                ", tarifa=" + tarifa +
                '}';
    }
}
