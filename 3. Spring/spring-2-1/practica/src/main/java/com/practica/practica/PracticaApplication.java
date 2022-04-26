package com.practica.practica;

import com.practica.practica.dao.Dao;
import com.practica.practica.dao.PersonaDaoImplArrayList;
import com.practica.practica.dao.PersonaDaoImplLinkedList;
import com.practica.practica.modelo.Persona;
import com.practica.practica.servicios.PersonaService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PracticaApplication implements CommandLineRunner {

	private static final Logger LOGGER = LoggerFactory.getLogger(PracticaApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(PracticaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {


	}
}
