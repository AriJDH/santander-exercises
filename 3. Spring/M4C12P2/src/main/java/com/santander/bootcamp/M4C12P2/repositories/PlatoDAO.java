package com.santander.bootcamp.M4C12P2.repositories;

import com.santander.bootcamp.M4C12P2.models.IngredientePeso;
import com.santander.bootcamp.M4C12P2.models.Plato;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PlatoDAO implements DAO<Plato> {

    private List<Plato> platos = new ArrayList<>(List.of(
        new Plato("Empanada", List.of(new IngredientePeso("Ajos", 100), new IngredientePeso("Alcachofas", 50))),
        new Plato("Milanesa", List.of(new IngredientePeso("Berenjena", 100)))
    ));

    @Override
    public void agregar(Plato plato) {
        platos.add(plato);
    }

    @Override
    public Plato obtener(String nombrePlato) {
        Plato buscado = null;

        for (Plato plato : this.platos) {
            if (plato.getNombre().equals(nombrePlato)) {
                buscado = plato;
            }
        }

        return buscado;
    }
}
