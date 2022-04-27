package com.santander.EjercicioHechoEnClases;

import com.santander.EjercicioHechoEnClases.dao.Dao;
import com.santander.EjercicioHechoEnClases.dao.PersonaDaoImplArrayList;
import com.santander.EjercicioHechoEnClases.modelo.Persona;
import com.santander.EjercicioHechoEnClases.servicios.PersonaService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EjercicioHechoEnClasesApplication implements CommandLineRunner {

	private static final Logger LOGGER = LoggerFactory.getLogger(EjercicioHechoEnClasesApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(EjercicioHechoEnClasesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Persona persona = new Persona();
		persona.setNombre("Juan");
		persona.setApellido("Martinez");
		LOGGER.info(persona.toString());
	}
}
