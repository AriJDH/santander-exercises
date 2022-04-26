package com.ejPOSTyResponse.ejPOSTyResponse.dao;

import com.ejPOSTyResponse.ejPOSTyResponse.modelo.Alumno;

import java.util.ArrayList;
import java.util.Optional;

public class DaoImplementacion implements Dao<Alumno, String> {
    private ArrayList<Alumno> alumnos=new ArrayList<>();
    @Override

    public void addElemento(Alumno elemento) {
        alumnos.add(elemento);
    }

    public Alumno getElemento(String alum) {
        for (Alumno a :
             alumnos) {
            if (a.getNombre().equalsIgnoreCase(alum)){
                return a;
            }
        }
        return null;
    }


}
