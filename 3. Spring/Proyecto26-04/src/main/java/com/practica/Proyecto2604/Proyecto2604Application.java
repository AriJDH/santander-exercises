package com.practica.Proyecto2604;



import com.practica.Proyecto2604.dao.Dao;
import com.practica.Proyecto2604.dao.PersonaDaoImplArrayList;
import com.practica.Proyecto2604.modelo.Persona;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class Proyecto2604Application implements CommandLineRunner {

	private static final Logger LOGGER = LoggerFactory.getLogger(Proyecto2604Application.class);


	public static void main(String[] args) {
		SpringApplication.run(Proyecto2604Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Dao personaDao = new PersonaDaoImplArrayList();

		LOGGER.info(personaDao.getElementos().toString());
	}
}
