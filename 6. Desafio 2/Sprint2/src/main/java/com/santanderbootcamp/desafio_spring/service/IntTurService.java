package com.santanderbootcamp.desafio_spring.service;

import java.util.List;

public interface IntTurService<E> {

    //Metodos heredados por ambos services para poder hacer todos los metodos de busqueda
    public List<E> getElementos();

    public List<E> getElementosPorFecha(List<E> elemento, String desde, String hasta);

    public List<E> getElementosPorDestino(List<E> elemento, String destino);

    public List<E> getElementosDisponiblesPorFechaYDestino(String desde, String hasta, String destino);

}
