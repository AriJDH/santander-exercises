package com.santander.bootcamp.M4C12P2.services;

import com.santander.bootcamp.M4C12P2.DTO.PlatoDTO;
import com.santander.bootcamp.M4C12P2.models.IngredientePeso;
import com.santander.bootcamp.M4C12P2.models.Plato;
import com.santander.bootcamp.M4C12P2.repositories.IngredienteDAOImplementsJSON;
import com.santander.bootcamp.M4C12P2.repositories.PlatoDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlatoService implements IPlatoService {

    @Autowired
    private PlatoDAO platoDAO;

    @Autowired
    private IngredienteDAOImplementsJSON ingredienteDAO;

    @Override
    public void agregarPlato(PlatoDTO platoDTO) {
        platoDAO.agregar(new Plato(platoDTO));
    }

    @Override
    public PlatoDTO obtenerPlato(String nombrePlato) {
        return new PlatoDTO(platoDAO.obtener(nombrePlato));
    }

    @Override
    public double calcularCalorias(String nombrePlato) {
        Plato platoBuscado = platoDAO.obtener(nombrePlato);

        double totalCalorias = 0.0;

        for(IngredientePeso ingredientePeso : platoBuscado.getIngredientes()) {
            totalCalorias += ingredienteDAO.obtener(ingredientePeso.getNombre()).getCalories() / 100.0 * ingredientePeso.getPeso();
        }

        return totalCalorias;
    }
}
