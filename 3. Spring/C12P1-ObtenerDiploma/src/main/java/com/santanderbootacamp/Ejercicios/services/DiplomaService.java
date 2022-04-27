package com.santanderbootacamp.Ejercicios.services;

import com.santanderbootacamp.Ejercicios.dao.AlumnosDaoHashMap;
import com.santanderbootacamp.Ejercicios.models.Asignatura;

import java.util.List;

public class DiplomaService {
    private AlumnosDaoHashMap alumnosDao = new AlumnosDaoHashMap();

    public String diplomaDe(String alumno) {
        List<Asignatura> asignaturas = alumnosDao.getDatos(alumno);
        String diploma = "";
        Double promedio = asignaturas.stream().mapToDouble(Asignatura::getNota).average().orElse(0);
        if (promedio >= 9.0) {
            diploma = "Felicidades!\n";
        }
        diploma += alumno + " ha terminado la asignatura con un promedio de " + promedio;
        return diploma;
    }

    public boolean agregarAlumno(String alumno, List<Asignatura> asignaturas) {
        if (alumno == null || asignaturas == null) {
            return false;
        }
        alumnosDao.agregar(alumno, asignaturas);
        return true;
    }

    public List<String> listarAlumnos() {
        return alumnosDao.listar();
    }
}
