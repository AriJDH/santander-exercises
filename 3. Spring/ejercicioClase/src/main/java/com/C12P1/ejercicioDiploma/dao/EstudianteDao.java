package com.C12P1.ejercicioDiploma.dao;

import com.C12P1.ejercicioDiploma.modelo.Estudiante;

import java.util.ArrayList;
import java.util.List;

public class EstudianteDao implements Dao<String, Estudiante>{

    private List<Estudiante> estudiantes;

    public EstudianteDao() {
        this.estudiantes = new ArrayList<>();
    }

    @Override
    public List getElements() {
        return this.estudiantes;
    }

    @Override
    public Estudiante getElement(String name) {

        Estudiante s=null;

        for(Estudiante st: this.estudiantes) {
            if (st.getName().equals(name)) {
                s = st;
            }
        }

        return s;
    }

    @Override
    public void addElement(Estudiante estudiante) {
        this.estudiantes.add(estudiante);
    }

}