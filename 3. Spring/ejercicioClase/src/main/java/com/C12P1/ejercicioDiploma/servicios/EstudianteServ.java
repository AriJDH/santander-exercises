package com.C12P1.ejercicioDiploma.servicios;

import com.C12P1.ejercicioDiploma.dao.Dao;
import com.C12P1.ejercicioDiploma.dao.EstudianteDao;
import com.C12P1.ejercicioDiploma.modelo.Estudiante;
import com.C12P1.ejercicioDiploma.modelo.Materia;

import java.nio.file.InvalidPathException;
import java.util.List;

public class EstudianteServ {

    Dao<String, Estudiante> estudianteDao = new EstudianteDao();

    public List<Estudiante> getStudents() {
        return estudianteDao.getElements();
    }

    public Estudiante getStudent(String name) {
        Estudiante s = estudianteDao.getElement(name);

        if (s == null) {
            throw new InvalidPathException(name, "El estudiante no existe");
        } else {
            return s;
        }
    }

    public void addStudent(Estudiante s) {

        estudianteDao.addElement(s);
    }

    public double getAverage(String name) {
        Estudiante s = estudianteDao.getElement(name);

        if (s == null) {
            throw new InvalidPathException(name, "El estudiante no existe");
        }

        double average = 0;
        double sum = 0;

        for(Materia st: s.getSubjects()) {
            sum += st.getGrade();
        }

        average = sum/s.getSubjects().size();

        return average;
    }

}