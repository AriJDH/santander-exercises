package com.santander.DesafioSpring.services;

import java.util.List;

public interface IService<T> {

    public List<T> obtenerElementos();

}
