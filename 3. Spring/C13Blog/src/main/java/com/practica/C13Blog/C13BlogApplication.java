package com.practica.C13Blog;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class C13BlogApplication implements CommandLineRunner {

	private static final Logger LOGGER = LoggerFactory.getLogger(C13BlogApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(C13BlogApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		LOGGER.info("Hola Mundo");
	}
}
