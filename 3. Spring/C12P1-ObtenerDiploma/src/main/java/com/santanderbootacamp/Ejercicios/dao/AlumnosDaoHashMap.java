package com.santanderbootacamp.Ejercicios.dao;

import com.santanderbootacamp.Ejercicios.models.Asignatura;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AlumnosDaoHashMap implements Dao<String, List<Asignatura>> {
    HashMap<String, List<Asignatura>> alumnos = new HashMap<>();

    @Override
    public void agregar(String alumno, List<Asignatura> asignaturas) {
        alumnos.put(alumno, asignaturas);
    }

    @Override
    public List<Asignatura> getDatos(String alumno) {
        return alumnos.get(alumno);
    }

    public List<String> listar() {
        List<String> listAlumnos = new ArrayList<>();
        for(Map.Entry<String, List<Asignatura>> alumno: alumnos.entrySet()) {
            listAlumnos.add(alumno.getKey());
        }
        return listAlumnos;
    }
}
