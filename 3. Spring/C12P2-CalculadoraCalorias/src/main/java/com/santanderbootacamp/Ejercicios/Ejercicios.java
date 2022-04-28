package com.santanderbootacamp.Ejercicios;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Ejercicios implements CommandLineRunner {

	private static final Logger LOGGER = LoggerFactory.getLogger(Ejercicios.class);

	public static void main(String[] args) {
		SpringApplication.run(Ejercicios.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	}
}
