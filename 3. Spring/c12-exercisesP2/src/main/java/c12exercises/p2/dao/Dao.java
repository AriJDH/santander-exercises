package c12exercises.p2.dao;

import java.util.List;

public interface Dao<K, E> {

    E getElement(K k);
    List<E> getElements();
    void addElement(E e);

}
