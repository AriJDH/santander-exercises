package com.C11P1SpringBoot.EjercicioPractico;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EjercicioPracticoApplication {
	private static final Logger LOGGER = LoggerFactory.getLogger(EjercicioPracticoApplication.class);

	public static void main(String[] args) {

		SpringApplication.run(EjercicioPracticoApplication.class, args);
	}
}
