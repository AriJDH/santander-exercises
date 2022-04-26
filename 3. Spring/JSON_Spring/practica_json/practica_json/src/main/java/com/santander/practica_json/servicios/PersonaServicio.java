package com.santander.practica_json.servicios;

import com.santander.practica_json.dao.PersonaDaoImpl;

public class PersonaServicio {

    public static String getPersonas(PersonaDaoImpl personas) {
        return personas.getElementos().toString();
    }
}
