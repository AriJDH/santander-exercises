package com.practica.C12P2Practica.services;

import com.practica.C12P2Practica.dao.Dao;
import com.practica.C12P2Practica.dao.IngredienteDaoImplJson;
import com.practica.C12P2Practica.model.Ingrediente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlatoService {

    //@Autowired
    //@Qualifier(value="ingredienteDao")
    Dao<String, Ingrediente> ingredienteDao = new IngredienteDaoImplJson();

    public List<Ingrediente> getCaloriasTotalesPlato() {
        //repositorio

        return ingredienteDao.getElementos();
    }
}
