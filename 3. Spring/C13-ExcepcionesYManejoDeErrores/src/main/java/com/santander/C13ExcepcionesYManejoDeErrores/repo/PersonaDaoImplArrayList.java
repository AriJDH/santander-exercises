package com.santander.C13ExcepcionesYManejoDeErrores.repo;

import com.santander.C13ExcepcionesYManejoDeErrores.modelo.Persona;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Repository(value = "PersonaDaoImplArrayList")

public class PersonaDaoImplArrayList implements Dao<String, Persona> {

    private List<Persona> personas = new ArrayList<>();

    public PersonaDaoImplArrayList() {
        personas.add(new Persona("Carlos","Perez", LocalDate.of(1980,01,01)));
        personas.add(new Persona("Maria","Juarez", LocalDate.of(1990,10,10)));
        personas.add(new Persona("Ramona","Gomez", LocalDate.of(1995, 10,03)));
    }

    @Override
    public List<Persona> getElementos() {
        return this.personas;
    }

    @Override
    public void agregar(Persona elemento) {
        personas.add(elemento);
    }
}
