package com.santanderbootacamp.Ejercicios.repo;

import com.santanderbootacamp.Ejercicios.models.Ingrediente;
import com.santanderbootacamp.Ejercicios.models.Plato;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository(value = "PlatosDaoImpl")
public class PlatosDaoImpl implements Dao<String, Plato>{
    List<Plato> platos = new ArrayList<>();

    public void agregarPlato(String nombre, List<Ingrediente> ingredientes) {
        platos.add(new Plato(nombre, ingredientes));
    }

    @Override
    public Plato getElemento(String elemento) {
        return platos.stream().filter(p->p.getName().equals(elemento)).findFirst().orElse(null);
    }
}
