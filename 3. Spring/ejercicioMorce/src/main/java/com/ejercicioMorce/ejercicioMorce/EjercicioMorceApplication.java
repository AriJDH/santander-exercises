package com.ejercicioMorce.ejercicioMorce;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EjercicioMorceApplication implements CommandLineRunner {

	private static final Logger LOGGER = LoggerFactory.getLogger(EjercicioMorceApplication.class);


	public static void main(String[] args) {
		SpringApplication.run(EjercicioMorceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Aplicacion funcionando correctamente");
	}
}
