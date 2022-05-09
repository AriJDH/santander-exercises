package com.C12P1.Diploma.Repo;

import com.C12P1.Diploma.Modelo.Alumno;
import com.C12P1.Diploma.Modelo.Materia;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.zip.ZipEntry;


@Repository
public class AlumnoDaoImplArrayList {

    List<Alumno> alumnosList = new ArrayList<>();


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


        alumnosList.add(Juan);
        alumnosList.add(Carlos);
        alumnosList.add(Matias);
    }
    public Alumno findByName(String name){
        return alumnosList.stream().filter(n-> n.getNombre().equals(name)).findFirst().orElse(null);
    }
}
