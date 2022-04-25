package com.practica.C11P1_codigo_morse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class C11P1CodigoMorseApplication implements CommandLineRunner {

	private static final Logger LOGGER = LoggerFactory.getLogger(C11P1CodigoMorseApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(C11P1CodigoMorseApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		LOGGER.info("Hola Spring");
	}
}
