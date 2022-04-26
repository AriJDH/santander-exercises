package com.clase.C11P2;

import com.clase.C11P2.model.Persona;
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
		Persona persona = new Persona();
		persona.setNombre("Juan");
		persona.setApellido("Martinez");
		LOGGER.info(persona.toString());
	}
}
