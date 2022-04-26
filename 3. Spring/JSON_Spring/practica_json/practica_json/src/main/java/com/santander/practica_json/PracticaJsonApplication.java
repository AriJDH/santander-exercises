package com.santander.practica_json;

import com.santander.practica_json.dao.DAO;
import com.santander.practica_json.dao.PersonaDaoImpl;
import com.santander.practica_json.modelo.Persona;
import com.santander.practica_json.servicios.PersonaServicio;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PracticaJsonApplication implements CommandLineRunner {

	private static final Logger LOGGER = LoggerFactory.getLogger(PracticaJsonApplication.class);


	public static void main(String[] args) {

		SpringApplication.run(PracticaJsonApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		PersonaDaoImpl personaDaoImpl = new PersonaDaoImpl();
		personaDaoImpl.AgregarPersona("Juancin", "Lopecito");
		LOGGER.info(personaDaoImpl.getElementos().toString());
		LOGGER.info(PersonaServicio.getPersonas(personaDaoImpl));
	}
}
