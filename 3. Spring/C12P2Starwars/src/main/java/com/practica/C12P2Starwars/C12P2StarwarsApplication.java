package com.practica.C12P2Starwars;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class C12P2StarwarsApplication implements CommandLineRunner {

	private static final Logger LOGGER = LoggerFactory.getLogger(C12P2StarwarsApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(C12P2StarwarsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		LOGGER.info("Hola Mundo");
	}
}
