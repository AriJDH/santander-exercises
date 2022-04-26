package c11exercises.p2.ejercicioClase.dao;

import java.util.List;

public interface Dao <K, E> {

    public List<E> getElements();

    //implementar buscarPersona por alguna clave

    public void addElement(E person);
}
