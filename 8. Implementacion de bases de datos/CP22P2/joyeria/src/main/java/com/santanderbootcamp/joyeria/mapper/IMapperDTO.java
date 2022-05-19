package com.santanderbootcamp.joyeria.mapper;

public interface IMapperDTO<C,D> {
    public D toDto(C object);

    public C dtoTo(D object);
}
