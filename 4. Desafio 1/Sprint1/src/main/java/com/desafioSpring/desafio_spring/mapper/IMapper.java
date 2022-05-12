package com.desafioSpring.desafio_spring.mapper;

public interface IMapper<K,E> {

    //Metodos herenciados por los dos mappers
    public K toDto(E element);
    public E dtoTo(K element);
}
