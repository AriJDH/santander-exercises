package com.bootcamp.practicosC12P1.dao;

import com.bootcamp.practicosC12P1.models.Diploma;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ImplementacionDAODiplomaArray implements DAO<String, Diploma>{

    Map<String, Diploma> diplomas = new HashMap<>();

    @Override
    public Diploma getElement(String K) {
        return diplomas.get(K);
    }

    @Override
    public void addElement(Diploma diploma) {
        this.diplomas.put(diploma.getNombre(), diploma);
    }

    @Override
    public List<Diploma> getElements() {
        return null;
    }

    /*
    @Override
     public List<Diploma> getElements() {
        return diplomas;
    }

     */
}
