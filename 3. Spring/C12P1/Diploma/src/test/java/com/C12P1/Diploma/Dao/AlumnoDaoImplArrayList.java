package com.C12P1.Diploma.Dao;

import com.C12P1.Diploma.Modelo.Alumno;
import com.C12P1.Diploma.Modelo.Materia;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AlumnoDaoImplArrayList implements Dao<Alumno> {


    public AlumnoDaoImplArrayList(){

        List<Materia> materiasMati = new ArrayList<>();
        materiasMati.add(new Materia("Matemática",8));
        materiasMati.add(new Materia("Historia",5));
        materiasMati.add(new Materia("Política",7));
        materiasMati.add(new Materia("Lengua",9));
        Alumno Matias = new Alumno("Mati",materiasMati);

        List<Materia> materiasJuan = new ArrayList<>();
        materiasJuan.add(new Materia("Matemática",10));
        materiasJuan.add(new Materia("Historia",8));
        materiasJuan.add(new Materia("Política",3));
        materiasJuan.add(new Materia("Lengua",8));
        Alumno Juan = new Alumno("Juan",materiasJuan);

        List<Materia> materiasCarlos = new ArrayList<>();
        materiasCarlos.add(new Materia("Matemática",1));
        materiasCarlos.add(new Materia("Historia",5));
        materiasCarlos.add(new Materia("Política",10));
        materiasCarlos.add(new Materia("Lengua",7));
        Alumno Carlos = new Alumno("Carlos",materiasCarlos);

    }




    @Override
    public double Promedio(Alumno nombreAlumno) {
        double sumaNotas = 0;
        for (int i=0;i<nombreAlumno.getMaterias().size();i++){
            sumaNotas += nombreAlumno.getMaterias().get(i).getNota();
        }
        return sumaNotas/nombreAlumno.getMaterias().size();

    }

    @Override
    public String Mensaje(Alumno alumno) {
        return "Felicitaciones "+ alumno.getNombre()+"!";
    }

}
