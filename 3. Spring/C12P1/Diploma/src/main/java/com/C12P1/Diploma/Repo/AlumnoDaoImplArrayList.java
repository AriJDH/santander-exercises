package com.C12P1.Diploma.Repo;

import com.C12P1.Diploma.Modelo.Alumno;
import com.C12P1.Diploma.Modelo.Materia;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.zip.ZipEntry;

public class AlumnoDaoImplArrayList {

    HashMap<String,Alumno> alumnosList = new HashMap<>();


    public AlumnoDaoImplArrayList() {
        List<Materia> materiasMati = new ArrayList<>();
        materiasMati.add(new Materia("Matemática", 8));
        materiasMati.add(new Materia("Historia", 5));
        materiasMati.add(new Materia("Política", 7));
        materiasMati.add(new Materia("Lengua", 9));
        Alumno Matias = new Alumno("Mati", materiasMati);

        List<Materia> materiasJuan = new ArrayList<>();
        materiasJuan.add(new Materia("Matemática", 10));
        materiasJuan.add(new Materia("Historia", 8));
        materiasJuan.add(new Materia("Política", 3));
        materiasJuan.add(new Materia("Lengua", 8));
        Alumno Juan = new Alumno("Juan", materiasJuan);

        List<Materia> materiasCarlos = new ArrayList<>();
        materiasCarlos.add(new Materia("Matemática", 1));
        materiasCarlos.add(new Materia("Historia", 5));
        materiasCarlos.add(new Materia("Política", 10));
        materiasCarlos.add(new Materia("Lengua", 7));
        Alumno Carlos = new Alumno("Carlos", materiasCarlos);


        alumnosList.put("Juan",Juan);
        alumnosList.put("Carlos",Carlos);
        alumnosList.put("Matias",Matias);
    }
    public Alumno findByName(String name){
        return alumnosList.get(name);
    }
}
