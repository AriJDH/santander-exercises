package com.santander.practicaListas.integradorEstructurasDinamicas;

import java.util.ArrayList;
import java.util.List;

public abstract class Circuito {
    private List<Persona> participantes;
    private double recaudado;
    private int numero;
    private double precioMayores;


    public Circuito() {
        participantes = new ArrayList<>();
        this.numero = 0;
    }

    public double getprecioMayores() {
        return precioMayores;
    }

    public void mostrarRecaudado() {
        System.out.println(recaudado);
    }

    public void setPrecioMayores(double precioMayores) {
        this.precioMayores = precioMayores;
    }

    public void sumarRecaudado(double precio) {
        this.recaudado += precio;
    }

    abstract double precioCircuito(Persona persona);

    public void eliminarParticipante(String dni){
        Persona persona = buscarParticipante(dni);
        if(persona!=null){
            participantes.remove(persona);
            System.out.println("el participante con dni " + persona.getDni() + "fue removido");
        }
    }
    public void inscribirParticipante(Persona persona) {
       precioCircuito(persona);
        Persona participante = buscarParticipante(persona.getApellido());
        if (participante == null) {
            participantes.add(persona);
            this.numero++;
            persona.setNumeroParticipante(this.numero);

        } else {
            System.out.println("el participante ya existe en esta competencia");
        }

    }

    private Persona buscarParticipante(String dni) {
        Persona participante = null;
        int indice = 0;
        while (participante == null && indice < participantes.size()) {
            if (participantes.get(indice).getDni().equalsIgnoreCase(dni)) {
                participante = participantes.get(indice);
            }
            indice++;
        }
        return participante;
    }

    public void mostrarInscriptos() {
        if (participantes.size() > 0) {
            System.out.println("Los inscriptos de esta competencia son: ");
            for (Persona participante : participantes) {
                System.out.println(participante);
            }
        } else {
            System.out.println("no hay inscriptos en este concurso");
        }

    }


}
