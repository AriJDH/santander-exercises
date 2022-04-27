package com.bootcamp.calculadoraMetrosCuadrados.dao;

import com.bootcamp.calculadoraMetrosCuadrados.models.PropiedadInmobiliaria;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DaoImplementsPropiedadHashMap implements DAO<String, PropiedadInmobiliaria>{

    Map<String, PropiedadInmobiliaria> propiedades = new HashMap<>();


    @Override
    public void addElement(PropiedadInmobiliaria element) {
        propiedades.put(element.getNombre(), element);
    }

    @Override
    public List<PropiedadInmobiliaria> getElements() {
        return new ArrayList<PropiedadInmobiliaria>(propiedades.values());
    }

    @Override
    public PropiedadInmobiliaria getElement(String nombrePropiedad) {
        return propiedades.get(nombrePropiedad);
    }
}
