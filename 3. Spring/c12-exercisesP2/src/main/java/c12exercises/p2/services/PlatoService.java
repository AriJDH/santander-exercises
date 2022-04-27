package c12exercises.p2.services;

import c12exercises.p2.dao.Dao;
import c12exercises.p2.dao.IngredientesDao;
import c12exercises.p2.dao.PlatosDao;
import c12exercises.p2.dto.request.IngredienteDtoRequest;
import c12exercises.p2.dto.request.PlatoDtoRequest;
import c12exercises.p2.dto.response.IngredienteDtoResponse;
import c12exercises.p2.models.Ingrediente;
import c12exercises.p2.models.Plato;

import java.util.ArrayList;
import java.util.List;

public class PlatoService {

    Dao<String, Plato> platoDao = new PlatosDao();
    Dao<String, IngredienteDtoResponse> ingredienteDao = new IngredientesDao();

    public void recibirPlato(PlatoDtoRequest platoDtoRequest) {
        Plato plato = new Plato();
        plato.setNombre(platoDtoRequest.getNombre());

        List<Ingrediente> ingredientes = new ArrayList<>();

        for (IngredienteDtoRequest i: platoDtoRequest.getIngredientes()) {
            double calories = ingredienteDao.getElement(i.getNombre()).getCalories();
            Ingrediente ingrediente = new Ingrediente();
            ingrediente.setNombre(i.getNombre());
            ingrediente.setCantidad(i.getCantidad());
            ingrediente.setCalorias(calories*i.getCantidad());
            ingredientes.add(ingrediente);
        }

        plato.setIngredientes(ingredientes);
        platoDao.addElement(plato);
    }

    public List<Plato> mostrarPlatos() {
        return platoDao.getElements();
    }

    public List<IngredienteDtoResponse> mostrarIngredientes() {
        return ingredienteDao.getElements();
    }

}
