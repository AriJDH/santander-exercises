package com.bootcamp.practicosC12P1.services;

import com.bootcamp.practicosC12P1.dao.ImplementacionDAOAlumnoMap;
import com.bootcamp.practicosC12P1.dao.ImplementacionDAODiplomaArray;
import com.bootcamp.practicosC12P1.models.Alumno;
import com.bootcamp.practicosC12P1.models.Diploma;
import com.bootcamp.practicosC12P1.models.Materia;

import java.util.List;

public class AlumnoService {

    ImplementacionDAOAlumnoMap implDao = new ImplementacionDAOAlumnoMap();
    ImplementacionDAODiplomaArray diplomasDao = new ImplementacionDAODiplomaArray();

    public Alumno getAlumno(String nombreAlumno){
        return implDao.getElement(nombreAlumno);
    }

    public void addAlumno(Alumno alumno){
        implDao.addElement(alumno);
    }

    public double getPromedioAlumno(String nombreAlumno){
        double promedio = this.calcularPromedio(getAlumno(nombreAlumno));
        return promedio;
    }

    public double calcularPromedio(Alumno alumno){
        int cantidadMaterias = alumno.getMaterias().size();
        double promedio = 0;

        for (Materia materia: alumno.getMaterias()) {
            promedio = promedio + materia.getNota();
        }
        promedio = promedio/cantidadMaterias;

        Diploma diploma = new Diploma();
        if (promedio >= 9){
            diploma.setMensaje("¡Felicitaciones por el promedio mayor a 9!");
        }else if(promedio >= 6){
            diploma.setMensaje("¡Felicitaciones por recibirte!");
        }
        diploma.setNombre(alumno.getNombreAlumno());
        diploma.setPromedio(promedio);

        diplomasDao.addElement(diploma);
        return promedio;
    }

    public List<Alumno> getAlumnos() {
        return implDao.getElements();
    }

    public Diploma getDiploma(Alumno alumno) {
        return diplomasDao.getElement(alumno.getNombreAlumno());
    }
}
