package com.Wrapper;

import java.util.*;

public interface Dao<E,K> {

    E buscarElemento (K key);

    List<E> Listar();

}
