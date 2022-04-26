package com.ejPOSTyResponse.ejPOSTyResponse.services;

import com.ejPOSTyResponse.ejPOSTyResponse.dao.Dao;
import com.ejPOSTyResponse.ejPOSTyResponse.dao.DaoImplementacion;
import com.ejPOSTyResponse.ejPOSTyResponse.modelo.Alumno;
import com.ejPOSTyResponse.ejPOSTyResponse.modelo.Materia;

import java.util.OptionalDouble;

public class AlumnoService {
    private Dao alumnoDao = new DaoImplementacion();

    public void addAlumno(Alumno a) {
        alumnoDao.addElemento(a);
    }


    public Double getPromedio(String alum) {
        Alumno a1 = (Alumno) alumnoDao.getElemento(alum);
        int acum = 0;
        for (Materia m : a1.getMaterias()
        ) {
            acum += m.getNota();
        }
        double prom= acum/a1.getMaterias().size();
        return prom;
    }
}
