package com.desafioSpring.desafio_spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesafioSpringApplication implements CommandLineRunner {
	private static final Logger LOGGER = LoggerFactory.getLogger(DesafioSpringApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(DesafioSpringApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {

	}
}
