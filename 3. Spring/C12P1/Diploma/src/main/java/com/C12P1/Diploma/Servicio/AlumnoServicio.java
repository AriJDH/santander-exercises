package com.C12P1.Diploma.Servicio;

import com.C12P1.Diploma.Modelo.Alumno;
import com.C12P1.Diploma.Repo.AlumnoDaoImplArrayList;
import org.springframework.beans.factory.annotation.Autowired;

public class AlumnoServicio implements iAlumnoServicio<String> {

    Alumno alumno;

    @Autowired
    AlumnoDaoImplArrayList alumnoDaoImplArrayList;


    @Override
    public String Promedio(String nombreAlumno) {
        alumno = alumnoDaoImplArrayList.findByName(nombreAlumno);
        double sumaNotas = 0;
        for (int i=0;i<alumno.getMaterias().size();i++){
            sumaNotas += alumno.getMaterias().get(i).getNota();
        }
        double prom = sumaNotas/alumno.getMaterias().size();
        if (prom >=9){
            return "Se le otorga el diploma al alumno " + alumno.getNombre() + "!\n Felicitaciones por el gran promedio de: " + prom;
        }
        return "Se le otorga el diploma al alumno " + alumno.getNombre() + "!\n con promedio: "+ prom;

    }

}
