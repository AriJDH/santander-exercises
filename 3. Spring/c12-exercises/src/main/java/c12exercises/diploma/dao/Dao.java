package c12exercises.diploma.dao;

import java.util.List;

public interface Dao<K, E> {

    List<E> getElements();

    E getElement(K k);

    void addElement(E e);

}
