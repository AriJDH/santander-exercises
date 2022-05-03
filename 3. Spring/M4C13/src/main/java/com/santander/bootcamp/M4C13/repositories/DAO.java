package com.santander.bootcamp.M4C13.repositories;

import java.util.List;

public interface DAO<T> {

    public T crear(T e);

    public T buscar(int id);

    public List<T> listar();

}
