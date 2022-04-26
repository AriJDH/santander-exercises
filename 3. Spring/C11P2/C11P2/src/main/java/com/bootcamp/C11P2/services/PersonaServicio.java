package com.bootcamp.C11P2.services;

import com.bootcamp.C11P2.dao.Dao;
import com.bootcamp.C11P2.dao.DaoPersonaImplLinkList;
import com.bootcamp.C11P2.models.Persona;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;

public class PersonaServicio {

    public List<Persona> getPersonas(){
        Dao personaDao = new DaoPersonaImplLinkList();
        return personaDao.getElements();
    }

    public static int calcularEdad(String dia, String mes, String anio){

        String fecha = dia+"/"+mes+"/"+anio;
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaNacimiento = LocalDate.parse(fecha, fmt);
        LocalDate fechaActual = LocalDate.now();
        Period edad = Period.between(fechaNacimiento, fechaActual);

        return edad.getYears();
    }

}
