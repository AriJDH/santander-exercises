package c11exercises.p2.ejercicioClase.servicios;

import c11exercises.p2.ejercicioClase.dao.Dao;
import c11exercises.p2.ejercicioClase.dao.DaoPersonaImplArray;
import c11exercises.p2.ejercicioClase.models.Persona;

import java.util.List;

public class PersonaServicio {

    Dao personaDao = new DaoPersonaImplArray();
    public List<Persona> getPersonas() {

        return personaDao.getElements();
    }

    public void addPerson(Persona person) {

        personaDao.addElement(person);
    }

}
