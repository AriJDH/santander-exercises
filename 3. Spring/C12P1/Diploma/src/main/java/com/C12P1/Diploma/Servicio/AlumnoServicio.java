package com.C12P1.Diploma.Servicio;

import com.C12P1.Diploma.Dao.AlumnoDaoImplArrayList;
import com.C12P1.Diploma.Dao.Dao;
import com.C12P1.Diploma.Modelo.Alumno;

public class AlumnoServicio {

    Dao PersonaDao = new AlumnoDaoImplArrayList();


    public double PromedioAlumno(Alumno nombreAlumno){
        return PersonaDao.Promedio(nombreAlumno);
    }

    public String MensajeAlumno(Alumno nombreAlumno){
        return PersonaDao.Mensaje(nombreAlumno);
    }
}
