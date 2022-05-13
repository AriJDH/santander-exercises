package com.santanderbootcamp.desafio_spring.service;

public interface IntReservas<K,E> {

    //Metodos heredados para ambos services para la reserva
    public K registrarYMostrarCliente(E cliente);

    public void calculoYDevolucionDeDatos(K elemento, int nroCuotas);

}
