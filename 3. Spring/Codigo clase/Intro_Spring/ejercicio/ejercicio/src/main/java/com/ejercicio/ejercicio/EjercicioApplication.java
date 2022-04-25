package com.ejercicio.ejercicio;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EjercicioApplication {
	private static final Logger LOGGER = LoggerFactory.getLogger(EjercicioApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(EjercicioApplication.class, args);
	}

}
