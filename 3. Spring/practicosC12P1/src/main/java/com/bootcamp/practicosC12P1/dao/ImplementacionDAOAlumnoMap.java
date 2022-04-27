package com.bootcamp.practicosC12P1.dao;

import com.bootcamp.practicosC12P1.models.Alumno;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ImplementacionDAOAlumnoMap implements DAO<String, Alumno>{

    Map<String, Alumno> alumnos = new HashMap<>();




    public ImplementacionDAOAlumnoMap(){
    }

    @Override
    public Alumno getElement(String nombreAlumno) {
        return this.alumnos.get(nombreAlumno);
    }

    @Override
    public void addElement(Alumno alumno) {
        alumnos.put(alumno.getNombreAlumno(), alumno);
    }

    @Override
    public List<Alumno> getElements() {
        return new ArrayList<Alumno>(alumnos.values());
    }

}
