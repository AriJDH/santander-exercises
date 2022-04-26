package com.bootcamp.C11P2;

import com.bootcamp.C11P2.dao.Dao;
import com.bootcamp.C11P2.dao.DaoPersonaImplArray;
import com.bootcamp.C11P2.dao.DaoPersonaImplLinkList;
import com.bootcamp.C11P2.models.Persona;
import com.bootcamp.C11P2.services.PersonaServicio;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class C11P2Application implements CommandLineRunner {

	private static final Logger LOGGER = LoggerFactory.getLogger(C11P2Application.class);

	public static void main(String[] args) {
		SpringApplication.run(C11P2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		PersonaServicio personaService = new PersonaServicio();
		LOGGER.info(personaService.getPersonas().toString());
		// System.out.println("Hola mundo");
	}
}
