package com.santander.AgenciaDeTurismo.repo;

import com.santander.AgenciaDeTurismo.models.Vuelo;

public interface VueloDAO extends DAO<String, Vuelo> {

    // Se deja para futuras implementaciones
    public boolean existeOrigen (String origin);
    public boolean existeDestino (String destination);
}
