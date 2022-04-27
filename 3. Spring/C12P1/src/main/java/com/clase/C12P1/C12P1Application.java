package com.clase.C12P1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class C12P1Application implements CommandLineRunner {

	private static final Logger LOGGER = LoggerFactory.getLogger(C12P1Application.class);

	public static void main(String[] args) {
		SpringApplication.run(C12P1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		LOGGER.info("Hola Spring");
	}
}
