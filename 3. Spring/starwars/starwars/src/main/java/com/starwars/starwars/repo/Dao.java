package com.starwars.starwars.repo;

import java.util.List;

public interface Dao <K,E>{

    public List<E> getElementos(K clave);

}
