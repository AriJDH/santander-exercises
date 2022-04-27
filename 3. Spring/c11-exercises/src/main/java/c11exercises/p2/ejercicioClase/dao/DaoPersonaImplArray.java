package c11exercises.p2.ejercicioClase.dao;

import c11exercises.p2.ejercicioClase.models.Persona;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository(value = "DaoPersonaImplArray")
public class DaoPersonaImplArray implements Dao<String, Persona>{

    private List<Persona> personas;

    public DaoPersonaImplArray() {
        this.personas = new ArrayList<>();
        personas.add(new Persona("Carlos", "Perez"));
        personas.add(new Persona("Maria", "Juarez"));
        personas.add(new Persona("Pedro", "Perez"));
    }

    @Override
    public List<Persona> getElements() {
        return this.personas;
    }

    @Override
    public void addElement(Persona person) {
        personas.add(person);
    }


}
