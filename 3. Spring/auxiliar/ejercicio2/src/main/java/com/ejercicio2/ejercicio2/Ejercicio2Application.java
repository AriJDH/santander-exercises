package com.ejercicio2.ejercicio2;

import com.ejercicio2.ejercicio2.dao.Dao;
import com.ejercicio2.ejercicio2.dao.PersonaDaoImplLinkedList;
import com.ejercicio2.ejercicio2.servicios.PersonaService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Ejercicio2Application implements CommandLineRunner {

	private static final Logger LOGGER = LoggerFactory.getLogger(Ejercicio2Application.class);

	public static void main(String[] args) {
		SpringApplication.run(Ejercicio2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		/*Persona persona = new Persona();
		persona.setApellido("Lopez");
		persona.setNombre("Martin");
		LOGGER.info(persona.toString());
		System.out.println("Hola mundo!");*/

		PersonaService personaService = new PersonaService();
		LOGGER.info(personaService.getPersonas().toString());

	}
}
