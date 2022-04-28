package com.santander.bootcamp.M4C12P2.services;

import com.santander.bootcamp.M4C12P2.DTO.IngredienteCaloriasDTO;
import com.santander.bootcamp.M4C12P2.DTO.IngredientePesoDTO;
import com.santander.bootcamp.M4C12P2.DTO.PlatoDTO;
import com.santander.bootcamp.M4C12P2.models.Ingrediente;
import com.santander.bootcamp.M4C12P2.models.Plato;
import com.santander.bootcamp.M4C12P2.repositories.IngredienteDAOImplementsJSON;
import com.santander.bootcamp.M4C12P2.repositories.PlatoDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PlatoService implements IPlatoService {

    @Autowired
    private PlatoDAO platoDAO;

    @Autowired
    private IngredienteDAOImplementsJSON ingredienteDAO;

    @Override
    public void agregarPlato(PlatoDTO platoDTO) {
        platoDAO.agregar(platoDTO);
    }

    @Override
    public PlatoDTO obtenerPlato(String nombrePlato) {
        return platoDAO.obtener(nombrePlato);
    }

    @Override
    public double calcularCalorias(String nombrePlato) {
        return platoDAO.obtener(nombrePlato).getIngredientes().stream().reduce(0.0,
                (acumulador, ingrediente) -> acumulador + (ingredienteDAO.obtener(ingrediente.getNombre()).getCalories() / 100.0 * ingrediente.getPeso()), Double::sum);
    }

    @Override
    public List<IngredienteCaloriasDTO> obtenerCaloriasIngredientes(String nombrePlato) {
        return platoDAO.obtener(nombrePlato).getIngredientes().stream().map(
                ingrediente -> ingredienteDAO.obtener(ingrediente.getNombre())).collect(Collectors.toList()
        );
    }

    @Override
    public IngredienteCaloriasDTO obtenerIngredientesMasCalorico(String nombrePlato) {
        return ingredienteDAO.obtener(platoDAO.obtener(nombrePlato).getIngredientes().stream().reduce(
                platoDAO.obtener(nombrePlato).getIngredientes().get(0),
                (mayor, ingrediente) -> ingredienteDAO.obtener(mayor.getNombre()).getCalories() < ingredienteDAO.obtener(ingrediente.getNombre()).getCalories() ? ingrediente : mayor
        ).getNombre());
    }


}
