package com.santander.bootcamp.M4C12P2.repositories;

import com.santander.bootcamp.M4C12P2.DTO.IngredienteCaloriasDTO;
import com.santander.bootcamp.M4C12P2.DTO.IngredientePesoDTO;
import com.santander.bootcamp.M4C12P2.DTO.PlatoDTO;
import com.santander.bootcamp.M4C12P2.models.Plato;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PlatoDAO implements DAO<PlatoDTO> {

    private List<Plato> platos = new ArrayList<>(List.of(
        new Plato("Empanada", List.of(new IngredientePesoDTO("Ajos", 100), new IngredientePesoDTO("Alcachofas", 50))),
        new Plato("Milanesa", List.of(new IngredientePesoDTO("Berenjena", 100)))
    ));

    @Override
    public void agregar(PlatoDTO plato) {
        platos.add(new Plato(plato));
    }

    @Override
    public PlatoDTO obtener(String nombrePlato) {
        return new PlatoDTO(this.platos.stream().filter(p -> p.getNombre().equals(nombrePlato)).findFirst().orElse(null));
    }
}
