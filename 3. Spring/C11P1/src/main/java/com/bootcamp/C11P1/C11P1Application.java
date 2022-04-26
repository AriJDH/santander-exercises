package com.bootcamp.C11P1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class C11P1Application implements CommandLineRunner {

	private static final Logger LOGGER = LoggerFactory.getLogger(C11P1Application.class);

	public static void main(String[] args) {
		SpringApplication.run(C11P1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// System.out.println("Hola mundo");
		// LOGGER.info("Hola mundo");
	}
}
