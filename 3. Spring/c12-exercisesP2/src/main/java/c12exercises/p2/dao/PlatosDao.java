package c12exercises.p2.dao;

import c12exercises.p2.models.Plato;

import java.util.ArrayList;
import java.util.List;

public class PlatosDao implements Dao<String, Plato> {

    List<Plato> platos = new ArrayList<>();

    @Override
    public Plato getElement(String s) {
        Plato p = null;
        for (Plato plato: platos) {
            if (plato.getNombre().equals(s)) {
                p = plato;
            }
        }
        return p;
    }

    @Override
    public List<Plato> getElements() {
        return this.platos;
    }

    @Override
    public void addElement(Plato plato) {
        this.platos.add(plato);
    }
}
