package com.clase.C11P2Practica;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class C11P2PracticaApplication implements CommandLineRunner {

	private static final Logger LOGGER = LoggerFactory.getLogger(C11P2PracticaApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(C11P2PracticaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		LOGGER.info("Hola Spring");
	}
}
