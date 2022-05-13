package com.ejercicio2.ejercicio2.dao;

import com.ejercicio2.ejercicio2.modelos.Persona;
import org.apache.tomcat.jni.Local;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

@Repository(value = "PersonaDaoImplLinkedList")
public class PersonaDaoImplLinkedList implements Dao<String, Persona> {

    public List<Persona> personas = new LinkedList<>();

    public PersonaDaoImplLinkedList() {
        personas.add(new Persona("Carlos", "Perez", LocalDate.of(1980, 1, 5)));
        personas.add(new Persona("Marcela", "Lopez", LocalDate.of(1975, 6, 12)));
        personas.add(new Persona("Julia", "Juanes", LocalDate.of(1992, 11, 21)));
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
