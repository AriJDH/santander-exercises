package com.abstractos;

import com.abstractos.modelos.Persona;
import com.abstractos.modelos.PersonaDaoImpl;

import java.util.List;

public class App {
    public static void main(String[] args) {

        PersonaDaoImpl personaDao = new PersonaDaoImpl();
        List<Persona> personaDaos = personaDao.listar();

    }
}
