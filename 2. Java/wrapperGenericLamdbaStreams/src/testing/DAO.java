package testing;

import java.util.List;

public interface DAO<E,K> {

    E buscarElemento(K key);


    List<E> listar();

    void agregar(E ele);
}
